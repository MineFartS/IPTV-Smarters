package a.b0;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class z implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f1010a;

    public static class a extends ViewGroup {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static Method f1011b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ViewGroup f1012c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public View f1013d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ArrayList<Drawable> f1014e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public z f1015f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f1016g;

        static {
            try {
                Class cls = Integer.TYPE;
                f1011b = ViewGroup.class.getDeclaredMethod("invalidateChildInParentFast", cls, cls, Rect.class);
            } catch (NoSuchMethodException unused) {
            }
        }

        public a(Context context, ViewGroup viewGroup, View view, z zVar) {
            super(context);
            this.f1014e = null;
            this.f1012c = viewGroup;
            this.f1013d = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.f1015f = zVar;
        }

        public void a(Drawable drawable) {
            c();
            if (this.f1014e == null) {
                this.f1014e = new ArrayList<>();
            }
            if (this.f1014e.contains(drawable)) {
                return;
            }
            this.f1014e.add(drawable);
            invalidate(drawable.getBounds());
            drawable.setCallback(this);
        }

        public void b(View view) {
            c();
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != this.f1012c && viewGroup.getParent() != null && a.i.r.x.T(viewGroup)) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    this.f1012c.getLocationOnScreen(iArr2);
                    a.i.r.x.Z(view, iArr[0] - iArr2[0]);
                    a.i.r.x.a0(view, iArr[1] - iArr2[1]);
                }
                viewGroup.removeView(view);
                if (view.getParent() != null) {
                    viewGroup.removeView(view);
                }
            }
            super.addView(view);
        }

        public final void c() {
            if (this.f1016g) {
                throw new IllegalStateException("This overlay was disposed already. Please use a new one via ViewGroupUtils.getOverlay()");
            }
        }

        public final void d() {
            if (getChildCount() == 0) {
                ArrayList<Drawable> arrayList = this.f1014e;
                if (arrayList == null || arrayList.size() == 0) {
                    this.f1016g = true;
                    this.f1012c.removeView(this);
                }
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public void dispatchDraw(Canvas canvas) {
            this.f1012c.getLocationOnScreen(new int[2]);
            this.f1013d.getLocationOnScreen(new int[2]);
            canvas.translate(r0[0] - r1[0], r0[1] - r1[1]);
            canvas.clipRect(new Rect(0, 0, this.f1013d.getWidth(), this.f1013d.getHeight()));
            super.dispatchDraw(canvas);
            ArrayList<Drawable> arrayList = this.f1014e;
            int size = arrayList == null ? 0 : arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f1014e.get(i2).draw(canvas);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        public final void e(int[] iArr) {
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            this.f1012c.getLocationOnScreen(iArr2);
            this.f1013d.getLocationOnScreen(iArr3);
            iArr[0] = iArr3[0] - iArr2[0];
            iArr[1] = iArr3[1] - iArr2[1];
        }

        public void f(Drawable drawable) {
            ArrayList<Drawable> arrayList = this.f1014e;
            if (arrayList != null) {
                arrayList.remove(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(null);
                d();
            }
        }

        public void g(View view) {
            super.removeView(view);
            d();
        }

        @Override // android.view.ViewGroup, android.view.ViewParent
        public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
            if (this.f1012c == null) {
                return null;
            }
            rect.offset(iArr[0], iArr[1]);
            if (!(this.f1012c instanceof ViewGroup)) {
                invalidate(rect);
                return null;
            }
            iArr[0] = 0;
            iArr[1] = 0;
            int[] iArr2 = new int[2];
            e(iArr2);
            rect.offset(iArr2[0], iArr2[1]);
            return super.invalidateChildInParent(iArr, rect);
        }

        @Override // android.view.View, android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            invalidate(drawable.getBounds());
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        }

        @Override // android.view.View
        public boolean verifyDrawable(Drawable drawable) {
            ArrayList<Drawable> arrayList;
            return super.verifyDrawable(drawable) || ((arrayList = this.f1014e) != null && arrayList.contains(drawable));
        }
    }

    public z(Context context, ViewGroup viewGroup, View view) {
        this.f1010a = new a(context, viewGroup, view, this);
    }

    public static z e(View view) {
        ViewGroup viewGroupF = f(view);
        if (viewGroupF == null) {
            return null;
        }
        int childCount = viewGroupF.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroupF.getChildAt(i2);
            if (childAt instanceof a) {
                return ((a) childAt).f1015f;
            }
        }
        return new u(viewGroupF.getContext(), viewGroupF, view);
    }

    public static ViewGroup f(View view) {
        while (view != null) {
            if (view.getId() == 16908290 && (view instanceof ViewGroup)) {
                return (ViewGroup) view;
            }
            if (view.getParent() instanceof ViewGroup) {
                view = (ViewGroup) view.getParent();
            }
        }
        return null;
    }

    @Override // a.b0.b0
    public void a(Drawable drawable) {
        this.f1010a.a(drawable);
    }

    @Override // a.b0.b0
    public void b(Drawable drawable) {
        this.f1010a.f(drawable);
    }
}
