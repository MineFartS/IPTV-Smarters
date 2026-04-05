package com.google.ads.interactivemedia.v3.internal;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class acf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final alx f19155a = new alx(32);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ace f19156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ace f19157c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ace f19158d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f19159e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ajm f19160f;

    public acf(ajm ajmVar) {
        this.f19160f = ajmVar;
        ace aceVar = new ace(0L);
        this.f19156b = aceVar;
        this.f19157c = aceVar;
        this.f19158d = aceVar;
    }

    private final int j(int i2) {
        ace aceVar = this.f19158d;
        if (!aceVar.f19152c) {
            ait aitVarB = this.f19160f.b();
            ace aceVar2 = new ace(this.f19158d.f19151b);
            aceVar.f19153d = aitVarB;
            aceVar.f19154e = aceVar2;
            aceVar.f19152c = true;
        }
        return Math.min(i2, (int) (this.f19158d.f19151b - this.f19159e));
    }

    private static ace k(ace aceVar, long j2) {
        while (j2 >= aceVar.f19151b) {
            aceVar = aceVar.f19154e;
        }
        return aceVar;
    }

    private static ace l(ace aceVar, long j2, ByteBuffer byteBuffer, int i2) {
        ace aceVarK = k(aceVar, j2);
        while (i2 > 0) {
            int iMin = Math.min(i2, (int) (aceVarK.f19151b - j2));
            byteBuffer.put(aceVarK.f19153d.f19854a, aceVarK.a(j2), iMin);
            i2 -= iMin;
            j2 += (long) iMin;
            if (j2 == aceVarK.f19151b) {
                aceVarK = aceVarK.f19154e;
            }
        }
        return aceVarK;
    }

    private static ace m(ace aceVar, long j2, byte[] bArr, int i2) {
        ace aceVarK = k(aceVar, j2);
        int i3 = i2;
        while (i3 > 0) {
            int iMin = Math.min(i3, (int) (aceVarK.f19151b - j2));
            System.arraycopy(aceVarK.f19153d.f19854a, aceVarK.a(j2), bArr, i2 - i3, iMin);
            i3 -= iMin;
            j2 += (long) iMin;
            if (j2 == aceVarK.f19151b) {
                aceVarK = aceVarK.f19154e;
            }
        }
        return aceVarK;
    }

    private static ace n(ace aceVar, pz pzVar, acg acgVar, alx alxVar) {
        ace aceVarM;
        int iO;
        if (pzVar.k()) {
            long j2 = acgVar.f19162b;
            alxVar.E(1);
            ace aceVarM2 = m(aceVar, j2, alxVar.K(), 1);
            long j3 = j2 + 1;
            byte b2 = alxVar.K()[0];
            int i2 = b2 & 128;
            int i3 = b2 & 127;
            pv pvVar = pzVar.f22800a;
            byte[] bArr = pvVar.f22784a;
            if (bArr == null) {
                pvVar.f22784a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            aceVarM = m(aceVarM2, j3, pvVar.f22784a, i3);
            long j4 = j3 + ((long) i3);
            if (i2 != 0) {
                alxVar.E(2);
                aceVarM = m(aceVarM, j4, alxVar.K(), 2);
                j4 += 2;
                iO = alxVar.o();
            } else {
                iO = 1;
            }
            int[] iArr = pvVar.f22785b;
            if (iArr == null || iArr.length < iO) {
                iArr = new int[iO];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = pvVar.f22786c;
            if (iArr3 == null || iArr3.length < iO) {
                iArr3 = new int[iO];
            }
            int[] iArr4 = iArr3;
            if (i2 != 0) {
                int i4 = iO * 6;
                alxVar.E(i4);
                aceVarM = m(aceVarM, j4, alxVar.K(), i4);
                j4 += (long) i4;
                alxVar.I(0);
                for (int i5 = 0; i5 < iO; i5++) {
                    iArr2[i5] = alxVar.o();
                    iArr4[i5] = alxVar.n();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = acgVar.f19161a - ((int) (j4 - acgVar.f19162b));
            }
            se seVar = acgVar.f19163c;
            int i6 = amn.f20135a;
            pvVar.c(iO, iArr2, iArr4, seVar.f22938b, pvVar.f22784a, seVar.f22937a, seVar.f22939c, seVar.f22940d);
            long j5 = acgVar.f19162b;
            int i7 = (int) (j4 - j5);
            acgVar.f19162b = j5 + ((long) i7);
            acgVar.f19161a -= i7;
        } else {
            aceVarM = aceVar;
        }
        if (!pzVar.e()) {
            pzVar.i(acgVar.f19161a);
            return l(aceVarM, acgVar.f19162b, pzVar.f22801b, acgVar.f19161a);
        }
        alxVar.E(4);
        ace aceVarM3 = m(aceVarM, acgVar.f19162b, alxVar.K(), 4);
        int iN = alxVar.n();
        acgVar.f19162b += 4;
        acgVar.f19161a -= 4;
        pzVar.i(iN);
        ace aceVarL = l(aceVarM3, acgVar.f19162b, pzVar.f22801b, iN);
        acgVar.f19162b += (long) iN;
        int i8 = acgVar.f19161a - iN;
        acgVar.f19161a = i8;
        ByteBuffer byteBuffer = pzVar.f22804e;
        if (byteBuffer == null || byteBuffer.capacity() < i8) {
            pzVar.f22804e = ByteBuffer.allocate(i8);
        } else {
            pzVar.f22804e.clear();
        }
        return l(aceVarL, acgVar.f19162b, pzVar.f22804e, acgVar.f19161a);
    }

    private final void o(ace aceVar) {
        if (aceVar.f19152c) {
            ace aceVar2 = this.f19158d;
            boolean z = aceVar2.f19152c;
            int i2 = (z ? 1 : 0) + (((int) (aceVar2.f19150a - aceVar.f19150a)) / 65536);
            ait[] aitVarArr = new ait[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                aitVarArr[i3] = aceVar.f19153d;
                aceVar = aceVar.b();
            }
            this.f19160f.d(aitVarArr);
        }
    }

    private final void p(int i2) {
        long j2 = this.f19159e + ((long) i2);
        this.f19159e = j2;
        ace aceVar = this.f19158d;
        if (j2 == aceVar.f19151b) {
            this.f19158d = aceVar.f19154e;
        }
    }

    public final int a(aje ajeVar, int i2, boolean z) throws EOFException {
        int iJ = j(i2);
        ace aceVar = this.f19158d;
        int iB = ajeVar.b(aceVar.f19153d.f19854a, aceVar.a(this.f19159e), iJ);
        if (iB != -1) {
            p(iB);
            return iB;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    public final long b() {
        return this.f19159e;
    }

    public final void c(long j2) {
        ace aceVar;
        if (j2 != -1) {
            while (true) {
                aceVar = this.f19156b;
                if (j2 < aceVar.f19151b) {
                    break;
                }
                this.f19160f.c(aceVar.f19153d);
                this.f19156b = this.f19156b.b();
            }
            if (this.f19157c.f19150a < aceVar.f19150a) {
                this.f19157c = aceVar;
            }
        }
    }

    public final void d(long j2) {
        this.f19159e = j2;
        if (j2 != 0) {
            ace aceVar = this.f19156b;
            if (j2 != aceVar.f19150a) {
                while (this.f19159e > aceVar.f19151b) {
                    aceVar = aceVar.f19154e;
                }
                ace aceVar2 = aceVar.f19154e;
                o(aceVar2);
                ace aceVar3 = new ace(aceVar.f19151b);
                aceVar.f19154e = aceVar3;
                if (this.f19159e == aceVar.f19151b) {
                    aceVar = aceVar3;
                }
                this.f19158d = aceVar;
                if (this.f19157c == aceVar2) {
                    this.f19157c = aceVar3;
                    return;
                }
                return;
            }
        }
        o(this.f19156b);
        ace aceVar4 = new ace(this.f19159e);
        this.f19156b = aceVar4;
        this.f19157c = aceVar4;
        this.f19158d = aceVar4;
    }

    public final void e(pz pzVar, acg acgVar) {
        n(this.f19157c, pzVar, acgVar, this.f19155a);
    }

    public final void f(pz pzVar, acg acgVar) {
        this.f19157c = n(this.f19157c, pzVar, acgVar, this.f19155a);
    }

    public final void g() {
        o(this.f19156b);
        ace aceVar = new ace(0L);
        this.f19156b = aceVar;
        this.f19157c = aceVar;
        this.f19158d = aceVar;
        this.f19159e = 0L;
        this.f19160f.g();
    }

    public final void h() {
        this.f19157c = this.f19156b;
    }

    public final void i(alx alxVar, int i2) {
        while (i2 > 0) {
            int iJ = j(i2);
            ace aceVar = this.f19158d;
            alxVar.D(aceVar.f19153d.f19854a, aceVar.a(this.f19159e), iJ);
            i2 -= iJ;
            p(iJ);
        }
    }
}
