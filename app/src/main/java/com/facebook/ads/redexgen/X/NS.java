package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class NS implements View.OnClickListener {
    public static byte[] A02;
    public static String[] A03;
    public final /* synthetic */ X2 A00;
    public final /* synthetic */ NU A01;

    static {
        A02();
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            byte b2 = (byte) ((bArrCopyOfRange[i5] - i4) - 42);
            if (A03[7].length() == 6) {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[0] = "PWnwmSQeuTDG1VW6irl4bK69meobJxc3";
            strArr[0] = "PWnwmSQeuTDG1VW6irl4bK69meobJxc3";
            bArrCopyOfRange[i5] = b2;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-43, -42, -29, -23, -24, -82, -42, -32, -43, -30, -33, 8, DateTimeFieldType.SECOND_OF_MINUTE, 11, 25, DateTimeFieldType.MILLIS_OF_DAY, DateTimeFieldType.CLOCKHOUR_OF_DAY, 11, -43, DateTimeFieldType.CLOCKHOUR_OF_DAY, DateTimeFieldType.SECOND_OF_MINUTE, 27, 12, DateTimeFieldType.SECOND_OF_MINUTE, 27, -43, 8, 10, 27, DateTimeFieldType.CLOCKHOUR_OF_DAY, DateTimeFieldType.MILLIS_OF_DAY, DateTimeFieldType.SECOND_OF_MINUTE, -43, -3, -16, -20, -2};
    }

    public static void A02() {
        A03 = new String[]{"vt9IBcWTOr7JWOQj52cGIx3Fb8444AVz", "iaODdCdac2HdoVtHZ9a1KA8cNhJnLj6B", "L", "A4NmupT0027YOOHOGvpFNaMrtY8CJ39o", "W8A11ysplhfn90w2DVqRYjP8EH85", "7B8SgIwzRaqe9uXFtFM8FwB70mlJ", "6", "T7zuxnYUsN1JBNG7ZH"};
    }

    public NS(NU nu, X2 x2) {
        this.A01 = nu;
        this.A00 = x2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            if (!TextUtils.isEmpty(this.A01.A04) && !A00(0, 11, 74).equals(this.A01.A04)) {
                Intent intent = new Intent(A00(11, 26, 125), Uri.parse(this.A01.A04));
                intent.addFlags(268435456);
                LB.A0C(this.A00, intent);
            }
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
            String[] strArr = A03;
            if (strArr[5].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[7] = "plh44Um";
            strArr2[7] = "plh44Um";
        }
    }
}
