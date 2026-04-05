package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class N4 implements QQ {
    public static String[] A01;
    public final /* synthetic */ C0932Oz A00;

    static {
        A00();
    }

    public static void A00() {
        A01 = new String[]{"uB1RC", "E7rLPB8klTW5J9FjuULp7NzB4AWE19Zm", "BGfRoGqubHgomR1aknLAm7BQoVqY9Rjo", "2aqRDajB7mkFiu8JUeuEjEkcXKsGj4gd", "YPIu8FWl8tmTV", "O2dNNTCX3dr0fdBVB7HhwqWACslxe6aK", "WKmspm9NaQlidgYEldSczPSkp8W1cJlS", "CDbKVWoo3Luj5aOlcVCk0HC1kDrFWNgV"};
    }

    public N4(C0932Oz c0932Oz) {
        this.A00 = c0932Oz;
    }

    @Override // com.facebook.ads.redexgen.X.QQ
    public final void ABr() {
        if (this.A00.A02 != null) {
            C0932Oz c0932Oz = this.A00;
            if (A01[3].charAt(8) == 'm') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[3] = "G62o5XZ8JRlbj2NUyH9KkdSeUCUXeXTA";
            strArr[3] = "G62o5XZ8JRlbj2NUyH9KkdSeUCUXeXTA";
            c0932Oz.A02.A3s(this.A00.A03.A70());
        }
    }

    @Override // com.facebook.ads.redexgen.X.QQ
    public final void ABt(QS qs) {
        if (this.A00.A02 == null) {
            return;
        }
        if (qs == null || !qs.A00()) {
            this.A00.A02.A3s(this.A00.A03.A70());
            return;
        }
        MR mr = this.A00.A02;
        C0932Oz c0932Oz = this.A00;
        if (A01[5].length() == 14) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[1] = "MYgqySdSEunU6EGhIZ8lv2VKjJmAUpiH";
        strArr[1] = "MYgqySdSEunU6EGhIZ8lv2VKjJmAUpiH";
        mr.A3s(c0932Oz.A03.A71());
    }
}
