package c.f.a.a.i.f;

/* JADX INFO: loaded from: classes.dex */
public final class h extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6130a;

    public h(long j2) {
        this.f6130a = j2;
    }

    @Override // c.f.a.a.i.f.n
    public long c() {
        return this.f6130a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof n) && this.f6130a == ((n) obj).c();
    }

    public int hashCode() {
        long j2 = this.f6130a;
        return 1000003 ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f6130a + "}";
    }
}
