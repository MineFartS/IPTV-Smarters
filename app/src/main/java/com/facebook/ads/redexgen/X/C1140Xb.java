package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.facebook.ads.AdSettings;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderImpl;
import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1140Xb implements C8E {
    public static C1140Xb A05;
    public static byte[] A06;
    public static String[] A07;
    public C0V A00;
    public C8D A01;

    @Nullable
    public C8P A02;
    public AnonymousClass92 A03;

    @Nullable
    public InterfaceC0967Qi A04;

    static {
        A07();
        A06();
    }

    public static String A05(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A07;
            if (strArr[6].length() != strArr[7].length()) {
                break;
            }
            String[] strArr2 = A07;
            strArr2[6] = "Hv2WK1fJh7GnXaP";
            strArr2[7] = "jwUFRNkRPBL5IaL";
            if (i5 >= length) {
                return new String(bArrCopyOfRange);
            }
            int i6 = bArrCopyOfRange[i5] - i4;
            String[] strArr3 = A07;
            if (strArr3[4].charAt(26) != strArr3[0].charAt(26)) {
                break;
            }
            String[] strArr4 = A07;
            strArr4[2] = "3jbuj6iR6sIerVLqEJ9xAsC0KuP7QrbG";
            strArr4[3] = "qsuffxm3RCjhy50iWQEl04Txy4tWGAPw";
            bArrCopyOfRange[i5] = (byte) (i6 - 98);
            i5++;
        }
        throw new RuntimeException();
    }

    public static void A06() {
        A06 = new byte[]{-63, -15, -56, -58, -57, -62, -63, -64, -16, 2, DateTimeFieldType.CLOCKHOUR_OF_DAY, DateTimeFieldType.CLOCKHOUR_OF_DAY, 6, 12, 11, -67, 1, -2, DateTimeFieldType.HOUR_OF_DAY, -2, -67, 6, 11, 6, DateTimeFieldType.HOUR_OF_DAY, 6, -2, 9, 6, DateTimeFieldType.MILLIS_OF_SECOND, 2, 1, 33, DateTimeFieldType.SECOND_OF_DAY, 31, 30, 33, 35, 2, DateTimeFieldType.SECOND_OF_DAY, 34, 34, 24, 30, 29, -13, DateTimeFieldType.CLOCKHOUR_OF_DAY, 35, DateTimeFieldType.CLOCKHOUR_OF_DAY, -8, 29, 24, 35, 24, DateTimeFieldType.CLOCKHOUR_OF_DAY, 27, 24, 41, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.MINUTE_OF_HOUR};
        if (A07[1].length() == 32) {
            throw new RuntimeException();
        }
        String[] strArr = A07;
        strArr[2] = "XQj6tBQR93KUWcmqG7acynHpkyXbPHo4";
        strArr[3] = "0fPU7ngiro1m2vFzwgFa3cBnolZ3o5pA";
    }

    public static void A07() {
        A07 = new String[]{"kZNWMB05A80rolZkZr5gINRkemJedumA", "PGnlsDLswmZGHAGkHnqyou4j", "CQczeQcoxNMNqPeDO5UPH4delPie3CF6", "Ozs7AQnIuhnl4TF488yhCLnc3lqg3Tqv", "QUMQF15y8F49TOv2Mbtf3pi6YRJU7tsl", "iRM3Hx3PCEqf", "8yEJzjy1AvS4vnL", "zEXAgd0MZ6iopjt"};
    }

    @Nullable
    public static C5S A00(X3 x3, @Nullable InterfaceC0967Qi interfaceC0967Qi) {
        if (!JT.A11(x3) || interfaceC0967Qi == null) {
            return null;
        }
        return C5T.A00().A01(interfaceC0967Qi);
    }

    public static C8P A01(X3 x3) {
        return C8Q.A00().A01(x3);
    }

    public static synchronized C1140Xb A02() {
        C1140Xb c1140Xb;
        String[] strArr = A07;
        if (strArr[6].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A07;
        strArr2[2] = "yNOYv8BJbeG1jc93xecDuC4SV0M6ZsAO";
        strArr2[3] = "rgM7W1LhEjhuRpvAxAxTebmxK2ArHzjw";
        synchronized (C1140Xb.class) {
            if (A05 == null) {
                A05 = new C1140Xb();
            }
            c1140Xb = A05;
        }
        return c1140Xb;
    }

    @Nullable
    public static Q7 A03(X3 x3) {
        if (!JT.A0y(x3)) {
            return null;
        }
        return QP.A01(x3);
    }

    @Nullable
    public static InterfaceC0967Qi A04(X3 x3, C8P c8p, @Nullable Q7 q7) {
        if (!JT.A1V(x3) || q7 == null) {
            return null;
        }
        return AbstractC0968Qj.A00().A01(c8p, q7, C0812Ke.A05(x3), new C1139Xa(new KX(x3, A05(0, 0, 122), null, KD.A08, AdSettings.getTestAdType() != AdSettings.TestAdType.DEFAULT ? AdSettings.getTestAdType().getAdTypeString() : null, 0, AdSettings.isTestMode(x3), AdSettings.isMixedAudience(), new KI(), C0839Li.A01(JT.A0G(x3)), null, null), x3), C0965Qg.A00().A00());
    }

    public static void A08() {
        String strA05 = A05(32, 28, 77);
        if (A07[5].length() == 20) {
            throw new RuntimeException();
        }
        String[] strArr = A07;
        strArr[5] = "4ii3kc4oT9MJsiDOLfNQb5ib2";
        strArr[5] = "4ii3kc4oT9MJsiDOLfNQb5ib2";
        KL.A05(strA05, A05(8, 24, 59), A05(0, 8, 46));
    }

    public static void A09(X3 x3, @Nullable C5S c5s) {
        if (!JT.A11(x3) || c5s == null) {
            return;
        }
        C5Q.A00().A01(c5s, x3);
    }

    public static void A0A(X3 x3, @Nullable InterfaceC0967Qi interfaceC0967Qi) {
        if (!JT.A0e(x3) || interfaceC0967Qi == null) {
            return;
        }
        new C04645n(x3, interfaceC0967Qi, new C04655o(), DynamicLoaderImpl.getBidderTokenProviderApi());
    }

    public final synchronized C8P A0B(C8C c8c) {
        if (this.A02 == null) {
            this.A02 = A01(c8c.A00());
        }
        return this.A02;
    }

    @Nullable
    public final synchronized InterfaceC0967Qi A0C() {
        return this.A04;
    }

    public final synchronized void A0D(X3 x3) {
        if (this.A04 != null) {
            return;
        }
        this.A02 = A01(x3);
        this.A04 = A04(x3, this.A02, A03(x3));
        A09(x3, A00(x3, this.A04));
        A0A(x3, this.A04);
        if (this.A04 != null) {
            this.A04.A5A();
        }
    }

    @Override // com.facebook.ads.redexgen.X.C8E
    public final JZ A5I(X3 x3) {
        return C1331bu.A01(x3);
    }

    @Override // com.facebook.ads.redexgen.X.C8E
    public final synchronized C8D A5W(C8C c8c) {
        if (this.A01 == null) {
            this.A01 = new XY(this);
        }
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.C8E
    public final synchronized InterfaceC05218c A61(C8C c8c) {
        return new XJ(c8c);
    }

    @Override // com.facebook.ads.redexgen.X.C8E
    public final synchronized C8F A6A(C8C c8c) {
        XW xw;
        xw = new XW(this, c8c);
        String[] strArr = A07;
        if (strArr[4].charAt(26) != strArr[0].charAt(26)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A07;
        strArr2[1] = "2Vt1OUprKjNjnyD3";
        strArr2[1] = "2Vt1OUprKjNjnyD3";
        return xw;
    }

    @Override // com.facebook.ads.redexgen.X.C8E
    @Nullable
    public final synchronized C0V A6N(C8C c8c) {
        if (!JT.A0m(c8c)) {
            return null;
        }
        if (this.A00 == null) {
            this.A00 = C0W.A00().A01(new XZ(this, c8c));
        }
        C0V c0v = this.A00;
        if (A07[5].length() == 20) {
            throw new RuntimeException();
        }
        String[] strArr = A07;
        strArr[4] = "VIV2EvMRfEPiWlvmDKty9fFKFHJul9Yn";
        strArr[0] = "0wfCQdIt8NwFYvPKQ0QtM4LE4vJ9WdpV";
        return c0v;
    }

    @Override // com.facebook.ads.redexgen.X.C8E
    public final synchronized C8G A6u(C8C c8c) {
        return new XX(this, c8c);
    }

    @Override // com.facebook.ads.redexgen.X.C8E
    public final synchronized AnonymousClass92 A72() {
        if (this.A03 == null) {
            this.A03 = new AnonymousClass92();
            A08();
        }
        return this.A03;
    }
}
