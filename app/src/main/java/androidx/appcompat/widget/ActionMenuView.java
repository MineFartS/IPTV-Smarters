package androidx.appcompat.widget;

import a.b.p.j.g;
import a.b.p.j.i;
import a.b.p.j.m;
import a.b.p.j.n;
import a.b.q.a1;
import a.b.q.f0;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends f0 implements g.b, n {
    public int A;
    public e B;
    public g q;
    public Context r;
    public int s;
    public boolean t;
    public a.b.q.c u;
    public m.a v;
    public g.a w;
    public boolean x;
    public int y;
    public int z;

    public interface a {
        boolean a();

        boolean b();
    }

    public static class b implements m.a {
        @Override // a.b.p.j.m.a
        public void b(g gVar, boolean z) {
        }

        @Override // a.b.p.j.m.a
        public boolean c(g gVar) {
            return false;
        }
    }

    public static class c extends f0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f4160a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public int f4161b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public int f4162c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f4163d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f4164e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f4165f;

        public c(int i2, int i3) {
            super(i2, i3);
            this.f4160a = false;
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(c cVar) {
            super(cVar);
            this.f4160a = cVar.f4160a;
        }
    }

    public class d implements g.a {
        public d() {
        }

        @Override // a.b.p.j.g.a
        public boolean a(g gVar, MenuItem menuItem) {
            e eVar = ActionMenuView.this.B;
            return eVar != null && eVar.onMenuItemClick(menuItem);
        }

        @Override // a.b.p.j.g.a
        public void b(g gVar) {
            g.a aVar = ActionMenuView.this.w;
            if (aVar != null) {
                aVar.b(gVar);
            }
        }
    }

    public interface e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.z = (int) (56.0f * f2);
        this.A = (int) (f2 * 4.0f);
        this.r = context;
        this.s = 0;
    }

    public static int L(View view, int i2, int i3, int i4, int i5) {
        c cVar = (c) view.getLayoutParams();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i4) - i5, View.MeasureSpec.getMode(i4));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z = actionMenuItemView != null && actionMenuItemView.f();
        int i6 = 2;
        if (i3 <= 0 || (z && i3 < 2)) {
            i6 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i3 * i2, Integer.MIN_VALUE), iMakeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i7 = measuredWidth / i2;
            if (measuredWidth % i2 != 0) {
                i7++;
            }
            if (!z || i7 >= 2) {
                i6 = i7;
            }
        }
        cVar.f4163d = !cVar.f4160a && z;
        cVar.f4161b = i6;
        view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i6, 1073741824), iMakeMeasureSpec);
        return i6;
    }

    public void B() {
        a.b.q.c cVar = this.u;
        if (cVar != null) {
            cVar.y();
        }
    }

    @Override // a.b.q.f0
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public c generateDefaultLayoutParams() {
        c cVar = new c(-2, -2);
        ((LinearLayout.LayoutParams) cVar).gravity = 16;
        return cVar;
    }

    @Override // a.b.q.f0
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public c generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    @Override // a.b.q.f0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        c cVar = layoutParams instanceof c ? new c((c) layoutParams) : new c(layoutParams);
        if (((LinearLayout.LayoutParams) cVar).gravity <= 0) {
            ((LinearLayout.LayoutParams) cVar).gravity = 16;
        }
        return cVar;
    }

    public c F() {
        c cVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        cVarGenerateDefaultLayoutParams.f4160a = true;
        return cVarGenerateDefaultLayoutParams;
    }

    public boolean G(int i2) {
        boolean zA = false;
        if (i2 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i2 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i2);
        if (i2 < getChildCount() && (childAt instanceof a)) {
            zA = false | ((a) childAt).a();
        }
        return (i2 <= 0 || !(childAt2 instanceof a)) ? zA : zA | ((a) childAt2).b();
    }

    public boolean H() {
        a.b.q.c cVar = this.u;
        return cVar != null && cVar.B();
    }

    public boolean I() {
        a.b.q.c cVar = this.u;
        return cVar != null && cVar.D();
    }

    public boolean J() {
        a.b.q.c cVar = this.u;
        return cVar != null && cVar.E();
    }

    public boolean K() {
        return this.t;
    }

    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9, types: [boolean, int] */
    public final void M(int i2, int i3) {
        int i4;
        int i5;
        boolean z;
        int i6;
        boolean z2;
        boolean z3;
        int i7;
        ?? r14;
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i3, paddingTop, -2);
        int i8 = size - paddingLeft;
        int i9 = this.z;
        int i10 = i8 / i9;
        int i11 = i8 % i9;
        if (i10 == 0) {
            setMeasuredDimension(i8, 0);
            return;
        }
        int i12 = i9 + (i11 / i10);
        int childCount = getChildCount();
        int iMax = 0;
        int i13 = 0;
        boolean z4 = false;
        int i14 = 0;
        int iMax2 = 0;
        int i15 = 0;
        long j2 = 0;
        while (i13 < childCount) {
            View childAt = getChildAt(i13);
            int i16 = size2;
            if (childAt.getVisibility() != 8) {
                boolean z5 = childAt instanceof ActionMenuItemView;
                int i17 = i14 + 1;
                if (z5) {
                    int i18 = this.A;
                    i7 = i17;
                    r14 = 0;
                    childAt.setPadding(i18, 0, i18, 0);
                } else {
                    i7 = i17;
                    r14 = 0;
                }
                c cVar = (c) childAt.getLayoutParams();
                cVar.f4165f = r14;
                cVar.f4162c = r14;
                cVar.f4161b = r14;
                cVar.f4163d = r14;
                ((LinearLayout.LayoutParams) cVar).leftMargin = r14;
                ((LinearLayout.LayoutParams) cVar).rightMargin = r14;
                cVar.f4164e = z5 && ((ActionMenuItemView) childAt).f();
                int iL = L(childAt, i12, cVar.f4160a ? 1 : i10, childMeasureSpec, paddingTop);
                iMax2 = Math.max(iMax2, iL);
                if (cVar.f4163d) {
                    i15++;
                }
                if (cVar.f4160a) {
                    z4 = true;
                }
                i10 -= iL;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (iL == 1) {
                    j2 |= (long) (1 << i13);
                    iMax = iMax;
                }
                i14 = i7;
            }
            i13++;
            size2 = i16;
        }
        int i19 = size2;
        boolean z6 = z4 && i14 == 2;
        boolean z7 = false;
        while (i15 > 0 && i10 > 0) {
            int i20 = 0;
            int i21 = 0;
            int i22 = Integer.MAX_VALUE;
            long j3 = 0;
            while (i21 < childCount) {
                boolean z8 = z7;
                c cVar2 = (c) getChildAt(i21).getLayoutParams();
                int i23 = iMax;
                if (cVar2.f4163d) {
                    int i24 = cVar2.f4161b;
                    if (i24 < i22) {
                        j3 = 1 << i21;
                        i22 = i24;
                        i20 = 1;
                    } else if (i24 == i22) {
                        i20++;
                        j3 |= 1 << i21;
                    }
                }
                i21++;
                iMax = i23;
                z7 = z8;
            }
            z = z7;
            i6 = iMax;
            j2 |= j3;
            if (i20 > i10) {
                i4 = mode;
                i5 = i8;
                break;
            }
            int i25 = i22 + 1;
            int i26 = 0;
            while (i26 < childCount) {
                View childAt2 = getChildAt(i26);
                c cVar3 = (c) childAt2.getLayoutParams();
                int i27 = i8;
                int i28 = mode;
                long j4 = 1 << i26;
                if ((j3 & j4) == 0) {
                    if (cVar3.f4161b == i25) {
                        j2 |= j4;
                    }
                    z3 = z6;
                } else {
                    if (z6 && cVar3.f4164e && i10 == 1) {
                        int i29 = this.A;
                        z3 = z6;
                        childAt2.setPadding(i29 + i12, 0, i29, 0);
                    } else {
                        z3 = z6;
                    }
                    cVar3.f4161b++;
                    cVar3.f4165f = true;
                    i10--;
                }
                i26++;
                mode = i28;
                i8 = i27;
                z6 = z3;
            }
            iMax = i6;
            z7 = true;
        }
        i4 = mode;
        i5 = i8;
        z = z7;
        i6 = iMax;
        boolean z9 = !z4 && i14 == 1;
        if (i10 <= 0 || j2 == 0 || (i10 >= i14 - 1 && !z9 && iMax2 <= 1)) {
            z2 = z;
        } else {
            float fBitCount = Long.bitCount(j2);
            if (!z9) {
                if ((j2 & 1) != 0 && !((c) getChildAt(0).getLayoutParams()).f4164e) {
                    fBitCount -= 0.5f;
                }
                int i30 = childCount - 1;
                if ((j2 & ((long) (1 << i30))) != 0 && !((c) getChildAt(i30).getLayoutParams()).f4164e) {
                    fBitCount -= 0.5f;
                }
            }
            int i31 = fBitCount > 0.0f ? (int) ((i10 * i12) / fBitCount) : 0;
            z2 = z;
            for (int i32 = 0; i32 < childCount; i32++) {
                if ((j2 & ((long) (1 << i32))) != 0) {
                    View childAt3 = getChildAt(i32);
                    c cVar4 = (c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar4.f4162c = i31;
                        cVar4.f4165f = true;
                        if (i32 == 0 && !cVar4.f4164e) {
                            ((LinearLayout.LayoutParams) cVar4).leftMargin = (-i31) / 2;
                        }
                    } else if (cVar4.f4160a) {
                        cVar4.f4162c = i31;
                        cVar4.f4165f = true;
                        ((LinearLayout.LayoutParams) cVar4).rightMargin = (-i31) / 2;
                    } else {
                        if (i32 != 0) {
                            ((LinearLayout.LayoutParams) cVar4).leftMargin = i31 / 2;
                        }
                        if (i32 != childCount - 1) {
                            ((LinearLayout.LayoutParams) cVar4).rightMargin = i31 / 2;
                        }
                    }
                    z2 = true;
                }
            }
        }
        if (z2) {
            for (int i33 = 0; i33 < childCount; i33++) {
                View childAt4 = getChildAt(i33);
                c cVar5 = (c) childAt4.getLayoutParams();
                if (cVar5.f4165f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar5.f4161b * i12) + cVar5.f4162c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i5, i4 != 1073741824 ? i6 : i19);
    }

    public g N() {
        return this.q;
    }

    public void O(m.a aVar, g.a aVar2) {
        this.v = aVar;
        this.w = aVar2;
    }

    public boolean P() {
        a.b.q.c cVar = this.u;
        return cVar != null && cVar.K();
    }

    @Override // a.b.p.j.g.b
    public boolean a(i iVar) {
        return this.q.L(iVar, 0);
    }

    @Override // a.b.p.j.n
    public void b(g gVar) {
        this.q = gVar;
    }

    @Override // a.b.q.f0, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.q == null) {
            Context context = getContext();
            g gVar = new g(context);
            this.q = gVar;
            gVar.R(new d());
            a.b.q.c cVar = new a.b.q.c(context);
            this.u = cVar;
            cVar.J(true);
            a.b.q.c cVar2 = this.u;
            m.a bVar = this.v;
            if (bVar == null) {
                bVar = new b();
            }
            cVar2.g(bVar);
            this.q.c(this.u, this.r);
            this.u.H(this);
        }
        return this.q;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.u.A();
    }

    public int getPopupTheme() {
        return this.s;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a.b.q.c cVar = this.u;
        if (cVar != null) {
            cVar.c(false);
            if (this.u.E()) {
                this.u.B();
                this.u.K();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        B();
    }

    @Override // a.b.q.f0, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int width;
        int paddingLeft;
        if (!this.x) {
            super.onLayout(z, i2, i3, i4, i5);
            return;
        }
        int childCount = getChildCount();
        int i6 = (i5 - i3) / 2;
        int dividerWidth = getDividerWidth();
        int i7 = i4 - i2;
        int paddingRight = (i7 - getPaddingRight()) - getPaddingLeft();
        boolean zB = a1.b(this);
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.f4160a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (G(i10)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (zB) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) cVar).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) cVar).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i11 = i6 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i11, width, measuredHeight + i11);
                    paddingRight -= measuredWidth;
                    i8 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) cVar).leftMargin) + ((LinearLayout.LayoutParams) cVar).rightMargin;
                    G(i10);
                    i9++;
                }
            }
        }
        if (childCount == 1 && i8 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i12 = (i7 / 2) - (measuredWidth2 / 2);
            int i13 = i6 - (measuredHeight2 / 2);
            childAt2.layout(i12, i13, measuredWidth2 + i12, measuredHeight2 + i13);
            return;
        }
        int i14 = i9 - (i8 ^ 1);
        int iMax = Math.max(0, i14 > 0 ? paddingRight / i14 : 0);
        if (zB) {
            int width2 = getWidth() - getPaddingRight();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt3 = getChildAt(i15);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f4160a) {
                    int i16 = width2 - ((LinearLayout.LayoutParams) cVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i17 = i6 - (measuredHeight3 / 2);
                    childAt3.layout(i16 - measuredWidth3, i17, i16, measuredHeight3 + i17);
                    width2 = i16 - ((measuredWidth3 + ((LinearLayout.LayoutParams) cVar2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt4 = getChildAt(i18);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f4160a) {
                int i19 = paddingLeft2 + ((LinearLayout.LayoutParams) cVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i20 = i6 - (measuredHeight4 / 2);
                childAt4.layout(i19, i20, i19 + measuredWidth4, measuredHeight4 + i20);
                paddingLeft2 = i19 + measuredWidth4 + ((LinearLayout.LayoutParams) cVar3).rightMargin + iMax;
            }
        }
    }

    @Override // a.b.q.f0, android.view.View
    public void onMeasure(int i2, int i3) {
        g gVar;
        boolean z = this.x;
        boolean z2 = View.MeasureSpec.getMode(i2) == 1073741824;
        this.x = z2;
        if (z != z2) {
            this.y = 0;
        }
        int size = View.MeasureSpec.getSize(i2);
        if (this.x && (gVar = this.q) != null && size != this.y) {
            this.y = size;
            gVar.K(true);
        }
        int childCount = getChildCount();
        if (this.x && childCount > 0) {
            M(i2, i3);
            return;
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            c cVar = (c) getChildAt(i4).getLayoutParams();
            ((LinearLayout.LayoutParams) cVar).rightMargin = 0;
            ((LinearLayout.LayoutParams) cVar).leftMargin = 0;
        }
        super.onMeasure(i2, i3);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.u.G(z);
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.B = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.u.I(drawable);
    }

    public void setOverflowReserved(boolean z) {
        this.t = z;
    }

    public void setPopupTheme(int i2) {
        if (this.s != i2) {
            this.s = i2;
            if (i2 == 0) {
                this.r = getContext();
            } else {
                this.r = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public void setPresenter(a.b.q.c cVar) {
        this.u = cVar;
        cVar.H(this);
    }
}
