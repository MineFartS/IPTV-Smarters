package l;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class r extends f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient byte[][] f31093g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final transient int[] f31094h;

    public r(c cVar, int i2) {
        super(null);
        v.b(cVar.f31048d, 0L, i2);
        p pVar = cVar.f31047c;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            int i6 = pVar.f31086c;
            int i7 = pVar.f31085b;
            if (i6 == i7) {
                throw new AssertionError("s.limit == s.pos");
            }
            i4 += i6 - i7;
            i5++;
            pVar = pVar.f31089f;
        }
        this.f31093g = new byte[i5][];
        this.f31094h = new int[i5 * 2];
        p pVar2 = cVar.f31047c;
        int i8 = 0;
        while (i3 < i2) {
            byte[][] bArr = this.f31093g;
            bArr[i8] = pVar2.f31084a;
            int i9 = pVar2.f31086c;
            int i10 = pVar2.f31085b;
            i3 += i9 - i10;
            if (i3 > i2) {
                i3 = i2;
            }
            int[] iArr = this.f31094h;
            iArr[i8] = i3;
            iArr[bArr.length + i8] = i10;
            pVar2.f31087d = true;
            i8++;
            pVar2 = pVar2.f31089f;
        }
    }

    @Override // l.f
    public f B(int i2, int i3) {
        return H().B(i2, i3);
    }

    @Override // l.f
    public f C() {
        return H().C();
    }

    @Override // l.f
    public byte[] D() {
        int[] iArr = this.f31094h;
        byte[][] bArr = this.f31093g;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int[] iArr2 = this.f31094h;
            int i4 = iArr2[length + i2];
            int i5 = iArr2[i2];
            System.arraycopy(this.f31093g[i2], i4, bArr2, i3, i5 - i3);
            i2++;
            i3 = i5;
        }
        return bArr2;
    }

    @Override // l.f
    public String E() {
        return H().E();
    }

    @Override // l.f
    public void F(c cVar) {
        int length = this.f31093g.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int[] iArr = this.f31094h;
            int i4 = iArr[length + i2];
            int i5 = iArr[i2];
            p pVar = new p(this.f31093g[i2], i4, (i4 + i5) - i3);
            p pVar2 = cVar.f31047c;
            if (pVar2 == null) {
                pVar.f31090g = pVar;
                pVar.f31089f = pVar;
                cVar.f31047c = pVar;
            } else {
                pVar2.f31090g.c(pVar);
            }
            i2++;
            i3 = i5;
        }
        cVar.f31048d += (long) i3;
    }

    public final int G(int i2) {
        int iBinarySearch = Arrays.binarySearch(this.f31094h, 0, this.f31093g.length, i2 + 1);
        return iBinarySearch >= 0 ? iBinarySearch : iBinarySearch ^ (-1);
    }

    public final f H() {
        return new f(D());
    }

    @Override // l.f
    public String d() {
        return H().d();
    }

    @Override // l.f
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (fVar.size() == size() && w(0, fVar, 0, size())) {
                return true;
            }
        }
        return false;
    }

    @Override // l.f
    public int hashCode() {
        int i2 = this.f31054e;
        if (i2 != 0) {
            return i2;
        }
        int length = this.f31093g.length;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1;
        while (i3 < length) {
            byte[] bArr = this.f31093g[i3];
            int[] iArr = this.f31094h;
            int i6 = iArr[length + i3];
            int i7 = iArr[i3];
            int i8 = (i7 - i4) + i6;
            while (i6 < i8) {
                i5 = (i5 * 31) + bArr[i6];
                i6++;
            }
            i3++;
            i4 = i7;
        }
        this.f31054e = i5;
        return i5;
    }

    @Override // l.f
    public int size() {
        return this.f31094h[this.f31093g.length - 1];
    }

    @Override // l.f
    public byte t(int i2) {
        v.b(this.f31094h[this.f31093g.length - 1], i2, 1L);
        int iG = G(i2);
        int i3 = iG == 0 ? 0 : this.f31094h[iG - 1];
        int[] iArr = this.f31094h;
        byte[][] bArr = this.f31093g;
        return bArr[iG][(i2 - i3) + iArr[bArr.length + iG]];
    }

    @Override // l.f
    public String toString() {
        return H().toString();
    }

    @Override // l.f
    public String u() {
        return H().u();
    }

    @Override // l.f
    public boolean w(int i2, f fVar, int i3, int i4) {
        if (i2 < 0 || i2 > size() - i4) {
            return false;
        }
        int iG = G(i2);
        while (i4 > 0) {
            int i5 = iG == 0 ? 0 : this.f31094h[iG - 1];
            int iMin = Math.min(i4, ((this.f31094h[iG] - i5) + i5) - i2);
            int[] iArr = this.f31094h;
            byte[][] bArr = this.f31093g;
            if (!fVar.x(i3, bArr[iG], (i2 - i5) + iArr[bArr.length + iG], iMin)) {
                return false;
            }
            i2 += iMin;
            i3 += iMin;
            i4 -= iMin;
            iG++;
        }
        return true;
    }

    @Override // l.f
    public boolean x(int i2, byte[] bArr, int i3, int i4) {
        if (i2 < 0 || i2 > size() - i4 || i3 < 0 || i3 > bArr.length - i4) {
            return false;
        }
        int iG = G(i2);
        while (i4 > 0) {
            int i5 = iG == 0 ? 0 : this.f31094h[iG - 1];
            int iMin = Math.min(i4, ((this.f31094h[iG] - i5) + i5) - i2);
            int[] iArr = this.f31094h;
            byte[][] bArr2 = this.f31093g;
            if (!v.a(bArr2[iG], (i2 - i5) + iArr[bArr2.length + iG], bArr, i3, iMin)) {
                return false;
            }
            i2 += iMin;
            i3 += iMin;
            i4 -= iMin;
            iG++;
        }
        return true;
    }

    @Override // l.f
    public f y() {
        return H().y();
    }

    @Override // l.f
    public f z() {
        return H().z();
    }
}
