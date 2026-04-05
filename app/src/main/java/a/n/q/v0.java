package a.n.q;

import a.n.q.j;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public class v0 extends j {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final j.a f2969j = new j.a(0);

    public v0() {
        C(1);
    }

    public int H() {
        int i2 = this.f2831g;
        if (i2 >= 0) {
            return i2 + 1;
        }
        int i3 = this.f2833i;
        if (i3 != -1) {
            return Math.min(i3, this.f2826b.getCount() - 1);
        }
        return 0;
    }

    public int I() {
        int i2 = this.f2830f;
        if (i2 >= 0) {
            return i2 - 1;
        }
        int i3 = this.f2833i;
        return i3 != -1 ? Math.min(i3, this.f2826b.getCount() - 1) : this.f2826b.getCount() - 1;
    }

    @Override // a.n.q.j
    public final boolean c(int i2, boolean z) {
        int iC;
        if (this.f2826b.getCount() == 0) {
            return false;
        }
        if (!z && d(i2)) {
            return false;
        }
        int iH = H();
        boolean z2 = false;
        while (iH < this.f2826b.getCount()) {
            int iE = this.f2826b.e(iH, true, this.f2825a, false);
            if (this.f2830f < 0 || this.f2831g < 0) {
                iC = this.f2827c ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                this.f2830f = iH;
            } else if (this.f2827c) {
                int i3 = iH - 1;
                iC = (this.f2826b.c(i3) - this.f2826b.b(i3)) - this.f2828d;
            } else {
                int i4 = iH - 1;
                iC = this.f2826b.c(i4) + this.f2826b.b(i4) + this.f2828d;
            }
            this.f2831g = iH;
            this.f2826b.d(this.f2825a[0], iH, iE, 0, iC);
            if (z || d(i2)) {
                return true;
            }
            iH++;
            z2 = true;
        }
        return z2;
    }

    @Override // a.n.q.j
    public void f(int i2, int i3, RecyclerView.p.c cVar) {
        int I;
        int iC;
        if (!this.f2827c ? i3 < 0 : i3 > 0) {
            if (p() == this.f2826b.getCount() - 1) {
                return;
            }
            I = H();
            int iB = this.f2826b.b(this.f2831g) + this.f2828d;
            int iC2 = this.f2826b.c(this.f2831g);
            if (this.f2827c) {
                iB = -iB;
            }
            iC = iB + iC2;
        } else {
            if (m() == 0) {
                return;
            }
            I = I();
            iC = this.f2826b.c(this.f2830f) + (this.f2827c ? this.f2828d : -this.f2828d);
        }
        cVar.a(I, Math.abs(iC - i2));
    }

    @Override // a.n.q.j
    public final int i(boolean z, int i2, int[] iArr) {
        if (iArr != null) {
            iArr[0] = 0;
            iArr[1] = i2;
        }
        return this.f2827c ? this.f2826b.c(i2) : this.f2826b.c(i2) + this.f2826b.b(i2);
    }

    @Override // a.n.q.j
    public final int k(boolean z, int i2, int[] iArr) {
        if (iArr != null) {
            iArr[0] = 0;
            iArr[1] = i2;
        }
        return this.f2827c ? this.f2826b.c(i2) - this.f2826b.b(i2) : this.f2826b.c(i2);
    }

    @Override // a.n.q.j
    public final a.f.d[] o(int i2, int i3) {
        this.f2832h[0].b();
        this.f2832h[0].a(i2);
        this.f2832h[0].a(i3);
        return this.f2832h;
    }

    @Override // a.n.q.j
    public final j.a q(int i2) {
        return this.f2969j;
    }

    @Override // a.n.q.j
    public final boolean x(int i2, boolean z) {
        int iC;
        if (this.f2826b.getCount() == 0) {
            return false;
        }
        if (!z && e(i2)) {
            return false;
        }
        int iA = this.f2826b.a();
        int I = I();
        boolean z2 = false;
        while (I >= iA) {
            int iE = this.f2826b.e(I, false, this.f2825a, false);
            if (this.f2830f < 0 || this.f2831g < 0) {
                iC = this.f2827c ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                this.f2830f = I;
                this.f2831g = I;
            } else {
                iC = this.f2827c ? this.f2826b.c(I + 1) + this.f2828d + iE : (this.f2826b.c(I + 1) - this.f2828d) - iE;
                this.f2830f = I;
            }
            this.f2826b.d(this.f2825a[0], I, iE, 0, iC);
            if (z || e(i2)) {
                return true;
            }
            I--;
            z2 = true;
        }
        return z2;
    }
}
