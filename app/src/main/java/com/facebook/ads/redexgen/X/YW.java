package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.facebook.ads.AdError;
import com.facebook.ads.internal.view.FullScreenAdToolbar;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: assets/audience_network.dex */
@SuppressLint({"ViewConstructor"})
@TargetApi(16)
public final class YW extends RelativeLayout implements MS {
    public static byte[] A0Q;
    public static String[] A0R;
    public static final int A0S;
    public static final int A0T;
    public static final int A0U;
    public static final int A0V;
    public static final int A0W;
    public static final int A0X;
    public static final int A0Y;
    public static final int A0Z;
    public static final int A0a;
    public static final RelativeLayout.LayoutParams A0b;

    @Nullable
    public View A00;

    @Nullable
    public RelativeLayout A01;

    @Nullable
    public RelativeLayout A02;
    public Toast A03;

    @Nullable
    public C04484w A04;

    @Nullable
    public XD A05;
    public Ot A06;
    public boolean A07;
    public boolean A08;
    public final AnonymousClass16 A09;
    public final C1S A0A;
    public final InterfaceC04464u A0B;
    public final X2 A0C;
    public final JZ A0D;
    public final C0789Jg A0E;
    public final LP A0F;
    public final ViewOnSystemUiVisibilityChangeListenerC0844Ln A0G;
    public final MR A0H;
    public final InterfaceC0878Mw A0I;
    public final C0931Oy A0J;
    public final C0932Oz A0K;
    public final AtomicBoolean A0L;
    public final AtomicBoolean A0M;
    public final boolean A0N;
    public final boolean A0O;

    @VisibleForTesting
    public final MM A0P;

    public static String A0C(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0Q, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 40);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0M() {
        A0Q = new byte[]{-110, -97, -94, -70, -84, -86, -70, -92, 4, DateTimeFieldType.HALFDAY_OF_DAY, 10, 4, 12, 0, DateTimeFieldType.CLOCKHOUR_OF_DAY, DateTimeFieldType.MINUTE_OF_HOUR, 10, 8, 10, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, -77, -65, -67, 126, -74, -79, -77, -75, -78, -65, -65, -69, 126, -79, -76, -61, 126, -71, -66, -60, -75, -62, -61, -60, -71, -60, -71, -79, -68, 126, -77, -68, -71, -77, -69, -75, -76, -11, -6, 0, -15, -2, -1, 0, -11, 0, -11, -19, -8, -55, -68, -49, -60, -47, -64, -70, -66, -57, -60, -66, -58, -43, -47, -58, -56, -54, -46, -54, -45, -39, -65, -78, -60, -82, -65, -79, -78, -79, -84, -61, -74, -79, -78, -68, -80, -98, -101, -81, -94, -98, -80, -104, -100, -91, -94, -100, -92};
    }

    public static void A0N() {
        A0R = new String[]{"57rzzR6raHrat8cHk0n2c9utIvWN6OL8", "vZo4DQACnHxpUIABCEPhLIrXR", "3pKkUgRnbq5D8", "3oPHUcYdGBLGT6sjvwgTS6nCZs8dHXKK", "yMOWmEDq6oq3Yf8aoY", "BRjJ0geTmUVj6Aeo1VqVThKYcHpwhF7A", "bCnfD5Zsza6fNT9UI62TNCVdI9Gt63Qd", "0XbQU4AacrxlEwxF12eBigHvJ8"};
    }

    static {
        A0N();
        A0M();
        A0Z = (int) (C0856Lz.A01 * 64.0f);
        A0U = (int) (C0856Lz.A01 * 16.0f);
        A0a = (int) (C0856Lz.A01 * 12.0f);
        A0S = (int) (C0856Lz.A01 * 10.0f);
        A0b = new RelativeLayout.LayoutParams(-1, -1);
        A0V = (int) (C0856Lz.A01 * 48.0f);
        A0W = (int) (C0856Lz.A01 * 16.0f);
        A0Y = (int) (C0856Lz.A01 * 14.0f);
        A0X = C2G.A01(-1, 77);
        A0T = (int) (C0856Lz.A01 * 8.0f);
    }

    public YW(X2 x2, JZ jz, MR mr, AnonymousClass16 anonymousClass16, @Nullable String str, InterfaceC0878Mw interfaceC0878Mw) {
        super(x2);
        this.A0B = new C1207Zt(this);
        this.A0M = new AtomicBoolean(false);
        this.A0L = new AtomicBoolean(false);
        this.A0C = x2;
        this.A0H = mr;
        this.A0D = jz;
        this.A09 = anonymousClass16;
        this.A0A = anonymousClass16.A0M().A0E().A06();
        this.A0E = new C0789Jg(this.A09.A0Q(), this.A0D);
        this.A0I = interfaceC0878Mw;
        this.A0K = new C0932Oz(x2, this.A0I, str, this.A0H);
        this.A0M.set(!this.A0A.A0I());
        this.A0F = new LP(this.A0A.A08(), new C1197Zg(this, null));
        this.A0O = JT.A1e(this.A0C);
        this.A0N = JT.A0f(this.A0C);
        this.A0P = A05();
        this.A0J = new C0931Oy(this.A0C, this.A0D, this.A09);
        if (this.A0O) {
            O7.A00(x2, this, anonymousClass16.A0M().A0E().A07());
        } else {
            C0856Lz.A0P(this, -14473425);
        }
        this.A0G = new ViewOnSystemUiVisibilityChangeListenerC0844Ln(this);
        this.A0G.A05(EnumC0843Lm.A03);
    }

    private MM A05() {
        FullScreenAdToolbar fullScreenAdToolbar = new FullScreenAdToolbar(this.A0C, this.A0H, this.A0E, 0, this.A09.A0E());
        fullScreenAdToolbar.A05(this.A09.A0L().A01(), true);
        fullScreenAdToolbar.setPageDetailsVisible(false);
        fullScreenAdToolbar.setPageDetails(this.A09.A0O(), this.A09.A0Q(), this.A0A.A08(), this.A09.A0P());
        fullScreenAdToolbar.setToolbarListener(new C1203Zp(this));
        return fullScreenAdToolbar;
    }

    @Nullable
    private XD A08() {
        Ot ot = this.A06;
        if (ot == null || ot.getViewabilityChecker() == null || this.A06.getTouchDataRecorder() == null) {
            return null;
        }
        C1H c1hA01 = this.A09.A0L().A01();
        XD xd = new XD(this.A0C, A0C(20, 37, 40), c1hA01, this.A0D, this.A0H, this.A06.getViewabilityChecker(), this.A06.getTouchDataRecorder());
        C0856Lz.A0N(xd);
        xd.setText(this.A09.A0M().A0G().A03());
        xd.setTextSize(14.0f);
        xd.setIncludeFontPadding(false);
        int i2 = A0S;
        xd.setPadding(i2, i2, i2, i2);
        if (!this.A0O) {
            C0856Lz.A0Q(xd, 8);
        }
        xd.setOnClickListener(new ViewOnClickListenerC0859Mc(this));
        return xd;
    }

    private O6 A0A() {
        O6 o6 = new O6(this.A0C, this.A09.A0L().A01(), true, 16, 14, 0);
        o6.A02(this.A09.A0M().A0F().A06(), this.A09.A0M().A0F().A05(), null, false, true);
        TextView descriptionTextView = o6.getDescriptionTextView();
        descriptionTextView.setAlpha(0.8f);
        descriptionTextView.setMaxLines(1);
        descriptionTextView.setEllipsize(TextUtils.TruncateAt.END);
        TextView titleTextView = o6.getTitleTextView();
        titleTextView.setMaxLines(1);
        titleTextView.setEllipsize(TextUtils.TruncateAt.END);
        return o6;
    }

    private void A0F() {
        int i2 = A0V;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i2, i2);
        layoutParams.addRule(15);
        layoutParams.addRule(9);
        O0 o0 = new O0(this.A0C);
        C0856Lz.A0P(o0, 0);
        C0856Lz.A0N(o0);
        XE xe = new XE(o0, this.A0C);
        int i3 = A0V;
        xe.A06(i3, i3).A08(this.A09.A0O().A01());
        TextView textView = new TextView(this.A0C);
        C0856Lz.A0N(textView);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textView.setTextColor(this.A09.A0L().A01().A06(true));
        textView.setText(this.A09.A0M().A0F().A06());
        textView.setTextSize(16.0f);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        O2 o2 = new O2(this.A0C, A0Y, 5, A0X, -1);
        o2.setGravity(16);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -1);
        TextView textView2 = new TextView(this.A0C);
        textView2.setTextColor(this.A09.A0L().A01().A06(true));
        textView2.setGravity(16);
        textView2.setIncludeFontPadding(false);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -1);
        layoutParams3.leftMargin = A0T;
        LinearLayout linearLayout = new LinearLayout(this.A0C);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, A0W);
        layoutParams4.topMargin = A0T / 2;
        layoutParams4.addRule(3, textView.getId());
        linearLayout.addView(o2, layoutParams2);
        linearLayout.addView(textView2, layoutParams3);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams5.leftMargin = A0T;
        layoutParams5.addRule(1, o0.getId());
        layoutParams5.addRule(15);
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        relativeLayout.addView(linearLayout, layoutParams4);
        relativeLayout.addView(textView);
        RelativeLayout relativeLayout2 = this.A02;
        if (relativeLayout2 != null) {
            relativeLayout2.removeAllViews();
            RelativeLayout relativeLayout3 = this.A02;
            if (A0R[4].length() != 18) {
                throw new RuntimeException();
            }
            String[] strArr = A0R;
            strArr[4] = "bsFsSO04IJ4eZVQxRT";
            strArr[4] = "bsFsSO04IJ4eZVQxRT";
            relativeLayout3.addView(relativeLayout, layoutParams5);
            this.A02.addView(o0, layoutParams);
        }
        if (TextUtils.isEmpty(this.A09.A0M().A0F().A03())) {
            linearLayout.setVisibility(8);
            return;
        }
        linearLayout.setVisibility(0);
        o2.setRating(Float.parseFloat(this.A09.A0M().A0F().A03()));
        if (this.A09.A0M().A0F().A02() == null) {
            return;
        }
        textView2.setText(A0C(0, 1, 66) + NumberFormat.getNumberInstance().format(Integer.parseInt(this.A09.A0M().A0F().A02())) + A0C(1, 1, 78));
    }

    private void A0G() {
        if (this.A0A.A0I()) {
            A0I();
        } else {
            A0J();
        }
        if (Build.VERSION.SDK_INT >= 19) {
            this.A0G.A05(EnumC0843Lm.A04);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0H() {
        this.A08 = true;
        if (this.A09.A0M().A0L()) {
            this.A0K.A06();
            this.A0H.A3t(this.A0I.A5G(), new C7q(0, 0));
            if (this.A07) {
                boolean z = this.A0O;
                if (A0R[4].length() != 18) {
                    throw new RuntimeException();
                }
                String[] strArr = A0R;
                strArr[1] = "I0JtICznoezMzS0InHXj65Cim";
                strArr[2] = "YxqOCBuXvZfwM";
                if (!z) {
                    C0904Nw.A03(this.A0C, this.A06.getViewabilityChecker(), this.A06.getTouchDataRecorder(), this.A0D, this.A09.A0M().A0G(), this.A09.A0Q());
                }
            }
        }
    }

    private void A0I() {
        C0910Oc c0910OcA0B = new C0908Oa(this.A0C, this.A09.A0M().A0F(), this.A09.A0O()).A08(this.A09.A0L().A01()).A0A(this.A0A.A0G()).A09(this.A0A.A0E()).A07(AdError.SERVER_ERROR_CODE).A0B();
        C0791Ji.A04(c0910OcA0B, this.A0E, EnumC0788Jf.A0U);
        addView(c0910OcA0B, A0b);
        c0910OcA0B.A04(new C1204Zq(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0J() {
        C0856Lz.A0X(this);
        this.A06.A0C();
        this.A05 = A08();
        this.A01 = new RelativeLayout(getContext());
        C0856Lz.A0N(this.A01);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        int i2 = A0U;
        int i3 = A0a;
        layoutParams.setMargins(i2, i3, i2, i3);
        layoutParams.addRule(12);
        this.A02 = new RelativeLayout(getContext());
        C0856Lz.A0N(this.A02);
        if (this.A0N) {
            A0F();
        } else {
            RelativeLayout relativeLayout = this.A02;
            O6 o6A0A = A0A();
            RelativeLayout.LayoutParams toolbarParams = new RelativeLayout.LayoutParams(-2, -2);
            relativeLayout.addView(o6A0A, toolbarParams);
        }
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(0, 0, A0U, 0);
        this.A01.addView(this.A02, layoutParams2);
        XD xd = this.A05;
        if (xd != null) {
            layoutParams2.addRule(0, xd.getId());
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams3.addRule(11);
            layoutParams3.addRule(6, this.A02.getId());
            layoutParams3.addRule(8, this.A02.getId());
            this.A01.addView(this.A05, layoutParams3);
        }
        C0856Lz.A0N(this.A0P);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams4.addRule(10);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -1);
        int i4 = A0U;
        layoutParams5.setMargins(i4, 0, i4, 0);
        layoutParams5.addRule(3, this.A0P.getId());
        layoutParams5.addRule(2, this.A01.getId());
        addView(this.A0P, layoutParams4);
        addView(this.A06, layoutParams5);
        addView(this.A01, layoutParams);
        this.A0F.A08();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0K() {
        new C0789Jg(this.A09.A0Q(), this.A0D).A03(EnumC0788Jf.A0n, null);
        this.A0L.set(true);
        C0856Lz.A0X(this);
        C0856Lz.A0K(this.A06);
        C0856Lz.A0d(this.A06, this.A00);
        C0856Lz.A0O(this.A0P);
        Pair<EnumC0930Ox, View> pairA03 = this.A0J.A03(this.A05);
        this.A00 = (View) pairA03.second;
        int i2 = C0860Md.A00[((EnumC0930Ox) pairA03.first).ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                return;
            }
            RelativeLayout relativeLayout = this.A01;
            if (relativeLayout != null) {
                C0856Lz.A0d(relativeLayout);
            }
            addView(this.A00, new RelativeLayout.LayoutParams(-1, -1));
            return;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(0, this.A0P.getToolbarHeight(), 0, 0);
        RelativeLayout relativeLayout2 = this.A01;
        if (relativeLayout2 != null) {
            layoutParams.addRule(2, relativeLayout2.getId());
        }
        addView(this.A00, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0L() {
        Toast toast = this.A03;
        if (toast != null && toast.getView().getWindowVisibility() == 0) {
            return;
        }
        this.A03 = Toast.makeText(getContext(), this.A0A.A0D(), 1);
        A0O((int) this.A0F.A04());
        this.A03.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0O(int i2) {
        C0856Lz.A0c(this.A03, this.A0A.A0D().replace(A0C(2, 6, 31), String.valueOf(i2)), 49, 0, A0Z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0V(boolean z) {
        HashMap map = new HashMap();
        map.put(A0C(8, 12, 121), z ? A0C(104, 13, 17) : A0C(69, 12, 51));
        C0904Nw c0904Nw = new C0904Nw(this.A0C, this.A0I.A5k(), this.A06.getViewabilityChecker(), this.A06.getTouchDataRecorder(), this.A0D, this.A0H);
        if (this.A0O) {
            c0904Nw.A08(this.A09.A0Q(), this.A09.A0M().A0G().A04(), map);
            return;
        }
        boolean z2 = !this.A0F.A05();
        c0904Nw.A0A(!z2);
        c0904Nw.A08(this.A09.A0Q(), this.A09.A0M().A0G().A04(), map);
        if (z2) {
            new Handler(Looper.getMainLooper()).post(new C1202Zo(this));
        }
        this.A07 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0W() {
        if (!this.A09.A0T().equals(A0C(90, 14, 37))) {
            if (this.A09.A0T().equals(A0C(57, 12, 100))) {
                AnonymousClass16 anonymousClass16 = this.A09;
                if (A0R[4].length() != 18) {
                    throw new RuntimeException();
                }
                String[] strArr = A0R;
                strArr[0] = "r5y7OBqhAYVA47bIfl4AlIWKO2XfiX80";
                strArr[0] = "r5y7OBqhAYVA47bIfl4AlIWKO2XfiX80";
                if (anonymousClass16.A0M().A0N()) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.MS
    public final void A7v(Intent intent, Bundle bundle, C04484w c04484w) {
        this.A04 = c04484w;
        this.A04.A0L(this.A0B);
        HashMap map = new HashMap();
        map.put(A0C(81, 9, 61), this.A0I.A6m());
        C1S c1sA06 = this.A09.A0M().A0E().A06();
        if (c1sA06 == null) {
            this.A0H.A3s(this.A0I.A6E());
            this.A0H.A3s(this.A0I.A69());
        } else {
            this.A06 = new Ot(this.A0C, this.A09, c1sA06, this.A0D, new ZA(this, null), map);
            this.A0H.A3L(this, new RelativeLayout.LayoutParams(-1, -1));
            A0G();
        }
    }

    @Override // com.facebook.ads.redexgen.X.MS
    public final void AAQ(boolean z) {
        this.A0F.A07();
    }

    @Override // com.facebook.ads.redexgen.X.MS
    public final void AAn(boolean z) {
        if (this.A0M.get() && !this.A0F.A06()) {
            LP lp = this.A0F;
            if (A0R[5].charAt(2) == 'm') {
                throw new RuntimeException();
            }
            String[] strArr = A0R;
            strArr[0] = "UQp6GtSKm4mkcrS1rXAjxFqYQJcA6U4M";
            strArr[0] = "UQp6GtSKm4mkcrS1rXAjxFqYQJcA6U4M";
            lp.A08();
        }
    }

    @Override // com.facebook.ads.redexgen.X.MS
    public final void ACj(Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.X.MS
    public final void onDestroy() {
        this.A0G.A03();
        C04484w c04484w = this.A04;
        if (c04484w != null) {
            c04484w.A0M(this.A0B);
        }
        if (this.A06 != null) {
            AnonymousClass16 anonymousClass16 = this.A09;
            if (A0R[0].charAt(29) == 'D') {
                throw new RuntimeException();
            }
            String[] strArr = A0R;
            strArr[0] = "voPpcOtL9PQSCLq1wYvqOCQr8JaLbGKq";
            strArr[0] = "voPpcOtL9PQSCLq1wYvqOCQr8JaLbGKq";
            if (!TextUtils.isEmpty(anonymousClass16.A0Q())) {
                this.A0D.A84(this.A09.A0Q(), new C0897Np().A04(this.A06.getViewabilityChecker()).A03(this.A06.getTouchDataRecorder()).A06());
            }
            this.A06.A0D();
        }
        this.A0F.A07();
        this.A0P.setToolbarListener(null);
        this.A03 = null;
        this.A04 = null;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            AAn(false);
        } else {
            AAQ(false);
        }
    }

    public void setListener(MR mr) {
    }
}
