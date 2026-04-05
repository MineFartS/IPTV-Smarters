package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.view.dynamiclayout.DynamicFullScreenAdView$AdFormatType;
import com.facebook.proguard.annotations.DoNotStrip;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.joda.time.DateTimeFieldType;
import org.json.JSONObject;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class R0 extends FrameLayout implements MS {
    public static byte[] A0L;
    public static String[] A0M;
    public InterfaceC04464u A00;

    @Nullable
    public C04484w A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final AnonymousClass16 A05;
    public final C7C A06;
    public final X2 A07;
    public final JZ A08;
    public final C0789Jg A09;
    public final ViewOnSystemUiVisibilityChangeListenerC0844Ln A0A;
    public final C0849Ls A0B;
    public final MR A0C;
    public final InterfaceC0878Mw A0D;
    public final AbstractC0887Nf A0E;
    public final OS A0F;

    @DoNotStrip
    public final Q1 A0G;
    public final Q2 A0H;
    public final String A0I;
    public final LinkedList<String> A0J;
    public final JSONObject A0K;

    static {
        A0D();
        A0C();
    }

    public static String A09(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0L, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 41);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0C() {
        A0L = new byte[]{-83, 115, 108, 111, 110, 108, 110, 115, -96, -106, -92, -95, -101, -106, 123, -96, -90, -105, -92, -104, -109, -107, -105, -117, -114, 124, -113, -102, -103, -100, -98, -109, -104, -111, 112, -109, -104, -109, -99, -110, -113, -114, 82, 81, 79, -99, 81, 83, 101, -92, -89, -107, -88, -77, -78, -75, -73, -84, -79, -86, -106, -73, -92, -75, -73, -88, -89, 107, 106, 104, -74, 106, 108, 126, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.MINUTE_OF_DAY, -27, 7, 24, DateTimeFieldType.HALFDAY_OF_DAY, 26, DateTimeFieldType.HALFDAY_OF_DAY, 24, 29, -12, 5, 25, DateTimeFieldType.MILLIS_OF_SECOND, 9, 8, -52, -53, -55, DateTimeFieldType.MILLIS_OF_SECOND, -53, -51, -33, -87, -88, 123, -99, -82, -93, -80, -93, -82, -77, -116, -97, -83, -81, -89, -97, -98, 98, 97, 95, -83, 97, 99, 117, DateTimeFieldType.MILLIS_OF_SECOND, 9, 24, -27, 25, 24, 12, -17, 9, 29, -52, -53, -55, DateTimeFieldType.MILLIS_OF_SECOND, -53, -48, -53, -55, DateTimeFieldType.MILLIS_OF_SECOND, -53, -51, -33, -40, -54, -39, -89, -58, -40, -54, -101, -103, -90, -40, -40, -54, -39, -40, -115, -116, -118, -40, -116, -111, -116, -118, -40, -116, -114, -19, -32, -36, -18, -55, -36, -40, -37, -16, -53, -26, -54, -33, -26, -18, -97, -98, -100, -22, -98, -96, -78};
    }

    public static void A0D() {
        A0M = new String[]{"Ky6zrcoV7NYtZpO3AnBVhERgUe61TP4A", "7", "MIS71VG0t7feKobdqgnq1TwubiJ1N09z", "nEwmQOfqxRkjYDAAu8TY0n89Pulsb82", "nm6mhrtocmSPL4qM7u9wOkkvqXPHcra", "ADTrDSFqqVysA22fSklmKPGMwsWvvDiN", "oNlgPu", "28CTXOUAXLtNi6XFaROwO0buCKC9QIVi"};
    }

    public R0(X2 x2, JZ jz, MR mr, AnonymousClass16 anonymousClass16, InterfaceC0878Mw interfaceC0878Mw, @DynamicFullScreenAdView$AdFormatType int i2) {
        super(x2);
        this.A00 = new R5(this);
        this.A0J = new LinkedList<>();
        this.A0B = new C0849Ls();
        this.A0G = new R4(this);
        this.A04 = true;
        this.A03 = false;
        this.A02 = true;
        this.A07 = x2;
        this.A08 = jz;
        this.A0C = mr;
        this.A05 = anonymousClass16;
        this.A0D = interfaceC0878Mw;
        this.A0I = UUID.randomUUID().toString();
        this.A06 = new C7C(this.A07);
        this.A09 = new C0789Jg(this.A05.A0Q(), this.A08);
        this.A0F = new OS(anonymousClass16.A0U(), this.A05.A0M().A0E().A08(), i2);
        this.A0K = OZ.A01(this.A07, this.A05.A0Y(), this.A06, this.A09, this.A0F);
        this.A0E = new R1(this, this.A07);
        C0856Lz.A0J(1003, this.A0E);
        this.A0H = new Q2(this.A0E, 1, new WeakReference(this.A0G), this.A07);
        this.A0H.A0Y(this.A05.A0G());
        this.A0H.A0Z(this.A05.A0H());
        this.A0A = new ViewOnSystemUiVisibilityChangeListenerC0844Ln(this);
        this.A0A.A05(EnumC0843Lm.A03);
    }

    private void A0B() {
        C0910Oc c0910OcA0B = new C0908Oa(this.A07, this.A05.A0M().A0F(), this.A05.A0O()).A08(this.A05.A0L().A01()).A0B();
        addView(c0910OcA0B, new FrameLayout.LayoutParams(-1, -1));
        c0910OcA0B.A04(new R2(this));
    }

    @SuppressLint({"AddJavascriptInterface"})
    private final void A0E() {
        if (Build.VERSION.SDK_INT > 16) {
            this.A0E.addJavascriptInterface(new OY(this, this.A08, this.A0F, this.A0I, this.A05.A0Q()), A09(7, 16, 9));
        }
        this.A09.A03(EnumC0788Jf.A0O, null);
        this.A0E.loadUrl(this.A06.A0L(this.A05.A0R()));
        A0J(String.format(Locale.US, A09(121, 22, 123), this.A0I, A09(1, 6, 21)));
        A0J(String.format(Locale.US, A09(143, 26, 60), Base64.encodeToString(this.A0K.toString().getBytes(), 0).replace(A09(0, 1, 122), A09(0, 0, 58)), this.A0I));
        addView(this.A0E, new FrameLayout.LayoutParams(-1, -1));
        this.A0C.A3L(this, new RelativeLayout.LayoutParams(-1, -1));
        if (Build.VERSION.SDK_INT >= 19) {
            this.A0A.A05(EnumC0843Lm.A04);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(21)
    public synchronized void A0F() {
        if (this.A03) {
            while (!this.A0J.isEmpty()) {
                this.A09.A03(EnumC0788Jf.A0L, null);
                this.A0E.evaluateJavascript(this.A0J.poll(), null);
            }
        }
    }

    private void A0I(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        new C0904Nw(this.A07, this.A0D.A5k(), this.A0H, this.A0B, this.A08, this.A0C).A08(this.A05.A0Q(), str, new HashMap());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void A0J(String str) {
        this.A0J.offer(str);
        A0F();
    }

    public final void A0M() {
        C04484w c04484w = this.A01;
        if (c04484w == null) {
            return;
        }
        c04484w.finish(4);
    }

    public final void A0N() {
        this.A04 = true;
    }

    public final void A0O() {
        this.A04 = false;
    }

    public final void A0P() {
        A0I(this.A05.A0M().A0G().A04());
    }

    public final void A0Q() {
        this.A0C.A3s(this.A0D.A5G());
        new C0932Oz(this.A07, this.A0D, this.A05.A0V(), this.A0C).A06();
    }

    public final void A0R() {
        new Handler(Looper.getMainLooper()).post(new R3(this));
    }

    public final void A0S() {
        this.A0H.A0W();
    }

    public final void A0T(String str) {
        A0I(str);
    }

    public final void A0U(Map<String, String> map) {
        this.A08.A85(this.A05.A0Q(), new C0897Np(map).A04(this.A0H).A06());
    }

    @Override // com.facebook.ads.redexgen.X.MS
    public final void A7v(Intent intent, @Nullable Bundle bundle, C04484w c04484w) {
        c04484w.A0L(this.A00);
        this.A01 = c04484w;
        A0E();
        if (this.A05.A0M().A0O()) {
            A0B();
        } else if (!TextUtils.isEmpty(this.A05.A0M().A0E().A08())) {
            A0J(String.format(Locale.US, A09(169, 22, 78), this.A0I));
        }
    }

    @Override // com.facebook.ads.redexgen.X.MS
    public final void AAQ(boolean z) {
        if (z) {
            A0J(String.format(Locale.US, A09(49, 25, 26), this.A0I));
        } else {
            A0J(String.format(Locale.US, A09(74, 23, 123), this.A0I));
        }
    }

    @Override // com.facebook.ads.redexgen.X.MS
    public final void AAn(boolean z) {
        if (this.A02) {
            this.A02 = false;
            return;
        }
        if (A0M[1].length() == 11) {
            throw new RuntimeException();
        }
        String[] strArr = A0M;
        strArr[5] = "5WCDyt3aDRAQqvSthuq2O6x8YHnGvtvN";
        strArr[5] = "5WCDyt3aDRAQqvSthuq2O6x8YHnGvtvN";
        if (z) {
            A0J(String.format(Locale.US, A09(23, 26, 1), this.A0I));
        } else {
            A0J(String.format(Locale.US, A09(97, 24, 17), this.A0I));
        }
    }

    @Override // com.facebook.ads.redexgen.X.MS
    public final void ACj(Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.X.MS
    public final void onDestroy() {
        this.A0A.A03();
        this.A08.A84(this.A05.A0Q(), new C0897Np().A03(this.A0B).A04(this.A0H).A06());
        this.A00 = null;
        this.A01 = null;
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        requestDisallowInterceptTouchEvent(true);
        return super.onTouchEvent(motionEvent);
    }

    public void setListener(MR mr) {
    }
}
