package com.facebook.ads.redexgen.X;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class KT implements InterfaceC0840Lj<Bundle> {
    public static byte[] A0C;
    public static String[] A0D;
    public int A00;
    public int A01;

    @Nullable
    public String A02;

    @Nullable
    public String A03;
    public boolean A04;
    public final SR A05;
    public final X2 A06;
    public final JZ A07;
    public final P7 A08;
    public final PC A09;
    public final String A0A;

    @Nullable
    public final Map<String, String> A0B;

    static {
        A0P();
        A0O();
    }

    public static String A0G(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0C, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 48);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0O() {
        A0C = new byte[]{11, DateTimeFieldType.HALFDAY_OF_DAY, 30, DateTimeFieldType.MINUTE_OF_HOUR, 25, 24, -82, -79, -98, -62, -82, -71, -74, -63, -58, -102, -82, -69, -82, -76, -78, -65, -18, 1, -10, -6, -14, -20, -6, 0, -96, -77, -86, -85, -89, -100, -76, -96, -83, -56, -67, -49, -48, -98, -53, -47, -54, -64, -67, -50, -43, -80, -59, -55, -63, -87, -81, -98, -109, -91, -90, -126, -92, -95, -103, -92, -105, -91, -91, -122, -101, -97, -105, 127, -123, -21, -31, -33, -14, -35, -21, -15, -23, -33, -14, -16, -37, -23, -17, DateTimeFieldType.SECOND_OF_DAY, 12, -33, -37, -45, -43, -56, -45, 26, 30, DateTimeFieldType.HALFDAY_OF_DAY, DateTimeFieldType.HOUR_OF_DAY, 6, 10, 2, 27, 34, -87, -98, -94, -102, 37, 27, DateTimeFieldType.CLOCKHOUR_OF_DAY, -16, -26, -25, DateTimeFieldType.MINUTE_OF_HOUR, 9, 10, -2, DateTimeFieldType.SECOND_OF_MINUTE, -64, -70, -78, 10, 4, 11, 5, 3, -8, -4, -12, -18, -4, 2, -64, -63, -87, -82, 0, 1, -23, -4, -3, -8, -9, -8, -30, 5, 6, -4, -74, -73, -83, -95, -72, -21, -35, -30, -40, -29, -21};
    }

    public static void A0P() {
        A0D = new String[]{"nkjKj1MvUJoP2SJPYcgbaBjYPy4EsWOF", "UEaFlSlVJfgDxU2HAGuUlGjRHCZL3UC5", "HKOtxcgqDUvcB7Zt0rEFxuoEqCvYEtNO", "rowCAjgGiKT2zEBSq3xmGSL0Kf3UrlyG", "EJAz0i2eNdRPLBpGYGjYpv17GQTuD6uU", "hVbT72qq2pp8XHiEw", "RwROuq5e2nKVw7hJaeybV0hHAIDx5UQQ", "neuOh54FNoDLqHEFUxNtW4G7fWRiy4GW"};
    }

    public KT(X2 x2, JZ jz, P7 p7, List<AnonymousClass20> list, String str, boolean z) {
        this(x2, jz, p7, list, str, z, null);
    }

    public KT(X2 x2, JZ jz, P7 p7, List<AnonymousClass20> list, String str, boolean z, @Nullable Bundle bundle) {
        this(x2, jz, p7, list, str, z, bundle, null);
    }

    public KT(X2 x2, JZ jz, P7 p7, List<AnonymousClass20> list, String str, boolean z, @Nullable Bundle bundle, @Nullable Map<String, String> map) {
        this.A01 = 0;
        this.A00 = 0;
        this.A02 = null;
        this.A03 = null;
        this.A06 = x2;
        this.A07 = jz;
        this.A08 = p7;
        this.A0A = str;
        this.A0B = map;
        this.A04 = z;
        list.add(new C0813Kf(this, 0.5d, -1.0d, 2.0d, true));
        list.add(new KU(this, 1.0E-7d, -1.0d, 0.001d, false));
        if (bundle != null) {
            this.A05 = new SR(p7.getView(), list, bundle.getBundle(A0G(6, 16, 29)), x2);
            this.A01 = bundle.getInt(A0G(57, 18, 2));
            this.A00 = bundle.getInt(A0G(39, 18, 44));
        } else {
            this.A05 = new SR(p7.getView(), list, x2);
        }
        this.A09 = new PC(new Handler(), this);
    }

    private final float A0E() {
        return C0852Lv.A00(this.A06) * this.A08.getVolume();
    }

    private Map<String, String> A0I(int i2) {
        HashMap<String, String> map = new HashMap<>();
        C0852Lv.A04(map, this.A08.getVideoStartReason() == PD.A03, !this.A08.A7i());
        A0S(map);
        A0R(map);
        A0U(map, i2);
        A0T(map);
        A0Q(map);
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> A0J(P8 p8) {
        return A0K(p8, this.A08.getCurrentPositionInMillis());
    }

    private Map<String, String> A0K(P8 p8, int i2) {
        Map<String, String> mapA0I = A0I(i2);
        mapA0I.put(A0G(0, 6, 122), String.valueOf(p8.A00));
        return mapA0I;
    }

    private void A0M() {
        this.A07.A8T(this.A0A, A0J(P8.A04));
    }

    private void A0N() {
        this.A07.A8T(this.A0A, A0J(P8.A0A));
    }

    private void A0Q(HashMap<String, String> map) {
        Map<String, String> map2 = this.A0B;
        if (map2 != null) {
            map.putAll(map2);
        }
    }

    private void A0R(Map<String, String> map) {
        AnonymousClass22 anonymousClass22A03 = this.A05.A03();
        AnonymousClass21 anonymousClass21A00 = anonymousClass22A03.A00();
        map.put(A0G(145, 3, 81), String.valueOf(anonymousClass21A00.A00()));
        map.put(A0G(148, 3, 95), String.valueOf(anonymousClass21A00.A05()));
        map.put(A0G(151, 5, 16), String.valueOf(anonymousClass21A00.A02()));
        map.put(A0G(127, 8, 95), String.valueOf(anonymousClass21A00.A01() * 1000.0d));
        map.put(A0G(82, 7, 76), String.valueOf(anonymousClass21A00.A03() * 1000.0d));
        String str = this.A02;
        if (str != null) {
            map.put(A0G(135, 4, 26), str);
        }
        String str2 = this.A03;
        if (str2 != null) {
            map.put(A0G(139, 6, 90), str2);
        }
        AnonymousClass21 anonymousClass21A01 = anonymousClass22A03.A01();
        map.put(A0G(110, 3, 127), String.valueOf(anonymousClass21A01.A00()));
        map.put(A0G(113, 3, 74), String.valueOf(anonymousClass21A01.A05()));
        map.put(A0G(116, 5, 109), String.valueOf(anonymousClass21A01.A02()));
        map.put(A0G(22, 8, 93), String.valueOf(anonymousClass21A01.A01() * 1000.0d));
        map.put(A0G(75, 7, 78), String.valueOf(anonymousClass21A01.A03() * 1000.0d));
    }

    private void A0S(Map<String, String> map) {
        map.put(A0G(30, 9, 11), String.valueOf(this.A08.A7g()));
        map.put(A0G(93, 4, 51), Long.toString(this.A08.getInitialBufferTime()));
    }

    private void A0T(Map<String, String> map) {
        Rect rect = new Rect();
        this.A08.getGlobalVisibleRect(rect);
        map.put(A0G(97, 2, 122), String.valueOf(rect.top));
        map.put(A0G(91, 2, 63), String.valueOf(rect.left));
        map.put(A0G(89, 2, 116), String.valueOf(this.A08.getMeasuredHeight()));
        map.put(A0G(104, 2, 123), String.valueOf(this.A08.getMeasuredWidth()));
        WindowManager windowManager = (WindowManager) this.A06.getSystemService(A0G(156, 6, 68));
        DisplayMetrics metrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(metrics);
        map.put(A0G(121, 3, 26), String.valueOf(metrics.heightPixels));
        map.put(A0G(124, 3, 100), String.valueOf(metrics.widthPixels));
    }

    private void A0U(Map<String, String> map, int i2) {
        map.put(A0G(99, 5, 109), String.valueOf(this.A00 / 1000.0f));
        map.put(A0G(106, 4, 5), String.valueOf(i2 / 1000.0f));
    }

    public final int A0V() {
        return this.A01;
    }

    public final Bundle A0W() {
        A0f(A0V(), A0V());
        Bundle bundle = new Bundle();
        bundle.putInt(A0G(57, 18, 2), this.A01);
        bundle.putInt(A0G(39, 18, 44), this.A00);
        bundle.putBundle(A0G(6, 16, 29), this.A05.A02());
        return bundle;
    }

    public final void A0X() {
        this.A05.A04();
        this.A07.A8T(this.A0A, A0J(P8.A05));
    }

    public final void A0Y() {
        this.A07.A8T(this.A0A, A0J(P8.A07));
    }

    public final void A0Z() {
        this.A07.A8T(this.A0A, A0J(P8.A08));
    }

    public final void A0a() {
        if (A0E() < 0.05d) {
            if (this.A04) {
                A0M();
                this.A04 = false;
                return;
            }
            return;
        }
        if (this.A04) {
            return;
        }
        A0N();
        if (A0D[0].charAt(27) == 'x') {
            throw new RuntimeException();
        }
        String[] strArr = A0D;
        strArr[0] = "XPLItjVbGIZC9JnvDMj8hFJbnbXNZ6Zm";
        strArr[0] = "XPLItjVbGIZC9JnvDMj8hFJbnbXNZ6Zm";
        this.A04 = true;
    }

    public final void A0b() {
        this.A06.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this.A09);
    }

    public final void A0c() {
        this.A06.getContentResolver().unregisterContentObserver(this.A09);
    }

    public final void A0d(int i2) {
        A0g(i2, false, false);
    }

    public final void A0e(int i2) {
        A0g(i2, true, false);
        this.A00 = 0;
        this.A01 = 0;
        this.A05.A05();
        this.A05.A04();
    }

    public final void A0f(int i2, int i3) {
        A0g(i2, true, false);
        this.A00 = i3;
        this.A01 = i3;
        this.A05.A05();
        this.A05.A04();
    }

    public final void A0g(int i2, boolean z, boolean z2) {
        int i3;
        if (i2 <= 0.0d || i2 < (i3 = this.A01)) {
            return;
        }
        if (i2 > i3) {
            this.A05.A06((i2 - i3) / 1000.0f, A0E());
            this.A01 = i2;
            if (z2 || i2 - this.A00 >= 5000) {
                JZ jz = this.A07;
                String str = this.A0A;
                Map<String, String> mapA0K = A0K(P8.A09, i2);
                if (A0D[5].length() == 0) {
                    throw new RuntimeException();
                }
                String[] strArr = A0D;
                strArr[1] = "IXDsMs8MiMzYVjpFmNZXbOdNx8hS7U1p";
                strArr[6] = "KaqaEYbZ8TBX2kyM8fVmd1OK78kemUif";
                jz.A8T(str, mapA0K);
                this.A00 = this.A01;
                this.A05.A05();
                return;
            }
        }
        if (z) {
            this.A07.A8T(this.A0A, A0K(P8.A09, i2));
        }
    }
}
