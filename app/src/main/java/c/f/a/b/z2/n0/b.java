package c.f.a.b.z2.n0;

import android.net.Uri;
import android.util.Pair;
import c.f.a.b.j3.g;
import c.f.a.b.j3.i0;
import c.f.a.b.j3.x0;
import c.f.a.b.k1;
import c.f.a.b.t2.o0;
import c.f.a.b.w1;
import c.f.a.b.z2.a0;
import c.f.a.b.z2.j;
import c.f.a.b.z2.k;
import c.f.a.b.z2.l;
import c.f.a.b.z2.n;
import c.f.a.b.z2.o;
import c.f.a.b.z2.w;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f11450a = new o() { // from class: c.f.a.b.z2.n0.a
        @Override // c.f.a.b.z2.o
        public final j[] a() {
            return b.d();
        }

        @Override // c.f.a.b.z2.o
        public /* synthetic */ j[] b(Uri uri, Map map) {
            return n.a(this, uri, map);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l f11451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a0 f11452c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC0149b f11453d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f11454e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f11455f = -1;

    public static final class a implements InterfaceC0149b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f11456a = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int[] f11457b = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final l f11458c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final a0 f11459d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final c.f.a.b.z2.n0.c f11460e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f11461f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final byte[] f11462g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final i0 f11463h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f11464i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final k1 f11465j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f11466k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public long f11467l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f11468m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public long f11469n;

        public a(l lVar, a0 a0Var, c.f.a.b.z2.n0.c cVar) throws w1 {
            this.f11458c = lVar;
            this.f11459d = a0Var;
            this.f11460e = cVar;
            int iMax = Math.max(1, cVar.f11480c / 10);
            this.f11464i = iMax;
            i0 i0Var = new i0(cVar.f11484g);
            i0Var.v();
            int iV = i0Var.v();
            this.f11461f = iV;
            int i2 = cVar.f11479b;
            int i3 = (((cVar.f11482e - (i2 * 4)) * 8) / (cVar.f11483f * i2)) + 1;
            if (iV == i3) {
                int iK = x0.k(iMax, iV);
                this.f11462g = new byte[cVar.f11482e * iK];
                this.f11463h = new i0(iK * h(iV, i2));
                int i4 = ((cVar.f11480c * cVar.f11482e) * 8) / iV;
                this.f11465j = new k1.b().e0("audio/raw").G(i4).Z(i4).W(h(iMax, i2)).H(cVar.f11479b).f0(cVar.f11480c).Y(2).E();
                return;
            }
            throw w1.a("Expected frames per block: " + i3 + "; got: " + iV, null);
        }

        public static int h(int i2, int i3) {
            return i2 * 2 * i3;
        }

        @Override // c.f.a.b.z2.n0.b.InterfaceC0149b
        public void a(long j2) {
            this.f11466k = 0;
            this.f11467l = j2;
            this.f11468m = 0;
            this.f11469n = 0L;
        }

        @Override // c.f.a.b.z2.n0.b.InterfaceC0149b
        public void b(int i2, long j2) {
            this.f11458c.i(new e(this.f11460e, this.f11461f, i2, j2));
            this.f11459d.e(this.f11465j);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0036 -> B:4:0x001c). Please report as a decompilation issue!!! */
        @Override // c.f.a.b.z2.n0.b.InterfaceC0149b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean c(c.f.a.b.z2.k r7, long r8) {
            /*
                r6 = this;
                int r0 = r6.f11464i
                int r1 = r6.f11468m
                int r1 = r6.f(r1)
                int r0 = r0 - r1
                int r1 = r6.f11461f
                int r0 = c.f.a.b.j3.x0.k(r0, r1)
                c.f.a.b.z2.n0.c r1 = r6.f11460e
                int r1 = r1.f11482e
                int r0 = r0 * r1
                r1 = 1
                r2 = 0
                int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r4 != 0) goto L1e
            L1c:
                r2 = 1
                goto L1f
            L1e:
                r2 = 0
            L1f:
                if (r2 != 0) goto L3f
                int r3 = r6.f11466k
                if (r3 >= r0) goto L3f
                int r3 = r0 - r3
                long r3 = (long) r3
                long r3 = java.lang.Math.min(r3, r8)
                int r4 = (int) r3
                byte[] r3 = r6.f11462g
                int r5 = r6.f11466k
                int r3 = r7.b(r3, r5, r4)
                r4 = -1
                if (r3 != r4) goto L39
                goto L1c
            L39:
                int r4 = r6.f11466k
                int r4 = r4 + r3
                r6.f11466k = r4
                goto L1f
            L3f:
                int r7 = r6.f11466k
                c.f.a.b.z2.n0.c r8 = r6.f11460e
                int r8 = r8.f11482e
                int r7 = r7 / r8
                if (r7 <= 0) goto L77
                byte[] r8 = r6.f11462g
                c.f.a.b.j3.i0 r9 = r6.f11463h
                r6.d(r8, r7, r9)
                int r8 = r6.f11466k
                c.f.a.b.z2.n0.c r9 = r6.f11460e
                int r9 = r9.f11482e
                int r7 = r7 * r9
                int r8 = r8 - r7
                r6.f11466k = r8
                c.f.a.b.j3.i0 r7 = r6.f11463h
                int r7 = r7.f()
                c.f.a.b.z2.a0 r8 = r6.f11459d
                c.f.a.b.j3.i0 r9 = r6.f11463h
                r8.c(r9, r7)
                int r8 = r6.f11468m
                int r8 = r8 + r7
                r6.f11468m = r8
                int r7 = r6.f(r8)
                int r8 = r6.f11464i
                if (r7 < r8) goto L77
                r6.i(r8)
            L77:
                if (r2 == 0) goto L84
                int r7 = r6.f11468m
                int r7 = r6.f(r7)
                if (r7 <= 0) goto L84
                r6.i(r7)
            L84:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.z2.n0.b.a.c(c.f.a.b.z2.k, long):boolean");
        }

        public final void d(byte[] bArr, int i2, i0 i0Var) {
            for (int i3 = 0; i3 < i2; i3++) {
                for (int i4 = 0; i4 < this.f11460e.f11479b; i4++) {
                    e(bArr, i3, i4, i0Var.d());
                }
            }
            int iG = g(this.f11461f * i2);
            i0Var.P(0);
            i0Var.O(iG);
        }

        public final void e(byte[] bArr, int i2, int i3, byte[] bArr2) {
            c.f.a.b.z2.n0.c cVar = this.f11460e;
            int i4 = cVar.f11482e;
            int i5 = cVar.f11479b;
            int i6 = (i2 * i4) + (i3 * 4);
            int i7 = (i5 * 4) + i6;
            int i8 = (i4 / i5) - 4;
            int iR = (short) (((bArr[i6 + 1] & 255) << 8) | (bArr[i6] & 255));
            int iMin = Math.min(bArr[i6 + 2] & 255, 88);
            int i9 = f11457b[iMin];
            int i10 = ((i2 * this.f11461f * i5) + i3) * 2;
            bArr2[i10] = (byte) (iR & 255);
            bArr2[i10 + 1] = (byte) (iR >> 8);
            for (int i11 = 0; i11 < i8 * 2; i11++) {
                int i12 = bArr[((i11 / 8) * i5 * 4) + i7 + ((i11 / 2) % 4)] & 255;
                int i13 = i11 % 2 == 0 ? i12 & 15 : i12 >> 4;
                int i14 = ((((i13 & 7) * 2) + 1) * i9) >> 3;
                if ((i13 & 8) != 0) {
                    i14 = -i14;
                }
                iR = x0.r(iR + i14, -32768, 32767);
                i10 += i5 * 2;
                bArr2[i10] = (byte) (iR & 255);
                bArr2[i10 + 1] = (byte) (iR >> 8);
                int i15 = iMin + f11456a[i13];
                int[] iArr = f11457b;
                iMin = x0.r(i15, 0, iArr.length - 1);
                i9 = iArr[iMin];
            }
        }

        public final int f(int i2) {
            return i2 / (this.f11460e.f11479b * 2);
        }

        public final int g(int i2) {
            return h(i2, this.f11460e.f11479b);
        }

        public final void i(int i2) {
            long jP0 = this.f11467l + x0.P0(this.f11469n, 1000000L, this.f11460e.f11480c);
            int iG = g(i2);
            this.f11459d.d(jP0, 1, iG, this.f11468m - iG, null);
            this.f11469n += (long) i2;
            this.f11468m -= iG;
        }
    }

    /* JADX INFO: renamed from: c.f.a.b.z2.n0.b$b, reason: collision with other inner class name */
    public interface InterfaceC0149b {
        void a(long j2);

        void b(int i2, long j2);

        boolean c(k kVar, long j2);
    }

    public static final class c implements InterfaceC0149b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l f11470a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a0 f11471b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c.f.a.b.z2.n0.c f11472c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final k1 f11473d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f11474e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f11475f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f11476g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f11477h;

        public c(l lVar, a0 a0Var, c.f.a.b.z2.n0.c cVar, String str, int i2) throws w1 {
            this.f11470a = lVar;
            this.f11471b = a0Var;
            this.f11472c = cVar;
            int i3 = (cVar.f11479b * cVar.f11483f) / 8;
            if (cVar.f11482e == i3) {
                int i4 = cVar.f11480c;
                int i5 = i4 * i3 * 8;
                int iMax = Math.max(i3, (i4 * i3) / 10);
                this.f11474e = iMax;
                this.f11473d = new k1.b().e0(str).G(i5).Z(i5).W(iMax).H(cVar.f11479b).f0(cVar.f11480c).Y(i2).E();
                return;
            }
            throw w1.a("Expected block size: " + i3 + "; got: " + cVar.f11482e, null);
        }

        @Override // c.f.a.b.z2.n0.b.InterfaceC0149b
        public void a(long j2) {
            this.f11475f = j2;
            this.f11476g = 0;
            this.f11477h = 0L;
        }

        @Override // c.f.a.b.z2.n0.b.InterfaceC0149b
        public void b(int i2, long j2) {
            this.f11470a.i(new e(this.f11472c, 1, i2, j2));
            this.f11471b.e(this.f11473d);
        }

        @Override // c.f.a.b.z2.n0.b.InterfaceC0149b
        public boolean c(k kVar, long j2) {
            long j3;
            int i2;
            int i3;
            long j4 = j2;
            while (j4 > 0 && (i2 = this.f11476g) < (i3 = this.f11474e)) {
                int iB = this.f11471b.b(kVar, (int) Math.min(i3 - i2, j4), true);
                if (iB == -1) {
                    j4 = 0;
                } else {
                    this.f11476g += iB;
                    j4 -= (long) iB;
                }
            }
            int i4 = this.f11472c.f11482e;
            int i5 = this.f11476g / i4;
            if (i5 > 0) {
                long jP0 = this.f11475f + x0.P0(this.f11477h, 1000000L, r6.f11480c);
                int i6 = i5 * i4;
                int i7 = this.f11476g - i6;
                this.f11471b.d(jP0, 1, i6, i7, null);
                this.f11477h += (long) i5;
                this.f11476g = i7;
                j3 = 0;
            } else {
                j3 = 0;
            }
            return j4 <= j3;
        }
    }

    public static /* synthetic */ j[] d() {
        return new j[]{new b()};
    }

    @Override // c.f.a.b.z2.j
    public void a(long j2, long j3) {
        InterfaceC0149b interfaceC0149b = this.f11453d;
        if (interfaceC0149b != null) {
            interfaceC0149b.a(j3);
        }
    }

    @EnsuresNonNull({"extractorOutput", "trackOutput"})
    public final void b() {
        g.i(this.f11452c);
        x0.i(this.f11451b);
    }

    @Override // c.f.a.b.z2.j
    public void c(l lVar) {
        this.f11451b = lVar;
        this.f11452c = lVar.e(0, 1);
        lVar.p();
    }

    @Override // c.f.a.b.z2.j
    public boolean e(k kVar) {
        return d.a(kVar) != null;
    }

    @Override // c.f.a.b.z2.j
    public int g(k kVar, w wVar) throws w1 {
        InterfaceC0149b cVar;
        b();
        if (this.f11453d == null) {
            c.f.a.b.z2.n0.c cVarA = d.a(kVar);
            if (cVarA == null) {
                throw w1.a("Unsupported or unrecognized wav header.", null);
            }
            int i2 = cVarA.f11478a;
            if (i2 == 17) {
                cVar = new a(this.f11451b, this.f11452c, cVarA);
            } else if (i2 == 6) {
                cVar = new c(this.f11451b, this.f11452c, cVarA, "audio/g711-alaw", -1);
            } else if (i2 == 7) {
                cVar = new c(this.f11451b, this.f11452c, cVarA, "audio/g711-mlaw", -1);
            } else {
                int iA = o0.a(i2, cVarA.f11483f);
                if (iA == 0) {
                    throw w1.e("Unsupported WAV format type: " + cVarA.f11478a);
                }
                cVar = new c(this.f11451b, this.f11452c, cVarA, "audio/raw", iA);
            }
            this.f11453d = cVar;
        }
        if (this.f11454e == -1) {
            Pair<Long, Long> pairB = d.b(kVar);
            this.f11454e = ((Long) pairB.first).intValue();
            long jLongValue = ((Long) pairB.second).longValue();
            this.f11455f = jLongValue;
            this.f11453d.b(this.f11454e, jLongValue);
        } else if (kVar.getPosition() == 0) {
            kVar.s(this.f11454e);
        }
        g.g(this.f11455f != -1);
        return this.f11453d.c(kVar, this.f11455f - kVar.getPosition()) ? -1 : 0;
    }

    @Override // c.f.a.b.z2.j
    public void release() {
    }
}
