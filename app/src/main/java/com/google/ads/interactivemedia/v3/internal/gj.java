package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class gj implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gk f21846a;

    public gj(gk gkVar) {
        this.f21846a = gkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zBooleanValue;
        if (this.f21846a.f21850b != null) {
            return;
        }
        synchronized (gk.f21848c) {
            if (this.f21846a.f21850b != null) {
                return;
            }
            boolean z = false;
            try {
                zBooleanValue = aoo.f20302e.b().booleanValue();
            } catch (IllegalStateException unused) {
                zBooleanValue = false;
            }
            if (zBooleanValue) {
                try {
                    gk.f21847a = new apz(this.f21846a.f21851e.f21893a);
                    z = zBooleanValue;
                } catch (Throwable unused2) {
                }
            } else {
                z = zBooleanValue;
            }
            this.f21846a.f21850b = Boolean.valueOf(z);
            gk.f21848c.open();
        }
    }
}
