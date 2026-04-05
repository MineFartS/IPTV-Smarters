package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.joda.time.DateTimeFieldType;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Rb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0986Rb implements InterfaceC03330i, InterfaceC03380n {
    public static byte[] A0a;
    public static String[] A0b;
    public static final String A0c;
    public int A00;
    public int A01;
    public int A03;
    public int A04;
    public int A06;
    public int A07;
    public long A08;
    public Uri A09;
    public EnumC03320h A0A;
    public AnonymousClass11 A0B;
    public X2 A0C;

    @Nullable
    public JZ A0D;
    public InterfaceC0802Jt A0E;
    public C0803Ju A0F;
    public C0803Ju A0G;
    public C0803Ju A0H;
    public C0804Jv A0I;
    public EnumC0808Jz A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public String A0P;
    public Collection<String> A0Q;
    public List<C1320bj> A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public HashMap<String, String> A0R = new HashMap<>();
    public int A05 = 200;
    public int A02 = -1;

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0a, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 106);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A0a = new byte[]{124, 89, 126, 85, 82, 84, 94, 88, 78, 95, 122, 127, 110, 106, 123, 108, 62, 127, 114, 108, 123, 127, 122, 103, 62, 114, 113, 127, 122, 123, 122, 62, 122, 127, 106, 127, 106, 94, 79, 66, 78, 69, 72, 78, 11, 101, 78, 95, 92, 68, 89, 64, 11, 103, 68, 74, 79, 78, 79, 43, 4, 1, 11, 3, 72, 0, 9, 24, 24, DateTimeFieldType.HALFDAY_OF_DAY, 6, DateTimeFieldType.HALFDAY_OF_DAY, 12, 72, 7, 6, 72, 4, 7, 11, 3, 27, 11, 26, DateTimeFieldType.HALFDAY_OF_DAY, DateTimeFieldType.HALFDAY_OF_DAY, 6, 72, 9, 12, 96, 79, 74, 64, 72, 3, 79, 76, 68, 68, 70, 71, DateTimeFieldType.CLOCKHOUR_OF_DAY, 39, 39, 58, 39, 117, 48, 45, 48, 54, 32, 33, 60, 59, 50, 117, 52, 54, 33, 60, 58, 59, 113, 80, 31, 121, 86, 83, 83, DateTimeFieldType.MILLIS_OF_DAY, 45, 34, 33, 47, 38, 99, 55, 44, 99, 51, 34, 49, 48, 38, 99, 32, 34, 49, 44, 54, 48, 38, 47, 99, 39, 34, 55, 34, 109, 85, 80, 107, 87, 92, 91, 93, 87, 81, 71, 107, 93, 87, 91, 90, 93, 88, 99, 95, 84, 83, 85, 95, 89, 79, 99, 80, 85, 82, 87, 99, 73, 78, 80, 3, 6, 61, DateTimeFieldType.MILLIS_OF_DAY, DateTimeFieldType.CLOCKHOUR_OF_DAY, 3, 12, DateTimeFieldType.HOUR_OF_DAY, DateTimeFieldType.HOUR_OF_HALFDAY, 3, DateTimeFieldType.MILLIS_OF_DAY, 11, DateTimeFieldType.HALFDAY_OF_DAY, 12, 73, 76, 94, 77, 90, 92, 65, 91, 77, 90, 119, 70, 73, 69, 77, 3, 12, 61, DateTimeFieldType.HOUR_OF_HALFDAY, DateTimeFieldType.HALFDAY_OF_DAY, 5, DateTimeFieldType.HALFDAY_OF_DAY, 61, DateTimeFieldType.MILLIS_OF_DAY, 27, DateTimeFieldType.MINUTE_OF_DAY, 7, 28, DateTimeFieldType.HOUR_OF_DAY, 26, 7, 50, 48, 61, 61, DateTimeFieldType.HOUR_OF_HALFDAY, 37, 62, DateTimeFieldType.HOUR_OF_HALFDAY, 48, 50, 37, 56, 62, 63, 79, 77, 94, 72, 79, 66, 88, 62, 60, 47, 57, 52, 51, 57, DateTimeFieldType.MINUTE_OF_DAY, DateTimeFieldType.CLOCKHOUR_OF_DAY, 3, 30, 4, 2, DateTimeFieldType.SECOND_OF_DAY, 29, 6, DateTimeFieldType.HOUR_OF_DAY, 0, 5, DateTimeFieldType.CLOCKHOUR_OF_DAY, 5, 36, 37, 38, 41, 46, 41, 52, 41, 47, 46, 122, 123, 106, 123, 125, 106, 119, 113, 112, 65, 109, 106, 108, 119, 112, 121, 109, DateTimeFieldType.MINUTE_OF_DAY, 25, DateTimeFieldType.MILLIS_OF_DAY, DateTimeFieldType.SECOND_OF_MINUTE, 27, DateTimeFieldType.MINUTE_OF_DAY, 40, 4, 25, DateTimeFieldType.MILLIS_OF_DAY, 7, 4, 31, 24, 3, 40, 27, 24, DateTimeFieldType.CLOCKHOUR_OF_DAY, 39, 44, 35, 32, 46, 39, 29, 52, 43, 39, 53, 29, 46, 45, 37, 33, 37, 38, 35, 24, 36, 40, 42, 42, 38, 41, 35, 79, 66, 70, 67, 75, 78, 73, 66, 69, 79, 67, 66, 102, 98, 110, 104, 106, 25, 30, 6, DateTimeFieldType.HOUR_OF_DAY, 28, 25, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.HOUR_OF_DAY, 4, 25, 31, 30, 47, DateTimeFieldType.MINUTE_OF_DAY, DateTimeFieldType.SECOND_OF_MINUTE, 24, DateTimeFieldType.HOUR_OF_DAY, 6, 25, 31, 2, 71, 66, 69, 64, 116, 79, 78, 88, 72, 89, 66, 91, 95, 66, 68, 69, 31, DateTimeFieldType.HOUR_OF_HALFDAY, 29, 28, 6, 1, 8, 75, 90, 78, 72, 94, 100, 79, 73, 90, 85, 72, 87, 90, 79, 82, 84, 85, 73, 85, 88, 64, 102, 77, 75, 88, 87, 74, 85, 88, 77, 80, 86, 87, 73, 75, 86, 84, 86, 77, 92, 93, 102, 77, 75, 88, 87, 74, 85, 88, 77, 80, 86, 87, 0, DateTimeFieldType.MILLIS_OF_SECOND, 3, 7, DateTimeFieldType.MILLIS_OF_SECOND, 1, 6, 45, 27, DateTimeFieldType.MILLIS_OF_DAY, 110, 115, 124, 109, 110, 117, 114, 105, 54, 43, 36, 53, 54, 45, 42, 49, 26, 38, 42, 40, 53, 55, 32, 54, 54, 26, 52, 48, 36, 41, 44, 49, 60, 4, 25, DateTimeFieldType.MILLIS_OF_DAY, 7, 4, 31, 24, 3, 40, 27, 24, DateTimeFieldType.CLOCKHOUR_OF_DAY, 40, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.MINUTE_OF_DAY, 27, DateTimeFieldType.MILLIS_OF_DAY, DateTimeFieldType.HOUR_OF_HALFDAY, 40, 4, DateTimeFieldType.MINUTE_OF_DAY, DateTimeFieldType.SECOND_OF_DAY, 24, 25, DateTimeFieldType.MINUTE_OF_HOUR, 112, 108, 96, 106, 98, 111, 92, 96, 108, 109, 119, 102, 123, 119, 5, 6, 25, 24, 5, 25, 4, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.MINUTE_OF_DAY, 41, 2, 4, DateTimeFieldType.MILLIS_OF_SECOND, 24, 5, 26, DateTimeFieldType.MILLIS_OF_SECOND, 2, 31, 25, 24, 39, 32, 53, 38, 11, 38, 53, 32, 61, 58, 51, 34, 36, 51, 37, 56, 37, 61, 52, 42, 55, 42, 50, 59, 72, 78, 88, 89, 98, 79, 88, 77, 82, 79, 73, 98, 72, 79, 81, 121, 102, 107, 106, 96, 80, 110, 122, 123, 96, 127, 99, 110, 118, 80, 106, 97, 110, 109, 99, 106, 107, 12, DateTimeFieldType.MINUTE_OF_HOUR, 30, 31, DateTimeFieldType.SECOND_OF_MINUTE, 37, DateTimeFieldType.MILLIS_OF_SECOND, 10, 30, 36, 59, 54, 55, 61, DateTimeFieldType.HALFDAY_OF_DAY, 34, 32, 55, 62, 61, 51, 54, DateTimeFieldType.HALFDAY_OF_DAY, 33, 59, 40, 55, DateTimeFieldType.HALFDAY_OF_DAY, 48, 43, 38, 55, 33, 107, 116, 121, 120, 114, 66, 104, 111, 113, 59, 36, 40, 58, 105, 118, 122, 104, 126, 125, 118, 115, 118, 107, 102, 64, 124, 119, 122, 124, 116, 64, 118, 113, 118, 107, 118, 126, 115, 64, 123, 122, 115, 126, 102, 87, 72, 68, 86, 64, 67, 72, 77, 72, 85, 88, 126, 66, 73, 68, 66, 74, 126, 72, 79, 85, 68, 83, 87, 64, 77};
    }

    public static void A06() {
        A0b = new String[]{"OTBhn", "woE0GsYsDC", "jJJsRhZ6eh", "RbmDZKGZyk", "MbYnCV2deeCvNEpfUSPgn7RvJuamywdV", "va4Mi1JJiq4w08mNkhVxy34L1bzftr4W", "QQZqW8pW387BdDH3gcXSwYVoWAeaIxNz", "E72k8"};
    }

    static {
        A06();
        A05();
        A0c = C0986Rb.class.getSimpleName();
    }

    private Map<String, String> A03(Map<String, String> map) {
        HashMap map2 = new HashMap();
        String strA01 = A01(675, 4, 39);
        if (map.containsKey(strA01)) {
            map2.put(strA01, map.get(strA01));
        }
        String strA012 = A01(479, 8, 119);
        if (map.containsKey(strA012)) {
            map2.put(strA012, map.get(strA012));
        }
        return map2;
    }

    private void A04() {
        if (!this.A0X) {
            JZ jz = this.A0D;
            if (A0b[2].length() != 10) {
                throw new RuntimeException();
            }
            String[] strArr = A0b;
            strArr[5] = "8ArINtb0xmmgo9NmELWQk3NiIhKYvaDc";
            strArr[5] = "8ArINtb0xmmgo9NmELWQk3NiIhKYvaDc";
            if (jz != null) {
                jz.ABi(this.A0N);
            }
            this.A0X = true;
        }
    }

    private void A07(X2 x2, JSONObject jSONObject, JZ jz, String str, int i2, int i3) {
        this.A0W = true;
        this.A0C = x2;
        this.A0D = jz;
        this.A02 = i2;
        this.A01 = i3;
        A09(jSONObject, str);
    }

    private void A08(Map<String, String> map, Map<String, String> map2) {
        try {
            Map<String, String> urlParams = A03(map);
            new Handler().postDelayed(new C0985Ra(this, map2, urlParams), this.A04 * 1000);
        } catch (Exception unused) {
        }
    }

    private void A09(JSONObject jSONObject, String str) {
        if (!this.A0T) {
            if (jSONObject == null) {
                return;
            }
            LK.A02(this.A0C, A01(36, 23, 65));
            this.A0L = str;
            this.A0M = jSONObject.optString(A01(469, 10, 24));
            this.A00 = jSONObject.optInt(A01(224, 12, 8), 0);
            String strA02 = LY.A02(jSONObject, A01(343, 12, 45));
            this.A09 = TextUtils.isEmpty(strA02) ? null : Uri.parse(strA02);
            String[] strArr = new String[12];
            strArr[0] = A01(209, 15, 66);
            strArr[1] = A01(591, 5, 52);
            strArr[2] = A01(583, 8, 59);
            strArr[3] = A01(355, 8, 77);
            strArr[4] = A01(236, 4, 20);
            strArr[5] = A01(537, 14, 105);
            String[] strArr2 = A0b;
            if (strArr2[1].length() == strArr2[3].length()) {
                String[] strArr3 = A0b;
                strArr3[0] = "EgjH3";
                strArr3[7] = "aXmwT";
                strArr[6] = A01(393, 16, 65);
                strArr[7] = A01(551, 21, 28);
                strArr[8] = A01(195, 14, 8);
                strArr[9] = A01(449, 20, 83);
                strArr[10] = A01(433, 16, 83);
                strArr[11] = A01(416, 17, 81);
                for (String str2 : strArr) {
                    HashMap<String, String> map = this.A0R;
                    String key = LY.A02(jSONObject, str2);
                    map.put(str2, key);
                    if (A0b[4].charAt(15) == 'f') {
                        String[] strArr4 = A0b;
                        strArr4[5] = "eWhcqXkmKwACVp6tQL5WW3qntxITuvc7";
                        strArr4[5] = "eWhcqXkmKwACVp6tQL5WW3qntxITuvc7";
                    }
                }
                String strA01 = A01(240, 14, 59);
                String strA022 = LY.A02(jSONObject, strA01);
                if (!TextUtils.isEmpty(strA022)) {
                    HashMap<String, String> map2 = this.A0R;
                    if (A0b[6].charAt(13) != 'D') {
                        String[] strArr5 = A0b;
                        strArr5[6] = "fJLCRXTMzJxf7DhTFL7Dp6MTDwlQmm1t";
                        strArr5[6] = "fJLCRXTMzJxf7DhTFL7Dp6MTDwlQmm1t";
                        map2.put(strA01, strA022);
                    } else {
                        String[] strArr6 = A0b;
                        strArr6[2] = "EZfL37EHMq";
                        strArr6[2] = "EZfL37EHMq";
                        map2.put(strA01, strA022);
                    }
                }
                String callToAction = A01(363, 4, 70);
                this.A0G = C0803Ju.A00(jSONObject.optJSONObject(callToAction));
                String callToAction2 = A01(367, 5, 101);
                this.A0H = C0803Ju.A00(jSONObject.optJSONObject(callToAction2));
                String callToAction3 = A01(572, 11, 62);
                this.A0I = C0804Jv.A00(jSONObject.optJSONObject(callToAction3));
                String callToAction4 = A01(596, 15, 87);
                this.A0N = LY.A02(jSONObject, callToAction4);
                String callToAction5 = A01(328, 15, 40);
                this.A0Y = jSONObject.optBoolean(callToAction5);
                String callToAction6 = A01(309, 19, 29);
                this.A0Z = jSONObject.optBoolean(callToAction6);
                String callToAction7 = A01(IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED, 25, 29);
                this.A04 = jSONObject.optInt(callToAction7, 4);
                String callToAction8 = A01(487, 25, 47);
                this.A03 = jSONObject.optInt(callToAction8, 0);
                String callToAction9 = A01(679, 31, 117);
                this.A06 = jSONObject.optInt(callToAction9, 0);
                String callToAction10 = A01(710, 26, 75);
                this.A07 = jSONObject.optInt(callToAction10, 1000);
                String callToAction11 = A01(161, 15, 94);
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(callToAction11);
                if (jSONObjectOptJSONObject != null) {
                    this.A0F = C0803Ju.A00(jSONObjectOptJSONObject);
                }
                String callToAction12 = A01(176, 19, 86);
                this.A0K = LY.A02(jSONObject, callToAction12);
                String callToAction13 = A01(372, 21, 26);
                this.A0A = EnumC03320h.A00(jSONObject.optString(callToAction13));
                JSONArray jSONArray = null;
                try {
                    jSONArray = new JSONArray(jSONObject.optString(A01(292, 17, 116)));
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
                this.A0Q = C03340j.A01(jSONArray);
                this.A0P = LY.A02(jSONObject, A01(666, 9, 119));
                this.A08 = jSONObject.optLong(A01(642, 24, 56), -1L);
                this.A0O = LY.A02(jSONObject, A01(633, 9, 16));
                String strA012 = A01(611, 22, 101);
                if (!jSONObject.has(strA012)) {
                    this.A0J = EnumC0808Jz.A03;
                } else {
                    this.A0J = jSONObject.optBoolean(strA012) ? EnumC0808Jz.A05 : EnumC0808Jz.A04;
                }
                try {
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(A01(268, 8, 27));
                    if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                        int length = jSONArrayOptJSONArray.length();
                        ArrayList arrayList = new ArrayList(length);
                        for (int i2 = 0; i2 < length; i2++) {
                            C0986Rb c0986Rb = new C0986Rb();
                            c0986Rb.A07(this.A0C, jSONArrayOptJSONArray.getJSONObject(i2), this.A0D, this.A0L, i2, length);
                            arrayList.add(new C1320bj(this.A0C, c0986Rb, (C05418w) null, this.A0E));
                        }
                        this.A0S = arrayList;
                    }
                } catch (JSONException e3) {
                    this.A0C.A04().A86(A01(409, 7, 5), C05228d.A1o, new C05238e(e3));
                    String fbadCommand = A0c;
                    Log.e(fbadCommand, A01(131, 30, 41), e3);
                }
                this.A0T = true;
                this.A0U = A0A();
                return;
            }
            throw new RuntimeException();
        }
        throw new IllegalStateException(A01(9, 27, 116));
    }

    private boolean A0A() {
        if (((!this.A0W && !TextUtils.isEmpty(this.A0R.get(A01(209, 15, 66)))) || (!TextUtils.isEmpty(this.A0R.get(A01(591, 5, 52))) && this.A0W)) && (this.A0G != null || this.A0W)) {
            C0803Ju c0803Ju = this.A0H;
            if (A0b[2].length() != 10) {
                throw new RuntimeException();
            }
            String[] strArr = A0b;
            strArr[6] = "coz4LHwVNN2LSDndRSBnj9WvwXuRM5HO";
            strArr[6] = "coz4LHwVNN2LSDndRSBnj9WvwXuRM5HO";
            if (c0803Ju != null || A6l() == AdPlacementType.NATIVE_BANNER) {
                return true;
            }
        }
        return false;
    }

    public final int A0B() {
        return this.A00;
    }

    public final int A0C() {
        return this.A01;
    }

    public final int A0D() {
        return this.A02;
    }

    public final int A0E() {
        int i2 = this.A03;
        if (i2 < 0 || i2 > 100) {
            return 0;
        }
        return i2;
    }

    public final int A0F() {
        return this.A05;
    }

    public final int A0G() {
        return this.A06;
    }

    public final int A0H() {
        return this.A07;
    }

    public final C0803Ju A0I() {
        if (!A0g()) {
            return null;
        }
        return this.A0F;
    }

    public final C0803Ju A0J() {
        if (!A0g()) {
            return null;
        }
        return this.A0H;
    }

    public final C0803Ju A0K() {
        if (!A0g()) {
            return null;
        }
        return this.A0G;
    }

    public final C0804Jv A0L() {
        if (!A0g()) {
            return null;
        }
        A04();
        return this.A0I;
    }

    public final EnumC0808Jz A0M() {
        if (!A0g()) {
            return EnumC0808Jz.A03;
        }
        return this.A0J;
    }

    public final Long A0N() {
        if (!A0g()) {
            return -1L;
        }
        return Long.valueOf(this.A08);
    }

    public final String A0O() {
        if (!A0g()) {
            return null;
        }
        A04();
        return C0841Lk.A01(this.A0R.get(A01(236, 4, 20)));
    }

    public final String A0P() {
        if (!A0g()) {
            return null;
        }
        return this.A0K;
    }

    public final String A0Q() {
        if (A0g()) {
            return A01(0, 9, 87);
        }
        if (A0b[6].charAt(13) != 'D') {
            throw new RuntimeException();
        }
        String[] strArr = A0b;
        strArr[4] = "6LnlrboEXfVkWbJfSSNj7sObvXF9GrkL";
        strArr[4] = "6LnlrboEXfVkWbJfSSNj7sObvXF9GrkL";
        return null;
    }

    public final String A0R() {
        return this.A0M;
    }

    public final String A0S() {
        if (!A0g()) {
            return null;
        }
        return this.A0O;
    }

    public final String A0T() {
        if (!A0g()) {
            return null;
        }
        return this.A0P;
    }

    @Nullable
    public final String A0U(String str) {
        if (!A0g()) {
            return null;
        }
        A04();
        return this.A0R.get(str);
    }

    public final List<C1320bj> A0V() {
        if (!A0g()) {
            return null;
        }
        return this.A0S;
    }

    public final void A0W() {
        Iterator<C1320bj> it;
        List<C1320bj> list = this.A0S;
        if (list == null) {
            return;
        }
        boolean zIsEmpty = list.isEmpty();
        if (A0b[6].charAt(13) != 'D') {
            throw new RuntimeException();
        }
        String[] strArr = A0b;
        strArr[6] = "kj4WnsmCok25qDrlf1kxSYggARLvW33C";
        strArr[6] = "kj4WnsmCok25qDrlf1kxSYggARLvW33C";
        if (!zIsEmpty) {
            List<C1320bj> list2 = this.A0S;
            if (A0b[2].length() != 10) {
                it = list2.iterator();
            } else {
                String[] strArr2 = A0b;
                strArr2[2] = "wGXHpE1nya";
                strArr2[2] = "wGXHpE1nya";
                it = list2.iterator();
            }
            while (true) {
                boolean zHasNext = it.hasNext();
                if (A0b[2].length() != 10) {
                    String[] strArr3 = A0b;
                    strArr3[6] = "0lb5BUzW8n1EJDWyWAqaA7d0lZJNpkzV";
                    strArr3[6] = "0lb5BUzW8n1EJDWyWAqaA7d0lZJNpkzV";
                    if (!zHasNext) {
                        return;
                    }
                } else {
                    String[] strArr4 = A0b;
                    strArr4[5] = "QJQdkpg5cmGOeaue26HVF3aLtsB2qwfM";
                    strArr4[5] = "QJQdkpg5cmGOeaue26HVF3aLtsB2qwfM";
                    if (!zHasNext) {
                        return;
                    }
                }
                C1320bj internalNativeAd = it.next();
                internalNativeAd.unregisterView();
            }
        }
    }

    public final void A0X(AnonymousClass11 anonymousClass11) {
        this.A0B = anonymousClass11;
    }

    public final void A0Y(X2 x2, AnonymousClass11 anonymousClass11, JZ jz, Map<String, Object> map, InterfaceC0802Jt interfaceC0802Jt) {
        int iA06;
        this.A0C = x2;
        this.A0B = anonymousClass11;
        this.A0D = jz;
        this.A0E = interfaceC0802Jt;
        JSONObject jSONObject = (JSONObject) map.get(A01(278, 4, 14));
        C05418w c05418w = (C05418w) map.get(A01(282, 10, 42));
        if (c05418w != null) {
            iA06 = c05418w.A06();
        } else {
            iA06 = 200;
        }
        this.A05 = iA06;
        A09(jSONObject, LY.A02(jSONObject, A01(276, 2, 15)));
        if (C03340j.A04(x2, this, jz)) {
            x2.A0A().A41();
            anonymousClass11.AAL(this, new K7(AdErrorType.NO_FILL, A01(124, 7, 85)));
        } else if (anonymousClass11 != null) {
            anonymousClass11.AAI(this);
        }
    }

    public final void A0Z(Map<String, String> urlParams) {
        if (!A0g()) {
            return;
        }
        if (JT.A16(this.A0C) && M0.A04(urlParams)) {
            String str = A0c;
            if (A0b[4].charAt(15) != 'f') {
                throw new RuntimeException();
            }
            String[] strArr = A0b;
            strArr[6] = "D3JUlaax70Z19DqZX7Vx94n8SobUQcIP";
            strArr[6] = "D3JUlaax70Z19DqZX7Vx94n8SobUQcIP";
            Log.e(str, A01(59, 31, 2));
            return;
        }
        HashMap map = new HashMap();
        if (urlParams != null) {
            map.putAll(urlParams);
        }
        LK.A02(this.A0C, A01(90, 12, 73));
        AnonymousClass11 anonymousClass11 = this.A0B;
        if (anonymousClass11 != null) {
            anonymousClass11.AAH(this);
        }
        if (this.A0W) {
            map.put(A01(261, 7, 55), String.valueOf(this.A02));
            map.put(A01(254, 7, 70), String.valueOf(this.A01));
        }
        AbstractC03300f adAction = C03310g.A00(this.A0C, this.A0D, this.A0L, this.A09, map);
        if (adAction != null) {
            try {
                adAction.A0D();
            } catch (Exception e2) {
                Log.e(A0c, A01(102, 22, 63), e2);
            }
        }
    }

    public final void A0a(Map<String, String> map) {
        JZ jz = this.A0D;
        if (jz != null) {
            jz.A83(this.A0L, map);
        }
    }

    public final void A0b(Map<String, String> map) {
        if (A0g() && !this.A0V) {
            AnonymousClass11 anonymousClass11 = this.A0B;
            if (anonymousClass11 != null) {
                anonymousClass11.AAJ(this);
            }
            HashMap map2 = new HashMap();
            if (map != null) {
                map2.putAll(map);
            }
            if (this.A0W) {
                map2.put(A01(261, 7, 55), String.valueOf(this.A02));
                map2.put(A01(254, 7, 70), String.valueOf(this.A01));
            }
            if (!TextUtils.isEmpty(A5l()) && this.A0D != null) {
                if (!this.A0W) {
                    this.A0C.A0A().A2a();
                }
                this.A0D.A8A(A5l(), map2);
            }
            if (A0i() || A0j()) {
                A08(map, map2);
            }
            this.A0V = true;
        }
    }

    public final void A0c(Map<String, String> map) {
        JZ jz = this.A0D;
        if (jz != null) {
            jz.A8P(this.A0L, map);
        }
    }

    public final void A0d(Map<String, String> map) {
        JZ jz = this.A0D;
        if (jz != null) {
            jz.A8Q(this.A0L, map);
        }
    }

    public final boolean A0e() {
        return true;
    }

    public final boolean A0f() {
        return A0g() && this.A09 != null;
    }

    public final boolean A0g() {
        return this.A0T && this.A0U;
    }

    public final boolean A0h() {
        return this.A0W;
    }

    public final boolean A0i() {
        if (JT.A0s(this.A0C) && A0g()) {
            boolean z = this.A0Y;
            if (A0b[4].charAt(15) != 'f') {
                throw new RuntimeException();
            }
            String[] strArr = A0b;
            strArr[6] = "hsrOxssvGH6abDOIeI9T6FJFSNjQSl4a";
            strArr[6] = "hsrOxssvGH6abDOIeI9T6FJFSNjQSl4a";
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final boolean A0j() {
        if (JT.A0s(this.A0C) && A0g()) {
            boolean z = this.A0Z;
            String[] strArr = A0b;
            if (strArr[0].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0b;
            strArr2[2] = "qputmJyOXU";
            strArr2[2] = "qputmJyOXU";
            if (z) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03330i, com.facebook.ads.redexgen.X.InterfaceC03380n
    public final String A5l() {
        return this.A0L;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03330i
    public final Collection<String> A63() {
        return this.A0Q;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03330i
    public final EnumC03320h A6T() {
        return this.A0A;
    }

    public AdPlacementType A6l() {
        return AdPlacementType.NATIVE;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03380n
    public final void onDestroy() {
    }
}
