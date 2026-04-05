package androidx.appcompat.widget;

import a.b.j;
import a.b.k.a;
import a.b.p.j.g;
import a.b.p.j.i;
import a.b.p.j.m;
import a.b.p.j.r;
import a.b.q.a0;
import a.b.q.a1;
import a.b.q.l;
import a.b.q.m0;
import a.b.q.u0;
import a.b.q.v0;
import a.i.r.x;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    public ColorStateList A;
    public ColorStateList B;
    public boolean C;
    public boolean D;
    public final ArrayList<View> E;
    public final ArrayList<View> F;
    public final int[] G;
    public f H;
    public final ActionMenuView.e I;
    public v0 J;
    public a.b.q.c K;
    public d L;
    public m.a M;
    public g.a N;
    public boolean O;
    public final Runnable P;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ActionMenuView f4233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f4234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f4235d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ImageButton f4236e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ImageView f4237f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Drawable f4238g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CharSequence f4239h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ImageButton f4240i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public View f4241j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Context f4242k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f4243l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f4244m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f4245n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f4246o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public m0 u;
    public int v;
    public int w;
    public int x;
    public CharSequence y;
    public CharSequence z;

    public class a implements ActionMenuView.e {
        public a() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.e
        public boolean onMenuItemClick(MenuItem menuItem) {
            f fVar = Toolbar.this.H;
            if (fVar != null) {
                return fVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.O();
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.e();
        }
    }

    public class d implements m {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public a.b.p.j.g f4250b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public i f4251c;

        public d() {
        }

        @Override // a.b.p.j.m
        public void b(a.b.p.j.g gVar, boolean z) {
        }

        @Override // a.b.p.j.m
        public void c(boolean z) {
            if (this.f4251c != null) {
                a.b.p.j.g gVar = this.f4250b;
                boolean z2 = false;
                if (gVar != null) {
                    int size = gVar.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            break;
                        }
                        if (this.f4250b.getItem(i2) == this.f4251c) {
                            z2 = true;
                            break;
                        }
                        i2++;
                    }
                }
                if (z2) {
                    return;
                }
                e(this.f4250b, this.f4251c);
            }
        }

        @Override // a.b.p.j.m
        public boolean d() {
            return false;
        }

        @Override // a.b.p.j.m
        public boolean e(a.b.p.j.g gVar, i iVar) {
            KeyEvent.Callback callback = Toolbar.this.f4241j;
            if (callback instanceof a.b.p.c) {
                ((a.b.p.c) callback).f();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f4241j);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f4240i);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f4241j = null;
            toolbar3.a();
            this.f4251c = null;
            Toolbar.this.requestLayout();
            iVar.r(false);
            return true;
        }

        @Override // a.b.p.j.m
        public boolean f(a.b.p.j.g gVar, i iVar) {
            Toolbar.this.g();
            ViewParent parent = Toolbar.this.f4240i.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f4240i);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f4240i);
            }
            Toolbar.this.f4241j = iVar.getActionView();
            this.f4251c = iVar;
            ViewParent parent2 = Toolbar.this.f4241j.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f4241j);
                }
                e eVarGenerateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                eVarGenerateDefaultLayoutParams.f135a = 8388611 | (toolbar4.f4246o & 112);
                eVarGenerateDefaultLayoutParams.f4253b = 2;
                toolbar4.f4241j.setLayoutParams(eVarGenerateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f4241j);
            }
            Toolbar.this.G();
            Toolbar.this.requestLayout();
            iVar.r(true);
            KeyEvent.Callback callback = Toolbar.this.f4241j;
            if (callback instanceof a.b.p.c) {
                ((a.b.p.c) callback).c();
            }
            return true;
        }

        @Override // a.b.p.j.m
        public void h(Context context, a.b.p.j.g gVar) {
            i iVar;
            a.b.p.j.g gVar2 = this.f4250b;
            if (gVar2 != null && (iVar = this.f4251c) != null) {
                gVar2.f(iVar);
            }
            this.f4250b = gVar;
        }

        @Override // a.b.p.j.m
        public boolean j(r rVar) {
            return false;
        }
    }

    public static class e extends a.C0002a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f4253b;

        public e(int i2, int i3) {
            super(i2, i3);
            this.f4253b = 0;
            this.f135a = 8388627;
        }

        public e(a.C0002a c0002a) {
            super(c0002a);
            this.f4253b = 0;
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f4253b = 0;
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f4253b = 0;
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f4253b = 0;
            a(marginLayoutParams);
        }

        public e(e eVar) {
            super((a.C0002a) eVar);
            this.f4253b = 0;
            this.f4253b = eVar.f4253b;
        }

        public void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }
    }

    public interface f {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public static class g extends a.k.a.a {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f4254d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f4255e;

        public class a implements Parcelable.ClassLoaderCreator<g> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public g[] newArray(int i2) {
                return new g[i2];
            }
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f4254d = parcel.readInt();
            this.f4255e = parcel.readInt() != 0;
        }

        public g(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // a.k.a.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f4254d);
            parcel.writeInt(this.f4255e ? 1 : 0);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.b.a.T);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.x = 8388627;
        this.E = new ArrayList<>();
        this.F = new ArrayList<>();
        this.G = new int[2];
        this.I = new a();
        this.P = new b();
        Context context2 = getContext();
        int[] iArr = j.s3;
        u0 u0VarV = u0.v(context2, attributeSet, iArr, i2, 0);
        x.n0(this, context, iArr, attributeSet, u0VarV.r(), i2, 0);
        this.f4244m = u0VarV.n(j.U3, 0);
        this.f4245n = u0VarV.n(j.L3, 0);
        this.x = u0VarV.l(j.t3, this.x);
        this.f4246o = u0VarV.l(j.u3, 48);
        int iE = u0VarV.e(j.O3, 0);
        int i3 = j.T3;
        iE = u0VarV.s(i3) ? u0VarV.e(i3, iE) : iE;
        this.t = iE;
        this.s = iE;
        this.r = iE;
        this.q = iE;
        int iE2 = u0VarV.e(j.R3, -1);
        if (iE2 >= 0) {
            this.q = iE2;
        }
        int iE3 = u0VarV.e(j.Q3, -1);
        if (iE3 >= 0) {
            this.r = iE3;
        }
        int iE4 = u0VarV.e(j.S3, -1);
        if (iE4 >= 0) {
            this.s = iE4;
        }
        int iE5 = u0VarV.e(j.P3, -1);
        if (iE5 >= 0) {
            this.t = iE5;
        }
        this.p = u0VarV.f(j.F3, -1);
        int iE6 = u0VarV.e(j.B3, Integer.MIN_VALUE);
        int iE7 = u0VarV.e(j.x3, Integer.MIN_VALUE);
        int iF = u0VarV.f(j.z3, 0);
        int iF2 = u0VarV.f(j.A3, 0);
        h();
        this.u.e(iF, iF2);
        if (iE6 != Integer.MIN_VALUE || iE7 != Integer.MIN_VALUE) {
            this.u.g(iE6, iE7);
        }
        this.v = u0VarV.e(j.C3, Integer.MIN_VALUE);
        this.w = u0VarV.e(j.y3, Integer.MIN_VALUE);
        this.f4238g = u0VarV.g(j.w3);
        this.f4239h = u0VarV.p(j.v3);
        CharSequence charSequenceP = u0VarV.p(j.N3);
        if (!TextUtils.isEmpty(charSequenceP)) {
            setTitle(charSequenceP);
        }
        CharSequence charSequenceP2 = u0VarV.p(j.K3);
        if (!TextUtils.isEmpty(charSequenceP2)) {
            setSubtitle(charSequenceP2);
        }
        this.f4242k = getContext();
        setPopupTheme(u0VarV.n(j.J3, 0));
        Drawable drawableG = u0VarV.g(j.I3);
        if (drawableG != null) {
            setNavigationIcon(drawableG);
        }
        CharSequence charSequenceP3 = u0VarV.p(j.H3);
        if (!TextUtils.isEmpty(charSequenceP3)) {
            setNavigationContentDescription(charSequenceP3);
        }
        Drawable drawableG2 = u0VarV.g(j.D3);
        if (drawableG2 != null) {
            setLogo(drawableG2);
        }
        CharSequence charSequenceP4 = u0VarV.p(j.E3);
        if (!TextUtils.isEmpty(charSequenceP4)) {
            setLogoDescription(charSequenceP4);
        }
        int i4 = j.V3;
        if (u0VarV.s(i4)) {
            setTitleTextColor(u0VarV.c(i4));
        }
        int i5 = j.M3;
        if (u0VarV.s(i5)) {
            setSubtitleTextColor(u0VarV.c(i5));
        }
        int i6 = j.G3;
        if (u0VarV.s(i6)) {
            x(u0VarV.n(i6, 0));
        }
        u0VarV.w();
    }

    private MenuInflater getMenuInflater() {
        return new a.b.p.g(getContext());
    }

    public boolean A() {
        ActionMenuView actionMenuView = this.f4233b;
        return actionMenuView != null && actionMenuView.J();
    }

    public final int B(View view, int i2, int[] iArr, int i3) {
        e eVar = (e) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin - iArr[0];
        int iMax = i2 + Math.max(0, i4);
        iArr[0] = Math.max(0, -i4);
        int iQ = q(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iQ, iMax + measuredWidth, view.getMeasuredHeight() + iQ);
        return iMax + measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
    }

    public final int C(View view, int i2, int[] iArr, int i3) {
        e eVar = (e) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin - iArr[1];
        int iMax = i2 - Math.max(0, i4);
        iArr[1] = Math.max(0, -i4);
        int iQ = q(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iQ, iMax, view.getMeasuredHeight() + iQ);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).leftMargin);
    }

    public final int D(View view, int i2, int i3, int i4, int i5, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i6 = marginLayoutParams.leftMargin - iArr[0];
        int i7 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i6) + Math.max(0, i7);
        iArr[0] = Math.max(0, -i6);
        iArr[1] = Math.max(0, -i7);
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + iMax + i3, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i4, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    public final void E(View view, int i2, int i3, int i4, int i5, int i6) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i4, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i6 >= 0) {
            if (mode != 0) {
                i6 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i6);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final void F() {
        removeCallbacks(this.P);
        post(this.P);
    }

    public void G() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((e) childAt.getLayoutParams()).f4253b != 2 && childAt != this.f4233b) {
                removeViewAt(childCount);
                this.F.add(childAt);
            }
        }
    }

    public void H(int i2, int i3) {
        h();
        this.u.g(i2, i3);
    }

    public void I(a.b.p.j.g gVar, a.b.q.c cVar) {
        if (gVar == null && this.f4233b == null) {
            return;
        }
        k();
        a.b.p.j.g gVarN = this.f4233b.N();
        if (gVarN == gVar) {
            return;
        }
        if (gVarN != null) {
            gVarN.O(this.K);
            gVarN.O(this.L);
        }
        if (this.L == null) {
            this.L = new d();
        }
        cVar.G(true);
        if (gVar != null) {
            gVar.c(cVar, this.f4242k);
            gVar.c(this.L, this.f4242k);
        } else {
            cVar.h(this.f4242k, null);
            this.L.h(this.f4242k, null);
            cVar.c(true);
            this.L.c(true);
        }
        this.f4233b.setPopupTheme(this.f4243l);
        this.f4233b.setPresenter(cVar);
        this.K = cVar;
    }

    public void J(m.a aVar, g.a aVar2) {
        this.M = aVar;
        this.N = aVar2;
        ActionMenuView actionMenuView = this.f4233b;
        if (actionMenuView != null) {
            actionMenuView.O(aVar, aVar2);
        }
    }

    public void K(Context context, int i2) {
        this.f4245n = i2;
        TextView textView = this.f4235d;
        if (textView != null) {
            textView.setTextAppearance(context, i2);
        }
    }

    public void L(Context context, int i2) {
        this.f4244m = i2;
        TextView textView = this.f4234c;
        if (textView != null) {
            textView.setTextAppearance(context, i2);
        }
    }

    public final boolean M() {
        if (!this.O) {
            return false;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (N(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    public final boolean N(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public boolean O() {
        ActionMenuView actionMenuView = this.f4233b;
        return actionMenuView != null && actionMenuView.P();
    }

    public void a() {
        for (int size = this.F.size() - 1; size >= 0; size--) {
            addView(this.F.get(size));
        }
        this.F.clear();
    }

    public final void b(List<View> list, int i2) {
        boolean z = x.C(this) == 1;
        int childCount = getChildCount();
        int iB = a.i.r.f.b(i2, x.C(this));
        list.clear();
        if (!z) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.f4253b == 0 && N(childAt) && p(eVar.f135a) == iB) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            View childAt2 = getChildAt(i4);
            e eVar2 = (e) childAt2.getLayoutParams();
            if (eVar2.f4253b == 0 && N(childAt2) && p(eVar2.f135a) == iB) {
                list.add(childAt2);
            }
        }
    }

    public final void c(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        e eVarGenerateDefaultLayoutParams = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (e) layoutParams;
        eVarGenerateDefaultLayoutParams.f4253b = 1;
        if (!z || this.f4241j == null) {
            addView(view, eVarGenerateDefaultLayoutParams);
        } else {
            view.setLayoutParams(eVarGenerateDefaultLayoutParams);
            this.F.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof e);
    }

    public boolean d() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.f4233b) != null && actionMenuView.K();
    }

    public void e() {
        d dVar = this.L;
        i iVar = dVar == null ? null : dVar.f4251c;
        if (iVar != null) {
            iVar.collapseActionView();
        }
    }

    public void f() {
        ActionMenuView actionMenuView = this.f4233b;
        if (actionMenuView != null) {
            actionMenuView.B();
        }
    }

    public void g() {
        if (this.f4240i == null) {
            l lVar = new l(getContext(), null, a.b.a.S);
            this.f4240i = lVar;
            lVar.setImageDrawable(this.f4238g);
            this.f4240i.setContentDescription(this.f4239h);
            e eVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            eVarGenerateDefaultLayoutParams.f135a = 8388611 | (this.f4246o & 112);
            eVarGenerateDefaultLayoutParams.f4253b = 2;
            this.f4240i.setLayoutParams(eVarGenerateDefaultLayoutParams);
            this.f4240i.setOnClickListener(new c());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f4240i;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f4240i;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        m0 m0Var = this.u;
        if (m0Var != null) {
            return m0Var.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i2 = this.w;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        m0 m0Var = this.u;
        if (m0Var != null) {
            return m0Var.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        m0 m0Var = this.u;
        if (m0Var != null) {
            return m0Var.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        m0 m0Var = this.u;
        if (m0Var != null) {
            return m0Var.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i2 = this.v;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        a.b.p.j.g gVarN;
        ActionMenuView actionMenuView = this.f4233b;
        return actionMenuView != null && (gVarN = actionMenuView.N()) != null && gVarN.hasVisibleItems() ? Math.max(getContentInsetEnd(), Math.max(this.w, 0)) : getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        return x.C(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return x.C(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.v, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f4237f;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f4237f;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        j();
        return this.f4233b.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f4236e;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f4236e;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public a.b.q.c getOuterActionMenuPresenter() {
        return this.K;
    }

    public Drawable getOverflowIcon() {
        j();
        return this.f4233b.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f4242k;
    }

    public int getPopupTheme() {
        return this.f4243l;
    }

    public CharSequence getSubtitle() {
        return this.z;
    }

    public final TextView getSubtitleTextView() {
        return this.f4235d;
    }

    public CharSequence getTitle() {
        return this.y;
    }

    public int getTitleMarginBottom() {
        return this.t;
    }

    public int getTitleMarginEnd() {
        return this.r;
    }

    public int getTitleMarginStart() {
        return this.q;
    }

    public int getTitleMarginTop() {
        return this.s;
    }

    public final TextView getTitleTextView() {
        return this.f4234c;
    }

    public a0 getWrapper() {
        if (this.J == null) {
            this.J = new v0(this, true);
        }
        return this.J;
    }

    public final void h() {
        if (this.u == null) {
            this.u = new m0();
        }
    }

    public final void i() {
        if (this.f4237f == null) {
            this.f4237f = new AppCompatImageView(getContext());
        }
    }

    public final void j() {
        k();
        if (this.f4233b.N() == null) {
            a.b.p.j.g gVar = (a.b.p.j.g) this.f4233b.getMenu();
            if (this.L == null) {
                this.L = new d();
            }
            this.f4233b.setExpandedActionViewsExclusive(true);
            gVar.c(this.L, this.f4242k);
        }
    }

    public final void k() {
        if (this.f4233b == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f4233b = actionMenuView;
            actionMenuView.setPopupTheme(this.f4243l);
            this.f4233b.setOnMenuItemClickListener(this.I);
            this.f4233b.O(this.M, this.N);
            e eVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            eVarGenerateDefaultLayoutParams.f135a = 8388613 | (this.f4246o & 112);
            this.f4233b.setLayoutParams(eVarGenerateDefaultLayoutParams);
            c(this.f4233b, false);
        }
    }

    public final void l() {
        if (this.f4236e == null) {
            this.f4236e = new l(getContext(), null, a.b.a.S);
            e eVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            eVarGenerateDefaultLayoutParams.f135a = 8388611 | (this.f4246o & 112);
            this.f4236e.setLayoutParams(eVarGenerateDefaultLayoutParams);
        }
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public e generateDefaultLayoutParams() {
        return new e(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e ? new e((e) layoutParams) : layoutParams instanceof a.C0002a ? new e((a.C0002a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.P);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.D = false;
        }
        if (!this.D) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.D = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.D = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0295 A[LOOP:0: B:109:0x0293->B:110:0x0295, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02b7 A[LOOP:1: B:112:0x02b5->B:113:0x02b7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02f0 A[LOOP:2: B:121:0x02ee->B:122:0x02f0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x021d  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instruction units count: 773
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        char c2;
        char c3;
        int measuredWidth;
        int iMax;
        int iCombineMeasuredStates;
        int measuredWidth2;
        int iCombineMeasuredStates2;
        int iMax2;
        int measuredHeight;
        int[] iArr = this.G;
        if (a1.b(this)) {
            c2 = 1;
            c3 = 0;
        } else {
            c2 = 0;
            c3 = 1;
        }
        if (N(this.f4236e)) {
            E(this.f4236e, i2, 0, i3, 0, this.p);
            measuredWidth = this.f4236e.getMeasuredWidth() + s(this.f4236e);
            iMax = Math.max(0, this.f4236e.getMeasuredHeight() + t(this.f4236e));
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f4236e.getMeasuredState());
        } else {
            measuredWidth = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (N(this.f4240i)) {
            E(this.f4240i, i2, 0, i3, 0, this.p);
            measuredWidth = this.f4240i.getMeasuredWidth() + s(this.f4240i);
            iMax = Math.max(iMax, this.f4240i.getMeasuredHeight() + t(this.f4240i));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f4240i.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = 0 + Math.max(currentContentInsetStart, measuredWidth);
        iArr[c2] = Math.max(0, currentContentInsetStart - measuredWidth);
        if (N(this.f4233b)) {
            E(this.f4233b, i2, iMax3, i3, 0, this.p);
            measuredWidth2 = this.f4233b.getMeasuredWidth() + s(this.f4233b);
            iMax = Math.max(iMax, this.f4233b.getMeasuredHeight() + t(this.f4233b));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f4233b.getMeasuredState());
        } else {
            measuredWidth2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax4 = iMax3 + Math.max(currentContentInsetEnd, measuredWidth2);
        iArr[c3] = Math.max(0, currentContentInsetEnd - measuredWidth2);
        if (N(this.f4241j)) {
            iMax4 += D(this.f4241j, i2, iMax4, i3, 0, iArr);
            iMax = Math.max(iMax, this.f4241j.getMeasuredHeight() + t(this.f4241j));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f4241j.getMeasuredState());
        }
        if (N(this.f4237f)) {
            iMax4 += D(this.f4237f, i2, iMax4, i3, 0, iArr);
            iMax = Math.max(iMax, this.f4237f.getMeasuredHeight() + t(this.f4237f));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f4237f.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (((e) childAt.getLayoutParams()).f4253b == 0 && N(childAt)) {
                iMax4 += D(childAt, i2, iMax4, i3, 0, iArr);
                iMax = Math.max(iMax, childAt.getMeasuredHeight() + t(childAt));
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
            }
        }
        int i5 = this.s + this.t;
        int i6 = this.q + this.r;
        if (N(this.f4234c)) {
            D(this.f4234c, i2, iMax4 + i6, i3, i5, iArr);
            int measuredWidth3 = this.f4234c.getMeasuredWidth() + s(this.f4234c);
            measuredHeight = this.f4234c.getMeasuredHeight() + t(this.f4234c);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f4234c.getMeasuredState());
            iMax2 = measuredWidth3;
        } else {
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
            measuredHeight = 0;
        }
        if (N(this.f4235d)) {
            iMax2 = Math.max(iMax2, D(this.f4235d, i2, iMax4 + i6, i3, measuredHeight + i5, iArr));
            measuredHeight += this.f4235d.getMeasuredHeight() + t(this.f4235d);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f4235d.getMeasuredState());
        }
        int iMax5 = Math.max(iMax, measuredHeight);
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax4 + iMax2 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i2, (-16777216) & iCombineMeasuredStates2), M() ? 0 : View.resolveSizeAndState(Math.max(iMax5 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i3, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.b());
        ActionMenuView actionMenuView = this.f4233b;
        a.b.p.j.g gVarN = actionMenuView != null ? actionMenuView.N() : null;
        int i2 = gVar.f4254d;
        if (i2 != 0 && this.L != null && gVarN != null && (menuItemFindItem = gVarN.findItem(i2)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (gVar.f4255e) {
            F();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i2) {
        if (Build.VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(i2);
        }
        h();
        this.u.f(i2 == 1);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        i iVar;
        g gVar = new g(super.onSaveInstanceState());
        d dVar = this.L;
        if (dVar != null && (iVar = dVar.f4251c) != null) {
            gVar.f4254d = iVar.getItemId();
        }
        gVar.f4255e = A();
        return gVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.C = false;
        }
        if (!this.C) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.C = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.C = false;
        }
        return true;
    }

    public final int p(int i2) {
        int iC = x.C(this);
        int iB = a.i.r.f.b(i2, iC) & 7;
        return (iB == 1 || iB == 3 || iB == 5) ? iB : iC == 1 ? 5 : 3;
    }

    public final int q(View view, int i2) {
        e eVar = (e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i3 = i2 > 0 ? (measuredHeight - i2) / 2 : 0;
        int iR = r(eVar.f135a);
        if (iR == 48) {
            return getPaddingTop() - i3;
        }
        if (iR == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin) - i3;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
        if (iMax < i4) {
            iMax = i4;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i6 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
            if (i5 < i6) {
                iMax = Math.max(0, iMax - (i6 - i5));
            }
        }
        return paddingTop + iMax;
    }

    public final int r(int i2) {
        int i3 = i2 & 112;
        return (i3 == 16 || i3 == 48 || i3 == 80) ? i3 : this.x & 112;
    }

    public final int s(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return a.i.r.i.b(marginLayoutParams) + a.i.r.i.a(marginLayoutParams);
    }

    public void setCollapseContentDescription(int i2) {
        setCollapseContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        ImageButton imageButton = this.f4240i;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(int i2) {
        setCollapseIcon(a.b.l.a.a.d(getContext(), i2));
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            this.f4240i.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.f4240i;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.f4238g);
            }
        }
    }

    public void setCollapsible(boolean z) {
        this.O = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.w) {
            this.w = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.v) {
            this.v = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i2) {
        setLogo(a.b.l.a.a.d(getContext(), i2));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            i();
            if (!y(this.f4237f)) {
                c(this.f4237f, true);
            }
        } else {
            ImageView imageView = this.f4237f;
            if (imageView != null && y(imageView)) {
                removeView(this.f4237f);
                this.F.remove(this.f4237f);
            }
        }
        ImageView imageView2 = this.f4237f;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i2) {
        setLogoDescription(getContext().getText(i2));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            i();
        }
        ImageView imageView = this.f4237f;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(int i2) {
        setNavigationContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            l();
        }
        ImageButton imageButton = this.f4236e;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(int i2) {
        setNavigationIcon(a.b.l.a.a.d(getContext(), i2));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            l();
            if (!y(this.f4236e)) {
                c(this.f4236e, true);
            }
        } else {
            ImageButton imageButton = this.f4236e;
            if (imageButton != null && y(imageButton)) {
                removeView(this.f4236e);
                this.F.remove(this.f4236e);
            }
        }
        ImageButton imageButton2 = this.f4236e;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        l();
        this.f4236e.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(f fVar) {
        this.H = fVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        j();
        this.f4233b.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i2) {
        if (this.f4243l != i2) {
            this.f4243l = i2;
            if (i2 == 0) {
                this.f4242k = getContext();
            } else {
                this.f4242k = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public void setSubtitle(int i2) {
        setSubtitle(getContext().getText(i2));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f4235d;
            if (textView != null && y(textView)) {
                removeView(this.f4235d);
                this.F.remove(this.f4235d);
            }
        } else {
            if (this.f4235d == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f4235d = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f4235d.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.f4245n;
                if (i2 != 0) {
                    this.f4235d.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.B;
                if (colorStateList != null) {
                    this.f4235d.setTextColor(colorStateList);
                }
            }
            if (!y(this.f4235d)) {
                c(this.f4235d, true);
            }
        }
        TextView textView2 = this.f4235d;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.z = charSequence;
    }

    public void setSubtitleTextColor(int i2) {
        setSubtitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.B = colorStateList;
        TextView textView = this.f4235d;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(int i2) {
        setTitle(getContext().getText(i2));
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f4234c;
            if (textView != null && y(textView)) {
                removeView(this.f4234c);
                this.F.remove(this.f4234c);
            }
        } else {
            if (this.f4234c == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f4234c = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f4234c.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.f4244m;
                if (i2 != 0) {
                    this.f4234c.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.A;
                if (colorStateList != null) {
                    this.f4234c.setTextColor(colorStateList);
                }
            }
            if (!y(this.f4234c)) {
                c(this.f4234c, true);
            }
        }
        TextView textView2 = this.f4234c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.y = charSequence;
    }

    public void setTitleMarginBottom(int i2) {
        this.t = i2;
        requestLayout();
    }

    public void setTitleMarginEnd(int i2) {
        this.r = i2;
        requestLayout();
    }

    public void setTitleMarginStart(int i2) {
        this.q = i2;
        requestLayout();
    }

    public void setTitleMarginTop(int i2) {
        this.s = i2;
        requestLayout();
    }

    public void setTitleTextColor(int i2) {
        setTitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.A = colorStateList;
        TextView textView = this.f4234c;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public final int t(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final int u(List<View> list, int[] iArr) {
        int i2 = iArr[0];
        int i3 = iArr[1];
        int size = list.size();
        int i4 = 0;
        int measuredWidth = 0;
        while (i4 < size) {
            View view = list.get(i4);
            e eVar = (e) view.getLayoutParams();
            int i5 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin - i2;
            int i6 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin - i3;
            int iMax = Math.max(0, i5);
            int iMax2 = Math.max(0, i6);
            int iMax3 = Math.max(0, -i5);
            int iMax4 = Math.max(0, -i6);
            measuredWidth += iMax + view.getMeasuredWidth() + iMax2;
            i4++;
            i3 = iMax4;
            i2 = iMax3;
        }
        return measuredWidth;
    }

    public boolean v() {
        d dVar = this.L;
        return (dVar == null || dVar.f4251c == null) ? false : true;
    }

    public boolean w() {
        ActionMenuView actionMenuView = this.f4233b;
        return actionMenuView != null && actionMenuView.H();
    }

    public void x(int i2) {
        getMenuInflater().inflate(i2, getMenu());
    }

    public final boolean y(View view) {
        return view.getParent() == this || this.F.contains(view);
    }

    public boolean z() {
        ActionMenuView actionMenuView = this.f4233b;
        return actionMenuView != null && actionMenuView.I();
    }
}
