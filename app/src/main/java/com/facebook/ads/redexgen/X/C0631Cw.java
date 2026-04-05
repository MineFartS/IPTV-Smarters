package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.source.TrackGroupArray;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Cw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0631Cw implements InterfaceC1163Xy {
    public static byte[] A0M;
    public static String[] A0N;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;

    @Nullable
    public C05699z A05;
    public AJ A06;
    public AK A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final Handler A0C;
    public final Handler A0D;
    public final C0629Cu A0E;
    public final C0571Ac A0F;
    public final C0572Ad A0G;
    public final HW A0H;
    public final HX A0I;
    public final ArrayDeque<A3> A0J;
    public final CopyOnWriteArraySet<AN> A0K;
    public final Y0[] A0L;

    static {
        A04();
        A03();
    }

    public static String A02(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0M, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A0N[7].length() == 1) {
                throw new RuntimeException();
            }
            String[] strArr = A0N;
            strArr[7] = "NVWBbKH";
            strArr[7] = "NVWBbKH";
            if (i5 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 75);
            i5++;
        }
    }

    public static void A03() {
        A0M = new byte[]{108, DateTimeFieldType.MILLIS_OF_SECOND, 126, 67, 84, 107, 87, 90, 66, 94, 73, 114, 86, 75, 87, 64, 125, 106, 85, 105, 100, 124, 96, 119, 73, 108, 103, 42, 55, 43, 61, 43, 49, 54, DateTimeFieldType.HOUR_OF_DAY, DateTimeFieldType.MILLIS_OF_DAY, 11, 95, 27, 44, 37, 44, 40, 58, 44, 105, 64, 72, 53, 78, 50, 36, 36, 42, DateTimeFieldType.SECOND_OF_MINUTE, 46, 97, 40, 38, 47, 46, 51, 36, 37, 97, 35, 36, 34, 32, 52, 50, 36, 97, 32, 47, 97, 32, 37, 97, 40, 50, 97, 49, 45, 32, 56, 40, 47, 38};
    }

    public static void A04() {
        A0N = new String[]{"FdQu0fmyjo2y", "53g7H5tUmq98heWq", "c", "OWB4F6Jbct6Ly4JY", "NHyc4CVBcI41", "VuRuzyUBfoaB1KqcrIY9ro", "m", "Ea4pNsdJDJP"};
    }

    @SuppressLint({"HandlerLeak"})
    public C0631Cw(Y0[] y0Arr, HW hw, AE ae, IP ip) {
        Log.i(A02(2, 13, 112), A02(33, 5, 52) + Integer.toHexString(System.identityHashCode(this)) + A02(0, 2, 7) + A02(15, 18, 78) + A02(47, 3, 94) + J1.A04 + A02(46, 1, 86));
        IM.A04(y0Arr.length > 0);
        this.A0L = (Y0[]) IM.A01(y0Arr);
        this.A0H = (HW) IM.A01(hw);
        this.A0A = false;
        this.A03 = 0;
        this.A0B = false;
        this.A0K = new CopyOnWriteArraySet<>();
        this.A0I = new HX(new AY[y0Arr.length], new HT[y0Arr.length], null);
        this.A0G = new C0572Ad();
        this.A0F = new C0571Ac();
        this.A07 = AK.A04;
        this.A0C = new A2(this, Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        this.A06 = new AJ(AbstractC0573Ae.A01, 0L, TrackGroupArray.A04, this.A0I);
        this.A0J = new ArrayDeque<>();
        this.A0E = new C0629Cu(y0Arr, hw, this.A0I, ae, this.A0A, this.A03, this.A0B, this.A0C, this, ip);
        Looper eventLooper = this.A0E.A0x();
        this.A0D = new Handler(eventLooper);
    }

    private long A00(long j2) {
        long jA01 = C05639t.A01(j2);
        if (!this.A06.A04.A02()) {
            this.A06.A03.A0A(this.A06.A04.A02, this.A0F);
            return jA01 + this.A0F.A08();
        }
        return jA01;
    }

    private AJ A01(boolean z, boolean z2, int i2) {
        if (z) {
            this.A01 = 0;
            this.A00 = 0;
            this.A04 = 0L;
        } else {
            this.A01 = A5y();
            this.A00 = A08();
            this.A04 = A5v();
        }
        AJ aj = new AJ(z2 ? AbstractC0573Ae.A01 : this.A06.A03, z2 ? null : this.A06.A07, this.A06.A04, this.A06.A02, this.A06.A01, i2, false, z2 ? TrackGroupArray.A04 : this.A06.A05, z2 ? this.A0I : this.A06.A06);
        String[] strArr = A0N;
        if (strArr[6].length() != strArr[2].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0N;
        strArr2[7] = "Xqr2ExcYOBi8j1Q";
        strArr2[7] = "Xqr2ExcYOBi8j1Q";
        return aj;
    }

    private void A05(AJ aj, int i2, boolean z, int timelineChangeReason) {
        AJ ajA04 = aj;
        this.A02 -= i2;
        if (this.A02 == 0) {
            if (ajA04.A02 == -9223372036854775807L) {
                ajA04 = ajA04.A04(ajA04.A04, 0L, ajA04.A01);
            }
            if (!this.A06.A03.A0F() || this.A08) {
                AbstractC0573Ae abstractC0573Ae = ajA04.A03;
                String[] strArr = A0N;
                if (strArr[1].length() == strArr[3].length()) {
                    String[] strArr2 = A0N;
                    strArr2[7] = "oGDG41JiAsT7PCq0";
                    strArr2[7] = "oGDG41JiAsT7PCq0";
                    if (abstractC0573Ae.A0F()) {
                        this.A00 = 0;
                        this.A01 = 0;
                        String[] strArr3 = A0N;
                        if (strArr3[6].length() == strArr3[2].length()) {
                            String[] strArr4 = A0N;
                            strArr4[1] = "vrOcQin3pszluGLq";
                            strArr4[3] = "REI4M31lEJcbEC2a";
                            this.A04 = 0L;
                        }
                    }
                }
                throw new RuntimeException();
            }
            int i3 = this.A08 ? 0 : 2;
            boolean z2 = this.A09;
            this.A08 = false;
            this.A09 = false;
            A06(ajA04, z, timelineChangeReason, i3, z2, false);
        }
    }

    private void A06(AJ aj, boolean z, int i2, int i3, boolean z2, boolean z3) {
        boolean z4 = !this.A0J.isEmpty();
        this.A0J.addLast(new A3(aj, this.A06, this.A0K, this.A0H, z, i2, i3, z2, this.A0A, z3));
        this.A06 = aj;
        if (z4) {
            return;
        }
        while (!this.A0J.isEmpty()) {
            this.A0J.peekFirst().A01();
            this.A0J.removeFirst();
        }
    }

    private boolean A07() {
        return this.A06.A03.A0F() || this.A02 > 0;
    }

    public final int A08() {
        if (A07()) {
            return this.A00;
        }
        return this.A06.A04.A02;
    }

    public final void A09(int i2) {
        A0A(i2, -9223372036854775807L);
    }

    public final void A0A(int i2, long j2) {
        long jA00;
        AbstractC0573Ae abstractC0573Ae = this.A06.A03;
        if (i2 >= 0) {
            boolean zA0F = abstractC0573Ae.A0F();
            if (A0N[5].length() == 22) {
                String[] strArr = A0N;
                strArr[6] = "k";
                strArr[2] = "F";
                if (zA0F || i2 < abstractC0573Ae.A02()) {
                    this.A09 = true;
                    this.A02++;
                    boolean zA0C = A0C();
                    if (A0N[7].length() != 1) {
                        String[] strArr2 = A0N;
                        strArr2[1] = "iOLxdGxzjtj8VTTv";
                        strArr2[3] = "k2rTYfByBhCiNj1b";
                        if (zA0C) {
                            String strA02 = A02(2, 13, 112);
                            String[] strArr3 = A0N;
                            if (strArr3[4].length() == strArr3[0].length()) {
                                String[] strArr4 = A0N;
                                strArr4[7] = "fs0FIhTd6T569fWM98lB5KOUS";
                                strArr4[7] = "fs0FIhTd6T569fWM98lB5KOUS";
                                Log.w(strA02, A02(50, 39, 10));
                                this.A0C.obtainMessage(0, 1, -1, this.A06).sendToTarget();
                                return;
                            }
                        } else {
                            this.A01 = i2;
                            if (abstractC0573Ae.A0F()) {
                                if (A0N[7].length() == 1) {
                                    throw new RuntimeException();
                                }
                                String[] strArr5 = A0N;
                                strArr5[5] = "dOqGbPzaS7jKfyvdUFqkQf";
                                strArr5[5] = "dOqGbPzaS7jKfyvdUFqkQf";
                                this.A04 = j2 == -9223372036854775807L ? 0L : j2;
                                this.A00 = 0;
                            } else {
                                if (j2 == -9223372036854775807L) {
                                    jA00 = abstractC0573Ae.A0C(i2, this.A0G).A01();
                                } else {
                                    jA00 = C05639t.A00(j2);
                                }
                                Pair<Integer, Long> pairA08 = abstractC0573Ae.A08(this.A0G, this.A0F, i2, jA00);
                                this.A04 = C05639t.A01(jA00);
                                this.A00 = ((Integer) pairA08.first).intValue();
                            }
                            this.A0E.A0z(abstractC0573Ae, i2, C05639t.A00(j2));
                            for (AN an : this.A0K) {
                                String[] strArr6 = A0N;
                                if (strArr6[4].length() != strArr6[0].length()) {
                                    throw new RuntimeException();
                                }
                                String[] strArr7 = A0N;
                                strArr7[1] = "l5NWk5x9vooO50uu";
                                strArr7[3] = "FcAzQ8glamB386Jq";
                                an.AAb(1);
                            }
                            return;
                        }
                    }
                }
            }
            throw new RuntimeException();
        }
        throw new AD(abstractC0573Ae, i2, j2);
    }

    public final void A0B(Message message) {
        int i2 = message.what;
        if (i2 == 0) {
            A05((AJ) message.obj, message.arg1, message.arg2 != -1, message.arg2);
            return;
        }
        if (i2 != 1) {
            String[] strArr = A0N;
            if (strArr[4].length() == strArr[0].length()) {
                String[] strArr2 = A0N;
                strArr2[5] = "7KT5lT3IIkvardi0cOE285";
                strArr2[5] = "7KT5lT3IIkvardi0cOE285";
                if (i2 == 2) {
                    C05699z c05699z = (C05699z) message.obj;
                    this.A05 = c05699z;
                    Iterator<AN> it = this.A0K.iterator();
                    while (true) {
                        boolean zHasNext = it.hasNext();
                        String[] strArr3 = A0N;
                        if (strArr3[4].length() != strArr3[0].length()) {
                            throw new RuntimeException();
                        }
                        String[] strArr4 = A0N;
                        strArr4[7] = "lr70Wm3MPuK1";
                        strArr4[7] = "lr70Wm3MPuK1";
                        if (zHasNext) {
                            it.next().AAX(c05699z);
                        } else {
                            return;
                        }
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        } else {
            AK ak = (AK) message.obj;
            if (!this.A07.equals(ak)) {
                this.A07 = ak;
                CopyOnWriteArraySet<AN> copyOnWriteArraySet = this.A0K;
                String[] strArr5 = A0N;
                if (strArr5[6].length() == strArr5[2].length()) {
                    String[] strArr6 = A0N;
                    strArr6[1] = "XPkhdR3hZ8JGZkbg";
                    strArr6[3] = "HitM1md97HqEAHyx";
                    Iterator<AN> it2 = copyOnWriteArraySet.iterator();
                    while (it2.hasNext()) {
                        it2.next().AAV(ak);
                    }
                    return;
                }
            } else {
                return;
            }
        }
        throw new RuntimeException();
    }

    public final boolean A0C() {
        return !A07() && this.A06.A04.A02();
    }

    @Override // com.facebook.ads.redexgen.X.AS
    public final void A3H(AN an) {
        this.A0K.add(an);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1163Xy
    public final AV A4L(AU au) {
        return new AV(this.A0E, au, this.A06.A03, A5y(), this.A0D);
    }

    @Override // com.facebook.ads.redexgen.X.AS
    public final int A5X() {
        long jA5Y = A5Y();
        long jA66 = A66();
        if (jA5Y != -9223372036854775807L) {
            String[] strArr = A0N;
            if (strArr[6].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0N;
            strArr2[6] = "7";
            strArr2[2] = "n";
            if (jA66 != -9223372036854775807L) {
                String[] strArr3 = A0N;
                if (strArr3[4].length() != strArr3[0].length()) {
                    throw new RuntimeException();
                }
                String[] strArr4 = A0N;
                strArr4[6] = "w";
                strArr4[2] = "D";
                if (jA66 == 0) {
                    return 100;
                }
                return J1.A06((int) ((100 * jA5Y) / jA66), 0, 100);
            }
        }
        return 0;
    }

    @Override // com.facebook.ads.redexgen.X.AS
    public final long A5Y() {
        if (A07()) {
            return this.A04;
        }
        return A00(this.A06.A09);
    }

    @Override // com.facebook.ads.redexgen.X.AS
    public final long A5q() {
        if (A0C()) {
            this.A06.A03.A0A(this.A06.A04.A02, this.A0F);
            return this.A0F.A08() + C05639t.A01(this.A06.A01);
        }
        return A5v();
    }

    @Override // com.facebook.ads.redexgen.X.AS
    public final int A5s() {
        if (A0C()) {
            return this.A06.A04.A00;
        }
        return -1;
    }

    @Override // com.facebook.ads.redexgen.X.AS
    public final int A5t() {
        if (A0C()) {
            return this.A06.A04.A01;
        }
        return -1;
    }

    @Override // com.facebook.ads.redexgen.X.AS
    public final long A5v() {
        if (A07()) {
            return this.A04;
        }
        return A00(this.A06.A0A);
    }

    @Override // com.facebook.ads.redexgen.X.AS
    public final AbstractC0573Ae A5x() {
        return this.A06.A03;
    }

    @Override // com.facebook.ads.redexgen.X.AS
    public final int A5y() {
        if (A07()) {
            return this.A01;
        }
        return this.A06.A03.A0A(this.A06.A04.A02, this.A0F).A00;
    }

    @Override // com.facebook.ads.redexgen.X.AS
    public final long A66() {
        AbstractC0573Ae abstractC0573Ae = this.A06.A03;
        if (abstractC0573Ae.A0F()) {
            return -9223372036854775807L;
        }
        if (A0C()) {
            FB fb = this.A06.A04;
            abstractC0573Ae.A0A(fb.A02, this.A0F);
            return C05639t.A01(this.A0F.A0A(fb.A00, fb.A01));
        }
        return abstractC0573Ae.A0C(A5y(), this.A0G).A02();
    }

    @Override // com.facebook.ads.redexgen.X.AS
    public final boolean A6n() {
        return this.A0A;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1163Xy
    public final void ABm(FD fd, boolean z, boolean z2) {
        this.A05 = null;
        AJ ajA01 = A01(z, z2, 2);
        this.A08 = true;
        this.A02++;
        this.A0E.A10(fd, z, z2);
        A06(ajA01, false, 4, 1, false, false);
    }

    @Override // com.facebook.ads.redexgen.X.AS
    public final void ACG() {
        StringBuilder sb = new StringBuilder();
        sb.append(A02(38, 8, 2));
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(A02(0, 2, 7));
        sb.append(A02(15, 18, 78));
        String strA02 = A02(47, 3, 94);
        sb.append(strA02);
        sb.append(J1.A04);
        sb.append(strA02);
        sb.append(A9.A00());
        sb.append(A02(46, 1, 86));
        Log.i(A02(2, 13, 112), sb.toString());
        this.A0E.A0y();
        this.A0C.removeCallbacksAndMessages(null);
    }

    @Override // com.facebook.ads.redexgen.X.AS
    public final void ACo(long j2) {
        A0A(A5y(), j2);
    }

    @Override // com.facebook.ads.redexgen.X.AS
    public final void ACp() {
        A09(A5y());
    }

    @Override // com.facebook.ads.redexgen.X.AS
    public final void AD5(boolean z) {
        if (this.A0A != z) {
            this.A0A = z;
            this.A0E.A11(z);
            A06(this.A06, false, 4, 1, false, true);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AS
    public final void ADS(boolean z) {
        if (z) {
            this.A05 = null;
        }
        AJ ajA01 = A01(z, z, 1);
        this.A02++;
        this.A0E.A12(z);
        A06(ajA01, false, 4, 1, false, false);
    }
}
