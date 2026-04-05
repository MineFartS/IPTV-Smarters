package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.joda.time.DateTimeFieldType;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0704Fx implements QW {
    public static byte[] A05;
    public static String[] A06;

    @Nullable
    public JSONObject A00;

    @Nullable
    public JSONObject A01;
    public final QX A03;
    public final List<QY> A04 = new ArrayList();
    public boolean A02 = false;

    static {
        A04();
        A03();
    }

    public static String A02(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 27);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        if (A06[7].length() != 12) {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[3] = "GbTE4j9vTw";
        strArr[3] = "GbTE4j9vTw";
        A05 = new byte[]{58, DateTimeFieldType.HALFDAY_OF_DAY, DateTimeFieldType.MILLIS_OF_DAY, 28, DateTimeFieldType.SECOND_OF_DAY, 29, 88, 93, 11, 88, 28, 25, 12, 25, 88, DateTimeFieldType.HALFDAY_OF_DAY, 8, 28, 25, 12, 29, 66, 114, 82, 82, 88, 28, 25, 12, 25, 88, 82, 82, 114, 93, 11, 114, 82, 82, 88, 30, DateTimeFieldType.HOUR_OF_DAY, DateTimeFieldType.MILLIS_OF_DAY, 31, 29, 10, 8, 10, DateTimeFieldType.HOUR_OF_DAY, DateTimeFieldType.MILLIS_OF_DAY, 12, 88, 82, 82, 114, 93, 11, 89, 110, 117, 127, 119, 126, 59, 115, 122, 104, 59, 117, 116, 59, 125, 114, 117, 124, 126, 105, 107, 105, 114, 117, 111, 32, DateTimeFieldType.MILLIS_OF_SECOND, 12, 6, DateTimeFieldType.HOUR_OF_HALFDAY, 7, 66, 11, DateTimeFieldType.HOUR_OF_DAY, 66, 12, DateTimeFieldType.HALFDAY_OF_DAY, DateTimeFieldType.MILLIS_OF_DAY, 66, DateTimeFieldType.CLOCKHOUR_OF_DAY, 7, 3, 6, 27, 43, 46, 59, 46, 111, 114, 114, 111, 33, 58, 35, 35, 107, 100, 99, 106, 104, 127, 125, 127, 100, 99, 121, 45, 44, 48, 45, 99, 120, 97, 97, 125, 114, 117, 124, 126, 105, 107, 105, 114, 117, 111, 59, 38, 38, 59, 117, 110, 119, 119, 77, 86, 79, 79};
    }

    public static void A04() {
        A06 = new String[]{"yJwczGSbba5UrkwzZOW60Je1LUoZxQIl", "oZp", "SLRT1bjVboXCxkvYGWPu27FVIHxKKecJ", "WHpvXVjPup", BuildConfig.FLAVOR, "gRWAa43vtpEz38T6Kt4HiTmitjJp6SmI", BuildConfig.FLAVOR, "QpBNbg2dQWhW"};
    }

    public C0704Fx(QX qx) {
        this.A03 = qx;
    }

    private boolean A05(@Nullable JSONObject jSONObject, @Nullable JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return false;
        }
        if (jSONObject == null || jSONObject2 == null) {
            return true;
        }
        boolean zA02 = QV.A02(jSONObject, jSONObject2);
        String[] strArr = A06;
        if (strArr[0].charAt(8) != strArr[2].charAt(8)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A06;
        strArr2[4] = BuildConfig.FLAVOR;
        strArr2[6] = BuildConfig.FLAVOR;
        return true ^ zA02;
    }

    public final synchronized boolean A06(JSONObject jSONObject, @Nullable JSONObject jSONObject2) {
        if (jSONObject != null) {
            if (jSONObject2 == null && this.A03.A05()) {
                throw new IllegalArgumentException(A02(132, 19, 0));
            }
            if (jSONObject2 == null || this.A03.A05()) {
                boolean zA05 = A05(this.A00, jSONObject);
                if (A06[7].length() != 12) {
                    throw new RuntimeException();
                }
                String[] strArr = A06;
                strArr[0] = "K9PRKVKMb7VtUCOMkzotPIPCn5fc0ecH";
                strArr[2] = "SxwA2mF5bGI3KXtpcTFDX9Gzp9XH67Wr";
                if (!zA05 && !A05(this.A01, jSONObject2)) {
                    return false;
                }
                this.A00 = jSONObject;
                this.A01 = jSONObject2;
                this.A02 = true;
                for (QY l2 : this.A04) {
                    l2.A3u();
                }
                try {
                    Locale locale = Locale.US;
                    String strA02 = A02(0, 57, 99);
                    Object[] objArr = new Object[3];
                    objArr[0] = this.A03;
                    objArr[1] = this.A00 == null ? A02(151, 4, 56) : this.A00.toString(2);
                    objArr[2] = this.A01 == null ? A02(151, 4, 56) : this.A01.toString(2);
                    String.format(locale, strA02, objArr);
                } catch (JSONException unused) {
                }
                return true;
            }
            throw new IllegalArgumentException(A02(113, 19, 22));
        }
        throw new IllegalArgumentException(A02(101, 12, 84));
    }

    @Override // com.facebook.ads.redexgen.X.QW
    public final synchronized void A3I(QY qy) {
        this.A04.add(qy);
    }

    @Override // com.facebook.ads.redexgen.X.QW
    public final synchronized JSONObject A5z() {
        if (this.A00 != null) {
        } else {
            throw new IllegalStateException(A02(82, 19, 121));
        }
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.QW
    public final synchronized JSONObject A6K() {
        if (this.A03.A05()) {
            if (this.A01 != null) {
            } else {
                throw new IllegalStateException(A02(82, 19, 121));
            }
        } else {
            throw new IllegalStateException(A02(57, 25, 0));
        }
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.QW
    public final QX A6P() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.QW
    public final synchronized boolean A7m() {
        return this.A02;
    }
}
