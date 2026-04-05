package a.t.k;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import androidx.mediarouter.app.MediaRouteVolumeSlider;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Drawable f3332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Drawable f3333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Drawable f3334c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Drawable f3335d;

    public static Context a(Context context) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i(context));
        int iM = m(contextThemeWrapper, a.t.a.f3131h);
        return iM != 0 ? new ContextThemeWrapper(contextThemeWrapper, iM) : contextThemeWrapper;
    }

    public static Context b(Context context, int i2, boolean z) {
        if (i2 == 0) {
            i2 = m(context, !z ? a.b.a.A : a.b.a.f31o);
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i2);
        return m(contextThemeWrapper, a.t.a.f3131h) != 0 ? new ContextThemeWrapper(contextThemeWrapper, i(contextThemeWrapper)) : contextThemeWrapper;
    }

    public static int c(Context context) {
        int iM = m(context, a.t.a.f3131h);
        return iM == 0 ? i(context) : iM;
    }

    public static int d(Context context) {
        int iL = l(context, 0, a.b.a.x);
        return a.i.j.a.c(iL, l(context, 0, R.attr.colorBackground)) < 3.0d ? l(context, 0, a.b.a.s) : iL;
    }

    public static int e(Context context, int i2) {
        return a.i.j.a.c(-1, l(context, i2, a.b.a.x)) >= 3.0d ? -1 : -570425344;
    }

    public static Drawable f(Context context) {
        if (f3332a == null) {
            f3332a = h(context, 0);
        }
        return f3332a;
    }

    public static float g(Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true)) {
            return typedValue.getFloat();
        }
        return 0.5f;
    }

    public static Drawable h(Context context, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{a.t.a.f3125b, a.t.a.f3132i, a.t.a.f3129f, a.t.a.f3128e});
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(i2);
        typedArrayObtainStyledAttributes.recycle();
        return drawable;
    }

    public static int i(Context context) {
        boolean zO = o(context);
        int iE = e(context, 0);
        return zO ? iE == -570425344 ? a.t.i.f3189b : a.t.i.f3191d : iE == -570425344 ? a.t.i.f3190c : a.t.i.f3188a;
    }

    public static Drawable j(Context context) {
        if (f3334c == null) {
            f3334c = h(context, 2);
        }
        return f3334c;
    }

    public static Drawable k(Context context) {
        if (f3335d == null) {
            f3335d = h(context, 3);
        }
        return f3335d;
    }

    public static int l(Context context, int i2, int i3) {
        if (i2 != 0) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i2, new int[]{i3});
            int color = typedArrayObtainStyledAttributes.getColor(0, 0);
            typedArrayObtainStyledAttributes.recycle();
            if (color != 0) {
                return color;
            }
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i3, typedValue, true);
        return typedValue.resourceId != 0 ? context.getResources().getColor(typedValue.resourceId) : typedValue.data;
    }

    public static int m(Context context, int i2) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i2, typedValue, true)) {
            return typedValue.resourceId;
        }
        return 0;
    }

    public static Drawable n(Context context) {
        if (f3333b == null) {
            f3333b = h(context, 1);
        }
        return f3333b;
    }

    public static boolean o(Context context) {
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(a.b.a.F, typedValue, true) && typedValue.data != 0;
    }

    public static void p(Context context, View view, View view2, boolean z) {
        int iL = l(context, 0, a.b.a.x);
        int iL2 = l(context, 0, a.b.a.y);
        if (z && e(context, 0) == -570425344) {
            iL2 = iL;
            iL = -1;
        }
        view.setBackgroundColor(iL);
        view2.setBackgroundColor(iL2);
        view.setTag(Integer.valueOf(iL));
        view2.setTag(Integer.valueOf(iL2));
    }

    public static void q(Context context, MediaRouteVolumeSlider mediaRouteVolumeSlider, View view) {
        int iE = e(context, 0);
        if (Color.alpha(iE) != 255) {
            iE = a.i.j.a.i(iE, ((Integer) view.getTag()).intValue());
        }
        mediaRouteVolumeSlider.a(iE);
    }
}
