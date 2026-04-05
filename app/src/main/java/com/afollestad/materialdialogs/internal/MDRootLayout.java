package com.afollestad.materialdialogs.internal;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ScrollView;
import androidx.recyclerview.widget.RecyclerView;
import c.a.a.e;
import c.a.a.f;

/* JADX INFO: loaded from: classes.dex */
public class MDRootLayout extends ViewGroup {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MDButton[] f18854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f18856d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f18857e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f18858f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f18859g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public f f18860h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f18861i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f18862j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f18863k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f18864l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f18865m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f18866n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f18867o;
    public c.a.a.a p;
    public int q;
    public Paint r;
    public ViewTreeObserver.OnScrollChangedListener s;
    public ViewTreeObserver.OnScrollChangedListener t;
    public int u;

    public class a implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f18868b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f18869c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f18870d;

        public a(View view, boolean z, boolean z2) {
            this.f18868b = view;
            this.f18869c = z;
            this.f18870d = z2;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (this.f18868b.getMeasuredHeight() == 0) {
                return true;
            }
            if (MDRootLayout.l((WebView) this.f18868b)) {
                MDRootLayout.this.h((ViewGroup) this.f18868b, this.f18869c, this.f18870d);
            } else {
                if (this.f18869c) {
                    MDRootLayout.this.f18858f = false;
                }
                if (this.f18870d) {
                    MDRootLayout.this.f18859g = false;
                }
            }
            this.f18868b.getViewTreeObserver().removeOnPreDrawListener(this);
            return true;
        }
    }

    public class b extends RecyclerView.u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f18872a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f18873b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f18874c;

        public b(ViewGroup viewGroup, boolean z, boolean z2) {
            this.f18872a = viewGroup;
            this.f18873b = z;
            this.f18874c = z2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(RecyclerView recyclerView, int i2, int i3) {
            super.b(recyclerView, i2, i3);
            MDButton[] mDButtonArr = MDRootLayout.this.f18854b;
            int length = mDButtonArr.length;
            boolean z = false;
            int i4 = 0;
            while (true) {
                if (i4 < length) {
                    MDButton mDButton = mDButtonArr[i4];
                    if (mDButton != null && mDButton.getVisibility() != 8) {
                        z = true;
                        break;
                    }
                    i4++;
                } else {
                    break;
                }
            }
            MDRootLayout.this.p(this.f18872a, this.f18873b, this.f18874c, z);
            MDRootLayout.this.invalidate();
        }
    }

    public class c implements ViewTreeObserver.OnScrollChangedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f18876a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f18877b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f18878c;

        public c(ViewGroup viewGroup, boolean z, boolean z2) {
            this.f18876a = viewGroup;
            this.f18877b = z;
            this.f18878c = z2;
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            MDButton[] mDButtonArr = MDRootLayout.this.f18854b;
            int length = mDButtonArr.length;
            boolean z = false;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    MDButton mDButton = mDButtonArr[i2];
                    if (mDButton != null && mDButton.getVisibility() != 8) {
                        z = true;
                        break;
                    }
                    i2++;
                } else {
                    break;
                }
            }
            ViewGroup viewGroup = this.f18876a;
            if (viewGroup instanceof WebView) {
                MDRootLayout.this.q((WebView) viewGroup, this.f18877b, this.f18878c, z);
            } else {
                MDRootLayout.this.p(viewGroup, this.f18877b, this.f18878c, z);
            }
            MDRootLayout.this.invalidate();
        }
    }

    public static /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18880a;

        static {
            int[] iArr = new int[c.a.a.a.values().length];
            f18880a = iArr;
            try {
                iArr[c.a.a.a.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18880a[c.a.a.a.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public MDRootLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18854b = new MDButton[3];
        this.f18858f = false;
        this.f18859g = false;
        this.f18860h = f.ADAPTIVE;
        this.f18861i = false;
        this.f18862j = true;
        this.p = c.a.a.a.START;
        o(context, attributeSet, 0);
    }

    public static boolean i(AdapterView adapterView) {
        if (adapterView.getLastVisiblePosition() == -1) {
            return false;
        }
        return !(adapterView.getFirstVisiblePosition() == 0) || !(adapterView.getLastVisiblePosition() == adapterView.getCount() - 1) || adapterView.getChildCount() <= 0 || adapterView.getChildAt(0).getTop() < adapterView.getPaddingTop() || adapterView.getChildAt(adapterView.getChildCount() - 1).getBottom() > adapterView.getHeight() - adapterView.getPaddingBottom();
    }

    public static boolean j(RecyclerView recyclerView) {
        return (recyclerView == null || recyclerView.getLayoutManager() == null || !recyclerView.getLayoutManager().m()) ? false : true;
    }

    public static boolean k(ScrollView scrollView) {
        if (scrollView.getChildCount() == 0) {
            return false;
        }
        return (scrollView.getMeasuredHeight() - scrollView.getPaddingTop()) - scrollView.getPaddingBottom() < scrollView.getChildAt(0).getMeasuredHeight();
    }

    public static boolean l(WebView webView) {
        return ((float) webView.getMeasuredHeight()) < ((float) webView.getContentHeight()) * webView.getScale();
    }

    public static View m(ViewGroup viewGroup) {
        if (viewGroup == null || viewGroup.getChildCount() == 0) {
            return null;
        }
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt.getVisibility() == 0 && childAt.getBottom() == viewGroup.getMeasuredHeight()) {
                return childAt;
            }
        }
        return null;
    }

    public static View n(ViewGroup viewGroup) {
        if (viewGroup == null || viewGroup.getChildCount() == 0) {
            return null;
        }
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt.getVisibility() == 0 && childAt.getTop() == 0) {
                return childAt;
            }
        }
        return null;
    }

    public static boolean s(View view) {
        boolean z = (view == null || view.getVisibility() == 8) ? false : true;
        if (z && (view instanceof MDButton)) {
            return ((MDButton) view).getText().toString().trim().length() > 0;
        }
        return z;
    }

    public final void h(ViewGroup viewGroup, boolean z, boolean z2) {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver.OnScrollChangedListener onScrollChangedListener;
        if ((z2 || this.s != null) && !(z2 && this.t == null)) {
            return;
        }
        if (viewGroup instanceof RecyclerView) {
            b bVar = new b(viewGroup, z, z2);
            RecyclerView recyclerView = (RecyclerView) viewGroup;
            recyclerView.l(bVar);
            bVar.b(recyclerView, 0, 0);
            return;
        }
        c cVar = new c(viewGroup, z, z2);
        if (z2) {
            this.t = cVar;
            viewTreeObserver = viewGroup.getViewTreeObserver();
            onScrollChangedListener = this.t;
        } else {
            this.s = cVar;
            viewTreeObserver = viewGroup.getViewTreeObserver();
            onScrollChangedListener = this.s;
        }
        viewTreeObserver.addOnScrollChangedListener(onScrollChangedListener);
        cVar.onScrollChanged();
    }

    public final void o(Context context, AttributeSet attributeSet, int i2) {
        Resources resources = context.getResources();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.u, i2, 0);
        this.f18863k = typedArrayObtainStyledAttributes.getBoolean(e.v, true);
        typedArrayObtainStyledAttributes.recycle();
        this.f18865m = resources.getDimensionPixelSize(c.a.a.c.f5024g);
        this.f18866n = resources.getDimensionPixelSize(c.a.a.c.f5018a);
        this.q = resources.getDimensionPixelSize(c.a.a.c.f5020c);
        this.f18867o = resources.getDimensionPixelSize(c.a.a.c.f5019b);
        this.r = new Paint();
        this.u = resources.getDimensionPixelSize(c.a.a.c.f5022e);
        this.r.setColor(c.a.a.h.a.a(context, c.a.a.b.f5017a));
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        View view = this.f18857e;
        if (view != null) {
            if (this.f18858f) {
                canvas.drawRect(0.0f, r0 - this.u, getMeasuredWidth(), view.getTop(), this.r);
            }
            if (this.f18859g) {
                canvas.drawRect(0.0f, this.f18857e.getBottom(), getMeasuredWidth(), r0 + this.u, this.r);
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getId() == c.a.a.d.f5028d) {
                this.f18856d = childAt;
            } else if (childAt.getId() == c.a.a.d.f5026b) {
                this.f18854b[0] = (MDButton) childAt;
            } else if (childAt.getId() == c.a.a.d.f5025a) {
                this.f18854b[1] = (MDButton) childAt;
            } else if (childAt.getId() == c.a.a.d.f5027c) {
                this.f18854b[2] = (MDButton) childAt;
            } else {
                this.f18857e = childAt;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int measuredWidth;
        int measuredWidth2;
        MDButton mDButton;
        int measuredWidth3;
        int measuredWidth4;
        int measuredWidth5;
        int measuredWidth6;
        int measuredWidth7;
        int measuredWidth8;
        if (s(this.f18856d)) {
            int measuredHeight = this.f18856d.getMeasuredHeight() + i3;
            this.f18856d.layout(i2, i3, i4, measuredHeight);
            i3 = measuredHeight;
        } else if (!this.f18864l && this.f18862j) {
            i3 += this.f18865m;
        }
        if (s(this.f18857e)) {
            View view = this.f18857e;
            view.layout(i2, i3, i4, view.getMeasuredHeight() + i3);
        }
        if (this.f18861i) {
            int measuredHeight2 = i5 - this.f18866n;
            for (MDButton mDButton2 : this.f18854b) {
                if (s(mDButton2)) {
                    mDButton2.layout(i2, measuredHeight2 - mDButton2.getMeasuredHeight(), i4, measuredHeight2);
                    measuredHeight2 -= mDButton2.getMeasuredHeight();
                }
            }
        } else {
            if (this.f18862j) {
                i5 -= this.f18866n;
            }
            int i6 = i5 - this.f18867o;
            int measuredWidth9 = this.q;
            if (s(this.f18854b[2])) {
                if (this.p == c.a.a.a.END) {
                    measuredWidth7 = i2 + measuredWidth9;
                    measuredWidth8 = this.f18854b[2].getMeasuredWidth() + measuredWidth7;
                    measuredWidth = -1;
                } else {
                    int i7 = i4 - measuredWidth9;
                    measuredWidth7 = i7 - this.f18854b[2].getMeasuredWidth();
                    measuredWidth8 = i7;
                    measuredWidth = measuredWidth7;
                }
                this.f18854b[2].layout(measuredWidth7, i6, measuredWidth8, i5);
                measuredWidth9 += this.f18854b[2].getMeasuredWidth();
            } else {
                measuredWidth = -1;
            }
            if (s(this.f18854b[1])) {
                c.a.a.a aVar = this.p;
                if (aVar == c.a.a.a.END) {
                    measuredWidth5 = measuredWidth9 + i2;
                    measuredWidth6 = this.f18854b[1].getMeasuredWidth() + measuredWidth5;
                } else if (aVar == c.a.a.a.START) {
                    measuredWidth6 = i4 - measuredWidth9;
                    measuredWidth5 = measuredWidth6 - this.f18854b[1].getMeasuredWidth();
                } else {
                    measuredWidth5 = this.q + i2;
                    measuredWidth6 = this.f18854b[1].getMeasuredWidth() + measuredWidth5;
                    measuredWidth2 = measuredWidth6;
                    this.f18854b[1].layout(measuredWidth5, i6, measuredWidth6, i5);
                }
                measuredWidth2 = -1;
                this.f18854b[1].layout(measuredWidth5, i6, measuredWidth6, i5);
            } else {
                measuredWidth2 = -1;
            }
            if (s(this.f18854b[0])) {
                c.a.a.a aVar2 = this.p;
                if (aVar2 == c.a.a.a.END) {
                    measuredWidth3 = i4 - this.q;
                    measuredWidth4 = measuredWidth3 - this.f18854b[0].getMeasuredWidth();
                } else if (aVar2 == c.a.a.a.START) {
                    measuredWidth4 = i2 + this.q;
                    measuredWidth3 = this.f18854b[0].getMeasuredWidth() + measuredWidth4;
                } else {
                    if (measuredWidth2 != -1 || measuredWidth == -1) {
                        if (measuredWidth == -1 && measuredWidth2 != -1) {
                            mDButton = this.f18854b[0];
                        } else if (measuredWidth == -1) {
                            measuredWidth2 = ((i4 - i2) / 2) - (this.f18854b[0].getMeasuredWidth() / 2);
                            mDButton = this.f18854b[0];
                        }
                        measuredWidth = measuredWidth2 + mDButton.getMeasuredWidth();
                    } else {
                        measuredWidth2 = measuredWidth - this.f18854b[0].getMeasuredWidth();
                    }
                    measuredWidth3 = measuredWidth;
                    measuredWidth4 = measuredWidth2;
                }
                this.f18854b[0].layout(measuredWidth4, i6, measuredWidth3, i5);
            }
        }
        t(this.f18857e, true, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0110  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r12, int r13) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.afollestad.materialdialogs.internal.MDRootLayout.onMeasure(int, int):void");
    }

    public final void p(ViewGroup viewGroup, boolean z, boolean z2, boolean z3) {
        if (z && viewGroup.getChildCount() > 0) {
            View view = this.f18856d;
            this.f18858f = (view == null || view.getVisibility() == 8 || viewGroup.getScrollY() + viewGroup.getPaddingTop() <= viewGroup.getChildAt(0).getTop()) ? false : true;
        }
        if (!z2 || viewGroup.getChildCount() <= 0) {
            return;
        }
        this.f18859g = z3 && (viewGroup.getScrollY() + viewGroup.getHeight()) - viewGroup.getPaddingBottom() < viewGroup.getChildAt(viewGroup.getChildCount() - 1).getBottom();
    }

    public final void q(WebView webView, boolean z, boolean z2, boolean z3) {
        if (z) {
            View view = this.f18856d;
            this.f18858f = (view == null || view.getVisibility() == 8 || webView.getScrollY() + webView.getPaddingTop() <= 0) ? false : true;
        }
        if (z2) {
            this.f18859g = z3 && ((float) ((webView.getScrollY() + webView.getMeasuredHeight()) - webView.getPaddingBottom())) < ((float) webView.getContentHeight()) * webView.getScale();
        }
    }

    public final void r() {
        c.a.a.a aVar;
        if (Build.VERSION.SDK_INT >= 17 && getResources().getConfiguration().getLayoutDirection() == 1) {
            int i2 = d.f18880a[this.p.ordinal()];
            if (i2 == 1) {
                aVar = c.a.a.a.END;
            } else if (i2 != 2) {
                return;
            } else {
                aVar = c.a.a.a.START;
            }
            this.p = aVar;
        }
    }

    public void setButtonGravity(c.a.a.a aVar) {
        this.p = aVar;
        r();
    }

    public void setButtonStackedGravity(c.a.a.a aVar) {
        for (MDButton mDButton : this.f18854b) {
            if (mDButton != null) {
                mDButton.setStackedGravity(aVar);
            }
        }
    }

    public void setDividerColor(int i2) {
        this.r.setColor(i2);
        invalidate();
    }

    public void setMaxHeight(int i2) {
        this.f18855c = i2;
    }

    public void setStackingBehavior(f fVar) {
        this.f18860h = fVar;
        invalidate();
    }

    public final void t(View view, boolean z, boolean z2) {
        ViewGroup viewGroup;
        if (view == null) {
            return;
        }
        if (view instanceof ScrollView) {
            ScrollView scrollView = (ScrollView) view;
            boolean zK = k(scrollView);
            viewGroup = scrollView;
            if (!zK) {
                if (z) {
                    this.f18858f = false;
                }
                if (!z2) {
                    return;
                }
                this.f18859g = false;
                return;
            }
            h(viewGroup, z, z2);
        }
        if (view instanceof AdapterView) {
            AdapterView adapterView = (AdapterView) view;
            boolean zI = i(adapterView);
            viewGroup = adapterView;
            if (!zI) {
                if (z) {
                    this.f18858f = false;
                }
                if (!z2) {
                    return;
                }
                this.f18859g = false;
                return;
            }
        } else {
            if (view instanceof WebView) {
                view.getViewTreeObserver().addOnPreDrawListener(new a(view, z, z2));
                return;
            }
            if (!(view instanceof RecyclerView)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup2 = (ViewGroup) view;
                    View viewN = n(viewGroup2);
                    t(viewN, z, z2);
                    View viewM = m(viewGroup2);
                    if (viewM != viewN) {
                        t(viewM, false, true);
                        return;
                    }
                    return;
                }
                return;
            }
            boolean zJ = j((RecyclerView) view);
            if (z) {
                this.f18858f = zJ;
            }
            if (z2) {
                this.f18859g = zJ;
            }
            if (!zJ) {
                return;
            } else {
                viewGroup = (ViewGroup) view;
            }
        }
        h(viewGroup, z, z2);
    }
}
