package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0684Fb extends RO<Long> {
    public static byte[] A00;
    public static String[] A01;

    static {
        A02();
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 87);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        byte[] bArr = {58, 33, 56, 56};
        if (A01[2].charAt(4) != 'B') {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[6] = "egBmqwJMUEFNytxVtqlmiDvcEIQ67KRc";
        strArr[7] = "BW95kIs8Rzm4NmZj4ydAzmJQI3LKMXPx";
        A00 = bArr;
    }

    public static void A02() {
        A01 = new String[]{"JQYNK67rqjtKQrqU2u3iSbXyZUf2Wicm", "SEBNnQG7dzbi23B3JlpLspb94iJTTw", "SuDXBRihD81ZgkPiuMBiTdzrsXZ5bQ0X", "f0XnBrE1G2D0cIpm8fYsFFVTrwzNmz", "mp4KDhjDwCM81TxrFAwlcvQnU9Fnz9Ju", "xfn", "COdwqHqzieRD4ga2tgMcAYqGi7lUqqmk", "kWLpZAJ5d7TLKwQ2ycZWcPcpaaiv679s"};
    }

    public C0684Fb(String str) {
        super(str);
    }

    public final C0X A03(@Nullable Long l2) {
        return new C0X(this, l2 == null ? A00(0, 4, 3) : l2.toString());
    }
}
