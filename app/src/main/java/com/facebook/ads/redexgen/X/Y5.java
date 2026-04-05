package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import java.util.Arrays;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class Y5 implements MS {
    public static byte[] A0B;
    public int A00;
    public C7r A01;
    public final X2 A02;
    public final JZ A03;
    public final MR A04;
    public final InterfaceC0873Mr A05;
    public final C0854Lx A06;
    public final KE A0A = new KE() { // from class: com.facebook.ads.redexgen.X.9h
        public static byte[] A01;
        public static String[] A02;

        static {
            A02();
            A01();
        }

        public static String A00(int i2, int i3, int i4) {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
            int i5 = 0;
            while (true) {
                int length = bArrCopyOfRange.length;
                if (A02[1].charAt(16) != 'Y') {
                    throw new RuntimeException();
                }
                String[] strArr = A02;
                strArr[7] = "MNhPeHQbaIIJpJ20hNozP";
                strArr[2] = BuildConfig.FLAVOR;
                if (i5 >= length) {
                    return new String(bArrCopyOfRange);
                }
                bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 60);
                i5++;
            }
        }

        public static void A01() {
            A01 = new byte[]{35, DateTimeFieldType.MILLIS_OF_DAY, DateTimeFieldType.HOUR_OF_DAY, DateTimeFieldType.MINUTE_OF_DAY, 28, -10, 27, 33, DateTimeFieldType.MINUTE_OF_DAY, 31, 32, 33, DateTimeFieldType.MILLIS_OF_DAY, 33, DateTimeFieldType.HOUR_OF_HALFDAY, 25, -14, 35, DateTimeFieldType.MINUTE_OF_DAY, 27, 33};
        }

        public static void A02() {
            A02 = new String[]{"AyjpfVMH4abbuU", "C4f54F5689i8nguXYuZVyawidNrV99tP", BuildConfig.FLAVOR, "kvcj7JPhLleA0fC5", "qT9ER7mxQyIS", "DVCseFxiIzNfwa", "yADVvB6XdmuuqrvB", "b9AAn0hyeOBCYK5qzyR18"};
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.X.C9F
        /* JADX INFO: renamed from: A03, reason: merged with bridge method [inline-methods] */
        public final void A04(KJ kj) {
            this.A00.A04.A3t(A00(0, 21, 113), kj);
        }
    };
    public final KK A09 = new KK() { // from class: com.facebook.ads.redexgen.X.9g
        public static byte[] A01;

        static {
            A01();
        }

        public static String A00(int i2, int i3, int i4) {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
            for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
                bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 63);
            }
            return new String(bArrCopyOfRange);
        }

        public static void A01() {
            A01 = new byte[]{72, 87, 90, 91, 81, 119, 80, 74, 91, 76, 77, 74, 87, 74, 95, 82, 123, 72, 91, 80, 74};
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.X.C9F
        /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
        public final void A04(C05137o c05137o) {
            this.A00.A04.A3t(A00(0, 21, 1), c05137o);
        }
    };
    public final KQ A07 = new KQ() { // from class: com.facebook.ads.redexgen.X.9f
        public static byte[] A01;
        public static String[] A02;

        static {
            A02();
            A01();
        }

        public static String A00(int i2, int i3, int i4) {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
            for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
                bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 86);
            }
            return new String(bArrCopyOfRange);
        }

        public static void A01() {
            byte[] bArr = {DateTimeFieldType.HOUR_OF_DAY, 4, -1, 0, 10, -28, 9, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 0, DateTimeFieldType.HALFDAY_OF_DAY, DateTimeFieldType.HOUR_OF_HALFDAY, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 4, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, -4, 7, -32, DateTimeFieldType.HOUR_OF_DAY, 0, 9, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY};
            String[] strArr = A02;
            if (strArr[6].charAt(4) != strArr[3].charAt(4)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[2] = "e0kN46odqljBIthjpUkTXG9hdDsWHsKW";
            strArr2[2] = "e0kN46odqljBIthjpUkTXG9hdDsWHsKW";
            A01 = bArr;
        }

        public static void A02() {
            A02 = new String[]{"OtZHHid0c6Ryk9CDDBq47ngXcNldIUWH", "JwrlVwQ54E2WwwQvkywQUOYHwL6g1bho", "WFiM5IPZvaQ4xMZm5xgvQ3FNROoMY2Kr", "al6ZIECO6LO12zMiuvYELaWNpYKDhozx", "wYAPbQwhGVteNN6MGdL8gA6824n9AnKf", "jTihIhEYsz4XSFMEjn7OlZEBUOzI3KNS", "mXaQIkSzTCVxPQuz9HLogqhmhIjgMyMR", "pEgzTi4rZbqmTwficQat67UuNHBZNbaD"};
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.X.C9F
        /* JADX INFO: renamed from: A03, reason: merged with bridge method [inline-methods] */
        public final void A04(C7q c7q) {
            this.A00.A04.A3t(A00(0, 21, 69), c7q);
        }
    };
    public final KO A08 = new KO() { // from class: com.facebook.ads.redexgen.X.9e
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.X.C9F
        /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A04(KP kp) {
            this.A00.A05.A9g();
        }
    };

    static {
        A03();
    }

    public static String A02(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0B, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 38);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A0B = new byte[]{-49, -29, -30, -35, -34, -38, -49, -25, -17, -8, -11, -15, -6, 0, -32, -5, -9, -15, -6, -68, -70, -84, -107, -88, -69, -80, -67, -84, -118, -69, -88, -119, -68, -69, -69, -74, -75, -73, -86, -91, -90, -80, -118, -81, -75, -90, -77, -76, -75, -86, -75, -94, -83, -122, -73, -90, -81, -75, -99, -112, -117, -116, -106, 115, -106, -114, -114, -116, -103, -2, -15, -20, -19, -9, -43, -40, -52, 24, 11, 6, 7, DateTimeFieldType.HOUR_OF_DAY, -11, 7, 7, DateTimeFieldType.HALFDAY_OF_DAY, -10, 11, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 7, -66, -79, -84, -83, -73, -99, -102, -108};
    }

    public Y5(X2 x2, InterfaceC0873Mr interfaceC0873Mr, JZ jz, MR mr) {
        this.A02 = x2;
        this.A03 = jz;
        this.A05 = interfaceC0873Mr;
        this.A06 = new C0854Lx(x2);
        this.A06.A0Z(new C05047d(x2));
        this.A06.getEventBus().A04(this.A0A, this.A09, this.A07, this.A08);
        this.A04 = mr;
        this.A06.setIsFullScreen(true);
        this.A06.setVolume(1.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(15);
        mr.A3L(this.A06, layoutParams);
        MU mu = new MU(x2);
        mu.setOnClickListener(new ViewOnClickListenerC0871Mp(this));
        mr.A3L(mu, mu.getDefaultLayoutParams());
    }

    public final void A04(int i2) {
        this.A06.setVideoProgressReportIntervalMs(i2);
    }

    public final void A05(View view) {
        this.A06.setControlsAnchorView(view);
    }

    @Override // com.facebook.ads.redexgen.X.MS
    public final void A7v(Intent intent, Bundle bundle, C04484w c04484w) {
        String stringExtra = intent.getStringExtra(A02(19, 18, 33));
        if (stringExtra != null && !stringExtra.isEmpty()) {
            C0917Oj c0917Oj = new C0917Oj(this.A02, stringExtra);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            int i2 = (int) (16.0f * C0856Lz.A01);
            layoutParams.setMargins(i2, i2, i2, i2);
            layoutParams.addRule(10);
            layoutParams.addRule(9);
            c0917Oj.setOnClickListener(new ViewOnClickListenerC0872Mq(this));
            this.A04.A3L(c0917Oj, layoutParams);
        }
        this.A00 = intent.getIntExtra(A02(77, 13, 124), 0);
        this.A01 = new C7r(this.A02, this.A03, this.A06, intent.getStringExtra(A02(8, 11, 102)), intent.getBundleExtra(A02(58, 11, 1)));
        this.A06.setVideoMPD(intent.getStringExtra(A02(69, 8, 98)));
        this.A06.setVideoURI(intent.getStringExtra(A02(90, 8, 34)));
        int i3 = this.A00;
        if (i3 > 0) {
            this.A06.A0V(i3);
        }
        if (intent.getBooleanExtra(A02(0, 8, 72), false)) {
            this.A06.A0Y(PD.A05, 17);
        }
    }

    @Override // com.facebook.ads.redexgen.X.MS
    public final void AAQ(boolean z) {
        this.A04.A3t(A02(37, 21, 27), new KN());
        this.A06.A0T();
    }

    @Override // com.facebook.ads.redexgen.X.MS
    public final void AAn(boolean z) {
        this.A04.A3t(A02(37, 21, 27), new KM());
        this.A06.A0Y(PD.A05, 18);
    }

    @Override // com.facebook.ads.redexgen.X.MS
    public final void ACj(Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.X.MS
    public final void onDestroy() {
        this.A04.A3t(A02(37, 21, 27), new C0774Ir(this.A00, this.A06.getCurrentPositionInMillis()));
        this.A01.A0e(this.A06.getCurrentPositionInMillis());
        this.A06.A0W(1);
        this.A06.A0S();
    }
}
