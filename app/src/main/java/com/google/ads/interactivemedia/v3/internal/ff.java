package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class ff {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fe f21778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f21779b = new Handler();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f21780c = false;

    public ff(fe feVar) {
        this.f21778a = feVar;
    }

    public static /* synthetic */ void c(fe feVar, Handler handler) {
        feVar.a();
        d(feVar, handler);
    }

    private static void d(final fe feVar, final Handler handler) {
        handler.postDelayed(new Runnable() { // from class: com.google.ads.interactivemedia.v3.internal.fd
            @Override // java.lang.Runnable
            public final void run() {
                ff.c(feVar, handler);
            }
        }, 200L);
    }

    public final void a() {
        if (this.f21780c) {
            return;
        }
        this.f21780c = true;
        this.f21778a.a();
        d(this.f21778a, this.f21779b);
    }

    public final void b() {
        if (this.f21780c) {
            this.f21780c = false;
            this.f21779b.removeCallbacksAndMessages(null);
        }
    }
}
