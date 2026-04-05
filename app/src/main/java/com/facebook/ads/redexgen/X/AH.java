package com.facebook.ads.redexgen.X;

import android.util.Pair;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AH {
    public static String[] A0C;
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public AF A04;
    public AF A05;
    public AF A06;
    public AbstractC0573Ae A07;
    public Object A08;
    public boolean A09;
    public final C0571Ac A0A = new C0571Ac();
    public final C0572Ad A0B = new C0572Ad();

    static {
        A08();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private AG A02(int i2, long j2, long j3) {
        FB fb = new FB(i2, j3);
        this.A07.A0A(fb.A02, this.A0A);
        int iA04 = this.A0A.A04(j2);
        long jA09 = iA04 == -1 ? Long.MIN_VALUE : this.A0A.A09(iA04);
        boolean zA0B = A0B(fb, jA09);
        return new AG(fb, j2, jA09, -9223372036854775807L, jA09 == Long.MIN_VALUE ? this.A0A.A07() : jA09, zA0B, A0C(fb, zA0B));
    }

    public static void A08() {
        A0C = new String[]{"L0u3smBC6U6OaYtXppAd31iOC3v5Qhxz", "mD", "DMmTpdJrujAgbmCwwmXMokmpSOB8XVVu", "Fa0SCWKpXCwAFqaC3HE", "LFAAfAeIJjtENyizMXbJJCIXxkMYQ2BS", "EOXOixXcPNGoqbhwUMphXmxbz6TL9K", "ydRMenJrqCbsHYuDZ17G4nGASKkEf2si", "4zZeHgY0eMzISLpxtPc37pmrQXWGSxn"};
    }

    private long A00(int i2) {
        int oldFrontPeriodIndex;
        Object obj = this.A07.A0B(i2, this.A0A, true).A03;
        int i3 = this.A0A.A00;
        Object obj2 = this.A08;
        if (obj2 != null && (oldFrontPeriodIndex = this.A07.A05(obj2)) != -1) {
            int oldFrontWindowIndex = this.A07.A0A(oldFrontPeriodIndex, this.A0A).A00;
            if (oldFrontWindowIndex == i3) {
                return this.A03;
            }
        }
        for (AF afA0F = A0F(); afA0F != null; afA0F = afA0F.A01) {
            if (afA0F.A09.equals(obj)) {
                return afA0F.A02.A04.A03;
            }
        }
        for (AF afA0F2 = A0F(); afA0F2 != null; afA0F2 = afA0F2.A01) {
            int iA05 = this.A07.A05(afA0F2.A09);
            if (iA05 != -1) {
                int holderWindowIndex = this.A07.A0A(iA05, this.A0A).A00;
                if (holderWindowIndex == i3) {
                    return afA0F2.A02.A04.A03;
                }
            }
        }
        long j2 = this.A02;
        this.A02 = 1 + j2;
        return j2;
    }

    private AG A01(int i2, int i3, int i4, long durationUs, long j2) {
        long jA06;
        FB fb = new FB(i2, i3, i4, j2);
        boolean zA0B = A0B(fb, Long.MIN_VALUE);
        boolean zA0C = A0C(fb, zA0B);
        long jA0A = this.A07.A0A(fb.A02, this.A0A).A0A(fb.A00, fb.A01);
        if (i4 == this.A0A.A02(i3)) {
            jA06 = this.A0A.A06();
        } else {
            jA06 = 0;
        }
        return new AG(fb, jA06, Long.MIN_VALUE, durationUs, jA0A, zA0B, zA0C);
    }

    @Nullable
    private AG A03(AF af, long j2) {
        long jLongValue;
        AG ag = af.A02;
        if (ag.A06) {
            int iA04 = this.A07.A04(ag.A04.A02, this.A0A, this.A0B, this.A01, this.A09);
            if (iA04 == -1) {
                return null;
            }
            int i2 = this.A07.A0B(iA04, this.A0A, true).A00;
            Object obj = this.A0A.A03;
            long j3 = ag.A04.A03;
            if (this.A07.A0C(i2, this.A0B).A00 == iA04) {
                long windowSequenceNumber = af.A08();
                Pair<Integer, Long> pairA09 = this.A07.A09(this.A0B, this.A0A, i2, -9223372036854775807L, Math.max(0L, (windowSequenceNumber + ag.A01) - j2));
                if (pairA09 == null) {
                    return null;
                }
                Object nextPeriodUid = pairA09.first;
                iA04 = ((Integer) nextPeriodUid).intValue();
                Object nextPeriodUid2 = pairA09.second;
                jLongValue = ((Long) nextPeriodUid2).longValue();
                Object nextPeriodUid3 = af.A01;
                if (nextPeriodUid3 != null && af.A01.A09.equals(obj)) {
                    j3 = af.A01.A02.A04.A03;
                } else {
                    j3 = this.A02;
                    long startPositionUs = j3 + 1;
                    this.A02 = startPositionUs;
                }
            } else {
                jLongValue = 0;
            }
            return A06(A07(iA04, jLongValue, j3), jLongValue, jLongValue);
        }
        FB currentPeriodId = ag.A04;
        this.A07.A0A(currentPeriodId.A02, this.A0A);
        if (currentPeriodId.A02()) {
            int adGroupIndex = currentPeriodId.A00;
            int iA01 = this.A0A.A01(adGroupIndex);
            if (iA01 == -1) {
                return null;
            }
            int adCountInCurrentAdGroup = this.A0A.A03(adGroupIndex, currentPeriodId.A01);
            if (adCountInCurrentAdGroup < iA01) {
                if (this.A0A.A0E(adGroupIndex, adCountInCurrentAdGroup)) {
                    return A01(currentPeriodId.A02, adGroupIndex, adCountInCurrentAdGroup, ag.A00, currentPeriodId.A03);
                }
                return null;
            }
            return A02(currentPeriodId.A02, ag.A00, currentPeriodId.A03);
        }
        long j4 = ag.A02;
        if (A0C[6].charAt(23) != 'A') {
            throw new RuntimeException();
        }
        String[] strArr = A0C;
        strArr[1] = "6G";
        strArr[1] = "6G";
        if (j4 != Long.MIN_VALUE) {
            int iA05 = this.A0A.A05(ag.A02);
            if (iA05 == -1) {
                return A02(currentPeriodId.A02, ag.A02, currentPeriodId.A03);
            }
            int iA02 = this.A0A.A02(iA05);
            if (this.A0A.A0E(iA05, iA02)) {
                return A01(currentPeriodId.A02, iA05, iA02, ag.A02, currentPeriodId.A03);
            }
            return null;
        }
        int iA00 = this.A0A.A00();
        if (iA00 == 0) {
            return null;
        }
        int i3 = iA00 - 1;
        if (this.A0A.A09(i3) != Long.MIN_VALUE || this.A0A.A0D(i3)) {
            return null;
        }
        int adGroupCount = this.A0A.A02(i3);
        if (!this.A0A.A0E(i3, adGroupCount)) {
            return null;
        }
        long jA07 = this.A0A.A07();
        int i4 = currentPeriodId.A02;
        long contentDurationUs = currentPeriodId.A03;
        return A01(i4, i3, adGroupCount, jA07, contentDurationUs);
    }

    private AG A04(AG ag, FB fb) {
        long jA07;
        long j2 = ag.A03;
        long endPositionUs = ag.A02;
        boolean zA0B = A0B(fb, endPositionUs);
        boolean zA0C = A0C(fb, zA0B);
        this.A07.A0A(fb.A02, this.A0A);
        boolean isLastInPeriod = fb.A02();
        if (isLastInPeriod) {
            jA07 = this.A0A.A0A(fb.A00, fb.A01);
        } else {
            if (A0C[2].charAt(30) != 'V') {
                throw new RuntimeException();
            }
            String[] strArr = A0C;
            strArr[2] = "zTzAUiYM1BrQqeObFTyCKDEgqKKR2HVC";
            strArr[2] = "zTzAUiYM1BrQqeObFTyCKDEgqKKR2HVC";
            jA07 = endPositionUs == Long.MIN_VALUE ? this.A0A.A07() : endPositionUs;
        }
        return new AG(fb, j2, endPositionUs, ag.A00, jA07, zA0B, zA0C);
    }

    private AG A05(AJ aj) {
        return A06(aj.A04, aj.A01, aj.A02);
    }

    private AG A06(FB fb, long j2, long j3) {
        this.A07.A0A(fb.A02, this.A0A);
        if (fb.A02()) {
            if (!this.A0A.A0E(fb.A00, fb.A01)) {
                return null;
            }
            return A01(fb.A02, fb.A00, fb.A01, j2, fb.A03);
        }
        return A02(fb.A02, j3, fb.A03);
    }

    private FB A07(int i2, long j2, long j3) {
        this.A07.A0A(i2, this.A0A);
        int iA05 = this.A0A.A05(j2);
        if (iA05 == -1) {
            return new FB(i2, j3);
        }
        return new FB(i2, iA05, this.A0A.A02(iA05), j3);
    }

    private boolean A09() {
        AF afA0F = A0F();
        if (afA0F == null) {
            return true;
        }
        while (true) {
            int iA04 = this.A07.A04(afA0F.A02.A04.A02, this.A0A, this.A0B, this.A01, this.A09);
            while (afA0F.A01 != null && !afA0F.A02.A06) {
                afA0F = afA0F.A01;
            }
            if (iA04 == -1 || afA0F.A01 == null || afA0F.A01.A02.A04.A02 != iA04) {
                break;
            }
            afA0F = afA0F.A01;
        }
        boolean zA0T = A0T(afA0F);
        afA0F.A02 = A04(afA0F.A02, afA0F.A02.A04);
        if (!zA0T) {
            return true;
        }
        boolean zA0Q = A0Q();
        if (A0C[7].length() != 31) {
            throw new RuntimeException();
        }
        String[] strArr = A0C;
        strArr[3] = "GuDKwHudSgXHMcEdzJg";
        strArr[5] = "TrxgVcYEVqGsLQMDNrMk5TDxlvQhmk";
        return !zA0Q;
    }

    private boolean A0A(AF af, AG ag) {
        AG ag2 = af.A02;
        return ag2.A03 == ag.A03 && ag2.A02 == ag.A02 && ag2.A04.equals(ag.A04);
    }

    private boolean A0B(FB fb, long j2) {
        int iA00 = this.A07.A0A(fb.A02, this.A0A).A00();
        if (iA00 == 0) {
            return true;
        }
        int i2 = iA00 - 1;
        boolean zA02 = fb.A02();
        if (this.A0A.A09(i2) != Long.MIN_VALUE) {
            return !zA02 && j2 == Long.MIN_VALUE;
        }
        int postrollAdCount = this.A0A.A01(i2);
        if (postrollAdCount == -1) {
            return false;
        }
        if (zA02 && fb.A00 == i2 && fb.A01 == postrollAdCount + (-1)) {
            return true;
        }
        return !zA02 && this.A0A.A02(i2) == postrollAdCount;
    }

    private boolean A0C(FB fb, boolean z) {
        return !this.A07.A0C(this.A07.A0A(fb.A02, this.A0A).A00, this.A0B).A08 && this.A07.A0G(fb.A02, this.A0A, this.A0B, this.A01, this.A09) && z;
    }

    public final AF A0D() {
        AF af = this.A05;
        if (af != null) {
            if (af == this.A06) {
                this.A06 = af.A01;
            }
            this.A05.A0E();
            this.A00--;
            if (this.A00 == 0) {
                this.A04 = null;
                this.A08 = this.A05.A09;
                this.A03 = this.A05.A02.A04.A03;
            }
            this.A05 = this.A05.A01;
        } else {
            AF af2 = this.A04;
            this.A05 = af2;
            this.A06 = af2;
        }
        return this.A05;
    }

    public final AF A0E() {
        AF af = this.A06;
        IM.A04((af == null || af.A01 == null) ? false : true);
        if (A0C[7].length() != 31) {
            throw new RuntimeException();
        }
        String[] strArr = A0C;
        strArr[4] = "7koWfuH1ta1EVLUWQFGgmnLKJoN2uwxl";
        strArr[0] = "1LlHzPavDhI1SmiN1gPMgWkfsuEkohyV";
        this.A06 = this.A06.A01;
        return this.A06;
    }

    public final AF A0F() {
        return A0Q() ? this.A05 : this.A04;
    }

    public final AF A0G() {
        return this.A04;
    }

    public final AF A0H() {
        return this.A05;
    }

    public final AF A0I() {
        return this.A06;
    }

    @Nullable
    public final AG A0J(long j2, AJ aj) {
        AF af = this.A04;
        return af == null ? A05(aj) : A03(af, j2);
    }

    public final AG A0K(AG ag, int i2) {
        return A04(ag, ag.A04.A01(i2));
    }

    public final InterfaceC1228aF A0L(AX[] axArr, HW hw, HZ hz, FD fd, Object obj, AG ag) {
        AF af = this.A04;
        AF af2 = new AF(axArr, af == null ? ag.A03 : af.A08() + this.A04.A02.A01, hw, hz, fd, obj, ag);
        if (this.A04 != null) {
            IM.A04(A0Q());
            this.A04.A01 = af2;
        }
        this.A08 = null;
        this.A04 = af2;
        this.A00++;
        return af2.A08;
    }

    public final FB A0M(int i2, long j2) {
        return A07(i2, j2, A00(i2));
    }

    public final void A0N(long j2) {
        AF af = this.A04;
        if (af != null) {
            af.A0H(j2);
        }
    }

    public final void A0O(AbstractC0573Ae abstractC0573Ae) {
        this.A07 = abstractC0573Ae;
    }

    public final void A0P(boolean z) {
        AF afA0F = A0F();
        if (afA0F != null) {
            this.A08 = z ? afA0F.A09 : null;
            this.A03 = afA0F.A02.A04.A03;
            afA0F.A0E();
            A0T(afA0F);
        } else if (!z) {
            this.A08 = null;
        }
        this.A05 = null;
        this.A04 = null;
        this.A06 = null;
        this.A00 = 0;
    }

    public final boolean A0Q() {
        return this.A05 != null;
    }

    public final boolean A0R() {
        AF af = this.A04;
        return af == null || (!af.A02.A05 && this.A04.A0I() && this.A04.A02.A01 != -9223372036854775807L && this.A00 < 100);
    }

    public final boolean A0S(int i2) {
        this.A01 = i2;
        return A09();
    }

    public final boolean A0T(AF af) {
        IM.A04(af != null);
        boolean z = false;
        this.A04 = af;
        while (af.A01 != null) {
            af = af.A01;
            if (af == this.A06) {
                this.A06 = this.A05;
                z = true;
            }
            af.A0E();
            this.A00--;
        }
        this.A04.A01 = null;
        return z;
    }

    public final boolean A0U(InterfaceC1228aF interfaceC1228aF) {
        AF af = this.A04;
        return af != null && af.A08 == interfaceC1228aF;
    }

    public final boolean A0V(FB fb, long j2) {
        int iA04 = fb.A02;
        AF af = null;
        for (AF afA0F = A0F(); afA0F != null; afA0F = afA0F.A01) {
            if (af == null) {
                afA0F.A02 = A0K(afA0F.A02, iA04);
            } else {
                if (iA04 != -1) {
                    Object obj = afA0F.A09;
                    if (A0C[2].charAt(30) != 'V') {
                        throw new RuntimeException();
                    }
                    String[] strArr = A0C;
                    strArr[4] = "cRCq0i1JCmFgPvSHr0NI30IAvGtOkPUO";
                    strArr[0] = "aqPjT6JpLbsnsfh6iIpVbm4IivKwupA2";
                    if (obj.equals(this.A07.A0B(iA04, this.A0A, true).A03)) {
                        AG agA03 = A03(af, j2);
                        if (agA03 == null) {
                            return true ^ A0T(af);
                        }
                        afA0F.A02 = A0K(afA0F.A02, iA04);
                        if (!A0A(afA0F, agA03)) {
                            return true ^ A0T(af);
                        }
                    }
                }
                return true ^ A0T(af);
            }
            if (afA0F.A02.A06) {
                iA04 = this.A07.A04(iA04, this.A0A, this.A0B, this.A01, this.A09);
            }
            af = afA0F;
        }
        return true;
    }

    public final boolean A0W(boolean z) {
        this.A09 = z;
        return A09();
    }
}
