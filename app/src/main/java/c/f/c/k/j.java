package c.f.c.k;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class j implements c.f.c.r.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f16090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f16091b;

    public j(n nVar, d dVar) {
        this.f16090a = nVar;
        this.f16091b = dVar;
    }

    public static c.f.c.r.b a(n nVar, d dVar) {
        return new j(nVar, dVar);
    }

    @Override // c.f.c.r.b
    public Object get() {
        n nVar = this.f16090a;
        d dVar = this.f16091b;
        return dVar.d().a(new d0(dVar, nVar));
    }
}
