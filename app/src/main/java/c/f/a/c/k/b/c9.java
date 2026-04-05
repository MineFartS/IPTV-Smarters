package c.f.a.c.k.b;

/* JADX INFO: loaded from: classes2.dex */
public final class c9 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f13805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k9 f13806c;

    public c9(k9 k9Var, long j2) {
        this.f13806c = k9Var;
        this.f13805b = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k9.p(this.f13806c, this.f13805b);
    }
}
