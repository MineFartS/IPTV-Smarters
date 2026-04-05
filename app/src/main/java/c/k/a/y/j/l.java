package c.k.a.y.j;

import java.net.ProtocolException;
import l.s;
import l.u;

/* JADX INFO: loaded from: classes2.dex */
public final class l implements s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f18439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18440c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l.c f18441d;

    public l() {
        this(-1);
    }

    public l(int i2) {
        this.f18441d = new l.c();
        this.f18440c = i2;
    }

    @Override // l.s, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws ProtocolException {
        if (this.f18439b) {
            return;
        }
        this.f18439b = true;
        if (this.f18441d.H0() >= this.f18440c) {
            return;
        }
        throw new ProtocolException("content-length promised " + this.f18440c + " bytes, but received " + this.f18441d.H0());
    }

    public long d() {
        return this.f18441d.H0();
    }

    @Override // l.s, java.io.Flushable
    public void flush() {
    }

    @Override // l.s
    public void h(l.c cVar, long j2) throws ProtocolException {
        if (this.f18439b) {
            throw new IllegalStateException("closed");
        }
        c.k.a.y.h.a(cVar.H0(), 0L, j2);
        if (this.f18440c == -1 || this.f18441d.H0() <= ((long) this.f18440c) - j2) {
            this.f18441d.h(cVar, j2);
            return;
        }
        throw new ProtocolException("exceeded content-length limit of " + this.f18440c + " bytes");
    }

    public void i(s sVar) {
        l.c cVarClone = this.f18441d.clone();
        sVar.h(cVarClone, cVarClone.H0());
    }

    @Override // l.s
    public u timeout() {
        return u.f31095a;
    }
}
