package c.d.a.r.h;

import android.annotation.TargetApi;
import android.graphics.Point;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class k<T extends View, Z> extends c.d.a.r.h.a<Z> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f5938b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Integer f5939c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final T f5940d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f5941e;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f5942a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<h> f5943b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ViewTreeObserverOnPreDrawListenerC0113a f5944c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Point f5945d;

        /* JADX INFO: renamed from: c.d.a.r.h.k$a$a, reason: collision with other inner class name */
        public static class ViewTreeObserverOnPreDrawListenerC0113a implements ViewTreeObserver.OnPreDrawListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final WeakReference<a> f5946b;

            public ViewTreeObserverOnPreDrawListenerC0113a(a aVar) {
                this.f5946b = new WeakReference<>(aVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called listener=" + this);
                }
                a aVar = this.f5946b.get();
                if (aVar == null) {
                    return true;
                }
                aVar.b();
                return true;
            }
        }

        public a(View view) {
            this.f5942a = view;
        }

        public final void b() {
            if (this.f5943b.isEmpty()) {
                return;
            }
            int iG = g();
            int iF = f();
            if (h(iG) && h(iF)) {
                i(iG, iF);
                ViewTreeObserver viewTreeObserver = this.f5942a.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(this.f5944c);
                }
                this.f5944c = null;
            }
        }

        @TargetApi(13)
        public final Point c() {
            Point point = this.f5945d;
            if (point != null) {
                return point;
            }
            Display defaultDisplay = ((WindowManager) this.f5942a.getContext().getSystemService("window")).getDefaultDisplay();
            if (Build.VERSION.SDK_INT >= 13) {
                Point point2 = new Point();
                this.f5945d = point2;
                defaultDisplay.getSize(point2);
            } else {
                this.f5945d = new Point(defaultDisplay.getWidth(), defaultDisplay.getHeight());
            }
            return this.f5945d;
        }

        public void d(h hVar) {
            int iG = g();
            int iF = f();
            if (h(iG) && h(iF)) {
                hVar.e(iG, iF);
                return;
            }
            if (!this.f5943b.contains(hVar)) {
                this.f5943b.add(hVar);
            }
            if (this.f5944c == null) {
                ViewTreeObserver viewTreeObserver = this.f5942a.getViewTreeObserver();
                ViewTreeObserverOnPreDrawListenerC0113a viewTreeObserverOnPreDrawListenerC0113a = new ViewTreeObserverOnPreDrawListenerC0113a(this);
                this.f5944c = viewTreeObserverOnPreDrawListenerC0113a;
                viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0113a);
            }
        }

        public final int e(int i2, boolean z) {
            if (i2 != -2) {
                return i2;
            }
            Point pointC = c();
            return z ? pointC.y : pointC.x;
        }

        public final int f() {
            ViewGroup.LayoutParams layoutParams = this.f5942a.getLayoutParams();
            if (h(this.f5942a.getHeight())) {
                return this.f5942a.getHeight();
            }
            if (layoutParams != null) {
                return e(layoutParams.height, true);
            }
            return 0;
        }

        public final int g() {
            ViewGroup.LayoutParams layoutParams = this.f5942a.getLayoutParams();
            if (h(this.f5942a.getWidth())) {
                return this.f5942a.getWidth();
            }
            if (layoutParams != null) {
                return e(layoutParams.width, false);
            }
            return 0;
        }

        public final boolean h(int i2) {
            return i2 > 0 || i2 == -2;
        }

        public final void i(int i2, int i3) {
            Iterator<h> it = this.f5943b.iterator();
            while (it.hasNext()) {
                it.next().e(i2, i3);
            }
            this.f5943b.clear();
        }
    }

    public k(T t) {
        if (t == null) {
            throw new NullPointerException("View must not be null!");
        }
        this.f5940d = t;
        this.f5941e = new a(t);
    }

    @Override // c.d.a.r.h.a, c.d.a.r.h.j
    public void a(c.d.a.r.b bVar) {
        k(bVar);
    }

    @Override // c.d.a.r.h.a, c.d.a.r.h.j
    public c.d.a.r.b g() {
        Object objJ = j();
        if (objJ == null) {
            return null;
        }
        if (objJ instanceof c.d.a.r.b) {
            return (c.d.a.r.b) objJ;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    public T getView() {
        return this.f5940d;
    }

    @Override // c.d.a.r.h.j
    public void i(h hVar) {
        this.f5941e.d(hVar);
    }

    public final Object j() {
        Integer num = f5939c;
        return num == null ? this.f5940d.getTag() : this.f5940d.getTag(num.intValue());
    }

    public final void k(Object obj) {
        Integer num = f5939c;
        if (num != null) {
            this.f5940d.setTag(num.intValue(), obj);
        } else {
            f5938b = true;
            this.f5940d.setTag(obj);
        }
    }

    public String toString() {
        return "Target for: " + this.f5940d;
    }
}
