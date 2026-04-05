package com.google.ads.interactivemedia.v3.internal;

import android.annotation.TargetApi;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
@TargetApi(19)
public final class eq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final eo f21726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ei f21727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final awm f21728c;

    public eq(ei eiVar, ExecutorService executorService, eo eoVar) {
        this.f21728c = awp.a(executorService);
        this.f21726a = eoVar;
        this.f21727b = eiVar;
    }

    public final /* synthetic */ com.google.ads.interactivemedia.v3.impl.data.bd b(com.google.ads.interactivemedia.v3.impl.data.bc bcVar) {
        return this.f21726a.a(bcVar);
    }

    public final void c(dv dvVar, String str, final com.google.ads.interactivemedia.v3.impl.data.bc bcVar) {
        dv dvVar2 = dv.activate;
        if (dvVar.ordinal() == 34) {
            awp.f(this.f21728c.submit(new Callable() { // from class: com.google.ads.interactivemedia.v3.internal.el
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f21720a.b(bcVar);
                }
            }), new em(this, str), this.f21728c);
            return;
        }
        String strValueOf = String.valueOf(dvVar);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 34);
        sb.append("Unexpected network request of type");
        sb.append(strValueOf);
        pn.f(sb.toString());
    }
}
