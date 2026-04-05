package c.f.a.b.z2.g0;

import c.f.a.b.j3.g;
import c.f.a.b.z2.k;
import c.f.a.b.z2.s;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f10780c;

    public c(k kVar, long j2) {
        super(kVar);
        g.a(kVar.getPosition() >= j2);
        this.f10780c = j2;
    }

    @Override // c.f.a.b.z2.s, c.f.a.b.z2.k
    public long getLength() {
        return super.getLength() - this.f10780c;
    }

    @Override // c.f.a.b.z2.s, c.f.a.b.z2.k
    public long getPosition() {
        return super.getPosition() - this.f10780c;
    }

    @Override // c.f.a.b.z2.s, c.f.a.b.z2.k
    public long j() {
        return super.j() - this.f10780c;
    }

    @Override // c.f.a.b.z2.s, c.f.a.b.z2.k
    public <E extends Throwable> void o(long j2, E e2) {
        super.o(j2 + this.f10780c, e2);
    }
}
