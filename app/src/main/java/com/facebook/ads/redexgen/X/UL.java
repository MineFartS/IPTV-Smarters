package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class UL implements InterfaceC04806d {
    public static String[] A01;
    public final /* synthetic */ US A00;

    static {
        A00();
    }

    public static void A00() {
        A01 = new String[]{"CyYconlRA", "Z99FvxWAH", "r", "I6nMbGSwO", "f1HEaIkkO6UN2Wyn2K6t6YhOL5YQHMub", "q7TOnFp8MDH9pVcAi7q7X5O", "kHDnEbJrZHu3VwOwnck16fHaeHzzt8", "W41og5bN"};
    }

    public UL(US us) {
        this.A00 = us;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04806d
    public final AbstractC04956s A51() {
        if (this.A00.A01 == null) {
            US us = this.A00;
            if (A01[6].length() == 14) {
                return us.A08(EnumC04916o.A07);
            }
            String[] strArr = A01;
            strArr[6] = "1VAENbmq7tYIb9ZQI0D0jEbiw3q";
            strArr[6] = "1VAENbmq7tYIb9ZQI0D0jEbiw3q";
            return us.A08(EnumC04916o.A07);
        }
        US us2 = this.A00;
        String[] strArr2 = A01;
        if (strArr2[3].length() != strArr2[1].length()) {
            throw new RuntimeException();
        }
        String[] strArr3 = A01;
        strArr3[2] = "ZWV";
        strArr3[2] = "ZWV";
        return us2.A09(us2.A01.sourceDir);
    }
}
