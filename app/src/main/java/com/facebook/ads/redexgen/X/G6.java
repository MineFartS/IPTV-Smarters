package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class G6 implements QN {
    public static byte[] A00;
    public static String[] A01;

    static {
        A02();
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 63);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{DateTimeFieldType.MINUTE_OF_DAY, 74, DateTimeFieldType.CLOCKHOUR_OF_DAY, DateTimeFieldType.CLOCKHOUR_OF_DAY, DateTimeFieldType.CLOCKHOUR_OF_DAY, DateTimeFieldType.HALFDAY_OF_DAY, 101, 121, 121, 125, DateTimeFieldType.HALFDAY_OF_DAY, 127, 72, 92, 88, 72, 94, 89, DateTimeFieldType.HALFDAY_OF_DAY, DateTimeFieldType.CLOCKHOUR_OF_DAY, DateTimeFieldType.CLOCKHOUR_OF_DAY, DateTimeFieldType.CLOCKHOUR_OF_DAY, 124, 124, 124, 97, 9, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.HOUR_OF_DAY, 97, DateTimeFieldType.MINUTE_OF_HOUR, 36, 50, 49, 46, 47, 50, 36, 97, 124, 124, 124, 28, 48, 49, 43, 58, 49, 43, 101, 85, 87, 123, 122, 96, 113, 122, 96, 46, 52, 103, 80, 86, 80, 92, 67, 80, DateTimeFieldType.SECOND_OF_MINUTE, 64, 71, 89, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, DateTimeFieldType.SECOND_OF_MINUTE, 36, 3, DateTimeFieldType.MILLIS_OF_DAY, 3, 2, 4, 77, 87};
    }

    public static void A02() {
        A01 = new String[]{"pV4qaXw6VxHe7sBZO1Jm7", "tYmmDZR", "QxtgKachTN194eYcwGU9LkTJFmNVHEQq", "xizWbh8OYfs2b3YS4RQSAfdZXrf", "ZGXkvbP8ihMVuHVBPcyrpbYPgwlZhzIP", "8ikrsMyeeixNpMm9GyoBY2XQC58AAuyp", "5oOpXt9UGuRFEd", "RP1a17xo5hy9tsnm95xYo1Dg0S3kboh6"};
    }

    private void A03(Map<String, List<String>> map) {
        if (map != null) {
            for (String str : map.keySet()) {
                List<String> headers = map.get(str);
                for (String str2 : headers) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    String header = A00(1, 1, 79);
                    sb.append(header);
                    sb.append(str2);
                    String header2 = sb.toString();
                    A7y(header2);
                }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.QN
    public final boolean A7k() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.QN
    public final void A7y(String str) {
        System.out.println(str);
    }

    @Override // com.facebook.ads.redexgen.X.QN
    public final void A8I(HttpURLConnection httpURLConnection, Object obj) throws IOException {
        A7y(A00(2, 20, 18));
        A7y(httpURLConnection.getRequestMethod() + A00(0, 1, 13) + httpURLConnection.getURL().toString());
        if (obj instanceof String) {
            A7y(A00(52, 9, 43) + ((String) obj));
        }
        Map<String, List<String>> requestProperties = httpURLConnection.getRequestProperties();
        String[] strArr = A01;
        if (strArr[4].length() == strArr[1].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[7] = "GaHF5freueg6l7URhKCrm47FqBCtqYBi";
        strArr2[5] = "OrzNjk0gyiryng1un1TYaQe8BXJyjneo";
        A03(requestProperties);
    }

    @Override // com.facebook.ads.redexgen.X.QN
    public final void A8J(Q6 q6) {
        if (q6 != null) {
            A7y(A00(22, 21, 126));
            A7y(A00(61, 13, 10) + q6.getUrl());
            A7y(A00(74, 8, 72) + q6.A79());
            A03(q6.A6O());
            A7y(A00(43, 9, 96) + q6.A5V());
        }
    }
}
