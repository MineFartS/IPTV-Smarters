package com.facebook.ads.redexgen.X;

import android.net.TrafficStats;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import javax.net.ssl.HttpsURLConnection;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class G7 implements Q7 {
    public static byte[] A07;
    public static String[] A08;
    public static final String A09;
    public InterfaceC05218c A00;
    public Executor A01;
    public boolean A02;
    public QC A03;
    public final QM A06;
    public final QH A05 = new GF();
    public QN A04 = new G6();

    public static String A07(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 93);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A09() {
        A07 = new byte[]{DateTimeFieldType.CLOCKHOUR_OF_DAY, DateTimeFieldType.MINUTE_OF_DAY, 55, 58, 95, 55, 53, 74, 71, DateTimeFieldType.HOUR_OF_HALFDAY, 74, 72, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 76, 90, 93, 67, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, DateTimeFieldType.HOUR_OF_HALFDAY, 71, 93, DateTimeFieldType.HOUR_OF_HALFDAY, 64, 65, 90, DateTimeFieldType.HOUR_OF_HALFDAY, 79, DateTimeFieldType.HOUR_OF_HALFDAY, 88, 79, 66, 71, 74, DateTimeFieldType.HOUR_OF_HALFDAY, 123, 124, 98, DateTimeFieldType.HOUR_OF_HALFDAY, 65, 72, DateTimeFieldType.HOUR_OF_HALFDAY, 94, 102, 106, 9, 30, 106, 119, 106, 28, DateTimeFieldType.CLOCKHOUR_OF_DAY, 98, 100, DateTimeFieldType.CLOCKHOUR_OF_DAY, DateTimeFieldType.HALFDAY_OF_DAY, DateTimeFieldType.CLOCKHOUR_OF_DAY, 55, 59, 111, 105, 98, 114, 117, 124, 59, 81, DateTimeFieldType.HOUR_OF_DAY, 59, 50, 63, 46, 45, 59, 58, 94, 42, 55, 51, 59, 94, 67, 94, 1, 35, 50, 50, 47, 40, 33, 102, 50, 46, 35, 102, 46, 50, 50, 54, 102, 52, 35, 53, 54, 41, 40, 53, 35, 102, 50, 47, 43, 35, 34, 102, 41, 51, 50, 61, 60, 46, 69, 80, DateTimeFieldType.MILLIS_OF_DAY, 7, 7, 27, 30, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.MILLIS_OF_DAY, 3, 30, 24, 25, 88, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 90, 0, 0, 0, 90, DateTimeFieldType.HOUR_OF_DAY, 24, 5, 26, 90, 2, 5, 27, DateTimeFieldType.MINUTE_OF_DAY, 25, DateTimeFieldType.SECOND_OF_DAY, 24, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.MINUTE_OF_DAY, DateTimeFieldType.MINUTE_OF_HOUR, 76, DateTimeFieldType.SECOND_OF_DAY, 31, DateTimeFieldType.MILLIS_OF_DAY, 5, 4, DateTimeFieldType.MINUTE_OF_DAY, 3, 74, 34, 35, 49, 90, 79, 120, 110, 105, 119, 59, 54, 112, 59, 54, 114, 34, 41, 56, 59, 35, 62, 39};
    }

    public static void A0A() {
        A08 = new String[]{"Z3ZBH3trhaxMswGoeO0i3WMhBsCqcWgs", "P814sFImmOC", "INcscN3Z5kcfIuBeknVxelrdNm8ANoXs", "RvJjsajerkLdUat3TDI8NPR3DDSWtO", "ZLSXhw", "wxtWSqUF9a7Aw2d1StIocmcoa4QX", "58xAXbC3p", "Zj1UZNXOzFX"};
    }

    static {
        A0A();
        A09();
        A09 = Q7.class.getSimpleName();
    }

    public G7(QC qc, InterfaceC05218c interfaceC05218c, Executor executor) {
        A0B();
        this.A03 = qc;
        this.A06 = new GE() { // from class: com.facebook.ads.redexgen.X.4E
        };
        this.A01 = executor;
        this.A00 = interfaceC05218c;
    }

    private final int A00(HttpURLConnection httpURLConnection, byte[] bArr) throws Exception {
        OutputStream outputStreamABW = null;
        try {
            outputStreamABW = this.A06.ABW(httpURLConnection);
            if (outputStreamABW != null) {
                this.A06.AE0(outputStreamABW, bArr);
            }
            int responseCode = httpURLConnection.getResponseCode();
            if (outputStreamABW != null) {
                try {
                    outputStreamABW.close();
                } catch (Exception unused) {
                }
            }
            return responseCode;
        } catch (Throwable th) {
            if (outputStreamABW != null) {
                try {
                    outputStreamABW.close();
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
    }

    private final Q6 A01(QJ qj) throws Exception {
        Exception e2;
        Q6 g8;
        String strA07 = A07(179, 7, 17);
        HttpURLConnection httpURLConnection = null;
        Q6 q6A05 = null;
        boolean z = false;
        try {
            try {
                this.A02 = false;
                HttpURLConnection httpURLConnectionA08 = A08(qj.A05());
                A0H(httpURLConnectionA08, qj);
                A0G(httpURLConnectionA08, qj);
                if (this.A04.A7k()) {
                    this.A04.A8I(httpURLConnectionA08, qj.A06());
                }
                httpURLConnectionA08.connect();
                this.A02 = true;
                Set<String> setA01 = this.A03.A01();
                Set<String> setA02 = this.A03.A02();
                boolean pinKeys = (setA01 == null || setA01.isEmpty()) ? false : true;
                if (setA02 != null && !setA02.isEmpty()) {
                    z = true;
                }
                if ((httpURLConnectionA08 instanceof HttpsURLConnection) && (pinKeys || z)) {
                    try {
                        QO.A03((HttpsURLConnection) httpURLConnectionA08, setA01, setA02);
                    } catch (CertificateException e3) {
                        this.A00.A87(strA07, C05228d.A1d, new C05238e(e3));
                    } catch (Exception e4) {
                        this.A00.A86(strA07, C05228d.A1c, new C05238e(e4));
                    }
                }
                if (httpURLConnectionA08.getDoOutput() && qj.A06() != null) {
                    A00(httpURLConnectionA08, qj.A06());
                }
                if (httpURLConnectionA08.getDoInput()) {
                    g8 = A06(httpURLConnectionA08);
                } else {
                    g8 = new G8(httpURLConnectionA08, null);
                }
                if (this.A04.A7k()) {
                    this.A04.A8J(g8);
                }
                httpURLConnectionA08.disconnect();
                return g8;
            } catch (Exception ee) {
                try {
                    try {
                        q6A05 = A05(null);
                    } catch (Exception unused) {
                        ee.printStackTrace();
                        if (q6A05 != null && q6A05.A79() > 0) {
                            if (this.A04.A7k()) {
                                QN qn = this.A04;
                                String[] strArr = A08;
                                if (strArr[0].charAt(28) == strArr[2].charAt(28)) {
                                    Exception e5 = new RuntimeException();
                                    throw e5;
                                }
                                String[] strArr2 = A08;
                                strArr2[1] = "yaq9HQ3M3BI";
                                strArr2[7] = "lkFDbfWlXmK";
                                qn.A8J(q6A05);
                            }
                            if (0 != 0) {
                                httpURLConnection.disconnect();
                            }
                            return q6A05;
                        }
                        e2 = new QK(ee, q6A05);
                    }
                    if (q6A05 == null || q6A05.A79() <= 0) {
                        e2 = new QK(ee, q6A05);
                        throw e2;
                    }
                    if (this.A04.A7k()) {
                        this.A04.A8J(q6A05);
                    }
                    if (0 != 0) {
                        httpURLConnection.disconnect();
                    }
                    return q6A05;
                } catch (Throwable unused2) {
                    if (q6A05 != null && q6A05.A79() > 0) {
                        if (this.A04.A7k()) {
                            this.A04.A8J(q6A05);
                        }
                        if (0 != 0) {
                            httpURLConnection.disconnect();
                        }
                        return q6A05;
                    }
                    Exception e6 = new QK(ee, q6A05);
                    throw e6;
                }
            }
        } catch (Throwable th) {
            if (this.A04.A7k()) {
                this.A04.A8J(q6A05);
            }
            if (0 != 0) {
                httpURLConnection.disconnect();
            }
            throw th;
        }
    }

    @Nullable
    private final Q6 A02(QJ qj) {
        if (this.A03.A04()) {
            A0C(qj);
        }
        Q6 q6A01 = null;
        try {
            q6A01 = A01(qj);
            return q6A01;
        } catch (QK e2) {
            this.A06.A9d(e2);
            return q6A01;
        } catch (Exception e3) {
            this.A06.A9d(new QK(e3, q6A01));
            return q6A01;
        }
    }

    @Nullable
    private final Q6 A03(String str, QL ql, QF qf) {
        return A02(new GA(str, ql, qf));
    }

    @Nullable
    private final Q6 A04(String str, String str2, byte[] bArr, QF qf) {
        return A02(new G9(str, null, str2, bArr, qf));
    }

    private final Q6 A05(HttpURLConnection httpURLConnection) throws Exception {
        InputStream errorStream = null;
        byte[] bArrAC7 = null;
        try {
            errorStream = httpURLConnection.getErrorStream();
            if (errorStream != null) {
                bArrAC7 = this.A06.AC7(errorStream);
            }
            G8 g8 = new G8(httpURLConnection, bArrAC7);
            if (errorStream != null) {
                try {
                    errorStream.close();
                } catch (Exception unused) {
                }
            }
            return g8;
        } catch (Throwable th) {
            if (errorStream != null) {
                try {
                    errorStream.close();
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
    }

    private final Q6 A06(HttpURLConnection httpURLConnection) throws Exception {
        InputStream inputStreamABV = null;
        byte[] bArrAC7 = null;
        try {
            inputStreamABV = this.A06.ABV(httpURLConnection);
            if (inputStreamABV != null) {
                bArrAC7 = this.A06.AC7(inputStreamABV);
            }
            G8 g8 = new G8(httpURLConnection, bArrAC7);
            if (inputStreamABV != null) {
                try {
                    inputStreamABV.close();
                } catch (Exception unused) {
                }
            }
            return g8;
        } catch (Throwable th) {
            if (inputStreamABV != null) {
                try {
                    inputStreamABV.close();
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
    }

    private final HttpURLConnection A08(String str) throws IOException {
        try {
            new URL(str);
            TrafficStats.setThreadStatsTag(61453);
            return this.A06.ABU(str);
        } catch (MalformedURLException e2) {
            throw new IllegalArgumentException(str + A07(18, 19, 115), e2);
        }
    }

    public static synchronized void A0B() {
        if (CookieHandler.getDefault() == null) {
            CookieHandler.setDefault(new CookieManager());
        }
    }

    private void A0C(QJ qj) {
        StringBuilder sb = new StringBuilder(A07(169, 10, 70));
        boolean zEquals = qj.A03().equals(QI.A06);
        String strA07 = A07(41, 1, 33);
        if (zEquals && qj.A06() != null) {
            sb.append(A07(7, 5, 55));
            sb.append(new String(qj.A06(), Charset.forName(A07(117, 5, 53))));
            sb.append(strA07);
        }
        Map<String, String> mapA06 = qj.A02().A06();
        String[] strArr = A08;
        if (strArr[1].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A08;
        strArr2[3] = "s0c02ga9sXqOOqZgqzjFkG4II3gfLx";
        strArr2[6] = "iECV1gT3x";
        for (Map.Entry<String, String> entry : mapA06.entrySet()) {
            sb.append(A07(2, 5, 74));
            sb.append(entry.getKey());
            sb.append(A07(66, 1, 118));
            sb.append(entry.getValue());
            sb.append(strA07);
        }
        sb.append(A07(0, 2, 109));
        sb.append(qj.A05());
        sb.append(strA07);
        String string = sb.toString();
        A0E(string, 1, (string.length() / 4000) + 1);
    }

    private void A0D(QJ qj, Q8 q8) {
        this.A05.A5Q(this, q8, this.A01).A50(qj);
        if (this.A03.A04()) {
            A0C(qj);
        }
    }

    private void A0E(String str, int i2, int i3) {
        String str2 = A09 + A07(12, 6, 114) + i2 + A07(65, 1, 35) + i3;
        if (str.length() > 4000) {
            str.substring(0, 4000);
            A0E(str.substring(4000), i2 + 1, i3);
        }
    }

    private void A0F(String str, String str2, byte[] bArr, Q8 q8, QF qf) {
        A0D(new G9(str, null, str2, bArr, qf), q8);
    }

    private void A0G(HttpURLConnection httpURLConnection, QJ qj) {
        Map<String, String> mapA06 = qj.A02().A06();
        Q5 q5A05 = qj.A02().A05();
        for (String str : mapA06.keySet()) {
            String name = mapA06.get(str);
            httpURLConnection.setRequestProperty(str, name);
        }
        if (q5A05 != null) {
            Map<String, String> mapA5D = q5A05.A5D(this.A03.A03());
            for (String str2 : mapA5D.keySet()) {
                String value = mapA5D.get(str2);
                httpURLConnection.setRequestProperty(str2, value);
            }
        }
    }

    private final void A0H(HttpURLConnection httpURLConnection, QJ qj) throws IOException {
        QF qfA02 = qj.A02();
        httpURLConnection.setConnectTimeout(qfA02.A00());
        httpURLConnection.setReadTimeout(qfA02.A02());
        this.A06.ABn(httpURLConnection, qj.A03(), qj.A04());
    }

    private final boolean A0I(Throwable th, long j2, QJ qj) {
        QF qfA02 = qj.A02();
        long jCurrentTimeMillis = (System.currentTimeMillis() - j2) + 10;
        if (this.A04.A7k()) {
            this.A04.A7y(A07(67, 15, 35) + jCurrentTimeMillis + A07(42, 7, 23) + qfA02.A00() + A07(49, 7, 109) + qfA02.A02());
        }
        if (this.A02) {
            return jCurrentTimeMillis >= ((long) qfA02.A02());
        }
        long jA00 = qfA02.A00();
        if (A08[5].length() != 28) {
            throw new RuntimeException();
        }
        String[] strArr = A08;
        strArr[3] = "UT6xnSlzbr9JaeC9T1uoRQiwoDXC3Y";
        strArr[6] = "g5URFCrsk";
        return jCurrentTimeMillis >= jA00;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.facebook.ads.redexgen.X.Q6 A0J(com.facebook.ads.redexgen.X.QJ r31) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 534
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.G7.A0J(com.facebook.ads.redexgen.X.QJ):com.facebook.ads.redexgen.X.Q6");
    }

    @Override // com.facebook.ads.redexgen.X.Q7
    @Nullable
    @Deprecated
    public final Q6 ABf(String str, Map<String, String> map) {
        return A03(str, new QL(map), this.A03.A00());
    }

    @Override // com.facebook.ads.redexgen.X.Q7
    @Nullable
    @Deprecated
    public final Q6 ABg(String str, byte[] bArr) {
        return A04(str, A07(122, 47, 42), bArr, this.A03.A00());
    }

    @Override // com.facebook.ads.redexgen.X.Q7
    public final void ABh(String str, byte[] bArr, Q8 q8) {
        A0F(str, A07(122, 47, 42), bArr, q8, this.A03.A00());
    }
}
