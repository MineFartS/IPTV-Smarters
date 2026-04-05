package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0687Fe extends RO<EnumC03280d> {
    public static byte[] A00;
    public static String[] A01;

    static {
        A02();
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A01;
            if (strArr[1].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[5] = "VLAsB6FpgF6HHUeMgZV0uCFNDiYuOANh";
            strArr2[5] = "VLAsB6FpgF6HHUeMgZV0uCFNDiYuOANh";
            if (i5 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 46);
            i5++;
        }
    }

    public static void A01() {
        A00 = new byte[]{-85, -78, -87, -87};
    }

    public static void A02() {
        A01 = new String[]{"nfOmdPRKy6dJXhDeozy3bec4eprLIoSQ", "SpNSu", "KnwtHm0RppTzgOMyhwsp1PpmZykcOlps", "rm2Q4", "VxhbZsLUCIIY3eK9iwu", "VDpaDUxovSHskE3K7Rzj9CiAPD6OjiUH", "VHZOT7bXdVoDaPP", "SrW2lLCi4fFkH4TY8LZz6iOiSZQwKo1F"};
    }

    public C0687Fe(String str) {
        super(str);
    }

    public final C0X A03(@Nullable EnumC03280d enumC03280d) {
        String strA00;
        if (enumC03280d != null) {
            strA00 = A00(0, 0, 119) + enumC03280d.A02();
        } else {
            if (A01[0].charAt(24) == 'c') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[2] = "FtIMifYPiEAUkOQozBm9Vw11LGuuRK56";
            strArr[2] = "FtIMifYPiEAUkOQozBm9Vw11LGuuRK56";
            strA00 = A00(0, 4, 15);
        }
        return new C0X(this, strA00);
    }
}
