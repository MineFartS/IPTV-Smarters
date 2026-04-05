package l;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes2.dex */
public final class k implements t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f31063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Inflater f31064d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l f31065e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f31062b = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CRC32 f31066f = new CRC32();

    public k(t tVar) {
        if (tVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        Inflater inflater = new Inflater(true);
        this.f31064d = inflater;
        e eVarC = m.c(tVar);
        this.f31063c = eVarC;
        this.f31065e = new l(eVarC, inflater);
    }

    @Override // l.t, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f31065e.close();
    }

    public final void d(String str, int i2, int i3) throws IOException {
        if (i3 != i2) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", str, Integer.valueOf(i3), Integer.valueOf(i2)));
        }
    }

    public final void i() throws IOException {
        this.f31063c.v0(10L);
        byte bQ = this.f31063c.z().q(3L);
        boolean z = ((bQ >> 1) & 1) == 1;
        if (z) {
            m(this.f31063c.z(), 0L, 10L);
        }
        d("ID1ID2", 8075, this.f31063c.p0());
        this.f31063c.Z(8L);
        if (((bQ >> 2) & 1) == 1) {
            this.f31063c.v0(2L);
            if (z) {
                m(this.f31063c.z(), 0L, 2L);
            }
            long jL0 = this.f31063c.z().l0();
            this.f31063c.v0(jL0);
            if (z) {
                m(this.f31063c.z(), 0L, jL0);
            }
            this.f31063c.Z(jL0);
        }
        if (((bQ >> 3) & 1) == 1) {
            long jY0 = this.f31063c.y0((byte) 0);
            if (jY0 == -1) {
                throw new EOFException();
            }
            if (z) {
                m(this.f31063c.z(), 0L, jY0 + 1);
            }
            this.f31063c.Z(jY0 + 1);
        }
        if (((bQ >> 4) & 1) == 1) {
            long jY02 = this.f31063c.y0((byte) 0);
            if (jY02 == -1) {
                throw new EOFException();
            }
            if (z) {
                m(this.f31063c.z(), 0L, jY02 + 1);
            }
            this.f31063c.Z(jY02 + 1);
        }
        if (z) {
            d("FHCRC", this.f31063c.l0(), (short) this.f31066f.getValue());
            this.f31066f.reset();
        }
    }

    @Override // l.t
    public long k(c cVar, long j2) throws IOException {
        if (j2 < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j2);
        }
        if (j2 == 0) {
            return 0L;
        }
        if (this.f31062b == 0) {
            i();
            this.f31062b = 1;
        }
        if (this.f31062b == 1) {
            long j3 = cVar.f31048d;
            long jK = this.f31065e.k(cVar, j2);
            if (jK != -1) {
                m(cVar, j3, jK);
                return jK;
            }
            this.f31062b = 2;
        }
        if (this.f31062b == 2) {
            l();
            this.f31062b = 3;
            if (!this.f31063c.H()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    public final void l() throws IOException {
        d("CRC", this.f31063c.d0(), (int) this.f31066f.getValue());
        d("ISIZE", this.f31063c.d0(), (int) this.f31064d.getBytesWritten());
    }

    public final void m(c cVar, long j2, long j3) {
        p pVar = cVar.f31047c;
        while (true) {
            int i2 = pVar.f31086c;
            int i3 = pVar.f31085b;
            if (j2 < i2 - i3) {
                break;
            }
            j2 -= (long) (i2 - i3);
            pVar = pVar.f31089f;
        }
        while (j3 > 0) {
            int i4 = (int) (((long) pVar.f31085b) + j2);
            int iMin = (int) Math.min(pVar.f31086c - i4, j3);
            this.f31066f.update(pVar.f31084a, i4, iMin);
            j3 -= (long) iMin;
            pVar = pVar.f31089f;
            j2 = 0;
        }
    }

    @Override // l.t
    public u timeout() {
        return this.f31063c.timeout();
    }
}
