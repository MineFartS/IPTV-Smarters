package a.d0;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a.f.a<String, Method> f1182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a.f.a<String, Method> f1183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a.f.a<String, Class> f1184c;

    public b(a.f.a<String, Method> aVar, a.f.a<String, Method> aVar2, a.f.a<String, Class> aVar3) {
        this.f1182a = aVar;
        this.f1183b = aVar2;
        this.f1184c = aVar3;
    }

    public abstract void A(byte[] bArr);

    public void B(byte[] bArr, int i2) {
        w(i2);
        A(bArr);
    }

    public abstract void C(CharSequence charSequence);

    public void D(CharSequence charSequence, int i2) {
        w(i2);
        C(charSequence);
    }

    public abstract void E(int i2);

    public void F(int i2, int i3) {
        w(i3);
        E(i2);
    }

    public abstract void G(Parcelable parcelable);

    public void H(Parcelable parcelable, int i2) {
        w(i2);
        G(parcelable);
    }

    public abstract void I(String str);

    public void J(String str, int i2) {
        w(i2);
        I(str);
    }

    public <T extends d> void K(T t, b bVar) {
        try {
            e(t.getClass()).invoke(null, t, bVar);
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e2);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e3);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e4);
        } catch (InvocationTargetException e5) {
            if (!(e5.getCause() instanceof RuntimeException)) {
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e5);
            }
            throw ((RuntimeException) e5.getCause());
        }
    }

    public void L(d dVar) {
        if (dVar == null) {
            I(null);
            return;
        }
        N(dVar);
        b bVarB = b();
        K(dVar, bVarB);
        bVarB.a();
    }

    public void M(d dVar, int i2) {
        w(i2);
        L(dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void N(d dVar) {
        try {
            I(c(dVar.getClass()).getName());
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException(dVar.getClass().getSimpleName() + " does not have a Parcelizer", e2);
        }
    }

    public abstract void a();

    public abstract b b();

    public final Class c(Class<? extends d> cls) throws ClassNotFoundException {
        Class cls2 = this.f1184c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        this.f1184c.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method d(String str) throws NoSuchMethodException {
        Method method = this.f1182a.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, b.class.getClassLoader()).getDeclaredMethod("read", b.class);
        this.f1182a.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Method e(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        Method method = this.f1183b.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class clsC = c(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsC.getDeclaredMethod("write", cls, b.class);
        this.f1183b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public boolean f() {
        return false;
    }

    public abstract boolean g();

    public boolean h(boolean z, int i2) {
        return !m(i2) ? z : g();
    }

    public abstract byte[] i();

    public byte[] j(byte[] bArr, int i2) {
        return !m(i2) ? bArr : i();
    }

    public abstract CharSequence k();

    public CharSequence l(CharSequence charSequence, int i2) {
        return !m(i2) ? charSequence : k();
    }

    public abstract boolean m(int i2);

    public <T extends d> T n(String str, b bVar) {
        try {
            return (T) d(str).invoke(null, bVar);
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e2);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e3);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e4);
        } catch (InvocationTargetException e5) {
            if (e5.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e5.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e5);
        }
    }

    public abstract int o();

    public int p(int i2, int i3) {
        return !m(i3) ? i2 : o();
    }

    public abstract <T extends Parcelable> T q();

    public <T extends Parcelable> T r(T t, int i2) {
        return !m(i2) ? t : (T) q();
    }

    public abstract String s();

    public String t(String str, int i2) {
        return !m(i2) ? str : s();
    }

    public <T extends d> T u() {
        String strS = s();
        if (strS == null) {
            return null;
        }
        return (T) n(strS, b());
    }

    public <T extends d> T v(T t, int i2) {
        return !m(i2) ? t : (T) u();
    }

    public abstract void w(int i2);

    public void x(boolean z, boolean z2) {
    }

    public abstract void y(boolean z);

    public void z(boolean z, int i2) {
        w(i2);
        y(z);
    }
}
