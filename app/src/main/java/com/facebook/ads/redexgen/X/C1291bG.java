package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import java.io.IOException;
import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1291bG implements InterfaceC0740Hh {
    public static byte[] A0A;
    public static String[] A0B;
    public InterfaceC0740Hh A00;
    public InterfaceC0740Hh A01;
    public InterfaceC0740Hh A02;
    public InterfaceC0740Hh A03;
    public InterfaceC0740Hh A04;
    public InterfaceC0740Hh A05;
    public InterfaceC0740Hh A06;
    public final Context A07;
    public final InterfaceC0740Hh A08;
    public final I2<? super InterfaceC0740Hh> A09;

    static {
        A08();
        A07();
    }

    public static String A06(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0A, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 49);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        byte[] bArr = {119, -87, -74, -84, -70, -73, -79, -84, -89, -87, -69, -69, -83, -68, 119, -40, 11, 11, -4, 4, 7, 11, 0, 5, -2, -73, 11, 6, -73, 7, 3, -8, DateTimeFieldType.CLOCKHOUR_OF_DAY, -73, -23, -21, -28, -25, -73, 10, 11, 9, -4, -8, 4, -73, DateTimeFieldType.HOUR_OF_HALFDAY, 0, 11, -1, 6, 12, 11, -73, -5, -4, 7, -4, 5, -5, 0, 5, -2, -73, 6, 5, -73, 11, -1, -4, -73, -23, -21, -28, -25, -73, -4, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 11, -4, 5, 10, 0, 6, 5, -13, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.CLOCKHOUR_OF_DAY, 36, 27, 35, -13, DateTimeFieldType.CLOCKHOUR_OF_DAY, 35, DateTimeFieldType.CLOCKHOUR_OF_DAY, 2, 30, 36, 33, DateTimeFieldType.MINUTE_OF_DAY, DateTimeFieldType.SECOND_OF_DAY, -90, -45, -45, -48, -45, -127, -54, -49, -44, -43, -62, -49, -43, -54, -62, -43, -54, -49, -56, -127, -77, -75, -82, -79, -127, -58, -39, -43, -58, -49, -44, -54, -48, -49, -82, -64, -64, -78, -63, -33, -21, -23, -86, -30, -35, -33, -31, -34, -21, -21, -25, -86, -35, -32, -17, -86, -27, -22, -16, -31, -18, -22, -35, -24, -86, -31, -12, -21, -20, -24, -35, -11, -31, -18, -82, -86, -31, -12, -16, -86, -18, -16, -23, -20, -86, -50, -16, -23, -20, -64, -35, -16, -35, -49, -21, -15, -18, -33, -31, DateTimeFieldType.HOUR_OF_DAY, 29, 28, 34, DateTimeFieldType.MINUTE_OF_HOUR, 28, 34, -13, -16, 3, -16, -30, -47, -25, -30, -43, -29, -33, -27, -30, -45, -43, -27, -25, -32, -29};
        if (A0B[7].length() != 19) {
            throw new RuntimeException();
        }
        String[] strArr = A0B;
        strArr[1] = "aTM6G8lKpIJ6RP017QMILejHyUH2B7dh";
        strArr[3] = "ERhfqbVtKjwR0y0XTQNxaBJXl7PFqJQV";
        A0A = bArr;
    }

    public static void A08() {
        A0B = new String[]{"FbuaOXxD8R3r2Sez", "nl2ebpznfahqYQ0iJMeMraM5u9ytbnkM", "LukWv8Q1lv25Jz9VZoWHVgr80BMsfj7N", "UITThFDmXIK6qk0JXllT0SDhOskljLuD", "WWGwJIDbyg2bl1Mdb", "YrbKAvAwCNNri3u3ecPrw9BDMC3UJFWv", "h8pfgUZlB4VhxmKVTbPlaDG6t2cnqOd2", "IQvStArhblJullrSqn3"};
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.I2 != com.facebook.ads.internal.exoplayer2.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.upstream.DataSource> */
    public C1291bG(Context context, I2<? super InterfaceC0740Hh> i2, InterfaceC0740Hh interfaceC0740Hh) {
        this.A07 = context.getApplicationContext();
        this.A09 = i2;
        this.A08 = (InterfaceC0740Hh) IM.A01(interfaceC0740Hh);
    }

    private InterfaceC0740Hh A00() {
        if (this.A00 == null) {
            this.A00 = new C1284b9(this.A07, this.A09);
        }
        return this.A00;
    }

    private InterfaceC0740Hh A01() {
        if (this.A01 == null) {
            this.A01 = new C1287bC(this.A07, this.A09);
        }
        InterfaceC0740Hh interfaceC0740Hh = this.A01;
        if (A0B[4].length() != 17) {
            throw new RuntimeException();
        }
        String[] strArr = A0B;
        strArr[7] = "5KWAQaHsfffdQGrIbOe";
        strArr[7] = "5KWAQaHsfffdQGrIbOe";
        return interfaceC0740Hh;
    }

    private InterfaceC0740Hh A02() {
        if (this.A02 == null) {
            this.A02 = new C1288bD();
        }
        return this.A02;
    }

    private InterfaceC0740Hh A03() {
        if (this.A04 == null) {
            this.A04 = new C1295bK(this.A09);
        }
        return this.A04;
    }

    private InterfaceC0740Hh A04() {
        if (this.A05 == null) {
            this.A05 = new C1307bW(this.A07, this.A09);
        }
        return this.A05;
    }

    private InterfaceC0740Hh A05() {
        if (this.A06 == null) {
            try {
                this.A06 = (InterfaceC0740Hh) Class.forName(A06(141, 60, 75)).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException unused) {
                Log.w(A06(85, 17, 126), A06(15, 70, 102));
            } catch (Exception e2) {
                throw new RuntimeException(A06(102, 34, 48), e2);
            }
            if (this.A06 == null) {
                this.A06 = this.A08;
            }
        }
        return this.A06;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0740Hh
    public final Uri A7H() {
        InterfaceC0740Hh interfaceC0740Hh = this.A03;
        if (interfaceC0740Hh == null) {
            return null;
        }
        return interfaceC0740Hh.A7H();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0740Hh
    public final long ABR(C0744Hl c0744Hl) throws IOException {
        IM.A04(this.A03 == null);
        String scheme = c0744Hl.A04.getScheme();
        if (J1.A0i(c0744Hl.A04)) {
            if (c0744Hl.A04.getPath().startsWith(A06(0, 15, 23))) {
                this.A03 = A00();
            } else {
                this.A03 = A03();
            }
        } else if (A06(136, 5, 28).equals(scheme)) {
            this.A03 = A00();
        } else if (A06(201, 7, 125).equals(scheme)) {
            this.A03 = A01();
        } else if (A06(223, 4, 66).equals(scheme)) {
            this.A03 = A05();
        } else if (A06(208, 4, 94).equals(scheme)) {
            this.A03 = A02();
        } else {
            if (A0B[7].length() != 19) {
                throw new RuntimeException();
            }
            String[] strArr = A0B;
            strArr[6] = "D4NYqGk09rVUGFQV4qQWMtXs9QaZTkcz";
            strArr[2] = "qnlKhzyemJcEWBYVQAP4EuZEjLdcMELi";
            if (A06(212, 11, 63).equals(scheme)) {
                this.A03 = A04();
            } else {
                this.A03 = this.A08;
            }
        }
        return this.A03.ABR(c0744Hl);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0740Hh
    public final void close() throws IOException {
        InterfaceC0740Hh interfaceC0740Hh = this.A03;
        if (interfaceC0740Hh != null) {
            try {
                interfaceC0740Hh.close();
            } finally {
                this.A03 = null;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0740Hh
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        return this.A03.read(bArr, i2, i3);
    }
}
