package k.g0.i;

import com.amazonaws.event.ProgressEvent;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import k.g0.i.d;
import l.t;
import l.u;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements Closeable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f30783b = Logger.getLogger(e.class.getName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l.e f30784c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f30785d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f30786e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d.a f30787f;

    public static final class a implements t {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final l.e f30788b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f30789c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public byte f30790d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f30791e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f30792f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public short f30793g;

        public a(l.e eVar) {
            this.f30788b = eVar;
        }

        @Override // l.t, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        public final void d() throws IOException {
            int i2 = this.f30791e;
            int iQ = h.q(this.f30788b);
            this.f30792f = iQ;
            this.f30789c = iQ;
            byte bT = (byte) (this.f30788b.T() & 255);
            this.f30790d = (byte) (this.f30788b.T() & 255);
            Logger logger = h.f30783b;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(e.b(true, this.f30791e, this.f30789c, bT, this.f30790d));
            }
            int iC = this.f30788b.C() & Integer.MAX_VALUE;
            this.f30791e = iC;
            if (bT != 9) {
                throw e.d("%s != TYPE_CONTINUATION", Byte.valueOf(bT));
            }
            if (iC != i2) {
                throw e.d("TYPE_CONTINUATION streamId changed", new Object[0]);
            }
        }

        @Override // l.t
        public long k(l.c cVar, long j2) throws IOException {
            while (true) {
                int i2 = this.f30792f;
                if (i2 != 0) {
                    long jK = this.f30788b.k(cVar, Math.min(j2, i2));
                    if (jK == -1) {
                        return -1L;
                    }
                    this.f30792f = (int) (((long) this.f30792f) - jK);
                    return jK;
                }
                this.f30788b.Z(this.f30793g);
                this.f30793g = (short) 0;
                if ((this.f30790d & 4) != 0) {
                    return -1L;
                }
                d();
            }
        }

        @Override // l.t
        public u timeout() {
            return this.f30788b.timeout();
        }
    }

    public interface b {
        void a(int i2, long j2);

        void b(boolean z, int i2, int i3);

        void c(int i2, int i3, List<c> list);

        void d();

        void e(boolean z, n nVar);

        void f(boolean z, int i2, l.e eVar, int i3);

        void g(int i2, int i3, int i4, boolean z);

        void h(boolean z, int i2, int i3, List<c> list);

        void i(int i2, k.g0.i.b bVar);

        void j(int i2, k.g0.i.b bVar, l.f fVar);
    }

    public h(l.e eVar, boolean z) {
        this.f30784c = eVar;
        this.f30786e = z;
        a aVar = new a(eVar);
        this.f30785d = aVar;
        this.f30787f = new d.a(ProgressEvent.PART_FAILED_EVENT_CODE, aVar);
    }

    public static int d(int i2, byte b2, short s) throws IOException {
        if ((b2 & 8) != 0) {
            i2--;
        }
        if (s <= i2) {
            return (short) (i2 - s);
        }
        throw e.d("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i2));
    }

    public static int q(l.e eVar) {
        return (eVar.T() & 255) | ((eVar.T() & 255) << 16) | ((eVar.T() & 255) << 8);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f30784c.close();
    }

    public boolean i(boolean z, b bVar) throws IOException {
        try {
            this.f30784c.v0(9L);
            int iQ = q(this.f30784c);
            if (iQ < 0 || iQ > 16384) {
                throw e.d("FRAME_SIZE_ERROR: %s", Integer.valueOf(iQ));
            }
            byte bT = (byte) (this.f30784c.T() & 255);
            if (z && bT != 4) {
                throw e.d("Expected a SETTINGS frame but was %s", Byte.valueOf(bT));
            }
            byte bT2 = (byte) (this.f30784c.T() & 255);
            int iC = this.f30784c.C() & Integer.MAX_VALUE;
            Logger logger = f30783b;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(e.b(true, iC, iQ, bT, bT2));
            }
            switch (bT) {
                case 0:
                    m(bVar, iQ, bT2, iC);
                    return true;
                case 1:
                    p(bVar, iQ, bT2, iC);
                    return true;
                case 2:
                    t(bVar, iQ, bT2, iC);
                    return true;
                case 3:
                    v(bVar, iQ, bT2, iC);
                    return true;
                case 4:
                    w(bVar, iQ, bT2, iC);
                    return true;
                case 5:
                    u(bVar, iQ, bT2, iC);
                    return true;
                case 6:
                    r(bVar, iQ, bT2, iC);
                    return true;
                case 7:
                    n(bVar, iQ, bT2, iC);
                    return true;
                case 8:
                    x(bVar, iQ, bT2, iC);
                    return true;
                default:
                    this.f30784c.Z(iQ);
                    return true;
            }
        } catch (IOException unused) {
            return false;
        }
    }

    public void l(b bVar) throws IOException {
        if (this.f30786e) {
            if (!i(true, bVar)) {
                throw e.d("Required SETTINGS preface not received", new Object[0]);
            }
            return;
        }
        l.e eVar = this.f30784c;
        l.f fVar = e.f30709a;
        l.f fVarG = eVar.g(fVar.size());
        Logger logger = f30783b;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(k.g0.c.l("<< CONNECTION %s", fVarG.u()));
        }
        if (!fVar.equals(fVarG)) {
            throw e.d("Expected a connection header but was %s", fVarG.E());
        }
    }

    public final void m(b bVar, int i2, byte b2, int i3) throws IOException {
        if (i3 == 0) {
            throw e.d("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
        }
        boolean z = (b2 & 1) != 0;
        if ((b2 & 32) != 0) {
            throw e.d("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
        }
        short sT = (b2 & 8) != 0 ? (short) (this.f30784c.T() & 255) : (short) 0;
        bVar.f(z, i3, this.f30784c, d(i2, b2, sT));
        this.f30784c.Z(sT);
    }

    public final void n(b bVar, int i2, byte b2, int i3) throws IOException {
        if (i2 < 8) {
            throw e.d("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i2));
        }
        if (i3 != 0) {
            throw e.d("TYPE_GOAWAY streamId != 0", new Object[0]);
        }
        int iC = this.f30784c.C();
        int iC2 = this.f30784c.C();
        int i4 = i2 - 8;
        k.g0.i.b bVarFromHttp2 = k.g0.i.b.fromHttp2(iC2);
        if (bVarFromHttp2 == null) {
            throw e.d("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(iC2));
        }
        l.f fVarG = l.f.f31052c;
        if (i4 > 0) {
            fVarG = this.f30784c.g(i4);
        }
        bVar.j(iC, bVarFromHttp2, fVarG);
    }

    public final List<c> o(int i2, short s, byte b2, int i3) throws IOException {
        a aVar = this.f30785d;
        aVar.f30792f = i2;
        aVar.f30789c = i2;
        aVar.f30793g = s;
        aVar.f30790d = b2;
        aVar.f30791e = i3;
        this.f30787f.k();
        return this.f30787f.e();
    }

    public final void p(b bVar, int i2, byte b2, int i3) throws IOException {
        if (i3 == 0) {
            throw e.d("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
        }
        boolean z = (b2 & 1) != 0;
        short sT = (b2 & 8) != 0 ? (short) (this.f30784c.T() & 255) : (short) 0;
        if ((b2 & 32) != 0) {
            s(bVar, i3);
            i2 -= 5;
        }
        bVar.h(z, i3, -1, o(d(i2, b2, sT), sT, b2, i3));
    }

    public final void r(b bVar, int i2, byte b2, int i3) throws IOException {
        if (i2 != 8) {
            throw e.d("TYPE_PING length != 8: %s", Integer.valueOf(i2));
        }
        if (i3 != 0) {
            throw e.d("TYPE_PING streamId != 0", new Object[0]);
        }
        bVar.b((b2 & 1) != 0, this.f30784c.C(), this.f30784c.C());
    }

    public final void s(b bVar, int i2) {
        int iC = this.f30784c.C();
        bVar.g(i2, iC & Integer.MAX_VALUE, (this.f30784c.T() & 255) + 1, (Integer.MIN_VALUE & iC) != 0);
    }

    public final void t(b bVar, int i2, byte b2, int i3) throws IOException {
        if (i2 != 5) {
            throw e.d("TYPE_PRIORITY length: %d != 5", Integer.valueOf(i2));
        }
        if (i3 == 0) {
            throw e.d("TYPE_PRIORITY streamId == 0", new Object[0]);
        }
        s(bVar, i3);
    }

    public final void u(b bVar, int i2, byte b2, int i3) throws IOException {
        if (i3 == 0) {
            throw e.d("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
        }
        short sT = (b2 & 8) != 0 ? (short) (this.f30784c.T() & 255) : (short) 0;
        bVar.c(i3, this.f30784c.C() & Integer.MAX_VALUE, o(d(i2 - 4, b2, sT), sT, b2, i3));
    }

    public final void v(b bVar, int i2, byte b2, int i3) throws IOException {
        if (i2 != 4) {
            throw e.d("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i2));
        }
        if (i3 == 0) {
            throw e.d("TYPE_RST_STREAM streamId == 0", new Object[0]);
        }
        int iC = this.f30784c.C();
        k.g0.i.b bVarFromHttp2 = k.g0.i.b.fromHttp2(iC);
        if (bVarFromHttp2 == null) {
            throw e.d("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(iC));
        }
        bVar.i(i3, bVarFromHttp2);
    }

    public final void w(b bVar, int i2, byte b2, int i3) throws IOException {
        if (i3 != 0) {
            throw e.d("TYPE_SETTINGS streamId != 0", new Object[0]);
        }
        if ((b2 & 1) != 0) {
            if (i2 != 0) {
                throw e.d("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
            }
            bVar.d();
            return;
        }
        if (i2 % 6 != 0) {
            throw e.d("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i2));
        }
        n nVar = new n();
        for (int i4 = 0; i4 < i2; i4 += 6) {
            short sP0 = this.f30784c.p0();
            int iC = this.f30784c.C();
            if (sP0 == 2) {
                if (iC != 0 && iC != 1) {
                    throw e.d("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                }
            } else if (sP0 == 3) {
                sP0 = 4;
            } else if (sP0 == 4) {
                sP0 = 7;
                if (iC < 0) {
                    throw e.d("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                }
            } else if (sP0 == 5 && (iC < 16384 || iC > 16777215)) {
                throw e.d("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(iC));
            }
            nVar.i(sP0, iC);
        }
        bVar.e(false, nVar);
    }

    public final void x(b bVar, int i2, byte b2, int i3) throws IOException {
        if (i2 != 4) {
            throw e.d("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i2));
        }
        long jC = ((long) this.f30784c.C()) & 2147483647L;
        if (jC == 0) {
            throw e.d("windowSizeIncrement was 0", Long.valueOf(jC));
        }
        bVar.a(i3, jC);
    }
}
