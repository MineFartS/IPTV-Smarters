package l;

import java.util.zip.Deflater;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f31056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Deflater f31057c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f31058d;

    public g(d dVar, Deflater deflater) {
        if (dVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (deflater == null) {
            throw new IllegalArgumentException("inflater == null");
        }
        this.f31056b = dVar;
        this.f31057c = deflater;
    }

    public g(s sVar, Deflater deflater) {
        this(m.b(sVar), deflater);
    }

    @Override // l.s, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.f31058d) {
            return;
        }
        Throwable th = null;
        try {
            i();
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.f31057c.end();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        try {
            this.f31056b.close();
        } catch (Throwable th4) {
            if (th == null) {
                th = th4;
            }
        }
        this.f31058d = true;
        if (th != null) {
            v.e(th);
        }
    }

    @IgnoreJRERequirement
    public final void d(boolean z) {
        p pVarK0;
        c cVarZ = this.f31056b.z();
        while (true) {
            pVarK0 = cVarZ.K0(1);
            Deflater deflater = this.f31057c;
            byte[] bArr = pVarK0.f31084a;
            int i2 = pVarK0.f31086c;
            int i3 = 8192 - i2;
            int iDeflate = z ? deflater.deflate(bArr, i2, i3, 2) : deflater.deflate(bArr, i2, i3);
            if (iDeflate > 0) {
                pVarK0.f31086c += iDeflate;
                cVarZ.f31048d += (long) iDeflate;
                this.f31056b.N();
            } else if (this.f31057c.needsInput()) {
                break;
            }
        }
        if (pVarK0.f31085b == pVarK0.f31086c) {
            cVarZ.f31047c = pVarK0.b();
            q.a(pVarK0);
        }
    }

    @Override // l.s, java.io.Flushable
    public void flush() {
        d(true);
        this.f31056b.flush();
    }

    @Override // l.s
    public void h(c cVar, long j2) {
        v.b(cVar.f31048d, 0L, j2);
        while (j2 > 0) {
            p pVar = cVar.f31047c;
            int iMin = (int) Math.min(j2, pVar.f31086c - pVar.f31085b);
            this.f31057c.setInput(pVar.f31084a, pVar.f31085b, iMin);
            d(false);
            long j3 = iMin;
            cVar.f31048d -= j3;
            int i2 = pVar.f31085b + iMin;
            pVar.f31085b = i2;
            if (i2 == pVar.f31086c) {
                cVar.f31047c = pVar.b();
                q.a(pVar);
            }
            j2 -= j3;
        }
    }

    public void i() {
        this.f31057c.finish();
        d(false);
    }

    @Override // l.s
    public u timeout() {
        return this.f31056b.timeout();
    }

    public String toString() {
        return "DeflaterSink(" + this.f31056b + ")";
    }
}
