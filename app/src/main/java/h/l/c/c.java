package h.l.c;

import h.l.b.n;
import h.l.b.o;
import h.l.b.p;
import h.l.b.q;
import h.l.b.r;
import h.l.b.s;
import h.l.b.t;
import h.l.b.u;
import h.l.b.v;
import h.l.b.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements h.n.b<Object>, b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map<Class<?>, Integer> f30376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap<String, String> f30377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashMap<String, String> f30378c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashMap<String, String> f30379d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Map<String, String> f30380e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f30381f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Class<?> f30382g;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(e eVar) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        int i2 = 0;
        List listB = h.j.g.b(h.l.b.a.class, h.l.b.l.class, p.class, q.class, r.class, s.class, t.class, u.class, v.class, w.class, h.l.b.b.class, h.l.b.c.class, h.l.b.d.class, h.l.b.e.class, h.l.b.f.class, h.l.b.g.class, h.l.b.h.class, h.l.b.i.class, h.l.b.j.class, h.l.b.k.class, h.l.b.m.class, n.class, o.class);
        ArrayList arrayList = new ArrayList(h.j.h.d(listB, 10));
        for (Object obj : listB) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                h.j.g.c();
            }
            arrayList.add(h.g.a((Class) obj, Integer.valueOf(i2)));
            i2 = i3;
        }
        f30376a = h.j.o.g(arrayList);
        HashMap<String, String> map = new HashMap<>();
        map.put("boolean", "kotlin.Boolean");
        map.put("char", "kotlin.Char");
        map.put("byte", "kotlin.Byte");
        map.put("short", "kotlin.Short");
        map.put("int", "kotlin.Int");
        map.put("float", "kotlin.Float");
        map.put("long", "kotlin.Long");
        map.put("double", "kotlin.Double");
        f30377b = map;
        HashMap<String, String> map2 = new HashMap<>();
        map2.put("java.lang.Boolean", "kotlin.Boolean");
        map2.put("java.lang.Character", "kotlin.Char");
        map2.put("java.lang.Byte", "kotlin.Byte");
        map2.put("java.lang.Short", "kotlin.Short");
        map2.put("java.lang.Integer", "kotlin.Int");
        map2.put("java.lang.Float", "kotlin.Float");
        map2.put("java.lang.Long", "kotlin.Long");
        map2.put("java.lang.Double", "kotlin.Double");
        f30378c = map2;
        HashMap<String, String> map3 = new HashMap<>();
        map3.put("java.lang.Object", "kotlin.Any");
        map3.put("java.lang.String", "kotlin.String");
        map3.put("java.lang.CharSequence", "kotlin.CharSequence");
        map3.put("java.lang.Throwable", "kotlin.Throwable");
        map3.put("java.lang.Cloneable", "kotlin.Cloneable");
        map3.put("java.lang.Number", "kotlin.Number");
        map3.put("java.lang.Comparable", "kotlin.Comparable");
        map3.put("java.lang.Enum", "kotlin.Enum");
        map3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        map3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        map3.put("java.util.Iterator", "kotlin.collections.Iterator");
        map3.put("java.util.Collection", "kotlin.collections.Collection");
        map3.put("java.util.List", "kotlin.collections.List");
        map3.put("java.util.Set", "kotlin.collections.Set");
        map3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        map3.put("java.util.Map", "kotlin.collections.Map");
        map3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        map3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        map3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        map3.putAll(map);
        map3.putAll(map2);
        Collection<String> collectionValues = map.values();
        g.b(collectionValues, "primitiveFqNames.values");
        for (String str : collectionValues) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            g.b(str, "kotlinName");
            sb.append(h.o.l.f(str, '.', null, 2, null));
            sb.append("CompanionObject");
            h.e eVarA = h.g.a(sb.toString(), str + ".Companion");
            map3.put(eVarA.c(), eVarA.d());
        }
        for (Map.Entry<Class<?>, Integer> entry : f30376a.entrySet()) {
            map3.put(entry.getKey().getName(), "kotlin.Function" + entry.getValue().intValue());
        }
        f30379d = map3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(h.j.n.a(map3.size()));
        for (Map.Entry entry2 : map3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), h.o.l.f((String) entry2.getValue(), '.', null, 2, null));
        }
        f30380e = linkedHashMap;
    }

    public c(@NotNull Class<?> cls) {
        g.c(cls, "jClass");
        this.f30382g = cls;
    }

    @Override // h.l.c.b
    @NotNull
    public Class<?> a() {
        return this.f30382g;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof c) && g.a(h.l.a.a(this), h.l.a.a((h.n.b) obj));
    }

    public int hashCode() {
        return h.l.a.a(this).hashCode();
    }

    @NotNull
    public String toString() {
        return a().toString() + " (Kotlin reflection is not available)";
    }
}
