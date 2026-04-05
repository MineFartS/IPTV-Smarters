package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import c.f.a.c.a.a.a;
import com.google.android.gms.common.internal.Hide;

/* JADX INFO: loaded from: classes.dex */
@Hide
public final class anu extends anw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gp f20266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gn f20267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final gq f20268c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f20269d = false;

    public anu(Context context) {
        gp gpVarJ = gp.j(context);
        this.f20266a = gpVarJ;
        this.f20268c = new gq(gpVarJ);
        this.f20267b = gn.j(context);
    }

    private final apm n(apm apmVar, apm apmVar2, boolean z) {
        try {
            Uri uri = (Uri) apn.d(apmVar);
            Context context = (Context) apn.d(apmVar2);
            return apn.c(z ? this.f20268c.a(uri, context) : this.f20268c.g(uri, context));
        } catch (gr unused) {
            return null;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.anx
    public final apm b(apm apmVar, apm apmVar2) {
        return n(apmVar, apmVar2, false);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.anx
    public final apm c(apm apmVar, apm apmVar2) {
        return n(apmVar, apmVar2, true);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.anx
    public final String d(apm apmVar, String str) {
        return this.f20266a.c((Context) apn.d(apmVar), str);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.anx
    public final String e(apm apmVar) {
        return f(apmVar, null);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.anx
    public final String f(apm apmVar, byte[] bArr) {
        Context context = (Context) apn.d(apmVar);
        String strG = this.f20266a.g(context, bArr);
        gn gnVar = this.f20267b;
        if (gnVar == null || !this.f20269d) {
            return strG;
        }
        String strK = this.f20267b.k(strG, gnVar.g(context, bArr));
        this.f20269d = false;
        return strK;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.anx
    public final String g() {
        return "ms";
    }

    @Override // com.google.ads.interactivemedia.v3.internal.anx
    public final void h(apm apmVar) {
        this.f20268c.b((MotionEvent) apn.d(apmVar));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.anx
    public final void i(String str, String str2) {
        this.f20268c.c(str, str2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.anx
    public final void j(String str) {
        this.f20268c.d(str);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.anx
    public final boolean k(apm apmVar) {
        return this.f20268c.f((Uri) apn.d(apmVar));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.anx
    public final boolean l(apm apmVar) {
        return this.f20268c.e((Uri) apn.d(apmVar));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.anx
    public final boolean m(String str, boolean z) {
        if (this.f20267b == null) {
            return false;
        }
        this.f20267b.n(new a.C0150a(str, z));
        this.f20269d = true;
        return true;
    }
}
