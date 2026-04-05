package com.facebook.ads.redexgen.X;

import com.amazonaws.services.s3.internal.Constants;
import com.facebook.ads.internal.exoplayer2.Format;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class Z7 extends DB {
    public static byte[] A01;
    public static String[] A02;
    public static final int A03;
    public static final byte[] A04;
    public boolean A00;

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 7);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{119, -104, -99, -101, -59, -39, -56, -51, -45, -109, -45, -44, -39, -41};
    }

    public static void A03() {
        A02 = new String[]{"nsRNjMJCINzttEcy6gRH", "iLBhdjTg3OKb8ywbNnp8pgqKlG", "RImCZo78JGnCd", "MQCM5Bft3v5AKfjxIzCtQe6XKQuHj9cI", "eIxys3n1xHnYXLY6XFR5ULs5u2Lm7Uxd", "C5r06ne3nHFGIipq1ktKTjeYxK5IlnNR", "VUYnCtCcQXjB1sQxVfFNmblLRJpOLxas", "bjyChy1rj1vSDo4qa0ykMaouAr"};
    }

    static {
        A03();
        A02();
        A03 = J1.A08(A01(0, 4, 33));
        A04 = new byte[]{79, 112, 117, 115, 72, 101, 97, 100};
    }

    private long A00(byte[] bArr) {
        int i2;
        int i3;
        int i4 = bArr[0] & 255;
        int i5 = i4 & 3;
        if (i5 == 0) {
            i2 = 1;
        } else if (i5 != 1 && i5 != 2) {
            i2 = bArr[1] & 63;
        } else {
            i2 = 2;
        }
        int i6 = i4 >> 3;
        int i7 = i6 & 3;
        if (i6 >= 16) {
            i3 = 2500 << i7;
        } else if (i6 >= 12) {
            int length = i7 & 1;
            i3 = Constants.MAXIMUM_UPLOAD_PARTS << length;
        } else {
            String[] strArr = A02;
            String str = strArr[0];
            String str2 = strArr[2];
            int length2 = str.length();
            int length3 = str2.length();
            if (length2 == length3) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[0] = "5xugLvQ3PcyvpmKVP2TF";
            strArr2[2] = "0gGe0pFYIsJYF";
            if (i7 == 3) {
                i3 = DateTimeConstants.MILLIS_PER_MINUTE;
            } else {
                i3 = Constants.MAXIMUM_UPLOAD_PARTS << i7;
            }
        }
        return ((long) i2) * ((long) i3);
    }

    private void A04(List<byte[]> list, int i2) {
        list.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong((((long) i2) * 1000000000) / 48000).array());
    }

    public static boolean A05(C0768Il c0768Il) {
        int iA05 = c0768Il.A05();
        byte[] bArr = A04;
        if (iA05 < bArr.length) {
            return false;
        }
        byte[] bArr2 = new byte[bArr.length];
        c0768Il.A0d(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, A04);
    }

    @Override // com.facebook.ads.redexgen.X.DB
    public final long A08(C0768Il c0768Il) {
        return A05(A00(c0768Il.A00));
    }

    @Override // com.facebook.ads.redexgen.X.DB
    public final void A0A(boolean z) {
        super.A0A(z);
        if (z) {
            this.A00 = false;
        }
    }

    @Override // com.facebook.ads.redexgen.X.DB
    public final boolean A0B(C0768Il c0768Il, long j2, DA da) throws InterruptedException, IOException {
        if (!this.A00) {
            byte[] bArrCopyOf = Arrays.copyOf(c0768Il.A00, c0768Il.A08());
            int i2 = bArrCopyOf[9] & 255;
            int channelCount = (bArrCopyOf[11] & 255) << 8;
            int channelCount2 = channelCount | (bArrCopyOf[10] & 255);
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(bArrCopyOf);
            A04(arrayList, channelCount2);
            A04(arrayList, 3840);
            da.A00 = Format.A07(null, A01(4, 10, 93), null, -1, -1, i2, 48000, arrayList, null, 0, null);
            this.A00 = true;
            return true;
        }
        boolean z = c0768Il.A09() == A03;
        c0768Il.A0Z(0);
        return z;
    }
}
