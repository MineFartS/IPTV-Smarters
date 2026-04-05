package c.f.a.a.j;

/* JADX INFO: loaded from: classes.dex */
public final class p<T> implements c.f.a.a.f<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f6189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.f.a.a.b f6191c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c.f.a.a.e<T, byte[]> f6192d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q f6193e;

    public p(m mVar, String str, c.f.a.a.b bVar, c.f.a.a.e<T, byte[]> eVar, q qVar) {
        this.f6189a = mVar;
        this.f6190b = str;
        this.f6191c = bVar;
        this.f6192d = eVar;
        this.f6193e = qVar;
    }

    public static /* synthetic */ void b(Exception exc) {
    }

    @Override // c.f.a.a.f
    public void a(c.f.a.a.c<T> cVar) {
        c(cVar, o.b());
    }

    public void c(c.f.a.a.c<T> cVar, c.f.a.a.h hVar) {
        this.f6193e.a(l.a().e(this.f6189a).c(cVar).f(this.f6190b).d(this.f6192d).b(this.f6191c).a(), hVar);
    }
}
