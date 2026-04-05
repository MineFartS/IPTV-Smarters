package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C03541d {
    public static byte[] A0C;
    public static String[] A0D;
    public InterfaceC03470w A00;
    public AnonymousClass16 A01;
    public C7C A02;
    public String A03;
    public String A04;
    public List<C1Z> A05;
    public List<C03511a> A06;
    public List<C03521b> A07;
    public List<C1Z> A08;
    public List<C03511a> A09;
    public List<C03521b> A0A;
    public boolean A0B;

    static {
        A06();
        A05();
    }

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0C, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 61);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A0C = new byte[]{70, 97, 121, 110, 99, 102, 107, 47, 76, 110, 108, 103, 106, 71, 106, 99, 127, 106, 125, 47, 102, 124, 47, 123, 125, 118, 102, 97, 104, 47, 123, 96, 47, 108, 110, 108, 103, 106, 47, 110, 124, 124, 106, 123, 124, 98, 96, 98, 105, 100, 94, 108, 96, 111, 101, 96, 117, 110, 115, 120, 94, 103, 104, 109, 100, 114, 71, 69, 71, 76, 65, 123, 73, 69, 74, 64, 69, 80, 75, 86, 93, 123, 77, 73, 69, 67, 65, 87, 81, 83, 81, 90, 87, 109, 95, 83, 92, 86, 83, 70, 93, 64, 75, 109, 68, 91, 86, 87, 93, 65};
    }

    public static void A06() {
        A0D = new String[]{"sSa", "mi5m9ruhoFx", BuildConfig.FLAVOR, "s1wudweLxGs6i20t889bnIZHd8X0m2eo", "Fcx9vpMoDT8ZievIpIvDEirtE1Us4xir", "sWXb4LdtlKvePJz7J6b2Ft", "9VqadD5Zvd9D5BEd6Wk7rSckzIYQNWUp", "eNXwk482U"};
    }

    public C03541d(InterfaceC03470w interfaceC03470w, AnonymousClass16 anonymousClass16, String str, C7C c7c) {
        this.A01 = anonymousClass16;
        if (!A09()) {
            this.A0B = false;
            return;
        }
        this.A0B = true;
        JSONObject jSONObjectA0X = this.A01.A0X();
        this.A00 = interfaceC03470w;
        try {
            this.A06 = C03531c.A05(jSONObjectA0X);
            this.A07 = C03531c.A06(jSONObjectA0X);
            this.A05 = C03531c.A04(jSONObjectA0X);
            this.A09 = C03531c.A08(jSONObjectA0X);
            this.A0A = C03531c.A09(jSONObjectA0X);
            this.A08 = C03531c.A07(jSONObjectA0X);
        } catch (IllegalStateException unused) {
            this.A00.A9B();
        }
        this.A04 = anonymousClass16.A0U();
        this.A03 = str;
        this.A02 = c7c;
    }

    private void A02() {
        Iterator<C1Z> it;
        Iterator<C03511a> it2 = this.A06.iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            if (A0D[7].length() != 9) {
                throw new RuntimeException();
            }
            String[] strArr = A0D;
            strArr[2] = "s43HwKDQ";
            strArr[2] = "s43HwKDQ";
            if (zHasNext) {
                C03511a next = it2.next();
                this.A02.A0R(new AnonymousClass79(next.A02(), next.A00(), next.A01(), this.A04, this.A03));
            } else {
                for (C03521b c03521b : this.A07) {
                    this.A02.A0W(new C7B(c03521b.A01(), this.A04, this.A03, c03521b.A00()));
                }
                List<C1Z> list = this.A05;
                if (A0D[2].length() != 15) {
                    String[] strArr2 = A0D;
                    strArr2[5] = "Ng223TSybiacEU1WWPLk2q";
                    strArr2[5] = "Ng223TSybiacEU1WWPLk2q";
                    it = list.iterator();
                } else {
                    String[] strArr3 = A0D;
                    strArr3[7] = "18SymYfpU";
                    strArr3[7] = "18SymYfpU";
                    it = list.iterator();
                }
                while (true) {
                    boolean zHasNext2 = it.hasNext();
                    if (A0D[7].length() != 9) {
                        throw new RuntimeException();
                    }
                    String[] strArr4 = A0D;
                    strArr4[4] = "gi3GLNiIWCAwlyNF5UJWvDNlEZ56BupW";
                    strArr4[4] = "gi3GLNiIWCAwlyNF5UJWvDNlEZ56BupW";
                    if (zHasNext2) {
                        C1Z next2 = it.next();
                        C7B cacheFileData = new C7B(next2.A01(), this.A04, this.A03);
                        cacheFileData.A04 = !next2.A00().equals(A01(0, 0, 60));
                        cacheFileData.A03 = next2.A00();
                        this.A02.A0T(cacheFileData);
                    } else {
                        return;
                    }
                }
            }
        }
    }

    private void A03() {
        for (C03511a c03511a : this.A09) {
            this.A02.A0S(new AnonymousClass79(c03511a.A02(), c03511a.A00(), c03511a.A01(), this.A04, this.A03));
        }
        List<C03521b> list = this.A0A;
        if (A0D[7].length() != 9) {
            throw new RuntimeException();
        }
        String[] strArr = A0D;
        strArr[2] = "XaDaKpjcAfkqTK4VX";
        strArr[2] = "XaDaKpjcAfkqTK4VX";
        for (C03521b videoCacheData : list) {
            this.A02.A0V(new C7B(videoCacheData.A01(), this.A04, this.A03));
        }
        for (C1Z c1z : this.A08) {
            C7B c7b = new C7B(c1z.A01(), this.A04, this.A03);
            c7b.A04 = !c1z.A00().equals(A01(0, 0, 60));
            c7b.A03 = c1z.A00();
            this.A02.A0U(c7b);
        }
    }

    private void A04() {
        this.A02.A0Q(new C1001Rq(this), new AnonymousClass75(this.A04, this.A03));
    }

    private boolean A07(String str) {
        AnonymousClass16 anonymousClass16 = this.A01;
        if (anonymousClass16 != null) {
            return anonymousClass16.A0X().has(str);
        }
        return false;
    }

    public final void A08() {
        if (A09()) {
            A02();
            A03();
            A04();
            return;
        }
        throw new IllegalStateException(A01(0, 45, 50));
    }

    public final boolean A09() {
        AnonymousClass16 anonymousClass16 = this.A01;
        if (anonymousClass16 != null) {
            JSONObject jSONObjectA0X = anonymousClass16.A0X();
            if (A0D[5].length() != 22) {
                throw new RuntimeException();
            }
            String[] strArr = A0D;
            strArr[5] = "0MUxNIoi6mFZgBaSZOUpUP";
            strArr[5] = "0MUxNIoi6mFZgBaSZOUpUP";
            return this.A0B || (jSONObjectA0X != null && A07(A01(66, 22, 25)) && A07(A01(88, 22, 15)) && A07(A01(45, 21, 60)));
        }
        return this.A0B;
    }
}
