package c.f.a.c.k.b;

/* JADX INFO: loaded from: classes2.dex */
public final class c7 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f13797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f13798c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f13799d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f13800e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f7 f13801f;

    public c7(f7 f7Var, g gVar, int i2, long j2, boolean z) {
        this.f13801f = f7Var;
        this.f13797b = gVar;
        this.f13798c = i2;
        this.f13799d = j2;
        this.f13800e = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f13801f.W(this.f13797b);
        f7.J(this.f13801f, this.f13797b, this.f13798c, this.f13799d, false, this.f13800e);
    }
}
