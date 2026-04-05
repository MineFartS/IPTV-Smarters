package l;

/* JADX INFO: loaded from: classes2.dex */
public final class n implements d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f31077b = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f31078c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f31079d;

    public n(s sVar) {
        if (sVar == null) {
            throw new NullPointerException("sink == null");
        }
        this.f31078c = sVar;
    }

    @Override // l.d
    public d D(int i2) {
        if (this.f31079d) {
            throw new IllegalStateException("closed");
        }
        this.f31077b.D(i2);
        return N();
    }

    @Override // l.d
    public d E(int i2) {
        if (this.f31079d) {
            throw new IllegalStateException("closed");
        }
        this.f31077b.E(i2);
        return N();
    }

    @Override // l.d
    public d I(int i2) {
        if (this.f31079d) {
            throw new IllegalStateException("closed");
        }
        this.f31077b.I(i2);
        return N();
    }

    @Override // l.d
    public d N() {
        if (this.f31079d) {
            throw new IllegalStateException("closed");
        }
        long jN = this.f31077b.n();
        if (jN > 0) {
            this.f31078c.h(this.f31077b, jN);
        }
        return this;
    }

    @Override // l.d
    public d P(String str) {
        if (this.f31079d) {
            throw new IllegalStateException("closed");
        }
        this.f31077b.P(str);
        return N();
    }

    @Override // l.d
    public long X(t tVar) {
        if (tVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j2 = 0;
        while (true) {
            long jK = tVar.k(this.f31077b, 8192L);
            if (jK == -1) {
                return j2;
            }
            j2 += jK;
            N();
        }
    }

    @Override // l.d
    public d Y(long j2) {
        if (this.f31079d) {
            throw new IllegalStateException("closed");
        }
        this.f31077b.Y(j2);
        return N();
    }

    @Override // l.s, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.f31079d) {
            return;
        }
        Throwable th = null;
        try {
            c cVar = this.f31077b;
            long j2 = cVar.f31048d;
            if (j2 > 0) {
                this.f31078c.h(cVar, j2);
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.f31078c.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f31079d = true;
        if (th != null) {
            v.e(th);
        }
    }

    @Override // l.d
    public d f(byte[] bArr, int i2, int i3) {
        if (this.f31079d) {
            throw new IllegalStateException("closed");
        }
        this.f31077b.f(bArr, i2, i3);
        return N();
    }

    @Override // l.d, l.s, java.io.Flushable
    public void flush() {
        if (this.f31079d) {
            throw new IllegalStateException("closed");
        }
        c cVar = this.f31077b;
        long j2 = cVar.f31048d;
        if (j2 > 0) {
            this.f31078c.h(cVar, j2);
        }
        this.f31078c.flush();
    }

    @Override // l.s
    public void h(c cVar, long j2) {
        if (this.f31079d) {
            throw new IllegalStateException("closed");
        }
        this.f31077b.h(cVar, j2);
        N();
    }

    @Override // l.d
    public d i0(byte[] bArr) {
        if (this.f31079d) {
            throw new IllegalStateException("closed");
        }
        this.f31077b.i0(bArr);
        return N();
    }

    @Override // l.d
    public d j0(f fVar) {
        if (this.f31079d) {
            throw new IllegalStateException("closed");
        }
        this.f31077b.j0(fVar);
        return N();
    }

    @Override // l.s
    public u timeout() {
        return this.f31078c.timeout();
    }

    public String toString() {
        return "buffer(" + this.f31078c + ")";
    }

    @Override // l.d
    public d x0(long j2) {
        if (this.f31079d) {
            throw new IllegalStateException("closed");
        }
        this.f31077b.x0(j2);
        return N();
    }

    @Override // l.d
    public c z() {
        return this.f31077b;
    }
}
