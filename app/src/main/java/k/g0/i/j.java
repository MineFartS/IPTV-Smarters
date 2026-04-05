package k.g0.i;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import k.g0.i.d;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements Closeable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f30817b = Logger.getLogger(e.class.getName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l.d f30818c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f30819d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l.c f30820e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f30821f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f30822g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d.b f30823h;

    public j(l.d dVar, boolean z) {
        this.f30818c = dVar;
        this.f30819d = z;
        l.c cVar = new l.c();
        this.f30820e = cVar;
        this.f30823h = new d.b(cVar);
        this.f30821f = 16384;
    }

    public static void s(l.d dVar, int i2) {
        dVar.I((i2 >>> 16) & 255);
        dVar.I((i2 >>> 8) & 255);
        dVar.I(i2 & 255);
    }

    public synchronized void J() {
        if (this.f30822g) {
            throw new IOException("closed");
        }
        if (this.f30819d) {
            Logger logger = f30817b;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(k.g0.c.l(">> CONNECTION %s", e.f30709a.u()));
            }
            this.f30818c.i0(e.f30709a.D());
            this.f30818c.flush();
        }
    }

    public synchronized void L(boolean z, int i2, l.c cVar, int i3) {
        if (this.f30822g) {
            throw new IOException("closed");
        }
        i(i2, z ? (byte) 1 : (byte) 0, cVar, i3);
    }

    public synchronized void a(int i2, long j2) {
        if (this.f30822g) {
            throw new IOException("closed");
        }
        if (j2 == 0 || j2 > 2147483647L) {
            throw e.c("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j2));
        }
        l(i2, 4, (byte) 8, (byte) 0);
        this.f30818c.E((int) j2);
        this.f30818c.flush();
    }

    public synchronized void b(boolean z, int i2, int i3) {
        if (this.f30822g) {
            throw new IOException("closed");
        }
        l(0, 8, (byte) 6, z ? (byte) 1 : (byte) 0);
        this.f30818c.E(i2);
        this.f30818c.E(i3);
        this.f30818c.flush();
    }

    public synchronized void c(int i2, int i3, List<c> list) {
        if (this.f30822g) {
            throw new IOException("closed");
        }
        this.f30823h.g(list);
        long jH0 = this.f30820e.H0();
        int iMin = (int) Math.min(this.f30821f - 4, jH0);
        long j2 = iMin;
        l(i2, iMin + 4, (byte) 5, jH0 == j2 ? (byte) 4 : (byte) 0);
        this.f30818c.E(i3 & Integer.MAX_VALUE);
        this.f30818c.h(this.f30820e, j2);
        if (jH0 > j2) {
            r(i2, jH0 - j2);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f30822g = true;
        this.f30818c.close();
    }

    public synchronized void d(n nVar) {
        if (this.f30822g) {
            throw new IOException("closed");
        }
        this.f30821f = nVar.f(this.f30821f);
        if (nVar.c() != -1) {
            this.f30823h.e(nVar.c());
        }
        l(0, 0, (byte) 4, (byte) 1);
        this.f30818c.flush();
    }

    public synchronized void flush() {
        if (this.f30822g) {
            throw new IOException("closed");
        }
        this.f30818c.flush();
    }

    public void i(int i2, byte b2, l.c cVar, int i3) {
        l(i2, i3, (byte) 0, b2);
        if (i3 > 0) {
            this.f30818c.h(cVar, i3);
        }
    }

    public void l(int i2, int i3, byte b2, byte b3) {
        Logger logger = f30817b;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(e.b(false, i2, i3, b2, b3));
        }
        int i4 = this.f30821f;
        if (i3 > i4) {
            throw e.c("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i4), Integer.valueOf(i3));
        }
        if ((Integer.MIN_VALUE & i2) != 0) {
            throw e.c("reserved bit set: %s", Integer.valueOf(i2));
        }
        s(this.f30818c, i3);
        this.f30818c.I(b2 & 255);
        this.f30818c.I(b3 & 255);
        this.f30818c.E(i2 & Integer.MAX_VALUE);
    }

    public synchronized void m(int i2, b bVar, byte[] bArr) {
        if (this.f30822g) {
            throw new IOException("closed");
        }
        if (bVar.httpCode == -1) {
            throw e.c("errorCode.httpCode == -1", new Object[0]);
        }
        l(0, bArr.length + 8, (byte) 7, (byte) 0);
        this.f30818c.E(i2);
        this.f30818c.E(bVar.httpCode);
        if (bArr.length > 0) {
            this.f30818c.i0(bArr);
        }
        this.f30818c.flush();
    }

    public void n(boolean z, int i2, List<c> list) throws IOException {
        if (this.f30822g) {
            throw new IOException("closed");
        }
        this.f30823h.g(list);
        long jH0 = this.f30820e.H0();
        int iMin = (int) Math.min(this.f30821f, jH0);
        long j2 = iMin;
        byte b2 = jH0 == j2 ? (byte) 4 : (byte) 0;
        if (z) {
            b2 = (byte) (b2 | 1);
        }
        l(i2, iMin, (byte) 1, b2);
        this.f30818c.h(this.f30820e, j2);
        if (jH0 > j2) {
            r(i2, jH0 - j2);
        }
    }

    public synchronized void o(int i2, b bVar) {
        if (this.f30822g) {
            throw new IOException("closed");
        }
        if (bVar.httpCode == -1) {
            throw new IllegalArgumentException();
        }
        l(i2, 4, (byte) 3, (byte) 0);
        this.f30818c.E(bVar.httpCode);
        this.f30818c.flush();
    }

    public synchronized void p(n nVar) {
        if (this.f30822g) {
            throw new IOException("closed");
        }
        int i2 = 0;
        l(0, nVar.j() * 6, (byte) 4, (byte) 0);
        while (i2 < 10) {
            if (nVar.g(i2)) {
                this.f30818c.D(i2 == 4 ? 3 : i2 == 7 ? 4 : i2);
                this.f30818c.E(nVar.b(i2));
            }
            i2++;
        }
        this.f30818c.flush();
    }

    public synchronized void q(boolean z, int i2, int i3, List<c> list) {
        if (this.f30822g) {
            throw new IOException("closed");
        }
        n(z, i2, list);
    }

    public final void r(int i2, long j2) {
        while (j2 > 0) {
            int iMin = (int) Math.min(this.f30821f, j2);
            long j3 = iMin;
            j2 -= j3;
            l(i2, iMin, (byte) 9, j2 == 0 ? (byte) 4 : (byte) 0);
            this.f30818c.h(this.f30820e, j3);
        }
    }

    public int t0() {
        return this.f30821f;
    }
}
