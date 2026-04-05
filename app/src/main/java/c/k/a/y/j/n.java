package c.k.a.y.j;

import c.k.a.o;
import c.k.a.r;
import c.k.a.u;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import l.s;
import l.t;
import l.u;

/* JADX INFO: loaded from: classes2.dex */
public final class n implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List<l.f> f18457a = c.k.a.y.h.m(l.f.s("connection"), l.f.s("host"), l.f.s("keep-alive"), l.f.s("proxy-connection"), l.f.s("transfer-encoding"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<l.f> f18458b = c.k.a.y.h.m(l.f.s("connection"), l.f.s("host"), l.f.s("keep-alive"), l.f.s("proxy-connection"), l.f.s("te"), l.f.s("transfer-encoding"), l.f.s("encoding"), l.f.s("upgrade"));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f18459c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c.k.a.y.k.o f18460d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c.k.a.y.k.p f18461e;

    public static class a implements t {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c.k.a.y.k.p f18462b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final t f18463c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final b f18464d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final s f18465e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f18466f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f18467g;

        public a(c.k.a.y.k.p pVar, b bVar) {
            this.f18462b = pVar;
            this.f18463c = pVar.r();
            s sVarBody = bVar != null ? bVar.body() : null;
            bVar = sVarBody == null ? null : bVar;
            this.f18465e = sVarBody;
            this.f18464d = bVar;
        }

        @Override // l.t, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f18467g) {
                return;
            }
            if (!this.f18466f && this.f18465e != null) {
                d();
            }
            this.f18467g = true;
            if (this.f18466f) {
                return;
            }
            this.f18462b.n(c.k.a.y.k.a.CANCEL);
            b bVar = this.f18464d;
            if (bVar != null) {
                bVar.a();
            }
        }

        public final boolean d() {
            boolean z;
            long jH = this.f18462b.u().h();
            this.f18462b.u().g(100L, TimeUnit.MILLISECONDS);
            try {
                c.k.a.y.h.q(this, 100);
                z = true;
            } catch (IOException unused) {
                z = false;
            } catch (Throwable th) {
                this.f18462b.u().g(jH, TimeUnit.NANOSECONDS);
                throw th;
            }
            this.f18462b.u().g(jH, TimeUnit.NANOSECONDS);
            return z;
        }

        @Override // l.t
        public long k(l.c cVar, long j2) {
            if (j2 < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j2);
            }
            if (this.f18467g) {
                throw new IllegalStateException("closed");
            }
            if (this.f18466f) {
                return -1L;
            }
            long jK = this.f18463c.k(cVar, j2);
            if (jK == -1) {
                this.f18466f = true;
                if (this.f18464d != null) {
                    this.f18465e.close();
                }
                return -1L;
            }
            s sVar = this.f18465e;
            if (sVar != null) {
                sVar.h(cVar.clone(), jK);
            }
            return jK;
        }

        @Override // l.t
        public u timeout() {
            return this.f18463c.timeout();
        }
    }

    public n(g gVar, c.k.a.y.k.o oVar) {
        this.f18459c = gVar;
        this.f18460d = oVar;
    }

    public static boolean j(r rVar, l.f fVar) {
        List<l.f> list;
        if (rVar == r.SPDY_3) {
            list = f18457a;
        } else {
            if (rVar != r.HTTP_2) {
                throw new AssertionError(rVar);
            }
            list = f18458b;
        }
        return list.contains(fVar);
    }

    public static String k(String str, String str2) {
        return str + (char) 0 + str2;
    }

    public static u.b l(List<c.k.a.y.k.d> list, r rVar) throws ProtocolException {
        o.b bVar = new o.b();
        bVar.g(j.f18438e, rVar.toString());
        String str = null;
        String str2 = "HTTP/1.1";
        for (int i2 = 0; i2 < list.size(); i2++) {
            l.f fVar = list.get(i2).f18478h;
            String strE = list.get(i2).f18479i.E();
            int i3 = 0;
            while (i3 < strE.length()) {
                int iIndexOf = strE.indexOf(0, i3);
                if (iIndexOf == -1) {
                    iIndexOf = strE.length();
                }
                String strSubstring = strE.substring(i3, iIndexOf);
                if (fVar.equals(c.k.a.y.k.d.f18471a)) {
                    str = strSubstring;
                } else if (fVar.equals(c.k.a.y.k.d.f18477g)) {
                    str2 = strSubstring;
                } else if (!j(rVar, fVar)) {
                    bVar.b(fVar.E(), strSubstring);
                }
                i3 = iIndexOf + 1;
            }
        }
        if (str == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        if (str2 == null) {
            throw new ProtocolException("Expected ':version' header not present");
        }
        o oVarA = o.a(str2 + " " + str);
        return new u.b().x(rVar).q(oVarA.f18469b).u(oVarA.f18470c).t(bVar.e());
    }

    public static List<c.k.a.y.k.d> m(c.k.a.s sVar, r rVar, String str) {
        c.k.a.y.k.d dVar;
        c.k.a.o oVarJ = sVar.j();
        ArrayList arrayList = new ArrayList(oVarJ.f() + 10);
        arrayList.add(new c.k.a.y.k.d(c.k.a.y.k.d.f18472b, sVar.m()));
        arrayList.add(new c.k.a.y.k.d(c.k.a.y.k.d.f18473c, k.c(sVar.p())));
        String strM = g.m(sVar.p());
        if (r.SPDY_3 == rVar) {
            arrayList.add(new c.k.a.y.k.d(c.k.a.y.k.d.f18477g, str));
            dVar = new c.k.a.y.k.d(c.k.a.y.k.d.f18476f, strM);
        } else {
            if (r.HTTP_2 != rVar) {
                throw new AssertionError();
            }
            dVar = new c.k.a.y.k.d(c.k.a.y.k.d.f18475e, strM);
        }
        arrayList.add(dVar);
        arrayList.add(new c.k.a.y.k.d(c.k.a.y.k.d.f18474d, sVar.p().getProtocol()));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (int i2 = 0; i2 < oVarJ.f(); i2++) {
            l.f fVarS = l.f.s(oVarJ.d(i2).toLowerCase(Locale.US));
            String strG = oVarJ.g(i2);
            if (!j(rVar, fVarS) && !fVarS.equals(c.k.a.y.k.d.f18472b) && !fVarS.equals(c.k.a.y.k.d.f18473c) && !fVarS.equals(c.k.a.y.k.d.f18474d) && !fVarS.equals(c.k.a.y.k.d.f18475e) && !fVarS.equals(c.k.a.y.k.d.f18476f) && !fVarS.equals(c.k.a.y.k.d.f18477g)) {
                if (linkedHashSet.add(fVarS)) {
                    arrayList.add(new c.k.a.y.k.d(fVarS, strG));
                } else {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= arrayList.size()) {
                            break;
                        }
                        if (((c.k.a.y.k.d) arrayList.get(i3)).f18478h.equals(fVarS)) {
                            arrayList.set(i3, new c.k.a.y.k.d(fVarS, k(((c.k.a.y.k.d) arrayList.get(i3)).f18479i.E(), strG)));
                            break;
                        }
                        i3++;
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // c.k.a.y.j.p
    public void a() {
        this.f18461e.q().close();
    }

    @Override // c.k.a.y.j.p
    public s b(c.k.a.s sVar, long j2) {
        return this.f18461e.q();
    }

    @Override // c.k.a.y.j.p
    public void c() {
    }

    @Override // c.k.a.y.j.p
    public void d(c.k.a.s sVar) {
        if (this.f18461e != null) {
            return;
        }
        this.f18459c.A();
        boolean zR = this.f18459c.r();
        String strD = k.d(this.f18459c.f().f());
        c.k.a.y.k.o oVar = this.f18460d;
        c.k.a.y.k.p pVarH0 = oVar.H0(m(sVar, oVar.D0(), strD), zR, true);
        this.f18461e = pVarH0;
        pVarH0.u().g(this.f18459c.f18417b.w(), TimeUnit.MILLISECONDS);
    }

    @Override // c.k.a.y.j.p
    public void e() {
    }

    @Override // c.k.a.y.j.p
    public void f(l lVar) {
        lVar.i(this.f18461e.q());
    }

    @Override // c.k.a.y.j.p
    public u.b g() {
        return l(this.f18461e.p(), this.f18460d.D0());
    }

    @Override // c.k.a.y.j.p
    public boolean h() {
        return true;
    }

    @Override // c.k.a.y.j.p
    public t i(b bVar) {
        return new a(this.f18461e, bVar);
    }
}
