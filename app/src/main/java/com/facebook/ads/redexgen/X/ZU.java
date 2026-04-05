package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class ZU implements DT {
    public static byte[] A03;
    public static String[] A04;
    public CR A00;
    public C0780Ix A01;
    public boolean A02;

    static {
        A02();
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 96);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{11, 26, 26, DateTimeFieldType.MILLIS_OF_DAY, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.HALFDAY_OF_DAY, 11, 30, DateTimeFieldType.MINUTE_OF_HOUR, 25, 24, -39, 34, -41, 29, DateTimeFieldType.HALFDAY_OF_DAY, 30, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, -35, -33};
    }

    public static void A02() {
        A04 = new String[]{"9dIhF2X5qYPGZcPrMQjFeU2FMq4Icb5t", "C7lZKzl2OzNugbLE4QJixcZrlcSgCGI7", "v7kvgcbsYqtq4Ou8B7XlURjv8wkzUozH", "8BzUB2zJ4MAZsKVthH28T9QXZJlG29jD", "wOgdV6BnuyxARX3Rbc0CvFDDXWIKfgjM", "mpBmZ", "f47n1mRwiFyOsV4myeWB5UC2YKJiwKop", "3tKYH9iJUyIyPmbH9Trftcv4NWgUsp5b"};
    }

    @Override // com.facebook.ads.redexgen.X.DT
    public final void A48(C0768Il c0768Il) {
        if (!this.A02) {
            if (this.A01.A06() == -9223372036854775807L) {
                return;
            }
            this.A00.A5B(Format.A02(null, A00(0, 20, 74), this.A01.A06()));
            this.A02 = true;
        }
        int iA05 = c0768Il.A05();
        this.A00.ACh(c0768Il, iA05);
        CR cr = this.A00;
        if (A04[0].charAt(13) != 'c') {
            throw new RuntimeException();
        }
        String[] strArr = A04;
        strArr[0] = "M4wOXnroCREOIcf8T96EgrMDUu9ExHmM";
        strArr[0] = "M4wOXnroCREOIcf8T96EgrMDUu9ExHmM";
        cr.ACi(this.A01.A05(), 1, iA05, 0, null);
    }

    @Override // com.facebook.ads.redexgen.X.DT
    public final void A7X(C0780Ix c0780Ix, CH ch, DZ dz) {
        this.A01 = c0780Ix;
        dz.A06();
        this.A00 = ch.ADb(dz.A04(), 4);
        this.A00.A5B(Format.A0B(dz.A05(), A00(0, 20, 74), null, -1, null));
    }
}
