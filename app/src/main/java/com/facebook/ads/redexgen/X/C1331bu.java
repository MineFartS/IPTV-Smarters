package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1331bu implements JZ {

    @Nullable
    @SuppressLint({"StaticFieldLeak"})
    public static JZ A03;
    public static byte[] A04;
    public static final String A05;
    public static volatile boolean A06;
    public final X3 A00;
    public final C9J A01;
    public final JY A02;

    public static String A02(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 79);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{-90, -21, -4, -21, -12, -6, -76, -88, -37, -37, -52, -44, -41, -37, -48, -43, -50, -121, -37, -42, -121, -45, -42, -50, -121, -56, -43, -121, -48, -43, -35, -56, -45, -48, -53, -121};
    }

    static {
        A03();
        A05 = C1331bu.class.getSimpleName();
        A06 = false;
    }

    public C1331bu(X3 x3) {
        JX jxA00;
        this.A00 = x3;
        if (JU.A0T(x3)) {
            this.A01 = C9H.A00(x3);
            jxA00 = C0786Jd.A01(x3, this.A01);
        } else {
            DJ djA01 = C9H.A01(x3);
            jxA00 = C0786Jd.A00(x3, djA01);
            this.A01 = djA01;
        }
        this.A02 = new C1328br(x3, jxA00);
        M4.A08.execute(new C1329bs(this));
        A04(x3);
    }

    public static synchronized JZ A01(X3 x3) {
        if (A03 == null) {
            A03 = new C1331bu(x3);
        }
        return A03;
    }

    public static synchronized void A04(X3 x3) {
        if (A06) {
            return;
        }
        DynamicLoaderFactory.makeLoader(x3).getInitApi().onAdEventManagerCreated(x3);
        A06 = true;
    }

    private void A05(JW jw) {
        if (!jw.A0B()) {
            Log.e(A05, A02(7, 29, 24) + jw.A07() + A02(0, 7, 55));
            return;
        }
        this.A01.ADy(jw, new C1330bt(this, jw));
    }

    @Override // com.facebook.ads.redexgen.X.JZ
    public final void A7z(String str, Map<String, String> map) {
        A05(new JV().A04(str).A00(this.A00.A05().A01()).A03(this.A00.A05().A02()).A05(map).A01(EnumC0783Ja.A04).A02(EnumC0784Jb.A04).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.JZ
    public final void A82(String str, Map<String, String> map) {
        A05(new JV().A04(str).A00(this.A00.A05().A01()).A03(this.A00.A05().A02()).A05(map).A01(EnumC0783Ja.A04).A02(EnumC0784Jb.A06).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.JZ
    public final void A83(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new JV().A04(str).A00(this.A00.A05().A01()).A03(this.A00.A05().A02()).A05(map).A01(EnumC0783Ja.A04).A02(EnumC0784Jb.A07).A06(C0791Ji.A0A(str, EnumC0788Jf.A0I)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.JZ
    public final void A84(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new JV().A04(str).A00(this.A00.A05().A01()).A03(this.A00.A05().A02()).A05(map).A01(EnumC0783Ja.A04).A02(EnumC0784Jb.A08).A06(C0791Ji.A0A(str, EnumC0788Jf.A06)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.JZ
    public final void A85(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new JV().A04(str).A00(this.A00.A05().A01()).A03(this.A00.A05().A02()).A05(map).A01(EnumC0783Ja.A04).A02(EnumC0784Jb.A0B).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.JZ
    public final void A88(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new JV().A04(str).A00(this.A00.A05().A01()).A03(this.A00.A05().A02()).A05(map).A01(EnumC0783Ja.A04).A02(EnumC0784Jb.A0C).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.JZ
    public final void A8A(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new JV().A04(str).A00(this.A00.A05().A01()).A03(this.A00.A05().A02()).A05(map).A01(EnumC0783Ja.A05).A02(EnumC0784Jb.A0D).A06(C0791Ji.A0A(str, EnumC0788Jf.A0T)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.JZ
    public final void A8B(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new JV().A04(str).A00(this.A00.A05().A01()).A03(this.A00.A05().A02()).A05(map).A01(EnumC0783Ja.A05).A02(EnumC0784Jb.A0E).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.JZ
    public final void A8C(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new JV().A04(str).A00(this.A00.A05().A01()).A03(this.A00.A05().A02()).A05(map).A01(EnumC0783Ja.A05).A02(EnumC0784Jb.A0H).A06(C0791Ji.A0A(str, EnumC0788Jf.A0V)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.JZ
    public final void A8E(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new JV().A04(str).A00(this.A00.A05().A01()).A03(this.A00.A05().A02()).A05(map).A01(EnumC0783Ja.A04).A02(EnumC0784Jb.A0G).A06(C0791Ji.A0A(str, EnumC0788Jf.A0W)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.JZ
    public final void A8G(String str, Map<String, String> map, String str2, EnumC0783Ja enumC0783Ja) {
        A05(new JV().A04(str).A00(this.A00.A05().A01()).A03(this.A00.A05().A02()).A05(map).A01(enumC0783Ja).A02(EnumC0784Jb.A00(str2)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.JZ
    public final void A8H(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new JV().A04(str).A00(this.A00.A05().A01()).A03(this.A00.A05().A02()).A05(map).A01(EnumC0783Ja.A04).A02(EnumC0784Jb.A0I).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.JZ
    public final void A8L(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new JV().A04(str).A00(this.A00.A05().A01()).A03(this.A00.A05().A02()).A01(EnumC0783Ja.A04).A02(EnumC0784Jb.A0K).A06(C0791Ji.A0A(str, EnumC0788Jf.A0Y)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.JZ
    public final void A8N(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new JV().A04(str).A00(this.A00.A05().A01()).A03(this.A00.A05().A02()).A05(map).A01(EnumC0783Ja.A04).A02(EnumC0784Jb.A0F).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.JZ
    public final void A8O(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new JV().A04(str).A00(this.A00.A05().A01()).A03(this.A00.A05().A02()).A05(map).A01(EnumC0783Ja.A05).A02(EnumC0784Jb.A0L).A06(C0791Ji.A0A(str, EnumC0788Jf.A0c)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.JZ
    public final void A8P(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new JV().A04(str).A00(this.A00.A05().A01()).A03(this.A00.A05().A02()).A05(map).A01(EnumC0783Ja.A04).A02(EnumC0784Jb.A0P).A06(C0791Ji.A0A(str, EnumC0788Jf.A0e)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.JZ
    public final void A8Q(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new JV().A04(str).A00(this.A00.A05().A01()).A03(this.A00.A05().A02()).A05(map).A01(EnumC0783Ja.A04).A02(EnumC0784Jb.A0O).A06(C0791Ji.A0A(str, EnumC0788Jf.A0f)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.JZ
    public final void A8R(String str, Map<String, String> map) {
        A05(new JV().A04(str).A00(this.A00.A05().A01()).A03(this.A00.A05().A02()).A05(map).A01(EnumC0783Ja.A05).A02(EnumC0784Jb.A0Q).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.JZ
    public final void A8T(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new JV().A04(str).A00(this.A00.A05().A01()).A03(this.A00.A05().A02()).A05(map).A01(EnumC0783Ja.A05).A02(EnumC0784Jb.A0R).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.JZ
    public final void ABi(String str) {
        new QR(this.A00).execute(str);
    }
}
