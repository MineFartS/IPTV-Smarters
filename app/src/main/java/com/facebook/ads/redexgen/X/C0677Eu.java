package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Eu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0677Eu extends AbstractC1243aU<S5> {
    public static String[] A00;

    static {
        A00();
    }

    public static void A00() {
        A00 = new String[]{"ByMq6MLqhjUJsdWB3RBIp", "zuOr3", "msyHKBX3wHVeYE5obxbctQprcgEzI02t", "I3sOgeRwcNYGF4oixOV5Q17", "dcB", "ibtCqc8qysdz0E5AMIDmPhuL1XZA", "mNtKCg4kzaH6sXUtb2oDuqx2", "ObFvkEusatMYzjWaq72f4FkWXHrQjerH"};
    }

    public C0677Eu(S5 s5) {
        super(s5);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0829Kx
    public final void A07() {
        S5 s5A08 = A08();
        if (s5A08 == null) {
            return;
        }
        X2 x2 = s5A08.A08;
        String[] strArr = A00;
        if (strArr[3].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A00;
        strArr2[5] = "SiVLKh";
        strArr2[5] = "SiVLKh";
        if (MG.A02(x2)) {
            s5A08.A08();
        } else {
            s5A08.A05.postDelayed(s5A08.A0C, 5000L);
        }
    }
}
