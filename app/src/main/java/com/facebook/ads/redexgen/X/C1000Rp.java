package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.facebook.ads.AdError;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.RewardData;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Rp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1000Rp implements InterfaceC03470w {
    public static byte[] A04;
    public static String[] A05;

    @Nullable
    public C7C A00;
    public EnumC0898Nq A01 = EnumC0898Nq.A06;
    public final C0996Rl A02;
    public final C1Y A03;

    static {
        A06();
        A05();
    }

    public static String A04(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 96);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A04 = new byte[]{-97, -39, -27, -34, -35, -81, -44, -38, -53, -40, -44, -57, -46, -122, -85, -40, -40, -43, -40, -122, -104, -106, -106, -100, -122, -35, -49, -38, -50, -43, -37, -38, -122, -57, -122, -36, -57, -46, -49, -54, -122, -89, -54, -81, -44, -52, -43, -108, 31, 34, 29, 34, 31, 50, 31, 29, 32, 51, 44, 34, 42, 35, -45, -30, -37, -58, -61, -42, -61, -41, -40, -39, -36, -31, -36, -25, -36, -30, -31, -38, -33, -27, -42, -29, -28, -27, -38, -27, -38, -46, -35};
    }

    public static void A06() {
        A05 = new String[]{"jJreqFAWfQsm2UlBXjWleQZy51A8w9r3", "B5vxrqY9e1pfFDILbPSJEQZe5Zep9JAF", "7hwRhDIA2xM98ucsNVPICP0872", "8yYdfjKxcW1uK5E8nS4F9bT", "cwoTvwLLOWGZrFwonmn2qn9xu", "wuc4L", "VoE60CbUCih", "1JGxuEjawtyxaKItdz1AQ1lnM"};
    }

    public C1000Rp(X2 x2, Map<String, Object> map, C1Y c1y, @Nullable String str) {
        this.A02 = A01(x2, map, str, (JSONObject) map.get(A04(65, 4, 2)));
        this.A03 = c1y;
    }

    @Nullable
    private AdError A00(X2 x2) {
        if (this.A02.A0W().isEmpty()) {
            x2.A04().A86(A04(62, 3, 18), C05228d.A0O, new C05238e(A04(5, 43, 6)));
            return AdError.internalError(AdError.INTERNAL_ERROR_2006);
        }
        return null;
    }

    public static C0996Rl A01(X2 x2, Map<String, Object> map, @Nullable String str, JSONObject jSONObject) {
        C0996Rl adDataBundle = C0996Rl.A01(jSONObject, x2);
        adDataBundle.A0b(str);
        C05418w c05418w = (C05418w) map.get(A04(69, 10, 19));
        if (c05418w != null) {
            adDataBundle.A0Z(c05418w.A06());
        }
        return adDataBundle;
    }

    private C7C A03(X2 x2) {
        C7C c7c = this.A00;
        return c7c != null ? c7c : new C7C(x2);
    }

    private void A07(X2 x2, EnumSet<CacheFlag> enumSet) {
        EnumC0898Nq enumC0898NqA0B;
        C1S c1sA06 = this.A02.A0M().A0E().A06();
        if (c1sA06 != null) {
            enumC0898NqA0B = c1sA06.A0B();
        } else {
            enumC0898NqA0B = EnumC0898Nq.A06;
        }
        A09(enumC0898NqA0B);
        C0999Ro c0999Ro = new C0999Ro(this);
        C7C c7c = new C7C(x2);
        C03541d c03541d = new C03541d(this, this.A02, A04(79, 12, 17), c7c);
        if (c03541d.A09()) {
            c7c.A0X(new C0789Jg(this.A02.A0Q(), x2.A06()));
            c03541d.A08();
            return;
        }
        C0996Rl c0996Rl = this.A02;
        if (A05[5].length() != 5) {
            throw new RuntimeException();
        }
        String[] strArr = A05;
        strArr[5] = "kxumv";
        strArr[5] = "kxumv";
        C03591i.A03(x2, c0996Rl, true, c0999Ro);
    }

    private void A08(X2 x2, EnumSet<CacheFlag> enumSet) {
        C7C c7cA03 = A03(x2);
        C0789Jg funnelLoggingHandler = new C0789Jg(this.A02.A0Q(), x2.A06());
        c7cA03.A0X(funnelLoggingHandler);
        C0996Rl c0996Rl = this.A02;
        String strA04 = A04(79, 12, 17);
        C03541d c03541d = new C03541d(this, c0996Rl, strA04, c7cA03);
        if (c03541d.A09()) {
            c03541d.A08();
            return;
        }
        if (!TextUtils.isEmpty(this.A02.A0R())) {
            C7B c7b = new C7B(this.A02.A0R(), this.A02.A0U(), strA04);
            c7b.A04 = true;
            c7b.A03 = A04(0, 5, 17);
            c7cA03.A0T(c7b);
        }
        c7cA03.A0S(new AnonymousClass79(this.A02.A0O().A01(), C0918Ok.A04, C0918Ok.A04, this.A02.A0U(), A04(79, 12, 17)));
        boolean zContains = enumSet.contains(CacheFlag.VIDEO);
        int i2 = 0;
        for (AnonymousClass19 anonymousClass19 : this.A02.A0W()) {
            AnonymousClass79 anonymousClass79 = new AnonymousClass79(anonymousClass19.A0E().A07(), C03551e.A00(anonymousClass19.A0E()), C03551e.A01(anonymousClass19.A0E()), this.A02.A0U(), A04(79, 12, 17));
            if (i2 == 0) {
                c7cA03.A0R(anonymousClass79);
            } else {
                c7cA03.A0S(anonymousClass79);
            }
            Iterator<String> it = anonymousClass19.A0H().A00().iterator();
            while (it.hasNext()) {
                c7cA03.A0S(new AnonymousClass79(it.next(), -1, -1, this.A02.A0U(), A04(79, 12, 17)));
            }
            if (zContains && !TextUtils.isEmpty(anonymousClass19.A0E().A08())) {
                C7B c7b2 = new C7B(anonymousClass19.A0E().A08(), this.A02.A0U(), A04(79, 12, 17), anonymousClass19.A0E().A05());
                c7b2.A04 = false;
                if (i2 == 0) {
                    c7cA03.A0W(c7b2);
                } else {
                    c7cA03.A0V(c7b2);
                }
            }
            i2++;
        }
        c7cA03.A0Q(new C0998Rn(this), new AnonymousClass75(this.A02.A0U(), strA04));
    }

    private void A09(EnumC0898Nq enumC0898Nq) {
        this.A01 = enumC0898Nq;
    }

    public final EnumC0814Kg A0A() {
        if (!TextUtils.isEmpty(this.A02.A0R()) && Build.VERSION.SDK_INT >= 21) {
            EnumC0814Kg enumC0814Kg = EnumC0814Kg.A03;
            String[] strArr = A05;
            if (strArr[6].length() != strArr[2].length()) {
                String[] strArr2 = A05;
                strArr2[3] = "f4kXngrP8CD5dz";
                strArr2[3] = "f4kXngrP8CD5dz";
                return enumC0814Kg;
            }
        } else {
            if (this.A02.A0W().size() > 1) {
                return EnumC0814Kg.A06;
            }
            C0996Rl c0996Rl = this.A02;
            String[] strArr3 = A05;
            if (strArr3[7].length() == strArr3[4].length()) {
                String[] strArr4 = A05;
                strArr4[3] = "ny";
                strArr4[3] = "ny";
                if (c0996Rl.A0M().A0E().A06() != null) {
                    return EnumC0814Kg.A08;
                }
                boolean zA0G = A0G();
                String[] strArr5 = A05;
                if (strArr5[6].length() == strArr5[2].length()) {
                    throw new RuntimeException();
                }
                String[] strArr6 = A05;
                strArr6[3] = "JH";
                strArr6[3] = "JH";
                if (zA0G) {
                    EnumC0814Kg enumC0814Kg2 = EnumC0814Kg.A09;
                    if (A05[3].length() != 32) {
                        String[] strArr7 = A05;
                        strArr7[1] = "93R6MUXHMTxUt8WfLt1oZ3ea5zubl3sl";
                        strArr7[0] = "9xXPI1nVQC4CSUB4soKlPH985bh9DAt9";
                        return enumC0814Kg2;
                    }
                    String[] strArr8 = A05;
                    strArr8[3] = "ySAy4b6nQ";
                    strArr8[3] = "ySAy4b6nQ";
                    return enumC0814Kg2;
                }
                return EnumC0814Kg.A07;
            }
        }
        throw new RuntimeException();
    }

    public final EnumC0898Nq A0B() {
        return this.A01;
    }

    public final String A0C() {
        return this.A02.A0Q();
    }

    public final void A0D() {
        this.A03.ADe();
    }

    public final void A0E(Intent intent, RewardData rewardData, String str) {
        this.A02.A0a(rewardData);
        this.A02.A0d(str);
        intent.putExtra(A04(48, 14, 94), this.A02);
    }

    public final void A0F(X2 x2, EnumSet<CacheFlag> enumSet) {
        AdError adErrorA00 = A00(x2);
        if (adErrorA00 != null) {
            this.A03.A8p(adErrorA00);
            return;
        }
        this.A03.ACD();
        if (A0A() == EnumC0814Kg.A08) {
            A07(x2, enumSet);
        } else {
            A08(x2, enumSet);
        }
    }

    public final boolean A0G() {
        return !TextUtils.isEmpty(this.A02.A0M().A0E().A08());
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03470w
    public final void A9A() {
        this.A03.A8q();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03470w
    public final void A9B() {
        this.A03.A8p(AdError.CACHE_ERROR);
    }
}
