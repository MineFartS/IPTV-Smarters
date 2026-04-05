package c.f.a.b.h3;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c.f.a.b.a2;
import c.f.a.b.b2;
import c.f.a.b.c2;
import c.f.a.b.g3.f;
import c.f.a.b.g3.j;
import c.f.a.b.h3.e1;
import c.f.a.b.i1;
import c.f.a.b.k1;
import c.f.a.b.p1;
import c.f.a.b.p2;
import c.f.a.b.q1;
import c.f.a.b.x1;
import c.f.a.b.z1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class a1 extends FrameLayout {
    public final String A;
    public ImageView A0;
    public final Drawable B;
    public ImageView B0;
    public final Drawable C;
    public ImageView C0;
    public final float D;
    public View D0;
    public final float E;
    public View E0;
    public final String F;
    public View F0;
    public final String G;
    public final Drawable H;
    public final Drawable I;
    public final String J;
    public final String K;
    public final Drawable L;
    public final Drawable M;
    public final String N;
    public final String O;
    public a2 P;
    public c.f.a.b.x0 Q;
    public f R;
    public d S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f8573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList<m> f8574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f8575d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final View f8576e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View f8577f;
    public boolean f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f8578g;
    public int g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final View f8579h;
    public int h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f8580i;
    public int i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f8581j;
    public long[] j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ImageView f8582k;
    public boolean[] k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ImageView f8583l;
    public long[] l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final View f8584m;
    public boolean[] m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TextView f8585n;
    public long n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TextView f8586o;
    public b1 o0;
    public final e1 p;
    public Resources p0;
    public final StringBuilder q;
    public RecyclerView q0;
    public final Formatter r;
    public h r0;
    public final p2.b s;
    public e s0;
    public final p2.c t;
    public PopupWindow t0;
    public final Runnable u;
    public boolean u0;
    public final Drawable v;
    public int v0;
    public final Drawable w;
    public c.f.a.b.g3.f w0;
    public final Drawable x;
    public l x0;
    public final String y;
    public l y0;
    public final String z;
    public f1 z0;

    public final class b extends l {
        public b() {
            super();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ void n0(View view) {
            if (a1.this.w0 != null) {
                f.e eVarH = a1.this.w0.s().h();
                for (int i2 = 0; i2 < this.f8603e.size(); i2++) {
                    eVarH = eVarH.Q(this.f8603e.get(i2).intValue());
                }
                ((c.f.a.b.g3.f) c.f.a.b.j3.g.e(a1.this.w0)).K(eVarH);
            }
            a1.this.r0.c0(1, a1.this.getResources().getString(w0.A));
            a1.this.t0.dismiss();
        }

        @Override // c.f.a.b.h3.a1.l
        public void Z(List<Integer> list, List<k> list2, j.a aVar) {
            boolean z;
            h hVar;
            String string;
            Resources resources;
            int i2;
            int i3 = 0;
            while (true) {
                if (i3 >= list.size()) {
                    z = false;
                    break;
                }
                int iIntValue = list.get(i3).intValue();
                c.f.a.b.e3.a1 a1VarG = aVar.g(iIntValue);
                if (a1.this.w0 != null && a1.this.w0.s().m(iIntValue, a1VarG)) {
                    z = true;
                    break;
                }
                i3++;
            }
            if (list2.isEmpty()) {
                hVar = a1.this.r0;
                resources = a1.this.getResources();
                i2 = w0.B;
            } else {
                if (z) {
                    for (int i4 = 0; i4 < list2.size(); i4++) {
                        k kVar = list2.get(i4);
                        if (kVar.f8602e) {
                            hVar = a1.this.r0;
                            string = kVar.f8601d;
                            hVar.c0(1, string);
                            break;
                        }
                    }
                    this.f8603e = list;
                    this.f8604f = list2;
                    this.f8605g = aVar;
                }
                hVar = a1.this.r0;
                resources = a1.this.getResources();
                i2 = w0.A;
            }
            string = resources.getString(i2);
            hVar.c0(1, string);
            this.f8603e = list;
            this.f8604f = list2;
            this.f8605g = aVar;
        }

        @Override // c.f.a.b.h3.a1.l
        public void h0(i iVar) {
            boolean z;
            iVar.u.setText(w0.A);
            f.d dVarS = ((c.f.a.b.g3.f) c.f.a.b.j3.g.e(a1.this.w0)).s();
            int i2 = 0;
            while (true) {
                if (i2 >= this.f8603e.size()) {
                    z = false;
                    break;
                }
                int iIntValue = this.f8603e.get(i2).intValue();
                if (dVarS.m(iIntValue, ((j.a) c.f.a.b.j3.g.e(this.f8605g)).g(iIntValue))) {
                    z = true;
                    break;
                }
                i2++;
            }
            iVar.v.setVisibility(z ? 4 : 0);
            iVar.f4855b.setOnClickListener(new View.OnClickListener() { // from class: c.f.a.b.h3.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f8660b.n0(view);
                }
            });
        }

        @Override // c.f.a.b.h3.a1.l
        public void l0(String str) {
            a1.this.r0.c0(1, str);
        }
    }

    public final class c implements a2.e, e1.a, View.OnClickListener, PopupWindow.OnDismissListener {
        public c() {
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void C(boolean z) {
            c2.u(this, z);
        }

        @Override // c.f.a.b.b3.f
        public /* synthetic */ void D(c.f.a.b.b3.a aVar) {
            c2.k(this, aVar);
        }

        @Override // c.f.a.b.a2.c
        public void E(a2 a2Var, a2.d dVar) {
            if (dVar.b(5, 6)) {
                a1.this.A0();
            }
            if (dVar.b(5, 6, 8)) {
                a1.this.C0();
            }
            if (dVar.a(9)) {
                a1.this.D0();
            }
            if (dVar.a(10)) {
                a1.this.G0();
            }
            if (dVar.b(9, 10, 12, 0, 17, 18)) {
                a1.this.z0();
            }
            if (dVar.b(12, 0)) {
                a1.this.H0();
            }
            if (dVar.a(13)) {
                a1.this.B0();
            }
            if (dVar.a(2)) {
                a1.this.I0();
            }
        }

        @Override // c.f.a.b.w2.c
        public /* synthetic */ void G(int i2, boolean z) {
            c2.e(this, i2, z);
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void H(boolean z, int i2) {
            b2.k(this, z, i2);
        }

        @Override // c.f.a.b.t2.r
        public /* synthetic */ void J(c.f.a.b.t2.p pVar) {
            c2.a(this, pVar);
        }

        @Override // c.f.a.b.k3.b0
        public /* synthetic */ void L(int i2, int i3, int i4, float f2) {
            c.f.a.b.k3.a0.a(this, i2, i3, i4, f2);
        }

        @Override // c.f.a.b.k3.b0
        public /* synthetic */ void N() {
            c2.s(this);
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void O(p1 p1Var, int i2) {
            c2.i(this, p1Var, i2);
        }

        @Override // c.f.a.b.f3.l
        public /* synthetic */ void Q(List list) {
            c2.c(this, list);
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void Z(boolean z, int i2) {
            c2.l(this, z, i2);
        }

        @Override // c.f.a.b.t2.r
        public /* synthetic */ void a(boolean z) {
            c2.v(this, z);
        }

        @Override // c.f.a.b.k3.b0
        public /* synthetic */ void b(c.f.a.b.k3.e0 e0Var) {
            c2.z(this, e0Var);
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void b0(c.f.a.b.e3.a1 a1Var, c.f.a.b.g3.l lVar) {
            c2.y(this, a1Var, lVar);
        }

        @Override // c.f.a.b.h3.e1.a
        public void c(e1 e1Var, long j2) {
            if (a1.this.f8586o != null) {
                a1.this.f8586o.setText(c.f.a.b.j3.x0.f0(a1.this.q, a1.this.r, j2));
            }
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void d(z1 z1Var) {
            c2.m(this, z1Var);
        }

        @Override // c.f.a.b.k3.b0
        public /* synthetic */ void d0(int i2, int i3) {
            c2.w(this, i2, i3);
        }

        @Override // c.f.a.b.h3.e1.a
        public void e(e1 e1Var, long j2, boolean z) {
            a1.this.f0 = false;
            if (!z && a1.this.P != null) {
                a1 a1Var = a1.this;
                a1Var.r0(a1Var.P, j2);
            }
            a1.this.o0.W();
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void f(a2.f fVar, a2.f fVar2, int i2) {
            c2.r(this, fVar, fVar2, i2);
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void g(int i2) {
            c2.o(this, i2);
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void h(boolean z) {
            b2.d(this, z);
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void h0(x1 x1Var) {
            c2.q(this, x1Var);
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void i(int i2) {
            b2.l(this, i2);
        }

        @Override // c.f.a.b.h3.e1.a
        public void j(e1 e1Var, long j2) {
            a1.this.f0 = true;
            if (a1.this.f8586o != null) {
                a1.this.f8586o.setText(c.f.a.b.j3.x0.f0(a1.this.q, a1.this.r, j2));
            }
            a1.this.o0.V();
        }

        @Override // c.f.a.b.w2.c
        public /* synthetic */ void k0(c.f.a.b.w2.b bVar) {
            c2.d(this, bVar);
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void l(List list) {
            b2.q(this, list);
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void m0(boolean z) {
            c2.h(this, z);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a1 a1Var;
            RecyclerView.h hVar;
            a2 a2Var = a1.this.P;
            if (a2Var == null) {
                return;
            }
            a1.this.o0.W();
            if (a1.this.f8576e == view) {
                a1.this.Q.j(a2Var);
                return;
            }
            if (a1.this.f8575d == view) {
                a1.this.Q.i(a2Var);
                return;
            }
            if (a1.this.f8578g == view) {
                if (a2Var.getPlaybackState() != 4) {
                    a1.this.Q.c(a2Var);
                    return;
                }
                return;
            }
            if (a1.this.f8579h == view) {
                a1.this.Q.e(a2Var);
                return;
            }
            if (a1.this.f8577f == view) {
                a1.this.W(a2Var);
                return;
            }
            if (a1.this.f8582k == view) {
                a1.this.Q.b(a2Var, c.f.a.b.j3.l0.a(a2Var.getRepeatMode(), a1.this.i0));
                return;
            }
            if (a1.this.f8583l == view) {
                a1.this.Q.g(a2Var, !a2Var.I());
                return;
            }
            if (a1.this.D0 == view) {
                a1.this.o0.V();
                a1Var = a1.this;
                hVar = a1Var.r0;
            } else if (a1.this.E0 == view) {
                a1.this.o0.V();
                a1Var = a1.this;
                hVar = a1Var.s0;
            } else if (a1.this.F0 == view) {
                a1.this.o0.V();
                a1Var = a1.this;
                hVar = a1Var.y0;
            } else {
                if (a1.this.A0 != view) {
                    return;
                }
                a1.this.o0.V();
                a1Var = a1.this;
                hVar = a1Var.x0;
            }
            a1Var.X(hVar);
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            if (a1.this.u0) {
                a1.this.o0.W();
            }
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void onRepeatModeChanged(int i2) {
            c2.t(this, i2);
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void p(boolean z) {
            c2.g(this, z);
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void r() {
            b2.o(this);
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void s(x1 x1Var) {
            c2.p(this, x1Var);
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void t(a2.b bVar) {
            c2.b(this, bVar);
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void v(p2 p2Var, int i2) {
            c2.x(this, p2Var, i2);
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void x(int i2) {
            c2.n(this, i2);
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void z(q1 q1Var) {
            c2.j(this, q1Var);
        }
    }

    public interface d {
        void a(boolean z);
    }

    public final class e extends RecyclerView.h<i> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String[] f8589e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int[] f8590f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f8591g;

        public e(String[] strArr, int[] iArr) {
            this.f8589e = strArr;
            this.f8590f = iArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ void c0(int i2, View view) {
            if (i2 != this.f8591g) {
                a1.this.setPlaybackSpeed(this.f8590f[i2] / 100.0f);
            }
            a1.this.t0.dismiss();
        }

        public String W() {
            return this.f8589e[this.f8591g];
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
        public void F(i iVar, final int i2) {
            String[] strArr = this.f8589e;
            if (i2 < strArr.length) {
                iVar.u.setText(strArr[i2]);
            }
            iVar.v.setVisibility(i2 == this.f8591g ? 0 : 4);
            iVar.f4855b.setOnClickListener(new View.OnClickListener() { // from class: c.f.a.b.h3.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f8676b.c0(i2, view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
        public i H(ViewGroup viewGroup, int i2) {
            return new i(LayoutInflater.from(a1.this.getContext()).inflate(u0.f8779h, viewGroup, false));
        }

        public void h0(float f2) {
            int iRound = Math.round(f2 * 100.0f);
            int i2 = 0;
            int i3 = 0;
            int i4 = Integer.MAX_VALUE;
            while (true) {
                int[] iArr = this.f8590f;
                if (i2 >= iArr.length) {
                    this.f8591g = i3;
                    return;
                }
                int iAbs = Math.abs(iRound - iArr[i2]);
                if (iAbs < i4) {
                    i3 = i2;
                    i4 = iAbs;
                }
                i2++;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int o() {
            return this.f8589e.length;
        }
    }

    public interface f {
        void a(long j2, long j3);
    }

    public final class g extends RecyclerView.e0 {
        public final TextView u;
        public final TextView v;
        public final ImageView w;

        public g(View view) {
            super(view);
            if (c.f.a.b.j3.x0.f9296a < 26) {
                view.setFocusable(true);
            }
            this.u = (TextView) view.findViewById(s0.u);
            this.v = (TextView) view.findViewById(s0.P);
            this.w = (ImageView) view.findViewById(s0.t);
            view.setOnClickListener(new View.OnClickListener() { // from class: c.f.a.b.h3.i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f8687b.V(view2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ void V(View view) {
            a1.this.n0(n());
        }
    }

    public class h extends RecyclerView.h<g> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String[] f8593e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String[] f8594f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Drawable[] f8595g;

        public h(String[] strArr, Drawable[] drawableArr) {
            this.f8593e = strArr;
            this.f8594f = new String[strArr.length];
            this.f8595g = drawableArr;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
        public void F(g gVar, int i2) {
            gVar.u.setText(this.f8593e[i2]);
            if (this.f8594f[i2] == null) {
                gVar.v.setVisibility(8);
            } else {
                gVar.v.setText(this.f8594f[i2]);
            }
            Drawable drawable = this.f8595g[i2];
            ImageView imageView = gVar.w;
            if (drawable == null) {
                imageView.setVisibility(8);
            } else {
                imageView.setImageDrawable(this.f8595g[i2]);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
        public g H(ViewGroup viewGroup, int i2) {
            return a1.this.new g(LayoutInflater.from(a1.this.getContext()).inflate(u0.f8778g, viewGroup, false));
        }

        public void c0(int i2, String str) {
            this.f8594f[i2] = str;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int o() {
            return this.f8593e.length;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public long q(int i2) {
            return i2;
        }
    }

    public static class i extends RecyclerView.e0 {
        public final TextView u;
        public final View v;

        public i(View view) {
            super(view);
            if (c.f.a.b.j3.x0.f9296a < 26) {
                view.setFocusable(true);
            }
            this.u = (TextView) view.findViewById(s0.S);
            this.v = view.findViewById(s0.f8760h);
        }
    }

    public final class j extends l {
        public j() {
            super();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ void n0(View view) {
            if (a1.this.w0 != null) {
                f.e eVarH = a1.this.w0.s().h();
                for (int i2 = 0; i2 < this.f8603e.size(); i2++) {
                    int iIntValue = this.f8603e.get(i2).intValue();
                    eVarH = eVarH.Q(iIntValue).W(iIntValue, true);
                }
                ((c.f.a.b.g3.f) c.f.a.b.j3.g.e(a1.this.w0)).K(eVarH);
                a1.this.t0.dismiss();
            }
        }

        @Override // c.f.a.b.h3.a1.l
        public void Z(List<Integer> list, List<k> list2, j.a aVar) {
            boolean z = false;
            int i2 = 0;
            while (true) {
                if (i2 >= list2.size()) {
                    break;
                }
                if (list2.get(i2).f8602e) {
                    z = true;
                    break;
                }
                i2++;
            }
            if (a1.this.A0 != null) {
                ImageView imageView = a1.this.A0;
                a1 a1Var = a1.this;
                imageView.setImageDrawable(z ? a1Var.H : a1Var.I);
                a1.this.A0.setContentDescription(z ? a1.this.J : a1.this.K);
            }
            this.f8603e = list;
            this.f8604f = list2;
            this.f8605g = aVar;
        }

        @Override // c.f.a.b.h3.a1.l, androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
        public void F(i iVar, int i2) {
            super.F(iVar, i2);
            if (i2 > 0) {
                iVar.v.setVisibility(this.f8604f.get(i2 + (-1)).f8602e ? 0 : 4);
            }
        }

        @Override // c.f.a.b.h3.a1.l
        public void h0(i iVar) {
            boolean z;
            iVar.u.setText(w0.B);
            int i2 = 0;
            while (true) {
                if (i2 >= this.f8604f.size()) {
                    z = true;
                    break;
                } else {
                    if (this.f8604f.get(i2).f8602e) {
                        z = false;
                        break;
                    }
                    i2++;
                }
            }
            iVar.v.setVisibility(z ? 0 : 4);
            iVar.f4855b.setOnClickListener(new View.OnClickListener() { // from class: c.f.a.b.h3.j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f8702b.n0(view);
                }
            });
        }

        @Override // c.f.a.b.h3.a1.l
        public void l0(String str) {
        }
    }

    public static final class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f8598a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f8599b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f8600c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f8601d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f8602e;

        public k(int i2, int i3, int i4, String str, boolean z) {
            this.f8598a = i2;
            this.f8599b = i3;
            this.f8600c = i4;
            this.f8601d = str;
            this.f8602e = z;
        }
    }

    public abstract class l extends RecyclerView.h<i> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public List<Integer> f8603e = new ArrayList();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public List<k> f8604f = new ArrayList();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public j.a f8605g = null;

        public l() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ void e0(k kVar, View view) {
            if (this.f8605g == null || a1.this.w0 == null) {
                return;
            }
            f.e eVarH = a1.this.w0.s().h();
            for (int i2 = 0; i2 < this.f8603e.size(); i2++) {
                int iIntValue = this.f8603e.get(i2).intValue();
                eVarH = iIntValue == kVar.f8598a ? eVarH.X(iIntValue, ((j.a) c.f.a.b.j3.g.e(this.f8605g)).g(iIntValue), new f.C0135f(kVar.f8599b, kVar.f8600c)).W(iIntValue, false) : eVarH.Q(iIntValue).W(iIntValue, true);
            }
            ((c.f.a.b.g3.f) c.f.a.b.j3.g.e(a1.this.w0)).K(eVarH);
            l0(kVar.f8601d);
            a1.this.t0.dismiss();
        }

        public void W() {
            this.f8604f = Collections.emptyList();
            this.f8605g = null;
        }

        public abstract void Z(List<Integer> list, List<k> list2, j.a aVar);

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: g0 */
        public void F(i iVar, int i2) {
            if (a1.this.w0 == null || this.f8605g == null) {
                return;
            }
            if (i2 == 0) {
                h0(iVar);
                return;
            }
            final k kVar = this.f8604f.get(i2 - 1);
            boolean z = ((c.f.a.b.g3.f) c.f.a.b.j3.g.e(a1.this.w0)).s().m(kVar.f8598a, this.f8605g.g(kVar.f8598a)) && kVar.f8602e;
            iVar.u.setText(kVar.f8601d);
            iVar.v.setVisibility(z ? 0 : 4);
            iVar.f4855b.setOnClickListener(new View.OnClickListener() { // from class: c.f.a.b.h3.k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f8704b.e0(kVar, view);
                }
            });
        }

        public abstract void h0(i iVar);

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
        public i H(ViewGroup viewGroup, int i2) {
            return new i(LayoutInflater.from(a1.this.getContext()).inflate(u0.f8779h, viewGroup, false));
        }

        public abstract void l0(String str);

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int o() {
            if (this.f8604f.isEmpty()) {
                return 0;
            }
            return this.f8604f.size() + 1;
        }
    }

    public interface m {
        void e(int i2);
    }

    static {
        i1.a("goog.exo.ui");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v67, types: [android.view.LayoutInflater] */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v4, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v5, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v7, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [android.view.ViewGroup, c.f.a.b.h3.a1$a] */
    /* JADX WARN: Type inference failed for: r9v4 */
    public a1(Context context, AttributeSet attributeSet, int i2, AttributeSet attributeSet2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        c cVar;
        boolean z9;
        boolean z10;
        ?? r9;
        super(context, attributeSet, i2);
        int resourceId = u0.f8775d;
        this.g0 = 5000;
        this.i0 = 0;
        this.h0 = 200;
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, y0.V, 0, 0);
            try {
                resourceId = typedArrayObtainStyledAttributes.getResourceId(y0.X, resourceId);
                this.g0 = typedArrayObtainStyledAttributes.getInt(y0.f0, this.g0);
                this.i0 = Z(typedArrayObtainStyledAttributes, this.i0);
                boolean z11 = typedArrayObtainStyledAttributes.getBoolean(y0.c0, true);
                boolean z12 = typedArrayObtainStyledAttributes.getBoolean(y0.Z, true);
                boolean z13 = typedArrayObtainStyledAttributes.getBoolean(y0.b0, true);
                boolean z14 = typedArrayObtainStyledAttributes.getBoolean(y0.a0, true);
                boolean z15 = typedArrayObtainStyledAttributes.getBoolean(y0.d0, false);
                boolean z16 = typedArrayObtainStyledAttributes.getBoolean(y0.e0, false);
                boolean z17 = typedArrayObtainStyledAttributes.getBoolean(y0.g0, false);
                setTimeBarMinUpdateInterval(typedArrayObtainStyledAttributes.getInt(y0.h0, this.h0));
                boolean z18 = typedArrayObtainStyledAttributes.getBoolean(y0.W, true);
                typedArrayObtainStyledAttributes.recycle();
                z7 = z15;
                z8 = z16;
                z3 = z11;
                z4 = z12;
                z5 = z13;
                z = z18;
                z6 = z14;
                z2 = z17;
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            z = true;
            z2 = false;
            z3 = true;
            z4 = true;
            z5 = true;
            z6 = true;
            z7 = false;
            z8 = false;
        }
        LayoutInflater.from(context).inflate(resourceId, this);
        setDescendantFocusability(262144);
        c cVar2 = new c();
        this.f8573b = cVar2;
        this.f8574c = new CopyOnWriteArrayList<>();
        this.s = new p2.b();
        this.t = new p2.c();
        StringBuilder sb = new StringBuilder();
        this.q = sb;
        this.r = new Formatter(sb, Locale.getDefault());
        this.j0 = new long[0];
        this.k0 = new boolean[0];
        this.l0 = new long[0];
        this.m0 = new boolean[0];
        this.Q = new c.f.a.b.y0();
        this.u = new Runnable() { // from class: c.f.a.b.h3.m
            @Override // java.lang.Runnable
            public final void run() {
                this.f8708b.C0();
            }
        };
        this.f8585n = (TextView) findViewById(s0.f8765m);
        this.f8586o = (TextView) findViewById(s0.F);
        ImageView imageView = (ImageView) findViewById(s0.Q);
        this.A0 = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(cVar2);
        }
        ImageView imageView2 = (ImageView) findViewById(s0.s);
        this.B0 = imageView2;
        d0(imageView2, new View.OnClickListener() { // from class: c.f.a.b.h3.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8707b.l0(view);
            }
        });
        ImageView imageView3 = (ImageView) findViewById(s0.w);
        this.C0 = imageView3;
        d0(imageView3, new View.OnClickListener() { // from class: c.f.a.b.h3.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8707b.l0(view);
            }
        });
        View viewFindViewById = findViewById(s0.M);
        this.D0 = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(cVar2);
        }
        View viewFindViewById2 = findViewById(s0.E);
        this.E0 = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(cVar2);
        }
        View viewFindViewById3 = findViewById(s0.f8755c);
        this.F0 = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(cVar2);
        }
        int i3 = s0.H;
        e1 e1Var = (e1) findViewById(i3);
        View viewFindViewById4 = findViewById(s0.I);
        if (e1Var != null) {
            this.p = e1Var;
            cVar = cVar2;
            z9 = z;
            z10 = z2;
            r9 = 0;
        } else if (viewFindViewById4 != null) {
            r9 = 0;
            cVar = cVar2;
            z9 = z;
            z10 = z2;
            i0 i0Var = new i0(context, null, 0, attributeSet2, x0.f8800a);
            i0Var.setId(i3);
            i0Var.setLayoutParams(viewFindViewById4.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById4.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById4);
            viewGroup.removeView(viewFindViewById4);
            viewGroup.addView(i0Var, iIndexOfChild);
            this.p = i0Var;
        } else {
            cVar = cVar2;
            z9 = z;
            z10 = z2;
            r9 = 0;
            this.p = null;
        }
        e1 e1Var2 = this.p;
        c cVar3 = cVar;
        if (e1Var2 != null) {
            e1Var2.b(cVar3);
        }
        View viewFindViewById5 = findViewById(s0.D);
        this.f8577f = viewFindViewById5;
        if (viewFindViewById5 != null) {
            viewFindViewById5.setOnClickListener(cVar3);
        }
        View viewFindViewById6 = findViewById(s0.G);
        this.f8575d = viewFindViewById6;
        if (viewFindViewById6 != null) {
            viewFindViewById6.setOnClickListener(cVar3);
        }
        View viewFindViewById7 = findViewById(s0.x);
        this.f8576e = viewFindViewById7;
        if (viewFindViewById7 != null) {
            viewFindViewById7.setOnClickListener(cVar3);
        }
        Typeface typefaceB = a.i.i.e.f.b(context, r0.f8751a);
        ?? FindViewById = findViewById(s0.K);
        ?? r6 = FindViewById == 0 ? (TextView) findViewById(s0.L) : r9;
        this.f8581j = r6;
        if (r6 != 0) {
            r6.setTypeface(typefaceB);
        }
        FindViewById = FindViewById == 0 ? r6 : FindViewById;
        this.f8579h = FindViewById;
        if (FindViewById != 0) {
            FindViewById.setOnClickListener(cVar3);
        }
        ?? FindViewById2 = findViewById(s0.q);
        ?? r62 = FindViewById2 == 0 ? (TextView) findViewById(s0.r) : r9;
        this.f8580i = r62;
        if (r62 != 0) {
            r62.setTypeface(typefaceB);
        }
        FindViewById2 = FindViewById2 == 0 ? r62 : FindViewById2;
        this.f8578g = FindViewById2;
        if (FindViewById2 != 0) {
            FindViewById2.setOnClickListener(cVar3);
        }
        ImageView imageView4 = (ImageView) findViewById(s0.J);
        this.f8582k = imageView4;
        if (imageView4 != null) {
            imageView4.setOnClickListener(cVar3);
        }
        ImageView imageView5 = (ImageView) findViewById(s0.N);
        this.f8583l = imageView5;
        if (imageView5 != null) {
            imageView5.setOnClickListener(cVar3);
        }
        this.p0 = context.getResources();
        this.D = r2.getInteger(t0.f8770b) / 100.0f;
        this.E = this.p0.getInteger(t0.f8769a) / 100.0f;
        View viewFindViewById8 = findViewById(s0.U);
        this.f8584m = viewFindViewById8;
        if (viewFindViewById8 != null) {
            v0(false, viewFindViewById8);
        }
        b1 b1Var = new b1(this);
        this.o0 = b1Var;
        b1Var.X(z9);
        this.r0 = new h(new String[]{this.p0.getString(w0.f8791h), this.p0.getString(w0.C)}, new Drawable[]{this.p0.getDrawable(q0.q), this.p0.getDrawable(q0.f8741g)});
        this.v0 = this.p0.getDimensionPixelSize(p0.f8730a);
        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(context).inflate(u0.f8777f, r9);
        this.q0 = recyclerView;
        recyclerView.setAdapter(this.r0);
        this.q0.setLayoutManager(new LinearLayoutManager(getContext()));
        this.t0 = new PopupWindow((View) this.q0, -2, -2, true);
        if (c.f.a.b.j3.x0.f9296a < 23) {
            this.t0.setBackgroundDrawable(new ColorDrawable(0));
        }
        this.t0.setOnDismissListener(this.f8573b);
        this.u0 = true;
        this.z0 = new j0(getResources());
        this.H = this.p0.getDrawable(q0.s);
        this.I = this.p0.getDrawable(q0.r);
        this.J = this.p0.getString(w0.f8785b);
        this.K = this.p0.getString(w0.f8784a);
        this.x0 = new j();
        this.y0 = new b();
        this.s0 = new e(this.p0.getStringArray(n0.f8725a), this.p0.getIntArray(n0.f8726b));
        this.L = this.p0.getDrawable(q0.f8743i);
        this.M = this.p0.getDrawable(q0.f8742h);
        this.v = this.p0.getDrawable(q0.f8747m);
        this.w = this.p0.getDrawable(q0.f8748n);
        this.x = this.p0.getDrawable(q0.f8746l);
        this.B = this.p0.getDrawable(q0.p);
        this.C = this.p0.getDrawable(q0.f8749o);
        this.N = this.p0.getString(w0.f8787d);
        this.O = this.p0.getString(w0.f8786c);
        this.y = this.p0.getString(w0.f8793j);
        this.z = this.p0.getString(w0.f8794k);
        this.A = this.p0.getString(w0.f8792i);
        this.F = this.p0.getString(w0.f8797n);
        this.G = this.p0.getString(w0.f8796m);
        this.o0.Y((ViewGroup) findViewById(s0.f8757e), true);
        this.o0.Y(this.f8578g, z4);
        this.o0.Y(this.f8579h, z3);
        this.o0.Y(this.f8575d, z5);
        this.o0.Y(this.f8576e, z6);
        this.o0.Y(this.f8583l, z7);
        this.o0.Y(this.A0, z8);
        this.o0.Y(this.f8584m, z10);
        this.o0.Y(this.f8582k, this.i0 != 0);
        addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: c.f.a.b.h3.n
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
                this.f8724b.m0(view, i4, i5, i6, i7, i8, i9, i10, i11);
            }
        });
    }

    public static boolean S(p2 p2Var, p2.c cVar) {
        if (p2Var.p() > 100) {
            return false;
        }
        int iP = p2Var.p();
        for (int i2 = 0; i2 < iP; i2++) {
            if (p2Var.n(i2, cVar).r == -9223372036854775807L) {
                return false;
            }
        }
        return true;
    }

    public static int Z(TypedArray typedArray, int i2) {
        return typedArray.getInt(y0.Y, i2);
    }

    public static void d0(View view, View.OnClickListener onClickListener) {
        if (view == null) {
            return;
        }
        view.setVisibility(8);
        view.setOnClickListener(onClickListener);
    }

    @SuppressLint({"InlinedApi"})
    public static boolean f0(int i2) {
        return i2 == 90 || i2 == 89 || i2 == 85 || i2 == 79 || i2 == 126 || i2 == 127 || i2 == 87 || i2 == 88;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackSpeed(float f2) {
        a2 a2Var = this.P;
        if (a2Var == null) {
            return;
        }
        this.Q.a(a2Var, a2Var.c().b(f2));
    }

    public static void y0(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.setVisibility(z ? 0 : 8);
    }

    public final void A0() {
        View view;
        Resources resources;
        int i2;
        if (g0() && this.U && this.f8577f != null) {
            if (s0()) {
                ((ImageView) this.f8577f).setImageDrawable(this.p0.getDrawable(q0.f8744j));
                view = this.f8577f;
                resources = this.p0;
                i2 = w0.f8789f;
            } else {
                ((ImageView) this.f8577f).setImageDrawable(this.p0.getDrawable(q0.f8745k));
                view = this.f8577f;
                resources = this.p0;
                i2 = w0.f8790g;
            }
            view.setContentDescription(resources.getString(i2));
        }
    }

    public final void B0() {
        a2 a2Var = this.P;
        if (a2Var == null) {
            return;
        }
        this.s0.h0(a2Var.c().f10622c);
        this.r0.c0(0, this.s0.W());
    }

    public final void C0() {
        long J;
        if (g0() && this.U) {
            a2 a2Var = this.P;
            long jX = 0;
            if (a2Var != null) {
                jX = this.n0 + a2Var.x();
                J = this.n0 + a2Var.J();
            } else {
                J = 0;
            }
            TextView textView = this.f8586o;
            if (textView != null && !this.f0) {
                textView.setText(c.f.a.b.j3.x0.f0(this.q, this.r, jX));
            }
            e1 e1Var = this.p;
            if (e1Var != null) {
                e1Var.setPosition(jX);
                this.p.setBufferedPosition(J);
            }
            f fVar = this.R;
            if (fVar != null) {
                fVar.a(jX, J);
            }
            removeCallbacks(this.u);
            int playbackState = a2Var == null ? 1 : a2Var.getPlaybackState();
            if (a2Var == null || !a2Var.isPlaying()) {
                if (playbackState == 4 || playbackState == 1) {
                    return;
                }
                postDelayed(this.u, 1000L);
                return;
            }
            e1 e1Var2 = this.p;
            long jMin = Math.min(e1Var2 != null ? e1Var2.getPreferredUpdateDelay() : 1000L, 1000 - (jX % 1000));
            float f2 = a2Var.c().f10622c;
            postDelayed(this.u, c.f.a.b.j3.x0.s(f2 > 0.0f ? (long) (jMin / f2) : 1000L, this.h0, 1000L));
        }
    }

    public final void D0() {
        ImageView imageView;
        ImageView imageView2;
        String str;
        if (g0() && this.U && (imageView = this.f8582k) != null) {
            if (this.i0 == 0) {
                v0(false, imageView);
                return;
            }
            a2 a2Var = this.P;
            if (a2Var == null) {
                v0(false, imageView);
                this.f8582k.setImageDrawable(this.v);
                this.f8582k.setContentDescription(this.y);
                return;
            }
            v0(true, imageView);
            int repeatMode = a2Var.getRepeatMode();
            if (repeatMode == 0) {
                this.f8582k.setImageDrawable(this.v);
                imageView2 = this.f8582k;
                str = this.y;
            } else if (repeatMode == 1) {
                this.f8582k.setImageDrawable(this.w);
                imageView2 = this.f8582k;
                str = this.z;
            } else {
                if (repeatMode != 2) {
                    return;
                }
                this.f8582k.setImageDrawable(this.x);
                imageView2 = this.f8582k;
                str = this.A;
            }
            imageView2.setContentDescription(str);
        }
    }

    public final void E0() {
        a2 a2Var;
        c.f.a.b.x0 x0Var = this.Q;
        int iN = (int) (((!(x0Var instanceof c.f.a.b.y0) || (a2Var = this.P) == null) ? 5000L : ((c.f.a.b.y0) x0Var).n(a2Var)) / 1000);
        TextView textView = this.f8581j;
        if (textView != null) {
            textView.setText(String.valueOf(iN));
        }
        View view = this.f8579h;
        if (view != null) {
            view.setContentDescription(this.p0.getQuantityString(v0.f8782b, iN, Integer.valueOf(iN)));
        }
    }

    public final void F0() {
        this.q0.measure(0, 0);
        this.t0.setWidth(Math.min(this.q0.getMeasuredWidth(), getWidth() - (this.v0 * 2)));
        this.t0.setHeight(Math.min(getHeight() - (this.v0 * 2), this.q0.getMeasuredHeight()));
    }

    public final void G0() {
        ImageView imageView;
        ImageView imageView2;
        String str;
        if (g0() && this.U && (imageView = this.f8583l) != null) {
            a2 a2Var = this.P;
            if (!this.o0.n(imageView)) {
                v0(false, this.f8583l);
                return;
            }
            if (a2Var != null) {
                v0(true, this.f8583l);
                this.f8583l.setImageDrawable(a2Var.I() ? this.B : this.C);
                imageView2 = this.f8583l;
                if (a2Var.I()) {
                    str = this.F;
                }
                imageView2.setContentDescription(str);
            }
            v0(false, this.f8583l);
            this.f8583l.setImageDrawable(this.C);
            imageView2 = this.f8583l;
            str = this.G;
            imageView2.setContentDescription(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void H0() {
        /*
            Method dump skipped, instruction units count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.h3.a1.H0():void");
    }

    public final void I0() {
        c0();
        v0(this.x0.o() > 0, this.A0);
    }

    public void R(m mVar) {
        c.f.a.b.j3.g.e(mVar);
        this.f8574c.add(mVar);
    }

    public boolean T(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        a2 a2Var = this.P;
        if (a2Var == null || !f0(keyCode)) {
            return false;
        }
        if (keyEvent.getAction() != 0) {
            return true;
        }
        if (keyCode == 90) {
            if (a2Var.getPlaybackState() == 4) {
                return true;
            }
            this.Q.c(a2Var);
            return true;
        }
        if (keyCode == 89) {
            this.Q.e(a2Var);
            return true;
        }
        if (keyEvent.getRepeatCount() != 0) {
            return true;
        }
        if (keyCode == 79 || keyCode == 85) {
            W(a2Var);
            return true;
        }
        if (keyCode == 87) {
            this.Q.j(a2Var);
            return true;
        }
        if (keyCode == 88) {
            this.Q.i(a2Var);
            return true;
        }
        if (keyCode == 126) {
            V(a2Var);
            return true;
        }
        if (keyCode != 127) {
            return true;
        }
        U(a2Var);
        return true;
    }

    public final void U(a2 a2Var) {
        this.Q.l(a2Var, false);
    }

    public final void V(a2 a2Var) {
        int playbackState = a2Var.getPlaybackState();
        if (playbackState == 1) {
            this.Q.h(a2Var);
        } else if (playbackState == 4) {
            q0(a2Var, a2Var.s(), -9223372036854775807L);
        }
        this.Q.l(a2Var, true);
    }

    public final void W(a2 a2Var) {
        int playbackState = a2Var.getPlaybackState();
        if (playbackState == 1 || playbackState == 4 || !a2Var.i()) {
            V(a2Var);
        } else {
            U(a2Var);
        }
    }

    public final void X(RecyclerView.h<?> hVar) {
        this.q0.setAdapter(hVar);
        F0();
        this.u0 = false;
        this.t0.dismiss();
        this.u0 = true;
        this.t0.showAsDropDown(this, (getWidth() - this.t0.getWidth()) - this.v0, (-this.t0.getHeight()) - this.v0);
    }

    public final void Y(j.a aVar, int i2, List<k> list) {
        c.f.a.b.e3.a1 a1VarG = aVar.g(i2);
        c.f.a.b.g3.k kVarA = ((a2) c.f.a.b.j3.g.e(this.P)).N().a(i2);
        for (int i3 = 0; i3 < a1VarG.f6903c; i3++) {
            c.f.a.b.e3.z0 z0VarB = a1VarG.b(i3);
            for (int i4 = 0; i4 < z0VarB.f8056b; i4++) {
                k1 k1VarB = z0VarB.b(i4);
                if (aVar.h(i2, i3, i4) == 4) {
                    list.add(new k(i2, i3, i4, this.z0.a(k1VarB), (kVarA == null || kVarA.j(k1VarB) == -1) ? false : true));
                }
            }
        }
    }

    public void a0() {
        this.o0.p();
    }

    public void b0() {
        this.o0.s();
    }

    public final void c0() {
        c.f.a.b.g3.f fVar;
        j.a aVarG;
        this.x0.W();
        this.y0.W();
        if (this.P == null || (fVar = this.w0) == null || (aVarG = fVar.g()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (int i2 = 0; i2 < aVarG.c(); i2++) {
            if (aVarG.f(i2) == 3 && this.o0.n(this.A0)) {
                Y(aVarG, i2, arrayList);
                arrayList3.add(Integer.valueOf(i2));
            } else if (aVarG.f(i2) == 1) {
                Y(aVarG, i2, arrayList2);
                arrayList4.add(Integer.valueOf(i2));
            }
        }
        this.x0.Z(arrayList3, arrayList, aVarG);
        this.y0.Z(arrayList4, arrayList2, aVarG);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return T(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public boolean e0() {
        return this.o0.v();
    }

    public boolean g0() {
        return getVisibility() == 0;
    }

    public a2 getPlayer() {
        return this.P;
    }

    public int getRepeatToggleModes() {
        return this.i0;
    }

    public boolean getShowShuffleButton() {
        return this.o0.n(this.f8583l);
    }

    public boolean getShowSubtitleButton() {
        return this.o0.n(this.A0);
    }

    public int getShowTimeoutMs() {
        return this.g0;
    }

    public boolean getShowVrButton() {
        return this.o0.n(this.f8584m);
    }

    public void k0() {
        Iterator<m> it = this.f8574c.iterator();
        while (it.hasNext()) {
            it.next().e(getVisibility());
        }
    }

    public final void l0(View view) {
        if (this.S == null) {
            return;
        }
        boolean z = !this.T;
        this.T = z;
        x0(this.B0, z);
        x0(this.C0, this.T);
        d dVar = this.S;
        if (dVar != null) {
            dVar.a(this.T);
        }
    }

    public final void m0(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int i10 = i5 - i3;
        int i11 = i9 - i7;
        if (!(i4 - i2 == i8 - i6 && i10 == i11) && this.t0.isShowing()) {
            F0();
            this.t0.update(view, (getWidth() - this.t0.getWidth()) - this.v0, (-this.t0.getHeight()) - this.v0, -1, -1);
        }
    }

    public final void n0(int i2) {
        RecyclerView.h<?> hVar;
        if (i2 == 0) {
            hVar = this.s0;
        } else {
            if (i2 != 1) {
                this.t0.dismiss();
                return;
            }
            hVar = this.y0;
        }
        X(hVar);
    }

    public void o0(m mVar) {
        this.f8574c.remove(mVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.o0.O();
        this.U = true;
        if (e0()) {
            this.o0.W();
        }
        u0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.o0.P();
        this.U = false;
        removeCallbacks(this.u);
        this.o0.V();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        this.o0.Q(z, i2, i3, i4, i5);
    }

    public void p0() {
        View view = this.f8577f;
        if (view != null) {
            view.requestFocus();
        }
    }

    public final boolean q0(a2 a2Var, int i2, long j2) {
        return this.Q.f(a2Var, i2, j2);
    }

    public final void r0(a2 a2Var, long j2) {
        int iS;
        p2 p2VarG = a2Var.G();
        if (this.W && !p2VarG.q()) {
            int iP = p2VarG.p();
            iS = 0;
            while (true) {
                long jD = p2VarG.n(iS, this.t).d();
                if (j2 < jD) {
                    break;
                }
                if (iS == iP - 1) {
                    j2 = jD;
                    break;
                } else {
                    j2 -= jD;
                    iS++;
                }
            }
        } else {
            iS = a2Var.s();
        }
        q0(a2Var, iS, j2);
        C0();
    }

    public final boolean s0() {
        a2 a2Var = this.P;
        return (a2Var == null || a2Var.getPlaybackState() == 4 || this.P.getPlaybackState() == 1 || !this.P.i()) ? false : true;
    }

    public void setAnimationEnabled(boolean z) {
        this.o0.X(z);
    }

    @Deprecated
    public void setControlDispatcher(c.f.a.b.x0 x0Var) {
        if (this.Q != x0Var) {
            this.Q = x0Var;
            z0();
        }
    }

    public void setOnFullScreenModeChangedListener(d dVar) {
        this.S = dVar;
        y0(this.B0, dVar != null);
        y0(this.C0, dVar != null);
    }

    public void setPlayer(a2 a2Var) {
        c.f.a.b.g3.f fVar;
        boolean z = true;
        c.f.a.b.j3.g.g(Looper.myLooper() == Looper.getMainLooper());
        if (a2Var != null && a2Var.H() != Looper.getMainLooper()) {
            z = false;
        }
        c.f.a.b.j3.g.a(z);
        a2 a2Var2 = this.P;
        if (a2Var2 == a2Var) {
            return;
        }
        if (a2Var2 != null) {
            a2Var2.p(this.f8573b);
        }
        this.P = a2Var;
        if (a2Var != null) {
            a2Var.y(this.f8573b);
        }
        if (a2Var instanceof c.f.a.b.f1) {
            c.f.a.b.g3.o oVarA = ((c.f.a.b.f1) a2Var).a();
            fVar = oVarA instanceof c.f.a.b.g3.f ? (c.f.a.b.g3.f) oVarA : null;
            u0();
        }
        this.w0 = fVar;
        u0();
    }

    public void setProgressUpdateListener(f fVar) {
        this.R = fVar;
    }

    public void setRepeatToggleModes(int i2) {
        this.i0 = i2;
        a2 a2Var = this.P;
        if (a2Var != null) {
            int repeatMode = a2Var.getRepeatMode();
            if (i2 == 0 && repeatMode != 0) {
                this.Q.b(this.P, 0);
            } else if (i2 == 1 && repeatMode == 2) {
                this.Q.b(this.P, 1);
            } else if (i2 == 2 && repeatMode == 1) {
                this.Q.b(this.P, 2);
            }
        }
        this.o0.Y(this.f8582k, i2 != 0);
        D0();
    }

    public void setShowFastForwardButton(boolean z) {
        this.o0.Y(this.f8578g, z);
        z0();
    }

    public void setShowMultiWindowTimeBar(boolean z) {
        this.V = z;
        H0();
    }

    public void setShowNextButton(boolean z) {
        this.o0.Y(this.f8576e, z);
        z0();
    }

    public void setShowPreviousButton(boolean z) {
        this.o0.Y(this.f8575d, z);
        z0();
    }

    public void setShowRewindButton(boolean z) {
        this.o0.Y(this.f8579h, z);
        z0();
    }

    public void setShowShuffleButton(boolean z) {
        this.o0.Y(this.f8583l, z);
        G0();
    }

    public void setShowSubtitleButton(boolean z) {
        this.o0.Y(this.A0, z);
    }

    public void setShowTimeoutMs(int i2) {
        this.g0 = i2;
        if (e0()) {
            this.o0.W();
        }
    }

    public void setShowVrButton(boolean z) {
        this.o0.Y(this.f8584m, z);
    }

    public void setTimeBarMinUpdateInterval(int i2) {
        this.h0 = c.f.a.b.j3.x0.r(i2, 16, 1000);
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        View view = this.f8584m;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            v0(onClickListener != null, this.f8584m);
        }
    }

    public void t0() {
        this.o0.b0();
    }

    public void u0() {
        A0();
        z0();
        D0();
        G0();
        I0();
        B0();
        H0();
    }

    public final void v0(boolean z, View view) {
        if (view == null) {
            return;
        }
        view.setEnabled(z);
        view.setAlpha(z ? this.D : this.E);
    }

    public final void w0() {
        a2 a2Var;
        c.f.a.b.x0 x0Var = this.Q;
        int iM = (int) (((!(x0Var instanceof c.f.a.b.y0) || (a2Var = this.P) == null) ? 15000L : ((c.f.a.b.y0) x0Var).m(a2Var)) / 1000);
        TextView textView = this.f8580i;
        if (textView != null) {
            textView.setText(String.valueOf(iM));
        }
        View view = this.f8578g;
        if (view != null) {
            view.setContentDescription(this.p0.getQuantityString(v0.f8781a, iM, Integer.valueOf(iM)));
        }
    }

    public final void x0(ImageView imageView, boolean z) {
        String str;
        if (imageView == null) {
            return;
        }
        if (z) {
            imageView.setImageDrawable(this.L);
            str = this.N;
        } else {
            imageView.setImageDrawable(this.M);
            str = this.O;
        }
        imageView.setContentDescription(str);
    }

    public final void z0() {
        boolean z;
        boolean zC;
        boolean zC2;
        boolean z2;
        if (g0() && this.U) {
            a2 a2Var = this.P;
            boolean z3 = false;
            if (a2Var != null) {
                boolean zC3 = a2Var.C(4);
                zC2 = a2Var.C(6);
                boolean z4 = a2Var.C(10) && this.Q.d();
                if (a2Var.C(11) && this.Q.k()) {
                    z3 = true;
                }
                zC = a2Var.C(8);
                z = z3;
                z3 = z4;
                z2 = zC3;
            } else {
                z = false;
                zC = false;
                zC2 = false;
                z2 = false;
            }
            if (z3) {
                E0();
            }
            if (z) {
                w0();
            }
            v0(zC2, this.f8575d);
            v0(z3, this.f8579h);
            v0(z, this.f8578g);
            v0(zC, this.f8576e);
            e1 e1Var = this.p;
            if (e1Var != null) {
                e1Var.setEnabled(z2);
            }
        }
    }
}
