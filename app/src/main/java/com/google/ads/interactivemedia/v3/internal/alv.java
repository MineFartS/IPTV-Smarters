package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class alv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static alv f20077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f20078b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CopyOnWriteArrayList<WeakReference<ajn>> f20079c = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f20080d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f20081e = 0;

    private alv(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new alt(this), intentFilter);
    }

    public static synchronized alv b(Context context) {
        if (f20077a == null) {
            f20077a = new alv(context);
        }
        return f20077a;
    }

    public static /* synthetic */ void c(alv alvVar, int i2) {
        synchronized (alvVar.f20080d) {
            if (alvVar.f20081e == i2) {
                return;
            }
            alvVar.f20081e = i2;
            for (WeakReference<ajn> weakReference : alvVar.f20079c) {
                ajn ajnVar = weakReference.get();
                if (ajnVar != null) {
                    ajnVar.a(i2);
                } else {
                    alvVar.f20079c.remove(weakReference);
                }
            }
        }
    }

    public final int a() {
        int i2;
        synchronized (this.f20080d) {
            i2 = this.f20081e;
        }
        return i2;
    }

    public final void d(final ajn ajnVar) {
        for (WeakReference<ajn> weakReference : this.f20079c) {
            if (weakReference.get() == null) {
                this.f20079c.remove(weakReference);
            }
        }
        this.f20079c.add(new WeakReference<>(ajnVar));
        this.f20078b.post(new Runnable() { // from class: com.google.ads.interactivemedia.v3.internal.als
            @Override // java.lang.Runnable
            public final void run() {
                ajnVar.a(this.f20073a.a());
            }
        });
    }
}
