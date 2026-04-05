package com.google.android.material.tabs;

import a.b.q.w0;
import a.i.r.g0.c;
import a.i.r.v;
import a.i.r.x;
import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import c.f.a.d.k;
import c.f.a.d.l;
import com.facebook.ads.AdError;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

/* JADX INFO: loaded from: classes2.dex */
@ViewPager.e
public class TabLayout extends HorizontalScrollView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f24504b = k.f15000h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a.i.q.f<g> f24505c = new a.i.q.h(16);
    public int A;
    public int B;
    public int C;
    public boolean D;
    public boolean E;
    public int F;
    public boolean G;
    public c.f.a.d.m0.b H;
    public c I;
    public final ArrayList<c> J;
    public c K;
    public ValueAnimator L;
    public ViewPager M;
    public a.e0.a.a N;
    public DataSetObserver O;
    public h P;
    public b Q;
    public boolean R;
    public final a.i.q.f<i> S;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList<g> f24506d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public g f24507e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f f24508f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f24509g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f24510h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f24511i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f24512j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f24513k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ColorStateList f24514l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ColorStateList f24515m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ColorStateList f24516n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Drawable f24517o;
    public int p;
    public PorterDuff.Mode q;
    public float r;
    public float s;
    public final int t;
    public int u;
    public final int v;
    public final int w;
    public final int x;
    public int y;
    public int z;

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    public class b implements ViewPager.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f24519a;

        public b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void a(ViewPager viewPager, a.e0.a.a aVar, a.e0.a.a aVar2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.M == viewPager) {
                tabLayout.H(aVar2, this.f24519a);
            }
        }

        public void b(boolean z) {
            this.f24519a = z;
        }
    }

    @Deprecated
    public interface c<T extends g> {
        void a(T t);

        void b(T t);

        void c(T t);
    }

    public interface d extends c<g> {
    }

    public class e extends DataSetObserver {
        public e() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            TabLayout.this.A();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            TabLayout.this.A();
        }
    }

    public class f extends LinearLayout {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ValueAnimator f24522b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f24523c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f24524d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f24525e;

        public class a implements ValueAnimator.AnimatorUpdateListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ View f24527b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ View f24528c;

            public a(View view, View view2) {
                this.f24527b = view;
                this.f24528c = view2;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                f.this.g(this.f24527b, this.f24528c, valueAnimator.getAnimatedFraction());
            }
        }

        public class b extends AnimatorListenerAdapter {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ int f24530b;

            public b(int i2) {
                this.f24530b = i2;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                f.this.f24523c = this.f24530b;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                f.this.f24523c = this.f24530b;
            }
        }

        public f(Context context) {
            super(context);
            this.f24523c = -1;
            this.f24525e = -1;
            setWillNotDraw(false);
        }

        public void b(int i2, int i3) {
            ValueAnimator valueAnimator = this.f24522b;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f24522b.cancel();
            }
            h(true, i2, i3);
        }

        public boolean c() {
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                if (getChildAt(i2).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        public final void d() {
            View childAt = getChildAt(this.f24523c);
            c.f.a.d.m0.b bVar = TabLayout.this.H;
            TabLayout tabLayout = TabLayout.this;
            bVar.d(tabLayout, childAt, tabLayout.f24517o);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
        @Override // android.view.View
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void draw(android.graphics.Canvas r6) {
            /*
                r5 = this;
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                android.graphics.drawable.Drawable r0 = r0.f24517o
                android.graphics.Rect r0 = r0.getBounds()
                int r0 = r0.height()
                if (r0 >= 0) goto L16
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                android.graphics.drawable.Drawable r0 = r0.f24517o
                int r0 = r0.getIntrinsicHeight()
            L16:
                com.google.android.material.tabs.TabLayout r1 = com.google.android.material.tabs.TabLayout.this
                int r1 = r1.B
                r2 = 0
                if (r1 == 0) goto L37
                r3 = 1
                r4 = 2
                if (r1 == r3) goto L28
                if (r1 == r4) goto L41
                r0 = 3
                if (r1 == r0) goto L3d
                r0 = 0
                goto L41
            L28:
                int r1 = r5.getHeight()
                int r1 = r1 - r0
                int r2 = r1 / 2
                int r1 = r5.getHeight()
                int r1 = r1 + r0
                int r0 = r1 / 2
                goto L41
            L37:
                int r1 = r5.getHeight()
                int r2 = r1 - r0
            L3d:
                int r0 = r5.getHeight()
            L41:
                com.google.android.material.tabs.TabLayout r1 = com.google.android.material.tabs.TabLayout.this
                android.graphics.drawable.Drawable r1 = r1.f24517o
                android.graphics.Rect r1 = r1.getBounds()
                int r1 = r1.width()
                if (r1 <= 0) goto L8e
                com.google.android.material.tabs.TabLayout r1 = com.google.android.material.tabs.TabLayout.this
                android.graphics.drawable.Drawable r1 = r1.f24517o
                android.graphics.Rect r1 = r1.getBounds()
                com.google.android.material.tabs.TabLayout r3 = com.google.android.material.tabs.TabLayout.this
                android.graphics.drawable.Drawable r3 = r3.f24517o
                int r4 = r1.left
                int r1 = r1.right
                r3.setBounds(r4, r2, r1, r0)
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                android.graphics.drawable.Drawable r1 = r0.f24517o
                int r0 = com.google.android.material.tabs.TabLayout.b(r0)
                if (r0 == 0) goto L8b
                android.graphics.drawable.Drawable r1 = a.i.j.l.a.r(r1)
                int r0 = android.os.Build.VERSION.SDK_INT
                r2 = 21
                if (r0 != r2) goto L82
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                int r0 = com.google.android.material.tabs.TabLayout.b(r0)
                android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
                r1.setColorFilter(r0, r2)
                goto L8b
            L82:
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                int r0 = com.google.android.material.tabs.TabLayout.b(r0)
                a.i.j.l.a.n(r1, r0)
            L8b:
                r1.draw(r6)
            L8e:
                super.draw(r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.f.draw(android.graphics.Canvas):void");
        }

        public void e(int i2, float f2) {
            ValueAnimator valueAnimator = this.f24522b;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f24522b.cancel();
            }
            this.f24523c = i2;
            this.f24524d = f2;
            g(getChildAt(i2), getChildAt(this.f24523c + 1), this.f24524d);
        }

        public void f(int i2) {
            Rect bounds = TabLayout.this.f24517o.getBounds();
            TabLayout.this.f24517o.setBounds(bounds.left, 0, bounds.right, i2);
            requestLayout();
        }

        public final void g(View view, View view2, float f2) {
            if (view != null && view.getWidth() > 0) {
                c.f.a.d.m0.b bVar = TabLayout.this.H;
                TabLayout tabLayout = TabLayout.this;
                bVar.c(tabLayout, view, view2, f2, tabLayout.f24517o);
            } else {
                Drawable drawable = TabLayout.this.f24517o;
                drawable.setBounds(-1, drawable.getBounds().top, -1, TabLayout.this.f24517o.getBounds().bottom);
            }
            x.g0(this);
        }

        public final void h(boolean z, int i2, int i3) {
            View childAt = getChildAt(this.f24523c);
            View childAt2 = getChildAt(i2);
            if (childAt2 == null) {
                d();
                return;
            }
            a aVar = new a(childAt, childAt2);
            if (!z) {
                this.f24522b.removeAllUpdateListeners();
                this.f24522b.addUpdateListener(aVar);
                return;
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f24522b = valueAnimator;
            valueAnimator.setInterpolator(c.f.a.d.m.a.f15043b);
            valueAnimator.setDuration(i3);
            valueAnimator.setFloatValues(0.0f, 1.0f);
            valueAnimator.addUpdateListener(aVar);
            valueAnimator.addListener(new b(i2));
            valueAnimator.start();
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
            super.onLayout(z, i2, i3, i4, i5);
            ValueAnimator valueAnimator = this.f24522b;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                d();
            } else {
                h(false, this.f24523c, -1);
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i2, int i3) {
            super.onMeasure(i2, i3);
            if (View.MeasureSpec.getMode(i2) != 1073741824) {
                return;
            }
            TabLayout tabLayout = TabLayout.this;
            boolean z = true;
            if (tabLayout.z == 1 || tabLayout.C == 2) {
                int childCount = getChildCount();
                int iMax = 0;
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = getChildAt(i4);
                    if (childAt.getVisibility() == 0) {
                        iMax = Math.max(iMax, childAt.getMeasuredWidth());
                    }
                }
                if (iMax <= 0) {
                    return;
                }
                if (iMax * childCount <= getMeasuredWidth() - (((int) c.f.a.d.d0.k.b(getContext(), 16)) * 2)) {
                    boolean z2 = false;
                    for (int i5 = 0; i5 < childCount; i5++) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i5).getLayoutParams();
                        if (layoutParams.width != iMax || layoutParams.weight != 0.0f) {
                            layoutParams.width = iMax;
                            layoutParams.weight = 0.0f;
                            z2 = true;
                        }
                    }
                    z = z2;
                } else {
                    TabLayout tabLayout2 = TabLayout.this;
                    tabLayout2.z = 0;
                    tabLayout2.O(false);
                }
                if (z) {
                    super.onMeasure(i2, i3);
                }
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onRtlPropertiesChanged(int i2) {
            super.onRtlPropertiesChanged(i2);
            if (Build.VERSION.SDK_INT >= 23 || this.f24525e == i2) {
                return;
            }
            requestLayout();
            this.f24525e = i2;
        }
    }

    public static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f24532a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Drawable f24533b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public CharSequence f24534c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public CharSequence f24535d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public View f24537f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public TabLayout f24539h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public i f24540i;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f24536e = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f24538g = 1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f24541j = -1;

        public View e() {
            return this.f24537f;
        }

        public Drawable f() {
            return this.f24533b;
        }

        public int g() {
            return this.f24536e;
        }

        public int h() {
            return this.f24538g;
        }

        public CharSequence i() {
            return this.f24534c;
        }

        public boolean j() {
            TabLayout tabLayout = this.f24539h;
            if (tabLayout != null) {
                return tabLayout.getSelectedTabPosition() == this.f24536e;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        public void k() {
            this.f24539h = null;
            this.f24540i = null;
            this.f24532a = null;
            this.f24533b = null;
            this.f24541j = -1;
            this.f24534c = null;
            this.f24535d = null;
            this.f24536e = -1;
            this.f24537f = null;
        }

        public void l() {
            TabLayout tabLayout = this.f24539h;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            tabLayout.F(this);
        }

        public g m(CharSequence charSequence) {
            this.f24535d = charSequence;
            s();
            return this;
        }

        public g n(int i2) {
            return o(LayoutInflater.from(this.f24540i.getContext()).inflate(i2, (ViewGroup) this.f24540i, false));
        }

        public g o(View view) {
            this.f24537f = view;
            s();
            return this;
        }

        public g p(Drawable drawable) {
            this.f24533b = drawable;
            TabLayout tabLayout = this.f24539h;
            if (tabLayout.z == 1 || tabLayout.C == 2) {
                tabLayout.O(true);
            }
            s();
            if (c.f.a.d.o.b.f15202a && this.f24540i.l() && this.f24540i.f24549f.isVisible()) {
                this.f24540i.invalidate();
            }
            return this;
        }

        public void q(int i2) {
            this.f24536e = i2;
        }

        public g r(CharSequence charSequence) {
            if (TextUtils.isEmpty(this.f24535d) && !TextUtils.isEmpty(charSequence)) {
                this.f24540i.setContentDescription(charSequence);
            }
            this.f24534c = charSequence;
            s();
            return this;
        }

        public void s() {
            i iVar = this.f24540i;
            if (iVar != null) {
                iVar.t();
            }
        }
    }

    public static class h implements ViewPager.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakReference<TabLayout> f24542a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f24543b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f24544c;

        public h(TabLayout tabLayout) {
            this.f24542a = new WeakReference<>(tabLayout);
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void a(int i2, float f2, int i3) {
            TabLayout tabLayout = this.f24542a.get();
            if (tabLayout != null) {
                int i4 = this.f24544c;
                tabLayout.J(i2, f2, i4 != 2 || this.f24543b == 1, (i4 == 2 && this.f24543b == 0) ? false : true);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void b(int i2) {
            this.f24543b = this.f24544c;
            this.f24544c = i2;
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void c(int i2) {
            TabLayout tabLayout = this.f24542a.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i2 || i2 >= tabLayout.getTabCount()) {
                return;
            }
            int i3 = this.f24544c;
            tabLayout.G(tabLayout.x(i2), i3 == 0 || (i3 == 2 && this.f24543b == 0));
        }

        public void d() {
            this.f24544c = 0;
            this.f24543b = 0;
        }
    }

    public final class i extends LinearLayout {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public g f24545b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextView f24546c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ImageView f24547d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public View f24548e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public c.f.a.d.o.a f24549f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public View f24550g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public TextView f24551h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public ImageView f24552i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Drawable f24553j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f24554k;

        public class a implements View.OnLayoutChangeListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ View f24556b;

            public a(View view) {
                this.f24556b = view;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                if (this.f24556b.getVisibility() == 0) {
                    i.this.s(this.f24556b);
                }
            }
        }

        public i(Context context) {
            super(context);
            this.f24554k = 2;
            u(context);
            x.B0(this, TabLayout.this.f24509g, TabLayout.this.f24510h, TabLayout.this.f24511i, TabLayout.this.f24512j);
            setGravity(17);
            setOrientation(!TabLayout.this.D ? 1 : 0);
            setClickable(true);
            x.C0(this, v.b(getContext(), AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE));
        }

        private c.f.a.d.o.a getBadge() {
            return this.f24549f;
        }

        private c.f.a.d.o.a getOrCreateBadge() {
            if (this.f24549f == null) {
                this.f24549f = c.f.a.d.o.a.c(getContext());
            }
            r();
            c.f.a.d.o.a aVar = this.f24549f;
            if (aVar != null) {
                return aVar;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        @Override // android.view.ViewGroup, android.view.View
        public void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.f24553j;
            boolean state = false;
            if (drawable != null && drawable.isStateful()) {
                state = false | this.f24553j.setState(drawableState);
            }
            if (state) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        public final void f(View view) {
            if (view == null) {
                return;
            }
            view.addOnLayoutChangeListener(new a(view));
        }

        public final float g(Layout layout, int i2, float f2) {
            return layout.getLineWidth(i2) * (f2 / layout.getPaint().getTextSize());
        }

        public int getContentHeight() {
            View[] viewArr = {this.f24546c, this.f24547d, this.f24550g};
            int iMax = 0;
            int iMin = 0;
            boolean z = false;
            for (int i2 = 0; i2 < 3; i2++) {
                View view = viewArr[i2];
                if (view != null && view.getVisibility() == 0) {
                    iMin = z ? Math.min(iMin, view.getTop()) : view.getTop();
                    iMax = z ? Math.max(iMax, view.getBottom()) : view.getBottom();
                    z = true;
                }
            }
            return iMax - iMin;
        }

        public int getContentWidth() {
            View[] viewArr = {this.f24546c, this.f24547d, this.f24550g};
            int iMax = 0;
            int iMin = 0;
            boolean z = false;
            for (int i2 = 0; i2 < 3; i2++) {
                View view = viewArr[i2];
                if (view != null && view.getVisibility() == 0) {
                    iMin = z ? Math.min(iMin, view.getLeft()) : view.getLeft();
                    iMax = z ? Math.max(iMax, view.getRight()) : view.getRight();
                    z = true;
                }
            }
            return iMax - iMin;
        }

        public g getTab() {
            return this.f24545b;
        }

        public final void h(boolean z) {
            setClipChildren(z);
            setClipToPadding(z);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(z);
                viewGroup.setClipToPadding(z);
            }
        }

        public final FrameLayout i() {
            FrameLayout frameLayout = new FrameLayout(getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            return frameLayout;
        }

        public final void j(Canvas canvas) {
            Drawable drawable = this.f24553j;
            if (drawable != null) {
                drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                this.f24553j.draw(canvas);
            }
        }

        public final FrameLayout k(View view) {
            if ((view == this.f24547d || view == this.f24546c) && c.f.a.d.o.b.f15202a) {
                return (FrameLayout) view.getParent();
            }
            return null;
        }

        public final boolean l() {
            return this.f24549f != null;
        }

        public final void m() {
            ViewGroup viewGroup;
            if (c.f.a.d.o.b.f15202a) {
                FrameLayout frameLayoutI = i();
                addView(frameLayoutI, 0);
                viewGroup = frameLayoutI;
            } else {
                viewGroup = this;
            }
            ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(c.f.a.d.h.f14827a, viewGroup, false);
            this.f24547d = imageView;
            viewGroup.addView(imageView, 0);
        }

        public final void n() {
            ViewGroup viewGroup;
            if (c.f.a.d.o.b.f15202a) {
                FrameLayout frameLayoutI = i();
                addView(frameLayoutI);
                viewGroup = frameLayoutI;
            } else {
                viewGroup = this;
            }
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(c.f.a.d.h.f14828b, viewGroup, false);
            this.f24546c = textView;
            viewGroup.addView(textView);
        }

        public void o() {
            setTab(null);
            setSelected(false);
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            c.f.a.d.o.a aVar = this.f24549f;
            if (aVar != null && aVar.isVisible()) {
                accessibilityNodeInfo.setContentDescription(((Object) getContentDescription()) + ", " + ((Object) this.f24549f.g()));
            }
            a.i.r.g0.c cVarX0 = a.i.r.g0.c.x0(accessibilityNodeInfo);
            cVarX0.a0(c.C0042c.a(0, 1, this.f24545b.g(), 1, false, isSelected()));
            if (isSelected()) {
                cVarX0.Y(false);
                cVarX0.P(c.a.f2056e);
            }
            cVarX0.n0(getResources().getString(c.f.a.d.j.f14877h));
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i2, int i3) {
            Layout layout;
            int size = View.MeasureSpec.getSize(i2);
            int mode = View.MeasureSpec.getMode(i2);
            int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i2 = View.MeasureSpec.makeMeasureSpec(TabLayout.this.u, Integer.MIN_VALUE);
            }
            super.onMeasure(i2, i3);
            if (this.f24546c != null) {
                float f2 = TabLayout.this.r;
                int i4 = this.f24554k;
                ImageView imageView = this.f24547d;
                boolean z = true;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.f24546c;
                    if (textView != null && textView.getLineCount() > 1) {
                        f2 = TabLayout.this.s;
                    }
                } else {
                    i4 = 1;
                }
                float textSize = this.f24546c.getTextSize();
                int lineCount = this.f24546c.getLineCount();
                int iD = a.i.s.i.d(this.f24546c);
                if (f2 != textSize || (iD >= 0 && i4 != iD)) {
                    if (TabLayout.this.C == 1 && f2 > textSize && lineCount == 1 && ((layout = this.f24546c.getLayout()) == null || g(layout, 0, f2) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) {
                        z = false;
                    }
                    if (z) {
                        this.f24546c.setTextSize(0, f2);
                        this.f24546c.setMaxLines(i4);
                        super.onMeasure(i2, i3);
                    }
                }
            }
        }

        public final void p(View view) {
            if (l() && view != null) {
                h(false);
                c.f.a.d.o.b.a(this.f24549f, view, k(view));
                this.f24548e = view;
            }
        }

        @Override // android.view.View
        public boolean performClick() {
            boolean zPerformClick = super.performClick();
            if (this.f24545b == null) {
                return zPerformClick;
            }
            if (!zPerformClick) {
                playSoundEffect(0);
            }
            this.f24545b.l();
            return true;
        }

        public final void q() {
            if (l()) {
                h(true);
                View view = this.f24548e;
                if (view != null) {
                    c.f.a.d.o.b.b(this.f24549f, view);
                    this.f24548e = null;
                }
            }
        }

        public final void r() {
            g gVar;
            View view;
            View view2;
            g gVar2;
            if (l()) {
                if (this.f24550g == null) {
                    if (this.f24547d != null && (gVar2 = this.f24545b) != null && gVar2.f() != null) {
                        View view3 = this.f24548e;
                        view = this.f24547d;
                        if (view3 != view) {
                            q();
                            view2 = this.f24547d;
                            p(view2);
                            return;
                        }
                        s(view);
                        return;
                    }
                    if (this.f24546c != null && (gVar = this.f24545b) != null && gVar.h() == 1) {
                        View view4 = this.f24548e;
                        view = this.f24546c;
                        if (view4 != view) {
                            q();
                            view2 = this.f24546c;
                            p(view2);
                            return;
                        }
                        s(view);
                        return;
                    }
                }
                q();
            }
        }

        public final void s(View view) {
            if (l() && view == this.f24548e) {
                c.f.a.d.o.b.c(this.f24549f, view, k(view));
            }
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z && Build.VERSION.SDK_INT < 16) {
                sendAccessibilityEvent(4);
            }
            TextView textView = this.f24546c;
            if (textView != null) {
                textView.setSelected(z);
            }
            ImageView imageView = this.f24547d;
            if (imageView != null) {
                imageView.setSelected(z);
            }
            View view = this.f24550g;
            if (view != null) {
                view.setSelected(z);
            }
        }

        public void setTab(g gVar) {
            if (gVar != this.f24545b) {
                this.f24545b = gVar;
                t();
            }
        }

        public final void t() {
            g gVar = this.f24545b;
            Drawable drawableMutate = null;
            View viewE = gVar != null ? gVar.e() : null;
            if (viewE != null) {
                ViewParent parent = viewE.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(viewE);
                    }
                    addView(viewE);
                }
                this.f24550g = viewE;
                TextView textView = this.f24546c;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f24547d;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f24547d.setImageDrawable(null);
                }
                TextView textView2 = (TextView) viewE.findViewById(R.id.text1);
                this.f24551h = textView2;
                if (textView2 != null) {
                    this.f24554k = a.i.s.i.d(textView2);
                }
                this.f24552i = (ImageView) viewE.findViewById(R.id.icon);
            } else {
                View view = this.f24550g;
                if (view != null) {
                    removeView(view);
                    this.f24550g = null;
                }
                this.f24551h = null;
                this.f24552i = null;
            }
            if (this.f24550g == null) {
                if (this.f24547d == null) {
                    m();
                }
                if (gVar != null && gVar.f() != null) {
                    drawableMutate = a.i.j.l.a.r(gVar.f()).mutate();
                }
                if (drawableMutate != null) {
                    a.i.j.l.a.o(drawableMutate, TabLayout.this.f24515m);
                    PorterDuff.Mode mode = TabLayout.this.q;
                    if (mode != null) {
                        a.i.j.l.a.p(drawableMutate, mode);
                    }
                }
                if (this.f24546c == null) {
                    n();
                    this.f24554k = a.i.s.i.d(this.f24546c);
                }
                a.i.s.i.q(this.f24546c, TabLayout.this.f24513k);
                ColorStateList colorStateList = TabLayout.this.f24514l;
                if (colorStateList != null) {
                    this.f24546c.setTextColor(colorStateList);
                }
                w(this.f24546c, this.f24547d);
                r();
                f(this.f24547d);
                f(this.f24546c);
            } else {
                TextView textView3 = this.f24551h;
                if (textView3 != null || this.f24552i != null) {
                    w(textView3, this.f24552i);
                }
            }
            if (gVar != null && !TextUtils.isEmpty(gVar.f24535d)) {
                setContentDescription(gVar.f24535d);
            }
            setSelected(gVar != null && gVar.j());
        }

        public final void u(Context context) {
            int i2 = TabLayout.this.t;
            if (i2 != 0) {
                Drawable drawableD = a.b.l.a.a.d(context, i2);
                this.f24553j = drawableD;
                if (drawableD != null && drawableD.isStateful()) {
                    this.f24553j.setState(getDrawableState());
                }
            } else {
                this.f24553j = null;
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(0);
            Drawable layerDrawable = gradientDrawable;
            if (TabLayout.this.f24516n != null) {
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setCornerRadius(1.0E-5f);
                gradientDrawable2.setColor(-1);
                ColorStateList colorStateListA = c.f.a.d.h0.b.a(TabLayout.this.f24516n);
                if (Build.VERSION.SDK_INT >= 21) {
                    boolean z = TabLayout.this.G;
                    GradientDrawable gradientDrawable3 = gradientDrawable;
                    if (z) {
                        gradientDrawable3 = null;
                    }
                    layerDrawable = new RippleDrawable(colorStateListA, gradientDrawable3, z ? null : gradientDrawable2);
                } else {
                    Drawable drawableR = a.i.j.l.a.r(gradientDrawable2);
                    a.i.j.l.a.o(drawableR, colorStateListA);
                    layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, drawableR});
                }
            }
            x.s0(this, layerDrawable);
            TabLayout.this.invalidate();
        }

        public final void v() {
            ImageView imageView;
            setOrientation(!TabLayout.this.D ? 1 : 0);
            TextView textView = this.f24551h;
            if (textView == null && this.f24552i == null) {
                textView = this.f24546c;
                imageView = this.f24547d;
            } else {
                imageView = this.f24552i;
            }
            w(textView, imageView);
        }

        public final void w(TextView textView, ImageView imageView) {
            g gVar = this.f24545b;
            Drawable drawableMutate = (gVar == null || gVar.f() == null) ? null : a.i.j.l.a.r(this.f24545b.f()).mutate();
            g gVar2 = this.f24545b;
            CharSequence charSequenceI = gVar2 != null ? gVar2.i() : null;
            if (imageView != null) {
                if (drawableMutate != null) {
                    imageView.setImageDrawable(drawableMutate);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
            }
            boolean z = !TextUtils.isEmpty(charSequenceI);
            if (textView != null) {
                if (z) {
                    textView.setText(charSequenceI);
                    if (this.f24545b.f24538g == 1) {
                        textView.setVisibility(0);
                    } else {
                        textView.setVisibility(8);
                    }
                    setVisibility(0);
                } else {
                    textView.setVisibility(8);
                    textView.setText((CharSequence) null);
                }
            }
            if (imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int iB = (z && imageView.getVisibility() == 0) ? (int) c.f.a.d.d0.k.b(getContext(), 8) : 0;
                if (TabLayout.this.D) {
                    if (iB != a.i.r.i.a(marginLayoutParams)) {
                        a.i.r.i.c(marginLayoutParams, iB);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (iB != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = iB;
                    a.i.r.i.c(marginLayoutParams, 0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            g gVar3 = this.f24545b;
            CharSequence charSequence = gVar3 != null ? gVar3.f24535d : null;
            if (!z) {
                charSequenceI = charSequence;
            }
            w0.a(this, charSequenceI);
        }
    }

    public static class j implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ViewPager f24558a;

        public j(ViewPager viewPager) {
            this.f24558a = viewPager;
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void a(g gVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void b(g gVar) {
            this.f24558a.setCurrentItem(gVar.g());
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void c(g gVar) {
        }
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.f.a.d.b.E);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TabLayout(Context context, AttributeSet attributeSet, int i2) {
        int i3 = f24504b;
        super(c.f.a.d.o0.a.a.c(context, attributeSet, i2, i3), attributeSet, i2);
        this.f24506d = new ArrayList<>();
        this.f24517o = new GradientDrawable();
        this.p = 0;
        this.u = Integer.MAX_VALUE;
        this.J = new ArrayList<>();
        this.S = new a.i.q.g(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        f fVar = new f(context2);
        this.f24508f = fVar;
        super.addView(fVar, 0, new FrameLayout.LayoutParams(-2, -1));
        int[] iArr = l.H4;
        int i4 = l.f5;
        TypedArray typedArrayH = c.f.a.d.d0.j.h(context2, attributeSet, iArr, i2, i3, i4);
        if (getBackground() instanceof ColorDrawable) {
            ColorDrawable colorDrawable = (ColorDrawable) getBackground();
            c.f.a.d.j0.g gVar = new c.f.a.d.j0.g();
            gVar.X(ColorStateList.valueOf(colorDrawable.getColor()));
            gVar.M(context2);
            gVar.W(x.w(this));
            x.s0(this, gVar);
        }
        setSelectedTabIndicator(c.f.a.d.g0.c.d(context2, typedArrayH, l.N4));
        setSelectedTabIndicatorColor(typedArrayH.getColor(l.Q4, 0));
        fVar.f(typedArrayH.getDimensionPixelSize(l.T4, -1));
        setSelectedTabIndicatorGravity(typedArrayH.getInt(l.S4, 0));
        setTabIndicatorFullWidth(typedArrayH.getBoolean(l.R4, true));
        setTabIndicatorAnimationMode(typedArrayH.getInt(l.P4, 0));
        int dimensionPixelSize = typedArrayH.getDimensionPixelSize(l.Y4, 0);
        this.f24512j = dimensionPixelSize;
        this.f24511i = dimensionPixelSize;
        this.f24510h = dimensionPixelSize;
        this.f24509g = dimensionPixelSize;
        this.f24509g = typedArrayH.getDimensionPixelSize(l.b5, dimensionPixelSize);
        this.f24510h = typedArrayH.getDimensionPixelSize(l.c5, this.f24510h);
        this.f24511i = typedArrayH.getDimensionPixelSize(l.a5, this.f24511i);
        this.f24512j = typedArrayH.getDimensionPixelSize(l.Z4, this.f24512j);
        int resourceId = typedArrayH.getResourceId(i4, k.f14994b);
        this.f24513k = resourceId;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId, a.b.j.f3);
        try {
            this.r = typedArrayObtainStyledAttributes.getDimensionPixelSize(a.b.j.g3, 0);
            this.f24514l = c.f.a.d.g0.c.a(context2, typedArrayObtainStyledAttributes, a.b.j.j3);
            typedArrayObtainStyledAttributes.recycle();
            int i5 = l.g5;
            if (typedArrayH.hasValue(i5)) {
                this.f24514l = c.f.a.d.g0.c.a(context2, typedArrayH, i5);
            }
            int i6 = l.e5;
            if (typedArrayH.hasValue(i6)) {
                this.f24514l = p(this.f24514l.getDefaultColor(), typedArrayH.getColor(i6, 0));
            }
            this.f24515m = c.f.a.d.g0.c.a(context2, typedArrayH, l.L4);
            this.q = c.f.a.d.d0.k.e(typedArrayH.getInt(l.M4, -1), null);
            this.f24516n = c.f.a.d.g0.c.a(context2, typedArrayH, l.d5);
            this.A = typedArrayH.getInt(l.O4, IjkMediaCodecInfo.RANK_SECURE);
            this.v = typedArrayH.getDimensionPixelSize(l.W4, -1);
            this.w = typedArrayH.getDimensionPixelSize(l.V4, -1);
            this.t = typedArrayH.getResourceId(l.I4, 0);
            this.y = typedArrayH.getDimensionPixelSize(l.J4, 0);
            this.C = typedArrayH.getInt(l.X4, 1);
            this.z = typedArrayH.getInt(l.K4, 0);
            this.D = typedArrayH.getBoolean(l.U4, false);
            this.G = typedArrayH.getBoolean(l.h5, false);
            typedArrayH.recycle();
            Resources resources = getResources();
            this.s = resources.getDimensionPixelSize(c.f.a.d.d.f14710i);
            this.x = resources.getDimensionPixelSize(c.f.a.d.d.f14709h);
            m();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    private int getDefaultHeight() {
        int size = this.f24506d.size();
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                g gVar = this.f24506d.get(i2);
                if (gVar != null && gVar.f() != null && !TextUtils.isEmpty(gVar.i())) {
                    z = true;
                    break;
                }
                i2++;
            } else {
                break;
            }
        }
        return (!z || this.D) ? 48 : 72;
    }

    private int getTabMinWidth() {
        int i2 = this.v;
        if (i2 != -1) {
            return i2;
        }
        int i3 = this.C;
        if (i3 == 0 || i3 == 2) {
            return this.x;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f24508f.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    public static ColorStateList p(int i2, int i3) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i3, i2});
    }

    private void setSelectedTabView(int i2) {
        int childCount = this.f24508f.getChildCount();
        if (i2 < childCount) {
            int i3 = 0;
            while (i3 < childCount) {
                View childAt = this.f24508f.getChildAt(i3);
                boolean z = true;
                childAt.setSelected(i3 == i2);
                if (i3 != i2) {
                    z = false;
                }
                childAt.setActivated(z);
                i3++;
            }
        }
    }

    public void A() {
        int currentItem;
        C();
        a.e0.a.a aVar = this.N;
        if (aVar != null) {
            int iC = aVar.c();
            for (int i2 = 0; i2 < iC; i2++) {
                g(z().r(this.N.e(i2)), false);
            }
            ViewPager viewPager = this.M;
            if (viewPager == null || iC <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                return;
            }
            F(x(currentItem));
        }
    }

    public boolean B(g gVar) {
        return f24505c.a(gVar);
    }

    public void C() {
        for (int childCount = this.f24508f.getChildCount() - 1; childCount >= 0; childCount--) {
            E(childCount);
        }
        Iterator<g> it = this.f24506d.iterator();
        while (it.hasNext()) {
            g next = it.next();
            it.remove();
            next.k();
            B(next);
        }
        this.f24507e = null;
    }

    @Deprecated
    public void D(c cVar) {
        this.J.remove(cVar);
    }

    public final void E(int i2) {
        i iVar = (i) this.f24508f.getChildAt(i2);
        this.f24508f.removeViewAt(i2);
        if (iVar != null) {
            iVar.o();
            this.S.a(iVar);
        }
        requestLayout();
    }

    public void F(g gVar) {
        G(gVar, true);
    }

    public void G(g gVar, boolean z) {
        g gVar2 = this.f24507e;
        if (gVar2 == gVar) {
            if (gVar2 != null) {
                t(gVar);
                k(gVar.g());
                return;
            }
            return;
        }
        int iG = gVar != null ? gVar.g() : -1;
        if (z) {
            if ((gVar2 == null || gVar2.g() == -1) && iG != -1) {
                I(iG, 0.0f, true);
            } else {
                k(iG);
            }
            if (iG != -1) {
                setSelectedTabView(iG);
            }
        }
        this.f24507e = gVar;
        if (gVar2 != null) {
            v(gVar2);
        }
        if (gVar != null) {
            u(gVar);
        }
    }

    public void H(a.e0.a.a aVar, boolean z) {
        DataSetObserver dataSetObserver;
        a.e0.a.a aVar2 = this.N;
        if (aVar2 != null && (dataSetObserver = this.O) != null) {
            aVar2.o(dataSetObserver);
        }
        this.N = aVar;
        if (z && aVar != null) {
            if (this.O == null) {
                this.O = new e();
            }
            aVar.i(this.O);
        }
        A();
    }

    public void I(int i2, float f2, boolean z) {
        J(i2, f2, z, true);
    }

    public void J(int i2, float f2, boolean z, boolean z2) {
        int iRound = Math.round(i2 + f2);
        if (iRound < 0 || iRound >= this.f24508f.getChildCount()) {
            return;
        }
        if (z2) {
            this.f24508f.e(i2, f2);
        }
        ValueAnimator valueAnimator = this.L;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.L.cancel();
        }
        scrollTo(n(i2, f2), 0);
        if (z) {
            setSelectedTabView(iRound);
        }
    }

    public void K(ViewPager viewPager, boolean z) {
        L(viewPager, z, false);
    }

    public final void L(ViewPager viewPager, boolean z, boolean z2) {
        ViewPager viewPager2 = this.M;
        if (viewPager2 != null) {
            h hVar = this.P;
            if (hVar != null) {
                viewPager2.J(hVar);
            }
            b bVar = this.Q;
            if (bVar != null) {
                this.M.I(bVar);
            }
        }
        c cVar = this.K;
        if (cVar != null) {
            D(cVar);
            this.K = null;
        }
        if (viewPager != null) {
            this.M = viewPager;
            if (this.P == null) {
                this.P = new h(this);
            }
            this.P.d();
            viewPager.c(this.P);
            j jVar = new j(viewPager);
            this.K = jVar;
            c(jVar);
            a.e0.a.a adapter = viewPager.getAdapter();
            if (adapter != null) {
                H(adapter, z);
            }
            if (this.Q == null) {
                this.Q = new b();
            }
            this.Q.b(z);
            viewPager.b(this.Q);
            I(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.M = null;
            H(null, false);
        }
        this.R = z2;
    }

    public final void M() {
        int size = this.f24506d.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f24506d.get(i2).s();
        }
    }

    public final void N(LinearLayout.LayoutParams layoutParams) {
        float f2;
        if (this.C == 1 && this.z == 0) {
            layoutParams.width = 0;
            f2 = 1.0f;
        } else {
            layoutParams.width = -2;
            f2 = 0.0f;
        }
        layoutParams.weight = f2;
    }

    public void O(boolean z) {
        for (int i2 = 0; i2 < this.f24508f.getChildCount(); i2++) {
            View childAt = this.f24508f.getChildAt(i2);
            childAt.setMinimumWidth(getTabMinWidth());
            N((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        j(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i2) {
        j(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        j(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        j(view);
    }

    @Deprecated
    public void c(c cVar) {
        if (this.J.contains(cVar)) {
            return;
        }
        this.J.add(cVar);
    }

    public void d(d dVar) {
        c(dVar);
    }

    public void e(g gVar) {
        g(gVar, this.f24506d.isEmpty());
    }

    public void f(g gVar, int i2, boolean z) {
        if (gVar.f24539h != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        o(gVar, i2);
        i(gVar);
        if (z) {
            gVar.l();
        }
    }

    public void g(g gVar, boolean z) {
        f(gVar, this.f24506d.size(), z);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public int getSelectedTabPosition() {
        g gVar = this.f24507e;
        if (gVar != null) {
            return gVar.g();
        }
        return -1;
    }

    public int getTabCount() {
        return this.f24506d.size();
    }

    public int getTabGravity() {
        return this.z;
    }

    public ColorStateList getTabIconTint() {
        return this.f24515m;
    }

    public int getTabIndicatorAnimationMode() {
        return this.F;
    }

    public int getTabIndicatorGravity() {
        return this.B;
    }

    public int getTabMaxWidth() {
        return this.u;
    }

    public int getTabMode() {
        return this.C;
    }

    public ColorStateList getTabRippleColor() {
        return this.f24516n;
    }

    public Drawable getTabSelectedIndicator() {
        return this.f24517o;
    }

    public ColorStateList getTabTextColors() {
        return this.f24514l;
    }

    public final void h(c.f.a.d.m0.c cVar) {
        g gVarZ = z();
        CharSequence charSequence = cVar.f15065b;
        if (charSequence != null) {
            gVarZ.r(charSequence);
        }
        Drawable drawable = cVar.f15066c;
        if (drawable != null) {
            gVarZ.p(drawable);
        }
        int i2 = cVar.f15067d;
        if (i2 != 0) {
            gVarZ.n(i2);
        }
        if (!TextUtils.isEmpty(cVar.getContentDescription())) {
            gVarZ.m(cVar.getContentDescription());
        }
        e(gVarZ);
    }

    public final void i(g gVar) {
        i iVar = gVar.f24540i;
        iVar.setSelected(false);
        iVar.setActivated(false);
        this.f24508f.addView(iVar, gVar.g(), q());
    }

    public final void j(View view) {
        if (!(view instanceof c.f.a.d.m0.c)) {
            throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
        }
        h((c.f.a.d.m0.c) view);
    }

    public final void k(int i2) {
        if (i2 == -1) {
            return;
        }
        if (getWindowToken() == null || !x.U(this) || this.f24508f.c()) {
            I(i2, 0.0f, true);
            return;
        }
        int scrollX = getScrollX();
        int iN = n(i2, 0.0f);
        if (scrollX != iN) {
            w();
            this.L.setIntValues(scrollX, iN);
            this.L.start();
        }
        this.f24508f.b(i2, this.A);
    }

    public final void l(int i2) {
        f fVar;
        int i3;
        if (i2 != 0) {
            i3 = 1;
            if (i2 == 1) {
                fVar = this.f24508f;
                fVar.setGravity(i3);
            } else if (i2 != 2) {
                return;
            }
        } else {
            Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
        }
        fVar = this.f24508f;
        i3 = 8388611;
        fVar.setGravity(i3);
    }

    public final void m() {
        int i2 = this.C;
        x.B0(this.f24508f, (i2 == 0 || i2 == 2) ? Math.max(0, this.y - this.f24509g) : 0, 0, 0, 0);
        int i3 = this.C;
        if (i3 == 0) {
            l(this.z);
        } else if (i3 == 1 || i3 == 2) {
            if (this.z == 2) {
                Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
            }
            this.f24508f.setGravity(1);
        }
        O(true);
    }

    public final int n(int i2, float f2) {
        int i3 = this.C;
        if (i3 != 0 && i3 != 2) {
            return 0;
        }
        View childAt = this.f24508f.getChildAt(i2);
        int i4 = i2 + 1;
        View childAt2 = i4 < this.f24508f.getChildCount() ? this.f24508f.getChildAt(i4) : null;
        int width = childAt != null ? childAt.getWidth() : 0;
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i5 = (int) ((width + width2) * 0.5f * f2);
        return x.C(this) == 0 ? left + i5 : left - i5;
    }

    public final void o(g gVar, int i2) {
        gVar.q(i2);
        this.f24506d.add(i2, gVar);
        int size = this.f24506d.size();
        while (true) {
            i2++;
            if (i2 >= size) {
                return;
            } else {
                this.f24506d.get(i2).q(i2);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        c.f.a.d.j0.h.e(this);
        if (this.M == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                L((ViewPager) parent, true, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.R) {
            setupWithViewPager(null);
            this.R = false;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        for (int i2 = 0; i2 < this.f24508f.getChildCount(); i2++) {
            View childAt = this.f24508f.getChildAt(i2);
            if (childAt instanceof i) {
                ((i) childAt).j(canvas);
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        a.i.r.g0.c.x0(accessibilityNodeInfo).Z(c.b.a(1, getTabCount(), false, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0082  */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.getContext()
            int r1 = r6.getDefaultHeight()
            float r0 = c.f.a.d.d0.k.b(r0, r1)
            int r0 = java.lang.Math.round(r0)
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = 0
            r5 = 1
            if (r1 == r2) goto L2e
            if (r1 == 0) goto L1f
            goto L41
        L1f:
            int r8 = r6.getPaddingTop()
            int r0 = r0 + r8
            int r8 = r6.getPaddingBottom()
            int r0 = r0 + r8
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            goto L41
        L2e:
            int r1 = r6.getChildCount()
            if (r1 != r5) goto L41
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            if (r1 < r0) goto L41
            android.view.View r1 = r6.getChildAt(r4)
            r1.setMinimumHeight(r0)
        L41:
            int r0 = android.view.View.MeasureSpec.getSize(r7)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            if (r1 == 0) goto L5f
            int r1 = r6.w
            if (r1 <= 0) goto L50
            goto L5d
        L50:
            float r0 = (float) r0
            android.content.Context r1 = r6.getContext()
            r2 = 56
            float r1 = c.f.a.d.d0.k.b(r1, r2)
            float r0 = r0 - r1
            int r1 = (int) r0
        L5d:
            r6.u = r1
        L5f:
            super.onMeasure(r7, r8)
            int r7 = r6.getChildCount()
            if (r7 != r5) goto Lad
            android.view.View r7 = r6.getChildAt(r4)
            int r0 = r6.C
            if (r0 == 0) goto L82
            if (r0 == r5) goto L76
            r1 = 2
            if (r0 == r1) goto L82
            goto L8d
        L76:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 == r1) goto L8d
        L80:
            r4 = 1
            goto L8d
        L82:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 >= r1) goto L8d
            goto L80
        L8d:
            if (r4 == 0) goto Lad
            int r0 = r6.getPaddingTop()
            int r1 = r6.getPaddingBottom()
            int r0 = r0 + r1
            android.view.ViewGroup$LayoutParams r1 = r7.getLayoutParams()
            int r1 = r1.height
            int r8 = android.widget.HorizontalScrollView.getChildMeasureSpec(r8, r0, r1)
            int r0 = r6.getMeasuredWidth()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            r7.measure(r0, r8)
        Lad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onMeasure(int, int):void");
    }

    public final LinearLayout.LayoutParams q() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        N(layoutParams);
        return layoutParams;
    }

    public g r() {
        g gVarB = f24505c.b();
        return gVarB == null ? new g() : gVarB;
    }

    public final i s(g gVar) {
        a.i.q.f<i> fVar = this.S;
        i iVarB = fVar != null ? fVar.b() : null;
        if (iVarB == null) {
            iVarB = new i(getContext());
        }
        iVarB.setTab(gVar);
        iVarB.setFocusable(true);
        iVarB.setMinimumWidth(getTabMinWidth());
        iVarB.setContentDescription(TextUtils.isEmpty(gVar.f24535d) ? gVar.f24534c : gVar.f24535d);
        return iVarB;
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        c.f.a.d.j0.h.d(this, f2);
    }

    public void setInlineLabel(boolean z) {
        if (this.D != z) {
            this.D = z;
            for (int i2 = 0; i2 < this.f24508f.getChildCount(); i2++) {
                View childAt = this.f24508f.getChildAt(i2);
                if (childAt instanceof i) {
                    ((i) childAt).v();
                }
            }
            m();
        }
    }

    public void setInlineLabelResource(int i2) {
        setInlineLabel(getResources().getBoolean(i2));
    }

    @Deprecated
    public void setOnTabSelectedListener(c cVar) {
        c cVar2 = this.I;
        if (cVar2 != null) {
            D(cVar2);
        }
        this.I = cVar;
        if (cVar != null) {
            c(cVar);
        }
    }

    @Deprecated
    public void setOnTabSelectedListener(d dVar) {
        setOnTabSelectedListener((c) dVar);
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        w();
        this.L.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(int i2) {
        setSelectedTabIndicator(i2 != 0 ? a.b.l.a.a.d(getContext(), i2) : null);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (this.f24517o != drawable) {
            if (drawable == null) {
                drawable = new GradientDrawable();
            }
            this.f24517o = drawable;
        }
    }

    public void setSelectedTabIndicatorColor(int i2) {
        this.p = i2;
    }

    public void setSelectedTabIndicatorGravity(int i2) {
        if (this.B != i2) {
            this.B = i2;
            x.g0(this.f24508f);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i2) {
        this.f24508f.f(i2);
    }

    public void setTabGravity(int i2) {
        if (this.z != i2) {
            this.z = i2;
            m();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.f24515m != colorStateList) {
            this.f24515m = colorStateList;
            M();
        }
    }

    public void setTabIconTintResource(int i2) {
        setTabIconTint(a.b.l.a.a.c(getContext(), i2));
    }

    public void setTabIndicatorAnimationMode(int i2) {
        c.f.a.d.m0.b bVar;
        this.F = i2;
        if (i2 == 0) {
            bVar = new c.f.a.d.m0.b();
        } else {
            if (i2 != 1) {
                throw new IllegalArgumentException(i2 + " is not a valid TabIndicatorAnimationMode");
            }
            bVar = new c.f.a.d.m0.a();
        }
        this.H = bVar;
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.E = z;
        x.g0(this.f24508f);
    }

    public void setTabMode(int i2) {
        if (i2 != this.C) {
            this.C = i2;
            m();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.f24516n != colorStateList) {
            this.f24516n = colorStateList;
            for (int i2 = 0; i2 < this.f24508f.getChildCount(); i2++) {
                View childAt = this.f24508f.getChildAt(i2);
                if (childAt instanceof i) {
                    ((i) childAt).u(getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(int i2) {
        setTabRippleColor(a.b.l.a.a.c(getContext(), i2));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f24514l != colorStateList) {
            this.f24514l = colorStateList;
            M();
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(a.e0.a.a aVar) {
        H(aVar, false);
    }

    public void setUnboundedRipple(boolean z) {
        if (this.G != z) {
            this.G = z;
            for (int i2 = 0; i2 < this.f24508f.getChildCount(); i2++) {
                View childAt = this.f24508f.getChildAt(i2);
                if (childAt instanceof i) {
                    ((i) childAt).u(getContext());
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i2) {
        setUnboundedRipple(getResources().getBoolean(i2));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        K(viewPager, true);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    public final void t(g gVar) {
        for (int size = this.J.size() - 1; size >= 0; size--) {
            this.J.get(size).a(gVar);
        }
    }

    public final void u(g gVar) {
        for (int size = this.J.size() - 1; size >= 0; size--) {
            this.J.get(size).b(gVar);
        }
    }

    public final void v(g gVar) {
        for (int size = this.J.size() - 1; size >= 0; size--) {
            this.J.get(size).c(gVar);
        }
    }

    public final void w() {
        if (this.L == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.L = valueAnimator;
            valueAnimator.setInterpolator(c.f.a.d.m.a.f15043b);
            this.L.setDuration(this.A);
            this.L.addUpdateListener(new a());
        }
    }

    public g x(int i2) {
        if (i2 < 0 || i2 >= getTabCount()) {
            return null;
        }
        return this.f24506d.get(i2);
    }

    public boolean y() {
        return this.E;
    }

    public g z() {
        g gVarR = r();
        gVarR.f24539h = this;
        gVarR.f24540i = s(gVarR);
        if (gVarR.f24541j != -1) {
            gVarR.f24540i.setId(gVarR.f24541j);
        }
        return gVarR;
    }
}
