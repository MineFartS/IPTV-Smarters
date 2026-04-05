package a.i.i.e;

import a.i.q.i;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    public static abstract class a {

        /* JADX INFO: renamed from: a.i.i.e.f$a$a, reason: collision with other inner class name */
        public class RunnableC0032a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Typeface f1788b;

            public RunnableC0032a(Typeface typeface) {
                this.f1788b = typeface;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.e(this.f1788b);
            }
        }

        public class b implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ int f1790b;

            public b(int i2) {
                this.f1790b = i2;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.d(this.f1790b);
            }
        }

        public static Handler c(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        public final void a(int i2, Handler handler) {
            c(handler).post(new b(i2));
        }

        public final void b(Typeface typeface, Handler handler) {
            c(handler).post(new RunnableC0032a(typeface));
        }

        public abstract void d(int i2);

        public abstract void e(Typeface typeface);
    }

    public static final class b {

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Object f1792a = new Object();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static Method f1793b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static boolean f1794c;

            /* JADX WARN: Removed duplicated region for block: B:30:0x0027 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public static void a(android.content.res.Resources.Theme r6) {
                /*
                    java.lang.Object r0 = a.i.i.e.f.b.a.f1792a
                    monitor-enter(r0)
                    boolean r1 = a.i.i.e.f.b.a.f1794c     // Catch: java.lang.Throwable -> L3c
                    r2 = 0
                    if (r1 != 0) goto L23
                    r1 = 1
                    java.lang.Class<android.content.res.Resources$Theme> r3 = android.content.res.Resources.Theme.class
                    java.lang.String r4 = "rebase"
                    java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L19 java.lang.Throwable -> L3c
                    java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L19 java.lang.Throwable -> L3c
                    a.i.i.e.f.b.a.f1793b = r3     // Catch: java.lang.NoSuchMethodException -> L19 java.lang.Throwable -> L3c
                    r3.setAccessible(r1)     // Catch: java.lang.NoSuchMethodException -> L19 java.lang.Throwable -> L3c
                    goto L21
                L19:
                    r3 = move-exception
                    java.lang.String r4 = "ResourcesCompat"
                    java.lang.String r5 = "Failed to retrieve rebase() method"
                    android.util.Log.i(r4, r5, r3)     // Catch: java.lang.Throwable -> L3c
                L21:
                    a.i.i.e.f.b.a.f1794c = r1     // Catch: java.lang.Throwable -> L3c
                L23:
                    java.lang.reflect.Method r1 = a.i.i.e.f.b.a.f1793b     // Catch: java.lang.Throwable -> L3c
                    if (r1 == 0) goto L3a
                    java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L2d java.lang.IllegalAccessException -> L2f java.lang.Throwable -> L3c
                    r1.invoke(r6, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L2d java.lang.IllegalAccessException -> L2f java.lang.Throwable -> L3c
                    goto L3a
                L2d:
                    r6 = move-exception
                    goto L30
                L2f:
                    r6 = move-exception
                L30:
                    java.lang.String r1 = "ResourcesCompat"
                    java.lang.String r2 = "Failed to invoke rebase() method via reflection"
                    android.util.Log.i(r1, r2, r6)     // Catch: java.lang.Throwable -> L3c
                    r6 = 0
                    a.i.i.e.f.b.a.f1793b = r6     // Catch: java.lang.Throwable -> L3c
                L3a:
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L3c
                    return
                L3c:
                    r6 = move-exception
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L3c
                    throw r6
                */
                throw new UnsupportedOperationException("Method not decompiled: a.i.i.e.f.b.a.a(android.content.res.Resources$Theme):void");
            }
        }

        /* JADX INFO: renamed from: a.i.i.e.f$b$b, reason: collision with other inner class name */
        public static class C0033b {
            public static void a(Resources.Theme theme) {
                theme.rebase();
            }
        }

        public static void a(Resources.Theme theme) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 29) {
                C0033b.a(theme);
            } else if (i2 >= 23) {
                a.a(theme);
            }
        }
    }

    public static Drawable a(Resources resources, int i2, Resources.Theme theme) {
        return Build.VERSION.SDK_INT >= 21 ? resources.getDrawable(i2, theme) : resources.getDrawable(i2);
    }

    public static Typeface b(Context context, int i2) {
        if (context.isRestricted()) {
            return null;
        }
        return e(context, i2, new TypedValue(), 0, null, null, false, false);
    }

    public static Typeface c(Context context, int i2, TypedValue typedValue, int i3, a aVar) {
        if (context.isRestricted()) {
            return null;
        }
        return e(context, i2, typedValue, i3, aVar, null, true, false);
    }

    public static void d(Context context, int i2, a aVar, Handler handler) {
        i.e(aVar);
        if (context.isRestricted()) {
            aVar.a(-4, handler);
        } else {
            e(context, i2, new TypedValue(), 0, aVar, handler, false, false);
        }
    }

    public static Typeface e(Context context, int i2, TypedValue typedValue, int i3, a aVar, Handler handler, boolean z, boolean z2) {
        Resources resources = context.getResources();
        resources.getValue(i2, typedValue, true);
        Typeface typefaceF = f(context, resources, typedValue, i2, i3, aVar, handler, z, z2);
        if (typefaceF != null || aVar != null || z2) {
            return typefaceF;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i2) + " could not be retrieved.");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Typeface f(android.content.Context r15, android.content.res.Resources r16, android.util.TypedValue r17, int r18, int r19, a.i.i.e.f.a r20, android.os.Handler r21, boolean r22, boolean r23) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.i.i.e.f.f(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, a.i.i.e.f$a, android.os.Handler, boolean, boolean):android.graphics.Typeface");
    }
}
