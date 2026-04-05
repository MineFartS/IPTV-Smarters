package h.l.c;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a implements h.n.a, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f30372b = C0307a.f30375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient h.n.a f30373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f30374d;

    /* JADX INFO: renamed from: h.l.c.a$a, reason: collision with other inner class name */
    public static class C0307a implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C0307a f30375b = new C0307a();
    }

    public a() {
        this(f30372b);
    }

    public a(Object obj) {
        this.f30374d = obj;
    }

    public h.n.a a() {
        h.n.a aVar = this.f30373c;
        if (aVar != null) {
            return aVar;
        }
        h.n.a aVarB = b();
        this.f30373c = aVarB;
        return aVarB;
    }

    public abstract h.n.a b();

    public Object c() {
        return this.f30374d;
    }

    public String d() {
        throw new AbstractMethodError();
    }

    public h.n.c e() {
        throw new AbstractMethodError();
    }

    public String f() {
        throw new AbstractMethodError();
    }
}
