package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class ER extends TB {
    public static String[] A00;

    static {
        A00();
    }

    public static void A00() {
        A00 = new String[]{"ebBTtcDfrXbt7XUNv2xXXzukgR", "AfSrg72OINfokWlk8lEehE43rER54C5K", "DLWRAT6zkYb5ZQ4lVerhsjeXnJdmq546", "HcA6UXt4lgXnqoCqWVxSHZRcl", "xLJGdEWbtHtgosfXVcR1IwW", "KlZdBiYd7CYsgOQcQxjIKqODuE8wujbn", "gwTEk6Fa0GjLNEZ2sqovA8E7SRT86ppt", "mobLesdsIst7Z6gfBQK3QOgi9WAmLStS"};
    }

    public ER(C04484w c04484w) {
        super(c04484w);
    }

    @Override // com.facebook.ads.redexgen.X.TB, com.facebook.ads.redexgen.X.MR
    public final void A3s(String rewardedVideoError) {
        if (this.A00.get() == null) {
            return;
        }
        C04484w c04484w = this.A00.get();
        if (A00[1].charAt(12) != 'k') {
            throw new RuntimeException();
        }
        String[] strArr = A00;
        strArr[0] = "wcnlDkVPCotGmNFV8gEH10X6";
        strArr[0] = "wcnlDkVPCotGmNFV8gEH10X6";
        c04484w.A0E(rewardedVideoError);
        String strA02 = PF.A08.A02();
        String strA022 = PF.A09.A02();
        if (rewardedVideoError.equals(strA02)) {
            this.A00.get().finish(11);
        } else if (rewardedVideoError.equals(strA022)) {
            this.A00.get().finish(12);
        }
    }

    @Override // com.facebook.ads.redexgen.X.TB, com.facebook.ads.redexgen.X.MR
    public final void A3t(String str, C9D c9d) {
        super.A3t(str, c9d);
    }
}
