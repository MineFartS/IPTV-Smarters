package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1203Zp implements ML {
    public static String[] A01;
    public final /* synthetic */ YW A00;

    static {
        A00();
    }

    public static void A00() {
        A01 = new String[]{"rR3MQXnxH1GXPkPV1PgRqgdt6qAZ8aBc", "thx7zZihUvA4zDglxpqJ8", "GT9LpnhCusFld3d6m5Ylaq2YY93CXZTz", "CEYcJLQZRcUyVb0GbNJEX1KNnfWwQfE2", "P05vWpU8TGR89ExqviT8AvwxGU5kpxcL", "lyVbFyj9sQoux55muYN3p2AWW", "FBc7SUvMlEnZMMlwSnzRcI2535EomHFs", "rjU0a8GNBirc6jTbd1zIs9BaAuj9QLsR"};
    }

    public C1203Zp(YW yw) {
        this.A00 = yw;
    }

    @Override // com.facebook.ads.redexgen.X.ML
    public final void A9E() {
        if (this.A00.A0N) {
            boolean z = this.A00.A0L.get();
            if (A01[5].length() == 32) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[6] = "Rosc2egaZ2bfxLAQiTqXfx2zjuVcC1pu";
            strArr[2] = "vMXK6MvWFWmZqWG9iCsHx320m1OPkYMA";
            if (!z && this.A00.A0W()) {
                this.A00.A0P.setToolbarActionMode(0);
                this.A00.A0K();
                return;
            }
        }
        this.A00.A0E.A03(EnumC0788Jf.A07, null);
        this.A00.A0H.A3s(this.A00.A0I.A69());
    }
}
