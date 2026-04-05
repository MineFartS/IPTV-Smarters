package a.b0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i0 f896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Property<View, Float> f897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Property<View, Rect> f898c;

    public static class a extends Property<View, Float> {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(c0.c(view));
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f2) {
            c0.g(view, f2.floatValue());
        }
    }

    public static class b extends Property<View, Rect> {
        public b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Rect get(View view) {
            return a.i.r.x.u(view);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Rect rect) {
            a.i.r.x.v0(view, rect);
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        f896a = i2 >= 29 ? new h0() : i2 >= 23 ? new g0() : i2 >= 22 ? new f0() : i2 >= 21 ? new e0() : i2 >= 19 ? new d0() : new i0();
        f897b = new a(Float.class, "translationAlpha");
        f898c = new b(Rect.class, "clipBounds");
    }

    public static void a(View view) {
        f896a.a(view);
    }

    public static b0 b(View view) {
        return Build.VERSION.SDK_INT >= 18 ? new a0(view) : z.e(view);
    }

    public static float c(View view) {
        return f896a.c(view);
    }

    public static m0 d(View view) {
        return Build.VERSION.SDK_INT >= 18 ? new l0(view) : new k0(view.getWindowToken());
    }

    public static void e(View view) {
        f896a.d(view);
    }

    public static void f(View view, int i2, int i3, int i4, int i5) {
        f896a.e(view, i2, i3, i4, i5);
    }

    public static void g(View view, float f2) {
        f896a.f(view, f2);
    }

    public static void h(View view, int i2) {
        f896a.g(view, i2);
    }

    public static void i(View view, Matrix matrix) {
        f896a.h(view, matrix);
    }

    public static void j(View view, Matrix matrix) {
        f896a.i(view, matrix);
    }
}
