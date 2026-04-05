package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.a4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1218a4 implements ML {
    public static String[] A02;
    public final /* synthetic */ C04484w A00;
    public final /* synthetic */ AbstractC1212Zy A01;

    static {
        A00();
    }

    public static void A00() {
        A02 = new String[]{"9zQQ", "ignw1BD", "Iwiu", "Rj9759ruFeEHfZFHtC0tN77N", "Yw9WW67qBp7nurOongm62UMTZpj72Daq", "XdprQx2", "zMrI2nkZvee1EVY6Hu3DKwgaLEX6aHI5", "7LD9TnQa5MzlVBDCJJS9JW3wW2x"};
    }

    public C1218a4(AbstractC1212Zy abstractC1212Zy, C04484w c04484w) {
        this.A01 = abstractC1212Zy;
        this.A00 = c04484w;
    }

    @Override // com.facebook.ads.redexgen.X.ML
    public final void A9E() {
        this.A01.A0B.A03(EnumC0788Jf.A07, null);
        if (this.A01.A0X()) {
            return;
        }
        if (this.A01.A0U()) {
            this.A01.A0T(this.A00);
            return;
        }
        C04484w c04484w = this.A00;
        if (A02[7].length() != 27) {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[4] = "TQLH18Rv5MEOVOxcIrRMtSKcbgUrlpIS";
        strArr[4] = "TQLH18Rv5MEOVOxcIrRMtSKcbgUrlpIS";
        c04484w.finish(1);
    }
}
