package o.p.a;

import c.f.d.t;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import k.b0;
import k.v;
import o.e;

/* JADX INFO: loaded from: classes2.dex */
public final class b<T> implements e<T, b0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v f31367a = v.c("application/json; charset=UTF-8");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f31368b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.f.d.e f31369c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t<T> f31370d;

    public b(c.f.d.e eVar, t<T> tVar) {
        this.f31369c = eVar;
        this.f31370d = tVar;
    }

    @Override // o.e
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public b0 a(T t) throws IOException {
        l.c cVar = new l.c();
        c.f.d.y.c cVarQ = this.f31369c.q(new OutputStreamWriter(cVar.u(), f31368b));
        this.f31370d.d(cVarQ, t);
        cVarQ.close();
        return b0.e(f31367a, cVar.B0());
    }
}
