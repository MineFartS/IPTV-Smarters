package com.google.ads.interactivemedia.v3.internal;

import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
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
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes.dex */
public final class bfg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<bfw> f21030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f21031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ThreadLocal<Map<bjh<?>, bff<?>>> f21032c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<bjh<?>, bfv<?>> f21033d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final bgi f21034e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final bhg f21035f;

    static {
        bjh.a(Object.class);
    }

    public bfg() {
        bgk bgkVar = bgk.f21079a;
        throw null;
    }

    public bfg(bgk bgkVar, bez bezVar, Map<Type, bfi<?>> map, boolean z, int i2, List<bfw> list) {
        this.f21032c = new ThreadLocal<>();
        this.f21033d = new ConcurrentHashMap();
        bgi bgiVar = new bgi(map);
        this.f21034e = bgiVar;
        this.f21031b = true;
        ArrayList arrayList = new ArrayList();
        arrayList.add(bjc.W);
        arrayList.add(bhm.f21140a);
        arrayList.add(bgkVar);
        arrayList.addAll(list);
        arrayList.add(bjc.B);
        arrayList.add(bjc.f21206m);
        arrayList.add(bjc.f21200g);
        arrayList.add(bjc.f21202i);
        arrayList.add(bjc.f21204k);
        bfv bfcVar = i2 == bft.f21049a ? bjc.t : new bfc();
        arrayList.add(bjc.c(Long.TYPE, Long.class, bfcVar));
        arrayList.add(bjc.c(Double.TYPE, Double.class, new bfa()));
        arrayList.add(bjc.c(Float.TYPE, Float.class, new bfb()));
        arrayList.add(bjc.v);
        arrayList.add(bjc.f21208o);
        arrayList.add(bjc.q);
        arrayList.add(bjc.b(AtomicLong.class, new bfd(bfcVar).nullSafe()));
        arrayList.add(bjc.b(AtomicLongArray.class, new bfe(bfcVar).nullSafe()));
        arrayList.add(bjc.s);
        arrayList.add(bjc.x);
        arrayList.add(bjc.D);
        arrayList.add(bjc.F);
        arrayList.add(bjc.b(BigDecimal.class, bjc.z));
        arrayList.add(bjc.b(BigInteger.class, bjc.A));
        arrayList.add(bjc.H);
        arrayList.add(bjc.J);
        arrayList.add(bjc.N);
        arrayList.add(bjc.P);
        arrayList.add(bjc.U);
        arrayList.add(bjc.L);
        arrayList.add(bjc.f21197d);
        arrayList.add(bhf.f21122a);
        arrayList.add(bjc.S);
        arrayList.add(bhr.f21160a);
        arrayList.add(bhq.f21158a);
        arrayList.add(bjc.Q);
        arrayList.add(bhc.f21116a);
        arrayList.add(bjc.f21195b);
        arrayList.add(new bhg(bgiVar, 1));
        arrayList.add(new bhg(bgiVar, 2));
        bhg bhgVar = new bhg(bgiVar);
        this.f21035f = bhgVar;
        arrayList.add(bhgVar);
        arrayList.add(bjc.X);
        arrayList.add(new bhp(bgiVar, bezVar, bgkVar, bhgVar));
        this.f21030a = Collections.unmodifiableList(arrayList);
    }

    public static void g(double d2) {
        if (Double.isNaN(d2) || Double.isInfinite(d2)) {
            StringBuilder sb = new StringBuilder(DateTimeConstants.HOURS_PER_WEEK);
            sb.append(d2);
            sb.append(" is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public final <T> bfv<T> a(bjh<T> bjhVar) {
        boolean z;
        bfv<T> bfvVar = (bfv) this.f21033d.get(bjhVar);
        if (bfvVar != null) {
            return bfvVar;
        }
        Map<bjh<?>, bff<?>> map = this.f21032c.get();
        if (map == null) {
            map = new HashMap<>();
            this.f21032c.set(map);
            z = true;
        } else {
            z = false;
        }
        bff<?> bffVar = map.get(bjhVar);
        if (bffVar != null) {
            return bffVar;
        }
        try {
            bff<?> bffVar2 = new bff<>();
            map.put(bjhVar, bffVar2);
            Iterator<bfw> it = this.f21030a.iterator();
            while (it.hasNext()) {
                bfv<T> bfvVarA = it.next().a(this, bjhVar);
                if (bfvVarA != null) {
                    bffVar2.a(bfvVarA);
                    this.f21033d.put(bjhVar, bfvVarA);
                    return bfvVarA;
                }
            }
            String strValueOf = String.valueOf(bjhVar);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 40);
            sb.append("GSON (${project.version}) cannot handle ");
            sb.append(strValueOf);
            throw new IllegalArgumentException(sb.toString());
        } finally {
            map.remove(bjhVar);
            if (z) {
                this.f21032c.remove();
            }
        }
    }

    public final <T> bfv<T> b(Class<T> cls) {
        return a(bjh.a(cls));
    }

    public final <T> bfv<T> c(bfw bfwVar, bjh<T> bjhVar) {
        if (!this.f21030a.contains(bfwVar)) {
            bfwVar = this.f21035f;
        }
        boolean z = false;
        for (bfw bfwVar2 : this.f21030a) {
            if (z) {
                bfv<T> bfvVarA = bfwVar2.a(this, bjhVar);
                if (bfvVarA != null) {
                    return bfvVarA;
                }
            } else if (bfwVar2 == bfwVar) {
                z = true;
            }
        }
        String strValueOf = String.valueOf(bjhVar);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 22);
        sb.append("GSON cannot serialize ");
        sb.append(strValueOf);
        throw new IllegalArgumentException(sb.toString());
    }

    public final <T> T d(bjj bjjVar, Type type) {
        boolean zT = bjjVar.t();
        boolean z = true;
        bjjVar.s(true);
        try {
            try {
                try {
                    bjjVar.p();
                    try {
                        return a(bjh.b(type)).read(bjjVar);
                    } catch (EOFException e2) {
                        e = e2;
                        z = false;
                        if (!z) {
                            throw new bfs(e);
                        }
                        bjjVar.s(zT);
                        return null;
                    }
                } catch (IOException e3) {
                    throw new bfs(e3);
                } catch (AssertionError e4) {
                    String strValueOf = String.valueOf(e4.getMessage());
                    AssertionError assertionError = new AssertionError(strValueOf.length() != 0 ? "AssertionError (GSON ${project.version}): ".concat(strValueOf) : new String("AssertionError (GSON ${project.version}): "));
                    assertionError.initCause(e4);
                    throw assertionError;
                } catch (IllegalStateException e5) {
                    throw new bfs(e5);
                }
            } catch (EOFException e6) {
                e = e6;
            }
        } finally {
            bjjVar.s(zT);
        }
    }

    public final <T> T e(Reader reader, Type type) {
        bjj bjjVar = new bjj(reader);
        bjjVar.s(false);
        T t = (T) d(bjjVar, type);
        if (t != null) {
            try {
                if (bjjVar.p() != 10) {
                    throw new bfm("JSON document was not fully consumed.");
                }
            } catch (bjm e2) {
                throw new bfs(e2);
            } catch (IOException e3) {
                throw new bfm(e3);
            }
        }
        return t;
    }

    public final String f(Object obj) {
        Class<?> cls = obj.getClass();
        StringWriter stringWriter = new StringWriter();
        try {
            bjl bjlVar = new bjl(avq.h(stringWriter));
            bjlVar.o(false);
            h(obj, cls, bjlVar);
            return stringWriter.toString();
        } catch (IOException e2) {
            throw new bfm(e2);
        }
    }

    public final void h(Object obj, Type type, bjl bjlVar) {
        bfv bfvVarA = a(bjh.b(type));
        boolean zR = bjlVar.r();
        bjlVar.n(true);
        boolean zQ = bjlVar.q();
        bjlVar.m(this.f21031b);
        boolean zP = bjlVar.p();
        bjlVar.o(false);
        try {
            try {
                bfvVarA.write(bjlVar, obj);
            } catch (IOException e2) {
                throw new bfm(e2);
            } catch (AssertionError e3) {
                String strValueOf = String.valueOf(e3.getMessage());
                AssertionError assertionError = new AssertionError(strValueOf.length() != 0 ? "AssertionError (GSON ${project.version}): ".concat(strValueOf) : new String("AssertionError (GSON ${project.version}): "));
                assertionError.initCause(e3);
                throw assertionError;
            }
        } finally {
            bjlVar.n(zR);
            bjlVar.m(zQ);
            bjlVar.o(zP);
        }
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.f21030a + ",instanceCreators:" + this.f21034e + "}";
    }
}
