package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.text.TextUtils;
import c.f.a.c.a.a.a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class gn extends go {
    private a.C0150a u;

    public gn(Context context) {
        super(context);
    }

    public static gn j(Context context) {
        go.q(context, true);
        return new gn(context);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.go, com.google.ads.interactivemedia.v3.internal.gm
    public final k h(Context context) {
        return null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.go, com.google.ads.interactivemedia.v3.internal.gm
    public final k i(Context context) {
        return null;
    }

    public final String k(String str, String str2) {
        byte[] bArrF = fu.f(str, str2);
        return bArrF != null ? hd.b(bArrF, true) : Integer.toString(7);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.go
    public final List<Callable<Void>> l(hc hcVar, Context context, k kVar, f fVar) {
        ArrayList arrayList = new ArrayList();
        if (hcVar.i() == null) {
            return arrayList;
        }
        arrayList.add(new hn(hcVar, kVar, hcVar.a()));
        return arrayList;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.go
    public final void m(hc hcVar, Context context, k kVar, f fVar) {
        if (!hcVar.f21894b) {
            go.s(l(hcVar, context, kVar, fVar));
            return;
        }
        a.C0150a c0150a = this.u;
        if (c0150a != null) {
            String strA = c0150a.a();
            if (!TextUtils.isEmpty(strA)) {
                kVar.o(hf.c(strA));
                kVar.p(n.DEVICE_IDENTIFIER_ANDROID_AD_ID);
                kVar.n(this.u.b());
            }
            this.u = null;
        }
    }

    public final void n(a.C0150a c0150a) {
        this.u = c0150a;
    }
}
