package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class QR extends AsyncTask<String, Void, QS> {
    public static byte[] A05;
    public static String[] A06;
    public static final String A07;
    public static final Set<String> A08;
    public C8C A00;
    public Q6 A01;
    public QQ A02;
    public Map<String, String> A03;
    public Map<String, String> A04;

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 90);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A05 = new byte[]{48, 0, 3, 57, 33, DateTimeFieldType.MILLIS_OF_DAY, DateTimeFieldType.MILLIS_OF_DAY, 11, DateTimeFieldType.MILLIS_OF_DAY, 68, 11, DateTimeFieldType.SECOND_OF_DAY, 1, 10, DateTimeFieldType.HALFDAY_OF_DAY, 10, 3, 68, DateTimeFieldType.HOUR_OF_DAY, DateTimeFieldType.MILLIS_OF_DAY, 8, 94, 68, 122, 117, 122, 119, 116, 124, 44, 55, 46, 46};
    }

    public static void A05() {
        A06 = new String[]{"iMGBqiSHm2uYyOurEO", "JHkNge3qKUrOixxb", "Efd0ZU7p6XsOViiGEn9FTnCEMV0phXsZ", "Qqux8MYyckh5CceEy", "ksejtLtP", "6qwv67", "yXEFufBpuo", "JuPO8KFa"};
    }

    static {
        A05();
        A04();
        A07 = QR.class.getSimpleName();
        A08 = new HashSet();
        A08.add(A01(0, 1, 73));
        A08.add(A01(29, 4, 24));
    }

    public QR(C8C c8c) {
        this(c8c, null, null);
    }

    public QR(C8C c8c, Map<String, String> map) {
        this(c8c, map, null);
    }

    public QR(C8C c8c, Map<String, String> map, Map<String, String> map2) {
        this.A00 = c8c;
        Map<String, String> postData = map != null ? new HashMap<>(map) : null;
        this.A03 = postData;
        Map<String, String> extraData = map2 != null ? new HashMap<>(map2) : null;
        this.A04 = extraData;
    }

    private final QS A00(String... strArr) throws Throwable {
        if (C0822Kp.A02(this)) {
            return null;
        }
        try {
            String str = strArr[0];
            if (!TextUtils.isEmpty(str) && !A08.contains(str)) {
                String strA02 = A02(str);
                if (this.A03 != null && !this.A03.isEmpty()) {
                    for (Map.Entry<String, String> entry : this.A03.entrySet()) {
                        String key = entry.getKey();
                        String url = entry.getValue();
                        strA02 = A03(strA02, key, url);
                    }
                }
                int i2 = 1;
                while (true) {
                    int i3 = i2 + 1;
                    if (i2 > 2) {
                        return null;
                    }
                    if (A07(strA02)) {
                        return new QS(this.A01);
                    }
                    i2 = i3;
                }
            }
            return null;
        } catch (Throwable th) {
            if (A06[6].length() == 31) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[6] = "dO3qGWbyMuVAZQTwO1X30zVxIjEEo";
            strArr2[6] = "dO3qGWbyMuVAZQTwO1X30zVxIjEEo";
            C0822Kp.A00(th, this);
            return null;
        }
    }

    private String A02(String str) {
        try {
            return A03(str, A01(23, 6, 65), LY.A01(this.A00.A02().A5O()));
        } catch (Exception unused) {
            return str;
        }
    }

    private String A03(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return str;
        }
        String strA01 = A01(3, 1, 92);
        if (str.contains(strA01)) {
            strA01 = A01(1, 1, 124);
        }
        return str + strA01 + str2 + A01(2, 1, 100) + URLEncoder.encode(str3);
    }

    private final void A06(QS qs) throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            if (this.A02 != null) {
                this.A02.ABt(qs);
            }
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }

    @SuppressLint({"CatchGeneralException"})
    private boolean A07(String str) {
        Q6 q6ABf;
        Q7 q7A00 = QP.A00(this.A00);
        try {
            if (this.A04 == null || this.A04.size() == 0) {
                q6ABf = q7A00.ABf(str, new QL());
            } else {
                QL ql = new QL();
                ql.A06(this.A04);
                q6ABf = q7A00.ABg(str, ql.A09());
            }
            this.A01 = q6ABf;
        } catch (Exception e2) {
            Log.e(A07, A01(4, 19, 62) + str, e2);
        }
        Q6 q6 = this.A01;
        return q6 != null && q6.A79() == 200;
    }

    public final void A08(QQ qq) {
        this.A02 = qq;
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ QS doInBackground(String[] strArr) throws Throwable {
        if (C0822Kp.A02(this)) {
            return null;
        }
        try {
            return A00(strArr);
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onCancelled() {
        QQ qq = this.A02;
        if (qq != null) {
            qq.ABr();
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(QS qs) throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            A06(qs);
        } catch (Throwable th) {
            if (A06[3].length() != 17) {
                throw new RuntimeException();
            }
            String[] strArr = A06;
            strArr[2] = "KahWFkeddZk466vYoInqTxrEqXEaISmf";
            strArr[2] = "KahWFkeddZk466vYoInqTxrEqXEaISmf";
            C0822Kp.A00(th, this);
        }
    }
}
