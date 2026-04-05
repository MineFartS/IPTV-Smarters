package com.google.android.material.behavior;

import a.i.r.g0.c;
import a.i.r.g0.f;
import a.i.r.x;
import a.k.b.d;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.amazonaws.services.s3.internal.Constants;

/* JADX INFO: loaded from: classes2.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a.k.b.d f24327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f24328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f24329c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f24331e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f24330d = 0.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f24332f = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f24333g = 0.5f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f24334h = 0.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f24335i = 0.5f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d.c f24336j = new a();

    public class a extends d.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f24337a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f24338b = -1;

        public a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0012  */
        @Override // a.k.b.d.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int a(android.view.View r3, int r4, int r5) {
            /*
                r2 = this;
                int r5 = a.i.r.x.C(r3)
                r0 = 1
                if (r5 != r0) goto L9
                r5 = 1
                goto La
            L9:
                r5 = 0
            La:
                com.google.android.material.behavior.SwipeDismissBehavior r1 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r1 = r1.f24332f
                if (r1 != 0) goto L24
                if (r5 == 0) goto L1c
            L12:
                int r5 = r2.f24337a
                int r3 = r3.getWidth()
                int r5 = r5 - r3
                int r3 = r2.f24337a
                goto L37
            L1c:
                int r5 = r2.f24337a
                int r3 = r3.getWidth()
                int r3 = r3 + r5
                goto L37
            L24:
                if (r1 != r0) goto L29
                if (r5 == 0) goto L12
                goto L1c
            L29:
                int r5 = r2.f24337a
                int r0 = r3.getWidth()
                int r5 = r5 - r0
                int r0 = r2.f24337a
                int r3 = r3.getWidth()
                int r3 = r3 + r0
            L37:
                int r3 = com.google.android.material.behavior.SwipeDismissBehavior.G(r5, r4, r3)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.a.a(android.view.View, int, int):int");
        }

        @Override // a.k.b.d.c
        public int b(View view, int i2, int i3) {
            return view.getTop();
        }

        @Override // a.k.b.d.c
        public int d(View view) {
            return view.getWidth();
        }

        @Override // a.k.b.d.c
        public void i(View view, int i2) {
            this.f24338b = i2;
            this.f24337a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // a.k.b.d.c
        public void j(int i2) {
            c cVar = SwipeDismissBehavior.this.f24328b;
            if (cVar != null) {
                cVar.b(i2);
            }
        }

        @Override // a.k.b.d.c
        public void k(View view, int i2, int i3, int i4, int i5) {
            float width = this.f24337a + (view.getWidth() * SwipeDismissBehavior.this.f24334h);
            float width2 = this.f24337a + (view.getWidth() * SwipeDismissBehavior.this.f24335i);
            float f2 = i2;
            if (f2 <= width) {
                view.setAlpha(1.0f);
            } else if (f2 >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.F(0.0f, 1.0f - SwipeDismissBehavior.I(width, width2, f2), 1.0f));
            }
        }

        @Override // a.k.b.d.c
        public void l(View view, float f2, float f3) {
            int i2;
            boolean z;
            c cVar;
            this.f24338b = -1;
            int width = view.getWidth();
            if (n(view, f2)) {
                int left = view.getLeft();
                int i3 = this.f24337a;
                i2 = left < i3 ? i3 - width : i3 + width;
                z = true;
            } else {
                i2 = this.f24337a;
                z = false;
            }
            if (SwipeDismissBehavior.this.f24327a.F(i2, view.getTop())) {
                x.h0(view, new d(view, z));
            } else {
                if (!z || (cVar = SwipeDismissBehavior.this.f24328b) == null) {
                    return;
                }
                cVar.a(view);
            }
        }

        @Override // a.k.b.d.c
        public boolean m(View view, int i2) {
            int i3 = this.f24338b;
            return (i3 == -1 || i3 == i2) && SwipeDismissBehavior.this.E(view);
        }

        public final boolean n(View view, float f2) {
            if (f2 == 0.0f) {
                return Math.abs(view.getLeft() - this.f24337a) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.f24333g);
            }
            boolean z = x.C(view) == 1;
            int i2 = SwipeDismissBehavior.this.f24332f;
            if (i2 == 2) {
                return true;
            }
            if (i2 == 0) {
                if (z) {
                    if (f2 >= 0.0f) {
                        return false;
                    }
                } else if (f2 <= 0.0f) {
                    return false;
                }
                return true;
            }
            if (i2 != 1) {
                return false;
            }
            if (z) {
                if (f2 <= 0.0f) {
                    return false;
                }
            } else if (f2 >= 0.0f) {
                return false;
            }
            return true;
        }
    }

    public class b implements f {
        public b() {
        }

        @Override // a.i.r.g0.f
        public boolean a(View view, f.a aVar) {
            boolean z = false;
            if (!SwipeDismissBehavior.this.E(view)) {
                return false;
            }
            boolean z2 = x.C(view) == 1;
            int i2 = SwipeDismissBehavior.this.f24332f;
            if ((i2 == 0 && z2) || (i2 == 1 && !z2)) {
                z = true;
            }
            int width = view.getWidth();
            if (z) {
                width = -width;
            }
            x.Z(view, width);
            view.setAlpha(0.0f);
            c cVar = SwipeDismissBehavior.this.f24328b;
            if (cVar != null) {
                cVar.a(view);
            }
            return true;
        }
    }

    public interface c {
        void a(View view);

        void b(int i2);
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f24341b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f24342c;

        public d(View view, boolean z) {
            this.f24341b = view;
            this.f24342c = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            c cVar;
            a.k.b.d dVar = SwipeDismissBehavior.this.f24327a;
            if (dVar != null && dVar.k(true)) {
                x.h0(this.f24341b, this);
            } else {
                if (!this.f24342c || (cVar = SwipeDismissBehavior.this.f24328b) == null) {
                    return;
                }
                cVar.a(this.f24341b);
            }
        }
    }

    public static float F(float f2, float f3, float f4) {
        return Math.min(Math.max(f2, f3), f4);
    }

    public static int G(int i2, int i3, int i4) {
        return Math.min(Math.max(i2, i3), i4);
    }

    public static float I(float f2, float f3, float f4) {
        return (f4 - f2) / (f3 - f2);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean D(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        a.k.b.d dVar = this.f24327a;
        if (dVar == null) {
            return false;
        }
        dVar.z(motionEvent);
        return true;
    }

    public boolean E(View view) {
        return true;
    }

    public final void H(ViewGroup viewGroup) {
        if (this.f24327a == null) {
            this.f24327a = this.f24331e ? a.k.b.d.l(viewGroup, this.f24330d, this.f24336j) : a.k.b.d.m(viewGroup, this.f24336j);
        }
    }

    public void J(float f2) {
        this.f24335i = F(0.0f, f2, 1.0f);
    }

    public void K(float f2) {
        this.f24334h = F(0.0f, f2, 1.0f);
    }

    public void L(int i2) {
        this.f24332f = i2;
    }

    public final void M(View view) {
        x.j0(view, Constants.MB);
        if (E(view)) {
            x.l0(view, c.a.u, null, new b());
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean zC = this.f24329c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zC = coordinatorLayout.C(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f24329c = zC;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f24329c = false;
        }
        if (!zC) {
            return false;
        }
        H(coordinatorLayout);
        return this.f24327a.G(motionEvent);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, V v, int i2) {
        boolean zL = super.l(coordinatorLayout, v, i2);
        if (x.A(v) == 0) {
            x.y0(v, 1);
            M(v);
        }
        return zL;
    }
}
