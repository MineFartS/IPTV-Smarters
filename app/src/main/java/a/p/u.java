package a.p;

import a.p.w;
import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.SavedStateHandleController;
import androidx.savedstate.SavedStateRegistry;
import java.lang.reflect.Constructor;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class u extends w.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class<?>[] f3019a = {Application.class, t.class};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class<?>[] f3020b = {t.class};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Application f3021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w.b f3022d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bundle f3023e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f f3024f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SavedStateRegistry f3025g;

    @SuppressLint({"LambdaLast"})
    public u(Application application, a.z.c cVar, Bundle bundle) {
        this.f3025g = cVar.getSavedStateRegistry();
        this.f3024f = cVar.getLifecycle();
        this.f3023e = bundle;
        this.f3021c = application;
        this.f3022d = application != null ? w.a.c(application) : w.d.b();
    }

    public static <T> Constructor<T> d(Class<T> cls, Class<?>[] clsArr) {
        for (Object obj : cls.getConstructors()) {
            Constructor<T> constructor = (Constructor<T>) obj;
            if (Arrays.equals(clsArr, constructor.getParameterTypes())) {
                return constructor;
            }
        }
        return null;
    }

    @Override // a.p.w.c, a.p.w.b
    public <T extends v> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) c(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // a.p.w.e
    public void b(v vVar) {
        SavedStateHandleController.c(vVar, this.f3025g, this.f3024f);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0046 A[Catch: InvocationTargetException -> 0x0059, InstantiationException -> 0x0075, IllegalAccessException -> 0x0092, TryCatch #2 {IllegalAccessException -> 0x0092, InstantiationException -> 0x0075, InvocationTargetException -> 0x0059, blocks: (B:13:0x0030, B:15:0x0034, B:16:0x0043, B:18:0x0053, B:17:0x0046), top: B:30:0x0030 }] */
    @Override // a.p.w.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <T extends a.p.v> T c(java.lang.String r6, java.lang.Class<T> r7) {
        /*
            r5 = this;
            java.lang.Class<a.p.a> r0 = a.p.a.class
            boolean r0 = r0.isAssignableFrom(r7)
            if (r0 == 0) goto L13
            android.app.Application r1 = r5.f3021c
            if (r1 == 0) goto L13
            java.lang.Class<?>[] r1 = a.p.u.f3019a
            java.lang.reflect.Constructor r1 = d(r7, r1)
            goto L19
        L13:
            java.lang.Class<?>[] r1 = a.p.u.f3020b
            java.lang.reflect.Constructor r1 = d(r7, r1)
        L19:
            if (r1 != 0) goto L22
            a.p.w$b r6 = r5.f3022d
            a.p.v r6 = r6.a(r7)
            return r6
        L22:
            androidx.savedstate.SavedStateRegistry r2 = r5.f3025g
            a.p.f r3 = r5.f3024f
            android.os.Bundle r4 = r5.f3023e
            androidx.lifecycle.SavedStateHandleController r6 = androidx.lifecycle.SavedStateHandleController.j(r2, r3, r6, r4)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L46
            android.app.Application r0 = r5.f3021c     // Catch: java.lang.reflect.InvocationTargetException -> L59 java.lang.InstantiationException -> L75 java.lang.IllegalAccessException -> L92
            if (r0 == 0) goto L46
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.reflect.InvocationTargetException -> L59 java.lang.InstantiationException -> L75 java.lang.IllegalAccessException -> L92
            r4[r2] = r0     // Catch: java.lang.reflect.InvocationTargetException -> L59 java.lang.InstantiationException -> L75 java.lang.IllegalAccessException -> L92
            a.p.t r0 = r6.k()     // Catch: java.lang.reflect.InvocationTargetException -> L59 java.lang.InstantiationException -> L75 java.lang.IllegalAccessException -> L92
            r4[r3] = r0     // Catch: java.lang.reflect.InvocationTargetException -> L59 java.lang.InstantiationException -> L75 java.lang.IllegalAccessException -> L92
            java.lang.Object r0 = r1.newInstance(r4)     // Catch: java.lang.reflect.InvocationTargetException -> L59 java.lang.InstantiationException -> L75 java.lang.IllegalAccessException -> L92
        L43:
            a.p.v r0 = (a.p.v) r0     // Catch: java.lang.reflect.InvocationTargetException -> L59 java.lang.InstantiationException -> L75 java.lang.IllegalAccessException -> L92
            goto L53
        L46:
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch: java.lang.reflect.InvocationTargetException -> L59 java.lang.InstantiationException -> L75 java.lang.IllegalAccessException -> L92
            a.p.t r3 = r6.k()     // Catch: java.lang.reflect.InvocationTargetException -> L59 java.lang.InstantiationException -> L75 java.lang.IllegalAccessException -> L92
            r0[r2] = r3     // Catch: java.lang.reflect.InvocationTargetException -> L59 java.lang.InstantiationException -> L75 java.lang.IllegalAccessException -> L92
            java.lang.Object r0 = r1.newInstance(r0)     // Catch: java.lang.reflect.InvocationTargetException -> L59 java.lang.InstantiationException -> L75 java.lang.IllegalAccessException -> L92
            goto L43
        L53:
            java.lang.String r1 = "androidx.lifecycle.savedstate.vm.tag"
            r0.e(r1, r6)     // Catch: java.lang.reflect.InvocationTargetException -> L59 java.lang.InstantiationException -> L75 java.lang.IllegalAccessException -> L92
            return r0
        L59:
            r6 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "An exception happened in constructor of "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            java.lang.Throwable r6 = r6.getCause()
            r0.<init>(r7, r6)
            throw r0
        L75:
            r6 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "A "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = " cannot be instantiated."
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7, r6)
            throw r0
        L92:
            r6 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to access "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7, r6)
            goto Lab
        Laa:
            throw r0
        Lab:
            goto Laa
        */
        throw new UnsupportedOperationException("Method not decompiled: a.p.u.c(java.lang.String, java.lang.Class):a.p.v");
    }
}
