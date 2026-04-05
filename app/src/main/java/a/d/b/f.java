package a.d.b;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.os.IBinder;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.ICustomTabsService;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f1177a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ICustomTabsService f1178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ICustomTabsCallback f1179c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ComponentName f1180d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final PendingIntent f1181e;

    public f(ICustomTabsService iCustomTabsService, ICustomTabsCallback iCustomTabsCallback, ComponentName componentName, PendingIntent pendingIntent) {
        this.f1178b = iCustomTabsService;
        this.f1179c = iCustomTabsCallback;
        this.f1180d = componentName;
        this.f1181e = pendingIntent;
    }

    public IBinder a() {
        return this.f1179c.asBinder();
    }

    public ComponentName b() {
        return this.f1180d;
    }

    public PendingIntent c() {
        return this.f1181e;
    }
}
