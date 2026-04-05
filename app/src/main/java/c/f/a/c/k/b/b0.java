package c.f.a.c.k.b;

/* JADX INFO: loaded from: classes2.dex */
public final class b0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f13748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f13749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d2 f13750d;

    public b0(d2 d2Var, String str, long j2) {
        this.f13750d = d2Var;
        this.f13748b = str;
        this.f13749c = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d2.l(this.f13750d, this.f13748b, this.f13749c);
    }
}
