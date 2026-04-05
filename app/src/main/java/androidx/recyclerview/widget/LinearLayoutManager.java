package androidx.recyclerview.widget;

import a.y.e.f;
import a.y.e.j;
import a.y.e.l;
import a.y.e.o;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.p implements f.i, RecyclerView.a0.b {
    public int A;
    public int B;
    public boolean C;
    public d D;
    public final a E;
    public final b F;
    public int G;
    public int[] H;
    public int s;
    public c t;
    public l u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public l f4774a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f4775b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f4776c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f4777d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f4778e;

        public a() {
            e();
        }

        public void a() {
            this.f4776c = this.f4777d ? this.f4774a.i() : this.f4774a.m();
        }

        public void b(View view, int i2) {
            this.f4776c = this.f4777d ? this.f4774a.d(view) + this.f4774a.o() : this.f4774a.g(view);
            this.f4775b = i2;
        }

        public void c(View view, int i2) {
            int iO = this.f4774a.o();
            if (iO >= 0) {
                b(view, i2);
                return;
            }
            this.f4775b = i2;
            if (this.f4777d) {
                int i3 = (this.f4774a.i() - iO) - this.f4774a.d(view);
                this.f4776c = this.f4774a.i() - i3;
                if (i3 > 0) {
                    int iE = this.f4776c - this.f4774a.e(view);
                    int iM = this.f4774a.m();
                    int iMin = iE - (iM + Math.min(this.f4774a.g(view) - iM, 0));
                    if (iMin < 0) {
                        this.f4776c += Math.min(i3, -iMin);
                        return;
                    }
                    return;
                }
                return;
            }
            int iG = this.f4774a.g(view);
            int iM2 = iG - this.f4774a.m();
            this.f4776c = iG;
            if (iM2 > 0) {
                int i4 = (this.f4774a.i() - Math.min(0, (this.f4774a.i() - iO) - this.f4774a.d(view))) - (iG + this.f4774a.e(view));
                if (i4 < 0) {
                    this.f4776c -= Math.min(iM2, -i4);
                }
            }
        }

        public boolean d(View view, RecyclerView.b0 b0Var) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return !qVar.d() && qVar.b() >= 0 && qVar.b() < b0Var.c();
        }

        public void e() {
            this.f4775b = -1;
            this.f4776c = Integer.MIN_VALUE;
            this.f4777d = false;
            this.f4778e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f4775b + ", mCoordinate=" + this.f4776c + ", mLayoutFromEnd=" + this.f4777d + ", mValid=" + this.f4778e + '}';
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f4779a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f4780b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f4781c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f4782d;

        public void a() {
            this.f4779a = 0;
            this.f4780b = false;
            this.f4781c = false;
            this.f4782d = false;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f4784b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f4785c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f4786d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f4787e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f4788f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f4789g;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f4793k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f4795m;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f4783a = true;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f4790h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f4791i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f4792j = false;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public List<RecyclerView.e0> f4794l = null;

        public void a() {
            b(null);
        }

        public void b(View view) {
            View viewF = f(view);
            this.f4786d = viewF == null ? -1 : ((RecyclerView.q) viewF.getLayoutParams()).b();
        }

        public boolean c(RecyclerView.b0 b0Var) {
            int i2 = this.f4786d;
            return i2 >= 0 && i2 < b0Var.c();
        }

        public View d(RecyclerView.w wVar) {
            if (this.f4794l != null) {
                return e();
            }
            View viewO = wVar.o(this.f4786d);
            this.f4786d += this.f4787e;
            return viewO;
        }

        public final View e() {
            int size = this.f4794l.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = this.f4794l.get(i2).f4855b;
                RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
                if (!qVar.d() && this.f4786d == qVar.b()) {
                    b(view);
                    return view;
                }
            }
            return null;
        }

        public View f(View view) {
            int iB;
            int size = this.f4794l.size();
            View view2 = null;
            int i2 = Integer.MAX_VALUE;
            for (int i3 = 0; i3 < size; i3++) {
                View view3 = this.f4794l.get(i3).f4855b;
                RecyclerView.q qVar = (RecyclerView.q) view3.getLayoutParams();
                if (view3 != view && !qVar.d() && (iB = (qVar.b() - this.f4786d) * this.f4787e) >= 0 && iB < i2) {
                    view2 = view3;
                    if (iB == 0) {
                        break;
                    }
                    i2 = iB;
                }
            }
            return view2;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f4796b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f4797c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f4798d;

        public class a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public d[] newArray(int i2) {
                return new d[i2];
            }
        }

        public d() {
        }

        public d(Parcel parcel) {
            this.f4796b = parcel.readInt();
            this.f4797c = parcel.readInt();
            this.f4798d = parcel.readInt() == 1;
        }

        public d(d dVar) {
            this.f4796b = dVar.f4796b;
            this.f4797c = dVar.f4797c;
            this.f4798d = dVar.f4798d;
        }

        public boolean b() {
            return this.f4796b >= 0;
        }

        public void c() {
            this.f4796b = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.f4796b);
            parcel.writeInt(this.f4797c);
            parcel.writeInt(this.f4798d ? 1 : 0);
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    public LinearLayoutManager(Context context, int i2, boolean z) {
        this.s = 1;
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = true;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.D = null;
        this.E = new a();
        this.F = new b();
        this.G = 2;
        this.H = new int[2];
        D2(i2);
        E2(z);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.s = 1;
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = true;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.D = null;
        this.E = new a();
        this.F = new b();
        this.G = 2;
        this.H = new int[2];
        RecyclerView.p.d dVarK0 = RecyclerView.p.k0(context, attributeSet, i2, i3);
        D2(dVarK0.f4902a);
        E2(dVarK0.f4904c);
        F2(dVarK0.f4905d);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void A1(int i2) {
        this.A = i2;
        this.B = Integer.MIN_VALUE;
        d dVar = this.D;
        if (dVar != null) {
            dVar.c();
        }
        w1();
    }

    public final void A2() {
        this.x = (this.s == 1 || !q2()) ? this.w : !this.w;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int B1(int i2, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (this.s == 0) {
            return 0;
        }
        return B2(i2, wVar, b0Var);
    }

    public int B2(int i2, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (L() == 0 || i2 == 0) {
            return 0;
        }
        X1();
        this.t.f4783a = true;
        int i3 = i2 > 0 ? 1 : -1;
        int iAbs = Math.abs(i2);
        J2(i3, iAbs, true, b0Var);
        c cVar = this.t;
        int iY1 = cVar.f4789g + Y1(wVar, cVar, b0Var, false);
        if (iY1 < 0) {
            return 0;
        }
        if (iAbs > iY1) {
            i2 = i3 * iY1;
        }
        this.u.r(-i2);
        this.t.f4793k = i2;
        return i2;
    }

    public void C2(int i2, int i3) {
        this.A = i2;
        this.B = i3;
        d dVar = this.D;
        if (dVar != null) {
            dVar.c();
        }
        w1();
    }

    public void D2(int i2) {
        if (i2 != 0 && i2 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i2);
        }
        h(null);
        if (i2 != this.s || this.u == null) {
            l lVarB = l.b(this, i2);
            this.u = lVarB;
            this.E.f4774a = lVarB;
            this.s = i2;
            w1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public View E(int i2) {
        int iL = L();
        if (iL == 0) {
            return null;
        }
        int iJ0 = i2 - j0(K(0));
        if (iJ0 >= 0 && iJ0 < iL) {
            View viewK = K(iJ0);
            if (j0(viewK) == i2) {
                return viewK;
            }
        }
        return super.E(i2);
    }

    public void E2(boolean z) {
        h(null);
        if (z == this.w) {
            return;
        }
        this.w = z;
        w1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q F() {
        return new RecyclerView.q(-2, -2);
    }

    public void F2(boolean z) {
        h(null);
        if (this.y == z) {
            return;
        }
        this.y = z;
        w1();
    }

    public final boolean G2(RecyclerView.w wVar, RecyclerView.b0 b0Var, a aVar) {
        View viewJ2;
        boolean z = false;
        if (L() == 0) {
            return false;
        }
        View viewX = X();
        if (viewX != null && aVar.d(viewX, b0Var)) {
            aVar.c(viewX, j0(viewX));
            return true;
        }
        boolean z2 = this.v;
        boolean z3 = this.y;
        if (z2 != z3 || (viewJ2 = j2(wVar, b0Var, aVar.f4777d, z3)) == null) {
            return false;
        }
        aVar.b(viewJ2, j0(viewJ2));
        if (!b0Var.h() && P1()) {
            int iG = this.u.g(viewJ2);
            int iD = this.u.d(viewJ2);
            int iM = this.u.m();
            int i2 = this.u.i();
            boolean z4 = iD <= iM && iG < iM;
            if (iG >= i2 && iD > i2) {
                z = true;
            }
            if (z4 || z) {
                if (aVar.f4777d) {
                    iM = i2;
                }
                aVar.f4776c = iM;
            }
        }
        return true;
    }

    public final boolean H2(RecyclerView.b0 b0Var, a aVar) {
        int i2;
        if (!b0Var.h() && (i2 = this.A) != -1) {
            if (i2 >= 0 && i2 < b0Var.c()) {
                aVar.f4775b = this.A;
                d dVar = this.D;
                if (dVar != null && dVar.b()) {
                    boolean z = this.D.f4798d;
                    aVar.f4777d = z;
                    aVar.f4776c = z ? this.u.i() - this.D.f4797c : this.u.m() + this.D.f4797c;
                    return true;
                }
                if (this.B != Integer.MIN_VALUE) {
                    boolean z2 = this.x;
                    aVar.f4777d = z2;
                    aVar.f4776c = z2 ? this.u.i() - this.B : this.u.m() + this.B;
                    return true;
                }
                View viewE = E(this.A);
                if (viewE == null) {
                    if (L() > 0) {
                        aVar.f4777d = (this.A < j0(K(0))) == this.x;
                    }
                    aVar.a();
                } else {
                    if (this.u.e(viewE) > this.u.n()) {
                        aVar.a();
                        return true;
                    }
                    if (this.u.g(viewE) - this.u.m() < 0) {
                        aVar.f4776c = this.u.m();
                        aVar.f4777d = false;
                        return true;
                    }
                    if (this.u.i() - this.u.d(viewE) < 0) {
                        aVar.f4776c = this.u.i();
                        aVar.f4777d = true;
                        return true;
                    }
                    aVar.f4776c = aVar.f4777d ? this.u.d(viewE) + this.u.o() : this.u.g(viewE);
                }
                return true;
            }
            this.A = -1;
            this.B = Integer.MIN_VALUE;
        }
        return false;
    }

    public final void I2(RecyclerView.w wVar, RecyclerView.b0 b0Var, a aVar) {
        if (H2(b0Var, aVar) || G2(wVar, b0Var, aVar)) {
            return;
        }
        aVar.a();
        aVar.f4775b = this.y ? b0Var.c() - 1 : 0;
    }

    public final void J2(int i2, int i3, boolean z, RecyclerView.b0 b0Var) {
        int iM;
        this.t.f4795m = z2();
        this.t.f4788f = i2;
        int[] iArr = this.H;
        iArr[0] = 0;
        iArr[1] = 0;
        Q1(b0Var, iArr);
        int iMax = Math.max(0, this.H[0]);
        int iMax2 = Math.max(0, this.H[1]);
        boolean z2 = i2 == 1;
        c cVar = this.t;
        int i4 = z2 ? iMax2 : iMax;
        cVar.f4790h = i4;
        if (!z2) {
            iMax = iMax2;
        }
        cVar.f4791i = iMax;
        if (z2) {
            cVar.f4790h = i4 + this.u.j();
            View viewM2 = m2();
            c cVar2 = this.t;
            cVar2.f4787e = this.x ? -1 : 1;
            int iJ0 = j0(viewM2);
            c cVar3 = this.t;
            cVar2.f4786d = iJ0 + cVar3.f4787e;
            cVar3.f4784b = this.u.d(viewM2);
            iM = this.u.d(viewM2) - this.u.i();
        } else {
            View viewN2 = n2();
            this.t.f4790h += this.u.m();
            c cVar4 = this.t;
            cVar4.f4787e = this.x ? 1 : -1;
            int iJ02 = j0(viewN2);
            c cVar5 = this.t;
            cVar4.f4786d = iJ02 + cVar5.f4787e;
            cVar5.f4784b = this.u.g(viewN2);
            iM = (-this.u.g(viewN2)) + this.u.m();
        }
        c cVar6 = this.t;
        cVar6.f4785c = i3;
        if (z) {
            cVar6.f4785c = i3 - iM;
        }
        cVar6.f4789g = iM;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean K1() {
        return (Z() == 1073741824 || r0() == 1073741824 || !s0()) ? false : true;
    }

    public final void K2(int i2, int i3) {
        this.t.f4785c = this.u.i() - i3;
        c cVar = this.t;
        cVar.f4787e = this.x ? -1 : 1;
        cVar.f4786d = i2;
        cVar.f4788f = 1;
        cVar.f4784b = i3;
        cVar.f4789g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void L0(RecyclerView recyclerView, RecyclerView.w wVar) {
        super.L0(recyclerView, wVar);
        if (this.C) {
            n1(wVar);
            wVar.c();
        }
    }

    public final void L2(a aVar) {
        K2(aVar.f4775b, aVar.f4776c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public View M0(View view, int i2, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        int iV1;
        A2();
        if (L() == 0 || (iV1 = V1(i2)) == Integer.MIN_VALUE) {
            return null;
        }
        X1();
        J2(iV1, (int) (this.u.n() * 0.33333334f), false, b0Var);
        c cVar = this.t;
        cVar.f4789g = Integer.MIN_VALUE;
        cVar.f4783a = false;
        Y1(wVar, cVar, b0Var, true);
        View viewI2 = iV1 == -1 ? i2() : h2();
        View viewN2 = iV1 == -1 ? n2() : m2();
        if (!viewN2.hasFocusable()) {
            return viewI2;
        }
        if (viewI2 == null) {
            return null;
        }
        return viewN2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void M1(RecyclerView recyclerView, RecyclerView.b0 b0Var, int i2) {
        j jVar = new j(recyclerView.getContext());
        jVar.p(i2);
        N1(jVar);
    }

    public final void M2(int i2, int i3) {
        this.t.f4785c = i3 - this.u.m();
        c cVar = this.t;
        cVar.f4786d = i2;
        cVar.f4787e = this.x ? 1 : -1;
        cVar.f4788f = -1;
        cVar.f4784b = i3;
        cVar.f4789g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void N0(AccessibilityEvent accessibilityEvent) {
        super.N0(accessibilityEvent);
        if (L() > 0) {
            accessibilityEvent.setFromIndex(c2());
            accessibilityEvent.setToIndex(e2());
        }
    }

    public final void N2(a aVar) {
        M2(aVar.f4775b, aVar.f4776c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean P1() {
        return this.D == null && this.v == this.y;
    }

    public void Q1(RecyclerView.b0 b0Var, int[] iArr) {
        int i2;
        int iO2 = o2(b0Var);
        if (this.t.f4788f == -1) {
            i2 = 0;
        } else {
            i2 = iO2;
            iO2 = 0;
        }
        iArr[0] = iO2;
        iArr[1] = i2;
    }

    public void R1(RecyclerView.b0 b0Var, c cVar, RecyclerView.p.c cVar2) {
        int i2 = cVar.f4786d;
        if (i2 < 0 || i2 >= b0Var.c()) {
            return;
        }
        cVar2.a(i2, Math.max(0, cVar.f4789g));
    }

    public final int S1(RecyclerView.b0 b0Var) {
        if (L() == 0) {
            return 0;
        }
        X1();
        return o.a(b0Var, this.u, b2(!this.z, true), a2(!this.z, true), this, this.z);
    }

    public final int T1(RecyclerView.b0 b0Var) {
        if (L() == 0) {
            return 0;
        }
        X1();
        return o.b(b0Var, this.u, b2(!this.z, true), a2(!this.z, true), this, this.z, this.x);
    }

    public final int U1(RecyclerView.b0 b0Var) {
        if (L() == 0) {
            return 0;
        }
        X1();
        return o.c(b0Var, this.u, b2(!this.z, true), a2(!this.z, true), this, this.z);
    }

    public int V1(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 17 ? i2 != 33 ? i2 != 66 ? (i2 == 130 && this.s == 1) ? 1 : Integer.MIN_VALUE : this.s == 0 ? 1 : Integer.MIN_VALUE : this.s == 1 ? -1 : Integer.MIN_VALUE : this.s == 0 ? -1 : Integer.MIN_VALUE : (this.s != 1 && q2()) ? -1 : 1 : (this.s != 1 && q2()) ? 1 : -1;
    }

    public c W1() {
        return new c();
    }

    public void X1() {
        if (this.t == null) {
            this.t = W1();
        }
    }

    public int Y1(RecyclerView.w wVar, c cVar, RecyclerView.b0 b0Var, boolean z) {
        int i2 = cVar.f4785c;
        int i3 = cVar.f4789g;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                cVar.f4789g = i3 + i2;
            }
            v2(wVar, cVar);
        }
        int i4 = cVar.f4785c + cVar.f4790h;
        b bVar = this.F;
        while (true) {
            if ((!cVar.f4795m && i4 <= 0) || !cVar.c(b0Var)) {
                break;
            }
            bVar.a();
            s2(wVar, b0Var, cVar, bVar);
            if (!bVar.f4780b) {
                cVar.f4784b += bVar.f4779a * cVar.f4788f;
                if (!bVar.f4781c || cVar.f4794l != null || !b0Var.h()) {
                    int i5 = cVar.f4785c;
                    int i6 = bVar.f4779a;
                    cVar.f4785c = i5 - i6;
                    i4 -= i6;
                }
                int i7 = cVar.f4789g;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + bVar.f4779a;
                    cVar.f4789g = i8;
                    int i9 = cVar.f4785c;
                    if (i9 < 0) {
                        cVar.f4789g = i8 + i9;
                    }
                    v2(wVar, cVar);
                }
                if (z && bVar.f4782d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - cVar.f4785c;
    }

    public final View Z1() {
        return f2(0, L());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a0.b
    public PointF a(int i2) {
        if (L() == 0) {
            return null;
        }
        int i3 = (i2 < j0(K(0))) != this.x ? -1 : 1;
        return this.s == 0 ? new PointF(i3, 0.0f) : new PointF(0.0f, i3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void a1(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        int i2;
        int i3;
        int i4;
        int i5;
        int iK2;
        int i6;
        View viewE;
        int iG;
        int i7;
        int i8 = -1;
        if (!(this.D == null && this.A == -1) && b0Var.c() == 0) {
            n1(wVar);
            return;
        }
        d dVar = this.D;
        if (dVar != null && dVar.b()) {
            this.A = this.D.f4796b;
        }
        X1();
        this.t.f4783a = false;
        A2();
        View viewX = X();
        a aVar = this.E;
        if (!aVar.f4778e || this.A != -1 || this.D != null) {
            aVar.e();
            a aVar2 = this.E;
            aVar2.f4777d = this.x ^ this.y;
            I2(wVar, b0Var, aVar2);
            this.E.f4778e = true;
        } else if (viewX != null && (this.u.g(viewX) >= this.u.i() || this.u.d(viewX) <= this.u.m())) {
            this.E.c(viewX, j0(viewX));
        }
        c cVar = this.t;
        cVar.f4788f = cVar.f4793k >= 0 ? 1 : -1;
        int[] iArr = this.H;
        iArr[0] = 0;
        iArr[1] = 0;
        Q1(b0Var, iArr);
        int iMax = Math.max(0, this.H[0]) + this.u.m();
        int iMax2 = Math.max(0, this.H[1]) + this.u.j();
        if (b0Var.h() && (i6 = this.A) != -1 && this.B != Integer.MIN_VALUE && (viewE = E(i6)) != null) {
            if (this.x) {
                i7 = this.u.i() - this.u.d(viewE);
                iG = this.B;
            } else {
                iG = this.u.g(viewE) - this.u.m();
                i7 = this.B;
            }
            int i9 = i7 - iG;
            if (i9 > 0) {
                iMax += i9;
            } else {
                iMax2 -= i9;
            }
        }
        a aVar3 = this.E;
        if (!aVar3.f4777d ? !this.x : this.x) {
            i8 = 1;
        }
        u2(wVar, b0Var, aVar3, i8);
        x(wVar);
        this.t.f4795m = z2();
        this.t.f4792j = b0Var.h();
        this.t.f4791i = 0;
        a aVar4 = this.E;
        if (aVar4.f4777d) {
            N2(aVar4);
            c cVar2 = this.t;
            cVar2.f4790h = iMax;
            Y1(wVar, cVar2, b0Var, false);
            c cVar3 = this.t;
            i3 = cVar3.f4784b;
            int i10 = cVar3.f4786d;
            int i11 = cVar3.f4785c;
            if (i11 > 0) {
                iMax2 += i11;
            }
            L2(this.E);
            c cVar4 = this.t;
            cVar4.f4790h = iMax2;
            cVar4.f4786d += cVar4.f4787e;
            Y1(wVar, cVar4, b0Var, false);
            c cVar5 = this.t;
            i2 = cVar5.f4784b;
            int i12 = cVar5.f4785c;
            if (i12 > 0) {
                M2(i10, i3);
                c cVar6 = this.t;
                cVar6.f4790h = i12;
                Y1(wVar, cVar6, b0Var, false);
                i3 = this.t.f4784b;
            }
        } else {
            L2(aVar4);
            c cVar7 = this.t;
            cVar7.f4790h = iMax2;
            Y1(wVar, cVar7, b0Var, false);
            c cVar8 = this.t;
            i2 = cVar8.f4784b;
            int i13 = cVar8.f4786d;
            int i14 = cVar8.f4785c;
            if (i14 > 0) {
                iMax += i14;
            }
            N2(this.E);
            c cVar9 = this.t;
            cVar9.f4790h = iMax;
            cVar9.f4786d += cVar9.f4787e;
            Y1(wVar, cVar9, b0Var, false);
            c cVar10 = this.t;
            i3 = cVar10.f4784b;
            int i15 = cVar10.f4785c;
            if (i15 > 0) {
                K2(i13, i2);
                c cVar11 = this.t;
                cVar11.f4790h = i15;
                Y1(wVar, cVar11, b0Var, false);
                i2 = this.t.f4784b;
            }
        }
        if (L() > 0) {
            if (this.x ^ this.y) {
                int iK22 = k2(i2, wVar, b0Var, true);
                i4 = i3 + iK22;
                i5 = i2 + iK22;
                iK2 = l2(i4, wVar, b0Var, false);
            } else {
                int iL2 = l2(i3, wVar, b0Var, true);
                i4 = i3 + iL2;
                i5 = i2 + iL2;
                iK2 = k2(i5, wVar, b0Var, false);
            }
            i3 = i4 + iK2;
            i2 = i5 + iK2;
        }
        t2(wVar, b0Var, i3, i2);
        if (b0Var.h()) {
            this.E.e();
        } else {
            this.u.s();
        }
        this.v = this.y;
    }

    public View a2(boolean z, boolean z2) {
        int iL;
        int iL2;
        if (this.x) {
            iL = 0;
            iL2 = L();
        } else {
            iL = L() - 1;
            iL2 = -1;
        }
        return g2(iL, iL2, z, z2);
    }

    @Override // a.y.e.f.i
    public void b(View view, View view2, int i2, int i3) {
        int iG;
        h("Cannot drop a view during a scroll or layout calculation");
        X1();
        A2();
        int iJ0 = j0(view);
        int iJ02 = j0(view2);
        byte b2 = iJ0 < iJ02 ? (byte) 1 : (byte) -1;
        if (this.x) {
            if (b2 == 1) {
                C2(iJ02, this.u.i() - (this.u.g(view2) + this.u.e(view)));
                return;
            }
            iG = this.u.i() - this.u.d(view2);
        } else {
            if (b2 != -1) {
                C2(iJ02, this.u.d(view2) - this.u.e(view));
                return;
            }
            iG = this.u.g(view2);
        }
        C2(iJ02, iG);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void b1(RecyclerView.b0 b0Var) {
        super.b1(b0Var);
        this.D = null;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.E.e();
    }

    public View b2(boolean z, boolean z2) {
        int iL;
        int iL2;
        if (this.x) {
            iL = L() - 1;
            iL2 = -1;
        } else {
            iL = 0;
            iL2 = L();
        }
        return g2(iL, iL2, z, z2);
    }

    public int c2() {
        View viewG2 = g2(0, L(), false, true);
        if (viewG2 == null) {
            return -1;
        }
        return j0(viewG2);
    }

    public final View d2() {
        return f2(L() - 1, -1);
    }

    public int e2() {
        View viewG2 = g2(L() - 1, -1, false, true);
        if (viewG2 == null) {
            return -1;
        }
        return j0(viewG2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void f1(Parcelable parcelable) {
        if (parcelable instanceof d) {
            d dVar = (d) parcelable;
            this.D = dVar;
            if (this.A != -1) {
                dVar.c();
            }
            w1();
        }
    }

    public View f2(int i2, int i3) {
        int i4;
        int i5;
        X1();
        if ((i3 > i2 ? (byte) 1 : i3 < i2 ? (byte) -1 : (byte) 0) == 0) {
            return K(i2);
        }
        if (this.u.g(K(i2)) < this.u.m()) {
            i4 = 16644;
            i5 = 16388;
        } else {
            i4 = 4161;
            i5 = 4097;
        }
        return (this.s == 0 ? this.f4889e : this.f4890f).a(i2, i3, i4, i5);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public Parcelable g1() {
        if (this.D != null) {
            return new d(this.D);
        }
        d dVar = new d();
        if (L() > 0) {
            X1();
            boolean z = this.v ^ this.x;
            dVar.f4798d = z;
            if (z) {
                View viewM2 = m2();
                dVar.f4797c = this.u.i() - this.u.d(viewM2);
                dVar.f4796b = j0(viewM2);
            } else {
                View viewN2 = n2();
                dVar.f4796b = j0(viewN2);
                dVar.f4797c = this.u.g(viewN2) - this.u.m();
            }
        } else {
            dVar.c();
        }
        return dVar;
    }

    public View g2(int i2, int i3, boolean z, boolean z2) {
        X1();
        return (this.s == 0 ? this.f4889e : this.f4890f).a(i2, i3, z ? 24579 : 320, z2 ? 320 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void h(String str) {
        if (this.D == null) {
            super.h(str);
        }
    }

    public final View h2() {
        return this.x ? Z1() : d2();
    }

    public final View i2() {
        return this.x ? d2() : Z1();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View j2(androidx.recyclerview.widget.RecyclerView.w r17, androidx.recyclerview.widget.RecyclerView.b0 r18, boolean r19, boolean r20) {
        /*
            r16 = this;
            r0 = r16
            r16.X1()
            int r1 = r16.L()
            r2 = -1
            r3 = 0
            r4 = 1
            if (r20 == 0) goto L15
            int r1 = r16.L()
            int r1 = r1 - r4
            r5 = -1
            goto L18
        L15:
            r2 = r1
            r1 = 0
            r5 = 1
        L18:
            int r6 = r18.c()
            a.y.e.l r7 = r0.u
            int r7 = r7.m()
            a.y.e.l r8 = r0.u
            int r8 = r8.i()
            r9 = 0
            r10 = r9
            r11 = r10
        L2b:
            if (r1 == r2) goto L7a
            android.view.View r12 = r0.K(r1)
            int r13 = r0.j0(r12)
            a.y.e.l r14 = r0.u
            int r14 = r14.g(r12)
            a.y.e.l r15 = r0.u
            int r15 = r15.d(r12)
            if (r13 < 0) goto L78
            if (r13 >= r6) goto L78
            android.view.ViewGroup$LayoutParams r13 = r12.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$q r13 = (androidx.recyclerview.widget.RecyclerView.q) r13
            boolean r13 = r13.d()
            if (r13 == 0) goto L55
            if (r11 != 0) goto L78
            r11 = r12
            goto L78
        L55:
            if (r15 > r7) goto L5b
            if (r14 >= r7) goto L5b
            r13 = 1
            goto L5c
        L5b:
            r13 = 0
        L5c:
            if (r14 < r8) goto L62
            if (r15 <= r8) goto L62
            r14 = 1
            goto L63
        L62:
            r14 = 0
        L63:
            if (r13 != 0) goto L69
            if (r14 == 0) goto L68
            goto L69
        L68:
            return r12
        L69:
            if (r19 == 0) goto L71
            if (r14 == 0) goto L6e
            goto L73
        L6e:
            if (r9 != 0) goto L78
            goto L77
        L71:
            if (r13 == 0) goto L75
        L73:
            r10 = r12
            goto L78
        L75:
            if (r9 != 0) goto L78
        L77:
            r9 = r12
        L78:
            int r1 = r1 + r5
            goto L2b
        L7a:
            if (r9 == 0) goto L7d
            goto L82
        L7d:
            if (r10 == 0) goto L81
            r9 = r10
            goto L82
        L81:
            r9 = r11
        L82:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.j2(androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$b0, boolean, boolean):android.view.View");
    }

    public final int k2(int i2, RecyclerView.w wVar, RecyclerView.b0 b0Var, boolean z) {
        int i3;
        int i4 = this.u.i() - i2;
        if (i4 <= 0) {
            return 0;
        }
        int i5 = -B2(-i4, wVar, b0Var);
        int i6 = i2 + i5;
        if (!z || (i3 = this.u.i() - i6) <= 0) {
            return i5;
        }
        this.u.r(i3);
        return i3 + i5;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean l() {
        return this.s == 0;
    }

    public final int l2(int i2, RecyclerView.w wVar, RecyclerView.b0 b0Var, boolean z) {
        int iM;
        int iM2 = i2 - this.u.m();
        if (iM2 <= 0) {
            return 0;
        }
        int i3 = -B2(iM2, wVar, b0Var);
        int i4 = i2 + i3;
        if (!z || (iM = i4 - this.u.m()) <= 0) {
            return i3;
        }
        this.u.r(-iM);
        return i3 - iM;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean m() {
        return this.s == 1;
    }

    public final View m2() {
        return K(this.x ? 0 : L() - 1);
    }

    public final View n2() {
        return K(this.x ? L() - 1 : 0);
    }

    @Deprecated
    public int o2(RecyclerView.b0 b0Var) {
        if (b0Var.g()) {
            return this.u.n();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void p(int i2, int i3, RecyclerView.b0 b0Var, RecyclerView.p.c cVar) {
        if (this.s != 0) {
            i2 = i3;
        }
        if (L() == 0 || i2 == 0) {
            return;
        }
        X1();
        J2(i2 > 0 ? 1 : -1, Math.abs(i2), true, b0Var);
        R1(b0Var, this.t, cVar);
    }

    public int p2() {
        return this.s;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void q(int i2, RecyclerView.p.c cVar) {
        boolean z;
        int i3;
        d dVar = this.D;
        if (dVar == null || !dVar.b()) {
            A2();
            z = this.x;
            i3 = this.A;
            if (i3 == -1) {
                i3 = z ? i2 - 1 : 0;
            }
        } else {
            d dVar2 = this.D;
            z = dVar2.f4798d;
            i3 = dVar2.f4796b;
        }
        int i4 = z ? -1 : 1;
        for (int i5 = 0; i5 < this.G && i3 >= 0 && i3 < i2; i5++) {
            cVar.a(i3, 0);
            i3 += i4;
        }
    }

    public boolean q2() {
        return b0() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int r(RecyclerView.b0 b0Var) {
        return S1(b0Var);
    }

    public boolean r2() {
        return this.z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int s(RecyclerView.b0 b0Var) {
        return T1(b0Var);
    }

    public void s2(RecyclerView.w wVar, RecyclerView.b0 b0Var, c cVar, b bVar) {
        int i2;
        int i3;
        int i4;
        int iG0;
        int iF;
        View viewD = cVar.d(wVar);
        if (viewD == null) {
            bVar.f4780b = true;
            return;
        }
        RecyclerView.q qVar = (RecyclerView.q) viewD.getLayoutParams();
        if (cVar.f4794l == null) {
            if (this.x == (cVar.f4788f == -1)) {
                e(viewD);
            } else {
                f(viewD, 0);
            }
        } else {
            if (this.x == (cVar.f4788f == -1)) {
                c(viewD);
            } else {
                d(viewD, 0);
            }
        }
        D0(viewD, 0, 0);
        bVar.f4779a = this.u.e(viewD);
        if (this.s == 1) {
            if (q2()) {
                iF = q0() - h0();
                iG0 = iF - this.u.f(viewD);
            } else {
                iG0 = g0();
                iF = this.u.f(viewD) + iG0;
            }
            int i5 = cVar.f4788f;
            int i6 = cVar.f4784b;
            if (i5 == -1) {
                i4 = i6;
                i3 = iF;
                i2 = i6 - bVar.f4779a;
            } else {
                i2 = i6;
                i3 = iF;
                i4 = bVar.f4779a + i6;
            }
        } else {
            int iI0 = i0();
            int iF2 = this.u.f(viewD) + iI0;
            int i7 = cVar.f4788f;
            int i8 = cVar.f4784b;
            if (i7 == -1) {
                i3 = i8;
                i2 = iI0;
                i4 = iF2;
                iG0 = i8 - bVar.f4779a;
            } else {
                i2 = iI0;
                i3 = bVar.f4779a + i8;
                i4 = iF2;
                iG0 = i8;
            }
        }
        C0(viewD, iG0, i2, i3, i4);
        if (qVar.d() || qVar.c()) {
            bVar.f4781c = true;
        }
        bVar.f4782d = viewD.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int t(RecyclerView.b0 b0Var) {
        return U1(b0Var);
    }

    public final void t2(RecyclerView.w wVar, RecyclerView.b0 b0Var, int i2, int i3) {
        if (!b0Var.j() || L() == 0 || b0Var.h() || !P1()) {
            return;
        }
        List<RecyclerView.e0> listK = wVar.k();
        int size = listK.size();
        int iJ0 = j0(K(0));
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            RecyclerView.e0 e0Var = listK.get(i6);
            if (!e0Var.A()) {
                byte b2 = (e0Var.r() < iJ0) != this.x ? (byte) -1 : (byte) 1;
                int iE = this.u.e(e0Var.f4855b);
                if (b2 == -1) {
                    i4 += iE;
                } else {
                    i5 += iE;
                }
            }
        }
        this.t.f4794l = listK;
        if (i4 > 0) {
            M2(j0(n2()), i2);
            c cVar = this.t;
            cVar.f4790h = i4;
            cVar.f4785c = 0;
            cVar.a();
            Y1(wVar, this.t, b0Var, false);
        }
        if (i5 > 0) {
            K2(j0(m2()), i3);
            c cVar2 = this.t;
            cVar2.f4790h = i5;
            cVar2.f4785c = 0;
            cVar2.a();
            Y1(wVar, this.t, b0Var, false);
        }
        this.t.f4794l = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int u(RecyclerView.b0 b0Var) {
        return S1(b0Var);
    }

    public void u2(RecyclerView.w wVar, RecyclerView.b0 b0Var, a aVar, int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int v(RecyclerView.b0 b0Var) {
        return T1(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean v0() {
        return true;
    }

    public final void v2(RecyclerView.w wVar, c cVar) {
        if (!cVar.f4783a || cVar.f4795m) {
            return;
        }
        int i2 = cVar.f4789g;
        int i3 = cVar.f4791i;
        if (cVar.f4788f == -1) {
            x2(wVar, i2, i3);
        } else {
            y2(wVar, i2, i3);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int w(RecyclerView.b0 b0Var) {
        return U1(b0Var);
    }

    public final void w2(RecyclerView.w wVar, int i2, int i3) {
        if (i2 == i3) {
            return;
        }
        if (i3 <= i2) {
            while (i2 > i3) {
                q1(i2, wVar);
                i2--;
            }
        } else {
            for (int i4 = i3 - 1; i4 >= i2; i4--) {
                q1(i4, wVar);
            }
        }
    }

    public final void x2(RecyclerView.w wVar, int i2, int i3) {
        int iL = L();
        if (i2 < 0) {
            return;
        }
        int iH = (this.u.h() - i2) + i3;
        if (this.x) {
            for (int i4 = 0; i4 < iL; i4++) {
                View viewK = K(i4);
                if (this.u.g(viewK) < iH || this.u.q(viewK) < iH) {
                    w2(wVar, 0, i4);
                    return;
                }
            }
            return;
        }
        int i5 = iL - 1;
        for (int i6 = i5; i6 >= 0; i6--) {
            View viewK2 = K(i6);
            if (this.u.g(viewK2) < iH || this.u.q(viewK2) < iH) {
                w2(wVar, i5, i6);
                return;
            }
        }
    }

    public final void y2(RecyclerView.w wVar, int i2, int i3) {
        if (i2 < 0) {
            return;
        }
        int i4 = i2 - i3;
        int iL = L();
        if (!this.x) {
            for (int i5 = 0; i5 < iL; i5++) {
                View viewK = K(i5);
                if (this.u.d(viewK) > i4 || this.u.p(viewK) > i4) {
                    w2(wVar, 0, i5);
                    return;
                }
            }
            return;
        }
        int i6 = iL - 1;
        for (int i7 = i6; i7 >= 0; i7--) {
            View viewK2 = K(i7);
            if (this.u.d(viewK2) > i4 || this.u.p(viewK2) > i4) {
                w2(wVar, i6, i7);
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int z1(int i2, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (this.s == 1) {
            return 0;
        }
        return B2(i2, wVar, b0Var);
    }

    public boolean z2() {
        return this.u.k() == 0 && this.u.h() == 0;
    }
}
