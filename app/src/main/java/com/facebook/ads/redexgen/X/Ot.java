package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebSettings;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.joda.time.DateTimeFieldType;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: assets/audience_network.dex */
@SuppressLint({"ViewConstructor"})
public final class Ot extends FrameLayout {
    public static byte[] A0C;
    public static String[] A0D;
    public static final float A0E;
    public static final RelativeLayout.LayoutParams A0F;
    public int A00;
    public long A01;
    public Map<String, String> A02;
    public final AnonymousClass16 A03;
    public final C1S A04;
    public final X2 A05;
    public final JZ A06;
    public final InterfaceC0890Ni A07;
    public final XL A08;
    public final InterfaceC0925Or A09;
    public final AtomicBoolean A0A;
    public final AtomicBoolean A0B;

    public static String A06(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0C, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            int i6 = bArrCopyOfRange[i5] ^ i4;
            if (A0D[5].length() != 25) {
                throw new RuntimeException();
            }
            String[] strArr = A0D;
            strArr[4] = "2xsSJQdmJTzWNKbVkLPVv70adF3crTtp";
            strArr[4] = "2xsSJQdmJTzWNKbVkLPVv70adF3crTtp";
            bArrCopyOfRange[i5] = (byte) (i6 ^ 37);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A09() {
        A0C = new byte[]{11, 47, 29, 33, 44, 52, 44, 47, 33, 40, 12, 41, 52, 5, DateTimeFieldType.MILLIS_OF_DAY, DateTimeFieldType.MILLIS_OF_SECOND, DateTimeFieldType.HALFDAY_OF_DAY, 10, 3, 68, 1, DateTimeFieldType.MILLIS_OF_DAY, DateTimeFieldType.MILLIS_OF_DAY, 11, DateTimeFieldType.MILLIS_OF_DAY, 52, 8, 5, 29, 5, 6, 8, 1, 68, 0, 11, 39, DateTimeFieldType.CLOCKHOUR_OF_DAY, 5, 39, 8, DateTimeFieldType.HALFDAY_OF_DAY, 7, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 68, DateTimeFieldType.CLOCKHOUR_OF_DAY, DateTimeFieldType.MILLIS_OF_DAY, DateTimeFieldType.HALFDAY_OF_DAY, 3, 3, 1, DateTimeFieldType.MILLIS_OF_DAY, 1, 0, 68, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.HALFDAY_OF_DAY, DateTimeFieldType.CLOCKHOUR_OF_DAY, 12, 68, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.MILLIS_OF_DAY, 1, 73, 1, DateTimeFieldType.MINUTE_OF_DAY, 1, 10, DateTimeFieldType.CLOCKHOUR_OF_DAY, 68, 7, 8, DateTimeFieldType.HALFDAY_OF_DAY, 7, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, DateTimeFieldType.MILLIS_OF_SECOND, 68, 7, 11, DateTimeFieldType.HOUR_OF_DAY, 10, DateTimeFieldType.CLOCKHOUR_OF_DAY, 68, 5, 10, 0, 68, 32, 1, 8, 5, 29, 106, 86, 91, 67, 91, 88, 86, 95, 123, 94, 73, 108, 83, 95, 77, 103, 104, 109, 103, 111, 119, 58, 59, 50, 63, 39, 100, 120, 117, 109, 117, 118, 120, 113, 90, 72, 79, 114, 91, 68, 72, 90};
    }

    public static void A0A() {
        A0D = new String[]{"2LrpfYyae0azpeRldXrTpIs5j5WolZYJ", "aTWFoH17M5HvBaS06GyoTMgY8LK09kB1", "ZT9jJV1ne", "vwbwskwEgIVHj6V8wHV", "a8UIfMhCahgZVDol7QIaAFMNjSR7v8Rm", "pauq9xVSe1TSbn6Nh8iDWIypG", "tig0s2h3zWgeN1kA13N6tuAlrnUP1dby", "gu60Pcp0oAdbO9RcUpkXMIBgrMh0CW0V"};
    }

    static {
        A0A();
        A09();
        A0E = (int) (C0856Lz.A01 * 4.0f);
        A0F = new RelativeLayout.LayoutParams(-1, -1);
    }

    public Ot(X2 x2, AnonymousClass16 anonymousClass16, C1S c1s, JZ jz, InterfaceC0925Or interfaceC0925Or, Map<String, String> map) {
        super(x2);
        this.A0A = new AtomicBoolean(false);
        this.A0B = new AtomicBoolean(false);
        this.A01 = -1L;
        this.A00 = 0;
        this.A07 = new AbstractC1151Xm() { // from class: com.facebook.ads.redexgen.X.7x
            @Override // com.facebook.ads.redexgen.X.InterfaceC0890Ni
            public final void A8x() {
            }

            @Override // com.facebook.ads.redexgen.X.AbstractC1151Xm, com.facebook.ads.redexgen.X.InterfaceC0890Ni
            public final void A9f(int i2, @Nullable String str) {
                this.A00.A0B.set(true);
                this.A00.A09.AA6();
            }

            @Override // com.facebook.ads.redexgen.X.AbstractC1151Xm, com.facebook.ads.redexgen.X.InterfaceC0890Ni
            public final void A9m() {
                if (this.A00.A0B.get() || !this.A00.A0A.compareAndSet(false, true)) {
                    return;
                }
                this.A00.A09.A9m();
            }
        };
        this.A05 = x2;
        this.A03 = anonymousClass16;
        this.A04 = c1s;
        this.A06 = jz;
        this.A09 = interfaceC0925Or;
        this.A02 = map;
        this.A08 = A04();
        addView(this.A08, A0F);
    }

    public static /* synthetic */ int A00(Ot ot) {
        int i2 = ot.A00;
        ot.A00 = i2 + 1;
        return i2;
    }

    @SuppressLint({"AddJavascriptInterface", "ClickableViewAccessibility"})
    private XL A04() {
        XL xl = new XL(this.A05, new WeakReference(this.A07), 10);
        xl.setCornerRadius(A0E);
        xl.setLogMultipleImpressions(false);
        xl.setCheckAssetsByJavascriptBridge(false);
        xl.setWebViewTimeoutInMillis(this.A04.A09());
        xl.setRequestId(this.A03.A0U());
        xl.setOnTouchListener(new ViewOnTouchListenerC0926Os(this));
        WebSettings settings = xl.getSettings();
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        if (Build.VERSION.SDK_INT >= 16) {
            settings.setAllowFileAccessFromFileURLs(true);
        }
        if (Build.VERSION.SDK_INT > 16) {
            xl.addJavascriptInterface(new C0927Ou(this.A05, this, this.A06, this.A02, this.A03.A0Q()), A06(0, 12, 104));
        }
        return xl;
    }

    public final void A0B() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.A01;
        C05238e c05238e = new C05238e(A06(25, 67, 65));
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A06(107, 6, 33), this.A00);
            jSONObject.put(A06(113, 5, 123), jCurrentTimeMillis);
        } catch (JSONException e2) {
            Log.e(A06(92, 15, 31), A06(12, 13, 65), e2);
        }
        c05238e.A05(jSONObject);
        InterfaceC05218c interfaceC05218cA04 = this.A05.A04();
        int i2 = C05228d.A1q;
        String strA06 = A06(118, 8, 49);
        interfaceC05218cA04.A87(strA06, i2, c05238e);
        this.A00 = 0;
        if (!JT.A12(this.A05)) {
            InterfaceC0925Or interfaceC0925Or = this.A09;
            if (A0D[6].charAt(9) != 'W') {
                interfaceC0925Or.A9K();
                return;
            }
            String[] strArr = A0D;
            strArr[3] = BuildConfig.FLAVOR;
            strArr[3] = BuildConfig.FLAVOR;
            interfaceC0925Or.A9K();
            return;
        }
        if (jCurrentTimeMillis <= JT.A0E(this.A05)) {
            this.A09.A9K();
            return;
        }
        X2 x2 = this.A05;
        if (A0D[2].length() == 31) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0D;
        strArr2[0] = "lhJ8s2Q4sCds7IROMAxOWHrUi0xft2U2";
        strArr2[7] = "JiEJ4GJfM63VUjRSw5kXmgHmRai0omG0";
        x2.A04().A86(strA06, C05228d.A1r, c05238e);
    }

    public final void A0C() {
        String strA0F;
        try {
            XL xl = this.A08;
            if (!TextUtils.isEmpty(this.A04.A0C())) {
                strA0F = this.A04.A0C();
            } else {
                strA0F = this.A04.A0F();
            }
            xl.loadUrl(strA0F);
        } catch (Exception e2) {
            this.A05.A04().A86(A06(126, 8, 8), C05228d.A2C, new C05238e(e2));
        }
    }

    public final void A0D() {
        this.A08.removeJavascriptInterface(A06(0, 12, 104));
        this.A08.destroy();
    }

    public C0849Ls getTouchDataRecorder() {
        return this.A08.getTouchDataRecorder();
    }

    @Nullable
    public Q2 getViewabilityChecker() {
        return this.A08.getViewabilityChecker();
    }
}
