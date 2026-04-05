package k.g0.i;

import com.amazonaws.http.HttpHeader;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import k.a0;
import k.c0;
import k.d0;
import k.s;
import k.x;
import k.y;
import l.t;
import l.u;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements k.g0.g.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l.f f30713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l.f f30714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l.f f30715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l.f f30716d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l.f f30717e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final l.f f30718f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final l.f f30719g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final l.f f30720h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final List<l.f> f30721i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final List<l.f> f30722j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final x f30723k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final k.g0.f.g f30724l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final g f30725m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public i f30726n;

    public class a extends l.i {
        public a(t tVar) {
            super(tVar);
        }

        @Override // l.i, l.t, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            f fVar = f.this;
            fVar.f30724l.p(false, fVar);
            super.close();
        }
    }

    static {
        l.f fVarS = l.f.s("connection");
        f30713a = fVarS;
        l.f fVarS2 = l.f.s("host");
        f30714b = fVarS2;
        l.f fVarS3 = l.f.s("keep-alive");
        f30715c = fVarS3;
        l.f fVarS4 = l.f.s("proxy-connection");
        f30716d = fVarS4;
        l.f fVarS5 = l.f.s("transfer-encoding");
        f30717e = fVarS5;
        l.f fVarS6 = l.f.s("te");
        f30718f = fVarS6;
        l.f fVarS7 = l.f.s("encoding");
        f30719g = fVarS7;
        l.f fVarS8 = l.f.s("upgrade");
        f30720h = fVarS8;
        f30721i = k.g0.c.o(fVarS, fVarS2, fVarS3, fVarS4, fVarS6, fVarS5, fVarS7, fVarS8, c.f30682c, c.f30683d, c.f30684e, c.f30685f);
        f30722j = k.g0.c.o(fVarS, fVarS2, fVarS3, fVarS4, fVarS6, fVarS5, fVarS7, fVarS8);
    }

    public f(x xVar, k.g0.f.g gVar, g gVar2) {
        this.f30723k = xVar;
        this.f30724l = gVar;
        this.f30725m = gVar2;
    }

    public static List<c> g(a0 a0Var) {
        s sVarD = a0Var.d();
        ArrayList arrayList = new ArrayList(sVarD.f() + 4);
        arrayList.add(new c(c.f30682c, a0Var.f()));
        arrayList.add(new c(c.f30683d, k.g0.g.i.c(a0Var.h())));
        String strC = a0Var.c(HttpHeader.HOST);
        if (strC != null) {
            arrayList.add(new c(c.f30685f, strC));
        }
        arrayList.add(new c(c.f30684e, a0Var.h().D()));
        int iF = sVarD.f();
        for (int i2 = 0; i2 < iF; i2++) {
            l.f fVarS = l.f.s(sVarD.c(i2).toLowerCase(Locale.US));
            if (!f30721i.contains(fVarS)) {
                arrayList.add(new c(fVarS, sVarD.g(i2)));
            }
        }
        return arrayList;
    }

    public static c0.a h(List<c> list) throws ProtocolException {
        s.a aVar = new s.a();
        int size = list.size();
        k.g0.g.k kVarA = null;
        for (int i2 = 0; i2 < size; i2++) {
            c cVar = list.get(i2);
            if (cVar != null) {
                l.f fVar = cVar.f30686g;
                String strE = cVar.f30687h.E();
                if (fVar.equals(c.f30681b)) {
                    kVarA = k.g0.g.k.a("HTTP/1.1 " + strE);
                } else if (!f30722j.contains(fVar)) {
                    k.g0.a.f30553a.b(aVar, fVar.E(), strE);
                }
            } else if (kVarA != null && kVarA.f30655b == 100) {
                aVar = new s.a();
                kVarA = null;
            }
        }
        if (kVarA != null) {
            return new c0.a().m(y.HTTP_2).g(kVarA.f30655b).j(kVarA.f30656c).i(aVar.d());
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    @Override // k.g0.g.c
    public void a() {
        this.f30725m.flush();
    }

    @Override // k.g0.g.c
    public void b() {
        this.f30726n.h().close();
    }

    @Override // k.g0.g.c
    public void c(a0 a0Var) {
        if (this.f30726n != null) {
            return;
        }
        i iVarP = this.f30725m.p(g(a0Var), a0Var.a() != null);
        this.f30726n = iVarP;
        u uVarL = iVarP.l();
        long jB = this.f30723k.B();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        uVarL.g(jB, timeUnit);
        this.f30726n.s().g(this.f30723k.H(), timeUnit);
    }

    @Override // k.g0.g.c
    public void cancel() {
        i iVar = this.f30726n;
        if (iVar != null) {
            iVar.f(b.CANCEL);
        }
    }

    @Override // k.g0.g.c
    public d0 d(c0 c0Var) {
        return new k.g0.g.h(c0Var.p(), l.m.c(new a(this.f30726n.i())));
    }

    @Override // k.g0.g.c
    public c0.a e(boolean z) throws ProtocolException {
        c0.a aVarH = h(this.f30726n.q());
        if (z && k.g0.a.f30553a.d(aVarH) == 100) {
            return null;
        }
        return aVarH;
    }

    @Override // k.g0.g.c
    public l.s f(a0 a0Var, long j2) {
        return this.f30726n.h();
    }
}
