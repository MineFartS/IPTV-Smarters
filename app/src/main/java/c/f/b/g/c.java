package c.f.b.g;

import c.f.b.a.f;
import c.f.b.a.g;
import c.f.b.a.h;
import c.f.b.a.k;
import c.f.b.b.t;
import com.amazonaws.services.s3.internal.Constants;
import java.io.Serializable;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f<Type, String> f16012a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f16013b = g.f(", ").h(Constants.NULL_VERSION_ID);

    public static class a implements f<Type, String> {
        @Override // c.f.b.a.f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String apply(Type type) {
            return EnumC0191c.CURRENT.typeName(type);
        }
    }

    public static final class b implements GenericArrayType, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Type f16014b;

        public b(Type type) {
            this.f16014b = EnumC0191c.CURRENT.usedInGenericType(type);
        }

        public boolean equals(Object obj) {
            if (obj instanceof GenericArrayType) {
                return h.a(getGenericComponentType(), ((GenericArrayType) obj).getGenericComponentType());
            }
            return false;
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.f16014b;
        }

        public int hashCode() {
            return this.f16014b.hashCode();
        }

        public String toString() {
            return c.b(this.f16014b) + "[]";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: c.f.b.g.c$c, reason: collision with other inner class name */
    public static abstract class EnumC0191c {
        private static final /* synthetic */ EnumC0191c[] $VALUES;
        public static final EnumC0191c CURRENT;
        public static final EnumC0191c JAVA6;
        public static final EnumC0191c JAVA7;
        public static final EnumC0191c JAVA8;
        public static final EnumC0191c JAVA9;

        /* JADX INFO: renamed from: c.f.b.g.c$c$a */
        public enum a extends EnumC0191c {
            public a(String str, int i2) {
                super(str, i2, null);
            }

            @Override // c.f.b.g.c.EnumC0191c
            public GenericArrayType newArrayType(Type type) {
                return new b(type);
            }

            @Override // c.f.b.g.c.EnumC0191c
            public Type usedInGenericType(Type type) {
                k.j(type);
                if (!(type instanceof Class)) {
                    return type;
                }
                Class cls = (Class) type;
                return cls.isArray() ? new b(cls.getComponentType()) : type;
            }
        }

        /* JADX INFO: renamed from: c.f.b.g.c$c$b */
        public enum b extends EnumC0191c {
            public b(String str, int i2) {
                super(str, i2, null);
            }

            @Override // c.f.b.g.c.EnumC0191c
            public Type newArrayType(Type type) {
                return type instanceof Class ? c.a((Class) type) : new b(type);
            }

            @Override // c.f.b.g.c.EnumC0191c
            public Type usedInGenericType(Type type) {
                return (Type) k.j(type);
            }
        }

        /* JADX INFO: renamed from: c.f.b.g.c$c$c, reason: collision with other inner class name */
        public enum C0192c extends EnumC0191c {
            public C0192c(String str, int i2) {
                super(str, i2, null);
            }

            @Override // c.f.b.g.c.EnumC0191c
            public Type newArrayType(Type type) {
                return EnumC0191c.JAVA7.newArrayType(type);
            }

            @Override // c.f.b.g.c.EnumC0191c
            public String typeName(Type type) {
                try {
                    return (String) Type.class.getMethod("getTypeName", new Class[0]).invoke(type, new Object[0]);
                } catch (IllegalAccessException e2) {
                    e = e2;
                    throw new RuntimeException(e);
                } catch (NoSuchMethodException unused) {
                    throw new AssertionError("Type.getTypeName should be available in Java 8");
                } catch (InvocationTargetException e3) {
                    e = e3;
                    throw new RuntimeException(e);
                }
            }

            @Override // c.f.b.g.c.EnumC0191c
            public Type usedInGenericType(Type type) {
                return EnumC0191c.JAVA7.usedInGenericType(type);
            }
        }

        /* JADX INFO: renamed from: c.f.b.g.c$c$d */
        public enum d extends EnumC0191c {
            public d(String str, int i2) {
                super(str, i2, null);
            }

            @Override // c.f.b.g.c.EnumC0191c
            public boolean jdkTypeDuplicatesOwnerName() {
                return false;
            }

            @Override // c.f.b.g.c.EnumC0191c
            public Type newArrayType(Type type) {
                return EnumC0191c.JAVA8.newArrayType(type);
            }

            @Override // c.f.b.g.c.EnumC0191c
            public String typeName(Type type) {
                return EnumC0191c.JAVA8.typeName(type);
            }

            @Override // c.f.b.g.c.EnumC0191c
            public Type usedInGenericType(Type type) {
                return EnumC0191c.JAVA8.usedInGenericType(type);
            }
        }

        /* JADX INFO: renamed from: c.f.b.g.c$c$e */
        public static class e extends c.f.b.g.a<Map.Entry<String, int[][]>> {
        }

        /* JADX INFO: renamed from: c.f.b.g.c$c$f */
        public static class f extends c.f.b.g.a<int[]> {
        }

        static {
            a aVar = new a("JAVA6", 0);
            JAVA6 = aVar;
            b bVar = new b("JAVA7", 1);
            JAVA7 = bVar;
            C0192c c0192c = new C0192c("JAVA8", 2);
            JAVA8 = c0192c;
            d dVar = new d("JAVA9", 3);
            JAVA9 = dVar;
            $VALUES = new EnumC0191c[]{aVar, bVar, c0192c, dVar};
            if (AnnotatedElement.class.isAssignableFrom(TypeVariable.class)) {
                if (new e().a().toString().contains("java.util.Map.java.util.Map")) {
                    CURRENT = c0192c;
                    return;
                } else {
                    CURRENT = dVar;
                    return;
                }
            }
            if (new f().a() instanceof Class) {
                CURRENT = bVar;
            } else {
                CURRENT = aVar;
            }
        }

        private EnumC0191c(String str, int i2) {
        }

        public /* synthetic */ EnumC0191c(String str, int i2, a aVar) {
            this(str, i2);
        }

        public static EnumC0191c valueOf(String str) {
            return (EnumC0191c) Enum.valueOf(EnumC0191c.class, str);
        }

        public static EnumC0191c[] values() {
            return (EnumC0191c[]) $VALUES.clone();
        }

        public boolean jdkTypeDuplicatesOwnerName() {
            return true;
        }

        public abstract Type newArrayType(Type type);

        public String typeName(Type type) {
            return c.b(type);
        }

        public final t<Type> usedInGenericType(Type[] typeArr) {
            t.a aVarB = t.B();
            for (Type type : typeArr) {
                aVarB.d(usedInGenericType(type));
            }
            return aVarB.e();
        }

        public abstract Type usedInGenericType(Type type);
    }

    public static Class<?> a(Class<?> cls) {
        return Array.newInstance(cls, 0).getClass();
    }

    public static String b(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
