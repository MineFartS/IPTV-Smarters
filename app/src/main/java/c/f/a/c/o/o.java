package c.f.a.c.o;

/* JADX INFO: loaded from: classes2.dex */
public final class o implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f14587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f14588c;

    public o(p pVar, i iVar) {
        this.f14588c = pVar;
        this.f14587b = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f14587b.m()) {
            this.f14588c.f14591c.u();
            return;
        }
        try {
            this.f14588c.f14591c.q(this.f14588c.f14590b.a(this.f14587b));
        } catch (g e2) {
            if (e2.getCause() instanceof Exception) {
                this.f14588c.f14591c.s((Exception) e2.getCause());
            } else {
                this.f14588c.f14591c.s(e2);
            }
        } catch (Exception e3) {
            this.f14588c.f14591c.s(e3);
        }
    }
}
