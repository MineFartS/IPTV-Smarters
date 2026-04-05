package k.g0.f;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends RuntimeException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Method f30612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public IOException f30613c;

    static {
        Method declaredMethod;
        try {
            declaredMethod = Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class);
        } catch (Exception unused) {
            declaredMethod = null;
        }
        f30612b = declaredMethod;
    }

    public e(IOException iOException) {
        super(iOException);
        this.f30613c = iOException;
    }

    public void a(IOException iOException) {
        b(iOException, this.f30613c);
        this.f30613c = iOException;
    }

    public final void b(IOException iOException, IOException iOException2) {
        Method method = f30612b;
        if (method != null) {
            try {
                method.invoke(iOException, iOException2);
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
    }

    public IOException c() {
        return this.f30613c;
    }
}
