package com.google.ads.interactivemedia.v3.internal;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ahv extends ahw {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final aja f19743d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f19744e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final aty<aht> f19745f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final akt f19746g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f19747h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f19748i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f19749j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f19750k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private adn f19751l;

    public ahv(acr acrVar, int[] iArr, int i2, aja ajaVar, List<aht> list, akt aktVar) {
        super(acrVar, iArr);
        this.f19743d = ajaVar;
        this.f19744e = 25000000L;
        this.f19745f = aty.l(list);
        this.f19746g = aktVar;
        this.f19747h = 1.0f;
        this.f19749j = 0;
        this.f19750k = -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ aty f(aih[] aihVarArr) {
        int length;
        int i2;
        int[] iArr;
        atu atuVarI;
        ArrayList arrayList = new ArrayList();
        char c2 = 0;
        int i3 = 0;
        while (true) {
            length = aihVarArr.length;
            i2 = 1;
            if (i3 >= length) {
                break;
            }
            aih aihVar = aihVarArr[i3];
            if (aihVar == null || aihVar.f19834b.length <= 1) {
                atuVarI = null;
            } else {
                atuVarI = aty.i();
                atuVarI.d(new aht(0L, 0L));
            }
            arrayList.add(atuVarI);
            i3++;
        }
        long[][] jArr = new long[length][];
        for (int i4 = 0; i4 < aihVarArr.length; i4++) {
            aih aihVar2 = aihVarArr[i4];
            if (aihVar2 == null) {
                jArr[i4] = new long[0];
            } else {
                jArr[i4] = new long[aihVar2.f19834b.length];
                int i5 = 0;
                while (true) {
                    if (i5 >= aihVar2.f19834b.length) {
                        break;
                    }
                    jArr[i4][i5] = aihVar2.f19833a.b(r11[i5]).f22152h;
                    i5++;
                }
                Arrays.sort(jArr[i4]);
            }
        }
        int[] iArr2 = new int[length];
        long[] jArr2 = new long[length];
        for (int i6 = 0; i6 < length; i6++) {
            long[] jArr3 = jArr[i6];
            jArr2[i6] = jArr3.length == 0 ? 0L : jArr3[0];
        }
        u(arrayList, jArr2);
        auo auoVarB = ava.a().b().b();
        int i7 = 0;
        while (i7 < length) {
            int length2 = jArr[i7].length;
            if (length2 <= i2) {
                iArr = iArr2;
            } else {
                double[] dArr = new double[length2];
                int i8 = 0;
                while (true) {
                    long[] jArr4 = jArr[i7];
                    double dLog = 0.0d;
                    iArr = iArr2;
                    if (i8 >= jArr4.length) {
                        break;
                    }
                    long j2 = jArr4[i8];
                    if (j2 != -1) {
                        dLog = Math.log(j2);
                    }
                    dArr[i8] = dLog;
                    i8++;
                    iArr2 = iArr;
                }
                int i9 = length2 - 1;
                double d2 = dArr[i9] - dArr[c2];
                int i10 = 0;
                while (i10 < i9) {
                    int i11 = i10 + 1;
                    auoVarB.u(Double.valueOf(d2 == 0.0d ? 1.0d : (((dArr[i10] + dArr[i11]) * 0.5d) - dArr[c2]) / d2), Integer.valueOf(i7));
                    i10 = i11;
                    c2 = 0;
                }
            }
            i7++;
            iArr2 = iArr;
            c2 = 0;
            i2 = 1;
        }
        int[] iArr3 = iArr2;
        aty atyVarL = aty.l(auoVarB.v());
        for (int i12 = 0; i12 < atyVarL.size(); i12++) {
            int iIntValue = ((Integer) atyVarL.get(i12)).intValue();
            int i13 = iArr3[iIntValue] + 1;
            iArr3[iIntValue] = i13;
            jArr2[iIntValue] = jArr[iIntValue][i13];
            u(arrayList, jArr2);
        }
        for (int i14 = 0; i14 < aihVarArr.length; i14++) {
            if (arrayList.get(i14) != null) {
                long j3 = jArr2[i14];
                jArr2[i14] = j3 + j3;
            }
        }
        u(arrayList, jArr2);
        atu atuVarI2 = aty.i();
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            atu atuVar = (atu) arrayList.get(i15);
            atuVarI2.d(atuVar == null ? aty.n() : atuVar.c());
        }
        return atuVarI2.c();
    }

    private static void u(List<atu<aht>> list, long[] jArr) {
        long j2 = 0;
        for (long j3 : jArr) {
            j2 += j3;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            atu<aht> atuVar = list.get(i2);
            if (atuVar != null) {
                atuVar.d(new aht(j2, jArr[i2]));
            }
        }
    }

    private final int v(long j2) {
        long jA = (long) (((long) (this.f19743d.a() * 0.7f)) / this.f19747h);
        if (!this.f19745f.isEmpty()) {
            int i2 = 1;
            while (i2 < this.f19745f.size() - 1 && this.f19745f.get(i2).f19740a < jA) {
                i2++;
            }
            aht ahtVar = this.f19745f.get(i2 - 1);
            aht ahtVar2 = this.f19745f.get(i2);
            long j3 = ahtVar.f19740a;
            long j4 = ahtVar2.f19740a;
            jA = ((long) (((jA - j3) / (j4 - j3)) * (ahtVar2.f19741b - r8))) + ahtVar.f19741b;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f19753b; i4++) {
            if (j2 == Long.MIN_VALUE || !s(i4, j2)) {
                if (o(i4).f22152h <= jA) {
                    return i4;
                }
                i3 = i4;
            }
        }
        return i3;
    }

    private static final long w(List<? extends adn> list) {
        if (list.isEmpty()) {
            return -9223372036854775807L;
        }
        adn adnVar = (adn) auv.r(list);
        long j2 = adnVar.f19260i;
        if (j2 != -9223372036854775807L) {
            long j3 = adnVar.f19261j;
            if (j3 != -9223372036854775807L) {
                return j3 - j2;
            }
        }
        return -9223372036854775807L;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aii
    public final int a() {
        return this.f19748i;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aii
    public final int b() {
        return this.f19749j;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aii
    public final void c() {
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a0  */
    @Override // com.google.ads.interactivemedia.v3.internal.aii
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(long r9, long r11, java.util.List<? extends com.google.ads.interactivemedia.v3.internal.adn> r13, com.google.ads.interactivemedia.v3.internal.adp[] r14) {
        /*
            r8 = this;
            long r0 = android.os.SystemClock.elapsedRealtime()
            int r2 = r8.f19748i
            int r3 = r14.length
            r4 = 0
            if (r2 >= r3) goto L1d
            r2 = r14[r2]
            boolean r2 = r2.c()
            if (r2 == 0) goto L1d
            int r2 = r8.f19748i
            r14 = r14[r2]
            r14.d()
            r14.e()
            goto L34
        L1d:
            if (r4 >= r3) goto L31
            r2 = r14[r4]
            boolean r5 = r2.c()
            if (r5 == 0) goto L2e
            r2.d()
            r2.e()
            goto L34
        L2e:
            int r4 = r4 + 1
            goto L1d
        L31:
            w(r13)
        L34:
            int r14 = r8.f19749j
            if (r14 != 0) goto L42
            r9 = 1
            r8.f19749j = r9
            int r9 = r8.v(r0)
            r8.f19748i = r9
            return
        L42:
            int r2 = r8.f19748i
            boolean r3 = r13.isEmpty()
            r4 = -1
            if (r3 == 0) goto L4d
            r3 = -1
            goto L59
        L4d:
            java.lang.Object r3 = com.google.ads.interactivemedia.v3.internal.auv.r(r13)
            com.google.ads.interactivemedia.v3.internal.adn r3 = (com.google.ads.interactivemedia.v3.internal.adn) r3
            com.google.ads.interactivemedia.v3.internal.ke r3 = r3.f19257f
            int r3 = r8.m(r3)
        L59:
            if (r3 == r4) goto L64
            java.lang.Object r13 = com.google.ads.interactivemedia.v3.internal.auv.r(r13)
            com.google.ads.interactivemedia.v3.internal.adn r13 = (com.google.ads.interactivemedia.v3.internal.adn) r13
            int r14 = r13.f19258g
            r2 = r3
        L64:
            int r13 = r8.v(r0)
            boolean r0 = r8.s(r2, r0)
            if (r0 != 0) goto La1
            com.google.ads.interactivemedia.v3.internal.ke r0 = r8.o(r2)
            com.google.ads.interactivemedia.v3.internal.ke r1 = r8.o(r13)
            int r1 = r1.f22152h
            int r0 = r0.f22152h
            if (r1 <= r0) goto L97
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = 10000000(0x989680, double:4.9406565E-317)
            int r7 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r7 == 0) goto L92
            int r3 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r3 > 0) goto L92
            float r11 = (float) r11
            r12 = 1061158912(0x3f400000, float:0.75)
            float r11 = r11 * r12
            long r5 = (long) r11
        L92:
            int r11 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r11 >= 0) goto L97
            goto La0
        L97:
            if (r1 >= r0) goto La1
            r11 = 25000000(0x17d7840, double:1.2351641E-316)
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r0 < 0) goto La1
        La0:
            r13 = r2
        La1:
            if (r13 != r2) goto La4
            goto La5
        La4:
            r14 = 3
        La5:
            r8.f19749j = r14
            r8.f19748i = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.ahv.d(long, long, java.util.List, com.google.ads.interactivemedia.v3.internal.adp[]):void");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ahw, com.google.ads.interactivemedia.v3.internal.aii
    public final int e(long j2, List<? extends adn> list) {
        int i2;
        int i3;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = this.f19750k;
        if (j3 != -9223372036854775807L && jElapsedRealtime - j3 < 1000 && (list.isEmpty() || ((adn) auv.r(list)).equals(this.f19751l))) {
            return list.size();
        }
        this.f19750k = jElapsedRealtime;
        this.f19751l = list.isEmpty() ? null : (adn) auv.r(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        if (amn.n(list.get(size - 1).f19260i - j2, this.f19747h) < 25000000) {
            return size;
        }
        w(list);
        ke keVarO = o(v(jElapsedRealtime));
        for (int i4 = 0; i4 < size; i4++) {
            adn adnVar = list.get(i4);
            ke keVar = adnVar.f19257f;
            if (amn.n(adnVar.f19260i - j2, this.f19747h) >= 25000000 && keVar.f22152h < keVarO.f22152h && (i2 = keVar.r) != -1 && i2 < 720 && (i3 = keVar.q) != -1 && i3 < 1280 && i2 < keVarO.r) {
                return i4;
            }
        }
        return size;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ahw, com.google.ads.interactivemedia.v3.internal.aii
    public final void g() {
        this.f19751l = null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ahw, com.google.ads.interactivemedia.v3.internal.aii
    public final void h() {
        this.f19750k = -9223372036854775807L;
        this.f19751l = null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ahw, com.google.ads.interactivemedia.v3.internal.aii
    public final void i(float f2) {
        this.f19747h = f2;
    }
}
