package c.f.a.c.k.b;

/* JADX INFO: loaded from: classes2.dex */
public final class n6 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f14143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f14144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f14145d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f14146e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f7 f14147f;

    public n6(f7 f7Var, String str, String str2, Object obj, long j2) {
        this.f14147f = f7Var;
        this.f14143b = str;
        this.f14144c = str2;
        this.f14145d = obj;
        this.f14146e = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f14147f.p(this.f14143b, this.f14144c, this.f14145d, this.f14146e);
    }
}
