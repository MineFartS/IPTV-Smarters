package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class fk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f21798a;

    public fk(Context context) {
        this.f21798a = context;
    }

    public final lq[] a(Handler handler, anp anpVar, oj ojVar) {
        Context context = this.f21798a;
        yc ycVar = yc.f23786b;
        xv xvVar = xv.f23758a;
        return new lq[]{new ana(context, xvVar, ycVar, handler, anpVar), new pk(this.f21798a, xvVar, ycVar, handler, ojVar, new pg(null, new oz(new nz[0])))};
    }
}
