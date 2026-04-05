package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.internal.awb;

/* JADX INFO: loaded from: classes.dex */
public final class awn extends awb.i<Void> implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Runnable f20671a;

    public awn(Runnable runnable) {
        ars.g(runnable);
        this.f20671a = runnable;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.awb
    public final String e() {
        String strValueOf = String.valueOf(this.f20671a);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 7);
        sb.append("task=[");
        sb.append(strValueOf);
        sb.append("]");
        return sb.toString();
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f20671a.run();
        } catch (Throwable th) {
            o(th);
            arv.a(th);
            throw new RuntimeException(th);
        }
    }
}
