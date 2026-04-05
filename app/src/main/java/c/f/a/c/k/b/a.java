package c.f.a.c.k.b;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f13709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f13710c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d2 f13711d;

    public a(d2 d2Var, String str, long j2) {
        this.f13711d = d2Var;
        this.f13709b = str;
        this.f13710c = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d2.k(this.f13711d, this.f13709b, this.f13710c);
    }
}
