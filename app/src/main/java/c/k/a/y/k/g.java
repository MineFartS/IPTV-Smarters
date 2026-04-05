package c.k.a.y.k;

import c.k.a.y.k.b;
import c.k.a.y.k.f;
import com.amazonaws.event.ProgressEvent;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import l.t;
import l.u;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l.f f18492a = l.f.s("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    public static final class a implements t {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final l.e f18493b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f18494c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public byte f18495d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f18496e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f18497f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public short f18498g;

        public a(l.e eVar) {
            this.f18493b = eVar;
        }

        @Override // l.t, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        public final void d() throws IOException {
            int i2 = this.f18496e;
            int iL = g.l(this.f18493b);
            this.f18497f = iL;
            this.f18494c = iL;
            byte bT = (byte) (this.f18493b.T() & 255);
            this.f18495d = (byte) (this.f18493b.T() & 255);
            Logger logger = c.k.a.y.b.f18344a;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(b.b(true, this.f18496e, this.f18494c, bT, this.f18495d));
            }
            int iC = this.f18493b.C() & Integer.MAX_VALUE;
            this.f18496e = iC;
            if (bT != 9) {
                throw g.j("%s != TYPE_CONTINUATION", Byte.valueOf(bT));
            }
            if (iC != i2) {
                throw g.j("TYPE_CONTINUATION streamId changed", new Object[0]);
            }
        }

        @Override // l.t
        public long k(l.c cVar, long j2) throws IOException {
            while (true) {
                int i2 = this.f18497f;
                if (i2 != 0) {
                    long jK = this.f18493b.k(cVar, Math.min(j2, i2));
                    if (jK == -1) {
                        return -1L;
                    }
                    this.f18497f = (int) (((long) this.f18497f) - jK);
                    return jK;
                }
                this.f18493b.Z(this.f18498g);
                this.f18498g = (short) 0;
                if ((this.f18495d & 4) != 0) {
                    return -1L;
                }
                d();
            }
        }

        @Override // l.t
        public u timeout() {
            return this.f18493b.timeout();
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String[] f18499a = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String[] f18500b = new String[64];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String[] f18501c = new String[256];

        static {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                String[] strArr = f18501c;
                if (i3 >= strArr.length) {
                    break;
                }
                strArr[i3] = String.format("%8s", Integer.toBinaryString(i3)).replace(' ', '0');
                i3++;
            }
            String[] strArr2 = f18500b;
            strArr2[0] = BuildConfig.FLAVOR;
            strArr2[1] = "END_STREAM";
            int[] iArr = {1};
            strArr2[8] = "PADDED";
            for (int i4 = 0; i4 < 1; i4++) {
                int i5 = iArr[i4];
                String[] strArr3 = f18500b;
                strArr3[i5 | 8] = strArr3[i5] + "|PADDED";
            }
            String[] strArr4 = f18500b;
            strArr4[4] = "END_HEADERS";
            strArr4[32] = "PRIORITY";
            strArr4[36] = "END_HEADERS|PRIORITY";
            int[] iArr2 = {4, 32, 36};
            for (int i6 = 0; i6 < 3; i6++) {
                int i7 = iArr2[i6];
                for (int i8 = 0; i8 < 1; i8++) {
                    int i9 = iArr[i8];
                    String[] strArr5 = f18500b;
                    int i10 = i9 | i7;
                    strArr5[i10] = strArr5[i9] + '|' + strArr5[i7];
                    strArr5[i10 | 8] = strArr5[i9] + '|' + strArr5[i7] + "|PADDED";
                }
            }
            while (true) {
                String[] strArr6 = f18500b;
                if (i2 >= strArr6.length) {
                    return;
                }
                if (strArr6[i2] == null) {
                    strArr6[i2] = f18501c[i2];
                }
                i2++;
            }
        }

        public static String a(byte b2, byte b3) {
            if (b3 == 0) {
                return BuildConfig.FLAVOR;
            }
            if (b2 != 2 && b2 != 3) {
                if (b2 == 4 || b2 == 6) {
                    return b3 == 1 ? "ACK" : f18501c[b3];
                }
                if (b2 != 7 && b2 != 8) {
                    String[] strArr = f18500b;
                    String str = b3 < strArr.length ? strArr[b3] : f18501c[b3];
                    return (b2 != 5 || (b3 & 4) == 0) ? (b2 != 0 || (b3 & 32) == 0) ? str : str.replace("PRIORITY", "COMPRESSED") : str.replace("HEADERS", "PUSH_PROMISE");
                }
            }
            return f18501c[b3];
        }

        public static String b(boolean z, int i2, int i3, byte b2, byte b3) {
            String[] strArr = f18499a;
            String str = b2 < strArr.length ? strArr[b2] : String.format("0x%02x", Byte.valueOf(b2));
            String strA = a(b2, b3);
            Object[] objArr = new Object[5];
            objArr[0] = z ? "<<" : ">>";
            objArr[1] = Integer.valueOf(i2);
            objArr[2] = Integer.valueOf(i3);
            objArr[3] = str;
            objArr[4] = strA;
            return String.format("%s 0x%08x %5d %-13s %s", objArr);
        }
    }

    public static final class c implements c.k.a.y.k.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final l.e f18502b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a f18503c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f18504d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final f.a f18505e;

        public c(l.e eVar, int i2, boolean z) {
            this.f18502b = eVar;
            this.f18504d = z;
            a aVar = new a(eVar);
            this.f18503c = aVar;
            this.f18505e = new f.a(i2, aVar);
        }

        @Override // c.k.a.y.k.b
        public void a0() throws IOException {
            if (this.f18504d) {
                return;
            }
            l.f fVarG = this.f18502b.g(g.f18492a.size());
            Logger logger = c.k.a.y.b.f18344a;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(String.format("<< CONNECTION %s", fVarG.u()));
            }
            if (!g.f18492a.equals(fVarG)) {
                throw g.j("Expected a connection header but was %s", fVarG.E());
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f18502b.close();
        }

        public final void d(b.a aVar, int i2, byte b2, int i3) throws IOException {
            boolean z = (b2 & 1) != 0;
            if ((b2 & 32) != 0) {
                throw g.j("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
            }
            short sT = (b2 & 8) != 0 ? (short) (this.f18502b.T() & 255) : (short) 0;
            aVar.f(z, i3, this.f18502b, g.k(i2, b2, sT));
            this.f18502b.Z(sT);
        }

        @Override // c.k.a.y.k.b
        public boolean f0(b.a aVar) throws IOException {
            try {
                this.f18502b.v0(9L);
                int iL = g.l(this.f18502b);
                if (iL < 0 || iL > 16384) {
                    throw g.j("FRAME_SIZE_ERROR: %s", Integer.valueOf(iL));
                }
                byte bT = (byte) (this.f18502b.T() & 255);
                byte bT2 = (byte) (this.f18502b.T() & 255);
                int iC = this.f18502b.C() & Integer.MAX_VALUE;
                Logger logger = c.k.a.y.b.f18344a;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(b.b(true, iC, iL, bT, bT2));
                }
                switch (bT) {
                    case 0:
                        d(aVar, iL, bT2, iC);
                        return true;
                    case 1:
                        m(aVar, iL, bT2, iC);
                        return true;
                    case 2:
                        p(aVar, iL, bT2, iC);
                        return true;
                    case 3:
                        r(aVar, iL, bT2, iC);
                        return true;
                    case 4:
                        s(aVar, iL, bT2, iC);
                        return true;
                    case 5:
                        q(aVar, iL, bT2, iC);
                        return true;
                    case 6:
                        n(aVar, iL, bT2, iC);
                        return true;
                    case 7:
                        i(aVar, iL, bT2, iC);
                        return true;
                    case 8:
                        t(aVar, iL, bT2, iC);
                        return true;
                    default:
                        this.f18502b.Z(iL);
                        return true;
                }
            } catch (IOException unused) {
                return false;
            }
        }

        public final void i(b.a aVar, int i2, byte b2, int i3) throws IOException {
            if (i2 < 8) {
                throw g.j("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i2));
            }
            if (i3 != 0) {
                throw g.j("TYPE_GOAWAY streamId != 0", new Object[0]);
            }
            int iC = this.f18502b.C();
            int iC2 = this.f18502b.C();
            int i4 = i2 - 8;
            c.k.a.y.k.a aVarFromHttp2 = c.k.a.y.k.a.fromHttp2(iC2);
            if (aVarFromHttp2 == null) {
                throw g.j("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(iC2));
            }
            l.f fVarG = l.f.f31052c;
            if (i4 > 0) {
                fVarG = this.f18502b.g(i4);
            }
            aVar.j(iC, aVarFromHttp2, fVarG);
        }

        public final List<c.k.a.y.k.d> l(int i2, short s, byte b2, int i3) throws IOException {
            a aVar = this.f18503c;
            aVar.f18497f = i2;
            aVar.f18494c = i2;
            aVar.f18498g = s;
            aVar.f18495d = b2;
            aVar.f18496e = i3;
            this.f18505e.l();
            return this.f18505e.d();
        }

        public final void m(b.a aVar, int i2, byte b2, int i3) throws IOException {
            if (i3 == 0) {
                throw g.j("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
            }
            boolean z = (b2 & 1) != 0;
            short sT = (b2 & 8) != 0 ? (short) (this.f18502b.T() & 255) : (short) 0;
            if ((b2 & 32) != 0) {
                o(aVar, i3);
                i2 -= 5;
            }
            aVar.i(false, z, i3, -1, l(g.k(i2, b2, sT), sT, b2, i3), e.HTTP_20_HEADERS);
        }

        public final void n(b.a aVar, int i2, byte b2, int i3) throws IOException {
            if (i2 != 8) {
                throw g.j("TYPE_PING length != 8: %s", Integer.valueOf(i2));
            }
            if (i3 != 0) {
                throw g.j("TYPE_PING streamId != 0", new Object[0]);
            }
            aVar.b((b2 & 1) != 0, this.f18502b.C(), this.f18502b.C());
        }

        public final void o(b.a aVar, int i2) {
            int iC = this.f18502b.C();
            aVar.g(i2, iC & Integer.MAX_VALUE, (this.f18502b.T() & 255) + 1, (Integer.MIN_VALUE & iC) != 0);
        }

        public final void p(b.a aVar, int i2, byte b2, int i3) throws IOException {
            if (i2 != 5) {
                throw g.j("TYPE_PRIORITY length: %d != 5", Integer.valueOf(i2));
            }
            if (i3 == 0) {
                throw g.j("TYPE_PRIORITY streamId == 0", new Object[0]);
            }
            o(aVar, i3);
        }

        public final void q(b.a aVar, int i2, byte b2, int i3) throws IOException {
            if (i3 == 0) {
                throw g.j("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
            }
            short sT = (b2 & 8) != 0 ? (short) (this.f18502b.T() & 255) : (short) 0;
            aVar.c(i3, this.f18502b.C() & Integer.MAX_VALUE, l(g.k(i2 - 4, b2, sT), sT, b2, i3));
        }

        public final void r(b.a aVar, int i2, byte b2, int i3) throws IOException {
            if (i2 != 4) {
                throw g.j("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i2));
            }
            if (i3 == 0) {
                throw g.j("TYPE_RST_STREAM streamId == 0", new Object[0]);
            }
            int iC = this.f18502b.C();
            c.k.a.y.k.a aVarFromHttp2 = c.k.a.y.k.a.fromHttp2(iC);
            if (aVarFromHttp2 == null) {
                throw g.j("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(iC));
            }
            aVar.e(i3, aVarFromHttp2);
        }

        public final void s(b.a aVar, int i2, byte b2, int i3) throws IOException {
            if (i3 != 0) {
                throw g.j("TYPE_SETTINGS streamId != 0", new Object[0]);
            }
            if ((b2 & 1) != 0) {
                if (i2 != 0) {
                    throw g.j("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                }
                aVar.d();
                return;
            }
            if (i2 % 6 != 0) {
                throw g.j("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i2));
            }
            m mVar = new m();
            for (int i4 = 0; i4 < i2; i4 += 6) {
                short sP0 = this.f18502b.p0();
                int iC = this.f18502b.C();
                switch (sP0) {
                    case 1:
                    case 6:
                        break;
                    case 2:
                        if (iC != 0 && iC != 1) {
                            throw g.j("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                        }
                        break;
                        break;
                    case 3:
                        sP0 = 4;
                        break;
                    case 4:
                        sP0 = 7;
                        if (iC < 0) {
                            throw g.j("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                        }
                        break;
                        break;
                    case 5:
                        if (iC < 16384 || iC > 16777215) {
                            throw g.j("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(iC));
                        }
                        break;
                        break;
                    default:
                        throw g.j("PROTOCOL_ERROR invalid settings id: %s", Short.valueOf(sP0));
                }
                mVar.k(sP0, 0, iC);
            }
            aVar.h(false, mVar);
            if (mVar.d() >= 0) {
                this.f18505e.i(mVar.d());
            }
        }

        public final void t(b.a aVar, int i2, byte b2, int i3) throws IOException {
            if (i2 != 4) {
                throw g.j("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i2));
            }
            long jC = ((long) this.f18502b.C()) & 2147483647L;
            if (jC == 0) {
                throw g.j("windowSizeIncrement was 0", Long.valueOf(jC));
            }
            aVar.a(i3, jC);
        }
    }

    public static final class d implements c.k.a.y.k.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final l.d f18506b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f18507c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final l.c f18508d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final f.b f18509e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f18510f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f18511g;

        public d(l.d dVar, boolean z) {
            this.f18506b = dVar;
            this.f18507c = z;
            l.c cVar = new l.c();
            this.f18508d = cVar;
            this.f18509e = new f.b(cVar);
            this.f18510f = 16384;
        }

        @Override // c.k.a.y.k.c
        public synchronized void J() {
            if (this.f18511g) {
                throw new IOException("closed");
            }
            if (this.f18507c) {
                Logger logger = c.k.a.y.b.f18344a;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(String.format(">> CONNECTION %s", g.f18492a.u()));
                }
                this.f18506b.i0(g.f18492a.D());
                this.f18506b.flush();
            }
        }

        @Override // c.k.a.y.k.c
        public synchronized void L(boolean z, int i2, l.c cVar, int i3) {
            if (this.f18511g) {
                throw new IOException("closed");
            }
            d(i2, z ? (byte) 1 : (byte) 0, cVar, i3);
        }

        @Override // c.k.a.y.k.c
        public synchronized void M(m mVar) {
            if (this.f18511g) {
                throw new IOException("closed");
            }
            this.f18510f = mVar.f(this.f18510f);
            i(0, 0, (byte) 4, (byte) 1);
            this.f18506b.flush();
        }

        @Override // c.k.a.y.k.c
        public synchronized void O(int i2, c.k.a.y.k.a aVar, byte[] bArr) {
            if (this.f18511g) {
                throw new IOException("closed");
            }
            if (aVar.httpCode == -1) {
                throw g.i("errorCode.httpCode == -1", new Object[0]);
            }
            i(0, bArr.length + 8, (byte) 7, (byte) 0);
            this.f18506b.E(i2);
            this.f18506b.E(aVar.httpCode);
            if (bArr.length > 0) {
                this.f18506b.i0(bArr);
            }
            this.f18506b.flush();
        }

        @Override // c.k.a.y.k.c
        public synchronized void a(int i2, long j2) {
            if (this.f18511g) {
                throw new IOException("closed");
            }
            if (j2 == 0 || j2 > 2147483647L) {
                throw g.i("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j2));
            }
            i(i2, 4, (byte) 8, (byte) 0);
            this.f18506b.E((int) j2);
            this.f18506b.flush();
        }

        @Override // c.k.a.y.k.c
        public synchronized void b(boolean z, int i2, int i3) {
            if (this.f18511g) {
                throw new IOException("closed");
            }
            i(0, 8, (byte) 6, z ? (byte) 1 : (byte) 0);
            this.f18506b.E(i2);
            this.f18506b.E(i3);
            this.f18506b.flush();
        }

        @Override // c.k.a.y.k.c
        public synchronized void c(int i2, int i3, List<c.k.a.y.k.d> list) {
            if (this.f18511g) {
                throw new IOException("closed");
            }
            if (this.f18508d.H0() != 0) {
                throw new IllegalStateException();
            }
            this.f18509e.b(list);
            long jH0 = this.f18508d.H0();
            int iMin = (int) Math.min(this.f18510f - 4, jH0);
            long j2 = iMin;
            i(i2, iMin + 4, (byte) 5, jH0 == j2 ? (byte) 4 : (byte) 0);
            this.f18506b.E(i3 & Integer.MAX_VALUE);
            this.f18506b.h(this.f18508d, j2);
            if (jH0 > j2) {
                m(i2, jH0 - j2);
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            this.f18511g = true;
            this.f18506b.close();
        }

        public void d(int i2, byte b2, l.c cVar, int i3) {
            i(i2, i3, (byte) 0, b2);
            if (i3 > 0) {
                this.f18506b.h(cVar, i3);
            }
        }

        @Override // c.k.a.y.k.c
        public synchronized void e(int i2, c.k.a.y.k.a aVar) {
            if (this.f18511g) {
                throw new IOException("closed");
            }
            if (aVar.spdyRstCode == -1) {
                throw new IllegalArgumentException();
            }
            i(i2, 4, (byte) 3, (byte) 0);
            this.f18506b.E(aVar.httpCode);
            this.f18506b.flush();
        }

        @Override // c.k.a.y.k.c
        public synchronized void flush() {
            if (this.f18511g) {
                throw new IOException("closed");
            }
            this.f18506b.flush();
        }

        public void i(int i2, int i3, byte b2, byte b3) {
            Logger logger = c.k.a.y.b.f18344a;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(b.b(false, i2, i3, b2, b3));
            }
            int i4 = this.f18510f;
            if (i3 > i4) {
                throw g.i("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i4), Integer.valueOf(i3));
            }
            if ((Integer.MIN_VALUE & i2) != 0) {
                throw g.i("reserved bit set: %s", Integer.valueOf(i2));
            }
            g.m(this.f18506b, i3);
            this.f18506b.I(b2 & 255);
            this.f18506b.I(b3 & 255);
            this.f18506b.E(i2 & Integer.MAX_VALUE);
        }

        public void l(boolean z, int i2, List<c.k.a.y.k.d> list) throws IOException {
            if (this.f18511g) {
                throw new IOException("closed");
            }
            if (this.f18508d.H0() != 0) {
                throw new IllegalStateException();
            }
            this.f18509e.b(list);
            long jH0 = this.f18508d.H0();
            int iMin = (int) Math.min(this.f18510f, jH0);
            long j2 = iMin;
            byte b2 = jH0 == j2 ? (byte) 4 : (byte) 0;
            if (z) {
                b2 = (byte) (b2 | 1);
            }
            i(i2, iMin, (byte) 1, b2);
            this.f18506b.h(this.f18508d, j2);
            if (jH0 > j2) {
                m(i2, jH0 - j2);
            }
        }

        public final void m(int i2, long j2) {
            while (j2 > 0) {
                int iMin = (int) Math.min(this.f18510f, j2);
                long j3 = iMin;
                j2 -= j3;
                i(i2, iMin, (byte) 9, j2 == 0 ? (byte) 4 : (byte) 0);
                this.f18506b.h(this.f18508d, j3);
            }
        }

        @Override // c.k.a.y.k.c
        public synchronized void n0(m mVar) {
            if (this.f18511g) {
                throw new IOException("closed");
            }
            int i2 = 0;
            i(0, mVar.l() * 6, (byte) 4, (byte) 0);
            while (i2 < 10) {
                if (mVar.h(i2)) {
                    this.f18506b.D(i2 == 4 ? 3 : i2 == 7 ? 4 : i2);
                    this.f18506b.E(mVar.c(i2));
                }
                i2++;
            }
            this.f18506b.flush();
        }

        @Override // c.k.a.y.k.c
        public int t0() {
            return this.f18510f;
        }

        @Override // c.k.a.y.k.c
        public synchronized void u0(boolean z, boolean z2, int i2, int i3, List<c.k.a.y.k.d> list) {
            try {
                if (z2) {
                    throw new UnsupportedOperationException();
                }
                if (this.f18511g) {
                    throw new IOException("closed");
                }
                l(z, i2, list);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static IllegalArgumentException i(String str, Object... objArr) {
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    public static IOException j(String str, Object... objArr) throws IOException {
        throw new IOException(String.format(str, objArr));
    }

    public static int k(int i2, byte b2, short s) throws IOException {
        if ((b2 & 8) != 0) {
            i2--;
        }
        if (s <= i2) {
            return (short) (i2 - s);
        }
        throw j("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i2));
    }

    public static int l(l.e eVar) {
        return (eVar.T() & 255) | ((eVar.T() & 255) << 16) | ((eVar.T() & 255) << 8);
    }

    public static void m(l.d dVar, int i2) {
        dVar.I((i2 >>> 16) & 255);
        dVar.I((i2 >>> 8) & 255);
        dVar.I(i2 & 255);
    }

    @Override // c.k.a.y.k.q
    public c.k.a.y.k.b a(l.e eVar, boolean z) {
        return new c(eVar, ProgressEvent.PART_FAILED_EVENT_CODE, z);
    }

    @Override // c.k.a.y.k.q
    public c.k.a.y.k.c b(l.d dVar, boolean z) {
        return new d(dVar, z);
    }
}
