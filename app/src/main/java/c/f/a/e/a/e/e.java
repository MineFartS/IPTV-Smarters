package c.f.a.e.a.e;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f15715c;

    public e(k kVar) {
        this.f15715c = kVar;
    }

    @Override // c.f.a.e.a.e.b
    public final void a() {
        if (this.f15715c.f15733l != null) {
            this.f15715c.f15724c.d("Unbind from service.", new Object[0]);
            this.f15715c.f15723b.unbindService(this.f15715c.f15732k);
            this.f15715c.f15727f = false;
            this.f15715c.f15733l = null;
            this.f15715c.f15732k = null;
        }
    }
}
