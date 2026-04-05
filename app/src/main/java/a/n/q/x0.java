package a.n.q;

import a.n.q.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class x0 extends j {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a.f.c<a> f2974j = new a.f.c<>(64);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f2975k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f2976l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f2977m;

    public static class a extends j.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f2978b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f2979c;

        public a(int i2, int i3, int i4) {
            super(i2);
            this.f2978b = i3;
            this.f2979c = i4;
        }
    }

    public final boolean H(int i2, boolean z) {
        int i3;
        int iC;
        int i4;
        if (this.f2974j.h() == 0) {
            return false;
        }
        int count = this.f2826b.getCount();
        int i5 = this.f2831g;
        if (i5 >= 0) {
            i3 = i5 + 1;
            iC = this.f2826b.c(i5);
        } else {
            int i6 = this.f2833i;
            i3 = i6 != -1 ? i6 : 0;
            if (i3 > M() + 1 || i3 < L()) {
                this.f2974j.c();
                return false;
            }
            if (i3 > M()) {
                return false;
            }
            iC = Integer.MAX_VALUE;
        }
        int iM = M();
        int i7 = i3;
        while (i7 < count && i7 <= iM) {
            a aVarQ = q(i7);
            if (iC != Integer.MAX_VALUE) {
                iC += aVarQ.f2978b;
            }
            int i8 = aVarQ.f2834a;
            int iE = this.f2826b.e(i7, true, this.f2825a, false);
            if (iE != aVarQ.f2979c) {
                aVarQ.f2979c = iE;
                this.f2974j.f(iM - i7);
                i4 = i7;
            } else {
                i4 = iM;
            }
            this.f2831g = i7;
            if (this.f2830f < 0) {
                this.f2830f = i7;
            }
            this.f2826b.d(this.f2825a[0], i7, iE, i8, iC);
            if (!z && d(i2)) {
                return true;
            }
            if (iC == Integer.MAX_VALUE) {
                iC = this.f2826b.c(i7);
            }
            if (i8 == this.f2829e - 1 && z) {
                return true;
            }
            i7++;
            iM = i4;
        }
        return false;
    }

    public final int I(int i2, int i3, int i4) {
        int i5 = this.f2831g;
        if (i5 >= 0 && (i5 != M() || this.f2831g != i2 - 1)) {
            throw new IllegalStateException();
        }
        int i6 = this.f2831g;
        a aVar = new a(i3, i6 < 0 ? (this.f2974j.h() <= 0 || i2 != M() + 1) ? 0 : K(i3) : i4 - this.f2826b.c(i6), 0);
        this.f2974j.b(aVar);
        Object obj = this.f2976l;
        if (obj != null) {
            aVar.f2979c = this.f2977m;
            this.f2976l = null;
        } else {
            aVar.f2979c = this.f2826b.e(i2, true, this.f2825a, false);
            obj = this.f2825a[0];
        }
        Object obj2 = obj;
        if (this.f2974j.h() == 1) {
            this.f2831g = i2;
            this.f2830f = i2;
            this.f2975k = i2;
        } else {
            int i7 = this.f2831g;
            if (i7 < 0) {
                this.f2831g = i2;
                this.f2830f = i2;
            } else {
                this.f2831g = i7 + 1;
            }
        }
        this.f2826b.d(obj2, i2, aVar.f2979c, i3, i4);
        return aVar.f2979c;
    }

    public abstract boolean J(int i2, boolean z);

    public final int K(int i2) {
        boolean z;
        int iM = M();
        while (true) {
            if (iM < this.f2975k) {
                z = false;
                break;
            }
            if (q(iM).f2834a == i2) {
                z = true;
                break;
            }
            iM--;
        }
        if (!z) {
            iM = M();
        }
        int i3 = u() ? (-q(iM).f2979c) - this.f2828d : q(iM).f2979c + this.f2828d;
        for (int i4 = iM + 1; i4 <= M(); i4++) {
            i3 -= q(i4).f2978b;
        }
        return i3;
    }

    public final int L() {
        return this.f2975k;
    }

    public final int M() {
        return (this.f2975k + this.f2974j.h()) - 1;
    }

    @Override // a.n.q.j
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public final a q(int i2) {
        int i3 = i2 - this.f2975k;
        if (i3 < 0 || i3 >= this.f2974j.h()) {
            return null;
        }
        return this.f2974j.e(i3);
    }

    public final boolean O(int i2, boolean z) {
        int iC;
        int i3;
        int i4;
        if (this.f2974j.h() == 0) {
            return false;
        }
        int i5 = this.f2830f;
        if (i5 >= 0) {
            iC = this.f2826b.c(i5);
            i4 = q(this.f2830f).f2978b;
            i3 = this.f2830f - 1;
        } else {
            iC = Integer.MAX_VALUE;
            int i6 = this.f2833i;
            i3 = i6 != -1 ? i6 : 0;
            if (i3 > M() || i3 < L() - 1) {
                this.f2974j.c();
                return false;
            }
            if (i3 < L()) {
                return false;
            }
            i4 = 0;
        }
        int iMax = Math.max(this.f2826b.a(), this.f2975k);
        while (i3 >= iMax) {
            a aVarQ = q(i3);
            int i7 = aVarQ.f2834a;
            int iE = this.f2826b.e(i3, false, this.f2825a, false);
            if (iE != aVarQ.f2979c) {
                this.f2974j.g((i3 + 1) - this.f2975k);
                this.f2975k = this.f2830f;
                this.f2976l = this.f2825a[0];
                this.f2977m = iE;
                return false;
            }
            this.f2830f = i3;
            if (this.f2831g < 0) {
                this.f2831g = i3;
            }
            this.f2826b.d(this.f2825a[0], i3, iE, i7, iC - i4);
            if (!z && e(i2)) {
                return true;
            }
            iC = this.f2826b.c(i3);
            i4 = aVarQ.f2978b;
            if (i7 == 0 && z) {
                return true;
            }
            i3--;
        }
        return false;
    }

    public final int P(int i2, int i3, int i4) {
        int i5 = this.f2830f;
        if (i5 >= 0 && (i5 != L() || this.f2830f != i2 + 1)) {
            throw new IllegalStateException();
        }
        int i6 = this.f2975k;
        a aVarQ = i6 >= 0 ? q(i6) : null;
        int iC = this.f2826b.c(this.f2975k);
        a aVar = new a(i3, 0, 0);
        this.f2974j.a(aVar);
        Object obj = this.f2976l;
        if (obj != null) {
            aVar.f2979c = this.f2977m;
            this.f2976l = null;
        } else {
            aVar.f2979c = this.f2826b.e(i2, false, this.f2825a, false);
            obj = this.f2825a[0];
        }
        Object obj2 = obj;
        this.f2830f = i2;
        this.f2975k = i2;
        if (this.f2831g < 0) {
            this.f2831g = i2;
        }
        int i7 = !this.f2827c ? i4 - aVar.f2979c : i4 + aVar.f2979c;
        if (aVarQ != null) {
            aVarQ.f2978b = iC - i7;
        }
        this.f2826b.d(obj2, i2, aVar.f2979c, i3, i7);
        return aVar.f2979c;
    }

    public abstract boolean Q(int i2, boolean z);

    @Override // a.n.q.j
    public final boolean c(int i2, boolean z) {
        boolean zJ;
        if (this.f2826b.getCount() == 0) {
            return false;
        }
        if (!z && d(i2)) {
            return false;
        }
        try {
            if (H(i2, z)) {
                zJ = true;
                this.f2825a[0] = null;
            } else {
                zJ = J(i2, z);
                this.f2825a[0] = null;
            }
            this.f2976l = null;
            return zJ;
        } catch (Throwable th) {
            this.f2825a[0] = null;
            this.f2976l = null;
            throw th;
        }
    }

    @Override // a.n.q.j
    public final a.f.d[] o(int i2, int i3) {
        for (int i4 = 0; i4 < this.f2829e; i4++) {
            this.f2832h[i4].b();
        }
        if (i2 >= 0) {
            while (i2 <= i3) {
                a.f.d dVar = this.f2832h[q(i2).f2834a];
                if (dVar.g() <= 0 || dVar.e() != i2 - 1) {
                    dVar.a(i2);
                } else {
                    dVar.f();
                }
                dVar.a(i2);
                i2++;
            }
        }
        return this.f2832h;
    }

    @Override // a.n.q.j
    public void t(int i2) {
        super.t(i2);
        this.f2974j.f((M() - i2) + 1);
        if (this.f2974j.h() == 0) {
            this.f2975k = -1;
        }
    }

    @Override // a.n.q.j
    public final boolean x(int i2, boolean z) {
        boolean zQ;
        if (this.f2826b.getCount() == 0) {
            return false;
        }
        if (!z && e(i2)) {
            return false;
        }
        try {
            if (O(i2, z)) {
                zQ = true;
                this.f2825a[0] = null;
            } else {
                zQ = Q(i2, z);
                this.f2825a[0] = null;
            }
            this.f2976l = null;
            return zQ;
        } catch (Throwable th) {
            this.f2825a[0] = null;
            this.f2976l = null;
            throw th;
        }
    }
}
