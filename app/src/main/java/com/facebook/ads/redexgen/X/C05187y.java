package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.view.ToolbarActionView$ToolbarActionMode;
import com.facebook.proguard.annotations.DoNotStrip;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C05187y extends AbstractC1212Zy {
    public static byte[] A0E;
    public static String[] A0F;
    public static final int A0G;
    public static final int A0H;
    public static final int A0I;
    public static final int A0J;
    public static final int A0K;
    public int A00;
    public int A01;

    @Nullable
    public LinearLayout A02;
    public C0996Rl A03;
    public C7C A04;

    @Nullable
    public C2R A05;

    @Nullable
    public C0907Nz A06;
    public PI A07;

    @DoNotStrip
    public Q1 A08;
    public Q2 A09;
    public String A0A;
    public List<C0919Ol> A0B;
    public final X2 A0C;
    public final C0849Ls A0D;

    public static String A08(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0E, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A0F;
            if (strArr[0].charAt(22) != strArr[6].charAt(22)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0F;
            strArr2[5] = "I427OJiZERIl1pgFYs7VIJxgJMuHqTWY";
            strArr2[4] = "m1VK8a3APoHjuOOKlTc7gi9yCeUy6Tbh";
            if (i5 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 74);
            i5++;
        }
    }

    public static void A0A() {
        A0E = new byte[]{118, 115, 72, 115, 118, 99, 118, 72, 117, 98, 121, 115, 123, 114};
    }

    public static void A0B() {
        A0F = new String[]{"hEO5MspmmQwWZDjfO9hYkGtE8t8ljCUN", "895GOd6GqHS2SDNwtQvAqIE", "zBXblOu1CdgXx49mdyV8flA", "GxqIbNjcrUQMSJiuMkyJv1mwkudVYaGP", "be3ZgXhlaup3yXbKLr41yKjcTusIQNjx", "HLi8FTj59ZkYUe8FmXrpO0CEflvtIm0o", "7bereGXxKpIS6kk2UNHV0kt11i4QSfeP", "LRvrjmvhZNKPrr4qRukG9JYrfPQqD7wd"};
    }

    static {
        A0B();
        A0A();
        A0G = (int) (C0856Lz.A01 * 48.0f);
        A0H = (int) (C0856Lz.A01 * 8.0f);
        A0I = (int) (C0856Lz.A01 * 8.0f);
        A0K = (int) (C0856Lz.A01 * 56.0f);
        A0J = (int) (C0856Lz.A01 * 12.0f);
    }

    public C05187y(X2 x2, JZ jz, C7C c7c, MR mr, C0996Rl c0996Rl) {
        super(x2, jz, mr, c0996Rl);
        this.A0D = new C0849Ls();
        this.A04 = c7c;
        this.A0C = x2;
    }

    private final void A0C() {
        LinearLayout linearLayout = this.A02;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            this.A02 = null;
        }
        C2R c2r = this.A05;
        if (c2r != null) {
            c2r.removeAllViews();
            this.A05 = null;
        }
        C0907Nz c0907Nz = this.A06;
        if (c0907Nz != null) {
            c0907Nz.removeAllViews();
            this.A06 = null;
        }
    }

    private final void A0D(int i2, @Nullable Bundle bundle) {
        int childSpacing;
        int i3;
        int i4;
        C05187y c05187y;
        this.A02 = new LinearLayout(getContext());
        if (i2 == 1) {
            this.A02.setGravity(17);
        } else {
            this.A02.setGravity(48);
        }
        this.A02.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.A02.setOrientation(1);
        int i5 = C0856Lz.A02.widthPixels;
        int childSpacing2 = C0856Lz.A02.heightPixels;
        if (i2 == 1) {
            int width = A0H;
            int i6 = i5 - (width * 4);
            int width2 = childSpacing2 / 2;
            childSpacing = Math.min(i6, width2);
            i3 = (i5 - childSpacing) / 8;
            i4 = i3 * 4;
        } else {
            int height = A0K;
            int width3 = A0G;
            int height2 = height + width3;
            int width4 = A0H;
            childSpacing = childSpacing2 - (height2 + (width4 * 4));
            i3 = A0H;
            i4 = i3 * 2;
        }
        this.A08 = new PG(this);
        this.A09 = new Q2(this, 1, new WeakReference(this.A08), this.A0C);
        Q2 q2 = this.A09;
        int extraSpacing = this.A00;
        q2.A0Y(extraSpacing);
        Q2 q22 = this.A09;
        int extraSpacing2 = this.A01;
        q22.A0Z(extraSpacing2);
        this.A05 = new C2R(this.A0C);
        this.A05.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        this.A07 = new PI(this.A05, i2, this.A0B, this.A09, bundle);
        this.A05.setAdapter(new PH(this.A0C, this.A0B, this.A03, super.A0A, this.A04, this.A09, this.A0D, getAudienceNetworkListener(), this.A0A, childSpacing, i3, i4, i2, this.A07));
        if (i2 == 1) {
            c05187y = this;
            c05187y.A0F(c05187y.A07);
        } else {
            c05187y = this;
        }
        LinearLayout linearLayout = c05187y.A02;
        C2R c2r = c05187y.A05;
        if (A0F[7].charAt(26) == 'a') {
            throw new RuntimeException();
        }
        String[] strArr = A0F;
        strArr[0] = "pS0yYjaDPNGuTrfnUmeGhxtdEtLadoEJ";
        strArr[6] = "mwC7eMAbLdHre0yQkkMBVztsNAF33a9m";
        linearLayout.addView(c2r);
        C0907Nz c0907Nz = c05187y.A06;
        if (c0907Nz != null) {
            LinearLayout linearLayout2 = c05187y.A02;
            String[] strArr2 = A0F;
            String str = strArr2[5];
            String str2 = strArr2[4];
            int iCharAt = str.charAt(16);
            int width5 = str2.charAt(16);
            if (iCharAt == width5) {
                throw new RuntimeException();
            }
            String[] strArr3 = A0F;
            strArr3[3] = "7ZjVpxQcOo2BFfYt51qxyVC8jdlns0bj";
            strArr3[3] = "7ZjVpxQcOo2BFfYt51qxyVC8jdlns0bj";
            linearLayout2.addView(c0907Nz);
        }
        c05187y.A0R(c05187y.A02, false, i2);
        String[] strArr4 = A0F;
        String str3 = strArr4[0];
        String str4 = strArr4[6];
        int iCharAt2 = str3.charAt(22);
        int width6 = str4.charAt(22);
        if (iCharAt2 != width6) {
            return;
        }
        String[] strArr5 = A0F;
        strArr5[3] = "nKvQ299cRrmi8SltfoUYXILZ1CbfqCSq";
        strArr5[3] = "nKvQ299cRrmi8SltfoUYXILZ1CbfqCSq";
    }

    private void A0E(C0996Rl c0996Rl) {
        this.A03 = c0996Rl;
        this.A0A = this.A03.A0Q();
        this.A00 = this.A03.A0G();
        this.A01 = this.A03.A0H();
        List<AnonymousClass19> listA0W = this.A03.A0W();
        this.A0B = new ArrayList(listA0W.size());
        for (int i2 = 0; i2 < listA0W.size(); i2++) {
            this.A0B.add(new C0919Ol(i2, listA0W.size(), listA0W.get(i2)));
        }
    }

    private void A0F(PI pi) {
        new C0663Ee().A0I(this.A05);
        pi.A0d(new P6(this));
        this.A06 = new C0907Nz(this.A0C, super.A05.A01(), this.A0B.size());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, A0I);
        layoutParams.setMargins(0, A0J, 0, 0);
        this.A06.setLayoutParams(layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1212Zy
    public final boolean A0X() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.MS
    public final void A7v(Intent intent, Bundle bundle, C04484w c04484w) {
        C0996Rl c0996Rl = (C0996Rl) intent.getSerializableExtra(A08(0, 14, 93));
        super.A0S(c04484w);
        A0E(c0996Rl);
        A0D(c04484w.A0I().getResources().getConfiguration().orientation, bundle);
        c04484w.A0L(new P2(this, c04484w));
        int iA03 = super.A08.A0M().A0E().A03();
        if (iA03 > 0) {
            A0Q(iA03);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1212Zy, com.facebook.ads.redexgen.X.MS
    public final void AAQ(boolean z) {
        super.AAQ(z);
        PI pi = this.A07;
        if (pi != null) {
            pi.A0a();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1212Zy, com.facebook.ads.redexgen.X.MS
    public final void AAn(boolean z) {
        super.AAn(z);
        this.A07.A0b();
    }

    @Override // com.facebook.ads.redexgen.X.MS
    public final void ACj(Bundle bundle) {
        PI pi = this.A07;
        if (pi != null) {
            pi.A0c(bundle);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1212Zy
    @ToolbarActionView$ToolbarActionMode
    public int getCloseButtonStyle() {
        return 0;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        Bundle bundle = new Bundle();
        ACj(bundle);
        A0C();
        A0D(configuration.orientation, bundle);
        super.onConfigurationChanged(configuration);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1212Zy, com.facebook.ads.redexgen.X.MS
    public final void onDestroy() {
        super.onDestroy();
        if (!TextUtils.isEmpty(this.A0A)) {
            super.A0A.A84(this.A0A, new C0897Np().A04(this.A09).A03(this.A0D).A06());
        }
        A0C();
        this.A09.A0X();
        this.A09 = null;
        this.A08 = null;
        this.A0B = null;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.A0D.A07(motionEvent, this, this);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
