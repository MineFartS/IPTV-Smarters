package a.n.q;

import android.util.SparseIntArray;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f2826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2828d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2829e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a.f.d[] f2832h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f2825a = new Object[1];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2830f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2831g = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f2833i = -1;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2834a;

        public a(int i2) {
            this.f2834a = i2;
        }
    }

    public interface b {
        int a();

        int b(int i2);

        int c(int i2);

        void d(Object obj, int i2, int i3, int i4, int i5);

        int e(int i2, boolean z, Object[] objArr, boolean z2);

        int getCount();

        void removeItem(int i2);
    }

    public static j g(int i2) {
        if (i2 == 1) {
            return new v0();
        }
        y0 y0Var = new y0();
        y0Var.C(i2);
        return y0Var;
    }

    public void A() {
        this.f2831g = -1;
        this.f2830f = -1;
    }

    public final void B() {
        if (this.f2831g < this.f2830f) {
            A();
        }
    }

    public void C(int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException();
        }
        if (this.f2829e == i2) {
            return;
        }
        this.f2829e = i2;
        this.f2832h = new a.f.d[i2];
        for (int i3 = 0; i3 < this.f2829e; i3++) {
            this.f2832h[i3] = new a.f.d();
        }
    }

    public void D(b bVar) {
        this.f2826b = bVar;
    }

    public final void E(boolean z) {
        this.f2827c = z;
    }

    public final void F(int i2) {
        this.f2828d = i2;
    }

    public void G(int i2) {
        this.f2833i = i2;
    }

    public boolean a() {
        return c(this.f2827c ? Integer.MAX_VALUE : Integer.MIN_VALUE, true);
    }

    public final void b(int i2) {
        c(i2, false);
    }

    public abstract boolean c(int i2, boolean z);

    public final boolean d(int i2) {
        if (this.f2831g < 0) {
            return false;
        }
        if (this.f2827c) {
            if (l(true, null) > i2 + this.f2828d) {
                return false;
            }
        } else if (j(false, null) < i2 - this.f2828d) {
            return false;
        }
        return true;
    }

    public final boolean e(int i2) {
        if (this.f2831g < 0) {
            return false;
        }
        if (this.f2827c) {
            if (j(false, null) < i2 - this.f2828d) {
                return false;
            }
        } else if (l(true, null) > i2 + this.f2828d) {
            return false;
        }
        return true;
    }

    public void f(int i2, int i3, RecyclerView.p.c cVar) {
    }

    public void h(int[] iArr, int i2, SparseIntArray sparseIntArray) {
        int iP = p();
        int iBinarySearch = iP >= 0 ? Arrays.binarySearch(iArr, 0, i2, iP) : 0;
        if (iBinarySearch < 0) {
            int iC = this.f2827c ? (this.f2826b.c(iP) - this.f2826b.b(iP)) - this.f2828d : this.f2826b.c(iP) + this.f2826b.b(iP) + this.f2828d;
            for (int i3 = (-iBinarySearch) - 1; i3 < i2; i3++) {
                int i4 = iArr[i3];
                int i5 = sparseIntArray.get(i4);
                int i6 = i5 < 0 ? 0 : i5;
                int iE = this.f2826b.e(i4, true, this.f2825a, true);
                this.f2826b.d(this.f2825a[0], i4, iE, i6, iC);
                iC = this.f2827c ? (iC - iE) - this.f2828d : iC + iE + this.f2828d;
            }
        }
        int iM = m();
        int iBinarySearch2 = iM >= 0 ? Arrays.binarySearch(iArr, 0, i2, iM) : 0;
        if (iBinarySearch2 < 0) {
            boolean z = this.f2827c;
            int iC2 = this.f2826b.c(iM);
            for (int i7 = (-iBinarySearch2) - 2; i7 >= 0; i7--) {
                int i8 = iArr[i7];
                int i9 = sparseIntArray.get(i8);
                int i10 = i9 < 0 ? 0 : i9;
                int iE2 = this.f2826b.e(i8, false, this.f2825a, true);
                iC2 = this.f2827c ? iC2 + this.f2828d + iE2 : (iC2 - this.f2828d) - iE2;
                this.f2826b.d(this.f2825a[0], i8, iE2, i10, iC2);
            }
        }
    }

    public abstract int i(boolean z, int i2, int[] iArr);

    public final int j(boolean z, int[] iArr) {
        return i(z, this.f2827c ? this.f2830f : this.f2831g, iArr);
    }

    public abstract int k(boolean z, int i2, int[] iArr);

    public final int l(boolean z, int[] iArr) {
        return k(z, this.f2827c ? this.f2831g : this.f2830f, iArr);
    }

    public final int m() {
        return this.f2830f;
    }

    public final a.f.d[] n() {
        return o(m(), p());
    }

    public abstract a.f.d[] o(int i2, int i3);

    public final int p() {
        return this.f2831g;
    }

    public abstract a q(int i2);

    public int r() {
        return this.f2829e;
    }

    public final int s(int i2) {
        a aVarQ = q(i2);
        if (aVarQ == null) {
            return -1;
        }
        return aVarQ.f2834a;
    }

    public void t(int i2) {
        int i3;
        if (i2 >= 0 && (i3 = this.f2831g) >= 0) {
            if (i3 >= i2) {
                this.f2831g = i2 - 1;
            }
            B();
            if (m() < 0) {
                G(i2);
            }
        }
    }

    public boolean u() {
        return this.f2827c;
    }

    public final boolean v() {
        return x(this.f2827c ? Integer.MIN_VALUE : Integer.MAX_VALUE, true);
    }

    public final void w(int i2) {
        x(i2, false);
    }

    public abstract boolean x(int i2, boolean z);

    public void y(int i2, int i3) {
        while (true) {
            int i4 = this.f2831g;
            if (i4 >= this.f2830f && i4 > i2) {
                boolean z = false;
                if (this.f2827c ? this.f2826b.c(i4) <= i3 : this.f2826b.c(i4) >= i3) {
                    z = true;
                }
                if (!z) {
                    break;
                }
                this.f2826b.removeItem(this.f2831g);
                this.f2831g--;
            } else {
                break;
            }
        }
        B();
    }

    public void z(int i2, int i3) {
        while (true) {
            int i4 = this.f2831g;
            int i5 = this.f2830f;
            if (i4 >= i5 && i5 < i2) {
                int iB = this.f2826b.b(i5);
                boolean z = false;
                if (this.f2827c ? this.f2826b.c(this.f2830f) - iB >= i3 : this.f2826b.c(this.f2830f) + iB <= i3) {
                    z = true;
                }
                if (!z) {
                    break;
                }
                this.f2826b.removeItem(this.f2830f);
                this.f2830f++;
            } else {
                break;
            }
        }
        B();
    }
}
