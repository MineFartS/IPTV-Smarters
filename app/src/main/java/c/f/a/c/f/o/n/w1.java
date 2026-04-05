package c.f.a.c.f.o.n;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class w1 extends Fragment implements i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final WeakHashMap<a.l.d.e, WeakReference<w1>> f12524b = new WeakHashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, LifecycleCallback> f12525c = Collections.synchronizedMap(new a.f.a());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12526d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Bundle f12527e;

    public static w1 l(a.l.d.e eVar) {
        w1 w1Var;
        WeakHashMap<a.l.d.e, WeakReference<w1>> weakHashMap = f12524b;
        WeakReference<w1> weakReference = weakHashMap.get(eVar);
        if (weakReference != null && (w1Var = weakReference.get()) != null) {
            return w1Var;
        }
        try {
            w1 w1Var2 = (w1) eVar.getSupportFragmentManager().i0("SupportLifecycleFragmentImpl");
            if (w1Var2 == null || w1Var2.isRemoving()) {
                w1Var2 = new w1();
                eVar.getSupportFragmentManager().m().e(w1Var2, "SupportLifecycleFragmentImpl").k();
            }
            weakHashMap.put(eVar, new WeakReference<>(w1Var2));
            return w1Var2;
        } catch (ClassCastException e2) {
            throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e2);
        }
    }

    @Override // c.f.a.c.f.o.n.i
    public final void d(String str, LifecycleCallback lifecycleCallback) {
        if (this.f12525c.containsKey(str)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 59);
            sb.append("LifecycleCallback with tag ");
            sb.append(str);
            sb.append(" already added to this fragment.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f12525c.put(str, lifecycleCallback);
        if (this.f12526d > 0) {
            new c.f.a.c.j.e.h(Looper.getMainLooper()).post(new v1(this, lifecycleCallback, str));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator<LifecycleCallback> it = this.f12525c.values().iterator();
        while (it.hasNext()) {
            it.next().a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // c.f.a.c.f.o.n.i
    public final <T extends LifecycleCallback> T e(String str, Class<T> cls) {
        return cls.cast(this.f12525c.get(str));
    }

    @Override // c.f.a.c.f.o.n.i
    public final /* bridge */ /* synthetic */ Activity i() {
        return getActivity();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        Iterator<LifecycleCallback> it = this.f12525c.values().iterator();
        while (it.hasNext()) {
            it.next().e(i2, i3, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f12526d = 1;
        this.f12527e = bundle;
        for (Map.Entry<String, LifecycleCallback> entry : this.f12525c.entrySet()) {
            entry.getValue().f(bundle != null ? bundle.getBundle(entry.getKey()) : null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f12526d = 5;
        Iterator<LifecycleCallback> it = this.f12525c.values().iterator();
        while (it.hasNext()) {
            it.next().g();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f12526d = 3;
        Iterator<LifecycleCallback> it = this.f12525c.values().iterator();
        while (it.hasNext()) {
            it.next().h();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry<String, LifecycleCallback> entry : this.f12525c.entrySet()) {
            Bundle bundle2 = new Bundle();
            entry.getValue().i(bundle2);
            bundle.putBundle(entry.getKey(), bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f12526d = 2;
        Iterator<LifecycleCallback> it = this.f12525c.values().iterator();
        while (it.hasNext()) {
            it.next().j();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f12526d = 4;
        Iterator<LifecycleCallback> it = this.f12525c.values().iterator();
        while (it.hasNext()) {
            it.next().k();
        }
    }
}
