package o;

import java.io.IOException;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import k.c0;
import k.d0;
import k.v;
import l.t;

/* JADX INFO: loaded from: classes.dex */
public final class h<T> implements o.b<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n<T, ?> f31256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Object[] f31257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f31258d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @GuardedBy("this")
    @Nullable
    public k.e f31259e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @GuardedBy("this")
    @Nullable
    public Throwable f31260f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @GuardedBy("this")
    public boolean f31261g;

    /* JADX INFO: loaded from: classes2.dex */
    public class a implements k.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f31262a;

        public a(d dVar) {
            this.f31262a = dVar;
        }

        @Override // k.f
        public void a(k.e eVar, c0 c0Var) {
            try {
                d(h.this.c(c0Var));
            } catch (Throwable th) {
                c(th);
            }
        }

        @Override // k.f
        public void b(k.e eVar, IOException iOException) {
            try {
                this.f31262a.a(h.this, iOException);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        public final void c(Throwable th) {
            try {
                this.f31262a.a(h.this, th);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }

        public final void d(l<T> lVar) {
            try {
                this.f31262a.b(h.this, lVar);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class b extends d0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d0 f31264c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public IOException f31265d;

        public class a extends l.i {
            public a(t tVar) {
                super(tVar);
            }

            @Override // l.i, l.t
            public long k(l.c cVar, long j2) throws IOException {
                try {
                    return super.k(cVar, j2);
                } catch (IOException e2) {
                    b.this.f31265d = e2;
                    throw e2;
                }
            }
        }

        public b(d0 d0Var) {
            this.f31264c = d0Var;
        }

        @Override // k.d0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f31264c.close();
        }

        @Override // k.d0
        public long l() {
            return this.f31264c.l();
        }

        @Override // k.d0
        public v m() {
            return this.f31264c.m();
        }

        @Override // k.d0
        public l.e p() {
            return l.m.c(new a(this.f31264c.p()));
        }

        public void r() throws IOException {
            IOException iOException = this.f31265d;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class c extends d0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final v f31267c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f31268d;

        public c(v vVar, long j2) {
            this.f31267c = vVar;
            this.f31268d = j2;
        }

        @Override // k.d0
        public long l() {
            return this.f31268d;
        }

        @Override // k.d0
        public v m() {
            return this.f31267c;
        }

        @Override // k.d0
        public l.e p() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    public h(n<T, ?> nVar, @Nullable Object[] objArr) {
        this.f31256b = nVar;
        this.f31257c = objArr;
    }

    @Override // o.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public h<T> clone() {
        return new h<>(this.f31256b, this.f31257c);
    }

    public final k.e b() {
        k.e eVarA = this.f31256b.f31332c.a(this.f31256b.c(this.f31257c));
        if (eVarA != null) {
            return eVarA;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    public l<T> c(c0 c0Var) throws IOException {
        d0 d0VarD = c0Var.d();
        c0 c0VarC = c0Var.r().b(new c(d0VarD.m(), d0VarD.l())).c();
        int iL = c0VarC.l();
        if (iL < 200 || iL >= 300) {
            try {
                return l.c(o.a(d0VarD), c0VarC);
            } finally {
                d0VarD.close();
            }
        }
        if (iL == 204 || iL == 205) {
            d0VarD.close();
            return l.f(null, c0VarC);
        }
        b bVar = new b(d0VarD);
        try {
            return l.f(this.f31256b.d(bVar), c0VarC);
        } catch (RuntimeException e2) {
            bVar.r();
            throw e2;
        }
    }

    @Override // o.b
    public boolean d() {
        boolean z = true;
        if (this.f31258d) {
            return true;
        }
        synchronized (this) {
            k.e eVar = this.f31259e;
            if (eVar == null || !eVar.d()) {
                z = false;
            }
        }
        return z;
    }

    @Override // o.b
    public void x(d<T> dVar) {
        k.e eVar;
        Throwable th;
        o.b(dVar, "callback == null");
        synchronized (this) {
            if (this.f31261g) {
                throw new IllegalStateException("Already executed.");
            }
            this.f31261g = true;
            eVar = this.f31259e;
            th = this.f31260f;
            if (eVar == null && th == null) {
                try {
                    k.e eVarB = b();
                    this.f31259e = eVarB;
                    eVar = eVarB;
                } catch (Throwable th2) {
                    th = th2;
                    this.f31260f = th;
                }
            }
        }
        if (th != null) {
            dVar.a(this, th);
            return;
        }
        if (this.f31258d) {
            eVar.cancel();
        }
        eVar.i(new a(dVar));
    }
}
