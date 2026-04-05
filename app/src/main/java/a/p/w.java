package a.p;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f3028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f3029b;

    public static class a extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static a f3030b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Application f3031c;

        public a(Application application) {
            this.f3031c = application;
        }

        public static a c(Application application) {
            if (f3030b == null) {
                f3030b = new a(application);
            }
            return f3030b;
        }

        @Override // a.p.w.d, a.p.w.b
        public <T extends v> T a(Class<T> cls) {
            if (!a.p.a.class.isAssignableFrom(cls)) {
                return (T) super.a(cls);
            }
            try {
                return cls.getConstructor(Application.class).newInstance(this.f3031c);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Cannot create an instance of " + cls, e2);
            } catch (InstantiationException e3) {
                throw new RuntimeException("Cannot create an instance of " + cls, e3);
            } catch (NoSuchMethodException e4) {
                throw new RuntimeException("Cannot create an instance of " + cls, e4);
            } catch (InvocationTargetException e5) {
                throw new RuntimeException("Cannot create an instance of " + cls, e5);
            }
        }
    }

    public interface b {
        <T extends v> T a(Class<T> cls);
    }

    public static abstract class c extends e implements b {
        public <T extends v> T a(Class<T> cls) {
            throw new UnsupportedOperationException("create(String, Class<?>) must be called on implementaions of KeyedFactory");
        }

        public abstract <T extends v> T c(String str, Class<T> cls);
    }

    public static class d implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static d f3032a;

        public static d b() {
            if (f3032a == null) {
                f3032a = new d();
            }
            return f3032a;
        }

        @Override // a.p.w.b
        public <T extends v> T a(Class<T> cls) {
            try {
                return cls.newInstance();
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Cannot create an instance of " + cls, e2);
            } catch (InstantiationException e3) {
                throw new RuntimeException("Cannot create an instance of " + cls, e3);
            }
        }
    }

    public static class e {
        public void b(v vVar) {
        }
    }

    public w(x xVar, b bVar) {
        this.f3028a = bVar;
        this.f3029b = xVar;
    }

    public <T extends v> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return (T) b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public <T extends v> T b(String str, Class<T> cls) {
        T t = (T) this.f3029b.b(str);
        if (cls.isInstance(t)) {
            Object obj = this.f3028a;
            if (obj instanceof e) {
                ((e) obj).b(t);
            }
            return t;
        }
        b bVar = this.f3028a;
        T t2 = bVar instanceof c ? (T) ((c) bVar).c(str, cls) : (T) bVar.a(cls);
        this.f3029b.d(str, t2);
        return t2;
    }
}
