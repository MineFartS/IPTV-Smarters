package c.f.a.d.d0;

import a.i.r.f0;
import a.i.r.r;
import a.i.r.x;
import android.content.Context;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes2.dex */
public class k {

    public static class a implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f14768a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d f14769b;

        public a(c cVar, d dVar) {
            this.f14768a = cVar;
            this.f14769b = dVar;
        }

        @Override // a.i.r.r
        public f0 a(View view, f0 f0Var) {
            return this.f14768a.a(view, f0Var, new d(this.f14769b));
        }
    }

    public static class b implements View.OnAttachStateChangeListener {
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            x.m0(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public interface c {
        f0 a(View view, f0 f0Var, d dVar);
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f14770a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f14771b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f14772c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f14773d;

        public d(int i2, int i3, int i4, int i5) {
            this.f14770a = i2;
            this.f14771b = i3;
            this.f14772c = i4;
            this.f14773d = i5;
        }

        public d(d dVar) {
            this.f14770a = dVar.f14770a;
            this.f14771b = dVar.f14771b;
            this.f14772c = dVar.f14772c;
            this.f14773d = dVar.f14773d;
        }
    }

    public static void a(View view, c cVar) {
        x.A0(view, new a(cVar, new d(x.I(view), view.getPaddingTop(), x.H(view), view.getPaddingBottom())));
        f(view);
    }

    public static float b(Context context, int i2) {
        return TypedValue.applyDimension(1, i2, context.getResources().getDisplayMetrics());
    }

    public static float c(View view) {
        float fW = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            fW += x.w((View) parent);
        }
        return fW;
    }

    public static boolean d(View view) {
        return x.C(view) == 1;
    }

    public static PorterDuff.Mode e(int i2, PorterDuff.Mode mode) {
        if (i2 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i2 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i2 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i2) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static void f(View view) {
        if (x.T(view)) {
            x.m0(view);
        } else {
            view.addOnAttachStateChangeListener(new b());
        }
    }
}
