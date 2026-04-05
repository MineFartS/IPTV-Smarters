package c.f.a.e.a.e;

import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class r extends q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f15735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f15736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f15737d;

    public r(q qVar, long j2, long j3) {
        this.f15735b = qVar;
        long jM = m(j2);
        this.f15736c = jM;
        this.f15737d = m(jM + j3);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // c.f.a.e.a.e.q
    public final long d() {
        return this.f15737d - this.f15736c;
    }

    @Override // c.f.a.e.a.e.q
    public final InputStream i(long j2, long j3) {
        long jM = m(this.f15736c);
        return this.f15735b.i(jM, m(j3 + jM) - jM);
    }

    public final long m(long j2) {
        if (j2 < 0) {
            return 0L;
        }
        return j2 > this.f15735b.d() ? this.f15735b.d() : j2;
    }
}
