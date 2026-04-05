package a.b0;

import android.animation.LayoutTransition;
import android.util.Log;
import android.view.ViewGroup;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static LayoutTransition f1005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Field f1006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f1007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Method f1008d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f1009e;

    public static class a extends LayoutTransition {
        @Override // android.animation.LayoutTransition
        public boolean isChangingLayout() {
            return true;
        }
    }

    public static void a(LayoutTransition layoutTransition) {
        if (!f1009e) {
            try {
                Method declaredMethod = LayoutTransition.class.getDeclaredMethod("cancel", new Class[0]);
                f1008d = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
                Log.i("ViewGroupUtilsApi14", "Failed to access cancel method by reflection");
            }
            f1009e = true;
        }
        Method method = f1008d;
        if (method != null) {
            try {
                method.invoke(layoutTransition, new Object[0]);
            } catch (IllegalAccessException unused2) {
                Log.i("ViewGroupUtilsApi14", "Failed to access cancel method by reflection");
            } catch (InvocationTargetException unused3) {
                Log.i("ViewGroupUtilsApi14", "Failed to invoke cancel method by reflection");
            }
        }
    }

    public static void b(ViewGroup viewGroup, boolean z) {
        boolean z2 = false;
        if (f1005a == null) {
            a aVar = new a();
            f1005a = aVar;
            aVar.setAnimator(2, null);
            f1005a.setAnimator(0, null);
            f1005a.setAnimator(1, null);
            f1005a.setAnimator(3, null);
            f1005a.setAnimator(4, null);
        }
        if (z) {
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null) {
                if (layoutTransition.isRunning()) {
                    a(layoutTransition);
                }
                if (layoutTransition != f1005a) {
                    viewGroup.setTag(j.f939d, layoutTransition);
                }
            }
            viewGroup.setLayoutTransition(f1005a);
            return;
        }
        viewGroup.setLayoutTransition(null);
        if (!f1007c) {
            try {
                Field declaredField = ViewGroup.class.getDeclaredField("mLayoutSuppressed");
                f1006b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewGroupUtilsApi14", "Failed to access mLayoutSuppressed field by reflection");
            }
            f1007c = true;
        }
        Field field = f1006b;
        if (field != null) {
            try {
                boolean z3 = field.getBoolean(viewGroup);
                if (z3) {
                    try {
                        f1006b.setBoolean(viewGroup, false);
                    } catch (IllegalAccessException unused2) {
                        z2 = z3;
                        Log.i("ViewGroupUtilsApi14", "Failed to get mLayoutSuppressed field by reflection");
                    }
                }
                z2 = z3;
            } catch (IllegalAccessException unused3) {
            }
        }
        if (z2) {
            viewGroup.requestLayout();
        }
        int i2 = j.f939d;
        LayoutTransition layoutTransition2 = (LayoutTransition) viewGroup.getTag(i2);
        if (layoutTransition2 != null) {
            viewGroup.setTag(i2, null);
            viewGroup.setLayoutTransition(layoutTransition2);
        }
    }
}
