package c.f.a.c.j.h;

import c.f.a.c.j.h.i6;
import c.f.a.c.j.h.l6;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class l6<MessageType extends l6<MessageType, BuilderType>, BuilderType extends i6<MessageType, BuilderType>> extends t4<MessageType, BuilderType> {
    private static final Map<Object, l6<?, ?>> zza = new ConcurrentHashMap();
    public r8 zzc = r8.a();
    public int zzd = -1;

    public static Object k(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static q6 l() {
        return m6.f();
    }

    public static r6 m() {
        return f7.f();
    }

    public static r6 n(r6 r6Var) {
        int size = r6Var.size();
        return r6Var.n(size == 0 ? 10 : size + size);
    }

    public static <E> t6<E> o() {
        return a8.f();
    }

    public static <E> t6<E> p(t6<E> t6Var) {
        int size = t6Var.size();
        return t6Var.n(size == 0 ? 10 : size + size);
    }

    public static <T extends l6> T s(Class<T> cls) {
        Map<Object, l6<?, ?>> map = zza;
        l6<?, ?> l6Var = map.get(cls);
        if (l6Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                l6Var = map.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (l6Var == null) {
            l6Var = (l6) ((l6) c9.n(cls)).v(6, null, null);
            if (l6Var == null) {
                throw new IllegalStateException();
            }
            map.put(cls, l6Var);
        }
        return l6Var;
    }

    public static <T extends l6> void t(Class<T> cls, T t) {
        zza.put(cls, t);
    }

    public static Object u(q7 q7Var, String str, Object[] objArr) {
        return new b8(q7Var, str, objArr);
    }

    @Override // c.f.a.c.j.h.q7
    public final /* bridge */ /* synthetic */ p7 a() {
        return (i6) v(5, null, null);
    }

    @Override // c.f.a.c.j.h.q7
    public final void b(t5 t5Var) {
        z7.a().b(getClass()).g(this, u5.l(t5Var));
    }

    @Override // c.f.a.c.j.h.q7
    public final /* bridge */ /* synthetic */ p7 c() {
        i6 i6Var = (i6) v(5, null, null);
        i6Var.n(this);
        return i6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return z7.a().b(getClass()).h(this, (l6) obj);
        }
        return false;
    }

    @Override // c.f.a.c.j.h.q7
    public final int f() {
        int i2 = this.zzd;
        if (i2 != -1) {
            return i2;
        }
        int iC = z7.a().b(getClass()).c(this);
        this.zzd = iC;
        return iC;
    }

    @Override // c.f.a.c.j.h.r7
    public final /* bridge */ /* synthetic */ q7 g() {
        return (l6) v(6, null, null);
    }

    @Override // c.f.a.c.j.h.t4
    public final int h() {
        return this.zzd;
    }

    public final int hashCode() {
        int i2 = this.zzb;
        if (i2 != 0) {
            return i2;
        }
        int iD = z7.a().b(getClass()).d(this);
        this.zzb = iD;
        return iD;
    }

    @Override // c.f.a.c.j.h.t4
    public final void i(int i2) {
        this.zzd = i2;
    }

    public final <MessageType extends l6<MessageType, BuilderType>, BuilderType extends i6<MessageType, BuilderType>> BuilderType q() {
        return (BuilderType) v(5, null, null);
    }

    public final BuilderType r() {
        BuilderType buildertype = (BuilderType) v(5, null, null);
        buildertype.n(this);
        return buildertype;
    }

    public final String toString() {
        return t7.a(this, super.toString());
    }

    public abstract Object v(int i2, Object obj, Object obj2);
}
