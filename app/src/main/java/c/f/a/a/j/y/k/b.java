package c.f.a.a.j.y.k;

/* JADX INFO: loaded from: classes.dex */
public final class b extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.f.a.a.j.m f6328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.f.a.a.j.h f6329c;

    public b(long j2, c.f.a.a.j.m mVar, c.f.a.a.j.h hVar) {
        this.f6327a = j2;
        if (mVar == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.f6328b = mVar;
        if (hVar == null) {
            throw new NullPointerException("Null event");
        }
        this.f6329c = hVar;
    }

    @Override // c.f.a.a.j.y.k.i
    public c.f.a.a.j.h b() {
        return this.f6329c;
    }

    @Override // c.f.a.a.j.y.k.i
    public long c() {
        return this.f6327a;
    }

    @Override // c.f.a.a.j.y.k.i
    public c.f.a.a.j.m d() {
        return this.f6328b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f6327a == iVar.c() && this.f6328b.equals(iVar.d()) && this.f6329c.equals(iVar.b());
    }

    public int hashCode() {
        long j2 = this.f6327a;
        return this.f6329c.hashCode() ^ ((((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ this.f6328b.hashCode()) * 1000003);
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f6327a + ", transportContext=" + this.f6328b + ", event=" + this.f6329c + "}";
    }
}
