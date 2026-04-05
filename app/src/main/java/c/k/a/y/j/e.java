package c.k.a.y.j;

import c.k.a.o;
import c.k.a.u;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.concurrent.TimeUnit;
import l.s;
import l.t;
import l.u;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f18385a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f18386b = {48, DateTimeFieldType.HALFDAY_OF_DAY, 10, DateTimeFieldType.HALFDAY_OF_DAY, 10};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.k.a.j f18387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c.k.a.i f18388d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Socket f18389e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l.e f18390f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l.d f18391g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f18392h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f18393i = 0;

    public class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c.k.a.y.j.b f18394b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final s f18395c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f18396d;

        public b(c.k.a.y.j.b bVar) {
            s sVarBody = bVar != null ? bVar.body() : null;
            bVar = sVarBody == null ? null : bVar;
            this.f18395c = sVarBody;
            this.f18394b = bVar;
        }

        public final void d(l.c cVar, long j2) throws EOFException {
            if (this.f18395c != null) {
                l.c cVarClone = cVar.clone();
                cVarClone.Z(cVarClone.H0() - j2);
                this.f18395c.h(cVarClone, j2);
            }
        }

        public final void i(boolean z) throws IOException {
            if (e.this.f18392h != 5) {
                throw new IllegalStateException("state: " + e.this.f18392h);
            }
            if (this.f18394b != null) {
                this.f18395c.close();
            }
            e.this.f18392h = 0;
            if (z && e.this.f18393i == 1) {
                e.this.f18393i = 0;
                c.k.a.y.b.f18345b.h(e.this.f18387c, e.this.f18388d);
            } else if (e.this.f18393i == 2) {
                e.this.f18392h = 6;
                e.this.f18388d.h().close();
            }
        }

        public final void l() {
            c.k.a.y.j.b bVar = this.f18394b;
            if (bVar != null) {
                bVar.a();
            }
            c.k.a.y.h.d(e.this.f18388d.h());
            e.this.f18392h = 6;
        }
    }

    public final class c implements s {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f18398b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f18399c;

        public c() {
            this.f18398b = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, DateTimeFieldType.HALFDAY_OF_DAY, 10};
        }

        @Override // l.s, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            if (this.f18399c) {
                return;
            }
            this.f18399c = true;
            e.this.f18391g.i0(e.f18386b);
            e.this.f18392h = 3;
        }

        public final void d(long j2) {
            int i2 = 16;
            do {
                i2--;
                this.f18398b[i2] = e.f18385a[(int) (15 & j2)];
                j2 >>>= 4;
            } while (j2 != 0);
            l.d dVar = e.this.f18391g;
            byte[] bArr = this.f18398b;
            dVar.f(bArr, i2, bArr.length - i2);
        }

        @Override // l.s, java.io.Flushable
        public synchronized void flush() {
            if (this.f18399c) {
                return;
            }
            e.this.f18391g.flush();
        }

        @Override // l.s
        public void h(l.c cVar, long j2) {
            if (this.f18399c) {
                throw new IllegalStateException("closed");
            }
            if (j2 == 0) {
                return;
            }
            d(j2);
            e.this.f18391g.h(cVar, j2);
            e.this.f18391g.P("\r\n");
        }

        @Override // l.s
        public u timeout() {
            return e.this.f18391g.timeout();
        }
    }

    public class d extends b implements t {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f18401f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f18402g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final c.k.a.y.j.g f18403h;

        public d(c.k.a.y.j.b bVar, c.k.a.y.j.g gVar) {
            super(bVar);
            this.f18401f = -1;
            this.f18402g = true;
            this.f18403h = gVar;
        }

        @Override // l.t, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f18396d) {
                return;
            }
            if (this.f18402g && !e.this.m(this, 100)) {
                l();
            }
            this.f18396d = true;
        }

        @Override // l.t
        public long k(l.c cVar, long j2) throws IOException {
            if (j2 < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j2);
            }
            if (this.f18396d) {
                throw new IllegalStateException("closed");
            }
            if (!this.f18402g) {
                return -1L;
            }
            int i2 = this.f18401f;
            if (i2 == 0 || i2 == -1) {
                m();
                if (!this.f18402g) {
                    return -1L;
                }
            }
            long jK = e.this.f18390f.k(cVar, Math.min(j2, this.f18401f));
            if (jK == -1) {
                l();
                throw new IOException("unexpected end of stream");
            }
            this.f18401f = (int) (((long) this.f18401f) - jK);
            d(cVar, jK);
            return jK;
        }

        public final void m() throws IOException {
            if (this.f18401f != -1) {
                e.this.f18390f.b0();
            }
            String strB0 = e.this.f18390f.b0();
            int iIndexOf = strB0.indexOf(";");
            if (iIndexOf != -1) {
                strB0 = strB0.substring(0, iIndexOf);
            }
            try {
                int i2 = Integer.parseInt(strB0.trim(), 16);
                this.f18401f = i2;
                if (i2 == 0) {
                    this.f18402g = false;
                    o.b bVar = new o.b();
                    e.this.x(bVar);
                    this.f18403h.t(bVar.e());
                    i(true);
                }
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Expected a hex chunk size but was " + strB0);
            }
        }

        @Override // l.t
        public u timeout() {
            return e.this.f18390f.timeout();
        }
    }

    /* JADX INFO: renamed from: c.k.a.y.j.e$e, reason: collision with other inner class name */
    public final class C0247e implements s {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f18405b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f18406c;

        public C0247e(long j2) {
            this.f18406c = j2;
        }

        @Override // l.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws ProtocolException {
            if (this.f18405b) {
                return;
            }
            this.f18405b = true;
            if (this.f18406c > 0) {
                throw new ProtocolException("unexpected end of stream");
            }
            e.this.f18392h = 3;
        }

        @Override // l.s, java.io.Flushable
        public void flush() {
            if (this.f18405b) {
                return;
            }
            e.this.f18391g.flush();
        }

        @Override // l.s
        public void h(l.c cVar, long j2) throws ProtocolException {
            if (this.f18405b) {
                throw new IllegalStateException("closed");
            }
            c.k.a.y.h.a(cVar.H0(), 0L, j2);
            if (j2 <= this.f18406c) {
                e.this.f18391g.h(cVar, j2);
                this.f18406c -= j2;
                return;
            }
            throw new ProtocolException("expected " + this.f18406c + " bytes but received " + j2);
        }

        @Override // l.s
        public u timeout() {
            return e.this.f18391g.timeout();
        }
    }

    public class f extends b implements t {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f18408f;

        public f(c.k.a.y.j.b bVar, long j2) throws IOException {
            super(bVar);
            this.f18408f = j2;
            if (j2 == 0) {
                i(true);
            }
        }

        @Override // l.t, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f18396d) {
                return;
            }
            if (this.f18408f != 0 && !e.this.m(this, 100)) {
                l();
            }
            this.f18396d = true;
        }

        @Override // l.t
        public long k(l.c cVar, long j2) throws IOException {
            if (j2 < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j2);
            }
            if (this.f18396d) {
                throw new IllegalStateException("closed");
            }
            if (this.f18408f == 0) {
                return -1L;
            }
            long jK = e.this.f18390f.k(cVar, Math.min(this.f18408f, j2));
            if (jK == -1) {
                l();
                throw new ProtocolException("unexpected end of stream");
            }
            this.f18408f -= jK;
            d(cVar, jK);
            if (this.f18408f == 0) {
                i(true);
            }
            return jK;
        }

        @Override // l.t
        public u timeout() {
            return e.this.f18390f.timeout();
        }
    }

    public class g extends b implements t {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f18410f;

        public g(c.k.a.y.j.b bVar) {
            super(bVar);
        }

        @Override // l.t, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f18396d) {
                return;
            }
            if (!this.f18410f) {
                l();
            }
            this.f18396d = true;
        }

        @Override // l.t
        public long k(l.c cVar, long j2) throws IOException {
            if (j2 < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j2);
            }
            if (this.f18396d) {
                throw new IllegalStateException("closed");
            }
            if (this.f18410f) {
                return -1L;
            }
            long jK = e.this.f18390f.k(cVar, j2);
            if (jK != -1) {
                d(cVar, jK);
                return jK;
            }
            this.f18410f = true;
            i(false);
            return -1L;
        }

        @Override // l.t
        public u timeout() {
            return e.this.f18390f.timeout();
        }
    }

    public e(c.k.a.j jVar, c.k.a.i iVar, Socket socket) {
        this.f18387c = jVar;
        this.f18388d = iVar;
        this.f18389e = socket;
        this.f18390f = l.m.c(l.m.l(socket));
        this.f18391g = l.m.b(l.m.h(socket));
    }

    public void A(c.k.a.o oVar, String str) {
        if (this.f18392h != 0) {
            throw new IllegalStateException("state: " + this.f18392h);
        }
        this.f18391g.P(str).P("\r\n");
        for (int i2 = 0; i2 < oVar.f(); i2++) {
            this.f18391g.P(oVar.d(i2)).P(": ").P(oVar.g(i2)).P("\r\n");
        }
        this.f18391g.P("\r\n");
        this.f18392h = 1;
    }

    public void B(l lVar) {
        if (this.f18392h == 1) {
            this.f18392h = 3;
            lVar.i(this.f18391g);
        } else {
            throw new IllegalStateException("state: " + this.f18392h);
        }
    }

    public long k() {
        return this.f18390f.z().H0();
    }

    public void l() throws IOException {
        this.f18393i = 2;
        if (this.f18392h == 0) {
            this.f18392h = 6;
            this.f18388d.h().close();
        }
    }

    public boolean m(t tVar, int i2) {
        try {
            int soTimeout = this.f18389e.getSoTimeout();
            this.f18389e.setSoTimeout(i2);
            try {
                return c.k.a.y.h.q(tVar, i2);
            } finally {
                this.f18389e.setSoTimeout(soTimeout);
            }
        } catch (IOException unused) {
            return false;
        }
    }

    public void n() {
        u(null, 0L);
    }

    public void o() {
        this.f18391g.flush();
    }

    public boolean p() {
        return this.f18392h == 6;
    }

    public boolean q() {
        try {
            int soTimeout = this.f18389e.getSoTimeout();
            try {
                this.f18389e.setSoTimeout(1);
                return !this.f18390f.H();
            } finally {
                this.f18389e.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public s r() {
        if (this.f18392h == 1) {
            this.f18392h = 2;
            return new c();
        }
        throw new IllegalStateException("state: " + this.f18392h);
    }

    public t s(c.k.a.y.j.b bVar, c.k.a.y.j.g gVar) {
        if (this.f18392h == 4) {
            this.f18392h = 5;
            return new d(bVar, gVar);
        }
        throw new IllegalStateException("state: " + this.f18392h);
    }

    public s t(long j2) {
        if (this.f18392h == 1) {
            this.f18392h = 2;
            return new C0247e(j2);
        }
        throw new IllegalStateException("state: " + this.f18392h);
    }

    public t u(c.k.a.y.j.b bVar, long j2) {
        if (this.f18392h == 4) {
            this.f18392h = 5;
            return new f(bVar, j2);
        }
        throw new IllegalStateException("state: " + this.f18392h);
    }

    public t v(c.k.a.y.j.b bVar) {
        if (this.f18392h == 4) {
            this.f18392h = 5;
            return new g(bVar);
        }
        throw new IllegalStateException("state: " + this.f18392h);
    }

    public void w() {
        this.f18393i = 1;
        if (this.f18392h == 0) {
            this.f18393i = 0;
            c.k.a.y.b.f18345b.h(this.f18387c, this.f18388d);
        }
    }

    public void x(o.b bVar) {
        while (true) {
            String strB0 = this.f18390f.b0();
            if (strB0.length() == 0) {
                return;
            } else {
                c.k.a.y.b.f18345b.a(bVar, strB0);
            }
        }
    }

    public u.b y() throws ProtocolException {
        o oVarA;
        u.b bVarU;
        int i2 = this.f18392h;
        if (i2 != 1 && i2 != 3) {
            throw new IllegalStateException("state: " + this.f18392h);
        }
        do {
            oVarA = o.a(this.f18390f.b0());
            bVarU = new u.b().x(oVarA.f18468a).q(oVarA.f18469b).u(oVarA.f18470c);
            o.b bVar = new o.b();
            x(bVar);
            bVar.b(j.f18438e, oVarA.f18468a.toString());
            bVarU.t(bVar.e());
        } while (oVarA.f18469b == 100);
        this.f18392h = 4;
        return bVarU;
    }

    public void z(int i2, int i3) {
        if (i2 != 0) {
            this.f18390f.timeout().g(i2, TimeUnit.MILLISECONDS);
        }
        if (i3 != 0) {
            this.f18391g.timeout().g(i3, TimeUnit.MILLISECONDS);
        }
    }
}
