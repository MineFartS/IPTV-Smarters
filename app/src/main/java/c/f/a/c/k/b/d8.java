package c.f.a.c.k.b;

/* JADX INFO: loaded from: classes2.dex */
public final class d8 extends m {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u8 f13833e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d8(u8 u8Var, y5 y5Var) {
        super(y5Var);
        this.f13833e = u8Var;
    }

    @Override // c.f.a.c.k.b.m
    public final void a() {
        u8 u8Var = this.f13833e;
        u8Var.g();
        if (u8Var.H()) {
            u8Var.f14413a.c().w().a("Inactivity, disconnecting from the service");
            u8Var.t();
        }
    }
}
