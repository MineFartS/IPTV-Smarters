package a.b.q;

import a.b.p.j.m;
import a.b.p.j.n;
import a.i.r.b;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatImageView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class c extends a.b.p.j.b implements b.a {
    public a A;
    public RunnableC0009c B;
    public b C;
    public final f D;
    public int E;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public d f557l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Drawable f558m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f559n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f560o;
    public boolean p;
    public int q;
    public int r;
    public int s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public int x;
    public final SparseBooleanArray y;
    public e z;

    public class a extends a.b.p.j.l {
        public a(Context context, a.b.p.j.r rVar, View view) {
            super(context, rVar, view, false, a.b.a.f28l);
            if (!((a.b.p.j.i) rVar.getItem()).l()) {
                View view2 = c.this.f557l;
                f(view2 == null ? (View) c.this.f418j : view2);
            }
            j(c.this.D);
        }

        @Override // a.b.p.j.l
        public void e() {
            c cVar = c.this;
            cVar.A = null;
            cVar.E = 0;
            super.e();
        }
    }

    public class b extends ActionMenuItemView.b {
        public b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.b
        public a.b.p.j.p a() {
            a aVar = c.this.A;
            if (aVar != null) {
                return aVar.c();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: a.b.q.c$c, reason: collision with other inner class name */
    public class RunnableC0009c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public e f563b;

        public RunnableC0009c(e eVar) {
            this.f563b = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (c.this.f412d != null) {
                c.this.f412d.d();
            }
            View view = (View) c.this.f418j;
            if (view != null && view.getWindowToken() != null && this.f563b.m()) {
                c.this.z = this.f563b;
            }
            c.this.B = null;
        }
    }

    public class d extends AppCompatImageView implements ActionMenuView.a {

        public class a extends e0 {

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public final /* synthetic */ c f566k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(View view, c cVar) {
                super(view);
                this.f566k = cVar;
            }

            @Override // a.b.q.e0
            public a.b.p.j.p b() {
                e eVar = c.this.z;
                if (eVar == null) {
                    return null;
                }
                return eVar.c();
            }

            @Override // a.b.q.e0
            public boolean c() {
                c.this.K();
                return true;
            }

            @Override // a.b.q.e0
            public boolean d() {
                c cVar = c.this;
                if (cVar.B != null) {
                    return false;
                }
                cVar.B();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, a.b.a.f27k);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            w0.a(this, getContentDescription());
            setOnTouchListener(new a(this, c.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean b() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            c.this.K();
            return true;
        }

        @Override // android.widget.ImageView
        public boolean setFrame(int i2, int i3, int i4, int i5) {
            boolean frame = super.setFrame(i2, i3, i4, i5);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int iMax = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                a.i.j.l.a.l(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
            }
            return frame;
        }
    }

    public class e extends a.b.p.j.l {
        public e(Context context, a.b.p.j.g gVar, View view, boolean z) {
            super(context, gVar, view, z, a.b.a.f28l);
            h(8388613);
            j(c.this.D);
        }

        @Override // a.b.p.j.l
        public void e() {
            if (c.this.f412d != null) {
                c.this.f412d.close();
            }
            c.this.z = null;
            super.e();
        }
    }

    public class f implements m.a {
        public f() {
        }

        @Override // a.b.p.j.m.a
        public void b(a.b.p.j.g gVar, boolean z) {
            if (gVar instanceof a.b.p.j.r) {
                gVar.D().e(false);
            }
            m.a aVarM = c.this.m();
            if (aVarM != null) {
                aVarM.b(gVar, z);
            }
        }

        @Override // a.b.p.j.m.a
        public boolean c(a.b.p.j.g gVar) {
            if (gVar == c.this.f412d) {
                return false;
            }
            c.this.E = ((a.b.p.j.r) gVar).getItem().getItemId();
            m.a aVarM = c.this.m();
            if (aVarM != null) {
                return aVarM.c(gVar);
            }
            return false;
        }
    }

    public c(Context context) {
        super(context, a.b.g.f88c, a.b.g.f87b);
        this.y = new SparseBooleanArray();
        this.D = new f();
    }

    public Drawable A() {
        d dVar = this.f557l;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f559n) {
            return this.f558m;
        }
        return null;
    }

    public boolean B() {
        Object obj;
        RunnableC0009c runnableC0009c = this.B;
        if (runnableC0009c != null && (obj = this.f418j) != null) {
            ((View) obj).removeCallbacks(runnableC0009c);
            this.B = null;
            return true;
        }
        e eVar = this.z;
        if (eVar == null) {
            return false;
        }
        eVar.b();
        return true;
    }

    public boolean C() {
        a aVar = this.A;
        if (aVar == null) {
            return false;
        }
        aVar.b();
        return true;
    }

    public boolean D() {
        return this.B != null || E();
    }

    public boolean E() {
        e eVar = this.z;
        return eVar != null && eVar.d();
    }

    public void F(Configuration configuration) {
        if (!this.t) {
            this.s = a.b.p.a.b(this.f411c).d();
        }
        a.b.p.j.g gVar = this.f412d;
        if (gVar != null) {
            gVar.K(true);
        }
    }

    public void G(boolean z) {
        this.w = z;
    }

    public void H(ActionMenuView actionMenuView) {
        this.f418j = actionMenuView;
        actionMenuView.b(this.f412d);
    }

    public void I(Drawable drawable) {
        d dVar = this.f557l;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
        } else {
            this.f559n = true;
            this.f558m = drawable;
        }
    }

    public void J(boolean z) {
        this.f560o = z;
        this.p = true;
    }

    public boolean K() {
        a.b.p.j.g gVar;
        if (!this.f560o || E() || (gVar = this.f412d) == null || this.f418j == null || this.B != null || gVar.z().isEmpty()) {
            return false;
        }
        RunnableC0009c runnableC0009c = new RunnableC0009c(new e(this.f411c, this.f412d, this.f557l, true));
        this.B = runnableC0009c;
        ((View) this.f418j).post(runnableC0009c);
        return true;
    }

    @Override // a.b.p.j.b, a.b.p.j.m
    public void b(a.b.p.j.g gVar, boolean z) {
        y();
        super.b(gVar, z);
    }

    @Override // a.b.p.j.b, a.b.p.j.m
    public void c(boolean z) {
        super.c(z);
        ((View) this.f418j).requestLayout();
        a.b.p.j.g gVar = this.f412d;
        boolean z2 = false;
        if (gVar != null) {
            ArrayList<a.b.p.j.i> arrayListS = gVar.s();
            int size = arrayListS.size();
            for (int i2 = 0; i2 < size; i2++) {
                a.i.r.b bVarB = arrayListS.get(i2).b();
                if (bVarB != null) {
                    bVarB.k(this);
                }
            }
        }
        a.b.p.j.g gVar2 = this.f412d;
        ArrayList<a.b.p.j.i> arrayListZ = gVar2 != null ? gVar2.z() : null;
        if (this.f560o && arrayListZ != null) {
            int size2 = arrayListZ.size();
            if (size2 == 1) {
                z2 = !arrayListZ.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z2 = true;
            }
        }
        d dVar = this.f557l;
        if (z2) {
            if (dVar == null) {
                this.f557l = new d(this.f410b);
            }
            ViewGroup viewGroup = (ViewGroup) this.f557l.getParent();
            if (viewGroup != this.f418j) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f557l);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f418j;
                actionMenuView.addView(this.f557l, actionMenuView.F());
            }
        } else if (dVar != null) {
            Object parent = dVar.getParent();
            Object obj = this.f418j;
            if (parent == obj) {
                ((ViewGroup) obj).removeView(this.f557l);
            }
        }
        ((ActionMenuView) this.f418j).setOverflowReserved(this.f560o);
    }

    @Override // a.b.p.j.m
    public boolean d() {
        ArrayList<a.b.p.j.i> arrayListE;
        int size;
        int i2;
        int iL;
        int i3;
        c cVar = this;
        a.b.p.j.g gVar = cVar.f412d;
        View view = null;
        int i4 = 0;
        if (gVar != null) {
            arrayListE = gVar.E();
            size = arrayListE.size();
        } else {
            arrayListE = null;
            size = 0;
        }
        int i5 = cVar.s;
        int i6 = cVar.r;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) cVar.f418j;
        boolean z = false;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            a.b.p.j.i iVar = arrayListE.get(i9);
            if (iVar.o()) {
                i7++;
            } else if (iVar.n()) {
                i8++;
            } else {
                z = true;
            }
            if (cVar.w && iVar.isActionViewExpanded()) {
                i5 = 0;
            }
        }
        if (cVar.f560o && (z || i8 + i7 > i5)) {
            i5--;
        }
        int i10 = i5 - i7;
        SparseBooleanArray sparseBooleanArray = cVar.y;
        sparseBooleanArray.clear();
        if (cVar.u) {
            int i11 = cVar.x;
            iL = i6 / i11;
            i2 = i11 + ((i6 % i11) / iL);
        } else {
            i2 = 0;
            iL = 0;
        }
        int i12 = 0;
        int i13 = 0;
        while (i12 < size) {
            a.b.p.j.i iVar2 = arrayListE.get(i12);
            if (iVar2.o()) {
                View viewN = cVar.n(iVar2, view, viewGroup);
                if (cVar.u) {
                    iL -= ActionMenuView.L(viewN, i2, iL, iMakeMeasureSpec, i4);
                } else {
                    viewN.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                }
                int measuredWidth = viewN.getMeasuredWidth();
                i6 -= measuredWidth;
                if (i13 == 0) {
                    i13 = measuredWidth;
                }
                int groupId = iVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                iVar2.u(true);
                i3 = size;
            } else if (iVar2.n()) {
                int groupId2 = iVar2.getGroupId();
                boolean z2 = sparseBooleanArray.get(groupId2);
                boolean z3 = (i10 > 0 || z2) && i6 > 0 && (!cVar.u || iL > 0);
                boolean z4 = z3;
                i3 = size;
                if (z3) {
                    View viewN2 = cVar.n(iVar2, null, viewGroup);
                    if (cVar.u) {
                        int iL2 = ActionMenuView.L(viewN2, i2, iL, iMakeMeasureSpec, 0);
                        iL -= iL2;
                        if (iL2 == 0) {
                            z4 = false;
                        }
                    } else {
                        viewN2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    }
                    boolean z5 = z4;
                    int measuredWidth2 = viewN2.getMeasuredWidth();
                    i6 -= measuredWidth2;
                    if (i13 == 0) {
                        i13 = measuredWidth2;
                    }
                    z3 = z5 & (!cVar.u ? i6 + i13 <= 0 : i6 < 0);
                }
                if (z3 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z2) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i14 = 0; i14 < i12; i14++) {
                        a.b.p.j.i iVar3 = arrayListE.get(i14);
                        if (iVar3.getGroupId() == groupId2) {
                            if (iVar3.l()) {
                                i10++;
                            }
                            iVar3.u(false);
                        }
                    }
                }
                if (z3) {
                    i10--;
                }
                iVar2.u(z3);
            } else {
                i3 = size;
                iVar2.u(false);
                i12++;
                view = null;
                cVar = this;
                size = i3;
                i4 = 0;
            }
            i12++;
            view = null;
            cVar = this;
            size = i3;
            i4 = 0;
        }
        return true;
    }

    @Override // a.b.p.j.b, a.b.p.j.m
    public void h(Context context, a.b.p.j.g gVar) {
        super.h(context, gVar);
        Resources resources = context.getResources();
        a.b.p.a aVarB = a.b.p.a.b(context);
        if (!this.p) {
            this.f560o = aVarB.h();
        }
        if (!this.v) {
            this.q = aVarB.c();
        }
        if (!this.t) {
            this.s = aVarB.d();
        }
        int measuredWidth = this.q;
        if (this.f560o) {
            if (this.f557l == null) {
                d dVar = new d(this.f410b);
                this.f557l = dVar;
                if (this.f559n) {
                    dVar.setImageDrawable(this.f558m);
                    this.f558m = null;
                    this.f559n = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f557l.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f557l.getMeasuredWidth();
        } else {
            this.f557l = null;
        }
        this.r = measuredWidth;
        this.x = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // a.b.p.j.b
    public void i(a.b.p.j.i iVar, n.a aVar) {
        aVar.e(iVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f418j);
        if (this.C == null) {
            this.C = new b();
        }
        actionMenuItemView.setPopupCallback(this.C);
    }

    @Override // a.b.p.j.b, a.b.p.j.m
    public boolean j(a.b.p.j.r rVar) {
        boolean z = false;
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        a.b.p.j.r rVar2 = rVar;
        while (rVar2.e0() != this.f412d) {
            rVar2 = (a.b.p.j.r) rVar2.e0();
        }
        View viewZ = z(rVar2.getItem());
        if (viewZ == null) {
            return false;
        }
        this.E = rVar.getItem().getItemId();
        int size = rVar.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            MenuItem item = rVar.getItem(i2);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i2++;
        }
        a aVar = new a(this.f411c, rVar, viewZ);
        this.A = aVar;
        aVar.g(z);
        this.A.k();
        super.j(rVar);
        return true;
    }

    @Override // a.b.p.j.b
    public boolean l(ViewGroup viewGroup, int i2) {
        if (viewGroup.getChildAt(i2) == this.f557l) {
            return false;
        }
        return super.l(viewGroup, i2);
    }

    @Override // a.b.p.j.b
    public View n(a.b.p.j.i iVar, View view, ViewGroup viewGroup) {
        View actionView = iVar.getActionView();
        if (actionView == null || iVar.j()) {
            actionView = super.n(iVar, view, viewGroup);
        }
        actionView.setVisibility(iVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // a.b.p.j.b
    public a.b.p.j.n o(ViewGroup viewGroup) {
        a.b.p.j.n nVar = this.f418j;
        a.b.p.j.n nVarO = super.o(viewGroup);
        if (nVar != nVarO) {
            ((ActionMenuView) nVarO).setPresenter(this);
        }
        return nVarO;
    }

    @Override // a.b.p.j.b
    public boolean q(int i2, a.b.p.j.i iVar) {
        return iVar.l();
    }

    public boolean y() {
        return B() | C();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View z(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f418j;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if ((childAt instanceof n.a) && ((n.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }
}
