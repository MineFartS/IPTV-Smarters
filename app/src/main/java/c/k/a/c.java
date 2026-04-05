package c.k.a;

import c.k.a.o;
import c.k.a.s;
import c.k.a.u;
import c.k.a.y.a;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c.k.a.y.c f18153a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.k.a.y.a f18154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18155c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18156d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18157e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f18158f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f18159g;

    public class a implements c.k.a.y.c {
        public a() {
        }

        @Override // c.k.a.y.c
        public void a() {
            c.this.n();
        }

        @Override // c.k.a.y.c
        public c.k.a.y.j.b b(u uVar) {
            return c.this.k(uVar);
        }

        @Override // c.k.a.y.c
        public u c(s sVar) {
            return c.this.j(sVar);
        }

        @Override // c.k.a.y.c
        public void d(s sVar) {
            c.this.m(sVar);
        }

        @Override // c.k.a.y.c
        public void e(c.k.a.y.j.c cVar) {
            c.this.o(cVar);
        }

        @Override // c.k.a.y.c
        public void f(u uVar, u uVar2) {
            c.this.p(uVar, uVar2);
        }
    }

    public final class b implements c.k.a.y.j.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a.c f18161a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public l.s f18162b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f18163c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public l.s f18164d;

        public class a extends l.h {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ c f18166c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ a.c f18167d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(l.s sVar, c cVar, a.c cVar2) {
                super(sVar);
                this.f18166c = cVar;
                this.f18167d = cVar2;
            }

            @Override // l.h, l.s, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                synchronized (c.this) {
                    if (b.this.f18163c) {
                        return;
                    }
                    b.this.f18163c = true;
                    c.g(c.this);
                    super.close();
                    this.f18167d.e();
                }
            }
        }

        public b(a.c cVar) {
            this.f18161a = cVar;
            l.s sVarF = cVar.f(1);
            this.f18162b = sVarF;
            this.f18164d = new a(sVarF, c.this, cVar);
        }

        @Override // c.k.a.y.j.b
        public void a() {
            synchronized (c.this) {
                if (this.f18163c) {
                    return;
                }
                this.f18163c = true;
                c.h(c.this);
                c.k.a.y.h.c(this.f18162b);
                try {
                    this.f18161a.a();
                } catch (IOException unused) {
                }
            }
        }

        @Override // c.k.a.y.j.b
        public l.s body() {
            return this.f18164d;
        }
    }

    /* JADX INFO: renamed from: c.k.a.c$c, reason: collision with other inner class name */
    public static class C0244c extends v {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a.e f18169b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final l.e f18170c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f18171d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f18172e;

        /* JADX INFO: renamed from: c.k.a.c$c$a */
        public class a extends l.i {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ a.e f18173c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(l.t tVar, a.e eVar) {
                super(tVar);
                this.f18173c = eVar;
            }

            @Override // l.i, l.t, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                this.f18173c.close();
                super.close();
            }
        }

        public C0244c(a.e eVar, String str, String str2) {
            this.f18169b = eVar;
            this.f18171d = str;
            this.f18172e = str2;
            this.f18170c = l.m.c(new a(eVar.i(1), eVar));
        }

        @Override // c.k.a.v
        public long i() {
            try {
                String str = this.f18172e;
                if (str != null) {
                    return Long.parseLong(str);
                }
                return -1L;
            } catch (NumberFormatException unused) {
                return -1L;
            }
        }

        @Override // c.k.a.v
        public l.e l() {
            return this.f18170c;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f18175a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final o f18176b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f18177c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final r f18178d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f18179e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f18180f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final o f18181g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final n f18182h;

        public d(u uVar) {
            this.f18175a = uVar.y().q();
            this.f18176b = c.k.a.y.j.j.m(uVar);
            this.f18177c = uVar.y().m();
            this.f18178d = uVar.x();
            this.f18179e = uVar.o();
            this.f18180f = uVar.u();
            this.f18181g = uVar.s();
            this.f18182h = uVar.p();
        }

        public d(l.t tVar) {
            try {
                l.e eVarC = l.m.c(tVar);
                this.f18175a = eVarC.b0();
                this.f18177c = eVarC.b0();
                o.b bVar = new o.b();
                int iL = c.l(eVarC);
                for (int i2 = 0; i2 < iL; i2++) {
                    bVar.d(eVarC.b0());
                }
                this.f18176b = bVar.e();
                c.k.a.y.j.o oVarA = c.k.a.y.j.o.a(eVarC.b0());
                this.f18178d = oVarA.f18468a;
                this.f18179e = oVarA.f18469b;
                this.f18180f = oVarA.f18470c;
                o.b bVar2 = new o.b();
                int iL2 = c.l(eVarC);
                for (int i3 = 0; i3 < iL2; i3++) {
                    bVar2.d(eVarC.b0());
                }
                this.f18181g = bVar2.e();
                if (a()) {
                    String strB0 = eVarC.b0();
                    if (strB0.length() > 0) {
                        throw new IOException("expected \"\" but was \"" + strB0 + "\"");
                    }
                    this.f18182h = n.b(eVarC.b0(), c(eVarC), c(eVarC));
                } else {
                    this.f18182h = null;
                }
            } finally {
                tVar.close();
            }
        }

        public final boolean a() {
            return this.f18175a.startsWith("https://");
        }

        public boolean b(s sVar, u uVar) {
            return this.f18175a.equals(sVar.q()) && this.f18177c.equals(sVar.m()) && c.k.a.y.j.j.n(uVar, this.f18176b, sVar);
        }

        public final List<Certificate> c(l.e eVar) throws IOException {
            int iL = c.l(eVar);
            if (iL == -1) {
                return Collections.emptyList();
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(iL);
                for (int i2 = 0; i2 < iL; i2++) {
                    arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(l.f.o(eVar.b0()).D())));
                }
                return arrayList;
            } catch (CertificateException e2) {
                throw new IOException(e2.getMessage());
            }
        }

        public u d(s sVar, a.e eVar) {
            String strA = this.f18181g.a("Content-Type");
            String strA2 = this.f18181g.a("Content-Length");
            return new u.b().z(new s.b().n(this.f18175a).l(this.f18177c, null).k(this.f18176b).h()).x(this.f18178d).q(this.f18179e).u(this.f18180f).t(this.f18181g).l(new C0244c(eVar, strA, strA2)).r(this.f18182h).m();
        }

        public final void e(l.d dVar, List<Certificate> list) throws IOException {
            try {
                dVar.P(Integer.toString(list.size()));
                dVar.I(10);
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    dVar.P(l.f.v(list.get(i2).getEncoded()).d());
                    dVar.I(10);
                }
            } catch (CertificateEncodingException e2) {
                throw new IOException(e2.getMessage());
            }
        }

        public void f(a.c cVar) throws IOException {
            l.d dVarB = l.m.b(cVar.f(0));
            dVarB.P(this.f18175a);
            dVarB.I(10);
            dVarB.P(this.f18177c);
            dVarB.I(10);
            dVarB.P(Integer.toString(this.f18176b.f()));
            dVarB.I(10);
            for (int i2 = 0; i2 < this.f18176b.f(); i2++) {
                dVarB.P(this.f18176b.d(i2));
                dVarB.P(": ");
                dVarB.P(this.f18176b.g(i2));
                dVarB.I(10);
            }
            dVarB.P(new c.k.a.y.j.o(this.f18178d, this.f18179e, this.f18180f).toString());
            dVarB.I(10);
            dVarB.P(Integer.toString(this.f18181g.f()));
            dVarB.I(10);
            for (int i3 = 0; i3 < this.f18181g.f(); i3++) {
                dVarB.P(this.f18181g.d(i3));
                dVarB.P(": ");
                dVarB.P(this.f18181g.g(i3));
                dVarB.I(10);
            }
            if (a()) {
                dVarB.I(10);
                dVarB.P(this.f18182h.a());
                dVarB.I(10);
                e(dVarB, this.f18182h.e());
                e(dVarB, this.f18182h.d());
            }
            dVarB.close();
        }
    }

    public c(File file, long j2) {
        this.f18154b = c.k.a.y.a.c0(file, 201105, 2, j2);
    }

    public static /* synthetic */ int g(c cVar) {
        int i2 = cVar.f18155c;
        cVar.f18155c = i2 + 1;
        return i2;
    }

    public static /* synthetic */ int h(c cVar) {
        int i2 = cVar.f18156d;
        cVar.f18156d = i2 + 1;
        return i2;
    }

    public static int l(l.e eVar) throws IOException {
        String strB0 = eVar.b0();
        try {
            return Integer.parseInt(strB0);
        } catch (NumberFormatException unused) {
            throw new IOException("Expected an integer but was \"" + strB0 + "\"");
        }
    }

    public static String q(s sVar) {
        return c.k.a.y.h.k(sVar.q());
    }

    public final void a(a.c cVar) {
        if (cVar != null) {
            try {
                cVar.a();
            } catch (IOException unused) {
            }
        }
    }

    public u j(s sVar) {
        try {
            a.e eVarU = this.f18154b.U(q(sVar));
            if (eVarU == null) {
                return null;
            }
            try {
                d dVar = new d(eVarU.i(0));
                u uVarD = dVar.d(sVar, eVarU);
                if (dVar.b(sVar, uVarD)) {
                    return uVarD;
                }
                c.k.a.y.h.c(uVarD.k());
                return null;
            } catch (IOException unused) {
                c.k.a.y.h.c(eVarU);
                return null;
            }
        } catch (IOException unused2) {
        }
    }

    public final c.k.a.y.j.b k(u uVar) {
        a.c cVarY;
        String strM = uVar.y().m();
        if (c.k.a.y.j.h.a(uVar.y().m())) {
            try {
                m(uVar.y());
            } catch (IOException unused) {
            }
            return null;
        }
        if (!strM.equals("GET") || c.k.a.y.j.j.f(uVar)) {
            return null;
        }
        d dVar = new d(uVar);
        try {
            cVarY = this.f18154b.y(q(uVar.y()));
            if (cVarY == null) {
                return null;
            }
            try {
                dVar.f(cVarY);
                return new b(cVarY);
            } catch (IOException unused2) {
                a(cVarY);
                return null;
            }
        } catch (IOException unused3) {
            cVarY = null;
        }
    }

    public final void m(s sVar) {
        this.f18154b.C0(q(sVar));
    }

    public final synchronized void n() {
        this.f18158f++;
    }

    public final synchronized void o(c.k.a.y.j.c cVar) {
        this.f18159g++;
        if (cVar.f18371a != null) {
            this.f18157e++;
        } else if (cVar.f18372b != null) {
            this.f18158f++;
        }
    }

    public final void p(u uVar, u uVar2) {
        a.c cVarD;
        d dVar = new d(uVar2);
        try {
            cVarD = ((C0244c) uVar.k()).f18169b.d();
            if (cVarD != null) {
                try {
                    dVar.f(cVarD);
                    cVarD.e();
                } catch (IOException unused) {
                    a(cVarD);
                }
            }
        } catch (IOException unused2) {
            cVarD = null;
        }
    }
}
