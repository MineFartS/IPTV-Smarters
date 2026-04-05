package com.facebook.ads.redexgen.X;

import android.R;
import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.api.BuildConfigApi;
import java.util.Arrays;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.a7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@TargetApi(19)
public final class C1220a7 implements MS {
    public static byte[] A0C;
    public static String[] A0D;
    public static final String A0E;
    public long A00;
    public String A02;
    public String A03;
    public final C04484w A07;
    public final JZ A08;
    public final NU A09;
    public final NV A0A;
    public final C1153Xo A0B;
    public final InterfaceC04464u A06 = new C1230aH(this);
    public boolean A05 = true;
    public long A01 = -1;
    public boolean A04 = true;

    public static String A03(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0C, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A0D;
            if (strArr[1].charAt(18) == strArr[4].charAt(18)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0D;
            strArr2[7] = "WrA4t0RN";
            strArr2[7] = "WrA4t0RN";
            if (i5 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 62);
            i5++;
        }
    }

    public static void A04() {
        A0C = new byte[]{114, -120, -120, -107, -120, -84, -41, -43, -120, -85, -41, -42, -36, -51, -42, -36, -120, -76, -41, -55, -52, -51, -52, -120, -68, -47, -43, -51, -94, -120, -70, -48, -48, -35, -48, -8, DateTimeFieldType.HOUR_OF_DAY, 30, DateTimeFieldType.SECOND_OF_DAY, 28, DateTimeFieldType.SECOND_OF_MINUTE, 34, -48, 4, 25, 29, DateTimeFieldType.SECOND_OF_MINUTE, -22, -48, -98, -76, -76, -63, -76, -32, 3, -11, -8, -76, -38, -3, 2, -3, 7, -4, -76, -24, -3, 1, -7, -50, -76, -101, -79, -79, -66, -79, -35, 0, -14, -11, -79, -28, 5, -14, 3, 5, -79, -27, -6, -2, -10, -53, -79, -57, -35, -35, -22, -35, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 34, 48, 45, 44, 43, 48, 34, -35, 2, 43, 33, -35, DateTimeFieldType.HOUR_OF_DAY, 38, 42, 34, -9, -35, -112, -90, -90, -77, -90, -39, -23, -8, -11, -14, -14, -90, -40, -21, -25, -22, -1, -90, -38, -17, -13, -21, -64, -90, 92, 114, 114, 127, 114, -91, -73, -59, -59, -69, -63, -64, 114, -104, -69, -64, -69, -59, -70, 114, -90, -69, -65, -73, -116, 114, -98, -89, -41, -44, -36, -40, -54, -41, -123, -40, -54, -40, -40, -50, -44, -45, -123, -55, -58, -39, -58, -123, -47, -44, -52, -52, -54, -55, -123, -91, -123, 8, 9, DateTimeFieldType.MILLIS_OF_DAY, 28, 27, -31, 9, DateTimeFieldType.MINUTE_OF_HOUR, 8, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.MINUTE_OF_DAY, DateTimeFieldType.MILLIS_OF_SECOND, 39, 36, 44, 40, 26, 39, 10, 7, 1, -59, -50, -53, -57, -48, -42, -74, -47, -51, -57, -48, -39, -46, -33, -43, -35, -42, -29, -59, -38, -34, -42};
    }

    public static void A05() {
        A0D = new String[]{"VjNTozFJBHBTAbZvfj55MfAwGP9LBSf6", "Pq0aBOwFzXTv3d8c4kUbGJ29Dl7JaeBe", "6Jh9GB1FdSmhvo4jirjJmKwQUVM2B32M", "TGGBgusTs1FvyAgmLwAY3Gsc6eBuJSRW", "x90wDNv6CtBtNBa5WCDyDNAaFj8t5cCY", "GDNjvFSJPJLifqCEdIwxfegvvEeKItWd", "ZGbO0A4ZRQBBFZeQfXm02pkO19XETszh", "zRbEM6nv1u3uOOYe"};
    }

    static {
        A05();
        A04();
        A0E = C1220a7.class.getSimpleName();
    }

    public C1220a7(C04484w c04484w, X2 x2, JZ jz, MR mr) {
        this.A07 = c04484w;
        this.A08 = jz;
        int i2 = (int) (C0856Lz.A01 * 2.0f);
        this.A09 = new NU(x2);
        this.A09.setId(View.generateViewId());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(10);
        this.A09.setListener(new C1226aD(this, c04484w));
        mr.A3L(this.A09, layoutParams);
        this.A0B = new C1153Xo(x2, new C1221a8(this));
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(3, this.A09.getId());
        layoutParams2.addRule(12);
        mr.A3L(this.A0B, layoutParams2);
        this.A0A = new NV(x2, null, R.attr.progressBarStyleHorizontal);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, i2);
        layoutParams3.addRule(3, this.A09.getId());
        this.A0A.setProgress(0);
        mr.A3L(this.A0A, layoutParams3);
        c04484w.A0L(this.A06);
    }

    @Override // com.facebook.ads.redexgen.X.MS
    public final void A7v(Intent intent, Bundle bundle, C04484w c04484w) {
        if (this.A01 < 0) {
            this.A01 = System.currentTimeMillis();
        }
        String strA03 = A03(231, 11, 51);
        String strA032 = A03(220, 11, 36);
        String strA033 = A03(210, 10, 119);
        if (bundle == null) {
            this.A02 = intent.getStringExtra(strA033);
            this.A03 = intent.getStringExtra(strA032);
            String[] strArr = A0D;
            if (strArr[0].charAt(28) != strArr[2].charAt(28)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0D;
            strArr2[5] = "h34ynCyxETZN0C4DuHOjqZ0ETc7IsjOt";
            strArr2[5] = "h34ynCyxETZN0C4DuHOjqZ0ETc7IsjOt";
            this.A00 = intent.getLongExtra(strA03, -1L);
        } else {
            this.A02 = bundle.getString(strA033);
            this.A03 = bundle.getString(strA032);
            this.A00 = bundle.getLong(strA03, -1L);
        }
        String strA034 = this.A02;
        if (strA034 == null) {
            strA034 = A03(199, 11, 105);
        }
        this.A09.setUrl(strA034);
        this.A0B.loadUrl(strA034);
    }

    @Override // com.facebook.ads.redexgen.X.MS
    public final void AAQ(boolean z) {
        this.A0B.onPause();
        if (this.A04) {
            this.A04 = false;
            NY nyA07 = new NX(this.A0B.getFirstUrl()).A01(this.A00).A03(this.A01).A04(this.A0B.getResponseEndMs()).A00(this.A0B.getDomContentLoadedMs()).A05(this.A0B.getScrollReadyMs()).A02(this.A0B.getLoadFinishMs()).A06(System.currentTimeMillis()).A07();
            this.A08.A82(this.A03, nyA07.A02());
            if (BuildConfigApi.isDebug()) {
                String str = A03(169, 30, 39) + System.currentTimeMillis() + A03(DateTimeConstants.HOURS_PER_WEEK, 1, 38) + A03(30, 19, 114) + nyA07.A01 + A03(72, 22, 83) + nyA07.A03 + A03(94, 24, 127) + nyA07.A04 + A03(0, 30, 42) + nyA07.A00 + A03(118, 24, 72) + nyA07.A05 + A03(49, 23, 86) + nyA07.A02 + A03(142, 26, 20) + nyA07.A06;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.MS
    public final void AAn(boolean z) {
        this.A0B.onResume();
    }

    @Override // com.facebook.ads.redexgen.X.MS
    public final void ACj(Bundle bundle) {
        bundle.putString(A03(210, 10, 119), this.A02);
    }

    @Override // com.facebook.ads.redexgen.X.MS
    public final void onDestroy() {
        this.A07.A0M(this.A06);
        C0893Nl.A04(this.A0B);
        this.A0B.destroy();
    }
}
