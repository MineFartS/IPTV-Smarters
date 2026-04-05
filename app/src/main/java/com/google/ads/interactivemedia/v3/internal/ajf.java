package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import android.util.Base64;
import java.net.URLDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class ajf extends ajb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ajl f19880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte[] f19881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f19882c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f19883d;

    public ajf() {
        super(false);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ajh
    public final long a(ajl ajlVar) throws aji, lb {
        i(ajlVar);
        this.f19880a = ajlVar;
        Uri uri = ajlVar.f19897a;
        String scheme = uri.getScheme();
        if (!"data".equals(scheme)) {
            String strValueOf = String.valueOf(scheme);
            throw new lb(strValueOf.length() != 0 ? "Unsupported scheme: ".concat(strValueOf) : new String("Unsupported scheme: "));
        }
        String[] strArrAd = amn.ad(uri.getSchemeSpecificPart(), ",");
        if (strArrAd.length != 2) {
            String strValueOf2 = String.valueOf(uri);
            StringBuilder sb = new StringBuilder(strValueOf2.length() + 23);
            sb.append("Unexpected URI format: ");
            sb.append(strValueOf2);
            throw new lb(sb.toString());
        }
        String str = strArrAd[1];
        if (strArrAd[0].contains(";base64")) {
            try {
                this.f19881b = Base64.decode(str, 0);
            } catch (IllegalArgumentException e2) {
                String strValueOf3 = String.valueOf(str);
                throw new lb(strValueOf3.length() != 0 ? "Error while parsing Base64 encoded string: ".concat(strValueOf3) : new String("Error while parsing Base64 encoded string: "), e2);
            }
        } else {
            this.f19881b = amn.W(URLDecoder.decode(str, arm.f20426a.name()));
        }
        long j2 = ajlVar.f19901e;
        int length = this.f19881b.length;
        if (j2 > length) {
            this.f19881b = null;
            throw new aji();
        }
        int i2 = (int) j2;
        this.f19882c = i2;
        int i3 = length - i2;
        this.f19883d = i3;
        long j3 = ajlVar.f19902f;
        if (j3 != -1) {
            this.f19883d = (int) Math.min(i3, j3);
        }
        j(ajlVar);
        long j4 = ajlVar.f19902f;
        return j4 != -1 ? j4 : this.f19883d;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aje
    public final int b(byte[] bArr, int i2, int i3) {
        if (i3 == 0) {
            return 0;
        }
        int i4 = this.f19883d;
        if (i4 == 0) {
            return -1;
        }
        int iMin = Math.min(i3, i4);
        System.arraycopy(amn.A(this.f19881b), this.f19882c, bArr, i2, iMin);
        this.f19882c += iMin;
        this.f19883d -= iMin;
        g(iMin);
        return iMin;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ajh
    public final Uri c() {
        ajl ajlVar = this.f19880a;
        if (ajlVar != null) {
            return ajlVar.f19897a;
        }
        return null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ajh
    public final void f() {
        if (this.f19881b != null) {
            this.f19881b = null;
            h();
        }
        this.f19880a = null;
    }
}
