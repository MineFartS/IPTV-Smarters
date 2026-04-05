package a.n.q;

import a.i.r.g0.c;
import a.n.q.e1;
import a.n.q.j;
import a.n.q.q;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.FocusFinder;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.amazonaws.event.ProgressEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes.dex */
public final class k extends RecyclerView.p {
    public static final Rect s = new Rect();
    public static int[] t = new int[2];
    public int A;
    public int[] C;
    public RecyclerView.w D;
    public d K;
    public g L;
    public int N;
    public int P;
    public int Q;
    public int R;
    public int[] S;
    public int T;
    public int U;
    public int V;
    public int W;
    public int X;
    public int Z;
    public j b0;
    public int f0;
    public int g0;
    public a.n.q.f j0;
    public f m0;
    public final a.n.q.b v;
    public RecyclerView.b0 y;
    public int z;
    public int u = 10;
    public int w = 0;
    public a.y.e.l x = a.y.e.l.a(this);
    public final SparseIntArray B = new SparseIntArray();
    public int E = 221696;
    public a0 F = null;
    public ArrayList<b0> G = null;
    public z H = null;
    public int I = -1;
    public int J = 0;
    public int M = 0;
    public int Y = 8388659;
    public int a0 = 1;
    public int c0 = 0;
    public final e1 d0 = new e1();
    public final p e0 = new p();
    public int[] h0 = new int[2];
    public final d1 i0 = new d1();
    public final Runnable k0 = new a();
    public j.b l0 = new b();
    public int O = -1;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            k.this.w1();
        }
    }

    public class b implements j.b {
        public b() {
        }

        @Override // a.n.q.j.b
        public int a() {
            return k.this.z;
        }

        @Override // a.n.q.j.b
        public int b(int i2) {
            k kVar = k.this;
            return kVar.O2(kVar.E(i2 - kVar.z));
        }

        @Override // a.n.q.j.b
        public int c(int i2) {
            k kVar = k.this;
            View viewE = kVar.E(i2 - kVar.z);
            k kVar2 = k.this;
            return (kVar2.E & 262144) != 0 ? kVar2.M2(viewE) : kVar2.N2(viewE);
        }

        @Override // a.n.q.j.b
        public void d(Object obj, int i2, int i3, int i4, int i5) {
            int i6;
            int i7;
            g gVar;
            View view = (View) obj;
            if (i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE) {
                i5 = !k.this.b0.u() ? k.this.d0.a().g() : k.this.d0.a().i() - k.this.d0.a().f();
            }
            if (!k.this.b0.u()) {
                i7 = i3 + i5;
                i6 = i5;
            } else {
                i6 = i5 - i3;
                i7 = i5;
            }
            int iX2 = k.this.x2(i4) + k.this.d0.c().g();
            k kVar = k.this;
            int i8 = iX2 - kVar.P;
            kVar.i0.g(view, i2);
            k.this.e3(i4, view, i6, i7, i8);
            if (!k.this.y.h()) {
                k.this.q4();
            }
            k kVar2 = k.this;
            if ((kVar2.E & 3) != 1 && (gVar = kVar2.L) != null) {
                gVar.E();
            }
            k kVar3 = k.this;
            if (kVar3.H != null) {
                RecyclerView.e0 e0VarI0 = kVar3.v.i0(view);
                k kVar4 = k.this;
                kVar4.H.a(kVar4.v, view, i2, e0VarI0 == null ? -1L : e0VarI0.p());
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x007b A[PHI: r9
  0x007b: PHI (r9v7 a.n.q.k) = (r9v6 a.n.q.k), (r9v3 a.n.q.k), (r9v3 a.n.q.k) binds: [B:41:0x009e, B:33:0x008d, B:24:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // a.n.q.j.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int e(int r6, boolean r7, java.lang.Object[] r8, boolean r9) {
            /*
                r5 = this;
                a.n.q.k r0 = a.n.q.k.this
                int r1 = r0.z
                int r1 = r6 - r1
                android.view.View r0 = r0.L2(r1)
                android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
                a.n.q.k$e r1 = (a.n.q.k.e) r1
                a.n.q.k r2 = a.n.q.k.this
                a.n.q.b r2 = r2.v
                androidx.recyclerview.widget.RecyclerView$e0 r2 = r2.i0(r0)
                a.n.q.k r3 = a.n.q.k.this
                java.lang.Class<a.n.q.q> r4 = a.n.q.q.class
                java.lang.Object r2 = r3.l2(r2, r4)
                a.n.q.q r2 = (a.n.q.q) r2
                r1.v(r2)
                boolean r1 = r1.d()
                r2 = 0
                if (r1 != 0) goto Lb0
                if (r9 == 0) goto L3c
                if (r7 == 0) goto L36
                a.n.q.k r7 = a.n.q.k.this
                r7.c(r0)
                goto L49
            L36:
                a.n.q.k r7 = a.n.q.k.this
                r7.d(r0, r2)
                goto L49
            L3c:
                if (r7 == 0) goto L44
                a.n.q.k r7 = a.n.q.k.this
                r7.e(r0)
                goto L49
            L44:
                a.n.q.k r7 = a.n.q.k.this
                r7.f(r0, r2)
            L49:
                a.n.q.k r7 = a.n.q.k.this
                int r7 = r7.O
                r9 = -1
                if (r7 == r9) goto L53
                r0.setVisibility(r7)
            L53:
                a.n.q.k r7 = a.n.q.k.this
                a.n.q.k$g r7 = r7.L
                if (r7 == 0) goto L5c
                r7.F()
            L5c:
                a.n.q.k r7 = a.n.q.k.this
                android.view.View r9 = r0.findFocus()
                int r7 = r7.D2(r0, r9)
                a.n.q.k r9 = a.n.q.k.this
                int r1 = r9.E
                r3 = r1 & 3
                r4 = 1
                if (r3 == r4) goto L7f
                int r1 = r9.I
                if (r6 != r1) goto Lab
                int r6 = r9.J
                if (r7 != r6) goto Lab
                a.n.q.k$g r6 = r9.L
                if (r6 != 0) goto Lab
            L7b:
                r9.U1()
                goto Lab
            L7f:
                r3 = r1 & 4
                if (r3 != 0) goto Lab
                r3 = r1 & 16
                if (r3 != 0) goto L90
                int r3 = r9.I
                if (r6 != r3) goto L90
                int r3 = r9.J
                if (r7 != r3) goto L90
                goto L7b
            L90:
                r1 = r1 & 16
                if (r1 == 0) goto Lab
                int r9 = r9.I
                if (r6 < r9) goto Lab
                boolean r9 = r0.hasFocusable()
                if (r9 == 0) goto Lab
                a.n.q.k r9 = a.n.q.k.this
                r9.I = r6
                r9.J = r7
                int r6 = r9.E
                r6 = r6 & (-17)
                r9.E = r6
                goto L7b
            Lab:
                a.n.q.k r6 = a.n.q.k.this
                r6.h3(r0)
            Lb0:
                r8[r2] = r0
                a.n.q.k r6 = a.n.q.k.this
                int r7 = r6.w
                if (r7 != 0) goto Lbd
                int r6 = r6.j2(r0)
                goto Lc1
            Lbd:
                int r6 = r6.i2(r0)
            Lc1:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: a.n.q.k.b.e(int, boolean, java.lang.Object[], boolean):int");
        }

        @Override // a.n.q.j.b
        public int getCount() {
            return k.this.y.c() + k.this.z;
        }

        @Override // a.n.q.j.b
        public void removeItem(int i2) {
            k kVar = k.this;
            View viewE = kVar.E(i2 - kVar.z);
            k kVar2 = k.this;
            if ((kVar2.E & 3) == 1) {
                kVar2.y(viewE, kVar2.D);
            } else {
                kVar2.p1(viewE, kVar2.D);
            }
        }
    }

    public class c extends d {
        public c() {
            super();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a0
        public PointF a(int i2) {
            if (c() == 0) {
                return null;
            }
            k kVar = k.this;
            boolean z = false;
            int iJ0 = kVar.j0(kVar.K(0));
            k kVar2 = k.this;
            if ((kVar2.E & 262144) == 0 ? i2 < iJ0 : i2 > iJ0) {
                z = true;
            }
            int i3 = z ? -1 : 1;
            return kVar2.w == 0 ? new PointF(i3, 0.0f) : new PointF(0.0f, i3);
        }
    }

    public abstract class d extends a.y.e.j {
        public boolean q;

        public d() {
            super(k.this.v.getContext());
        }

        public void D() {
            View viewB = b(f());
            if (viewB == null) {
                if (f() >= 0) {
                    k.this.z3(f(), 0, false, 0);
                    return;
                }
                return;
            }
            if (k.this.I != f()) {
                k.this.I = f();
            }
            if (k.this.t0()) {
                k.this.E |= 32;
                viewB.requestFocus();
                k.this.E &= -33;
            }
            k.this.U1();
            k.this.V1();
        }

        @Override // a.y.e.j, androidx.recyclerview.widget.RecyclerView.a0
        public void n() {
            super.n();
            if (!this.q) {
                D();
            }
            k kVar = k.this;
            if (kVar.K == this) {
                kVar.K = null;
            }
            if (kVar.L == this) {
                kVar.L = null;
            }
        }

        @Override // a.y.e.j, androidx.recyclerview.widget.RecyclerView.a0
        public void o(View view, RecyclerView.b0 b0Var, RecyclerView.a0.a aVar) {
            int i2;
            int i3;
            if (k.this.y2(view, null, k.t)) {
                if (k.this.w == 0) {
                    int[] iArr = k.t;
                    i3 = iArr[0];
                    i2 = iArr[1];
                } else {
                    int[] iArr2 = k.t;
                    int i4 = iArr2[1];
                    i2 = iArr2[0];
                    i3 = i4;
                }
                aVar.d(i3, i2, w((int) Math.sqrt((i3 * i3) + (i2 * i2))), this.f3952j);
            }
        }

        @Override // a.y.e.j
        public int x(int i2) {
            int iX = super.x(i2);
            if (k.this.d0.a().i() <= 0) {
                return iX;
            }
            float fI = (30.0f / k.this.d0.a().i()) * i2;
            return ((float) iX) < fI ? (int) fI : iX;
        }
    }

    public static final class e extends RecyclerView.q {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f2841e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f2842f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f2843g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f2844h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f2845i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f2846j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int[] f2847k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public q f2848l;

        public e(int i2, int i3) {
            super(i2, i3);
        }

        public e(e eVar) {
            super((RecyclerView.q) eVar);
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public e(RecyclerView.q qVar) {
            super(qVar);
        }

        public void g(int i2, View view) {
            q.a[] aVarArrA = this.f2848l.a();
            int[] iArr = this.f2847k;
            if (iArr == null || iArr.length != aVarArrA.length) {
                this.f2847k = new int[aVarArrA.length];
            }
            for (int i3 = 0; i3 < aVarArrA.length; i3++) {
                this.f2847k[i3] = r.a(view, aVarArrA[i3], i2);
            }
            if (i2 == 0) {
                this.f2845i = this.f2847k[0];
            } else {
                this.f2846j = this.f2847k[0];
            }
        }

        public int[] h() {
            return this.f2847k;
        }

        public int i() {
            return this.f2845i;
        }

        public int j() {
            return this.f2846j;
        }

        public q k() {
            return this.f2848l;
        }

        public int l(View view) {
            return (view.getHeight() - this.f2842f) - this.f2844h;
        }

        public int m(View view) {
            return view.getLeft() + this.f2841e;
        }

        public int n() {
            return this.f2841e;
        }

        public int o(View view) {
            return view.getRight() - this.f2843g;
        }

        public int p() {
            return this.f2843g;
        }

        public int q(View view) {
            return view.getTop() + this.f2842f;
        }

        public int r() {
            return this.f2842f;
        }

        public int s(View view) {
            return (view.getWidth() - this.f2841e) - this.f2843g;
        }

        public void t(int i2) {
            this.f2845i = i2;
        }

        public void u(int i2) {
            this.f2846j = i2;
        }

        public void v(q qVar) {
            this.f2848l = qVar;
        }

        public void w(int i2, int i3, int i4, int i5) {
            this.f2841e = i2;
            this.f2842f = i3;
            this.f2843g = i4;
            this.f2844h = i5;
        }
    }

    public static class f {
    }

    public final class g extends d {
        public final boolean s;
        public int t;

        public g(int i2, boolean z) {
            super();
            this.t = i2;
            this.s = z;
            p(-2);
        }

        @Override // a.y.e.j
        public void C(RecyclerView.a0.a aVar) {
            if (this.t == 0) {
                return;
            }
            super.C(aVar);
        }

        @Override // a.n.q.k.d
        public void D() {
            super.D();
            this.t = 0;
            View viewB = b(f());
            if (viewB != null) {
                k.this.C3(viewB, true);
            }
        }

        public void E() {
            int i2;
            if (this.s && (i2 = this.t) != 0) {
                this.t = k.this.s3(true, i2);
            }
            int i3 = this.t;
            if (i3 == 0 || ((i3 > 0 && k.this.X2()) || (this.t < 0 && k.this.W2()))) {
                p(k.this.I);
                r();
            }
        }

        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0046 -> B:10:0x0010). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:14:0x001d
            	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:226)
            	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:196)
            	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:63)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
            	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:125)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
            */
        public void F() {
            /*
                r4 = this;
                boolean r0 = r4.s
                if (r0 != 0) goto L69
                int r0 = r4.t
                if (r0 != 0) goto L9
                goto L69
            L9:
                r1 = 0
                if (r0 <= 0) goto L14
                a.n.q.k r0 = a.n.q.k.this
                int r2 = r0.I
            L10:
                int r0 = r0.Z
                int r2 = r2 + r0
                goto L1b
            L14:
                a.n.q.k r0 = a.n.q.k.this
                int r2 = r0.I
            L18:
                int r0 = r0.Z
                int r2 = r2 - r0
            L1b:
                int r0 = r4.t
                if (r0 == 0) goto L4c
                android.view.View r0 = r4.b(r2)
                if (r0 != 0) goto L26
                goto L4c
            L26:
                a.n.q.k r3 = a.n.q.k.this
                boolean r3 = r3.S1(r0)
                if (r3 != 0) goto L2f
                goto L42
            L2f:
                a.n.q.k r1 = a.n.q.k.this
                r1.I = r2
                r3 = 0
                r1.J = r3
                int r1 = r4.t
                if (r1 <= 0) goto L3d
                int r1 = r1 + (-1)
                goto L3f
            L3d:
                int r1 = r1 + 1
            L3f:
                r4.t = r1
                r1 = r0
            L42:
                int r0 = r4.t
                if (r0 <= 0) goto L49
                a.n.q.k r0 = a.n.q.k.this
                goto L10
            L49:
                a.n.q.k r0 = a.n.q.k.this
                goto L18
            L4c:
                if (r1 == 0) goto L69
                a.n.q.k r0 = a.n.q.k.this
                boolean r0 = r0.t0()
                if (r0 == 0) goto L69
                a.n.q.k r0 = a.n.q.k.this
                int r2 = r0.E
                r2 = r2 | 32
                r0.E = r2
                r1.requestFocus()
                a.n.q.k r0 = a.n.q.k.this
                int r1 = r0.E
                r1 = r1 & (-33)
                r0.E = r1
            L69:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: a.n.q.k.g.F():void");
        }

        public void G() {
            int i2 = this.t;
            if (i2 > (-k.this.u)) {
                this.t = i2 - 1;
            }
        }

        public void H() {
            int i2 = this.t;
            if (i2 < k.this.u) {
                this.t = i2 + 1;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a0
        public PointF a(int i2) {
            int i3 = this.t;
            if (i3 == 0) {
                return null;
            }
            k kVar = k.this;
            int i4 = ((kVar.E & 262144) == 0 ? i3 >= 0 : i3 <= 0) ? 1 : -1;
            return kVar.w == 0 ? new PointF(i4, 0.0f) : new PointF(0.0f, i4);
        }
    }

    public static final class h implements Parcelable {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f2849b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Bundle f2850c;

        public static class a implements Parcelable.Creator<h> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(Parcel parcel) {
                return new h(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public h[] newArray(int i2) {
                return new h[i2];
            }
        }

        public h() {
            this.f2850c = Bundle.EMPTY;
        }

        public h(Parcel parcel) {
            this.f2850c = Bundle.EMPTY;
            this.f2849b = parcel.readInt();
            this.f2850c = parcel.readBundle(k.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.f2849b);
            parcel.writeBundle(this.f2850c);
        }
    }

    public k(a.n.q.b bVar) {
        this.v = bVar;
        D1(false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void A1(int i2) {
        b4(i2, 0, false, 0);
    }

    public int A2() {
        return this.I;
    }

    public final void A3(View view, View view2, boolean z) {
        B3(view, view2, z, 0, 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int B1(int i2, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if ((this.E & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) == 0 || !Y2()) {
            return 0;
        }
        this.E = (this.E & (-4)) | 2;
        v3(wVar, b0Var);
        int iW3 = this.w == 1 ? w3(i2) : x3(i2);
        g3();
        this.E &= -4;
        return iW3;
    }

    public final int B2() {
        int i2 = (this.E & 524288) != 0 ? 0 : this.Z - 1;
        return x2(i2) + w2(i2);
    }

    public final void B3(View view, View view2, boolean z, int i2, int i3) {
        if ((this.E & 64) != 0) {
            return;
        }
        int iE2 = e2(view);
        int iD2 = D2(view, view2);
        if (iE2 != this.I || iD2 != this.J) {
            this.I = iE2;
            this.J = iD2;
            this.M = 0;
            if ((this.E & 3) != 1) {
                U1();
            }
            if (this.v.F1()) {
                this.v.invalidate();
            }
        }
        if (view == null) {
            return;
        }
        if (!view.hasFocus() && this.v.hasFocus()) {
            view.requestFocus();
        }
        if ((this.E & 131072) == 0 && z) {
            return;
        }
        if (!y2(view, view2, t) && i2 == 0 && i3 == 0) {
            return;
        }
        int[] iArr = t;
        y3(iArr[0] + i2, iArr[1] + i3, z);
    }

    public int C2() {
        int i2;
        int left;
        int right;
        if (this.w == 1) {
            i2 = -Y();
            if (L() <= 0 || (left = K(0).getTop()) >= 0) {
                return i2;
            }
        } else {
            if ((this.E & 262144) != 0) {
                int iQ0 = q0();
                return (L() <= 0 || (right = K(0).getRight()) <= iQ0) ? iQ0 : right;
            }
            i2 = -q0();
            if (L() <= 0 || (left = K(0).getLeft()) >= 0) {
                return i2;
            }
        }
        return i2 + left;
    }

    public void C3(View view, boolean z) {
        A3(view, view == null ? null : view.findFocus(), z);
    }

    public int D2(View view, View view2) {
        q qVarK;
        if (view != null && view2 != null && (qVarK = ((e) view.getLayoutParams()).k()) != null) {
            q.a[] aVarArrA = qVarK.a();
            if (aVarArrA.length > 1) {
                while (view2 != view) {
                    int id = view2.getId();
                    if (id != -1) {
                        for (int i2 = 1; i2 < aVarArrA.length; i2++) {
                            if (aVarArrA[i2].a() == id) {
                                return i2;
                            }
                        }
                    }
                    view2 = (View) view2.getParent();
                }
            }
        }
        return 0;
    }

    public void D3(View view, boolean z, int i2, int i3) {
        B3(view, view == null ? null : view.findFocus(), z, i2, i3);
    }

    public int E2() {
        return this.J;
    }

    public void E3(int i2) {
        this.O = i2;
        if (i2 != -1) {
            int iL = L();
            for (int i3 = 0; i3 < iL; i3++) {
                K(i3).setVisibility(this.O);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q F() {
        return new e(-2, -2);
    }

    public String F2() {
        return "GridLayoutManager:" + this.v.getId();
    }

    public void F3(int i2) {
        int i3 = this.g0;
        if (i3 == i2) {
            return;
        }
        if (i3 < 0) {
            throw new IllegalArgumentException("ExtraLayoutSpace must >= 0");
        }
        this.g0 = i2;
        w1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q G(Context context, AttributeSet attributeSet) {
        return new e(context, attributeSet);
    }

    public int G2() {
        return this.V;
    }

    public void G3(boolean z, boolean z2) {
        this.E = (z ? 2048 : 0) | (this.E & (-6145)) | (z2 ? ProgressEvent.PART_FAILED_EVENT_CODE : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q H(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e ? new e((e) layoutParams) : layoutParams instanceof RecyclerView.q ? new e((RecyclerView.q) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void H0(RecyclerView.h hVar, RecyclerView.h hVar2) {
        if (hVar != null) {
            T1();
            this.I = -1;
            this.M = 0;
            this.i0.b();
        }
        this.j0 = hVar2 instanceof a.n.q.f ? (a.n.q.f) hVar2 : null;
        super.H0(hVar, hVar2);
    }

    public final int H2(View view) {
        return this.w == 0 ? J2(view) : K2(view);
    }

    public void H3(boolean z, boolean z2) {
        this.E = (z ? 8192 : 0) | (this.E & (-24577)) | (z2 ? 16384 : 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0096  */
    @Override // androidx.recyclerview.widget.RecyclerView.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean I0(androidx.recyclerview.widget.RecyclerView r18, java.util.ArrayList<android.view.View> r19, int r20, int r21) {
        /*
            Method dump skipped, instruction units count: 391
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.n.q.k.I0(androidx.recyclerview.widget.RecyclerView, java.util.ArrayList, int, int):boolean");
    }

    public final int I2(View view) {
        return this.w == 0 ? K2(view) : J2(view);
    }

    public void I3(int i2) {
        this.c0 = i2;
    }

    public final int J2(View view) {
        e eVar = (e) view.getLayoutParams();
        return eVar.m(view) + eVar.i();
    }

    public void J3(boolean z) {
        this.E = (z ? 32768 : 0) | (this.E & (-32769));
    }

    public final int K2(View view) {
        e eVar = (e) view.getLayoutParams();
        return eVar.q(view) + eVar.j();
    }

    public void K3(int i2) {
        this.Y = i2;
    }

    public View L2(int i2) {
        return this.D.o(i2);
    }

    public void L3(int i2) {
        int i3 = this.w;
        this.U = i2;
        if (i3 == 0) {
            this.W = i2;
        } else {
            this.X = i2;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void M1(RecyclerView recyclerView, RecyclerView.b0 b0Var, int i2) {
        b4(i2, 0, true, 0);
    }

    public int M2(View view) {
        return this.x.d(view);
    }

    public void M3(int i2) {
        this.e0.a().f(i2);
        k4();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void N1(RecyclerView.a0 a0Var) {
        i4();
        super.N1(a0Var);
        if (a0Var.h() && (a0Var instanceof d)) {
            d dVar = (d) a0Var;
            this.K = dVar;
            if (dVar instanceof g) {
                this.L = (g) dVar;
                return;
            }
        } else {
            this.K = null;
        }
        this.L = null;
    }

    public int N2(View view) {
        return this.x.g(view);
    }

    public void N3(float f2) {
        this.e0.a().g(f2);
        k4();
    }

    public int O2(View view) {
        Rect rect = s;
        R(view, rect);
        return this.w == 0 ? rect.width() : rect.height();
    }

    public void O3(boolean z) {
        this.e0.a().h(z);
        k4();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int P(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        j jVar;
        return (this.w != 1 || (jVar = this.b0) == null) ? super.P(wVar, b0Var) : jVar.r();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean P1() {
        return true;
    }

    public void P2(View view, int[] iArr) {
        if (this.w == 0) {
            iArr[0] = v2(view);
            iArr[1] = z2(view);
        } else {
            iArr[1] = v2(view);
            iArr[0] = z2(view);
        }
    }

    public void P3(int i2) {
        this.e0.a().i(i2);
        k4();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int Q(View view) {
        return super.Q(view) - ((e) view.getLayoutParams()).f2844h;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void Q0(RecyclerView.w wVar, RecyclerView.b0 b0Var, a.i.r.g0.c cVar) {
        v3(wVar, b0Var);
        int iC = b0Var.c();
        boolean z = (this.E & 262144) != 0;
        if (iC > 1 && !b3(0)) {
            if (Build.VERSION.SDK_INT >= 23) {
                cVar.b(this.w == 0 ? z ? c.a.B : c.a.z : c.a.y);
            } else {
                cVar.a(8192);
            }
            cVar.p0(true);
        }
        if (iC > 1 && !b3(iC - 1)) {
            if (Build.VERSION.SDK_INT >= 23) {
                cVar.b(this.w == 0 ? z ? c.a.z : c.a.B : c.a.A);
            } else {
                cVar.a(ProgressEvent.PART_FAILED_EVENT_CODE);
            }
            cVar.p0(true);
        }
        cVar.Z(c.b.a(m0(wVar, b0Var), P(wVar, b0Var), y0(wVar, b0Var), n0(wVar, b0Var)));
        g3();
    }

    public final boolean Q1() {
        return this.b0.a();
    }

    public int Q2() {
        return this.d0.a().j();
    }

    public void Q3(int i2) {
        this.U = i2;
        this.V = i2;
        this.X = i2;
        this.W = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void R(View view, Rect rect) {
        super.R(view, rect);
        e eVar = (e) view.getLayoutParams();
        rect.left += eVar.f2841e;
        rect.top += eVar.f2842f;
        rect.right -= eVar.f2843g;
        rect.bottom -= eVar.f2844h;
    }

    public final void R1() {
        this.b0.b((this.E & 262144) != 0 ? (-this.g0) - this.A : this.f0 + this.g0 + this.A);
    }

    public int R2() {
        return this.d0.a().k();
    }

    public void R3(boolean z) {
        int i2 = this.E;
        if (((i2 & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) != 0) != z) {
            this.E = (i2 & (-513)) | (z ? IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED : 0);
            w1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int S(View view) {
        return super.S(view) + ((e) view.getLayoutParams()).f2841e;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void S0(RecyclerView.w wVar, RecyclerView.b0 b0Var, View view, a.i.r.g0.c cVar) {
        int i2;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (this.b0 == null || !(layoutParams instanceof e)) {
            return;
        }
        int iA = ((e) layoutParams).a();
        int iS = iA >= 0 ? this.b0.s(iA) : -1;
        if (iS < 0) {
            return;
        }
        int iR = iA / this.b0.r();
        if (this.w == 0) {
            i2 = iS;
            iS = iR;
        } else {
            i2 = iR;
        }
        cVar.a0(c.C0042c.a(i2, 1, iS, 1, false, false));
    }

    public boolean S1(View view) {
        return view.getVisibility() == 0 && (!t0() || view.hasFocusable());
    }

    public float S2() {
        return this.d0.a().l();
    }

    public void S3(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
        this.a0 = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public View T0(View view, int i2) {
        View viewFindNextFocus;
        if ((this.E & 32768) != 0) {
            return view;
        }
        FocusFinder focusFinder = FocusFinder.getInstance();
        View viewFindNextFocus2 = null;
        if (i2 == 2 || i2 == 1) {
            if (m()) {
                viewFindNextFocus2 = focusFinder.findNextFocus(this.v, view, i2 == 2 ? 130 : 33);
            }
            if (l()) {
                viewFindNextFocus = focusFinder.findNextFocus(this.v, view, (b0() == 1) ^ (i2 == 2) ? 66 : 17);
            } else {
                viewFindNextFocus = viewFindNextFocus2;
            }
        } else {
            viewFindNextFocus = focusFinder.findNextFocus(this.v, view, i2);
        }
        if (viewFindNextFocus != null) {
            return viewFindNextFocus;
        }
        if (this.v.getDescendantFocusability() == 393216) {
            return this.v.getParent().focusSearch(view, i2);
        }
        int iR2 = r2(i2);
        boolean z = this.v.getScrollState() != 0;
        if (iR2 == 1) {
            if (z || (this.E & ProgressEvent.PART_FAILED_EVENT_CODE) == 0) {
                viewFindNextFocus = view;
            }
            if ((this.E & 131072) != 0 && !X2()) {
                q3(true);
                viewFindNextFocus = view;
            }
        } else if (iR2 == 0) {
            if (z || (this.E & 2048) == 0) {
                viewFindNextFocus = view;
            }
            if ((this.E & 131072) != 0 && !W2()) {
                q3(false);
                viewFindNextFocus = view;
            }
        } else if (iR2 == 3) {
        }
        if (viewFindNextFocus != null) {
            return viewFindNextFocus;
        }
        View viewFocusSearch = this.v.getParent().focusSearch(view, i2);
        return viewFocusSearch != null ? viewFocusSearch : view != null ? view : this.v;
    }

    public final void T1() {
        this.b0 = null;
        this.S = null;
        this.E &= -1025;
    }

    public boolean T2(RecyclerView recyclerView, int i2, Rect rect) {
        int i3 = this.c0;
        return (i3 == 1 || i3 == 2) ? V2(recyclerView, i2, rect) : U2(recyclerView, i2, rect);
    }

    public void T3(z zVar) {
        this.H = zVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void U0(RecyclerView recyclerView, int i2, int i3) {
        j jVar;
        int i4;
        if (this.I != -1 && (jVar = this.b0) != null && jVar.m() >= 0 && (i4 = this.M) != Integer.MIN_VALUE && i2 <= this.I + i4) {
            this.M = i4 + i3;
        }
        this.i0.b();
    }

    public void U1() {
        if (this.F != null || Z2()) {
            int i2 = this.I;
            View viewE = i2 == -1 ? null : E(i2);
            if (viewE != null) {
                RecyclerView.e0 e0VarI0 = this.v.i0(viewE);
                a0 a0Var = this.F;
                if (a0Var != null) {
                    a0Var.a(this.v, viewE, this.I, e0VarI0 == null ? -1L : e0VarI0.p());
                }
                Z1(this.v, e0VarI0, this.I, this.J);
            } else {
                a0 a0Var2 = this.F;
                if (a0Var2 != null) {
                    a0Var2.a(this.v, null, -1, -1L);
                }
                Z1(this.v, null, -1, 0);
            }
            if ((this.E & 3) == 1 || this.v.isLayoutRequested()) {
                return;
            }
            int iL = L();
            for (int i3 = 0; i3 < iL; i3++) {
                if (K(i3).isLayoutRequested()) {
                    c2();
                    return;
                }
            }
        }
    }

    public final boolean U2(RecyclerView recyclerView, int i2, Rect rect) {
        View viewE = E(this.I);
        if (viewE != null) {
            return viewE.requestFocus(i2, rect);
        }
        return false;
    }

    public void U3(a0 a0Var) {
        this.F = a0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int V(View view) {
        return super.V(view) - ((e) view.getLayoutParams()).f2843g;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void V0(RecyclerView recyclerView) {
        this.M = 0;
        this.i0.b();
    }

    public void V1() {
        if (Z2()) {
            int i2 = this.I;
            View viewE = i2 == -1 ? null : E(i2);
            if (viewE != null) {
                a2(this.v, this.v.i0(viewE), this.I, this.J);
                return;
            }
            a0 a0Var = this.F;
            if (a0Var != null) {
                a0Var.a(this.v, null, -1, -1L);
            }
            a2(this.v, null, -1, 0);
        }
    }

    public final boolean V2(RecyclerView recyclerView, int i2, Rect rect) {
        int i3;
        int i4;
        int iL = L();
        int i5 = -1;
        if ((i2 & 2) != 0) {
            i5 = iL;
            i3 = 0;
            i4 = 1;
        } else {
            i3 = iL - 1;
            i4 = -1;
        }
        int iG = this.d0.a().g();
        int iC = this.d0.a().c() + iG;
        while (i3 != i5) {
            View viewK = K(i3);
            if (viewK.getVisibility() == 0 && N2(viewK) >= iG && M2(viewK) <= iC && viewK.requestFocus(i2, rect)) {
                return true;
            }
            i3 += i4;
        }
        return false;
    }

    public void V3(b0 b0Var) {
        if (b0Var == null) {
            this.G = null;
            return;
        }
        ArrayList<b0> arrayList = this.G;
        if (arrayList == null) {
            this.G = new ArrayList<>();
        } else {
            arrayList.clear();
        }
        this.G.add(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int W(View view) {
        return super.W(view) + ((e) view.getLayoutParams()).f2842f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void W0(RecyclerView recyclerView, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7 = this.I;
        if (i7 != -1 && (i5 = this.M) != Integer.MIN_VALUE) {
            int i8 = i7 + i5;
            if (i2 <= i8 && i8 < i2 + i4) {
                i6 = i5 + (i3 - i2);
            } else if (i2 < i8 && i3 > i8 - i4) {
                i6 = i5 - i4;
            } else if (i2 > i8 && i3 < i8) {
                i6 = i5 + i4;
            }
            this.M = i6;
        }
        this.i0.b();
    }

    public final void W1() {
        j.a aVarQ;
        int iL = L();
        int iM = this.b0.m();
        this.E &= -9;
        boolean z = false;
        int i2 = 0;
        while (i2 < iL) {
            View viewK = K(i2);
            if (iM == e2(viewK) && (aVarQ = this.b0.q(iM)) != null) {
                int iX2 = (x2(aVarQ.f2834a) + this.d0.c().g()) - this.P;
                int iN2 = N2(viewK);
                int iO2 = O2(viewK);
                if (((e) viewK.getLayoutParams()).f()) {
                    this.E |= 8;
                    y(viewK, this.D);
                    viewK = L2(iM);
                    f(viewK, i2);
                }
                View view = viewK;
                h3(view);
                int iJ2 = this.w == 0 ? j2(view) : i2(view);
                e3(aVarQ.f2834a, view, iN2, iN2 + iJ2, iX2);
                if (iO2 == iJ2) {
                    i2++;
                    iM++;
                }
            }
            z = true;
        }
        if (z) {
            int iP = this.b0.p();
            for (int i3 = iL - 1; i3 >= i2; i3--) {
                y(K(i3), this.D);
            }
            this.b0.t(iM);
            if ((this.E & 65536) != 0) {
                R1();
                int i4 = this.I;
                if (i4 >= 0 && i4 <= iP) {
                    while (this.b0.p() < this.I) {
                        this.b0.a();
                    }
                }
            } else {
                while (this.b0.a() && this.b0.p() < iP) {
                }
            }
        }
        q4();
        r4();
    }

    public boolean W2() {
        return a0() == 0 || this.v.Z(0) != null;
    }

    public void W3(int i2) {
        if (i2 == 0 || i2 == 1) {
            this.w = i2;
            this.x = a.y.e.l.b(this, i2);
            this.d0.d(i2);
            this.e0.b(i2);
            this.E |= 256;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void X0(RecyclerView recyclerView, int i2, int i3) {
        j jVar;
        int i4;
        int i5;
        int i6;
        if (this.I != -1 && (jVar = this.b0) != null && jVar.m() >= 0 && (i4 = this.M) != Integer.MIN_VALUE && i2 <= (i6 = (i5 = this.I) + i4)) {
            if (i2 + i3 > i6) {
                int i7 = i4 + (i2 - i6);
                this.M = i7;
                this.I = i5 + i7;
                this.M = Integer.MIN_VALUE;
            } else {
                this.M = i4 - i3;
            }
        }
        this.i0.b();
    }

    public void X1() {
        List<RecyclerView.e0> listK = this.D.k();
        int size = listK.size();
        if (size == 0) {
            return;
        }
        int[] iArr = this.C;
        if (iArr == null || size > iArr.length) {
            int length = iArr == null ? 16 : iArr.length;
            while (length < size) {
                length <<= 1;
            }
            this.C = new int[length];
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            int iN = listK.get(i3).n();
            if (iN >= 0) {
                this.C[i2] = iN;
                i2++;
            }
        }
        if (i2 > 0) {
            Arrays.sort(this.C, 0, i2);
            this.b0.h(this.C, i2, this.B);
        }
        this.B.clear();
    }

    public boolean X2() {
        int iA0 = a0();
        return iA0 == 0 || this.v.Z(iA0 - 1) != null;
    }

    public void X3(boolean z) {
        int i2 = this.E;
        if (((i2 & 65536) != 0) != z) {
            this.E = (i2 & (-65537)) | (z ? 65536 : 0);
            if (z) {
                w1();
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void Y0(RecyclerView recyclerView, int i2, int i3) {
        int i4 = i3 + i2;
        while (i2 < i4) {
            this.i0.h(i2);
            i2++;
        }
    }

    public final int Y1(View view) {
        View viewD;
        a.n.q.b bVar = this.v;
        if (bVar == null || view == bVar || (viewD = D(view)) == null) {
            return -1;
        }
        int iL = L();
        for (int i2 = 0; i2 < iL; i2++) {
            if (K(i2) == viewD) {
                return i2;
            }
        }
        return -1;
    }

    public boolean Y2() {
        return this.b0 != null;
    }

    public void Y3(int i2) {
        if (i2 >= 0 || i2 == -2) {
            this.Q = i2;
            return;
        }
        throw new IllegalArgumentException("Invalid row height: " + i2);
    }

    public void Z1(RecyclerView recyclerView, RecyclerView.e0 e0Var, int i2, int i3) {
        ArrayList<b0> arrayList = this.G;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            this.G.get(size).a(recyclerView, e0Var, i2, i3);
        }
    }

    public boolean Z2() {
        ArrayList<b0> arrayList = this.G;
        return arrayList != null && arrayList.size() > 0;
    }

    public void Z3(boolean z) {
        int i2;
        int i3 = this.E;
        if (((i3 & 131072) != 0) != z) {
            int i4 = (i3 & (-131073)) | (z ? 131072 : 0);
            this.E = i4;
            if ((i4 & 131072) == 0 || this.c0 != 0 || (i2 = this.I) == -1) {
                return;
            }
            z3(i2, this.J, true, this.N);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void a1(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        int iD;
        int iE;
        int i2;
        int i3;
        int i4;
        if (this.Z != 0 && b0Var.c() >= 0) {
            if ((this.E & 64) != 0 && L() > 0) {
                this.E |= 128;
                return;
            }
            int i5 = this.E;
            if ((i5 & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) == 0) {
                T1();
                n1(wVar);
                return;
            }
            this.E = (i5 & (-4)) | 1;
            v3(wVar, b0Var);
            int iMax = Integer.MIN_VALUE;
            if (b0Var.h()) {
                m4();
                int iL = L();
                if (this.b0 != null && iL > 0) {
                    int iMin = Integer.MAX_VALUE;
                    int iS = this.v.i0(K(0)).s();
                    int iS2 = this.v.i0(K(iL - 1)).s();
                    while (i < iL) {
                        View viewK = K(i);
                        e eVar = (e) viewK.getLayoutParams();
                        int iG0 = this.v.g0(viewK);
                        if (eVar.c() || eVar.d() || viewK.isLayoutRequested() || ((!viewK.hasFocus() && this.I == eVar.a()) || ((viewK.hasFocus() && this.I != eVar.a()) || iG0 < iS || iG0 > iS2))) {
                            iMin = Math.min(iMin, N2(viewK));
                            iMax = Math.max(iMax, M2(viewK));
                        }
                        i++;
                    }
                    if (iMax > iMin) {
                        this.A = iMax - iMin;
                    }
                    R1();
                    p3();
                }
                this.E &= -4;
                g3();
                return;
            }
            if (b0Var.j()) {
                n4();
            }
            boolean z = !A0() && this.c0 == 0;
            int i6 = this.I;
            if (i6 != -1 && (i4 = this.M) != Integer.MIN_VALUE) {
                this.I = i6 + i4;
                this.J = 0;
            }
            this.M = 0;
            View viewE = E(this.I);
            int i7 = this.I;
            int i8 = this.J;
            boolean zHasFocus = this.v.hasFocus();
            j jVar = this.b0;
            int iM = jVar != null ? jVar.m() : -1;
            j jVar2 = this.b0;
            int iP = jVar2 != null ? jVar2.p() : -1;
            if (this.w == 0) {
                iE = b0Var.d();
                iD = b0Var.e();
            } else {
                iD = b0Var.d();
                iE = b0Var.e();
            }
            if (f3()) {
                this.E |= 4;
                this.b0.G(this.I);
                W1();
            } else {
                int i9 = this.E & (-5);
                this.E = i9;
                this.E = (zHasFocus ? 16 : 0) | (i9 & (-17));
                if (z && (iM < 0 || (i2 = this.I) > iP || i2 < iM)) {
                    iM = this.I;
                    iP = iM;
                }
                this.b0.G(iM);
                if (iP != -1) {
                    while (Q1() && E(iP) == null) {
                    }
                }
            }
            while (true) {
                q4();
                int iM2 = this.b0.m();
                int iP2 = this.b0.p();
                b2(zHasFocus, z, -iE, -iD);
                R1();
                p3();
                if (this.b0.m() == iM2 && this.b0.p() == iP2) {
                    break;
                }
            }
            u3();
            t3();
            if (b0Var.j()) {
                X1();
            }
            int i10 = this.E;
            if ((i10 & 1024) != 0) {
                this.E = i10 & (-1025);
            } else {
                o4();
            }
            if (((this.E & 4) != 0 && ((i3 = this.I) != i7 || this.J != i8 || E(i3) != viewE || (this.E & 8) != 0)) || (this.E & 20) == 16) {
                U1();
            }
            V1();
            if ((this.E & 64) != 0) {
                w3(C2());
            }
            this.E &= -4;
            g3();
        }
    }

    public void a2(RecyclerView recyclerView, RecyclerView.e0 e0Var, int i2, int i3) {
        ArrayList<b0> arrayList = this.G;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            this.G.get(size).b(recyclerView, e0Var, i2, i3);
        }
    }

    public final void a3() {
        this.d0.b();
        this.d0.f2761c.x(q0());
        this.d0.f2760b.x(Y());
        this.d0.f2761c.t(g0(), h0());
        this.d0.f2760b.t(i0(), f0());
        this.f0 = this.d0.a().i();
        this.P = 0;
    }

    public void a4(int i2, int i3) {
        b4(i2, 0, false, i3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void b1(RecyclerView.b0 b0Var) {
        if (this.m0 != null) {
            throw null;
        }
    }

    public final void b2(boolean z, boolean z2, int i2, int i3) {
        View viewE = E(this.I);
        if (viewE != null && z2) {
            D3(viewE, false, i2, i3);
        }
        if (viewE != null && z && !viewE.hasFocus()) {
            viewE.requestFocus();
            return;
        }
        if (z || this.v.hasFocus()) {
            return;
        }
        if (viewE != null && viewE.hasFocusable()) {
            this.v.focusableViewAvailable(viewE);
            break;
        }
        int iL = L();
        for (int i4 = 0; i4 < iL; i4++) {
            viewE = K(i4);
            if (viewE != null && viewE.hasFocusable()) {
                this.v.focusableViewAvailable(viewE);
                break;
            }
        }
        if (z2 && viewE != null && viewE.hasFocus()) {
            D3(viewE, false, i2, i3);
        }
    }

    public boolean b3(int i2) {
        RecyclerView.e0 e0VarZ = this.v.Z(i2);
        return e0VarZ != null && e0VarZ.f4855b.getLeft() >= 0 && e0VarZ.f4855b.getRight() <= this.v.getWidth() && e0VarZ.f4855b.getTop() >= 0 && e0VarZ.f4855b.getBottom() <= this.v.getHeight();
    }

    public void b4(int i2, int i3, boolean z, int i4) {
        if ((this.I == i2 || i2 == -1) && i3 == this.J && i4 == this.N) {
            return;
        }
        z3(i2, i3, z, i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d5  */
    @Override // androidx.recyclerview.widget.RecyclerView.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c1(androidx.recyclerview.widget.RecyclerView.w r7, androidx.recyclerview.widget.RecyclerView.b0 r8, int r9, int r10) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.n.q.k.c1(androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$b0, int, int):void");
    }

    public final void c2() {
        a.i.r.x.h0(this.v, this.k0);
    }

    public boolean c3() {
        return (this.E & 131072) != 0;
    }

    public void c4(int i2) {
        b4(i2, 0, true, 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean d1(RecyclerView recyclerView, View view, View view2) {
        if ((this.E & 32768) == 0 && e2(view) != -1 && (this.E & 35) == 0) {
            A3(view, view2, true);
        }
        return true;
    }

    public final int d2(int i2) {
        return e2(K(i2));
    }

    public boolean d3() {
        return (this.E & 64) != 0;
    }

    public void d4(int i2, int i3, int i4) {
        b4(i2, i3, false, i4);
    }

    public final int e2(View view) {
        e eVar;
        if (view == null || (eVar = (e) view.getLayoutParams()) == null || eVar.d()) {
            return -1;
        }
        return eVar.a();
    }

    public void e3(int i2, View view, int i3, int i4, int i5) {
        int iW2;
        int iI2 = this.w == 0 ? i2(view) : j2(view);
        int i6 = this.R;
        if (i6 > 0) {
            iI2 = Math.min(iI2, i6);
        }
        int i7 = this.Y;
        int i8 = i7 & 112;
        int absoluteGravity = (this.E & 786432) != 0 ? Gravity.getAbsoluteGravity(i7 & 8388615, 1) : i7 & 7;
        int i9 = this.w;
        if ((i9 != 0 || i8 != 48) && (i9 != 1 || absoluteGravity != 3)) {
            if ((i9 == 0 && i8 == 80) || (i9 == 1 && absoluteGravity == 5)) {
                iW2 = w2(i2) - iI2;
            } else if ((i9 == 0 && i8 == 16) || (i9 == 1 && absoluteGravity == 1)) {
                iW2 = (w2(i2) - iI2) / 2;
            }
            i5 += iW2;
        }
        int i10 = iI2 + i5;
        if (this.w != 0) {
            int i11 = i5;
            i5 = i3;
            i3 = i11;
            i10 = i4;
            i4 = i10;
        }
        e eVar = (e) view.getLayoutParams();
        C0(view, i3, i5, i4, i10);
        Rect rect = s;
        super.R(view, rect);
        eVar.w(i3 - rect.left, i5 - rect.top, rect.right - i4, rect.bottom - i10);
        l4(view);
    }

    public void e4(int i2) {
        int i3 = this.w;
        this.V = i2;
        if (i3 == 1) {
            this.W = i2;
        } else {
            this.X = i2;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void f1(Parcelable parcelable) {
        if (parcelable instanceof h) {
            h hVar = (h) parcelable;
            this.I = hVar.f2849b;
            this.M = 0;
            this.i0.f(hVar.f2850c);
            this.E |= 256;
            w1();
        }
    }

    public final int f2(int i2, View view, View view2) {
        int iD2 = D2(view, view2);
        if (iD2 == 0) {
            return i2;
        }
        e eVar = (e) view.getLayoutParams();
        return i2 + (eVar.h()[iD2] - eVar.h()[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f3() {
        /*
            r5 = this;
            androidx.recyclerview.widget.RecyclerView$b0 r0 = r5.y
            int r0 = r0.c()
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L10
            r5.I = r1
        Ld:
            r5.J = r3
            goto L1f
        L10:
            int r4 = r5.I
            if (r4 < r0) goto L18
            int r0 = r0 - r2
            r5.I = r0
            goto Ld
        L18:
            if (r4 != r1) goto L1f
            if (r0 <= 0) goto L1f
            r5.I = r3
            goto Ld
        L1f:
            androidx.recyclerview.widget.RecyclerView$b0 r0 = r5.y
            boolean r0 = r0.b()
            if (r0 != 0) goto L4f
            a.n.q.j r0 = r5.b0
            if (r0 == 0) goto L4f
            int r0 = r0.m()
            if (r0 < 0) goto L4f
            int r0 = r5.E
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 != 0) goto L4f
            a.n.q.j r0 = r5.b0
            int r0 = r0.r()
            int r1 = r5.Z
            if (r0 != r1) goto L4f
            r5.p4()
            r5.r4()
            a.n.q.j r0 = r5.b0
            int r1 = r5.W
            r0.F(r1)
            return r2
        L4f:
            int r0 = r5.E
            r0 = r0 & (-257(0xfffffffffffffeff, float:NaN))
            r5.E = r0
            a.n.q.j r0 = r5.b0
            r1 = 262144(0x40000, float:3.67342E-40)
            if (r0 == 0) goto L73
            int r4 = r5.Z
            int r0 = r0.r()
            if (r4 != r0) goto L73
            int r0 = r5.E
            r0 = r0 & r1
            if (r0 == 0) goto L6a
            r0 = 1
            goto L6b
        L6a:
            r0 = 0
        L6b:
            a.n.q.j r4 = r5.b0
            boolean r4 = r4.u()
            if (r0 == r4) goto L8c
        L73:
            int r0 = r5.Z
            a.n.q.j r0 = a.n.q.j.g(r0)
            r5.b0 = r0
            a.n.q.j$b r4 = r5.l0
            r0.D(r4)
            a.n.q.j r0 = r5.b0
            int r4 = r5.E
            r1 = r1 & r4
            if (r1 == 0) goto L88
            goto L89
        L88:
            r2 = 0
        L89:
            r0.E(r2)
        L8c:
            r5.a3()
            r5.r4()
            a.n.q.j r0 = r5.b0
            int r1 = r5.W
            r0.F(r1)
            androidx.recyclerview.widget.RecyclerView$w r0 = r5.D
            r5.x(r0)
            a.n.q.j r0 = r5.b0
            r0.A()
            a.n.q.e1 r0 = r5.d0
            a.n.q.e1$a r0 = r0.a()
            r0.n()
            a.n.q.e1 r0 = r5.d0
            a.n.q.e1$a r0 = r0.a()
            r0.m()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: a.n.q.k.f3():boolean");
    }

    public void f4(int i2) {
        this.d0.a().y(i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public Parcelable g1() {
        h hVar = new h();
        hVar.f2849b = A2();
        Bundle bundleI = this.i0.i();
        int iL = L();
        for (int i2 = 0; i2 < iL; i2++) {
            View viewK = K(i2);
            int iE2 = e2(viewK);
            if (iE2 != -1) {
                bundleI = this.i0.k(bundleI, viewK, iE2);
            }
        }
        hVar.f2850c = bundleI;
        return hVar;
    }

    public final boolean g2(View view, View view2, int[] iArr) {
        int iV2 = v2(view);
        if (view2 != null) {
            iV2 = f2(iV2, view, view2);
        }
        int iZ2 = z2(view);
        int i2 = iV2 + this.N;
        if (i2 == 0 && iZ2 == 0) {
            iArr[0] = 0;
            iArr[1] = 0;
            return false;
        }
        iArr[0] = i2;
        iArr[1] = iZ2;
        return true;
    }

    public final void g3() {
        this.D = null;
        this.y = null;
        this.z = 0;
        this.A = 0;
    }

    public void g4(int i2) {
        this.d0.a().z(i2);
    }

    public int h2(RecyclerView recyclerView, int i2, int i3) {
        int iIndexOfChild;
        View viewE = E(this.I);
        return (viewE != null && i3 >= (iIndexOfChild = recyclerView.indexOfChild(viewE))) ? i3 < i2 + (-1) ? ((iIndexOfChild + i2) - 1) - i3 : iIndexOfChild : i3;
    }

    public void h3(View view) {
        int childMeasureSpec;
        int childMeasureSpec2;
        e eVar = (e) view.getLayoutParams();
        Rect rect = s;
        k(view, rect);
        int i2 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin + rect.left + rect.right;
        int i3 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin + rect.top + rect.bottom;
        int iMakeMeasureSpec = this.Q == -2 ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(this.R, 1073741824);
        int i4 = this.w;
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        if (i4 == 0) {
            childMeasureSpec = ViewGroup.getChildMeasureSpec(iMakeMeasureSpec2, i2, ((ViewGroup.MarginLayoutParams) eVar).width);
            childMeasureSpec2 = ViewGroup.getChildMeasureSpec(iMakeMeasureSpec, i3, ((ViewGroup.MarginLayoutParams) eVar).height);
        } else {
            int childMeasureSpec3 = ViewGroup.getChildMeasureSpec(iMakeMeasureSpec2, i3, ((ViewGroup.MarginLayoutParams) eVar).height);
            childMeasureSpec = ViewGroup.getChildMeasureSpec(iMakeMeasureSpec, i2, ((ViewGroup.MarginLayoutParams) eVar).width);
            childMeasureSpec2 = childMeasureSpec3;
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public void h4(float f2) {
        this.d0.a().A(f2);
    }

    public int i2(View view) {
        e eVar = (e) view.getLayoutParams();
        return T(view) + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
    }

    public final void i3(int i2, int i3, int i4, int[] iArr) {
        View viewO = this.D.o(i2);
        if (viewO != null) {
            e eVar = (e) viewO.getLayoutParams();
            Rect rect = s;
            k(viewO, rect);
            viewO.measure(ViewGroup.getChildMeasureSpec(i3, g0() + h0() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin + rect.left + rect.right, ((ViewGroup.MarginLayoutParams) eVar).width), ViewGroup.getChildMeasureSpec(i4, i0() + f0() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin + rect.top + rect.bottom, ((ViewGroup.MarginLayoutParams) eVar).height));
            iArr[0] = j2(viewO);
            iArr[1] = i2(viewO);
            this.D.B(viewO);
        }
    }

    public void i4() {
        d dVar = this.K;
        if (dVar != null) {
            dVar.q = true;
        }
    }

    public int j2(View view) {
        e eVar = (e) view.getLayoutParams();
        return U(view) + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
    }

    public final void j3(int i2) {
        int iL = L();
        int i3 = 0;
        if (this.w == 1) {
            while (i3 < iL) {
                K(i3).offsetTopAndBottom(i2);
                i3++;
            }
        } else {
            while (i3 < iL) {
                K(i3).offsetLeftAndRight(i2);
                i3++;
            }
        }
    }

    public int j4(int i2) {
        c cVar = new c();
        cVar.p(i2);
        N1(cVar);
        return cVar.f();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    @Override // androidx.recyclerview.widget.RecyclerView.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean k1(androidx.recyclerview.widget.RecyclerView.w r5, androidx.recyclerview.widget.RecyclerView.b0 r6, int r7, android.os.Bundle r8) {
        /*
            r4 = this;
            boolean r8 = r4.c3()
            r0 = 1
            if (r8 != 0) goto L8
            return r0
        L8:
            r4.v3(r5, r6)
            int r5 = r4.E
            r6 = 262144(0x40000, float:3.67342E-40)
            r5 = r5 & r6
            r6 = 0
            if (r5 == 0) goto L15
            r5 = 1
            goto L16
        L15:
            r5 = 0
        L16:
            int r8 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            r2 = 8192(0x2000, float:1.148E-41)
            r3 = 4096(0x1000, float:5.74E-42)
            if (r8 < r1) goto L51
            int r8 = r4.w
            if (r8 != 0) goto L3f
            a.i.r.g0.c$a r8 = a.i.r.g0.c.a.z
            int r8 = r8.b()
            if (r7 != r8) goto L34
            if (r5 == 0) goto L31
        L2e:
            r7 = 4096(0x1000, float:5.74E-42)
            goto L51
        L31:
            r7 = 8192(0x2000, float:1.148E-41)
            goto L51
        L34:
            a.i.r.g0.c$a r8 = a.i.r.g0.c.a.B
            int r8 = r8.b()
            if (r7 != r8) goto L51
            if (r5 == 0) goto L2e
            goto L31
        L3f:
            a.i.r.g0.c$a r5 = a.i.r.g0.c.a.y
            int r5 = r5.b()
            if (r7 != r5) goto L48
            goto L31
        L48:
            a.i.r.g0.c$a r5 = a.i.r.g0.c.a.A
            int r5 = r5.b()
            if (r7 != r5) goto L51
            goto L2e
        L51:
            if (r7 == r3) goto L5e
            if (r7 == r2) goto L56
            goto L64
        L56:
            r4.q3(r6)
            r5 = -1
            r4.s3(r6, r5)
            goto L64
        L5e:
            r4.q3(r0)
            r4.s3(r6, r0)
        L64:
            r4.g3()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.n.q.k.k1(androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$b0, int, android.os.Bundle):boolean");
    }

    public int k2() {
        return this.g0;
    }

    public final void k3(int i2) {
        int iL = L();
        int i3 = 0;
        if (this.w == 0) {
            while (i3 < iL) {
                K(i3).offsetTopAndBottom(i2);
                i3++;
            }
        } else {
            while (i3 < iL) {
                K(i3).offsetLeftAndRight(i2);
                i3++;
            }
        }
    }

    public final void k4() {
        int iL = L();
        for (int i2 = 0; i2 < iL; i2++) {
            l4(K(i2));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean l() {
        return this.w == 0 || this.Z > 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <E> E l2(RecyclerView.e0 e0Var, Class<? extends E> cls) {
        a.n.q.f fVar;
        a.n.q.e eVarD;
        E e2 = e0Var instanceof a.n.q.e ? (E) ((a.n.q.e) e0Var).a(cls) : null;
        return (e2 != null || (fVar = this.j0) == null || (eVarD = fVar.d(e0Var.q())) == null) ? e2 : (E) eVarD.a(cls);
    }

    public void l3(RecyclerView.e0 e0Var) {
        int iN = e0Var.n();
        if (iN != -1) {
            this.i0.j(e0Var.f4855b, iN);
        }
    }

    public final void l4(View view) {
        e eVar = (e) view.getLayoutParams();
        if (eVar.k() == null) {
            eVar.t(this.e0.f2874c.j(view));
        } else {
            eVar.g(this.w, view);
            if (this.w != 0) {
                eVar.t(this.e0.f2874c.j(view));
                return;
            }
        }
        eVar.u(this.e0.f2873b.j(view));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean m() {
        return this.w == 1 || this.Z > 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int m0(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        j jVar;
        return (this.w != 0 || (jVar = this.b0) == null) ? super.m0(wVar, b0Var) : jVar.r();
    }

    public int m2() {
        return this.c0;
    }

    public void m3(boolean z, int i2, Rect rect) {
        if (!z) {
            return;
        }
        int i3 = this.I;
        while (true) {
            View viewE = E(i3);
            if (viewE == null) {
                return;
            }
            if (viewE.getVisibility() == 0 && viewE.hasFocusable()) {
                viewE.requestFocus();
                return;
            }
            i3++;
        }
    }

    public void m4() {
        int iM = 0;
        if (L() > 0) {
            iM = this.b0.m() - ((e) K(0).getLayoutParams()).b();
        }
        this.z = iM;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void n1(RecyclerView.w wVar) {
        for (int iL = L() - 1; iL >= 0; iL--) {
            q1(iL, wVar);
        }
    }

    public int n2() {
        return this.U;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void n3(int r6) {
        /*
            r5 = this;
            int r0 = r5.w
            r1 = 0
            r2 = 1
            if (r0 != 0) goto Ld
            if (r6 != r2) goto Lb
            r0 = 262144(0x40000, float:3.67342E-40)
            goto L11
        Lb:
            r0 = 0
            goto L11
        Ld:
            if (r6 != r2) goto Lb
            r0 = 524288(0x80000, float:7.34684E-40)
        L11:
            int r3 = r5.E
            r4 = 786432(0xc0000, float:1.102026E-39)
            r4 = r4 & r3
            if (r4 != r0) goto L19
            return
        L19:
            r4 = -786433(0xfffffffffff3ffff, float:NaN)
            r3 = r3 & r4
            r0 = r0 | r3
            r5.E = r0
            r0 = r0 | 256(0x100, float:3.59E-43)
            r5.E = r0
            a.n.q.e1 r0 = r5.d0
            a.n.q.e1$a r0 = r0.f2761c
            if (r6 != r2) goto L2b
            r1 = 1
        L2b:
            r0.w(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.n.q.k.n3(int):void");
    }

    public void n4() {
        j.a aVarQ;
        this.B.clear();
        int iL = L();
        for (int i2 = 0; i2 < iL; i2++) {
            int iS = this.v.i0(K(i2)).s();
            if (iS >= 0 && (aVarQ = this.b0.q(iS)) != null) {
                this.B.put(iS, aVarQ.f2834a);
            }
        }
    }

    public int o2() {
        return this.e0.a().b();
    }

    public final boolean o3() {
        return this.b0.v();
    }

    public final void o4() {
        int i2 = (this.E & (-1025)) | (r3(false) ? 1024 : 0);
        this.E = i2;
        if ((i2 & 1024) != 0) {
            c2();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void p(int i2, int i3, RecyclerView.b0 b0Var, RecyclerView.p.c cVar) {
        try {
            v3(null, b0Var);
            if (this.w != 0) {
                i2 = i3;
            }
            if (L() != 0 && i2 != 0) {
                this.b0.f(i2 < 0 ? -this.g0 : this.f0 + this.g0, i2, cVar);
            }
        } finally {
            g3();
        }
    }

    public float p2() {
        return this.e0.a().c();
    }

    public final void p3() {
        this.b0.w((this.E & 262144) != 0 ? this.f0 + this.g0 + this.A : (-this.g0) - this.A);
    }

    public final void p4() {
        this.d0.f2761c.x(q0());
        this.d0.f2760b.x(Y());
        this.d0.f2761c.t(g0(), h0());
        this.d0.f2760b.t(i0(), f0());
        this.f0 = this.d0.a().i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void q(int i2, RecyclerView.p.c cVar) {
        int i3 = this.v.a1;
        if (i2 == 0 || i3 == 0) {
            return;
        }
        int iMax = Math.max(0, Math.min(this.I - ((i3 - 1) / 2), i2 - i3));
        for (int i4 = iMax; i4 < i2 && i4 < iMax + i3; i4++) {
            cVar.a(i4, 0);
        }
    }

    public int q2() {
        return this.e0.a().d();
    }

    public final void q3(boolean z) {
        if (z) {
            if (X2()) {
                return;
            }
        } else if (W2()) {
            return;
        }
        g gVar = this.L;
        if (gVar == null) {
            this.v.A1();
            g gVar2 = new g(z ? 1 : -1, this.Z > 1);
            this.M = 0;
            N1(gVar2);
            return;
        }
        if (z) {
            gVar.H();
        } else {
            gVar.G();
        }
    }

    public void q4() {
        int iM;
        int iP;
        int iC;
        int iC2;
        int iH2;
        int iH22;
        if (this.y.c() == 0) {
            return;
        }
        if ((this.E & 262144) == 0) {
            iM = this.b0.p();
            iC2 = this.y.c() - 1;
            iP = this.b0.m();
            iC = 0;
        } else {
            iM = this.b0.m();
            iP = this.b0.p();
            iC = this.y.c() - 1;
            iC2 = 0;
        }
        if (iM < 0 || iP < 0) {
            return;
        }
        boolean z = iM == iC2;
        boolean z2 = iP == iC;
        if (z || !this.d0.a().o() || z2 || !this.d0.a().p()) {
            int iJ = Integer.MAX_VALUE;
            if (z) {
                iJ = this.b0.j(true, t);
                View viewE = E(t[1]);
                iH2 = H2(viewE);
                int[] iArrH = ((e) viewE.getLayoutParams()).h();
                if (iArrH != null && iArrH.length > 0) {
                    iH2 += iArrH[iArrH.length - 1] - iArrH[0];
                }
            } else {
                iH2 = Integer.MAX_VALUE;
            }
            int iL = Integer.MIN_VALUE;
            if (z2) {
                iL = this.b0.l(false, t);
                iH22 = H2(E(t[1]));
            } else {
                iH22 = Integer.MIN_VALUE;
            }
            this.d0.a().B(iL, iJ, iH22, iH2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001b A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0023 A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int r2(int r10) {
        /*
            r9 = this;
            int r0 = r9.w
            r1 = 130(0x82, float:1.82E-43)
            r2 = 66
            r3 = 33
            r4 = 0
            r5 = 3
            r6 = 2
            r7 = 17
            r8 = 1
            if (r0 != 0) goto L2b
            r0 = 262144(0x40000, float:3.67342E-40)
            if (r10 == r7) goto L25
            if (r10 == r3) goto L23
            if (r10 == r2) goto L1d
            if (r10 == r1) goto L1b
            goto L46
        L1b:
            r4 = 3
            goto L48
        L1d:
            int r10 = r9.E
            r10 = r10 & r0
            if (r10 != 0) goto L48
            goto L38
        L23:
            r4 = 2
            goto L48
        L25:
            int r10 = r9.E
            r10 = r10 & r0
            if (r10 != 0) goto L38
            goto L48
        L2b:
            if (r0 != r8) goto L46
            r0 = 524288(0x80000, float:7.34684E-40)
            if (r10 == r7) goto L40
            if (r10 == r3) goto L48
            if (r10 == r2) goto L3a
            if (r10 == r1) goto L38
            goto L46
        L38:
            r4 = 1
            goto L48
        L3a:
            int r10 = r9.E
            r10 = r10 & r0
            if (r10 != 0) goto L23
            goto L1b
        L40:
            int r10 = r9.E
            r10 = r10 & r0
            if (r10 != 0) goto L1b
            goto L23
        L46:
            r4 = 17
        L48:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: a.n.q.k.r2(int):int");
    }

    public final boolean r3(boolean z) {
        if (this.R != 0 || this.S == null) {
            return false;
        }
        j jVar = this.b0;
        a.f.d[] dVarArrN = jVar == null ? null : jVar.n();
        boolean z2 = false;
        int i2 = -1;
        for (int i3 = 0; i3 < this.Z; i3++) {
            a.f.d dVar = dVarArrN == null ? null : dVarArrN[i3];
            int iG = dVar == null ? 0 : dVar.g();
            int i4 = -1;
            for (int i5 = 0; i5 < iG; i5 += 2) {
                int iD = dVar.d(i5 + 1);
                for (int iD2 = dVar.d(i5); iD2 <= iD; iD2++) {
                    View viewE = E(iD2 - this.z);
                    if (viewE != null) {
                        if (z) {
                            h3(viewE);
                        }
                        int iI2 = this.w == 0 ? i2(viewE) : j2(viewE);
                        if (iI2 > i4) {
                            i4 = iI2;
                        }
                    }
                }
            }
            int iC = this.y.c();
            if (!this.v.p0() && z && i4 < 0 && iC > 0) {
                if (i2 < 0) {
                    int i6 = this.I;
                    if (i6 < 0) {
                        i6 = 0;
                    } else if (i6 >= iC) {
                        i6 = iC - 1;
                    }
                    if (L() > 0) {
                        int iR = this.v.i0(K(0)).r();
                        int iR2 = this.v.i0(K(L() - 1)).r();
                        if (i6 >= iR && i6 <= iR2) {
                            i6 = i6 - iR <= iR2 - i6 ? iR - 1 : iR2 + 1;
                            if (i6 < 0 && iR2 < iC - 1) {
                                i6 = iR2 + 1;
                            } else if (i6 >= iC && iR > 0) {
                                i6 = iR - 1;
                            }
                        }
                    }
                    if (i6 >= 0 && i6 < iC) {
                        i3(i6, View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0), this.h0);
                        i2 = this.w == 0 ? this.h0[1] : this.h0[0];
                    }
                }
                if (i2 >= 0) {
                    i4 = i2;
                }
            }
            if (i4 < 0) {
                i4 = 0;
            }
            int[] iArr = this.S;
            if (iArr[i3] != i4) {
                iArr[i3] = i4;
                z2 = true;
            }
        }
        return z2;
    }

    public final void r4() {
        e1.a aVarC = this.d0.c();
        int iG = aVarC.g() - this.P;
        int iB2 = B2() + iG;
        aVarC.B(iG, iB2, iG, iB2);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean s2(android.view.View r13, int[] r14) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.n.q.k.s2(android.view.View, int[]):boolean");
    }

    public int s3(boolean z, int i2) {
        j jVar = this.b0;
        if (jVar == null) {
            return i2;
        }
        int i3 = this.I;
        int iS = i3 != -1 ? jVar.s(i3) : -1;
        View view = null;
        int iL = L();
        for (int i4 = 0; i4 < iL && i2 != 0; i4++) {
            int i5 = i2 > 0 ? i4 : (iL - 1) - i4;
            View viewK = K(i5);
            if (S1(viewK)) {
                int iD2 = d2(i5);
                int iS2 = this.b0.s(iD2);
                if (iS == -1) {
                    i3 = iD2;
                    view = viewK;
                    iS = iS2;
                } else if (iS2 == iS && ((i2 > 0 && iD2 > i3) || (i2 < 0 && iD2 < i3))) {
                    i2 = i2 > 0 ? i2 - 1 : i2 + 1;
                    i3 = iD2;
                    view = viewK;
                }
            }
        }
        if (view != null) {
            if (z) {
                if (t0()) {
                    this.E |= 32;
                    view.requestFocus();
                    this.E &= -33;
                }
                this.I = i3;
                this.J = 0;
            } else {
                C3(view, true);
            }
        }
        return i2;
    }

    public final int t2(View view) {
        return ((e) view.getLayoutParams()).m(view);
    }

    public final void t3() {
        int i2 = this.E;
        if ((65600 & i2) == 65536) {
            this.b0.y(this.I, (i2 & 262144) != 0 ? -this.g0 : this.f0 + this.g0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean u1(RecyclerView recyclerView, View view, Rect rect, boolean z) {
        return false;
    }

    public final int u2(View view) {
        return ((e) view.getLayoutParams()).o(view);
    }

    public final void u3() {
        int i2 = this.E;
        if ((65600 & i2) == 65536) {
            this.b0.z(this.I, (i2 & 262144) != 0 ? this.f0 + this.g0 : -this.g0);
        }
    }

    public final int v2(View view) {
        return this.d0.a().h(H2(view));
    }

    public final void v3(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (this.D != null || this.y != null) {
            Log.e("GridLayoutManager", "Recycler information was not released, bug!");
        }
        this.D = wVar;
        this.y = b0Var;
        this.z = 0;
        this.A = 0;
    }

    public final int w2(int i2) {
        int i3 = this.R;
        if (i3 != 0) {
            return i3;
        }
        int[] iArr = this.S;
        if (iArr == null) {
            return 0;
        }
        return iArr[i2];
    }

    public final int w3(int i2) {
        int iE;
        int i3 = this.E;
        if ((i3 & 64) == 0 && (i3 & 3) != 1 && (i2 <= 0 ? !(i2 >= 0 || this.d0.a().p() || i2 >= (iE = this.d0.a().e())) : !(this.d0.a().o() || i2 <= (iE = this.d0.a().d())))) {
            i2 = iE;
        }
        if (i2 == 0) {
            return 0;
        }
        j3(-i2);
        if ((this.E & 3) == 1) {
            q4();
            return i2;
        }
        int iL = L();
        if ((this.E & 262144) == 0 ? i2 >= 0 : i2 <= 0) {
            R1();
        } else {
            p3();
        }
        boolean z = L() > iL;
        int iL2 = L();
        if ((262144 & this.E) == 0 ? i2 >= 0 : i2 <= 0) {
            u3();
        } else {
            t3();
        }
        if (z | (L() < iL2)) {
            o4();
        }
        this.v.invalidate();
        q4();
        return i2;
    }

    public int x2(int i2) {
        int iW2 = 0;
        if ((this.E & 524288) != 0) {
            for (int i3 = this.Z - 1; i3 > i2; i3--) {
                iW2 += w2(i3) + this.X;
            }
            return iW2;
        }
        int iW22 = 0;
        while (iW2 < i2) {
            iW22 += w2(iW2) + this.X;
            iW2++;
        }
        return iW22;
    }

    public final int x3(int i2) {
        if (i2 == 0) {
            return 0;
        }
        k3(-i2);
        this.P += i2;
        r4();
        this.v.invalidate();
        return i2;
    }

    public boolean y2(View view, View view2, int[] iArr) {
        int i2 = this.c0;
        return (i2 == 1 || i2 == 2) ? s2(view, iArr) : g2(view, view2, iArr);
    }

    public final void y3(int i2, int i3, boolean z) {
        if ((this.E & 3) == 1) {
            w3(i2);
            x3(i3);
            return;
        }
        if (this.w != 0) {
            i3 = i2;
            i2 = i3;
        }
        if (z) {
            this.v.r1(i2, i3);
        } else {
            this.v.scrollBy(i2, i3);
            V1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int z1(int i2, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if ((this.E & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) == 0 || !Y2()) {
            return 0;
        }
        v3(wVar, b0Var);
        this.E = (this.E & (-4)) | 2;
        int iW3 = this.w == 0 ? w3(i2) : x3(i2);
        g3();
        this.E &= -4;
        return iW3;
    }

    public final int z2(View view) {
        return this.d0.c().h(I2(view));
    }

    public void z3(int i2, int i3, boolean z, int i4) {
        this.N = i4;
        View viewE = E(i2);
        boolean z2 = !A0();
        if (!z2 || this.v.isLayoutRequested() || viewE == null || e2(viewE) != i2) {
            int i5 = this.E;
            if ((i5 & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) == 0 || (i5 & 64) != 0) {
                this.I = i2;
                this.J = i3;
                this.M = Integer.MIN_VALUE;
                return;
            }
            if (z && !this.v.isLayoutRequested()) {
                this.I = i2;
                this.J = i3;
                this.M = Integer.MIN_VALUE;
                if (!Y2()) {
                    Log.w(F2(), "setSelectionSmooth should not be called before first layout pass");
                    return;
                }
                int iJ4 = j4(i2);
                if (iJ4 != this.I) {
                    this.I = iJ4;
                    this.J = 0;
                    return;
                }
                return;
            }
            if (!z2) {
                i4();
                this.v.A1();
            }
            if (this.v.isLayoutRequested() || viewE == null || e2(viewE) != i2) {
                this.I = i2;
                this.J = i3;
                this.M = Integer.MIN_VALUE;
                this.E |= 256;
                w1();
                return;
            }
        }
        this.E |= 32;
        C3(viewE, z);
        this.E &= -33;
    }
}
