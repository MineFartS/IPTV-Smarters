package c.f.a.c.k.b;

/* JADX INFO: loaded from: classes2.dex */
public final class b9 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f13767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k9 f13768c;

    public b9(k9 k9Var, long j2) {
        this.f13768c = k9Var;
        this.f13767b = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k9.o(this.f13768c, this.f13767b);
    }
}
