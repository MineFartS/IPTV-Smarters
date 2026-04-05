package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4H, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C4H extends AbstractC1243aU<Q2> implements C8A {
    public static String[] A02;
    public X2 A00;
    public boolean A01;

    static {
        A00();
    }

    public static void A00() {
        A02 = new String[]{"iVby5wy6H7l4dzY0Hld0xs9tuHtnGk", "Nr0U5YnFPaRVMsCPPiWFbDdqiRS3TX59", "NmHEOi9mcJk9OQjZmIqLk3AYwOx5ICK3", "j6OxXppfxNxejmkkIb10P2S2ED13bfax", "YxA", "okdCTGqDBxOQkU", "XAA3rxsPdfTGxXL8JCFSxOB2RupP9g", "Mu"};
    }

    public C4H(Q2 q2, X2 x2) {
        super(q2);
        this.A00 = x2;
        this.A01 = false;
    }

    private void A01(int i2) {
        if (!this.A01) {
            this.A00.A0A().A3C(i2);
        }
        String[] strArr = A02;
        if (strArr[0].length() != strArr[6].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[1] = "k6Oe58jhR2JQ133LIP7LsY5lW6eco9l5";
        strArr2[1] = "k6Oe58jhR2JQ133LIP7LsY5lW6eco9l5";
        this.A01 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0077  */
    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0829Kx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A07() {
        /*
            Method dump skipped, instruction units count: 353
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C4H.A07():void");
    }

    @Override // com.facebook.ads.redexgen.X.C8A
    public final X2 A5H() {
        return this.A00;
    }
}
