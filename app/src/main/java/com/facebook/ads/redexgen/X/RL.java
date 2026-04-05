package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.joda.time.DateTimeFieldType;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class RL implements C0S {
    public static byte[] A06;
    public static String[] A07;
    public final RN A00;
    public final AtomicReference<String> A04 = new AtomicReference<>();
    public final AtomicReference<String> A03 = new AtomicReference<>();
    public final AtomicReference<EnumC03280d> A05 = new AtomicReference<>();
    public final UUID A01 = UUID.randomUUID();
    public final AtomicInteger A02 = new AtomicInteger(1);

    static {
        A03();
        A02();
    }

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 95);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A06 = new byte[]{5, DateTimeFieldType.MILLIS_OF_DAY, DateTimeFieldType.HALFDAY_OF_DAY, DateTimeFieldType.HALFDAY_OF_DAY, 6, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 60, DateTimeFieldType.CLOCKHOUR_OF_DAY, 6, DateTimeFieldType.MINUTE_OF_DAY};
        String[] strArr = A07;
        if (strArr[7].length() != strArr[3].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A07;
        strArr2[2] = "yQ17NavN7ZSoq7zHySEgN4tR7loqT";
        strArr2[2] = "yQ17NavN7ZSoq7zHySEgN4tR7loqT";
    }

    public static void A03() {
        A07 = new String[]{"nHMpSWMsnsV7ze4k7TMdpo8w7eAhh5yl", "NZIGXtqvLJqJvnsqDFZQPtZx", "Ad1TvQCscaWcF7stMWLl9lRlqQAvL", "Ujq4dS9mEeqxvShJwD8UISSMYbM", "6D9", "oL3lqgBhSNj2gXyheQdgS3kbnnn96fNg", "3X2AVVUyUAfxSvaFg1Rh03BQkiDduKF9", "x5OfLFoNyht1tsSSgvPC5bYcCNR"};
    }

    public RL(RN rn) {
        this.A00 = rn;
    }

    public final void A04(C0U c0u, C0X... c0xArr) throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (C0X c0x : c0xArr) {
                c0x.A02(jSONObject);
            }
            try {
                jSONObject.put(A01(0, 10, 60), this.A02.getAndIncrement());
            } catch (JSONException unused) {
            }
            C0Y.A0E.A02(this.A01).A02(jSONObject);
            String str = this.A04.get();
            if (!TextUtils.isEmpty(str)) {
                C0Y.A0P.A03(str).A02(jSONObject);
            }
            String str2 = this.A03.get();
            if (!TextUtils.isEmpty(str2)) {
                C0Y.A0O.A03(str2).A02(jSONObject);
            }
            EnumC03280d enumC03280d = this.A05.get();
            if (enumC03280d != null) {
                C0Y.A0D.A03(enumC03280d).A02(jSONObject);
            }
            this.A00.A00(c0u, jSONObject);
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
            String[] strArr = A07;
            if (strArr[7].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[0] = "Ggy2RwA8vUf08bZktoWyq4zTcOxlTfhb";
            strArr2[0] = "Ggy2RwA8vUf08bZktoWyq4zTcOxlTfhb";
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2R(String str, int i2) throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0R, C0Y.A0G.A02(Integer.valueOf(i2)));
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2S(String str) throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0S, C0Y.A0K.A03(str));
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2T(String str) throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0T, C0Y.A0K.A03(str));
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2U(String str) throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0U, C0Y.A0K.A03(str));
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2V(String str) throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0V, C0Y.A0K.A03(str));
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2W(String str) throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0W, C0Y.A0K.A03(str));
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2X(String str) throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0X, C0Y.A0K.A03(str));
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2Y() throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0i, new C0X[0]);
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2Z() throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0Y, new C0X[0]);
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2a() throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0v, new C0X[0]);
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2b() throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0w, new C0X[0]);
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2c(boolean z) throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0Z, C0Y.A02.A03(Boolean.valueOf(z)));
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2d(long j2, int i2, String str) throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0x, C0Y.A0F.A02(Integer.valueOf(i2)), C0Y.A0L.A03(str), C0Y.A0J.A03(Long.valueOf(j2)));
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2e() throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0z, new C0X[0]);
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2f() throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0y, new C0X[0]);
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2g() throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            A04(C0U.A10, new C0X[0]);
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2h(long j2) throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            A04(C0U.A11, C0Y.A0J.A03(Long.valueOf(j2)));
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2i(C0R c0r) throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1c, C0Y.A01.A03(c0r));
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2j(String str) throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            this.A03.set(str);
            A04(C0U.A0a, new C0X[0]);
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2k() throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0b, new C0X[0]);
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2l() throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0c, new C0X[0]);
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2m(long j2, int i2, String str, boolean z) throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0d, C0Y.A0J.A03(Long.valueOf(j2)), C0Y.A0F.A02(Integer.valueOf(i2)), C0Y.A0L.A03(str), C0Y.A09.A03(Boolean.valueOf(z)));
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2n(long j2) throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0e, C0Y.A0J.A03(Long.valueOf(j2)));
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2o(boolean z) throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            A04(C0U.A18, C0Y.A0C.A03(Boolean.valueOf(z)));
        } catch (Throwable th) {
            String[] strArr = A07;
            if (strArr[7].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[6] = "gK8mXYwR0ckPpFtcTSNh6868pPwacmBZ";
            strArr2[6] = "gK8mXYwR0ckPpFtcTSNh6868pPwacmBZ";
            C0822Kp.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2p() throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            A04(C0U.A19, new C0X[0]);
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2q() throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1C, new C0X[0]);
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2r(String str) throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1D, C0Y.A0L.A03(str));
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2s() throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1E, new C0X[0]);
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2t() throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1F, new C0X[0]);
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2u() throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1G, new C0X[0]);
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2v(int i2) throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1H, C0Y.A0G.A02(Integer.valueOf(i2)));
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2w() throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1I, new C0X[0]);
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2x() throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1L, new C0X[0]);
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2y() throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1J, new C0X[0]);
        } catch (Throwable th) {
            if (A07[6].charAt(19) != 'h') {
                throw new RuntimeException();
            }
            String[] strArr = A07;
            strArr[6] = "TXE2cMU86vxtF7wI18ThzZXaU0uTRMLS";
            strArr[6] = "TXE2cMU86vxtF7wI18ThzZXaU0uTRMLS";
            C0822Kp.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2z(int i2) throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1K, C0Y.A0G.A02(Integer.valueOf(i2)));
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A30() throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1M, new C0X[0]);
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A31(String str) throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1N, C0Y.A0M.A03(str));
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A32() throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1O, new C0X[0]);
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A33() throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1P, new C0X[0]);
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A34() throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1Q, new C0X[0]);
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A35() throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1R, new C0X[0]);
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A36(int i2) throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1S, C0Y.A0G.A02(Integer.valueOf(i2)));
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A37() throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1T, new C0X[0]);
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A38(int i2) throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1U, C0Y.A0G.A02(Integer.valueOf(i2)));
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A39() throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1e, new C0X[0]);
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
            if (A07[4].length() != 3) {
                throw new RuntimeException();
            }
            String[] strArr = A07;
            strArr[6] = "VZoNBueTz9dHgRCK2oHhqd2tucTd08Xg";
            strArr[6] = "VZoNBueTz9dHgRCK2oHhqd2tucTd08Xg";
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A3A() throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1f, new C0X[0]);
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A3B(C0R c0r) throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1b, C0Y.A01.A03(c0r));
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A3C(int i2) throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1d, C0Y.A0H.A02(Integer.valueOf(i2)));
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A3D() throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1g, new C0X[0]);
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A3v(long j2) throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0g, C0Y.A0J.A03(Long.valueOf(j2)));
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
            if (A07[0].charAt(15) != 'k') {
                throw new RuntimeException();
            }
            String[] strArr = A07;
            strArr[1] = "iGvSb1Hz3BIwYRP6JXvlZVW4";
            strArr[1] = "iGvSb1Hz3BIwYRP6JXvlZVW4";
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A3w(long j2) throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0h, C0Y.A0J.A03(Long.valueOf(j2)));
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A41() throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0j, new C0X[0]);
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A4W() throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0k, new C0X[0]);
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A4X() throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0o, new C0X[0]);
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A4Y(boolean z) throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0f, C0Y.A08.A03(Boolean.valueOf(z)));
        } catch (Throwable th) {
            if (A07[1].length() == 19) {
                throw new RuntimeException();
            }
            String[] strArr = A07;
            strArr[5] = "sws4bQbg9GprWoTPEe05ZlT1gMn94mHS";
            strArr[5] = "sws4bQbg9GprWoTPEe05ZlT1gMn94mHS";
            C0822Kp.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A4Z(int i2, String str) throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0p, C0Y.A0F.A02(Integer.valueOf(i2)), C0Y.A0L.A03(str));
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A4a(boolean z) throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0n, C0Y.A04.A03(Boolean.valueOf(z)));
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A4b() throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0r, new C0X[0]);
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A4c() throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0s, new C0X[0]);
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A4d() throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0t, new C0X[0]);
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A4e() throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0u, new C0X[0]);
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A8c(String str) throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            A04(C0U.A12, C0Y.A0L.A03(str));
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A8d(int i2) throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            A04(C0U.A13, C0Y.A0H.A02(Integer.valueOf(i2)));
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
            if (A07[4].length() != 3) {
                throw new RuntimeException();
            }
            String[] strArr = A07;
            strArr[1] = "n4mJfQKCjkVGyNTXc44lq1NfZCr";
            strArr[1] = "n4mJfQKCjkVGyNTXc44lq1NfZCr";
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A8f() throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            A04(C0U.A14, new C0X[0]);
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
            if (A07[5].charAt(28) == 'u') {
                throw new RuntimeException();
            }
            String[] strArr = A07;
            strArr[0] = "A3lONLTCXWx4KhpkbRCT5RNlo5C8otzX";
            strArr[0] = "A3lONLTCXWx4KhpkbRCT5RNlo5C8otzX";
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void ACE(String str) throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            A04(C0U.A16, C0Y.A0L.A03(str));
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void ACF() throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            A04(C0U.A17, new C0X[0]);
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void AD8(String str) throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            this.A04.set(str);
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void ADA(EnumC03280d enumC03280d) throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            this.A05.set(enumC03280d);
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void ADj() throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1B, new C0X[0]);
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void ADk() throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1h, new C0X[0]);
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void ADl() throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1i, new C0X[0]);
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void ADm() throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1j, new C0X[0]);
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void ADn() throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1k, new C0X[0]);
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void ADo(boolean z) throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1l, C0Y.A03.A03(Boolean.valueOf(z)));
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void ADp() throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1m, new C0X[0]);
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void ADq() throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1n, new C0X[0]);
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void ADr(int i2, @Nullable String str) throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1o, C0Y.A0F.A02(Integer.valueOf(i2)), C0Y.A0L.A03(str));
        } catch (Throwable th) {
            if (A07[0].charAt(15) != 'k') {
                throw new RuntimeException();
            }
            String[] strArr = A07;
            strArr[2] = "2PKYVe8Qgwv7j3CDJ6bxblARvZgyh";
            strArr[2] = "2PKYVe8Qgwv7j3CDJ6bxblARvZgyh";
            C0822Kp.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void ADs(boolean z) throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1p, C0Y.A07.A03(Boolean.valueOf(z)));
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void ADt() throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1q, new C0X[0]);
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void ADu(String str) throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1r, C0Y.A0L.A03(str));
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void ADv() throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1s, new C0X[0]);
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void ADw(int i2) throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1t, C0Y.A0I.A02(Integer.valueOf(i2)));
        } catch (Throwable th) {
            String[] strArr = A07;
            if (strArr[7].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[2] = "bm6dbMytZvpqzg8D3QKVLEJHQj3Ec";
            strArr2[2] = "bm6dbMytZvpqzg8D3QKVLEJHQj3Ec";
            C0822Kp.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void AE1(String str) throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1V, C0Y.A0L.A03(str));
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void AE2(String str) throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1W, C0Y.A0L.A03(str));
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
            if (A07[1].length() == 19) {
                throw new RuntimeException();
            }
            String[] strArr = A07;
            strArr[5] = "ivuB5Sydf2jbsPKu7So7nbx7xRGWOHbH";
            strArr[5] = "ivuB5Sydf2jbsPKu7So7nbx7xRGWOHbH";
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final String getId() throws Throwable {
        if (C0822Kp.A02(this)) {
            return null;
        }
        try {
            return this.A01.toString();
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
            return null;
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void unregisterView() throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1A, new C0X[0]);
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }
}
