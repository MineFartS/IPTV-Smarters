package o;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import o.c;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f31295a = c();

    public static class a extends j {

        /* JADX INFO: renamed from: o.j$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: classes2.dex */
        public static class ExecutorC0324a implements Executor {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Handler f31296a = new Handler(Looper.getMainLooper());

            @Override // java.util.concurrent.Executor
            public void execute(Runnable runnable) {
                this.f31296a.post(runnable);
            }
        }

        @Override // o.j
        public c.a a(@Nullable Executor executor) {
            if (executor != null) {
                return new g(executor);
            }
            throw new AssertionError();
        }

        @Override // o.j
        public Executor b() {
            return new ExecutorC0324a();
        }
    }

    @IgnoreJRERequirement
    public static class b extends j {
        @Override // o.j
        public Object e(Method method, Class<?> cls, Object obj, @Nullable Object... objArr) throws NoSuchMethodException {
            Constructor declaredConstructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
            declaredConstructor.setAccessible(true);
            return ((MethodHandles.Lookup) declaredConstructor.newInstance(cls, -1)).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
        }

        @Override // o.j
        public boolean f(Method method) {
            return method.isDefault();
        }
    }

    public static j c() {
        try {
            Class.forName("android.os.Build");
            if (Build.VERSION.SDK_INT != 0) {
                return new a();
            }
        } catch (ClassNotFoundException unused) {
        }
        try {
            Class.forName("java.util.Optional");
            return new b();
        } catch (ClassNotFoundException unused2) {
            return new j();
        }
    }

    public static j d() {
        return f31295a;
    }

    public c.a a(@Nullable Executor executor) {
        return executor != null ? new g(executor) : f.f31242a;
    }

    @Nullable
    public Executor b() {
        return null;
    }

    @Nullable
    public Object e(Method method, Class<?> cls, Object obj, @Nullable Object... objArr) {
        throw new UnsupportedOperationException();
    }

    public boolean f(Method method) {
        return false;
    }
}
