package c.f.a.b.t2;

import c.f.a.b.j3.x0;
import c.f.a.b.t2.s;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class m0 implements s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f10116c = 1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f10117d = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public s.a f10118e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public s.a f10119f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public s.a f10120g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public s.a f10121h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f10122i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public l0 f10123j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ByteBuffer f10124k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ShortBuffer f10125l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ByteBuffer f10126m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f10127n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f10128o;
    public boolean p;

    public m0() {
        s.a aVar = s.a.f10171a;
        this.f10118e = aVar;
        this.f10119f = aVar;
        this.f10120g = aVar;
        this.f10121h = aVar;
        ByteBuffer byteBuffer = s.f10170a;
        this.f10124k = byteBuffer;
        this.f10125l = byteBuffer.asShortBuffer();
        this.f10126m = byteBuffer;
        this.f10115b = -1;
    }

    @Override // c.f.a.b.t2.s
    public ByteBuffer a() {
        int iK;
        l0 l0Var = this.f10123j;
        if (l0Var != null && (iK = l0Var.k()) > 0) {
            if (this.f10124k.capacity() < iK) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(iK).order(ByteOrder.nativeOrder());
                this.f10124k = byteBufferOrder;
                this.f10125l = byteBufferOrder.asShortBuffer();
            } else {
                this.f10124k.clear();
                this.f10125l.clear();
            }
            l0Var.j(this.f10125l);
            this.f10128o += (long) iK;
            this.f10124k.limit(iK);
            this.f10126m = this.f10124k;
        }
        ByteBuffer byteBuffer = this.f10126m;
        this.f10126m = s.f10170a;
        return byteBuffer;
    }

    @Override // c.f.a.b.t2.s
    public boolean b() {
        l0 l0Var;
        return this.p && ((l0Var = this.f10123j) == null || l0Var.k() == 0);
    }

    @Override // c.f.a.b.t2.s
    public void c(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            l0 l0Var = (l0) c.f.a.b.j3.g.e(this.f10123j);
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f10127n += (long) iRemaining;
            l0Var.t(shortBufferAsShortBuffer);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // c.f.a.b.t2.s
    public s.a d(s.a aVar) throws s.b {
        if (aVar.f10174d != 2) {
            throw new s.b(aVar);
        }
        int i2 = this.f10115b;
        if (i2 == -1) {
            i2 = aVar.f10172b;
        }
        this.f10118e = aVar;
        s.a aVar2 = new s.a(i2, aVar.f10173c, 2);
        this.f10119f = aVar2;
        this.f10122i = true;
        return aVar2;
    }

    @Override // c.f.a.b.t2.s
    public void e() {
        l0 l0Var = this.f10123j;
        if (l0Var != null) {
            l0Var.s();
        }
        this.p = true;
    }

    public long f(long j2) {
        if (this.f10128o >= 1024) {
            long jL = this.f10127n - ((long) ((l0) c.f.a.b.j3.g.e(this.f10123j)).l());
            int i2 = this.f10121h.f10172b;
            int i3 = this.f10120g.f10172b;
            return i2 == i3 ? x0.P0(j2, jL, this.f10128o) : x0.P0(j2, jL * ((long) i2), this.f10128o * ((long) i3));
        }
        double d2 = this.f10116c;
        double d3 = j2;
        Double.isNaN(d2);
        Double.isNaN(d3);
        return (long) (d2 * d3);
    }

    @Override // c.f.a.b.t2.s
    public void flush() {
        if (isActive()) {
            s.a aVar = this.f10118e;
            this.f10120g = aVar;
            s.a aVar2 = this.f10119f;
            this.f10121h = aVar2;
            if (this.f10122i) {
                this.f10123j = new l0(aVar.f10172b, aVar.f10173c, this.f10116c, this.f10117d, aVar2.f10172b);
            } else {
                l0 l0Var = this.f10123j;
                if (l0Var != null) {
                    l0Var.i();
                }
            }
        }
        this.f10126m = s.f10170a;
        this.f10127n = 0L;
        this.f10128o = 0L;
        this.p = false;
    }

    public void g(float f2) {
        if (this.f10117d != f2) {
            this.f10117d = f2;
            this.f10122i = true;
        }
    }

    public void h(float f2) {
        if (this.f10116c != f2) {
            this.f10116c = f2;
            this.f10122i = true;
        }
    }

    @Override // c.f.a.b.t2.s
    public boolean isActive() {
        return this.f10119f.f10172b != -1 && (Math.abs(this.f10116c - 1.0f) >= 1.0E-4f || Math.abs(this.f10117d - 1.0f) >= 1.0E-4f || this.f10119f.f10172b != this.f10118e.f10172b);
    }

    @Override // c.f.a.b.t2.s
    public void reset() {
        this.f10116c = 1.0f;
        this.f10117d = 1.0f;
        s.a aVar = s.a.f10171a;
        this.f10118e = aVar;
        this.f10119f = aVar;
        this.f10120g = aVar;
        this.f10121h = aVar;
        ByteBuffer byteBuffer = s.f10170a;
        this.f10124k = byteBuffer;
        this.f10125l = byteBuffer.asShortBuffer();
        this.f10126m = byteBuffer;
        this.f10115b = -1;
        this.f10122i = false;
        this.f10123j = null;
        this.f10127n = 0L;
        this.f10128o = 0L;
        this.p = false;
    }
}
