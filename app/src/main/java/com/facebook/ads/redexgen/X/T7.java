package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class T7 extends C4K {
    public static String[] A02;
    public boolean A00 = false;
    public final /* synthetic */ T8 A01;

    static {
        A00();
    }

    public static void A00() {
        A02 = new String[]{"mAEXsU", "ynqBxBOImfiaim2rOjt4gNln3IJjMmAs", "wywpOwDcOClPwSqhh8hqnS4LzA6xmBGs", "SzqLf2", "g6", "3b", "2rYsw0AU9P5CKqqKD8yWz2y811Q4TNqs", "g7NtZwf9Cfcv4ky8xJWe0WMsxKKUH5F1"};
    }

    public T7(T8 t8) {
        this.A01 = t8;
    }

    @Override // com.facebook.ads.redexgen.X.C4K
    public final void A0V(C0660Eb c0660Eb, int i2) {
        super.A0V(c0660Eb, i2);
        if (i2 == 0 && this.A00) {
            this.A00 = false;
            this.A01.A0H();
        }
    }

    @Override // com.facebook.ads.redexgen.X.C4K
    public final void A0W(C0660Eb c0660Eb, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return;
        }
        String[] strArr = A02;
        if (strArr[5].length() == strArr[3].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[1] = "WMOmT1QQvzwg3wEMb9eL1K1wBJkCMN2D";
        strArr2[1] = "WMOmT1QQvzwg3wEMb9eL1K1wBJkCMN2D";
        this.A00 = true;
    }
}
