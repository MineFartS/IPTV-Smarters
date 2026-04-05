package c.f.a.c.d.v;

/* JADX INFO: loaded from: classes2.dex */
public final class n implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f12177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f12178b;

    public n(o oVar, u uVar) {
        this.f12178b = oVar;
        this.f12177a = uVar;
    }

    @Override // c.f.a.c.d.v.u
    public final void a(long j2) {
        u uVar = this.f12177a;
        if (uVar != null) {
            uVar.a(j2);
        }
    }

    @Override // c.f.a.c.d.v.u
    public final void b(long j2, int i2, Object obj) {
        o.G(this.f12178b, null);
        u uVar = this.f12177a;
        if (uVar != null) {
            uVar.b(j2, i2, obj);
        }
    }
}
