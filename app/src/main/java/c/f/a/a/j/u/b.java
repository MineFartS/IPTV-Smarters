package c.f.a.a.j.u;

import c.f.a.a.j.u.g;

/* JADX INFO: loaded from: classes.dex */
public final class b extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g.a f6208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f6209b;

    public b(g.a aVar, long j2) {
        if (aVar == null) {
            throw new NullPointerException("Null status");
        }
        this.f6208a = aVar;
        this.f6209b = j2;
    }

    @Override // c.f.a.a.j.u.g
    public long b() {
        return this.f6209b;
    }

    @Override // c.f.a.a.j.u.g
    public g.a c() {
        return this.f6208a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f6208a.equals(gVar.c()) && this.f6209b == gVar.b();
    }

    public int hashCode() {
        int iHashCode = (this.f6208a.hashCode() ^ 1000003) * 1000003;
        long j2 = this.f6209b;
        return iHashCode ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f6208a + ", nextRequestWaitMillis=" + this.f6209b + "}";
    }
}
