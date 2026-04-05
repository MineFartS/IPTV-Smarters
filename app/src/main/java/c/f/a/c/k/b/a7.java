package c.f.a.c.k.b;

/* JADX INFO: loaded from: classes2.dex */
public final class a7 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f13721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f13722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13723d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f13724e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f13725f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f7 f13726g;

    public a7(f7 f7Var, g gVar, long j2, int i2, long j3, boolean z) {
        this.f13726g = f7Var;
        this.f13721b = gVar;
        this.f13722c = j2;
        this.f13723d = i2;
        this.f13724e = j3;
        this.f13725f = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f13726g.W(this.f13721b);
        this.f13726g.t(this.f13722c, false);
        f7.J(this.f13726g, this.f13721b, this.f13723d, this.f13724e, true, this.f13725f);
    }
}
