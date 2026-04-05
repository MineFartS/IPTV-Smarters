package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class RQ extends AbstractC03300f {
    public static byte[] A02;
    public static String[] A03;
    public final C03370m A00;
    public final boolean A01;

    static {
        A0C();
        A0B();
    }

    public static String A0A(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 30);
            if (A03[3].charAt(0) != '7') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[5] = "PWjD";
            strArr[5] = "PWjD";
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0B() {
        A02 = new byte[]{93, 114, 119, 125, 117, 62, 114, 113, 121, 121, 123, 122, 71, 68, 70, 78, 122, 81, 76, 72, 64, DateTimeFieldType.MILLIS_OF_DAY, 31, 27, 12, 31, 37, DateTimeFieldType.HOUR_OF_HALFDAY, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.MILLIS_OF_SECOND, 31, 45, 55, 54, 33, 45, 47, 39};
    }

    public static void A0C() {
        A03 = new String[]{"1", "OJ2IOsbUnCKybSqk53zM3JXcifahO", "e4RldewFXKwYCBzcZ5CwWZ5XjhlRHNiJ", "729G42gqUNiz5ZAUAxRhvFZ2YWMhTd0L", "J1Ql0tv9onNfDvsMKNTgjNyaDa6Pnzub", "9fBm", "mbPUpspz4Nj5AFGqwEe2w9x9WWs", "2uSYGuFAJgr"};
    }

    public abstract void A0E();

    public RQ(X2 x2, JZ jz, String str, @Nullable C03370m c03370m, boolean z) {
        super(x2, jz, str);
        this.A00 = c03370m;
        this.A01 = z;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC03300f
    public final void A0D() {
        C03370m c03370m = this.A00;
        if (c03370m != null) {
            c03370m.A08(this.A02);
        }
        A0E();
    }

    public final void A0F(Map<String, String> userReturnDataMap, @Nullable EnumC03290e enumC03290e) {
        if (!TextUtils.isEmpty(this.A02)) {
            if (this instanceof FL) {
                super.A01.A8O(this.A02, userReturnDataMap);
            } else {
                JZ jz = super.A01;
                String str = this.A02;
                if (A03[6].length() != 8) {
                    String[] strArr = A03;
                    strArr[6] = "4hYdj7INWre5bef3R1byHGHBMmQCX";
                    strArr[6] = "4hYdj7INWre5bef3R1byHGHBMmQCX";
                    jz.A8C(str, userReturnDataMap);
                } else {
                    String[] strArr2 = A03;
                    strArr2[5] = "IMSq";
                    strArr2[5] = "IMSq";
                    jz.A8C(str, userReturnDataMap);
                }
            }
            boolean zA02 = EnumC03290e.A02(enumC03290e);
            if (A03[1].length() == 32) {
                throw new RuntimeException();
            }
            String[] strArr3 = A03;
            strArr3[0] = "X";
            strArr3[0] = "X";
            C03370m c03370m = this.A00;
            if (c03370m != null) {
                c03370m.A07(enumC03290e);
                if (zA02) {
                    this.A00.A06();
                }
            } else {
                HashMap map = new HashMap();
                map.put(A0A(21, 10, 100), Long.toString(-1L));
                map.put(A0A(12, 9, 59), Long.toString(-1L));
                map.put(A0A(31, 7, 92), EnumC03290e.A03.name());
                super.A01.A8R(this.A02, map);
            }
        }
        LK.A02(super.A00, A0A(0, 12, 0));
    }
}
