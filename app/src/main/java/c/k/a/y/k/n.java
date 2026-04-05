package c.k.a.y.k;

import c.k.a.y.k.b;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.util.List;
import java.util.zip.Deflater;
import l.s;

/* JADX INFO: loaded from: classes2.dex */
public final class n implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f18533a;

    public static final class a implements c.k.a.y.k.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final l.e f18534b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f18535c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final j f18536d;

        public a(l.e eVar, boolean z) {
            this.f18534b = eVar;
            this.f18536d = new j(eVar);
            this.f18535c = z;
        }

        public static IOException d(String str, Object... objArr) throws IOException {
            throw new IOException(String.format(str, objArr));
        }

        @Override // c.k.a.y.k.b
        public void a0() {
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f18536d.c();
        }

        @Override // c.k.a.y.k.b
        public boolean f0(b.a aVar) throws IOException {
            try {
                int iC = this.f18534b.C();
                int iC2 = this.f18534b.C();
                int i2 = ((-16777216) & iC2) >>> 24;
                int i3 = iC2 & 16777215;
                if (!((Integer.MIN_VALUE & iC) != 0)) {
                    aVar.f((i2 & 1) != 0, iC & Integer.MAX_VALUE, this.f18534b, i3);
                    return true;
                }
                int i4 = (2147418112 & iC) >>> 16;
                int i5 = iC & 65535;
                if (i4 != 3) {
                    throw new ProtocolException("version != 3: " + i4);
                }
                switch (i5) {
                    case 1:
                        q(aVar, i2, i3);
                        return true;
                    case 2:
                        p(aVar, i2, i3);
                        return true;
                    case 3:
                        n(aVar, i2, i3);
                        return true;
                    case 4:
                        o(aVar, i2, i3);
                        return true;
                    case 5:
                    default:
                        this.f18534b.Z(i3);
                        return true;
                    case 6:
                        m(aVar, i2, i3);
                        return true;
                    case 7:
                        i(aVar, i2, i3);
                        return true;
                    case 8:
                        l(aVar, i2, i3);
                        return true;
                    case 9:
                        r(aVar, i2, i3);
                        return true;
                }
            } catch (IOException unused) {
                return false;
            }
        }

        public final void i(b.a aVar, int i2, int i3) throws IOException {
            if (i3 != 8) {
                throw d("TYPE_GOAWAY length: %d != 8", Integer.valueOf(i3));
            }
            int iC = this.f18534b.C() & Integer.MAX_VALUE;
            int iC2 = this.f18534b.C();
            c.k.a.y.k.a aVarFromSpdyGoAway = c.k.a.y.k.a.fromSpdyGoAway(iC2);
            if (aVarFromSpdyGoAway == null) {
                throw d("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(iC2));
            }
            aVar.j(iC, aVarFromSpdyGoAway, l.f.f31052c);
        }

        public final void l(b.a aVar, int i2, int i3) {
            aVar.i(false, false, this.f18534b.C() & Integer.MAX_VALUE, -1, this.f18536d.f(i3 - 4), e.SPDY_HEADERS);
        }

        public final void m(b.a aVar, int i2, int i3) throws IOException {
            if (i3 != 4) {
                throw d("TYPE_PING length: %d != 4", Integer.valueOf(i3));
            }
            int iC = this.f18534b.C();
            aVar.b(this.f18535c == ((iC & 1) == 1), iC, 0);
        }

        public final void n(b.a aVar, int i2, int i3) throws IOException {
            if (i3 != 8) {
                throw d("TYPE_RST_STREAM length: %d != 8", Integer.valueOf(i3));
            }
            int iC = this.f18534b.C() & Integer.MAX_VALUE;
            int iC2 = this.f18534b.C();
            c.k.a.y.k.a aVarFromSpdy3Rst = c.k.a.y.k.a.fromSpdy3Rst(iC2);
            if (aVarFromSpdy3Rst == null) {
                throw d("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(iC2));
            }
            aVar.e(iC, aVarFromSpdy3Rst);
        }

        public final void o(b.a aVar, int i2, int i3) throws IOException {
            int iC = this.f18534b.C();
            if (i3 != (iC * 8) + 4) {
                throw d("TYPE_SETTINGS length: %d != 4 + 8 * %d", Integer.valueOf(i3), Integer.valueOf(iC));
            }
            m mVar = new m();
            for (int i4 = 0; i4 < iC; i4++) {
                int iC2 = this.f18534b.C();
                mVar.k(iC2 & 16777215, ((-16777216) & iC2) >>> 24, this.f18534b.C());
            }
            aVar.h((i2 & 1) != 0, mVar);
        }

        public final void p(b.a aVar, int i2, int i3) throws IOException {
            aVar.i(false, (i2 & 1) != 0, this.f18534b.C() & Integer.MAX_VALUE, -1, this.f18536d.f(i3 - 4), e.SPDY_REPLY);
        }

        public final void q(b.a aVar, int i2, int i3) throws IOException {
            int iC = this.f18534b.C() & Integer.MAX_VALUE;
            int iC2 = this.f18534b.C() & Integer.MAX_VALUE;
            this.f18534b.p0();
            aVar.i((i2 & 2) != 0, (i2 & 1) != 0, iC, iC2, this.f18536d.f(i3 - 10), e.SPDY_SYN_STREAM);
        }

        public final void r(b.a aVar, int i2, int i3) throws IOException {
            if (i3 != 8) {
                throw d("TYPE_WINDOW_UPDATE length: %d != 8", Integer.valueOf(i3));
            }
            int iC = this.f18534b.C() & Integer.MAX_VALUE;
            long jC = this.f18534b.C() & Integer.MAX_VALUE;
            if (jC == 0) {
                throw d("windowSizeIncrement was 0", Long.valueOf(jC));
            }
            aVar.a(iC, jC);
        }
    }

    public static final class b implements c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final l.d f18537b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final l.c f18538c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final l.d f18539d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f18540e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f18541f;

        public b(l.d dVar, boolean z) {
            this.f18537b = dVar;
            this.f18540e = z;
            Deflater deflater = new Deflater();
            deflater.setDictionary(n.f18533a);
            l.c cVar = new l.c();
            this.f18538c = cVar;
            this.f18539d = l.m.b(new l.g((s) cVar, deflater));
        }

        @Override // c.k.a.y.k.c
        public synchronized void J() {
        }

        @Override // c.k.a.y.k.c
        public synchronized void L(boolean z, int i2, l.c cVar, int i3) {
            d(i2, z ? 1 : 0, cVar, i3);
        }

        @Override // c.k.a.y.k.c
        public void M(m mVar) {
        }

        @Override // c.k.a.y.k.c
        public synchronized void O(int i2, c.k.a.y.k.a aVar, byte[] bArr) {
            if (this.f18541f) {
                throw new IOException("closed");
            }
            if (aVar.spdyGoAwayCode == -1) {
                throw new IllegalArgumentException("errorCode.spdyGoAwayCode == -1");
            }
            this.f18537b.E(-2147287033);
            this.f18537b.E(8);
            this.f18537b.E(i2);
            this.f18537b.E(aVar.spdyGoAwayCode);
            this.f18537b.flush();
        }

        @Override // c.k.a.y.k.c
        public synchronized void a(int i2, long j2) {
            if (this.f18541f) {
                throw new IOException("closed");
            }
            if (j2 == 0 || j2 > 2147483647L) {
                throw new IllegalArgumentException("windowSizeIncrement must be between 1 and 0x7fffffff: " + j2);
            }
            this.f18537b.E(-2147287031);
            this.f18537b.E(8);
            this.f18537b.E(i2);
            this.f18537b.E((int) j2);
            this.f18537b.flush();
        }

        @Override // c.k.a.y.k.c
        public synchronized void b(boolean z, int i2, int i3) {
            if (this.f18541f) {
                throw new IOException("closed");
            }
            if (z != (this.f18540e != ((i2 & 1) == 1))) {
                throw new IllegalArgumentException("payload != reply");
            }
            this.f18537b.E(-2147287034);
            this.f18537b.E(4);
            this.f18537b.E(i2);
            this.f18537b.flush();
        }

        @Override // c.k.a.y.k.c
        public void c(int i2, int i3, List<d> list) {
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            this.f18541f = true;
            c.k.a.y.h.b(this.f18537b, this.f18539d);
        }

        public void d(int i2, int i3, l.c cVar, int i4) throws IOException {
            if (this.f18541f) {
                throw new IOException("closed");
            }
            long j2 = i4;
            if (j2 > 16777215) {
                throw new IllegalArgumentException("FRAME_TOO_LARGE max size is 16Mib: " + i4);
            }
            this.f18537b.E(i2 & Integer.MAX_VALUE);
            this.f18537b.E(((i3 & 255) << 24) | (16777215 & i4));
            if (i4 > 0) {
                this.f18537b.h(cVar, j2);
            }
        }

        @Override // c.k.a.y.k.c
        public synchronized void e(int i2, c.k.a.y.k.a aVar) {
            if (this.f18541f) {
                throw new IOException("closed");
            }
            if (aVar.spdyRstCode == -1) {
                throw new IllegalArgumentException();
            }
            this.f18537b.E(-2147287037);
            this.f18537b.E(8);
            this.f18537b.E(i2 & Integer.MAX_VALUE);
            this.f18537b.E(aVar.spdyRstCode);
            this.f18537b.flush();
        }

        @Override // c.k.a.y.k.c
        public synchronized void flush() {
            if (this.f18541f) {
                throw new IOException("closed");
            }
            this.f18537b.flush();
        }

        public final void i(List<d> list) {
            if (this.f18538c.H0() != 0) {
                throw new IllegalStateException();
            }
            this.f18539d.E(list.size());
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                l.f fVar = list.get(i2).f18478h;
                this.f18539d.E(fVar.size());
                this.f18539d.j0(fVar);
                l.f fVar2 = list.get(i2).f18479i;
                this.f18539d.E(fVar2.size());
                this.f18539d.j0(fVar2);
            }
            this.f18539d.flush();
        }

        @Override // c.k.a.y.k.c
        public synchronized void n0(m mVar) {
            if (this.f18541f) {
                throw new IOException("closed");
            }
            int iL = mVar.l();
            this.f18537b.E(-2147287036);
            this.f18537b.E((((iL * 8) + 4) & 16777215) | 0);
            this.f18537b.E(iL);
            for (int i2 = 0; i2 <= 10; i2++) {
                if (mVar.h(i2)) {
                    this.f18537b.E(((mVar.b(i2) & 255) << 24) | (i2 & 16777215));
                    this.f18537b.E(mVar.c(i2));
                }
            }
            this.f18537b.flush();
        }

        @Override // c.k.a.y.k.c
        public int t0() {
            return 16383;
        }

        @Override // c.k.a.y.k.c
        public synchronized void u0(boolean z, boolean z2, int i2, int i3, List<d> list) {
            if (this.f18541f) {
                throw new IOException("closed");
            }
            i(list);
            int iH0 = (int) (this.f18538c.H0() + 10);
            int i4 = (z ? 1 : 0) | (z2 ? 2 : 0);
            this.f18537b.E(-2147287039);
            this.f18537b.E(((i4 & 255) << 24) | (iH0 & 16777215));
            this.f18537b.E(i2 & Integer.MAX_VALUE);
            this.f18537b.E(Integer.MAX_VALUE & i3);
            this.f18537b.D(0);
            this.f18537b.X(this.f18538c);
            this.f18537b.flush();
        }
    }

    static {
        try {
            f18533a = "\u0000\u0000\u0000\u0007options\u0000\u0000\u0000\u0004head\u0000\u0000\u0000\u0004post\u0000\u0000\u0000\u0003put\u0000\u0000\u0000\u0006delete\u0000\u0000\u0000\u0005trace\u0000\u0000\u0000\u0006accept\u0000\u0000\u0000\u000eaccept-charset\u0000\u0000\u0000\u000faccept-encoding\u0000\u0000\u0000\u000faccept-language\u0000\u0000\u0000\raccept-ranges\u0000\u0000\u0000\u0003age\u0000\u0000\u0000\u0005allow\u0000\u0000\u0000\rauthorization\u0000\u0000\u0000\rcache-control\u0000\u0000\u0000\nconnection\u0000\u0000\u0000\fcontent-base\u0000\u0000\u0000\u0010content-encoding\u0000\u0000\u0000\u0010content-language\u0000\u0000\u0000\u000econtent-length\u0000\u0000\u0000\u0010content-location\u0000\u0000\u0000\u000bcontent-md5\u0000\u0000\u0000\rcontent-range\u0000\u0000\u0000\fcontent-type\u0000\u0000\u0000\u0004date\u0000\u0000\u0000\u0004etag\u0000\u0000\u0000\u0006expect\u0000\u0000\u0000\u0007expires\u0000\u0000\u0000\u0004from\u0000\u0000\u0000\u0004host\u0000\u0000\u0000\bif-match\u0000\u0000\u0000\u0011if-modified-since\u0000\u0000\u0000\rif-none-match\u0000\u0000\u0000\bif-range\u0000\u0000\u0000\u0013if-unmodified-since\u0000\u0000\u0000\rlast-modified\u0000\u0000\u0000\blocation\u0000\u0000\u0000\fmax-forwards\u0000\u0000\u0000\u0006pragma\u0000\u0000\u0000\u0012proxy-authenticate\u0000\u0000\u0000\u0013proxy-authorization\u0000\u0000\u0000\u0005range\u0000\u0000\u0000\u0007referer\u0000\u0000\u0000\u000bretry-after\u0000\u0000\u0000\u0006server\u0000\u0000\u0000\u0002te\u0000\u0000\u0000\u0007trailer\u0000\u0000\u0000\u0011transfer-encoding\u0000\u0000\u0000\u0007upgrade\u0000\u0000\u0000\nuser-agent\u0000\u0000\u0000\u0004vary\u0000\u0000\u0000\u0003via\u0000\u0000\u0000\u0007warning\u0000\u0000\u0000\u0010www-authenticate\u0000\u0000\u0000\u0006method\u0000\u0000\u0000\u0003get\u0000\u0000\u0000\u0006status\u0000\u0000\u0000\u0006200 OK\u0000\u0000\u0000\u0007version\u0000\u0000\u0000\bHTTP/1.1\u0000\u0000\u0000\u0003url\u0000\u0000\u0000\u0006public\u0000\u0000\u0000\nset-cookie\u0000\u0000\u0000\nkeep-alive\u0000\u0000\u0000\u0006origin100101201202205206300302303304305306307402405406407408409410411412413414415416417502504505203 Non-Authoritative Information204 No Content301 Moved Permanently400 Bad Request401 Unauthorized403 Forbidden404 Not Found500 Internal Server Error501 Not Implemented503 Service UnavailableJan Feb Mar Apr May Jun Jul Aug Sept Oct Nov Dec 00:00:00 Mon, Tue, Wed, Thu, Fri, Sat, Sun, GMTchunked,text/html,image/png,image/jpg,image/gif,application/xml,application/xhtml+xml,text/plain,text/javascript,publicprivatemax-age=gzip,deflate,sdchcharset=utf-8charset=iso-8859-1,utf-,*,enq=0.".getBytes(c.k.a.y.h.f18367d.name());
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError();
        }
    }

    @Override // c.k.a.y.k.q
    public c.k.a.y.k.b a(l.e eVar, boolean z) {
        return new a(eVar, z);
    }

    @Override // c.k.a.y.k.q
    public c b(l.d dVar, boolean z) {
        return new b(dVar, z);
    }
}
