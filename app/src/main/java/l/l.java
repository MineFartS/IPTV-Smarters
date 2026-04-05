package l;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes2.dex */
public final class l implements t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f31067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Inflater f31068c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f31069d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f31070e;

    public l(e eVar, Inflater inflater) {
        if (eVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (inflater == null) {
            throw new IllegalArgumentException("inflater == null");
        }
        this.f31067b = eVar;
        this.f31068c = inflater;
    }

    public l(t tVar, Inflater inflater) {
        this(m.c(tVar), inflater);
    }

    @Override // l.t, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f31070e) {
            return;
        }
        this.f31068c.end();
        this.f31070e = true;
        this.f31067b.close();
    }

    public boolean d() {
        if (!this.f31068c.needsInput()) {
            return false;
        }
        i();
        if (this.f31068c.getRemaining() != 0) {
            throw new IllegalStateException("?");
        }
        if (this.f31067b.H()) {
            return true;
        }
        p pVar = this.f31067b.z().f31047c;
        int i2 = pVar.f31086c;
        int i3 = pVar.f31085b;
        int i4 = i2 - i3;
        this.f31069d = i4;
        this.f31068c.setInput(pVar.f31084a, i3, i4);
        return false;
    }

    public final void i() {
        int i2 = this.f31069d;
        if (i2 == 0) {
            return;
        }
        int remaining = i2 - this.f31068c.getRemaining();
        this.f31069d -= remaining;
        this.f31067b.Z(remaining);
    }

    @Override // l.t
    public long k(c cVar, long j2) throws IOException {
        boolean zD;
        if (j2 < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j2);
        }
        if (this.f31070e) {
            throw new IllegalStateException("closed");
        }
        if (j2 == 0) {
            return 0L;
        }
        do {
            zD = d();
            try {
                p pVarK0 = cVar.K0(1);
                Inflater inflater = this.f31068c;
                byte[] bArr = pVarK0.f31084a;
                int i2 = pVarK0.f31086c;
                int iInflate = inflater.inflate(bArr, i2, 8192 - i2);
                if (iInflate > 0) {
                    pVarK0.f31086c += iInflate;
                    long j3 = iInflate;
                    cVar.f31048d += j3;
                    return j3;
                }
                if (!this.f31068c.finished() && !this.f31068c.needsDictionary()) {
                }
                i();
                if (pVarK0.f31085b != pVarK0.f31086c) {
                    return -1L;
                }
                cVar.f31047c = pVarK0.b();
                q.a(pVarK0);
                return -1L;
            } catch (DataFormatException e2) {
                throw new IOException(e2);
            }
        } while (!zD);
        throw new EOFException("source exhausted prematurely");
    }

    @Override // l.t
    public u timeout() {
        return this.f31067b.timeout();
    }
}
