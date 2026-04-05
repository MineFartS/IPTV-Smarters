package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class ak {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f19963a;

    public final void a(Context context) {
        hd.e(context, "Application Context cannot be null");
        if (this.f19963a) {
            return;
        }
        this.f19963a = true;
        bd.b().c(context);
        ay.a().c(context);
        bo.g(context);
        ba.b().c(context);
    }

    public final boolean b() {
        return this.f19963a;
    }
}
