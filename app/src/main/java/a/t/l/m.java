package a.t.l;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f3458b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PackageManager f3460d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f3462f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList<l> f3461e = new ArrayList<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final BroadcastReceiver f3463g = new a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Runnable f3464h = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f3459c = new Handler();

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            m.this.b();
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            m.this.b();
        }
    }

    public interface c {
        void b(a.t.l.c cVar);

        void c(a.t.l.c cVar);
    }

    public m(Context context, c cVar) {
        this.f3457a = context;
        this.f3458b = cVar;
        this.f3460d = context.getPackageManager();
    }

    public final int a(String str, String str2) {
        int size = this.f3461e.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f3461e.get(i2).D(str, str2)) {
                return i2;
            }
        }
        return -1;
    }

    public void b() {
        int i2;
        if (this.f3462f) {
            int i3 = 0;
            Iterator<ResolveInfo> it = this.f3460d.queryIntentServices(new Intent("android.media.MediaRouteProviderService"), 0).iterator();
            while (it.hasNext()) {
                ServiceInfo serviceInfo = it.next().serviceInfo;
                if (serviceInfo != null) {
                    int iA = a(serviceInfo.packageName, serviceInfo.name);
                    if (iA < 0) {
                        l lVar = new l(this.f3457a, new ComponentName(serviceInfo.packageName, serviceInfo.name));
                        lVar.L();
                        i2 = i3 + 1;
                        this.f3461e.add(i3, lVar);
                        this.f3458b.b(lVar);
                    } else if (iA >= i3) {
                        l lVar2 = this.f3461e.get(iA);
                        lVar2.L();
                        lVar2.J();
                        i2 = i3 + 1;
                        Collections.swap(this.f3461e, iA, i3);
                    }
                    i3 = i2;
                }
            }
            if (i3 < this.f3461e.size()) {
                for (int size = this.f3461e.size() - 1; size >= i3; size--) {
                    l lVar3 = this.f3461e.get(size);
                    this.f3458b.c(lVar3);
                    this.f3461e.remove(lVar3);
                    lVar3.M();
                }
            }
        }
    }

    public void c() {
        if (this.f3462f) {
            return;
        }
        this.f3462f = true;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
        intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
        intentFilter.addAction("android.intent.action.PACKAGE_RESTARTED");
        intentFilter.addDataScheme("package");
        this.f3457a.registerReceiver(this.f3463g, intentFilter, null, this.f3459c);
        this.f3459c.post(this.f3464h);
    }
}
