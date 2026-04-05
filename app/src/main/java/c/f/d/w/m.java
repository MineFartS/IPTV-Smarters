package c.f.d.w;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* JADX INFO: loaded from: classes2.dex */
public abstract class m {

    public class a extends m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Method f16540a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f16541b;

        public a(Method method, Object obj) {
            this.f16540a = method;
            this.f16541b = obj;
        }

        @Override // c.f.d.w.m
        public <T> T c(Class<T> cls) {
            m.a(cls);
            return (T) this.f16540a.invoke(this.f16541b, cls);
        }
    }

    public class b extends m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Method f16542a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f16543b;

        public b(Method method, int i2) {
            this.f16542a = method;
            this.f16543b = i2;
        }

        @Override // c.f.d.w.m
        public <T> T c(Class<T> cls) {
            m.a(cls);
            return (T) this.f16542a.invoke(null, cls, Integer.valueOf(this.f16543b));
        }
    }

    public class c extends m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Method f16544a;

        public c(Method method) {
            this.f16544a = method;
        }

        @Override // c.f.d.w.m
        public <T> T c(Class<T> cls) {
            m.a(cls);
            return (T) this.f16544a.invoke(null, cls, Object.class);
        }
    }

    public class d extends m {
        @Override // c.f.d.w.m
        public <T> T c(Class<T> cls) {
            throw new UnsupportedOperationException("Cannot allocate " + cls);
        }
    }

    public static void a(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            throw new UnsupportedOperationException("Interface can't be instantiated! Interface name: " + cls.getName());
        }
        if (Modifier.isAbstract(modifiers)) {
            throw new UnsupportedOperationException("Abstract class can't be instantiated! Class name: " + cls.getName());
        }
    }

    public static m b() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return new a(cls.getMethod("allocateInstance", Class.class), declaredField.get(null));
        } catch (Exception unused) {
            try {
                try {
                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                    declaredMethod.setAccessible(true);
                    int iIntValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                    Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                    declaredMethod2.setAccessible(true);
                    return new b(declaredMethod2, iIntValue);
                } catch (Exception unused2) {
                    Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                    declaredMethod3.setAccessible(true);
                    return new c(declaredMethod3);
                }
            } catch (Exception unused3) {
                return new d();
            }
        }
    }

    public abstract <T> T c(Class<T> cls);
}
