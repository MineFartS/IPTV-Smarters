package c.f.a.c.k.b;

/* JADX INFO: loaded from: classes2.dex */
public final class u5 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f14345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f14346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f14347d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f14348e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v5 f14349f;

    public u5(v5 v5Var, String str, String str2, String str3, long j2) {
        this.f14349f = v5Var;
        this.f14345b = str;
        this.f14346c = str2;
        this.f14347d = str3;
        this.f14348e = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.f14345b;
        if (str == null) {
            this.f14349f.f14388b.w().Q().y(this.f14346c, null);
        } else {
            this.f14349f.f14388b.w().Q().y(this.f14346c, new n7(this.f14347d, str, this.f14348e));
        }
    }
}
