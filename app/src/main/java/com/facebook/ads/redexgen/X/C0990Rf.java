package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Rf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0990Rf extends AbstractC03400p {
    public static String[] A05;
    public static final String A06;
    public C0988Rd A00;
    public boolean A01;
    public final X2 A02;
    public final JZ A03;
    public final AbstractC0887Nf A04;

    public static void A04() {
        A05 = new String[]{"RwkPFHsv9wotgH8PCqYhpIij5lIi", "drIC7gYxypHASOm9CvVJaHIQeep0", "f0dvIXyq27iv5zRXvkJTu2cqkG", "fzusVvXWPget8SSdASQ7tAMFHi8p37he", "Ar6p", "jDkSEm6Ik6fEWWn08WKTicIvFe3Dtksc", "J7vaKr0jTjoObEFZmlhET1S0K8S4ujA7", "2rimL2d5m8eNJCurq2ysJBza56R6EvG7"};
    }

    static {
        A04();
        A06 = C0990Rf.class.getSimpleName();
    }

    public C0990Rf(X2 x2, JZ jz, AbstractC0887Nf abstractC0887Nf, Q2 q2, AbstractC03410q abstractC03410q) {
        super(x2, abstractC03410q, q2);
        this.A03 = jz;
        this.A04 = abstractC0887Nf;
        this.A02 = x2;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC03400p
    public final void A07(Map<String, String> map) {
        C0988Rd c0988Rd = this.A00;
        if (c0988Rd != null && !TextUtils.isEmpty(c0988Rd.A5l())) {
            this.A02.A0A().A2a();
            JZ jz = this.A03;
            String strA5l = this.A00.A5l();
            String[] strArr = A05;
            if (strArr[7].charAt(31) != strArr[6].charAt(31)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[0] = "Tkg0tGhzpCvpbpNuTPjRHtf4b45H";
            strArr2[1] = "dBPpzaB1YNfwJk5banXGE19c57tB";
            jz.A8A(strA5l, map);
        }
    }

    public final synchronized void A08() {
        if (!this.A01 && this.A00 != null) {
            this.A01 = true;
            if (!TextUtils.isEmpty(this.A00.A04())) {
                ExecutorC0851Lu.A00(new C0989Re(this));
            }
        }
    }

    public final void A09(C0988Rd c0988Rd) {
        this.A00 = c0988Rd;
    }
}
