package a.b.l.a;

import a.b.q.k0;
import a.i.i.b;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"RestrictedAPI"})
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f266a = new ThreadLocal<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final WeakHashMap<Context, SparseArray<C0004a>> f267b = new WeakHashMap<>(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f268c = new Object();

    /* JADX INFO: renamed from: a.b.l.a.a$a, reason: collision with other inner class name */
    public static class C0004a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ColorStateList f269a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Configuration f270b;

        public C0004a(ColorStateList colorStateList, Configuration configuration) {
            this.f269a = colorStateList;
            this.f270b = configuration;
        }
    }

    public static void a(Context context, int i2, ColorStateList colorStateList) {
        synchronized (f268c) {
            WeakHashMap<Context, SparseArray<C0004a>> weakHashMap = f267b;
            SparseArray<C0004a> sparseArray = weakHashMap.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                weakHashMap.put(context, sparseArray);
            }
            sparseArray.append(i2, new C0004a(colorStateList, context.getResources().getConfiguration()));
        }
    }

    public static ColorStateList b(Context context, int i2) {
        C0004a c0004a;
        synchronized (f268c) {
            SparseArray<C0004a> sparseArray = f267b.get(context);
            if (sparseArray != null && sparseArray.size() > 0 && (c0004a = sparseArray.get(i2)) != null) {
                if (c0004a.f270b.equals(context.getResources().getConfiguration())) {
                    return c0004a.f269a;
                }
                sparseArray.remove(i2);
            }
            return null;
        }
    }

    public static ColorStateList c(Context context, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i2);
        }
        ColorStateList colorStateListB = b(context, i2);
        if (colorStateListB != null) {
            return colorStateListB;
        }
        ColorStateList colorStateListF = f(context, i2);
        if (colorStateListF == null) {
            return b.e(context, i2);
        }
        a(context, i2, colorStateListF);
        return colorStateListF;
    }

    public static Drawable d(Context context, int i2) {
        return k0.h().j(context, i2);
    }

    public static TypedValue e() {
        ThreadLocal<TypedValue> threadLocal = f266a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    public static ColorStateList f(Context context, int i2) {
        if (g(context, i2)) {
            return null;
        }
        Resources resources = context.getResources();
        try {
            return a.i.i.e.a.a(resources, resources.getXml(i2), context.getTheme());
        } catch (Exception e2) {
            Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", e2);
            return null;
        }
    }

    public static boolean g(Context context, int i2) {
        Resources resources = context.getResources();
        TypedValue typedValueE = e();
        resources.getValue(i2, typedValueE, true);
        int i3 = typedValueE.type;
        return i3 >= 28 && i3 <= 31;
    }
}
