package c.k.a;

import c.k.a.s;
import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: loaded from: classes2.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f18202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f18203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f18204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f18205d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public s f18206e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c.k.a.y.j.g f18207f;

    public static class a extends v {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final u f18208b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final l.e f18209c;

        public a(u uVar, l.e eVar) {
            this.f18208b = uVar;
            this.f18209c = eVar;
        }

        @Override // c.k.a.v
        public long i() {
            return c.k.a.y.j.j.e(this.f18208b);
        }

        @Override // c.k.a.v
        public l.e l() {
            return this.f18209c;
        }
    }

    public e(q qVar, s sVar) {
        this.f18202a = qVar.c();
        this.f18206e = sVar;
    }

    public u a() {
        synchronized (this) {
            if (this.f18204c) {
                throw new IllegalStateException("Already Executed");
            }
            this.f18204c = true;
        }
        try {
            this.f18202a.m().a(this);
            u uVarB = b();
            this.f18207f.v();
            if (uVarB != null) {
                return uVarB;
            }
            throw new IOException("Canceled");
        } finally {
            this.f18202a.m().b(this);
        }
    }

    public final u b() throws IOException {
        t tVarG = this.f18206e.g();
        if (tVarG != null) {
            s.b bVarN = this.f18206e.n();
            if (tVarG.b() != null) {
                throw null;
            }
            long jA = tVarG.a();
            if (jA != -1) {
                bVarN.j("Content-Length", Long.toString(jA));
                bVarN.m("Transfer-Encoding");
            } else {
                bVarN.j("Transfer-Encoding", "chunked");
                bVarN.m("Content-Length");
            }
            this.f18206e = bVarN.h();
        }
        c.k.a.y.j.g gVar = new c.k.a.y.j.g(this.f18202a, this.f18206e, false, null, null, null, null);
        while (true) {
            this.f18207f = gVar;
            while (!this.f18205d) {
                try {
                    this.f18207f.x();
                    if (this.f18206e.g() != null) {
                        this.f18206e.g().d(this.f18207f.e());
                    }
                    this.f18207f.s();
                    u uVarI = this.f18207f.i();
                    s sVarD = this.f18207f.d();
                    if (sVarD == null) {
                        this.f18207f.v();
                        return uVarI.w().l(new a(uVarI, this.f18207f.j())).m();
                    }
                    if (this.f18207f.i().t()) {
                        int i2 = this.f18203b + 1;
                        this.f18203b = i2;
                        if (i2 > 20) {
                            throw new ProtocolException("Too many redirects: " + this.f18203b);
                        }
                    }
                    if (!this.f18207f.w(sVarD.p())) {
                        this.f18207f.v();
                    }
                    i iVarA = this.f18207f.a();
                    this.f18206e = sVarD;
                    gVar = new c.k.a.y.j.g(this.f18202a, this.f18206e, false, iVarA, null, null, uVarI);
                } catch (IOException e2) {
                    c.k.a.y.j.g gVarU = this.f18207f.u(e2, null);
                    if (gVarU == null) {
                        throw e2;
                    }
                    this.f18207f = gVarU;
                }
            }
            return null;
        }
    }
}
