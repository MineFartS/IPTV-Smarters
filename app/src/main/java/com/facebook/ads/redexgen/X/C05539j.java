package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C05539j extends AbstractC0785Jc {
    public static byte[] A01;
    public static String[] A02;
    public final /* synthetic */ YL A00;

    static {
        A02();
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 59);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{112, 88, 78, 72, 88, 118};
        String[] strArr = A02;
        if (strArr[2].charAt(21) == strArr[1].charAt(21)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[4] = "AaqsZ0kN0wdt4PxPT80lhbaiVomD";
        strArr2[4] = "AaqsZ0kN0wdt4PxPT80lhbaiVomD";
    }

    public static void A02() {
        A02 = new String[]{"0EtrvwW3MQkzSecFvnBX4JMfeqt66nTs", "31KVsJeKTKhLPCOslR3tmLkuK1Xd7IZW", "ErGHvP3zkyEh4xX1eQlIOsNtLUt9M6Nd", "ktedtIytEv2FRFoF5SCcQiRhp3TIfz9L", "y7SJDh6vytCFGPm3eUSBlWJktjn6", "2Pj8nikJl49sV4F", "Af2d4ar6BC4UZ7hhvi", "JNiO58cgS0ZkwkRgj9Y5ghYAFIamZa37"};
    }

    public C05539j(YL yl) {
        this.A00 = yl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d1  */
    @Override // com.facebook.ads.redexgen.X.C9F
    /* JADX INFO: renamed from: A03, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A04(com.facebook.ads.redexgen.X.C05127n r8) {
        /*
            Method dump skipped, instruction units count: 397
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C05539j.A04(com.facebook.ads.redexgen.X.7n):void");
    }
}
