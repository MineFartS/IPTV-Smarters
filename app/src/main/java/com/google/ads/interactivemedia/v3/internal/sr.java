package com.google.ads.interactivemedia.v3.internal;

import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class sr extends sw {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f22989b = {5512, 11025, 22050, 44100};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f22990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f22991d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f22992e;

    public sr(sf sfVar) {
        super(sfVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.sw
    public final boolean a(alx alxVar) throws sv {
        kd kdVar;
        int i2;
        if (this.f22990c) {
            alxVar.J(1);
        } else {
            int iK = alxVar.k();
            int i3 = iK >> 4;
            this.f22992e = i3;
            if (i3 == 2) {
                i2 = f22989b[(iK >> 2) & 3];
                kdVar = new kd();
                kdVar.ae("audio/mpeg");
                kdVar.H(1);
            } else if (i3 == 7 || i3 == 8) {
                String str = i3 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                kdVar = new kd();
                kdVar.ae(str);
                kdVar.H(1);
                i2 = 8000;
            } else {
                if (i3 != 10) {
                    StringBuilder sb = new StringBuilder(39);
                    sb.append("Audio format not supported: ");
                    sb.append(i3);
                    throw new sv(sb.toString());
                }
                this.f22990c = true;
            }
            kdVar.af(i2);
            this.f23012a.b(kdVar.s());
            this.f22991d = true;
            this.f22990c = true;
        }
        return true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.sw
    public final boolean b(alx alxVar, long j2) {
        if (this.f22992e == 2) {
            int iA = alxVar.a();
            this.f23012a.c(alxVar, iA);
            this.f23012a.d(j2, 1, iA, 0, null);
            return true;
        }
        int iK = alxVar.k();
        if (iK != 0 || this.f22991d) {
            if (this.f22992e == 10 && iK != 1) {
                return false;
            }
            int iA2 = alxVar.a();
            this.f23012a.c(alxVar, iA2);
            this.f23012a.d(j2, 1, iA2, 0, null);
            return true;
        }
        int iA3 = alxVar.a();
        byte[] bArr = new byte[iA3];
        alxVar.D(bArr, 0, iA3);
        no noVarB = np.b(bArr);
        kd kdVar = new kd();
        kdVar.ae("audio/mp4a-latm");
        kdVar.I(noVarB.f22544c);
        kdVar.H(noVarB.f22543b);
        kdVar.af(noVarB.f22542a);
        kdVar.T(Collections.singletonList(bArr));
        this.f23012a.b(kdVar.s());
        this.f22991d = true;
        return false;
    }
}
