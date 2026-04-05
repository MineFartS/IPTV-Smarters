package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import androidx.annotation.Nullable;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.joda.time.DateTimeFieldType;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Rz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@SuppressLint({"HardcodedIPAddressUse"})
public abstract class AbstractC1010Rz implements KZ {
    public static byte[] A0E;
    public static String[] A0F;
    public static final Handler A0G;
    public static final C03430s A0H = null;

    @SuppressLint({"StaticFieldLeak"})
    public static final C0809Ka A0I = null;
    public static final String A0J;
    public View A00;

    @Nullable
    public InterfaceC03380n A01;
    public InterfaceC03380n A02;
    public C05408v A05;
    public KX A06;
    public AbstractC03390o A07;
    public final C03611k A08;
    public final JZ A09;
    public final C03430s A0A;
    public final C0809Ka A0B;
    public final X2 A0C;
    public volatile boolean A0D;
    public long A04 = -1;

    @Nullable
    public String A03 = null;

    public static String A08(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0E, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 8);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0A() {
        A0E = new byte[]{75, 110, 107, 122, 126, 111, 120, 42, 110, 101, 111, 121, 42, 100, 101, 126, 42, 111, 114, 99, 121, 126, 78, 107, 110, 127, 123, 106, 125, 47, 102, 124, 47, 97, 122, 99, 99, 47, 96, 97, 47, 124, 123, 110, 125, 123, 78, 107, 62, 25, DateTimeFieldType.HOUR_OF_DAY, DateTimeFieldType.SECOND_OF_DAY, 29, 28, 88, 12, DateTimeFieldType.MILLIS_OF_SECOND, 88, DateTimeFieldType.HOUR_OF_DAY, DateTimeFieldType.MILLIS_OF_DAY, DateTimeFieldType.HOUR_OF_DAY, 12, DateTimeFieldType.HOUR_OF_DAY, 25, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.HOUR_OF_DAY, 2, 29, 88, 59, DateTimeFieldType.MILLIS_OF_SECOND, DateTimeFieldType.MILLIS_OF_SECOND, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.HOUR_OF_DAY, 29, 53, 25, DateTimeFieldType.MILLIS_OF_DAY, 25, 31, 29, 10, 86, 34, 3, 76, 1, 3, 30, 9, 76, DateTimeFieldType.HALFDAY_OF_DAY, 8, 76, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, DateTimeFieldType.HALFDAY_OF_DAY, 2, 8, 5, 8, DateTimeFieldType.HALFDAY_OF_DAY, 24, 9, 31, 66, 88, 125, 96, 97, 104, 47, 110, 107, 110, 127, 123, 106, 125, 47, 123, 118, 127, 106, 33, 42, 47, 107, 42, 39, 57, 46, 42, 47, 50, 107, 56, 63, 42, 57, 63, 46, 47, 76, 93, 68, 44, 59, 91, 94, 75, 94, 49, 52, 33, 52, 10, 56, 58, 49, 48, 57, 10, 33, 44, 37, 48, 29, 28, 31, DateTimeFieldType.CLOCKHOUR_OF_DAY, DateTimeFieldType.MILLIS_OF_SECOND, DateTimeFieldType.CLOCKHOUR_OF_DAY, DateTimeFieldType.HALFDAY_OF_DAY, DateTimeFieldType.CLOCKHOUR_OF_DAY, DateTimeFieldType.MILLIS_OF_DAY, DateTimeFieldType.MILLIS_OF_SECOND, 74, 65, 76, 93, 86, 95, 91, 74, 75, 112, 70, 75, 75, 64, 88, 71, 92, 65, 64, 67, 75, 64, 90, DateTimeFieldType.HOUR_OF_HALFDAY, 71, 93, DateTimeFieldType.HOUR_OF_HALFDAY, 75, 67, 94, 90, 87, 37, 49, 38, 50, 54, 38, 45, 32, 58, 28, 32, 34, 51, 51, 42, 45, 36, 115, 112, 126, 123, 64, 107, 118, 114, 122, 64, 114, 108, 48, 44, 33, 35, 37, 45, 37, 46, 52, 9, 36, 7, DateTimeFieldType.CLOCKHOUR_OF_DAY, 4, 0, DateTimeFieldType.CLOCKHOUR_OF_DAY, 6, 1, 33, 28, 24, DateTimeFieldType.CLOCKHOUR_OF_DAY, DateTimeFieldType.SECOND_OF_DAY, 3, DateTimeFieldType.MILLIS_OF_SECOND, DateTimeFieldType.MINUTE_OF_HOUR, 3, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.MINUTE_OF_DAY, 57, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 2};
    }

    public static void A0B() {
        A0F = new String[]{"4yJhIog9RzpC9w4XHjq79o6hmz2pMXrt", "bLneqHgNlbzxjE", "P7gevZ65hMGDm5VmgpkLcWEi46YxYduR", "Pajg2XTKXpS0pN0AoGLcPnQoa2IWF6Z7", "YyJRdl3XxpBTstTmsw", "OvgbPt0JG7dlaj99kqPbJKVmb9CPKTVr", "21VbiQWRKHmC0d4xB3zoTsbqXtN2ZOxw", "Q3Y9mBD7X4l0uaedlY7FP5X0xCsXbtIX"};
    }

    public abstract void A0N();

    public abstract void A0Q(InterfaceC03380n interfaceC03380n, C05408v c05408v, C05388t c05388t, Map<String, Object> map);

    static {
        A0B();
        A0A();
        M1.A02();
        A0J = AbstractC1010Rz.class.getSimpleName();
        A0G = new Handler(Looper.getMainLooper());
    }

    public AbstractC1010Rz(X2 x2, C03611k c03611k) {
        this.A0C = x2;
        this.A08 = c03611k;
        C0809Ka c0809Ka = A0I;
        if (c0809Ka != null) {
            this.A0B = c0809Ka;
        } else {
            this.A0B = new C0809Ka(this.A0C);
        }
        this.A0B.A0R(this);
        C03430s c03430s = A0H;
        if (c03430s != null) {
            this.A0A = c03430s;
        } else {
            this.A0A = new C03430s();
        }
        try {
            CookieManager.getInstance();
            if (Build.VERSION.SDK_INT < 21) {
                CookieSyncManager.createInstance(this.A0C);
            }
        } catch (Exception e2) {
            Log.w(A0J, A08(48, 35, 112), e2);
        }
        DynamicLoaderFactory.makeLoader(this.A0C).getInitApi().onAdLoadInvoked(this.A0C);
        this.A09 = x2.A06();
        this.A0C.A0A().A4X();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A09() {
        this.A01 = null;
        C05408v c05408v = this.A05;
        C05388t c05388tA04 = c05408v.A04();
        String strA08 = A08(0, 0, 73);
        if (c05388tA04 == null) {
            K7 error = K7.A02(AdErrorType.NO_FILL, strA08);
            this.A0C.A0A().A4Z(error.A04().getErrorCode(), A08(83, 22, 100));
            this.A07.A0F(error);
            return;
        }
        String strA03 = c05388tA04.A03();
        InterfaceC03380n interfaceC03380nA00 = this.A0A.A00(c05408v.A05().A0D());
        if (interfaceC03380nA00 == null) {
            this.A0C.A04().A86(A08(142, 3, 37), C05228d.A0P, new C05238e(A08(0, 22, 2), strA03));
            A0O();
            return;
        }
        AdPlacementType adapterType = this.A08.A00();
        if (adapterType != interfaceC03380nA00.A6l()) {
            K7 error2 = K7.A02(AdErrorType.INTERNAL_ERROR, strA08);
            this.A0C.A0A().A4Z(error2.A04().getErrorCode(), A08(105, 19, 7));
            this.A07.A0F(error2);
            return;
        }
        this.A01 = interfaceC03380nA00;
        C05418w c05418wA05 = c05408v.A05();
        JSONObject jSONObjectA06 = c05388tA04.A06();
        if (jSONObjectA06 != null) {
            String[] strArr = A0F;
            if (strArr[0].charAt(1) == strArr[5].charAt(1)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0F;
            strArr2[4] = "xCRhnlDAhS4MFpckcT";
            strArr2[1] = "gHgyVSON2W8zeI";
            String strOptString = jSONObjectA06.optString(A08(259, 10, 110));
            this.A0C.A0A().AD8(strOptString);
            this.A0C.A08(strOptString);
            X3 sdkContext = C8B.A00();
            if (sdkContext != null) {
                sdkContext.A08(strOptString);
            }
            if (A0F[2].charAt(5) != 'Z') {
                String[] strArr3 = A0F;
                strArr3[6] = "8Wq26Ceqv565ijof1GdoYggHtr98JF3l";
                strArr3[6] = "8Wq26Ceqv565ijof1GdoYggHtr98JF3l";
                A0E(jSONObjectA06.optJSONObject(A08(208, 17, 28)));
            } else {
                String[] strArr4 = A0F;
                strArr4[4] = "ECm89W61U2RjXtlAFB";
                strArr4[1] = "vfVrRI5o8HJ5sJ";
                String errorMessage = A08(208, 17, 75);
                A0E(jSONObjectA06.optJSONObject(errorMessage));
            }
        }
        HashMap map = new HashMap();
        map.put(A08(147, 4, 55), jSONObjectA06);
        map.put(A08(166, 10, 113), c05418wA05);
        map.put(A08(237, 11, 72), this.A08.A08);
        map.put(A08(248, 11, 125), Long.valueOf(c05418wA05.A0C()));
        map.put(A08(151, 15, 93), c05388tA04.A04());
        if (this.A06 == null) {
            String strA082 = A08(188, 20, 38);
            K7 k7A02 = K7.A02(AdErrorType.UNKNOWN_ERROR, strA082);
            this.A0C.A0A().A4Z(k7A02.A04().getErrorCode(), strA082);
            this.A07.A0F(k7A02);
            return;
        }
        A0Q(interfaceC03380nA00, c05408v, c05388tA04, map);
    }

    private final void A0D(@Nullable String str, @Nullable AdExperienceType adExperienceType) {
        this.A0C.A0A().A4a(str != null);
        this.A04 = System.currentTimeMillis();
        if (Build.VERSION.SDK_INT < 17) {
            A9b(new K7(AdErrorType.API_NOT_SUPPORTED, A08(0, 0, 73)));
            return;
        }
        try {
            this.A06 = this.A08.A01(this.A0C, new KI(this.A0C, str, this.A08.A08, this.A08.A07), adExperienceType);
            if (A0F[6].charAt(21) == '6') {
                throw new RuntimeException();
            }
            String[] strArr = A0F;
            strArr[4] = "3q2wB1pMY3UXfOrLgu";
            strArr[1] = "CsXqAZILgfX2KA";
            this.A0B.A0Q(this.A06);
        } catch (K8 e2) {
            A9b(K7.A03(e2));
        }
    }

    private void A0E(@Nullable JSONObject jSONObject) {
        if (jSONObject != null) {
            this.A03 = jSONObject.optString(A08(176, 12, 39));
            C03450u.A0H(jSONObject);
        }
    }

    public final long A0F() {
        C05408v c05408v = this.A05;
        if (c05408v != null) {
            return c05408v.A03();
        }
        return -1L;
    }

    public final Handler A0G() {
        return A0G;
    }

    public final C05418w A0H() {
        C05408v c05408v = this.A05;
        if (c05408v == null) {
            return null;
        }
        return c05408v.A05();
    }

    @Nullable
    public final String A0I() {
        InterfaceC03380n interfaceC03380n = this.A02;
        if (interfaceC03380n == null) {
            return null;
        }
        return interfaceC03380n.A5l();
    }

    public final void A0J() {
        this.A0C.A0A().A2h(C0848Lr.A01(this.A04));
        if (this.A02 == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put(A08(225, 12, 23), C0848Lr.A04(this.A04));
        new C0789Jg(this.A02.A5l(), this.A09).A03(EnumC0788Jf.A08, map);
    }

    public final void A0K() {
        InterfaceC03380n interfaceC03380n = this.A02;
        String strA08 = A08(142, 3, 37);
        if (interfaceC03380n == null) {
            String strA082 = A08(22, 26, 7);
            this.A0C.A04().A86(strA08, C05228d.A0F, new C05238e(strA082));
            AdErrorType adErrorType = AdErrorType.INTERNAL_ERROR;
            this.A0C.A0A().A4Z(adErrorType.getErrorCode(), strA082);
            this.A07.A0F(K7.A02(adErrorType, adErrorType.getDefaultErrorMessage()));
            this.A0C.A0A().A4c();
            return;
        }
        if (this.A0D) {
            String strA083 = A08(124, 18, 67);
            this.A0C.A04().A86(strA08, C05228d.A0C, new C05238e(strA083));
            AdErrorType adErrorType2 = AdErrorType.AD_ALREADY_STARTED;
            this.A0C.A0A().A4Z(adErrorType2.getErrorCode(), strA083);
            this.A07.A0F(K7.A02(adErrorType2, adErrorType2.getDefaultErrorMessage()));
            this.A0C.A0A().A4b();
            return;
        }
        if (!TextUtils.isEmpty(this.A02.A5l())) {
            this.A09.A8L(this.A02.A5l());
        }
        this.A0C.A0A().A4d();
        this.A0D = true;
        A0N();
    }

    public final void A0L() {
        A0W(false);
    }

    public final void A0M() {
        String str = this.A03;
        if (str != null) {
            C03450u.A0E(str);
        }
    }

    public final synchronized void A0O() {
        A0G.post(new C1008Rx(this));
    }

    public final void A0P(InterfaceC03380n interfaceC03380n) {
        if (interfaceC03380n != null) {
            interfaceC03380n.onDestroy();
        }
    }

    public final void A0R(AbstractC03390o abstractC03390o) {
        this.A07 = abstractC03390o;
    }

    public void A0S(@Nullable String str) {
        A0D(str, null);
    }

    public final void A0T(@Nullable String str) {
        A0S(str);
    }

    public final void A0U(@Nullable String str, @Nullable AdExperienceType adExperienceType) {
        A0D(str, adExperienceType);
    }

    public final void A0V(Map<String, Object> map) {
        this.A0C.A0A().A4W();
        Object obj = map.get(A08(147, 4, 55));
        if (obj instanceof JSONObject) {
            String strOptString = ((JSONObject) obj).optString(A08(145, 2, 71));
            if (!TextUtils.isEmpty(strOptString)) {
                new C0789Jg(strOptString, this.A09).A03(EnumC0788Jf.A04, null);
            }
        }
    }

    public final void A0W(boolean z) {
        if (!z && !this.A0D) {
            return;
        }
        this.A0C.A0A().A4e();
        A0P(this.A02);
        this.A00 = null;
        this.A0D = false;
    }

    public final boolean A0X() {
        C05408v c05408v = this.A05;
        return c05408v == null || c05408v.A0A();
    }

    @Override // com.facebook.ads.redexgen.X.KZ
    public final synchronized void A9b(K7 k7) {
        A0G().post(new C1009Ry(this, k7));
    }

    @Override // com.facebook.ads.redexgen.X.KZ
    public final synchronized void AB5(C1256ah c1256ah) {
        A0G().post(new C1007Rw(this, c1256ah));
    }
}
