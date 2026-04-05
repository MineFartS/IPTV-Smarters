package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class XH extends AbstractRunnableC0829Kx {
    public static byte[] A05;
    public final /* synthetic */ int A00;
    public final /* synthetic */ C8C A01;
    public final /* synthetic */ C8W A02;
    public final /* synthetic */ C05238e A03;
    public final /* synthetic */ String A04;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 120);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{-37, -3, 30, 27, 46, 32, -39, 28, 43, 26, 44, 33, -39, 27, 30, 28, 26, 46, 44, 30, -39, 44, -2, 39, 47, 34, 43, 40, 39, 38, 30, 39, 45, -3, 26, 45, 26, 9, 43, 40, 47, 34, 29, 30, 43, -39, 39, 40, 45, -39, 34, 39, 35, 30, 28, 45, 30, 29, -46, -24, -19, -22, -97, -24, -14, -97, -19, -12, -21, -21, -96, 30, 33, 33, 38, 49, 38, 44, 43, 30, 41, 28, 38, 43, 35, 44, 45, 66, 45, 53, 56, 45, 46, 56, 49, 43, 48, 53, 63, 55, 43, 63, 60, 45, 47, 49, 62, 60, 62, 67, 64, 104, 91, 89, 101, 104, 90, 85, 90, 87, 106, 87, 88, 87, 105, 91, -18, -31, -19, -15, -31, -17, -16, -37, -27, -32, 44, 46, 27, 45, 50, 41, 30, 49, 51, 32, 50, 55, 46, 35, 29, 33, 45, 34, 35};
    }

    public XH(C8C c8c, String str, int i2, C05238e c05238e, C8W c8w) {
        this.A01 = c8c;
        this.A04 = str;
        this.A00 = i2;
        this.A03 = c05238e;
        this.A02 = c8w;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0829Kx
    public final void A07() {
        String stackTrace;
        Map<String, String> mapA4T;
        String strA6U;
        try {
            if (C8X.A0J(this.A01, this.A04, this.A00, this.A03)) {
                return;
            }
            C0792Jj.A06(this.A01, EnumC0784Jb.A0A.toString() + A00(0, 1, 41) + this.A04);
            Throwable cause = this.A03.getCause();
            if (cause != null) {
                stackTrace = C0839Li.A03(this.A01, cause);
            } else if (JU.A0S(this.A01)) {
                stackTrace = C0839Li.A03(this.A01, this.A03);
            } else {
                stackTrace = A00(0, 0, 106) + this.A03.getMessage();
            }
            if (JU.A0V(this.A01)) {
                mapA4T = this.A01.A02().A4T();
            } else if (this.A02 != null) {
                mapA4T = this.A02.A6C();
            } else if (C8X.A02) {
                String message = A00(1, 57, 65);
                C8X.A0G(new RuntimeException(message, this.A03));
                mapA4T = new HashMap<>();
            } else {
                mapA4T = this.A01.A02().A4T();
            }
            mapA4T.put(A00(136, 7, 65), this.A04);
            mapA4T.put(A00(143, 12, 70), String.valueOf(this.A00));
            JSONObject jSONObjectA02 = this.A03.A02();
            if (jSONObjectA02 != null) {
                mapA4T.put(A00(71, 15, 69), jSONObjectA02.toString());
            }
            if ((A00(106, 5, 99).equals(this.A04) || A00(111, 15, 126).equals(this.A04)) && (strA6U = this.A01.A02().A6U()) != null) {
                mapA4T.put(A00(86, 20, 84), strA6U);
            }
            String strA07 = this.A01.A07();
            if (strA07 != null && !TextUtils.isEmpty(strA07)) {
                mapA4T.put(A00(126, 10, 4), strA07);
            }
            C8V c8v = (C8V) C8X.A0A.get();
            if (c8v == null) {
                C8X.A0G(new RuntimeException(A00(58, 13, 7)));
            } else {
                c8v.ADx(stackTrace, mapA4T, this.A01);
            }
        } catch (Throwable th) {
            C8X.A0G(th);
        }
    }
}
