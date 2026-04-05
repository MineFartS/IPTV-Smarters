package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1323bm implements InterfaceC0759Ic {
    public static String[] A05;
    public long A00;
    public long A01;
    public AK A02 = AK.A04;
    public boolean A03;
    public final IP A04;

    static {
        A00();
    }

    public static void A00() {
        A05 = new String[]{"JbcDsPAiqgb9rsViVRKehTXv1iFS9Alt", "AfEyeuF2jCfkWNmIQlP22Iq9vQ5XDBZo", "cIPTiq2qkEqnYzKxb3sH3HOJO6VigB4N", "bIuwftDwBGArWYVN2grLSP1kPnHfbgfq", "1GGMxn0jatOJtlepcpEnLiyqpa0L6Zpp", "dBndgbsmlMbgteIClih73P1Nf1skDdlq", "kMZcBPwOEd1j6nxu2sFbdi5kLjNzhQnH", "M7tzCbQcNsxxyZ9EacAqZIMXmH340eiG"};
    }

    public C1323bm(IP ip) {
        this.A04 = ip;
    }

    public final void A01() {
        if (!this.A03) {
            this.A00 = this.A04.A4s();
            this.A03 = true;
        }
    }

    public final void A02() {
        if (this.A03) {
            long jA6r = A6r();
            if (A05[0].charAt(9) == 'F') {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[0] = "yV0nDN2yEP24GlsqsYFBRUnmoDIsFkRQ";
            strArr[0] = "yV0nDN2yEP24GlsqsYFBRUnmoDIsFkRQ";
            A03(jA6r);
            this.A03 = false;
        }
    }

    public final void A03(long j2) {
        this.A01 = j2;
        if (this.A03) {
            this.A00 = this.A04.A4s();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0759Ic
    public final AK A6o() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0759Ic
    public final long A6r() {
        long elapsedSinceBaseMs = this.A01;
        if (this.A03) {
            long jA4s = this.A04.A4s();
            if (A05[0].charAt(9) == 'F') {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[1] = "ixlqsHFDPmeKY4bwdkSegalU4BLtdIOn";
            strArr[1] = "ixlqsHFDPmeKY4bwdkSegalU4BLtdIOn";
            long j2 = jA4s - this.A00;
            if (this.A02.A01 == 1.0f) {
                long jA00 = C05639t.A00(j2);
                if (A05[3].charAt(4) != 'j') {
                    String[] strArr2 = A05;
                    strArr2[0] = "AIwpqv7aDt0R5Z0o8sSBDj22LkfdUh0v";
                    strArr2[0] = "AIwpqv7aDt0R5Z0o8sSBDj22LkfdUh0v";
                    return elapsedSinceBaseMs + jA00;
                }
                String[] strArr3 = A05;
                strArr3[0] = "vgrMGSSY4L8ja71DPmzZRGyrcWnnIJj3";
                strArr3[0] = "vgrMGSSY4L8ja71DPmzZRGyrcWnnIJj3";
                return elapsedSinceBaseMs + jA00;
            }
            return elapsedSinceBaseMs + this.A02.A00(j2);
        }
        return elapsedSinceBaseMs;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0759Ic
    public final AK AD6(AK ak) {
        if (this.A03) {
            A03(A6r());
        }
        this.A02 = ak;
        return ak;
    }
}
