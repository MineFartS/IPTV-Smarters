package a.y.e;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecyclerView.p f3959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f3961c;

    public class a extends l {
        public a(RecyclerView.p pVar) {
            super(pVar, null);
        }

        @Override // a.y.e.l
        public int d(View view) {
            return this.f3959a.V(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).rightMargin;
        }

        @Override // a.y.e.l
        public int e(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f3959a.U(view) + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
        }

        @Override // a.y.e.l
        public int f(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f3959a.T(view) + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        }

        @Override // a.y.e.l
        public int g(View view) {
            return this.f3959a.S(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).leftMargin;
        }

        @Override // a.y.e.l
        public int h() {
            return this.f3959a.q0();
        }

        @Override // a.y.e.l
        public int i() {
            return this.f3959a.q0() - this.f3959a.h0();
        }

        @Override // a.y.e.l
        public int j() {
            return this.f3959a.h0();
        }

        @Override // a.y.e.l
        public int k() {
            return this.f3959a.r0();
        }

        @Override // a.y.e.l
        public int l() {
            return this.f3959a.Z();
        }

        @Override // a.y.e.l
        public int m() {
            return this.f3959a.g0();
        }

        @Override // a.y.e.l
        public int n() {
            return (this.f3959a.q0() - this.f3959a.g0()) - this.f3959a.h0();
        }

        @Override // a.y.e.l
        public int p(View view) {
            this.f3959a.p0(view, true, this.f3961c);
            return this.f3961c.right;
        }

        @Override // a.y.e.l
        public int q(View view) {
            this.f3959a.p0(view, true, this.f3961c);
            return this.f3961c.left;
        }

        @Override // a.y.e.l
        public void r(int i2) {
            this.f3959a.F0(i2);
        }
    }

    public class b extends l {
        public b(RecyclerView.p pVar) {
            super(pVar, null);
        }

        @Override // a.y.e.l
        public int d(View view) {
            return this.f3959a.Q(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).bottomMargin;
        }

        @Override // a.y.e.l
        public int e(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f3959a.T(view) + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        }

        @Override // a.y.e.l
        public int f(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f3959a.U(view) + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
        }

        @Override // a.y.e.l
        public int g(View view) {
            return this.f3959a.W(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).topMargin;
        }

        @Override // a.y.e.l
        public int h() {
            return this.f3959a.Y();
        }

        @Override // a.y.e.l
        public int i() {
            return this.f3959a.Y() - this.f3959a.f0();
        }

        @Override // a.y.e.l
        public int j() {
            return this.f3959a.f0();
        }

        @Override // a.y.e.l
        public int k() {
            return this.f3959a.Z();
        }

        @Override // a.y.e.l
        public int l() {
            return this.f3959a.r0();
        }

        @Override // a.y.e.l
        public int m() {
            return this.f3959a.i0();
        }

        @Override // a.y.e.l
        public int n() {
            return (this.f3959a.Y() - this.f3959a.i0()) - this.f3959a.f0();
        }

        @Override // a.y.e.l
        public int p(View view) {
            this.f3959a.p0(view, true, this.f3961c);
            return this.f3961c.bottom;
        }

        @Override // a.y.e.l
        public int q(View view) {
            this.f3959a.p0(view, true, this.f3961c);
            return this.f3961c.top;
        }

        @Override // a.y.e.l
        public void r(int i2) {
            this.f3959a.G0(i2);
        }
    }

    public l(RecyclerView.p pVar) {
        this.f3960b = Integer.MIN_VALUE;
        this.f3961c = new Rect();
        this.f3959a = pVar;
    }

    public /* synthetic */ l(RecyclerView.p pVar, a aVar) {
        this(pVar);
    }

    public static l a(RecyclerView.p pVar) {
        return new a(pVar);
    }

    public static l b(RecyclerView.p pVar, int i2) {
        if (i2 == 0) {
            return a(pVar);
        }
        if (i2 == 1) {
            return c(pVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public static l c(RecyclerView.p pVar) {
        return new b(pVar);
    }

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g(View view);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public int o() {
        if (Integer.MIN_VALUE == this.f3960b) {
            return 0;
        }
        return n() - this.f3960b;
    }

    public abstract int p(View view);

    public abstract int q(View view);

    public abstract void r(int i2);

    public void s() {
        this.f3960b = n();
    }
}
