package a.b0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class c extends m {
    public static final String[] L = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final Property<Drawable, PointF> M = new b(PointF.class, "boundsOrigin");
    public static final Property<k, PointF> N = new C0011c(PointF.class, "topLeft");
    public static final Property<k, PointF> O = new d(PointF.class, "bottomRight");
    public static final Property<View, PointF> P = new e(PointF.class, "bottomRight");
    public static final Property<View, PointF> Q = new f(PointF.class, "topLeft");
    public static final Property<View, PointF> R = new g(PointF.class, "position");
    public static a.b0.k S = new a.b0.k();
    public int[] T = new int[2];
    public boolean U = false;
    public boolean V = false;

    public class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f870b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ BitmapDrawable f871c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ View f872d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ float f873e;

        public a(ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f2) {
            this.f870b = viewGroup;
            this.f871c = bitmapDrawable;
            this.f872d = view;
            this.f873e = f2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            c0.b(this.f870b).b(this.f871c);
            c0.g(this.f872d, this.f873e);
        }
    }

    public static class b extends Property<Drawable, PointF> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Rect f875a;

        public b(Class cls, String str) {
            super(cls, str);
            this.f875a = new Rect();
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f875a);
            Rect rect = this.f875a;
            return new PointF(rect.left, rect.top);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f875a);
            this.f875a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f875a);
        }
    }

    /* JADX INFO: renamed from: a.b0.c$c, reason: collision with other inner class name */
    public static class C0011c extends Property<k, PointF> {
        public C0011c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(k kVar) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(k kVar, PointF pointF) {
            kVar.c(pointF);
        }
    }

    public static class d extends Property<k, PointF> {
        public d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(k kVar) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(k kVar, PointF pointF) {
            kVar.a(pointF);
        }
    }

    public static class e extends Property<View, PointF> {
        public e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            c0.f(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    public static class f extends Property<View, PointF> {
        public f(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            c0.f(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    public static class g extends Property<View, PointF> {
        public g(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            int iRound = Math.round(pointF.x);
            int iRound2 = Math.round(pointF.y);
            c0.f(view, iRound, iRound2, view.getWidth() + iRound, view.getHeight() + iRound2);
        }
    }

    public class h extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ k f876b;
        private k mViewBounds;

        public h(k kVar) {
            this.f876b = kVar;
            this.mViewBounds = kVar;
        }
    }

    public class i extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f878b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f879c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Rect f880d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f881e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f882f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ int f883g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ int f884h;

        public i(View view, Rect rect, int i2, int i3, int i4, int i5) {
            this.f879c = view;
            this.f880d = rect;
            this.f881e = i2;
            this.f882f = i3;
            this.f883g = i4;
            this.f884h = i5;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f878b = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f878b) {
                return;
            }
            a.i.r.x.v0(this.f879c, this.f880d);
            c0.f(this.f879c, this.f881e, this.f882f, this.f883g, this.f884h);
        }
    }

    public class j extends n {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f886b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f887c;

        public j(ViewGroup viewGroup) {
            this.f887c = viewGroup;
        }

        @Override // a.b0.n, a.b0.m.f
        public void b(m mVar) {
            x.c(this.f887c, false);
        }

        @Override // a.b0.m.f
        public void c(m mVar) {
            if (!this.f886b) {
                x.c(this.f887c, false);
            }
            mVar.X(this);
        }

        @Override // a.b0.n, a.b0.m.f
        public void d(m mVar) {
            x.c(this.f887c, false);
            this.f886b = true;
        }

        @Override // a.b0.n, a.b0.m.f
        public void e(m mVar) {
            x.c(this.f887c, true);
        }
    }

    public static class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f889a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f890b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f891c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f892d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public View f893e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f894f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f895g;

        public k(View view) {
            this.f893e = view;
        }

        public void a(PointF pointF) {
            this.f891c = Math.round(pointF.x);
            this.f892d = Math.round(pointF.y);
            int i2 = this.f895g + 1;
            this.f895g = i2;
            if (this.f894f == i2) {
                b();
            }
        }

        public final void b() {
            c0.f(this.f893e, this.f889a, this.f890b, this.f891c, this.f892d);
            this.f894f = 0;
            this.f895g = 0;
        }

        public void c(PointF pointF) {
            this.f889a = Math.round(pointF.x);
            this.f890b = Math.round(pointF.y);
            int i2 = this.f894f + 1;
            this.f894f = i2;
            if (i2 == this.f895g) {
                b();
            }
        }
    }

    @Override // a.b0.m
    public String[] I() {
        return L;
    }

    @Override // a.b0.m
    public void g(s sVar) {
        l0(sVar);
    }

    @Override // a.b0.m
    public void k(s sVar) {
        l0(sVar);
    }

    public final void l0(s sVar) {
        View view = sVar.f997b;
        if (!a.i.r.x.U(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        sVar.f996a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        sVar.f996a.put("android:changeBounds:parent", sVar.f997b.getParent());
        if (this.V) {
            sVar.f997b.getLocationInWindow(this.T);
            sVar.f996a.put("android:changeBounds:windowX", Integer.valueOf(this.T[0]));
            sVar.f996a.put("android:changeBounds:windowY", Integer.valueOf(this.T[1]));
        }
        if (this.U) {
            sVar.f996a.put("android:changeBounds:clip", a.i.r.x.u(view));
        }
    }

    public final boolean m0(View view, View view2) {
        if (!this.V) {
            return true;
        }
        s sVarY = y(view, true);
        if (sVarY == null) {
            if (view == view2) {
                return true;
            }
        } else if (view2 == sVarY.f997b) {
            return true;
        }
        return false;
    }

    @Override // a.b0.m
    public Animator o(ViewGroup viewGroup, s sVar, s sVar2) {
        int i2;
        View view;
        int i3;
        Rect rect;
        ObjectAnimator objectAnimator;
        Animator animatorC;
        Path pathA;
        Property<View, PointF> property;
        if (sVar == null || sVar2 == null) {
            return null;
        }
        Map<String, Object> map = sVar.f996a;
        Map<String, Object> map2 = sVar2.f996a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = sVar2.f997b;
        if (!m0(viewGroup2, viewGroup3)) {
            int iIntValue = ((Integer) sVar.f996a.get("android:changeBounds:windowX")).intValue();
            int iIntValue2 = ((Integer) sVar.f996a.get("android:changeBounds:windowY")).intValue();
            int iIntValue3 = ((Integer) sVar2.f996a.get("android:changeBounds:windowX")).intValue();
            int iIntValue4 = ((Integer) sVar2.f996a.get("android:changeBounds:windowY")).intValue();
            if (iIntValue == iIntValue3 && iIntValue2 == iIntValue4) {
                return null;
            }
            viewGroup.getLocationInWindow(this.T);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
            view2.draw(new Canvas(bitmapCreateBitmap));
            BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            float fC = c0.c(view2);
            c0.g(view2, 0.0f);
            c0.b(viewGroup).a(bitmapDrawable);
            a.b0.g gVarA = A();
            int[] iArr = this.T;
            ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, a.b0.i.a(M, gVarA.a(iIntValue - iArr[0], iIntValue2 - iArr[1], iIntValue3 - iArr[0], iIntValue4 - iArr[1])));
            objectAnimatorOfPropertyValuesHolder.addListener(new a(viewGroup, bitmapDrawable, view2, fC));
            return objectAnimatorOfPropertyValuesHolder;
        }
        Rect rect2 = (Rect) sVar.f996a.get("android:changeBounds:bounds");
        Rect rect3 = (Rect) sVar2.f996a.get("android:changeBounds:bounds");
        int i4 = rect2.left;
        int i5 = rect3.left;
        int i6 = rect2.top;
        int i7 = rect3.top;
        int i8 = rect2.right;
        int i9 = rect3.right;
        int i10 = rect2.bottom;
        int i11 = rect3.bottom;
        int i12 = i8 - i4;
        int i13 = i10 - i6;
        int i14 = i9 - i5;
        int i15 = i11 - i7;
        Rect rect4 = (Rect) sVar.f996a.get("android:changeBounds:clip");
        Rect rect5 = (Rect) sVar2.f996a.get("android:changeBounds:clip");
        if ((i12 == 0 || i13 == 0) && (i14 == 0 || i15 == 0)) {
            i2 = 0;
        } else {
            i2 = (i4 == i5 && i6 == i7) ? 0 : 1;
            if (i8 != i9 || i10 != i11) {
                i2++;
            }
        }
        if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
            i2++;
        }
        if (i2 <= 0) {
            return null;
        }
        if (this.U) {
            view = view2;
            c0.f(view, i4, i6, Math.max(i12, i14) + i4, Math.max(i13, i15) + i6);
            ObjectAnimator objectAnimatorA = (i4 == i5 && i6 == i7) ? null : a.b0.f.a(view, R, A().a(i4, i6, i5, i7));
            if (rect4 == null) {
                i3 = 0;
                rect = new Rect(0, 0, i12, i13);
            } else {
                i3 = 0;
                rect = rect4;
            }
            Rect rect6 = rect5 == null ? new Rect(i3, i3, i14, i15) : rect5;
            if (rect.equals(rect6)) {
                objectAnimator = null;
            } else {
                a.i.r.x.v0(view, rect);
                a.b0.k kVar = S;
                Object[] objArr = new Object[2];
                objArr[i3] = rect;
                objArr[1] = rect6;
                ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(view, "clipBounds", kVar, objArr);
                objectAnimatorOfObject.addListener(new i(view, rect5, i5, i7, i9, i11));
                objectAnimator = objectAnimatorOfObject;
            }
            animatorC = r.c(objectAnimatorA, objectAnimator);
        } else {
            view = view2;
            c0.f(view, i4, i6, i8, i10);
            if (i2 == 2) {
                if (i12 == i14 && i13 == i15) {
                    pathA = A().a(i4, i6, i5, i7);
                    property = R;
                } else {
                    k kVar2 = new k(view);
                    ObjectAnimator objectAnimatorA2 = a.b0.f.a(kVar2, N, A().a(i4, i6, i5, i7));
                    ObjectAnimator objectAnimatorA3 = a.b0.f.a(kVar2, O, A().a(i8, i10, i9, i11));
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(objectAnimatorA2, objectAnimatorA3);
                    animatorSet.addListener(new h(kVar2));
                    animatorC = animatorSet;
                }
            } else if (i4 == i5 && i6 == i7) {
                pathA = A().a(i8, i10, i9, i11);
                property = P;
            } else {
                pathA = A().a(i4, i6, i5, i7);
                property = Q;
            }
            animatorC = a.b0.f.a(view, property, pathA);
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            x.c(viewGroup4, true);
            a(new j(viewGroup4));
        }
        return animatorC;
    }
}
