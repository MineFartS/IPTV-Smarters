package c.f.a.b.f3;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class k extends c.f.a.b.v2.h implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f f8097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f8098c;

    @Override // c.f.a.b.f3.f
    public int a(long j2) {
        return ((f) c.f.a.b.j3.g.e(this.f8097b)).a(j2 - this.f8098c);
    }

    @Override // c.f.a.b.f3.f
    public long b(int i2) {
        return ((f) c.f.a.b.j3.g.e(this.f8097b)).b(i2) + this.f8098c;
    }

    @Override // c.f.a.b.f3.f
    public List<c> c(long j2) {
        return ((f) c.f.a.b.j3.g.e(this.f8097b)).c(j2 - this.f8098c);
    }

    @Override // c.f.a.b.v2.a
    public void clear() {
        super.clear();
        this.f8097b = null;
    }

    @Override // c.f.a.b.f3.f
    public int d() {
        return ((f) c.f.a.b.j3.g.e(this.f8097b)).d();
    }

    public void g(long j2, f fVar, long j3) {
        this.timeUs = j2;
        this.f8097b = fVar;
        if (j3 != Long.MAX_VALUE) {
            j2 = j3;
        }
        this.f8098c = j2;
    }
}
