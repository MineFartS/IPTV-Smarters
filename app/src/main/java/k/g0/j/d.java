package k.g0.j;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public class d<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<?> f30859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f30860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Class[] f30861c;

    public d(Class<?> cls, String str, Class... clsArr) {
        this.f30859a = cls;
        this.f30860b = str;
        this.f30861c = clsArr;
    }

    public static Method b(Class<?> cls, String str, Class[] clsArr) {
        try {
            Method method = cls.getMethod(str, clsArr);
            try {
                if ((method.getModifiers() & 1) == 0) {
                    return null;
                }
            } catch (NoSuchMethodException unused) {
            }
            return method;
        } catch (NoSuchMethodException unused2) {
            return null;
        }
    }

    public final Method a(Class<?> cls) {
        Class<?> cls2;
        String str = this.f30860b;
        if (str == null) {
            return null;
        }
        Method methodB = b(cls, str, this.f30861c);
        if (methodB == null || (cls2 = this.f30859a) == null || cls2.isAssignableFrom(methodB.getReturnType())) {
            return methodB;
        }
        return null;
    }

    public Object c(T t, Object... objArr) {
        Method methodA = a(t.getClass());
        if (methodA == null) {
            throw new AssertionError("Method " + this.f30860b + " not supported for object " + t);
        }
        try {
            return methodA.invoke(t, objArr);
        } catch (IllegalAccessException e2) {
            AssertionError assertionError = new AssertionError("Unexpectedly could not call: " + methodA);
            assertionError.initCause(e2);
            throw assertionError;
        }
    }

    public Object d(T t, Object... objArr) {
        Method methodA = a(t.getClass());
        if (methodA == null) {
            return null;
        }
        try {
            return methodA.invoke(t, objArr);
        } catch (IllegalAccessException unused) {
            return null;
        }
    }

    public Object e(T t, Object... objArr) {
        try {
            return d(t, objArr);
        } catch (InvocationTargetException e2) {
            Throwable targetException = e2.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    public Object f(T t, Object... objArr) {
        try {
            return c(t, objArr);
        } catch (InvocationTargetException e2) {
            Throwable targetException = e2.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    public boolean g(T t) {
        return a(t.getClass()) != null;
    }
}
