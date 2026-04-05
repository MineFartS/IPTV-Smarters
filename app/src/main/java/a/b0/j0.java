package a.b0;

import a.b0.a;
import a.b0.m;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public abstract class j0 extends m {
    public static final String[] L = {"android:visibility:visibility", "android:visibility:parent"};
    public int M = 3;

    public class a extends n {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f940b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f941c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ View f942d;

        public a(ViewGroup viewGroup, View view, View view2) {
            this.f940b = viewGroup;
            this.f941c = view;
            this.f942d = view2;
        }

        @Override // a.b0.n, a.b0.m.f
        public void b(m mVar) {
            x.a(this.f940b).d(this.f941c);
        }

        @Override // a.b0.m.f
        public void c(m mVar) {
            this.f942d.setTag(j.f937b, null);
            x.a(this.f940b).d(this.f941c);
            mVar.X(this);
        }

        @Override // a.b0.n, a.b0.m.f
        public void e(m mVar) {
            if (this.f941c.getParent() == null) {
                x.a(this.f940b).c(this.f941c);
            } else {
                j0.this.cancel();
            }
        }
    }

    public static class b extends AnimatorListenerAdapter implements m.f, a.InterfaceC0010a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f944b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f945c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ViewGroup f946d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f947e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f948f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f949g = false;

        public b(View view, int i2, boolean z) {
            this.f944b = view;
            this.f945c = i2;
            this.f946d = (ViewGroup) view.getParent();
            this.f947e = z;
            g(true);
        }

        @Override // a.b0.m.f
        public void a(m mVar) {
        }

        @Override // a.b0.m.f
        public void b(m mVar) {
            g(false);
        }

        @Override // a.b0.m.f
        public void c(m mVar) {
            f();
            mVar.X(this);
        }

        @Override // a.b0.m.f
        public void d(m mVar) {
        }

        @Override // a.b0.m.f
        public void e(m mVar) {
            g(true);
        }

        public final void f() {
            if (!this.f949g) {
                c0.h(this.f944b, this.f945c);
                ViewGroup viewGroup = this.f946d;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            g(false);
        }

        public final void g(boolean z) {
            ViewGroup viewGroup;
            if (!this.f947e || this.f948f == z || (viewGroup = this.f946d) == null) {
                return;
            }
            this.f948f = z;
            x.c(viewGroup, z);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f949g = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, a.b0.a.InterfaceC0010a
        public void onAnimationPause(Animator animator) {
            if (this.f949g) {
                return;
            }
            c0.h(this.f944b, this.f945c);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, a.b0.a.InterfaceC0010a
        public void onAnimationResume(Animator animator) {
            if (this.f949g) {
                return;
            }
            c0.h(this.f944b, 0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f950a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f951b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f952c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f953d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ViewGroup f954e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public ViewGroup f955f;
    }

    @Override // a.b0.m
    public String[] I() {
        return L;
    }

    @Override // a.b0.m
    public boolean K(s sVar, s sVar2) {
        if (sVar == null && sVar2 == null) {
            return false;
        }
        if (sVar != null && sVar2 != null && sVar2.f996a.containsKey("android:visibility:visibility") != sVar.f996a.containsKey("android:visibility:visibility")) {
            return false;
        }
        c cVarM0 = m0(sVar, sVar2);
        if (cVarM0.f950a) {
            return cVarM0.f952c == 0 || cVarM0.f953d == 0;
        }
        return false;
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
        sVar.f996a.put("android:visibility:visibility", Integer.valueOf(sVar.f997b.getVisibility()));
        sVar.f996a.put("android:visibility:parent", sVar.f997b.getParent());
        int[] iArr = new int[2];
        sVar.f997b.getLocationOnScreen(iArr);
        sVar.f996a.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0075, code lost:
    
        if (r9 == 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007f, code lost:
    
        if (r0.f954e == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0091, code lost:
    
        if (r0.f952c == 0) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final a.b0.j0.c m0(a.b0.s r8, a.b0.s r9) {
        /*
            r7 = this;
            a.b0.j0$c r0 = new a.b0.j0$c
            r0.<init>()
            r1 = 0
            r0.f950a = r1
            r0.f951b = r1
            java.lang.String r2 = "android:visibility:parent"
            r3 = 0
            r4 = -1
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L33
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f996a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L33
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f996a
            java.lang.Object r6 = r6.get(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r0.f952c = r6
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f996a
            java.lang.Object r6 = r6.get(r2)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f954e = r6
            goto L37
        L33:
            r0.f952c = r4
            r0.f954e = r3
        L37:
            if (r9 == 0) goto L5a
            java.util.Map<java.lang.String, java.lang.Object> r6 = r9.f996a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L5a
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.f996a
            java.lang.Object r3 = r3.get(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.f953d = r3
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.f996a
            java.lang.Object r2 = r3.get(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f955f = r2
            goto L5e
        L5a:
            r0.f953d = r4
            r0.f955f = r3
        L5e:
            r2 = 1
            if (r8 == 0) goto L82
            if (r9 == 0) goto L82
            int r8 = r0.f952c
            int r9 = r0.f953d
            if (r8 != r9) goto L70
            android.view.ViewGroup r3 = r0.f954e
            android.view.ViewGroup r4 = r0.f955f
            if (r3 != r4) goto L70
            return r0
        L70:
            if (r8 == r9) goto L78
            if (r8 != 0) goto L75
            goto L93
        L75:
            if (r9 != 0) goto L96
            goto L88
        L78:
            android.view.ViewGroup r8 = r0.f955f
            if (r8 != 0) goto L7d
            goto L93
        L7d:
            android.view.ViewGroup r8 = r0.f954e
            if (r8 != 0) goto L96
            goto L88
        L82:
            if (r8 != 0) goto L8d
            int r8 = r0.f953d
            if (r8 != 0) goto L8d
        L88:
            r0.f951b = r2
        L8a:
            r0.f950a = r2
            goto L96
        L8d:
            if (r9 != 0) goto L96
            int r8 = r0.f952c
            if (r8 != 0) goto L96
        L93:
            r0.f951b = r1
            goto L8a
        L96:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b0.j0.m0(a.b0.s, a.b0.s):a.b0.j0$c");
    }

    public abstract Animator n0(ViewGroup viewGroup, View view, s sVar, s sVar2);

    @Override // a.b0.m
    public Animator o(ViewGroup viewGroup, s sVar, s sVar2) {
        c cVarM0 = m0(sVar, sVar2);
        if (!cVarM0.f950a) {
            return null;
        }
        if (cVarM0.f954e == null && cVarM0.f955f == null) {
            return null;
        }
        return cVarM0.f951b ? o0(viewGroup, sVar, cVarM0.f952c, sVar2, cVarM0.f953d) : q0(viewGroup, sVar, cVarM0.f952c, sVar2, cVarM0.f953d);
    }

    public Animator o0(ViewGroup viewGroup, s sVar, int i2, s sVar2, int i3) {
        if ((this.M & 1) != 1 || sVar2 == null) {
            return null;
        }
        if (sVar == null) {
            View view = (View) sVar2.f997b.getParent();
            if (m0(y(view, false), J(view, false)).f950a) {
                return null;
            }
        }
        return n0(viewGroup, sVar2.f997b, sVar, sVar2);
    }

    public abstract Animator p0(ViewGroup viewGroup, View view, s sVar, s sVar2);

    /* JADX WARN: Removed duplicated region for block: B:25:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008f A[PHI: r8
  0x008f: PHI (r8v3 android.view.View) = 
  (r8v2 android.view.View)
  (r8v2 android.view.View)
  (r8v2 android.view.View)
  (r8v2 android.view.View)
  (r8v2 android.view.View)
  (r8v2 android.view.View)
  (r8v6 android.view.View)
 binds: [B:26:0x0048, B:31:0x0057, B:36:0x007c, B:38:0x007f, B:40:0x0085, B:42:0x0089, B:34:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.animation.Animator q0(android.view.ViewGroup r18, a.b0.s r19, int r20, a.b0.s r21, int r22) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b0.j0.q0(android.view.ViewGroup, a.b0.s, int, a.b0.s, int):android.animation.Animator");
    }

    public void r0(int i2) {
        if ((i2 & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.M = i2;
    }
}
