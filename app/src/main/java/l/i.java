package l;

/* JADX INFO: loaded from: classes2.dex */
public abstract class i implements t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f31060b;

    public i(t tVar) {
        if (tVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f31060b = tVar;
    }

    @Override // l.t, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f31060b.close();
    }

    @Override // l.t
    public long k(c cVar, long j2) {
        return this.f31060b.k(cVar, j2);
    }

    @Override // l.t
    public u timeout() {
        return this.f31060b.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f31060b.toString() + ")";
    }
}
