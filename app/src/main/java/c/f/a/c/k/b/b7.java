package c.f.a.c.k.b;

/* JADX INFO: loaded from: classes2.dex */
public final class b7 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f13760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f13761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f13762d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f13763e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f7 f13764f;

    public b7(f7 f7Var, g gVar, int i2, long j2, boolean z) {
        this.f13764f = f7Var;
        this.f13760b = gVar;
        this.f13761c = i2;
        this.f13762d = j2;
        this.f13763e = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f13764f.W(this.f13760b);
        f7.J(this.f13764f, this.f13760b, this.f13761c, this.f13762d, false, this.f13763e);
    }
}
