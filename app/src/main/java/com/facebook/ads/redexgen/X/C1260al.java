package com.facebook.ads.redexgen.X;

import android.net.Uri;
import com.facebook.ads.internal.exoplayer2.Format;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.al, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1260al extends GP {
    public static byte[] A05;
    public final long A00;
    public final Uri A01;
    public final GN A02;
    public final C1263ao A03;
    public final String A04;

    static {
        A03();
    }

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 75);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A05 = new byte[]{62};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1260al(String str, long j2, Format format, String str2, C1262an c1262an, List<GK> list, String str3, long j3) {
        super(str, j2, format, str2, c1262an, list);
        String string = str3;
        this.A01 = Uri.parse(str2);
        this.A02 = c1262an.A02();
        if (string == null) {
            if (str != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                String strA01 = A01(0, 1, 91);
                sb.append(strA01);
                sb.append(format.A0M);
                sb.append(strA01);
                sb.append(j2);
                string = sb.toString();
            } else {
                string = null;
            }
        }
        this.A04 = string;
        this.A00 = j3;
        this.A03 = this.A02 == null ? new C1263ao(new GN(null, 0L, j3)) : null;
    }

    @Override // com.facebook.ads.redexgen.X.GP
    public final GC A05() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.GP
    public final GN A07() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.GP
    public final String A08() {
        return this.A04;
    }
}
