package androidx.recyclerview.widget;

import a.i.r.g0.c;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public boolean I;
    public int J;
    public int[] K;
    public View[] L;
    public final SparseIntArray M;
    public final SparseIntArray N;
    public c O;
    public final Rect P;
    public boolean Q;

    public static final class a extends c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int e(int i2, int i3) {
            return i2 % i3;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int f(int i2) {
            return 1;
        }
    }

    public static class b extends RecyclerView.q {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f4768e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f4769f;

        public b(int i2, int i3) {
            super(i2, i3);
            this.f4768e = -1;
            this.f4769f = 0;
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f4768e = -1;
            this.f4769f = 0;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f4768e = -1;
            this.f4769f = 0;
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f4768e = -1;
            this.f4769f = 0;
        }

        public int g() {
            return this.f4768e;
        }

        public int h() {
            return this.f4769f;
        }
    }

    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SparseIntArray f4770a = new SparseIntArray();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SparseIntArray f4771b = new SparseIntArray();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f4772c = false;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f4773d = false;

        public static int a(SparseIntArray sparseIntArray, int i2) {
            int size = sparseIntArray.size() - 1;
            int i3 = 0;
            while (i3 <= size) {
                int i4 = (i3 + size) >>> 1;
                if (sparseIntArray.keyAt(i4) < i2) {
                    i3 = i4 + 1;
                } else {
                    size = i4 - 1;
                }
            }
            int i5 = i3 - 1;
            if (i5 < 0 || i5 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i5);
        }

        public int b(int i2, int i3) {
            if (!this.f4773d) {
                return d(i2, i3);
            }
            int i4 = this.f4771b.get(i2, -1);
            if (i4 != -1) {
                return i4;
            }
            int iD = d(i2, i3);
            this.f4771b.put(i2, iD);
            return iD;
        }

        public int c(int i2, int i3) {
            if (!this.f4772c) {
                return e(i2, i3);
            }
            int i4 = this.f4770a.get(i2, -1);
            if (i4 != -1) {
                return i4;
            }
            int iE = e(i2, i3);
            this.f4770a.put(i2, iE);
            return iE;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
        /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int d(int r7, int r8) {
            /*
                r6 = this;
                boolean r0 = r6.f4773d
                r1 = 0
                if (r0 == 0) goto L24
                android.util.SparseIntArray r0 = r6.f4771b
                int r0 = a(r0, r7)
                r2 = -1
                if (r0 == r2) goto L24
                android.util.SparseIntArray r2 = r6.f4771b
                int r2 = r2.get(r0)
                int r3 = r0 + 1
                int r4 = r6.c(r0, r8)
                int r0 = r6.f(r0)
                int r4 = r4 + r0
                if (r4 != r8) goto L27
                int r2 = r2 + 1
                goto L26
            L24:
                r2 = 0
                r3 = 0
            L26:
                r4 = 0
            L27:
                int r0 = r6.f(r7)
            L2b:
                if (r3 >= r7) goto L40
                int r5 = r6.f(r3)
                int r4 = r4 + r5
                if (r4 != r8) goto L38
                int r2 = r2 + 1
                r4 = 0
                goto L3d
            L38:
                if (r4 <= r8) goto L3d
                int r2 = r2 + 1
                r4 = r5
            L3d:
                int r3 = r3 + 1
                goto L2b
            L40:
                int r4 = r4 + r0
                if (r4 <= r8) goto L45
                int r2 = r2 + 1
            L45:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.c.d(int, int):int");
        }

        public abstract int e(int i2, int i3);

        public abstract int f(int i2);

        public void g() {
            this.f4771b.clear();
        }

        public void h() {
            this.f4770a.clear();
        }
    }

    public GridLayoutManager(Context context, int i2) {
        super(context);
        this.I = false;
        this.J = -1;
        this.M = new SparseIntArray();
        this.N = new SparseIntArray();
        this.O = new a();
        this.P = new Rect();
        f3(i2);
    }

    public GridLayoutManager(Context context, int i2, int i3, boolean z) {
        super(context, i3, z);
        this.I = false;
        this.J = -1;
        this.M = new SparseIntArray();
        this.N = new SparseIntArray();
        this.O = new a();
        this.P = new Rect();
        f3(i2);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.I = false;
        this.J = -1;
        this.M = new SparseIntArray();
        this.N = new SparseIntArray();
        this.O = new a();
        this.P = new Rect();
        f3(RecyclerView.p.k0(context, attributeSet, i2, i3).f4903b);
    }

    public static int[] R2(int[] iArr, int i2, int i3) {
        int i4;
        if (iArr == null || iArr.length != i2 + 1 || iArr[iArr.length - 1] != i3) {
            iArr = new int[i2 + 1];
        }
        int i5 = 0;
        iArr[0] = 0;
        int i6 = i3 / i2;
        int i7 = i3 % i2;
        int i8 = 0;
        for (int i9 = 1; i9 <= i2; i9++) {
            i5 += i7;
            if (i5 <= 0 || i2 - i5 >= i7) {
                i4 = i6;
            } else {
                i4 = i6 + 1;
                i5 -= i2;
            }
            i8 += i4;
            iArr[i9] = i8;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int B1(int i2, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        g3();
        W2();
        return super.B1(i2, wVar, b0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q F() {
        return this.s == 0 ? new b(-2, -1) : new b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void F2(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.F2(false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q G(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void G1(Rect rect, int i2, int i3) {
        int iO;
        int iO2;
        if (this.K == null) {
            super.G1(rect, i2, i3);
        }
        int iG0 = g0() + h0();
        int iI0 = i0() + f0();
        if (this.s == 1) {
            iO2 = RecyclerView.p.o(i3, rect.height() + iI0, d0());
            int[] iArr = this.K;
            iO = RecyclerView.p.o(i2, iArr[iArr.length - 1] + iG0, e0());
        } else {
            iO = RecyclerView.p.o(i2, rect.width() + iG0, e0());
            int[] iArr2 = this.K;
            iO2 = RecyclerView.p.o(i3, iArr2[iArr2.length - 1] + iI0, d0());
        }
        F1(iO, iO2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q H(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new b((ViewGroup.MarginLayoutParams) layoutParams) : new b(layoutParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d6, code lost:
    
        if (r13 == (r2 > r15)) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0107  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View M0(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.w r26, androidx.recyclerview.widget.RecyclerView.b0 r27) {
        /*
            Method dump skipped, instruction units count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.M0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$b0):android.view.View");
    }

    public final void O2(RecyclerView.w wVar, RecyclerView.b0 b0Var, int i2, boolean z) {
        int i3;
        int i4;
        int i5 = 0;
        int i6 = -1;
        if (z) {
            i6 = i2;
            i3 = 0;
            i4 = 1;
        } else {
            i3 = i2 - 1;
            i4 = -1;
        }
        while (i3 != i6) {
            View view = this.L[i3];
            b bVar = (b) view.getLayoutParams();
            int iB3 = b3(wVar, b0Var, j0(view));
            bVar.f4769f = iB3;
            bVar.f4768e = i5;
            i5 += iB3;
            i3 += i4;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int P(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (this.s == 1) {
            return this.J;
        }
        if (b0Var.c() < 1) {
            return 0;
        }
        return Z2(wVar, b0Var, b0Var.c() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public boolean P1() {
        return this.D == null && !this.I;
    }

    public final void P2() {
        int iL = L();
        for (int i2 = 0; i2 < iL; i2++) {
            b bVar = (b) K(i2).getLayoutParams();
            int iB = bVar.b();
            this.M.put(iB, bVar.h());
            this.N.put(iB, bVar.g());
        }
    }

    public final void Q2(int i2) {
        this.K = R2(this.K, this.J, i2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void R1(RecyclerView.b0 b0Var, LinearLayoutManager.c cVar, RecyclerView.p.c cVar2) {
        int iF = this.J;
        for (int i2 = 0; i2 < this.J && cVar.c(b0Var) && iF > 0; i2++) {
            int i3 = cVar.f4786d;
            cVar2.a(i3, Math.max(0, cVar.f4789g));
            iF -= this.O.f(i3);
            cVar.f4786d += cVar.f4787e;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void S0(RecyclerView.w wVar, RecyclerView.b0 b0Var, View view, a.i.r.g0.c cVar) {
        int iH;
        int iG;
        int iH2;
        boolean z;
        boolean z2;
        int iG2;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            super.R0(view, cVar);
            return;
        }
        b bVar = (b) layoutParams;
        int iZ2 = Z2(wVar, b0Var, bVar.b());
        if (this.s == 0) {
            iG2 = bVar.g();
            iH = bVar.h();
            iH2 = 1;
            z = false;
            z2 = false;
            iG = iZ2;
        } else {
            iH = 1;
            iG = bVar.g();
            iH2 = bVar.h();
            z = false;
            z2 = false;
            iG2 = iZ2;
        }
        cVar.a0(c.C0042c.a(iG2, iH, iG, iH2, z, z2));
    }

    public final void S2() {
        this.M.clear();
        this.N.clear();
    }

    public final int T2(RecyclerView.b0 b0Var) {
        if (L() != 0 && b0Var.c() != 0) {
            X1();
            boolean zR2 = r2();
            View viewB2 = b2(!zR2, true);
            View viewA2 = a2(!zR2, true);
            if (viewB2 != null && viewA2 != null) {
                int iB = this.O.b(j0(viewB2), this.J);
                int iB2 = this.O.b(j0(viewA2), this.J);
                int iMax = this.x ? Math.max(0, ((this.O.b(b0Var.c() - 1, this.J) + 1) - Math.max(iB, iB2)) - 1) : Math.max(0, Math.min(iB, iB2));
                if (zR2) {
                    return Math.round((iMax * (Math.abs(this.u.d(viewA2) - this.u.g(viewB2)) / ((this.O.b(j0(viewA2), this.J) - this.O.b(j0(viewB2), this.J)) + 1))) + (this.u.m() - this.u.g(viewB2)));
                }
                return iMax;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void U0(RecyclerView recyclerView, int i2, int i3) {
        this.O.h();
        this.O.g();
    }

    public final int U2(RecyclerView.b0 b0Var) {
        if (L() != 0 && b0Var.c() != 0) {
            X1();
            View viewB2 = b2(!r2(), true);
            View viewA2 = a2(!r2(), true);
            if (viewB2 != null && viewA2 != null) {
                if (!r2()) {
                    return this.O.b(b0Var.c() - 1, this.J) + 1;
                }
                int iD = this.u.d(viewA2) - this.u.g(viewB2);
                int iB = this.O.b(j0(viewB2), this.J);
                return (int) ((iD / ((this.O.b(j0(viewA2), this.J) - iB) + 1)) * (this.O.b(b0Var.c() - 1, this.J) + 1));
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void V0(RecyclerView recyclerView) {
        this.O.h();
        this.O.g();
    }

    public final void V2(RecyclerView.w wVar, RecyclerView.b0 b0Var, LinearLayoutManager.a aVar, int i2) {
        boolean z = i2 == 1;
        int iA3 = a3(wVar, b0Var, aVar.f4775b);
        if (z) {
            while (iA3 > 0) {
                int i3 = aVar.f4775b;
                if (i3 <= 0) {
                    return;
                }
                int i4 = i3 - 1;
                aVar.f4775b = i4;
                iA3 = a3(wVar, b0Var, i4);
            }
            return;
        }
        int iC = b0Var.c() - 1;
        int i5 = aVar.f4775b;
        while (i5 < iC) {
            int i6 = i5 + 1;
            int iA32 = a3(wVar, b0Var, i6);
            if (iA32 <= iA3) {
                break;
            }
            i5 = i6;
            iA3 = iA32;
        }
        aVar.f4775b = i5;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void W0(RecyclerView recyclerView, int i2, int i3, int i4) {
        this.O.h();
        this.O.g();
    }

    public final void W2() {
        View[] viewArr = this.L;
        if (viewArr == null || viewArr.length != this.J) {
            this.L = new View[this.J];
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void X0(RecyclerView recyclerView, int i2, int i3) {
        this.O.h();
        this.O.g();
    }

    public int X2(int i2, int i3) {
        if (this.s != 1 || !q2()) {
            int[] iArr = this.K;
            return iArr[i3 + i2] - iArr[i2];
        }
        int[] iArr2 = this.K;
        int i4 = this.J;
        return iArr2[i4 - i2] - iArr2[(i4 - i2) - i3];
    }

    public int Y2() {
        return this.J;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void Z0(RecyclerView recyclerView, int i2, int i3, Object obj) {
        this.O.h();
        this.O.g();
    }

    public final int Z2(RecyclerView.w wVar, RecyclerView.b0 b0Var, int i2) {
        if (!b0Var.h()) {
            return this.O.b(i2, this.J);
        }
        int iF = wVar.f(i2);
        if (iF != -1) {
            return this.O.b(iF, this.J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i2);
        return 0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void a1(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (b0Var.h()) {
            P2();
        }
        super.a1(wVar, b0Var);
        S2();
    }

    public final int a3(RecyclerView.w wVar, RecyclerView.b0 b0Var, int i2) {
        if (!b0Var.h()) {
            return this.O.c(i2, this.J);
        }
        int i3 = this.N.get(i2, -1);
        if (i3 != -1) {
            return i3;
        }
        int iF = wVar.f(i2);
        if (iF != -1) {
            return this.O.c(iF, this.J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i2);
        return 0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void b1(RecyclerView.b0 b0Var) {
        super.b1(b0Var);
        this.I = false;
    }

    public final int b3(RecyclerView.w wVar, RecyclerView.b0 b0Var, int i2) {
        if (!b0Var.h()) {
            return this.O.f(i2);
        }
        int i3 = this.M.get(i2, -1);
        if (i3 != -1) {
            return i3;
        }
        int iF = wVar.f(i2);
        if (iF != -1) {
            return this.O.f(iF);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i2);
        return 1;
    }

    public final void c3(float f2, int i2) {
        Q2(Math.max(Math.round(f2 * this.J), i2));
    }

    public final void d3(View view, int i2, boolean z) {
        int iM;
        int iM2;
        b bVar = (b) view.getLayoutParams();
        Rect rect = bVar.f4907b;
        int i3 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar).topMargin + ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        int i4 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar).leftMargin + ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        int iX2 = X2(bVar.f4768e, bVar.f4769f);
        if (this.s == 1) {
            iM2 = RecyclerView.p.M(iX2, i2, i4, ((ViewGroup.MarginLayoutParams) bVar).width, false);
            iM = RecyclerView.p.M(this.u.n(), Z(), i3, ((ViewGroup.MarginLayoutParams) bVar).height, true);
        } else {
            int iM3 = RecyclerView.p.M(iX2, i2, i3, ((ViewGroup.MarginLayoutParams) bVar).height, false);
            int iM4 = RecyclerView.p.M(this.u.n(), r0(), i4, ((ViewGroup.MarginLayoutParams) bVar).width, true);
            iM = iM3;
            iM2 = iM4;
        }
        e3(view, iM2, iM, z);
    }

    public final void e3(View view, int i2, int i3, boolean z) {
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        if (z ? L1(view, i2, i3, qVar) : J1(view, i2, i3, qVar)) {
            view.measure(i2, i3);
        }
    }

    public void f3(int i2) {
        if (i2 == this.J) {
            return;
        }
        this.I = true;
        if (i2 >= 1) {
            this.J = i2;
            this.O.h();
            w1();
        } else {
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i2);
        }
    }

    public final void g3() {
        int iY;
        int iI0;
        if (p2() == 1) {
            iY = q0() - h0();
            iI0 = g0();
        } else {
            iY = Y() - f0();
            iI0 = i0();
        }
        Q2(iY - iI0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public View j2(RecyclerView.w wVar, RecyclerView.b0 b0Var, boolean z, boolean z2) {
        int iL;
        int iL2 = L();
        int i2 = -1;
        int i3 = 1;
        if (z2) {
            iL = L() - 1;
            i3 = -1;
        } else {
            i2 = iL2;
            iL = 0;
        }
        int iC = b0Var.c();
        X1();
        int iM = this.u.m();
        int i4 = this.u.i();
        View view = null;
        View view2 = null;
        while (iL != i2) {
            View viewK = K(iL);
            int iJ0 = j0(viewK);
            if (iJ0 >= 0 && iJ0 < iC && a3(wVar, b0Var, iJ0) == 0) {
                if (((RecyclerView.q) viewK.getLayoutParams()).d()) {
                    if (view2 == null) {
                        view2 = viewK;
                    }
                } else {
                    if (this.u.g(viewK) < i4 && this.u.d(viewK) >= iM) {
                        return viewK;
                    }
                    if (view == null) {
                        view = viewK;
                    }
                }
            }
            iL += i3;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int m0(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (this.s == 0) {
            return this.J;
        }
        if (b0Var.c() < 1) {
            return 0;
        }
        return Z2(wVar, b0Var, b0Var.c() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean n(RecyclerView.q qVar) {
        return qVar instanceof b;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int s(RecyclerView.b0 b0Var) {
        return this.Q ? T2(b0Var) : super.s(b0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v19 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void s2(RecyclerView.w wVar, RecyclerView.b0 b0Var, LinearLayoutManager.c cVar, LinearLayoutManager.b bVar) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int iF;
        int iF2;
        int iF3;
        int iM;
        int iM2;
        View viewD;
        int iL = this.u.l();
        ?? r5 = 0;
        boolean z = iL != 1073741824;
        int i7 = L() > 0 ? this.K[this.J] : 0;
        if (z) {
            g3();
        }
        boolean z2 = cVar.f4787e == 1;
        int iA3 = this.J;
        if (!z2) {
            iA3 = a3(wVar, b0Var, cVar.f4786d) + b3(wVar, b0Var, cVar.f4786d);
        }
        int i8 = 0;
        while (i8 < this.J && cVar.c(b0Var) && iA3 > 0) {
            int i9 = cVar.f4786d;
            int iB3 = b3(wVar, b0Var, i9);
            if (iB3 > this.J) {
                throw new IllegalArgumentException("Item at position " + i9 + " requires " + iB3 + " spans but GridLayoutManager has only " + this.J + " spans.");
            }
            iA3 -= iB3;
            if (iA3 < 0 || (viewD = cVar.d(wVar)) == null) {
                break;
            }
            this.L[i8] = viewD;
            i8++;
        }
        if (i8 == 0) {
            bVar.f4780b = true;
            return;
        }
        float f2 = 0.0f;
        O2(wVar, b0Var, i8, z2);
        int i10 = 0;
        int i11 = 0;
        while (i10 < i8) {
            View view = this.L[i10];
            if (cVar.f4794l == null) {
                if (z2) {
                    e(view);
                } else {
                    f(view, r5);
                }
            } else if (z2) {
                c(view);
            } else {
                d(view, r5);
            }
            k(view, this.P);
            d3(view, iL, r5);
            int iE = this.u.e(view);
            if (iE > i11) {
                i11 = iE;
            }
            float f3 = (this.u.f(view) * 1.0f) / ((b) view.getLayoutParams()).f4769f;
            if (f3 > f2) {
                f2 = f3;
            }
            i10++;
            r5 = 0;
        }
        if (z) {
            c3(f2, i7);
            i11 = 0;
            for (int i12 = 0; i12 < i8; i12++) {
                View view2 = this.L[i12];
                d3(view2, 1073741824, true);
                int iE2 = this.u.e(view2);
                if (iE2 > i11) {
                    i11 = iE2;
                }
            }
        }
        for (int i13 = 0; i13 < i8; i13++) {
            View view3 = this.L[i13];
            if (this.u.e(view3) != i11) {
                b bVar2 = (b) view3.getLayoutParams();
                Rect rect = bVar2.f4907b;
                int i14 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar2).topMargin + ((ViewGroup.MarginLayoutParams) bVar2).bottomMargin;
                int i15 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar2).leftMargin + ((ViewGroup.MarginLayoutParams) bVar2).rightMargin;
                int iX2 = X2(bVar2.f4768e, bVar2.f4769f);
                if (this.s == 1) {
                    iM2 = RecyclerView.p.M(iX2, 1073741824, i15, ((ViewGroup.MarginLayoutParams) bVar2).width, false);
                    iM = View.MeasureSpec.makeMeasureSpec(i11 - i14, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11 - i15, 1073741824);
                    iM = RecyclerView.p.M(iX2, 1073741824, i14, ((ViewGroup.MarginLayoutParams) bVar2).height, false);
                    iM2 = iMakeMeasureSpec;
                }
                e3(view3, iM2, iM, true);
            }
        }
        int i16 = 0;
        bVar.f4779a = i11;
        if (this.s == 1) {
            if (cVar.f4788f == -1) {
                i4 = cVar.f4784b;
                i5 = i4 - i11;
            } else {
                int i17 = cVar.f4784b;
                i5 = i17;
                i4 = i11 + i17;
            }
            i2 = 0;
            i3 = 0;
        } else if (cVar.f4788f == -1) {
            int i18 = cVar.f4784b;
            i3 = i18 - i11;
            i5 = 0;
            i2 = i18;
            i4 = 0;
        } else {
            int i19 = cVar.f4784b;
            i2 = i11 + i19;
            i3 = i19;
            i4 = 0;
            i5 = 0;
        }
        while (i16 < i8) {
            View view4 = this.L[i16];
            b bVar3 = (b) view4.getLayoutParams();
            if (this.s == 1) {
                if (q2()) {
                    int iG0 = g0() + this.K[this.J - bVar3.f4768e];
                    iF3 = i4;
                    iF = iG0;
                    iF2 = iG0 - this.u.f(view4);
                } else {
                    int iG02 = g0() + this.K[bVar3.f4768e];
                    iF3 = i4;
                    iF2 = iG02;
                    iF = this.u.f(view4) + iG02;
                }
                i6 = i5;
            } else {
                int iI0 = i0() + this.K[bVar3.f4768e];
                i6 = iI0;
                iF = i2;
                iF2 = i3;
                iF3 = this.u.f(view4) + iI0;
            }
            C0(view4, iF2, i6, iF, iF3);
            if (bVar3.d() || bVar3.c()) {
                bVar.f4781c = true;
            }
            bVar.f4782d |= view4.hasFocusable();
            i16++;
            i4 = iF3;
            i2 = iF;
            i3 = iF2;
            i5 = i6;
        }
        Arrays.fill(this.L, (Object) null);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int t(RecyclerView.b0 b0Var) {
        return this.Q ? U2(b0Var) : super.t(b0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void u2(RecyclerView.w wVar, RecyclerView.b0 b0Var, LinearLayoutManager.a aVar, int i2) {
        super.u2(wVar, b0Var, aVar, i2);
        g3();
        if (b0Var.c() > 0 && !b0Var.h()) {
            V2(wVar, b0Var, aVar, i2);
        }
        W2();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int v(RecyclerView.b0 b0Var) {
        return this.Q ? T2(b0Var) : super.v(b0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int w(RecyclerView.b0 b0Var) {
        return this.Q ? U2(b0Var) : super.w(b0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int z1(int i2, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        g3();
        W2();
        return super.z1(i2, wVar, b0Var);
    }
}
