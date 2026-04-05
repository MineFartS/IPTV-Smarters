package c.f.d;

import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c.f.d.x.a<?> f16440a = c.f.d.x.a.a(Object.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ThreadLocal<Map<c.f.d.x.a<?>, f<?>>> f16441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<c.f.d.x.a<?>, t<?>> f16442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c.f.d.w.c f16443d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c.f.d.w.n.d f16444e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<u> f16445f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c.f.d.w.d f16446g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c.f.d.d f16447h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Map<Type, c.f.d.f<?>> f16448i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f16449j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f16450k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f16451l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f16452m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f16453n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f16454o;
    public final boolean p;
    public final String q;
    public final int r;
    public final int s;
    public final s t;
    public final List<u> u;
    public final List<u> v;

    public class a extends t<Number> {
        public a() {
        }

        @Override // c.f.d.t
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Double b(c.f.d.y.a aVar) throws IOException {
            if (aVar.B0() != c.f.d.y.b.NULL) {
                return Double.valueOf(aVar.x());
            }
            aVar.c0();
            return null;
        }

        @Override // c.f.d.t
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(c.f.d.y.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.v();
            } else {
                e.d(number.doubleValue());
                cVar.D0(number);
            }
        }
    }

    public class b extends t<Number> {
        public b() {
        }

        @Override // c.f.d.t
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Float b(c.f.d.y.a aVar) throws IOException {
            if (aVar.B0() != c.f.d.y.b.NULL) {
                return Float.valueOf((float) aVar.x());
            }
            aVar.c0();
            return null;
        }

        @Override // c.f.d.t
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(c.f.d.y.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.v();
            } else {
                e.d(number.floatValue());
                cVar.D0(number);
            }
        }
    }

    public class c extends t<Number> {
        @Override // c.f.d.t
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(c.f.d.y.a aVar) throws IOException {
            if (aVar.B0() != c.f.d.y.b.NULL) {
                return Long.valueOf(aVar.Q());
            }
            aVar.c0();
            return null;
        }

        @Override // c.f.d.t
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(c.f.d.y.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.v();
            } else {
                cVar.E0(number.toString());
            }
        }
    }

    public class d extends t<AtomicLong> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ t f16457a;

        public d(t tVar) {
            this.f16457a = tVar;
        }

        @Override // c.f.d.t
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicLong b(c.f.d.y.a aVar) {
            return new AtomicLong(((Number) this.f16457a.b(aVar)).longValue());
        }

        @Override // c.f.d.t
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(c.f.d.y.c cVar, AtomicLong atomicLong) {
            this.f16457a.d(cVar, Long.valueOf(atomicLong.get()));
        }
    }

    /* JADX INFO: renamed from: c.f.d.e$e, reason: collision with other inner class name */
    public class C0200e extends t<AtomicLongArray> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ t f16458a;

        public C0200e(t tVar) {
            this.f16458a = tVar;
        }

        @Override // c.f.d.t
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicLongArray b(c.f.d.y.a aVar) throws IOException {
            ArrayList arrayList = new ArrayList();
            aVar.d();
            while (aVar.s()) {
                arrayList.add(Long.valueOf(((Number) this.f16458a.b(aVar)).longValue()));
            }
            aVar.o();
            int size = arrayList.size();
            AtomicLongArray atomicLongArray = new AtomicLongArray(size);
            for (int i2 = 0; i2 < size; i2++) {
                atomicLongArray.set(i2, ((Long) arrayList.get(i2)).longValue());
            }
            return atomicLongArray;
        }

        @Override // c.f.d.t
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(c.f.d.y.c cVar, AtomicLongArray atomicLongArray) throws IOException {
            cVar.l();
            int length = atomicLongArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                this.f16458a.d(cVar, Long.valueOf(atomicLongArray.get(i2)));
            }
            cVar.o();
        }
    }

    public static class f<T> extends t<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public t<T> f16459a;

        @Override // c.f.d.t
        public T b(c.f.d.y.a aVar) {
            t<T> tVar = this.f16459a;
            if (tVar != null) {
                return tVar.b(aVar);
            }
            throw new IllegalStateException();
        }

        @Override // c.f.d.t
        public void d(c.f.d.y.c cVar, T t) {
            t<T> tVar = this.f16459a;
            if (tVar == null) {
                throw new IllegalStateException();
            }
            tVar.d(cVar, t);
        }

        public void e(t<T> tVar) {
            if (this.f16459a != null) {
                throw new AssertionError();
            }
            this.f16459a = tVar;
        }
    }

    public e() {
        this(c.f.d.w.d.f16497b, c.f.d.c.IDENTITY, Collections.emptyMap(), false, false, false, true, false, false, false, s.DEFAULT, null, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
    }

    public e(c.f.d.w.d dVar, c.f.d.d dVar2, Map<Type, c.f.d.f<?>> map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, s sVar, String str, int i2, int i3, List<u> list, List<u> list2, List<u> list3) {
        this.f16441b = new ThreadLocal<>();
        this.f16442c = new ConcurrentHashMap();
        this.f16446g = dVar;
        this.f16447h = dVar2;
        this.f16448i = map;
        c.f.d.w.c cVar = new c.f.d.w.c(map);
        this.f16443d = cVar;
        this.f16449j = z;
        this.f16450k = z2;
        this.f16451l = z3;
        this.f16452m = z4;
        this.f16453n = z5;
        this.f16454o = z6;
        this.p = z7;
        this.t = sVar;
        this.q = str;
        this.r = i2;
        this.s = i3;
        this.u = list;
        this.v = list2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(c.f.d.w.n.n.Y);
        arrayList.add(c.f.d.w.n.h.f16563a);
        arrayList.add(dVar);
        arrayList.addAll(list3);
        arrayList.add(c.f.d.w.n.n.D);
        arrayList.add(c.f.d.w.n.n.f16610m);
        arrayList.add(c.f.d.w.n.n.f16604g);
        arrayList.add(c.f.d.w.n.n.f16606i);
        arrayList.add(c.f.d.w.n.n.f16608k);
        t<Number> tVarO = o(sVar);
        arrayList.add(c.f.d.w.n.n.b(Long.TYPE, Long.class, tVarO));
        arrayList.add(c.f.d.w.n.n.b(Double.TYPE, Double.class, e(z7)));
        arrayList.add(c.f.d.w.n.n.b(Float.TYPE, Float.class, f(z7)));
        arrayList.add(c.f.d.w.n.n.x);
        arrayList.add(c.f.d.w.n.n.f16612o);
        arrayList.add(c.f.d.w.n.n.q);
        arrayList.add(c.f.d.w.n.n.a(AtomicLong.class, b(tVarO)));
        arrayList.add(c.f.d.w.n.n.a(AtomicLongArray.class, c(tVarO)));
        arrayList.add(c.f.d.w.n.n.s);
        arrayList.add(c.f.d.w.n.n.z);
        arrayList.add(c.f.d.w.n.n.F);
        arrayList.add(c.f.d.w.n.n.H);
        arrayList.add(c.f.d.w.n.n.a(BigDecimal.class, c.f.d.w.n.n.B));
        arrayList.add(c.f.d.w.n.n.a(BigInteger.class, c.f.d.w.n.n.C));
        arrayList.add(c.f.d.w.n.n.J);
        arrayList.add(c.f.d.w.n.n.L);
        arrayList.add(c.f.d.w.n.n.P);
        arrayList.add(c.f.d.w.n.n.R);
        arrayList.add(c.f.d.w.n.n.W);
        arrayList.add(c.f.d.w.n.n.N);
        arrayList.add(c.f.d.w.n.n.f16601d);
        arrayList.add(c.f.d.w.n.c.f16551a);
        arrayList.add(c.f.d.w.n.n.U);
        arrayList.add(c.f.d.w.n.k.f16585a);
        arrayList.add(c.f.d.w.n.j.f16583a);
        arrayList.add(c.f.d.w.n.n.S);
        arrayList.add(c.f.d.w.n.a.f16545a);
        arrayList.add(c.f.d.w.n.n.f16599b);
        arrayList.add(new c.f.d.w.n.b(cVar));
        arrayList.add(new c.f.d.w.n.g(cVar, z2));
        c.f.d.w.n.d dVar3 = new c.f.d.w.n.d(cVar);
        this.f16444e = dVar3;
        arrayList.add(dVar3);
        arrayList.add(c.f.d.w.n.n.Z);
        arrayList.add(new c.f.d.w.n.i(cVar, dVar2, dVar, dVar3));
        this.f16445f = Collections.unmodifiableList(arrayList);
    }

    public static void a(Object obj, c.f.d.y.a aVar) {
        if (obj != null) {
            try {
                if (aVar.B0() == c.f.d.y.b.END_DOCUMENT) {
                } else {
                    throw new k("JSON document was not fully consumed.");
                }
            } catch (c.f.d.y.d e2) {
                throw new r(e2);
            } catch (IOException e3) {
                throw new k(e3);
            }
        }
    }

    public static t<AtomicLong> b(t<Number> tVar) {
        return new d(tVar).a();
    }

    public static t<AtomicLongArray> c(t<Number> tVar) {
        return new C0200e(tVar).a();
    }

    public static void d(double d2) {
        if (Double.isNaN(d2) || Double.isInfinite(d2)) {
            throw new IllegalArgumentException(d2 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public static t<Number> o(s sVar) {
        return sVar == s.DEFAULT ? c.f.d.w.n.n.t : new c();
    }

    public final t<Number> e(boolean z) {
        return z ? c.f.d.w.n.n.v : new a();
    }

    public final t<Number> f(boolean z) {
        return z ? c.f.d.w.n.n.u : new b();
    }

    public <T> T g(c.f.d.y.a aVar, Type type) {
        boolean zT = aVar.t();
        boolean z = true;
        aVar.G0(true);
        try {
            try {
                try {
                    aVar.B0();
                    z = false;
                    T tB = l(c.f.d.x.a.b(type)).b(aVar);
                    aVar.G0(zT);
                    return tB;
                } catch (EOFException e2) {
                    if (!z) {
                        throw new r(e2);
                    }
                    aVar.G0(zT);
                    return null;
                } catch (IOException e3) {
                    throw new r(e3);
                }
            } catch (AssertionError e4) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.6): " + e4.getMessage());
                assertionError.initCause(e4);
                throw assertionError;
            } catch (IllegalStateException e5) {
                throw new r(e5);
            }
        } catch (Throwable th) {
            aVar.G0(zT);
            throw th;
        }
    }

    public <T> T h(Reader reader, Class<T> cls) {
        c.f.d.y.a aVarP = p(reader);
        Object objG = g(aVarP, cls);
        a(objG, aVarP);
        return (T) c.f.d.w.k.b(cls).cast(objG);
    }

    public <T> T i(Reader reader, Type type) {
        c.f.d.y.a aVarP = p(reader);
        T t = (T) g(aVarP, type);
        a(t, aVarP);
        return t;
    }

    public <T> T j(String str, Class<T> cls) {
        return (T) c.f.d.w.k.b(cls).cast(k(str, cls));
    }

    public <T> T k(String str, Type type) {
        if (str == null) {
            return null;
        }
        return (T) i(new StringReader(str), type);
    }

    public <T> t<T> l(c.f.d.x.a<T> aVar) {
        t<T> tVar = (t) this.f16442c.get(aVar == null ? f16440a : aVar);
        if (tVar != null) {
            return tVar;
        }
        Map<c.f.d.x.a<?>, f<?>> map = this.f16441b.get();
        boolean z = false;
        if (map == null) {
            map = new HashMap<>();
            this.f16441b.set(map);
            z = true;
        }
        f<?> fVar = map.get(aVar);
        if (fVar != null) {
            return fVar;
        }
        try {
            f<?> fVar2 = new f<>();
            map.put(aVar, fVar2);
            Iterator<u> it = this.f16445f.iterator();
            while (it.hasNext()) {
                t<T> tVarA = it.next().a(this, aVar);
                if (tVarA != null) {
                    fVar2.e(tVarA);
                    this.f16442c.put(aVar, tVarA);
                    return tVarA;
                }
            }
            throw new IllegalArgumentException("GSON (2.8.6) cannot handle " + aVar);
        } finally {
            map.remove(aVar);
            if (z) {
                this.f16441b.remove();
            }
        }
    }

    public <T> t<T> m(Class<T> cls) {
        return l(c.f.d.x.a.a(cls));
    }

    public <T> t<T> n(u uVar, c.f.d.x.a<T> aVar) {
        if (!this.f16445f.contains(uVar)) {
            uVar = this.f16444e;
        }
        boolean z = false;
        for (u uVar2 : this.f16445f) {
            if (z) {
                t<T> tVarA = uVar2.a(this, aVar);
                if (tVarA != null) {
                    return tVarA;
                }
            } else if (uVar2 == uVar) {
                z = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + aVar);
    }

    public c.f.d.y.a p(Reader reader) {
        c.f.d.y.a aVar = new c.f.d.y.a(reader);
        aVar.G0(this.f16454o);
        return aVar;
    }

    public c.f.d.y.c q(Writer writer) throws IOException {
        if (this.f16451l) {
            writer.write(")]}'\n");
        }
        c.f.d.y.c cVar = new c.f.d.y.c(writer);
        if (this.f16453n) {
            cVar.V("  ");
        }
        cVar.s0(this.f16449j);
        return cVar;
    }

    public String r(j jVar) {
        StringWriter stringWriter = new StringWriter();
        v(jVar, stringWriter);
        return stringWriter.toString();
    }

    public String s(Object obj) {
        return obj == null ? r(l.f16461a) : t(obj, obj.getClass());
    }

    public String t(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        x(obj, type, stringWriter);
        return stringWriter.toString();
    }

    public String toString() {
        return "{serializeNulls:" + this.f16449j + ",factories:" + this.f16445f + ",instanceCreators:" + this.f16443d + "}";
    }

    public void u(j jVar, c.f.d.y.c cVar) {
        boolean zS = cVar.s();
        cVar.c0(true);
        boolean zR = cVar.r();
        cVar.U(this.f16452m);
        boolean zQ = cVar.q();
        cVar.s0(this.f16449j);
        try {
            try {
                c.f.d.w.l.b(jVar, cVar);
            } catch (IOException e2) {
                throw new k(e2);
            } catch (AssertionError e3) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.6): " + e3.getMessage());
                assertionError.initCause(e3);
                throw assertionError;
            }
        } finally {
            cVar.c0(zS);
            cVar.U(zR);
            cVar.s0(zQ);
        }
    }

    public void v(j jVar, Appendable appendable) {
        try {
            u(jVar, q(c.f.d.w.l.c(appendable)));
        } catch (IOException e2) {
            throw new k(e2);
        }
    }

    public void w(Object obj, Type type, c.f.d.y.c cVar) {
        t tVarL = l(c.f.d.x.a.b(type));
        boolean zS = cVar.s();
        cVar.c0(true);
        boolean zR = cVar.r();
        cVar.U(this.f16452m);
        boolean zQ = cVar.q();
        cVar.s0(this.f16449j);
        try {
            try {
                tVarL.d(cVar, obj);
            } catch (IOException e2) {
                throw new k(e2);
            } catch (AssertionError e3) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.6): " + e3.getMessage());
                assertionError.initCause(e3);
                throw assertionError;
            }
        } finally {
            cVar.c0(zS);
            cVar.U(zR);
            cVar.s0(zQ);
        }
    }

    public void x(Object obj, Type type, Appendable appendable) {
        try {
            w(obj, type, q(c.f.d.w.l.c(appendable)));
        } catch (IOException e2) {
            throw new k(e2);
        }
    }
}
