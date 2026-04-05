package com.facebook.ads.redexgen.X;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import java.util.Arrays;
import org.joda.time.DateTimeFieldType;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class X4 extends O9 {
    public static byte[] A06;
    public static String[] A07;
    public static final int A08;
    public static final int A09;
    public static final int A0A;
    public static final int A0B;
    public static final int A0C;
    public static final int A0D;
    public static final int A0E;
    public static final int A0F;
    public static final int A0G;
    public static final int A0H;
    public I3 A00;

    @Nullable
    public H2 A01;
    public GZ A02;
    public final AnonymousClass16 A03;
    public final AnonymousClass19 A04;
    public final AbstractC0900Ns A05;

    public static String A0K(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 22);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0L() {
        A06 = new byte[]{9, 5, 7, 68, 12, 11, 9, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 8, 5, 5, 1, 68, 11, DateTimeFieldType.HOUR_OF_HALFDAY, 25, 68, 3, 4, 30, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 24, 25, 30, 3, 30, 3, 11, 6, 68, 9, 6, 3, 9, 1, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, DateTimeFieldType.HOUR_OF_HALFDAY, 92, 75, 89, 79, 92, 74, 75, 74, 113, 88, 71, 74, 75, 65};
    }

    public static void A0M() {
        A07 = new String[]{"1qM0UqBuKeNFs4931PZdKXfB5ZchECK5", "3ZSmcCEAG5Dz0dWrJNlp2MNszP7YT25A", "Vrvau7r1HMpQKQXhvyVkTfJZAsfHOW4A", "oVRoE2FdK0le1s2SfNIozg00Kc9sH4MP", "npYoVlwUwM4clRwIxvjz9nauDkw8jySV", "7Yuh663Y", "kkRlGGIMUj7iwn7pYEfT9Vq54HRzcbQk", "UynwTjbvMY6JmtelA"};
    }

    static {
        A0M();
        A0L();
        A0B = (int) (C0856Lz.A01 * 48.0f);
        A0F = (int) (C0856Lz.A01 * 16.0f);
        A08 = (int) (C0856Lz.A01 * 4.0f);
        A0E = (int) (C0856Lz.A01 * 44.0f);
        A0C = (int) (C0856Lz.A01 * 8.0f);
        A0D = (int) (C0856Lz.A01 * 12.0f);
        A0H = (int) (C0856Lz.A01 * 12.0f);
        A0G = (int) (C0856Lz.A01 * 26.0f);
        A09 = C2G.A01(-1, 77);
        A0A = C2G.A01(A09, 90);
    }

    public X4(OD od, boolean z) {
        super(od, z);
        this.A03 = od.A04();
        this.A04 = this.A03.A0M();
        this.A05 = A0J(od);
        MM mmA08 = od.A08();
        if (mmA08 != null) {
            mmA08.setLayoutParams(new RelativeLayout.LayoutParams(-1, mmA08.getToolbarHeight()));
            mmA08.setPageDetailsVisible(false);
        }
    }

    private AbstractC0900Ns A0J(OD od) {
        String strA0K;
        AbstractC0900Ns x5;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        if (od.A04().A0T().equals(A0K(37, 14, 56))) {
            strA0K = PF.A04.A02();
        } else {
            if (A07[3].charAt(14) != '2') {
                throw new RuntimeException();
            }
            String[] strArr = A07;
            strArr[5] = "WUaGuSp4tuIpD6iTfwLrbbBI";
            strArr[5] = "WUaGuSp4tuIpD6iTfwLrbbBI";
            strA0K = A0K(0, 37, 124);
        }
        if (JT.A1K(od.A05())) {
            x5 = new C1234aL(od.A05(), A0B, getColors(), strA0K, od.A06(), od.A09(), od.A0B(), od.A07());
            layoutParams.setMargins(O9.A09, 0, O9.A09, O9.A09);
        } else {
            x5 = new X5(od.A05(), A0B, this.A04.A0F().A00() == C1E.A05, getColors(), strA0K, od.A06(), od.A09(), od.A0B(), od.A07());
            this.A02 = new GZ(x5, 400, 100, 0);
        }
        C0856Lz.A0N(x5);
        x5.A0D(od.A00());
        addView(x5, layoutParams);
        return x5;
    }

    @Override // com.facebook.ads.redexgen.X.O9
    public void A0b(AnonymousClass19 anonymousClass19, String str, double d2, @Nullable Bundle bundle) {
        super.A0b(anonymousClass19, str, d2, bundle);
        this.A05.setInfo(anonymousClass19.A0F(), anonymousClass19.A0G(), str, this.A03.A0O().A01(), null);
    }

    public final int A0e(@Nullable MM mm) {
        return mm == null ? MM.A00 : mm.getToolbarHeight();
    }

    public void A0f() {
        View expandableLayout = getAdDetailsView().getExpandableLayout();
        if (expandableLayout != null) {
            this.A00 = new I3(true);
            H2 h2 = this.A01;
            if (h2 != null) {
                I3 i3 = this.A00;
                if (A07[0].charAt(30) == 'l') {
                    throw new RuntimeException();
                }
                String[] strArr = A07;
                strArr[7] = "KTvg88bTO6HmKn15GgbH1";
                strArr[7] = "KTvg88bTO6HmKn15GgbH1";
                i3.A0J(h2);
            }
            C1H c1hA01 = this.A03.A0L().A01();
            this.A00.A0J(new C0712Gf(getAdDetailsView().getCTAButton(), IjkMediaCodecInfo.RANK_SECURE, -1, c1hA01.A09(true)));
            this.A00.A0J(new H3(getAdDetailsView().getCTAButton(), IjkMediaCodecInfo.RANK_SECURE, C0856Lz.A09(A09, A0A, A08), C0856Lz.A06(c1hA01.A08(true), A08)));
            this.A00.A0J(new H1(expandableLayout, 150, false));
            this.A00.A0I(2300);
        }
    }

    public AnonymousClass16 getAdDataBundle() {
        return this.A03;
    }

    public GZ getAdDetailsAnimation() {
        return this.A02;
    }

    public AbstractC0900Ns getAdDetailsView() {
        return this.A05;
    }

    public AnonymousClass19 getAdInfo() {
        return this.A04;
    }

    public I3 getAnimationPlugin() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.O9, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        getAdDetailsView().A0D(configuration.orientation);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        View expandableLayout = getAdDetailsView().getExpandableLayout();
        if (expandableLayout == null || !z) {
            return;
        }
        H2 h2 = this.A01;
        if (A07[2].charAt(30) != '4') {
            throw new RuntimeException();
        }
        String[] strArr = A07;
        strArr[0] = "AO2Vor543jhYYkt1oYijcT7buZTkR3eI";
        strArr[0] = "AO2Vor543jhYYkt1oYijcT7buZTkR3eI";
        if (h2 == null) {
            this.A01 = new H2(expandableLayout, IjkMediaCodecInfo.RANK_SECURE, expandableLayout.getHeight(), 0);
            this.A00.A0J(this.A01);
            this.A00.A0H();
        }
    }
}
