package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1173Yi extends CT {
    public static byte[] A01;
    public static String[] A02;
    public long A00;

    static {
        A0B();
        A0A();
    }

    public static String A04(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 32);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0A() {
        A01 = new byte[]{47, 62, 57, 42, 63, 34, 36, 37, 83, 82, 113, 89, 72, 93, 120, 93, 72, 93};
    }

    public static void A0B() {
        A02 = new String[]{"VtWAGSJcoPK1ZfQIT7kg70", "uvijoF7s18JkyzfLjC52JO", "UbwrKHlSsB9uBr4pHbp3GiHEJPcDIn2y", "M5IiKhc4TX4EBu4m9nlnlg4KrGcCYGid", "uZSF2L4tKNd9pS0dTFbwskwuDNdjgXB", "5", "JxfitwILt0nkPD2n3YPqqh4", "RXlbAzoXPs3VSjVZyf6us5"};
    }

    public C1173Yi() {
        super(null);
        this.A00 = -9223372036854775807L;
    }

    public static int A00(C0768Il c0768Il) {
        return c0768Il.A0F();
    }

    public static Boolean A01(C0768Il c0768Il) {
        return Boolean.valueOf(c0768Il.A0F() == 1);
    }

    public static Double A02(C0768Il c0768Il) {
        return Double.valueOf(Double.longBitsToDouble(c0768Il.A0M()));
    }

    public static Object A03(C0768Il c0768Il, int i2) {
        if (i2 == 0) {
            return A02(c0768Il);
        }
        if (i2 == 1) {
            return A01(c0768Il);
        }
        if (i2 == 2) {
            return A05(c0768Il);
        }
        if (i2 == 3) {
            return A09(c0768Il);
        }
        if (i2 == 8) {
            HashMap<String, Object> mapA08 = A08(c0768Il);
            if (A02[5].length() != 0) {
                String[] strArr = A02;
                strArr[7] = "dv1uUJDV50UY3341cCSHZj";
                strArr[6] = "lZLu8OCPwS2vewsoll9LjNz";
                return mapA08;
            }
        } else {
            if (i2 != 10) {
                if (i2 != 11) {
                    return null;
                }
                return A07(c0768Il);
            }
            ArrayList<Object> arrayListA06 = A06(c0768Il);
            String[] strArr2 = A02;
            if (strArr2[1].length() == strArr2[0].length()) {
                String[] strArr3 = A02;
                strArr3[4] = "2Wm";
                strArr3[4] = "2Wm";
                return arrayListA06;
            }
        }
        throw new RuntimeException();
    }

    public static String A05(C0768Il c0768Il) {
        int position = c0768Il.A0J();
        int iA07 = c0768Il.A07();
        c0768Il.A0a(position);
        return new String(c0768Il.A00, iA07, position);
    }

    public static ArrayList<Object> A06(C0768Il c0768Il) {
        int iA0I = c0768Il.A0I();
        ArrayList<Object> arrayList = new ArrayList<>(iA0I);
        for (int type = 0; type < iA0I; type++) {
            arrayList.add(A03(c0768Il, A00(c0768Il)));
        }
        return arrayList;
    }

    public static Date A07(C0768Il c0768Il) {
        Date date = new Date((long) A02(c0768Il).doubleValue());
        c0768Il.A0a(2);
        return date;
    }

    public static HashMap<String, Object> A08(C0768Il c0768Il) {
        int iA0I = c0768Il.A0I();
        HashMap<String, Object> map = new HashMap<>(iA0I);
        for (int i2 = 0; i2 < iA0I; i2++) {
            map.put(A05(c0768Il), A03(c0768Il, A00(c0768Il)));
        }
        return map;
    }

    public static HashMap<String, Object> A09(C0768Il c0768Il) {
        HashMap<String, Object> map = new HashMap<>();
        while (true) {
            String strA05 = A05(c0768Il);
            int iA00 = A00(c0768Il);
            if (A02[4].length() == 22) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[1] = "V4HwzONZDXYgxClN6ndm7q";
            strArr[0] = "UAxIIFeY73WGzRiRR4AY1i";
            if (iA00 == 9) {
                return map;
            }
            map.put(strA05, A03(c0768Il, iA00));
        }
    }

    @Override // com.facebook.ads.redexgen.X.CT
    public final void A0C(C0768Il c0768Il, long j2) throws AI {
        if (A00(c0768Il) == 2) {
            if (!A04(8, 10, 28).equals(A05(c0768Il)) || A00(c0768Il) != 8) {
                return;
            }
            Map<String, Object> metadata = A08(c0768Il);
            String strA04 = A04(0, 8, 107);
            if (metadata.containsKey(strA04)) {
                double dDoubleValue = ((Double) metadata.get(strA04)).doubleValue();
                if (dDoubleValue > 0.0d) {
                    this.A00 = (long) (1000000.0d * dDoubleValue);
                    return;
                }
                return;
            }
            return;
        }
        throw new AI();
    }

    @Override // com.facebook.ads.redexgen.X.CT
    public final boolean A0D(C0768Il c0768Il) {
        return true;
    }

    public final long A0E() {
        return this.A00;
    }
}
