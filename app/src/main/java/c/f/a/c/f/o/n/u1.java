package c.f.a.c.f.o.n;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class u1 extends Fragment implements i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final WeakHashMap<Activity, WeakReference<u1>> f12512b = new WeakHashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, LifecycleCallback> f12513c = Collections.synchronizedMap(new a.f.a());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12514d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Bundle f12515e;

    public static u1 a(Activity activity) {
        u1 u1Var;
        WeakHashMap<Activity, WeakReference<u1>> weakHashMap = f12512b;
        WeakReference<u1> weakReference = weakHashMap.get(activity);
        if (weakReference != null && (u1Var = weakReference.get()) != null) {
            return u1Var;
        }
        try {
            u1 u1Var2 = (u1) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (u1Var2 == null || u1Var2.isRemoving()) {
                u1Var2 = new u1();
                activity.getFragmentManager().beginTransaction().add(u1Var2, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            weakHashMap.put(activity, new WeakReference<>(u1Var2));
            return u1Var2;
        } catch (ClassCastException e2) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e2);
        }
    }

    @Override // c.f.a.c.f.o.n.i
    public final void d(String str, LifecycleCallback lifecycleCallback) {
        if (this.f12513c.containsKey(str)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 59);
            sb.append("LifecycleCallback with tag ");
            sb.append(str);
            sb.append(" already added to this fragment.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f12513c.put(str, lifecycleCallback);
        if (this.f12514d > 0) {
            new c.f.a.c.j.e.h(Looper.getMainLooper()).post(new t1(this, lifecycleCallback, str));
        }
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator<LifecycleCallback> it = this.f12513c.values().iterator();
        while (it.hasNext()) {
            it.next().a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // c.f.a.c.f.o.n.i
    public final <T extends LifecycleCallback> T e(String str, Class<T> cls) {
        return cls.cast(this.f12513c.get(str));
    }

    @Override // c.f.a.c.f.o.n.i
    public final Activity i() {
        return getActivity();
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        Iterator<LifecycleCallback> it = this.f12513c.values().iterator();
        while (it.hasNext()) {
            it.next().e(i2, i3, intent);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f12514d = 1;
        this.f12515e = bundle;
        for (Map.Entry<String, LifecycleCallback> entry : this.f12513c.entrySet()) {
            entry.getValue().f(bundle != null ? bundle.getBundle(entry.getKey()) : null);
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f12514d = 5;
        Iterator<LifecycleCallback> it = this.f12513c.values().iterator();
        while (it.hasNext()) {
            it.next().g();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f12514d = 3;
        Iterator<LifecycleCallback> it = this.f12513c.values().iterator();
        while (it.hasNext()) {
            it.next().h();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry<String, LifecycleCallback> entry : this.f12513c.entrySet()) {
            Bundle bundle2 = new Bundle();
            entry.getValue().i(bundle2);
            bundle.putBundle(entry.getKey(), bundle2);
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f12514d = 2;
        Iterator<LifecycleCallback> it = this.f12513c.values().iterator();
        while (it.hasNext()) {
            it.next().j();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f12514d = 4;
        Iterator<LifecycleCallback> it = this.f12513c.values().iterator();
        while (it.hasNext()) {
            it.next().k();
        }
    }
}
