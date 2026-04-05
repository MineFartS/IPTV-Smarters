package a.v;

import android.os.Bundle;
import android.os.Parcelable;
import com.amazonaws.services.s3.model.InstructionFileId;
import java.io.Serializable;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: loaded from: classes.dex */
public abstract class q<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q<Integer> f3612a = new c(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q<Integer> f3613b = new d(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q<int[]> f3614c = new e(true);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final q<Long> f3615d = new f(false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final q<long[]> f3616e = new g(true);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final q<Float> f3617f = new h(false);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final q<float[]> f3618g = new i(true);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final q<Boolean> f3619h = new j(false);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final q<boolean[]> f3620i = new k(true);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final q<String> f3621j = new a(true);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final q<String[]> f3622k = new b(true);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f3623l;

    public class a extends q<String> {
        public a(boolean z) {
            super(z);
        }

        @Override // a.v.q
        public String c() {
            return "string";
        }

        @Override // a.v.q
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public String b(Bundle bundle, String str) {
            return (String) bundle.get(str);
        }

        @Override // a.v.q
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public String k(String str) {
            return str;
        }

        @Override // a.v.q
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(Bundle bundle, String str, String str2) {
            bundle.putString(str, str2);
        }
    }

    public class b extends q<String[]> {
        public b(boolean z) {
            super(z);
        }

        @Override // a.v.q
        public String c() {
            return "string[]";
        }

        @Override // a.v.q
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public String[] b(Bundle bundle, String str) {
            return (String[]) bundle.get(str);
        }

        @Override // a.v.q
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public String[] k(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // a.v.q
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(Bundle bundle, String str, String[] strArr) {
            bundle.putStringArray(str, strArr);
        }
    }

    public class c extends q<Integer> {
        public c(boolean z) {
            super(z);
        }

        @Override // a.v.q
        public String c() {
            return "integer";
        }

        @Override // a.v.q
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public Integer b(Bundle bundle, String str) {
            return (Integer) bundle.get(str);
        }

        @Override // a.v.q
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Integer k(String str) {
            return Integer.valueOf(str.startsWith("0x") ? Integer.parseInt(str.substring(2), 16) : Integer.parseInt(str));
        }

        @Override // a.v.q
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(Bundle bundle, String str, Integer num) {
            bundle.putInt(str, num.intValue());
        }
    }

    public class d extends q<Integer> {
        public d(boolean z) {
            super(z);
        }

        @Override // a.v.q
        public String c() {
            return Name.REFER;
        }

        @Override // a.v.q
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public Integer b(Bundle bundle, String str) {
            return (Integer) bundle.get(str);
        }

        @Override // a.v.q
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Integer k(String str) {
            return Integer.valueOf(str.startsWith("0x") ? Integer.parseInt(str.substring(2), 16) : Integer.parseInt(str));
        }

        @Override // a.v.q
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(Bundle bundle, String str, Integer num) {
            bundle.putInt(str, num.intValue());
        }
    }

    public class e extends q<int[]> {
        public e(boolean z) {
            super(z);
        }

        @Override // a.v.q
        public String c() {
            return "integer[]";
        }

        @Override // a.v.q
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public int[] b(Bundle bundle, String str) {
            return (int[]) bundle.get(str);
        }

        @Override // a.v.q
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public int[] k(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // a.v.q
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(Bundle bundle, String str, int[] iArr) {
            bundle.putIntArray(str, iArr);
        }
    }

    public class f extends q<Long> {
        public f(boolean z) {
            super(z);
        }

        @Override // a.v.q
        public String c() {
            return "long";
        }

        @Override // a.v.q
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public Long b(Bundle bundle, String str) {
            return (Long) bundle.get(str);
        }

        @Override // a.v.q
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Long k(String str) {
            if (str.endsWith("L")) {
                str = str.substring(0, str.length() - 1);
            }
            return Long.valueOf(str.startsWith("0x") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str));
        }

        @Override // a.v.q
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(Bundle bundle, String str, Long l2) {
            bundle.putLong(str, l2.longValue());
        }
    }

    public class g extends q<long[]> {
        public g(boolean z) {
            super(z);
        }

        @Override // a.v.q
        public String c() {
            return "long[]";
        }

        @Override // a.v.q
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public long[] b(Bundle bundle, String str) {
            return (long[]) bundle.get(str);
        }

        @Override // a.v.q
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public long[] k(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // a.v.q
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(Bundle bundle, String str, long[] jArr) {
            bundle.putLongArray(str, jArr);
        }
    }

    public class h extends q<Float> {
        public h(boolean z) {
            super(z);
        }

        @Override // a.v.q
        public String c() {
            return "float";
        }

        @Override // a.v.q
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public Float b(Bundle bundle, String str) {
            return (Float) bundle.get(str);
        }

        @Override // a.v.q
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Float k(String str) {
            return Float.valueOf(Float.parseFloat(str));
        }

        @Override // a.v.q
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(Bundle bundle, String str, Float f2) {
            bundle.putFloat(str, f2.floatValue());
        }
    }

    public class i extends q<float[]> {
        public i(boolean z) {
            super(z);
        }

        @Override // a.v.q
        public String c() {
            return "float[]";
        }

        @Override // a.v.q
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public float[] b(Bundle bundle, String str) {
            return (float[]) bundle.get(str);
        }

        @Override // a.v.q
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public float[] k(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // a.v.q
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(Bundle bundle, String str, float[] fArr) {
            bundle.putFloatArray(str, fArr);
        }
    }

    public class j extends q<Boolean> {
        public j(boolean z) {
            super(z);
        }

        @Override // a.v.q
        public String c() {
            return "boolean";
        }

        @Override // a.v.q
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public Boolean b(Bundle bundle, String str) {
            return (Boolean) bundle.get(str);
        }

        @Override // a.v.q
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Boolean k(String str) {
            if ("true".equals(str)) {
                return Boolean.TRUE;
            }
            if ("false".equals(str)) {
                return Boolean.FALSE;
            }
            throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
        }

        @Override // a.v.q
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(Bundle bundle, String str, Boolean bool) {
            bundle.putBoolean(str, bool.booleanValue());
        }
    }

    public class k extends q<boolean[]> {
        public k(boolean z) {
            super(z);
        }

        @Override // a.v.q
        public String c() {
            return "boolean[]";
        }

        @Override // a.v.q
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean[] b(Bundle bundle, String str) {
            return (boolean[]) bundle.get(str);
        }

        @Override // a.v.q
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean[] k(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // a.v.q
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(Bundle bundle, String str, boolean[] zArr) {
            bundle.putBooleanArray(str, zArr);
        }
    }

    public static final class l<D extends Enum> extends p<D> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final Class<D> f3624n;

        public l(Class<D> cls) {
            super(false, cls);
            if (cls.isEnum()) {
                this.f3624n = cls;
                return;
            }
            throw new IllegalArgumentException(cls + " is not an Enum type.");
        }

        @Override // a.v.q.p, a.v.q
        public String c() {
            return this.f3624n.getName();
        }

        @Override // a.v.q.p
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public D k(String str) {
            for (D d2 : this.f3624n.getEnumConstants()) {
                if (d2.name().equals(str)) {
                    return d2;
                }
            }
            throw new IllegalArgumentException("Enum value " + str + " not found for type " + this.f3624n.getName() + InstructionFileId.DOT);
        }
    }

    public static final class m<D extends Parcelable> extends q<D[]> {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final Class<D[]> f3625m;

        public m(Class<D> cls) {
            super(true);
            if (!Parcelable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException(cls + " does not implement Parcelable.");
            }
            try {
                this.f3625m = (Class<D[]>) Class.forName("[L" + cls.getName() + ";");
            } catch (ClassNotFoundException e2) {
                throw new RuntimeException(e2);
            }
        }

        @Override // a.v.q
        public String c() {
            return this.f3625m.getName();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || m.class != obj.getClass()) {
                return false;
            }
            return this.f3625m.equals(((m) obj).f3625m);
        }

        public int hashCode() {
            return this.f3625m.hashCode();
        }

        @Override // a.v.q
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public D[] b(Bundle bundle, String str) {
            return (D[]) ((Parcelable[]) bundle.get(str));
        }

        @Override // a.v.q
        public D[] k(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // a.v.q
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(Bundle bundle, String str, D[] dArr) {
            this.f3625m.cast(dArr);
            bundle.putParcelableArray(str, dArr);
        }
    }

    public static final class n<D> extends q<D> {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final Class<D> f3626m;

        public n(Class<D> cls) {
            super(true);
            if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                this.f3626m = cls;
                return;
            }
            throw new IllegalArgumentException(cls + " does not implement Parcelable or Serializable.");
        }

        @Override // a.v.q
        public D b(Bundle bundle, String str) {
            return (D) bundle.get(str);
        }

        @Override // a.v.q
        public String c() {
            return this.f3626m.getName();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || n.class != obj.getClass()) {
                return false;
            }
            return this.f3626m.equals(((n) obj).f3626m);
        }

        @Override // a.v.q
        /* JADX INFO: renamed from: h */
        public D k(String str) {
            throw new UnsupportedOperationException("Parcelables don't support default values.");
        }

        public int hashCode() {
            return this.f3626m.hashCode();
        }

        @Override // a.v.q
        public void i(Bundle bundle, String str, D d2) {
            this.f3626m.cast(d2);
            if (d2 == null || (d2 instanceof Parcelable)) {
                bundle.putParcelable(str, (Parcelable) d2);
            } else if (d2 instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) d2);
            }
        }
    }

    public static final class o<D extends Serializable> extends q<D[]> {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final Class<D[]> f3627m;

        public o(Class<D> cls) {
            super(true);
            if (!Serializable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException(cls + " does not implement Serializable.");
            }
            try {
                this.f3627m = (Class<D[]>) Class.forName("[L" + cls.getName() + ";");
            } catch (ClassNotFoundException e2) {
                throw new RuntimeException(e2);
            }
        }

        @Override // a.v.q
        public String c() {
            return this.f3627m.getName();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || o.class != obj.getClass()) {
                return false;
            }
            return this.f3627m.equals(((o) obj).f3627m);
        }

        public int hashCode() {
            return this.f3627m.hashCode();
        }

        @Override // a.v.q
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public D[] b(Bundle bundle, String str) {
            return (D[]) ((Serializable[]) bundle.get(str));
        }

        @Override // a.v.q
        public D[] k(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // a.v.q
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(Bundle bundle, String str, D[] dArr) {
            this.f3627m.cast(dArr);
            bundle.putSerializable(str, dArr);
        }
    }

    public static class p<D extends Serializable> extends q<D> {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final Class<D> f3628m;

        public p(Class<D> cls) {
            super(true);
            if (!Serializable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException(cls + " does not implement Serializable.");
            }
            if (!cls.isEnum()) {
                this.f3628m = cls;
                return;
            }
            throw new IllegalArgumentException(cls + " is an Enum. You should use EnumType instead.");
        }

        public p(boolean z, Class<D> cls) {
            super(z);
            if (Serializable.class.isAssignableFrom(cls)) {
                this.f3628m = cls;
                return;
            }
            throw new IllegalArgumentException(cls + " does not implement Serializable.");
        }

        @Override // a.v.q
        public String c() {
            return this.f3628m.getName();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof p) {
                return this.f3628m.equals(((p) obj).f3628m);
            }
            return false;
        }

        public int hashCode() {
            return this.f3628m.hashCode();
        }

        @Override // a.v.q
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public D b(Bundle bundle, String str) {
            return (D) bundle.get(str);
        }

        @Override // a.v.q
        public D k(String str) {
            throw new UnsupportedOperationException("Serializables don't support default values.");
        }

        @Override // a.v.q
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(Bundle bundle, String str, D d2) {
            this.f3628m.cast(d2);
            bundle.putSerializable(str, d2);
        }
    }

    public q(boolean z) {
        this.f3623l = z;
    }

    public static q<?> a(String str, String str2) {
        String strSubstring;
        q<Integer> qVar = f3612a;
        if (qVar.c().equals(str)) {
            return qVar;
        }
        q qVar2 = f3614c;
        if (qVar2.c().equals(str)) {
            return qVar2;
        }
        q<Long> qVar3 = f3615d;
        if (qVar3.c().equals(str)) {
            return qVar3;
        }
        q qVar4 = f3616e;
        if (qVar4.c().equals(str)) {
            return qVar4;
        }
        q<Boolean> qVar5 = f3619h;
        if (qVar5.c().equals(str)) {
            return qVar5;
        }
        q qVar6 = f3620i;
        if (qVar6.c().equals(str)) {
            return qVar6;
        }
        q<String> qVar7 = f3621j;
        if (qVar7.c().equals(str)) {
            return qVar7;
        }
        q qVar8 = f3622k;
        if (qVar8.c().equals(str)) {
            return qVar8;
        }
        q<Float> qVar9 = f3617f;
        if (qVar9.c().equals(str)) {
            return qVar9;
        }
        q qVar10 = f3618g;
        if (qVar10.c().equals(str)) {
            return qVar10;
        }
        q<Integer> qVar11 = f3613b;
        if (qVar11.c().equals(str)) {
            return qVar11;
        }
        if (str == null || str.isEmpty()) {
            return qVar7;
        }
        try {
            if (!str.startsWith(InstructionFileId.DOT) || str2 == null) {
                strSubstring = str;
            } else {
                strSubstring = str2 + str;
            }
            if (str.endsWith("[]")) {
                strSubstring = strSubstring.substring(0, strSubstring.length() - 2);
                Class<?> cls = Class.forName(strSubstring);
                if (Parcelable.class.isAssignableFrom(cls)) {
                    return new m(cls);
                }
                if (Serializable.class.isAssignableFrom(cls)) {
                    return new o(cls);
                }
            } else {
                Class<?> cls2 = Class.forName(strSubstring);
                if (Parcelable.class.isAssignableFrom(cls2)) {
                    return new n(cls2);
                }
                if (Enum.class.isAssignableFrom(cls2)) {
                    return new l(cls2);
                }
                if (Serializable.class.isAssignableFrom(cls2)) {
                    return new p(cls2);
                }
            }
            throw new IllegalArgumentException(strSubstring + " is not Serializable or Parcelable.");
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static q d(String str) {
        try {
            try {
                try {
                    try {
                        q<Integer> qVar = f3612a;
                        qVar.k(str);
                        return qVar;
                    } catch (IllegalArgumentException unused) {
                        return f3621j;
                    }
                } catch (IllegalArgumentException unused2) {
                    q<Long> qVar2 = f3615d;
                    qVar2.k(str);
                    return qVar2;
                }
            } catch (IllegalArgumentException unused3) {
                q<Float> qVar3 = f3617f;
                qVar3.k(str);
                return qVar3;
            }
        } catch (IllegalArgumentException unused4) {
            q<Boolean> qVar4 = f3619h;
            qVar4.k(str);
            return qVar4;
        }
    }

    public static q e(Object obj) {
        if (obj instanceof Integer) {
            return f3612a;
        }
        if (obj instanceof int[]) {
            return f3614c;
        }
        if (obj instanceof Long) {
            return f3615d;
        }
        if (obj instanceof long[]) {
            return f3616e;
        }
        if (obj instanceof Float) {
            return f3617f;
        }
        if (obj instanceof float[]) {
            return f3618g;
        }
        if (obj instanceof Boolean) {
            return f3619h;
        }
        if (obj instanceof boolean[]) {
            return f3620i;
        }
        if ((obj instanceof String) || obj == null) {
            return f3621j;
        }
        if (obj instanceof String[]) {
            return f3622k;
        }
        if (obj.getClass().isArray() && Parcelable.class.isAssignableFrom(obj.getClass().getComponentType())) {
            return new m(obj.getClass().getComponentType());
        }
        if (obj.getClass().isArray() && Serializable.class.isAssignableFrom(obj.getClass().getComponentType())) {
            return new o(obj.getClass().getComponentType());
        }
        if (obj instanceof Parcelable) {
            return new n(obj.getClass());
        }
        if (obj instanceof Enum) {
            return new l(obj.getClass());
        }
        if (obj instanceof Serializable) {
            return new p(obj.getClass());
        }
        throw new IllegalArgumentException("Object of type " + obj.getClass().getName() + " is not supported for navigation arguments.");
    }

    public abstract T b(Bundle bundle, String str);

    public abstract String c();

    public boolean f() {
        return this.f3623l;
    }

    public T g(Bundle bundle, String str, String str2) {
        T tK = k(str2);
        i(bundle, str, tK);
        return tK;
    }

    /* JADX INFO: renamed from: h */
    public abstract T k(String str);

    public abstract void i(Bundle bundle, String str, T t);

    public String toString() {
        return c();
    }
}
