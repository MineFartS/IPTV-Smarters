package l;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h implements s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f31059b;

    public h(s sVar) {
        if (sVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f31059b = sVar;
    }

    @Override // l.s, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f31059b.close();
    }

    @Override // l.s, java.io.Flushable
    public void flush() {
        this.f31059b.flush();
    }

    @Override // l.s
    public void h(c cVar, long j2) {
        this.f31059b.h(cVar, j2);
    }

    @Override // l.s
    public u timeout() {
        return this.f31059b.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f31059b.toString() + ")";
    }
}
