package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class gp extends go {
    public gp(Context context, int i2) {
        super(context, null);
    }

    public static gp j(Context context) {
        go.q(context, false);
        return new gp(context, 1);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.go
    public final List<Callable<Void>> l(hc hcVar, Context context, k kVar, f fVar) {
        hcVar.i();
        return super.l(hcVar, context, kVar, fVar);
    }
}
