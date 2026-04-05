package com.facebook.ads.redexgen.X;

import android.util.SparseArray;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class DP {
    public static String[] A0I;
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final CR A0E;
    public final boolean A0G;
    public final boolean A0H;
    public final SparseArray<C0763Ig> A0D = new SparseArray<>();
    public final SparseArray<C0762If> A0C = new SparseArray<>();
    public DO A06 = new DO();
    public DO A07 = new DO();
    public byte[] A0B = new byte[128];
    public final C0769Im A0F = new C0769Im(this.A0B, 0, 0);

    static {
        A00();
    }

    public static void A00() {
        A0I = new String[]{"4oBn500ONSa7zUcj69ZejwliI7fNkQe9", "sao3", "S05M", "dUQbnZGK3vs92wXndxl51oc8w6Wzg5UK", "r2dYBwwJ6wCRp20YpqJDniAkemsUTuNE", "fcxFuh", "wirhT", "AIyirGzN48rHG0XGibSi5d9zNx7vdYO1"};
    }

    public DP(CR cr, boolean z, boolean z2) {
        this.A0E = cr;
        this.A0G = z;
        this.A0H = z2;
        A02();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void A01(int i2) {
        boolean z = this.A0A;
        this.A0E.ACi(this.A05, z ? 1 : 0, (int) (this.A02 - this.A04), i2, null);
    }

    public final void A02() {
        this.A08 = false;
        this.A09 = false;
        this.A07.A03();
    }

    public final void A03(long j2, int i2) {
        boolean z = false;
        if (this.A01 == 9 || (this.A0H && this.A07.A01(this.A06))) {
            if (this.A09) {
                A01(i2 + ((int) (j2 - this.A02)));
            }
            this.A04 = this.A02;
            this.A05 = this.A03;
            this.A0A = false;
            this.A09 = true;
        }
        boolean z2 = this.A0A;
        int i3 = this.A01;
        if (i3 == 5 || (this.A0G && i3 == 1 && this.A07.A06())) {
            z = true;
        }
        this.A0A = z2 | z;
    }

    public final void A04(long j2, int i2, long j3) {
        this.A01 = i2;
        this.A03 = j3;
        this.A02 = j2;
        if (!this.A0G || this.A01 != 1) {
            if (!this.A0H) {
                return;
            }
            int i3 = this.A01;
            if (i3 != 5 && i3 != 1 && i3 != 2) {
                return;
            }
        }
        DO r1 = this.A06;
        this.A06 = this.A07;
        this.A07 = r1;
        this.A07.A03();
        this.A00 = 0;
        this.A08 = true;
    }

    public final void A05(C0762If c0762If) {
        this.A0C.append(c0762If.A00, c0762If);
    }

    public final void A06(C0763Ig c0763Ig) {
        this.A0D.append(c0763Ig.A05, c0763Ig);
    }

    public final void A07(byte[] bArr, int readLength, int i2) {
        if (!this.A08) {
            return;
        }
        int i3 = i2 - readLength;
        byte[] bArr2 = this.A0B;
        int length = bArr2.length;
        int i4 = this.A00;
        if (length < i4 + i3) {
            this.A0B = Arrays.copyOf(bArr2, (i4 + i3) * 2);
        }
        System.arraycopy(bArr, readLength, this.A0B, this.A00, i3);
        this.A00 += i3;
        this.A0F.A09(this.A0B, 0, this.A00);
        if (!this.A0F.A0C(8)) {
            return;
        }
        this.A0F.A07();
        int deltaPicOrderCnt1 = this.A0F.A06(2);
        this.A0F.A08(5);
        if (!this.A0F.A0A()) {
            return;
        }
        this.A0F.A05();
        if (!this.A0F.A0A()) {
            return;
        }
        int iA05 = this.A0F.A05();
        if (!this.A0H) {
            this.A08 = false;
            this.A07.A04(iA05);
            return;
        }
        if (!this.A0F.A0A()) {
            return;
        }
        int iA052 = this.A0F.A05();
        String[] strArr = A0I;
        if (strArr[0].charAt(5) != strArr[3].charAt(5)) {
            String[] strArr2 = A0I;
            strArr2[6] = "2v7XO";
            strArr2[6] = "2v7XO";
            int picParameterSetId = this.A0C.indexOfKey(iA052);
            if (picParameterSetId < 0) {
                this.A08 = false;
                return;
            }
            C0762If ppsData = this.A0C.get(iA052);
            C0763Ig c0763Ig = this.A0D.get(ppsData.A01);
            if (c0763Ig.A09) {
                if (!this.A0F.A0C(2)) {
                    return;
                } else {
                    this.A0F.A08(2);
                }
            }
            if (!this.A0F.A0C(c0763Ig.A01)) {
                return;
            }
            boolean zA0B = false;
            boolean z = false;
            boolean zA0B2 = false;
            int iA06 = this.A0F.A06(c0763Ig.A01);
            boolean bottomFieldFlagPresent = c0763Ig.A08;
            if (!bottomFieldFlagPresent) {
                boolean bottomFieldFlagPresent2 = this.A0F.A0C(1);
                if (!bottomFieldFlagPresent2) {
                    return;
                }
                zA0B = this.A0F.A0B();
                if (zA0B) {
                    boolean bottomFieldFlagPresent3 = this.A0F.A0C(1);
                    if (!bottomFieldFlagPresent3) {
                        return;
                    }
                    zA0B2 = this.A0F.A0B();
                    z = true;
                } else {
                    String[] strArr3 = A0I;
                    if (strArr3[2].length() == strArr3[1].length()) {
                        String[] strArr4 = A0I;
                        strArr4[4] = "qwcYbvbtciQlsge07t8jnpQbFFEGYRzL";
                        strArr4[4] = "qwcYbvbtciQlsge07t8jnpQbFFEGYRzL";
                    }
                }
            }
            boolean z2 = this.A01 == 5;
            int iA053 = 0;
            if (z2) {
                if (!this.A0F.A0A()) {
                    return;
                }
                C0769Im c0769Im = this.A0F;
                if (A0I[5].length() == 32) {
                    throw new RuntimeException();
                }
                String[] strArr5 = A0I;
                strArr5[0] = "CUn0EGRMZuaxcZmcWt6bm8g2eSLscmSu";
                strArr5[3] = "AO4oaRrhS9J5INJLsqTeqW6rWo7URvM3";
                iA053 = c0769Im.A05();
            }
            int iA062 = 0;
            int iA04 = 0;
            int iA042 = 0;
            int iA043 = 0;
            int picOrderCntLsb = c0763Ig.A04;
            if (picOrderCntLsb == 0) {
                C0769Im c0769Im2 = this.A0F;
                int deltaPicOrderCnt12 = c0763Ig.A03;
                if (!c0769Im2.A0C(deltaPicOrderCnt12)) {
                    return;
                }
                C0769Im c0769Im3 = this.A0F;
                int i5 = c0763Ig.A03;
                int picOrderCntLsb2 = A0I[7].charAt(28);
                if (picOrderCntLsb2 != 108) {
                    String[] strArr6 = A0I;
                    strArr6[4] = "13MW05H83xonKdXxuFb2nSy24rNhSBqM";
                    strArr6[4] = "13MW05H83xonKdXxuFb2nSy24rNhSBqM";
                    iA062 = c0769Im3.A06(i5);
                    if (ppsData.A02 && !zA0B) {
                        if (!this.A0F.A0A()) {
                            return;
                        } else {
                            iA04 = this.A0F.A04();
                        }
                    }
                }
            } else {
                int picOrderCntLsb3 = c0763Ig.A04;
                if (A0I[7].charAt(28) == 'l') {
                    throw new RuntimeException();
                }
                String[] strArr7 = A0I;
                strArr7[7] = "MOrewcskpOrth27AIRJiHCsaXTOPbZzW";
                strArr7[7] = "MOrewcskpOrth27AIRJiHCsaXTOPbZzW";
                if (picOrderCntLsb3 == 1 && !c0763Ig.A07) {
                    if (!this.A0F.A0A()) {
                        return;
                    }
                    iA042 = this.A0F.A04();
                    if (ppsData.A02 && !zA0B) {
                        if (!this.A0F.A0A()) {
                            return;
                        } else {
                            iA043 = this.A0F.A04();
                        }
                    }
                }
            }
            this.A07.A05(c0763Ig, deltaPicOrderCnt1, iA05, iA06, iA052, zA0B, z, zA0B2, z2, iA053, iA062, iA04, iA042, iA043);
            this.A08 = false;
            return;
        }
        throw new RuntimeException();
    }

    public final boolean A08() {
        return this.A0H;
    }
}
