package com.google.ads.interactivemedia.v3.internal;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class pr implements nz {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f22760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f22761c = 1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f22762d = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private nx f22763e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private nx f22764f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private nx f22765g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private nx f22766h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f22767i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private pq f22768j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ByteBuffer f22769k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ShortBuffer f22770l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ByteBuffer f22771m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f22772n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f22773o;
    private boolean p;

    public pr() {
        nx nxVar = nx.f22572a;
        this.f22763e = nxVar;
        this.f22764f = nxVar;
        this.f22765g = nxVar;
        this.f22766h = nxVar;
        ByteBuffer byteBuffer = nz.f22577a;
        this.f22769k = byteBuffer;
        this.f22770l = byteBuffer.asShortBuffer();
        this.f22771m = byteBuffer;
        this.f22760b = -1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nz
    public final nx a(nx nxVar) throws ny {
        if (nxVar.f22575d != 2) {
            throw new ny(nxVar);
        }
        int i2 = this.f22760b;
        if (i2 == -1) {
            i2 = nxVar.f22573b;
        }
        this.f22763e = nxVar;
        nx nxVar2 = new nx(i2, nxVar.f22574c, 2);
        this.f22764f = nxVar2;
        this.f22767i = true;
        return nxVar2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nz
    public final ByteBuffer b() {
        int iA;
        pq pqVar = this.f22768j;
        if (pqVar != null && (iA = pqVar.a()) > 0) {
            if (this.f22769k.capacity() < iA) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(iA).order(ByteOrder.nativeOrder());
                this.f22769k = byteBufferOrder;
                this.f22770l = byteBufferOrder.asShortBuffer();
            } else {
                this.f22769k.clear();
                this.f22770l.clear();
            }
            pqVar.d(this.f22770l);
            this.f22773o += (long) iA;
            this.f22769k.limit(iA);
            this.f22771m = this.f22769k;
        }
        ByteBuffer byteBuffer = this.f22771m;
        this.f22771m = nz.f22577a;
        return byteBuffer;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nz
    public final void c() {
        if (g()) {
            nx nxVar = this.f22763e;
            this.f22765g = nxVar;
            nx nxVar2 = this.f22764f;
            this.f22766h = nxVar2;
            if (this.f22767i) {
                this.f22768j = new pq(nxVar.f22573b, nxVar.f22574c, this.f22761c, this.f22762d, nxVar2.f22573b);
            } else {
                pq pqVar = this.f22768j;
                if (pqVar != null) {
                    pqVar.c();
                }
            }
        }
        this.f22771m = nz.f22577a;
        this.f22772n = 0L;
        this.f22773o = 0L;
        this.p = false;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nz
    public final void d() {
        pq pqVar = this.f22768j;
        if (pqVar != null) {
            pqVar.e();
        }
        this.p = true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nz
    public final void e(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            pq pqVar = this.f22768j;
            ajr.b(pqVar);
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f22772n += (long) iRemaining;
            pqVar.f(shortBufferAsShortBuffer);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nz
    public final void f() {
        this.f22761c = 1.0f;
        this.f22762d = 1.0f;
        nx nxVar = nx.f22572a;
        this.f22763e = nxVar;
        this.f22764f = nxVar;
        this.f22765g = nxVar;
        this.f22766h = nxVar;
        ByteBuffer byteBuffer = nz.f22577a;
        this.f22769k = byteBuffer;
        this.f22770l = byteBuffer.asShortBuffer();
        this.f22771m = byteBuffer;
        this.f22760b = -1;
        this.f22767i = false;
        this.f22768j = null;
        this.f22772n = 0L;
        this.f22773o = 0L;
        this.p = false;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nz
    public final boolean g() {
        if (this.f22764f.f22573b != -1) {
            return Math.abs(this.f22761c + (-1.0f)) >= 1.0E-4f || Math.abs(this.f22762d + (-1.0f)) >= 1.0E-4f || this.f22764f.f22573b != this.f22763e.f22573b;
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nz
    public final boolean h() {
        pq pqVar;
        return this.p && ((pqVar = this.f22768j) == null || pqVar.a() == 0);
    }

    public final long i(long j2) {
        if (this.f22773o < 1024) {
            double d2 = this.f22761c;
            double d3 = j2;
            Double.isNaN(d2);
            Double.isNaN(d3);
            return (long) (d2 * d3);
        }
        long j3 = this.f22772n;
        pq pqVar = this.f22768j;
        ajr.b(pqVar);
        long jB = j3 - ((long) pqVar.b());
        int i2 = this.f22766h.f22573b;
        int i3 = this.f22765g.f22573b;
        return i2 == i3 ? amn.q(j2, jB, this.f22773o) : amn.q(j2, jB * ((long) i2), this.f22773o * ((long) i3));
    }

    public final void j(float f2) {
        if (this.f22762d != f2) {
            this.f22762d = f2;
            this.f22767i = true;
        }
    }

    public final void k(float f2) {
        if (this.f22761c != f2) {
            this.f22761c = f2;
            this.f22767i = true;
        }
    }
}
