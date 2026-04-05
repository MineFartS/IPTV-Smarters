package c.f.a.b.z2.e0;

import android.net.Uri;
import c.f.a.b.j3.g;
import c.f.a.b.j3.i0;
import c.f.a.b.j3.x0;
import c.f.a.b.w1;
import c.f.a.b.z2.a0;
import c.f.a.b.z2.j;
import c.f.a.b.z2.k;
import c.f.a.b.z2.l;
import c.f.a.b.z2.n;
import c.f.a.b.z2.o;
import c.f.a.b.z2.p;
import c.f.a.b.z2.q;
import c.f.a.b.z2.r;
import c.f.a.b.z2.w;
import c.f.a.b.z2.x;
import com.google.android.exoplayer2.extractor.FlacStreamMetadata;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f10706a = new o() { // from class: c.f.a.b.z2.e0.a
        @Override // c.f.a.b.z2.o
        public final j[] a() {
            return d.i();
        }

        @Override // c.f.a.b.z2.o
        public /* synthetic */ j[] b(Uri uri, Map map) {
            return n.a(this, uri, map);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f10707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i0 f10708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f10709d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p.a f10710e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public l f10711f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a0 f10712g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f10713h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c.f.a.b.b3.a f10714i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public FlacStreamMetadata f10715j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f10716k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f10717l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c f10718m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f10719n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f10720o;

    public d() {
        this(0);
    }

    public d(int i2) {
        this.f10707b = new byte[42];
        this.f10708c = new i0(new byte[32768], 0);
        this.f10709d = (i2 & 1) != 0;
        this.f10710e = new p.a();
        this.f10713h = 0;
    }

    public static /* synthetic */ j[] i() {
        return new j[]{new d()};
    }

    @Override // c.f.a.b.z2.j
    public void a(long j2, long j3) {
        if (j2 == 0) {
            this.f10713h = 0;
        } else {
            c cVar = this.f10718m;
            if (cVar != null) {
                cVar.h(j3);
            }
        }
        this.f10720o = j3 != 0 ? -1L : 0L;
        this.f10719n = 0;
        this.f10708c.L(0);
    }

    public final long b(i0 i0Var, boolean z) {
        boolean zD;
        g.e(this.f10715j);
        int iE = i0Var.e();
        while (true) {
            if (iE > i0Var.f() - 16) {
                if (!z) {
                    i0Var.P(iE);
                    return -1L;
                }
                while (iE <= i0Var.f() - this.f10716k) {
                    i0Var.P(iE);
                    try {
                        zD = p.d(i0Var, this.f10715j, this.f10717l, this.f10710e);
                    } catch (IndexOutOfBoundsException unused) {
                        zD = false;
                    }
                    if (!(i0Var.e() <= i0Var.f() ? zD : false)) {
                        iE++;
                    }
                }
                i0Var.P(i0Var.f());
                return -1L;
            }
            i0Var.P(iE);
            if (p.d(i0Var, this.f10715j, this.f10717l, this.f10710e)) {
                break;
            }
            iE++;
        }
        i0Var.P(iE);
        return this.f10710e.f11493a;
    }

    @Override // c.f.a.b.z2.j
    public void c(l lVar) {
        this.f10711f = lVar;
        this.f10712g = lVar.e(0, 1);
        lVar.p();
    }

    public final void d(k kVar) {
        this.f10717l = q.b(kVar);
        ((l) x0.i(this.f10711f)).i(f(kVar.getPosition(), kVar.getLength()));
        this.f10713h = 5;
    }

    @Override // c.f.a.b.z2.j
    public boolean e(k kVar) {
        q.c(kVar, false);
        return q.a(kVar);
    }

    public final x f(long j2, long j3) {
        g.e(this.f10715j);
        FlacStreamMetadata flacStreamMetadata = this.f10715j;
        if (flacStreamMetadata.seekTable != null) {
            return new r(flacStreamMetadata, j2);
        }
        if (j3 == -1 || flacStreamMetadata.totalSamples <= 0) {
            return new x.b(flacStreamMetadata.getDurationUs());
        }
        c cVar = new c(flacStreamMetadata, this.f10717l, j2, j3);
        this.f10718m = cVar;
        return cVar.b();
    }

    @Override // c.f.a.b.z2.j
    public int g(k kVar, w wVar) throws w1 {
        int i2 = this.f10713h;
        if (i2 == 0) {
            l(kVar);
            return 0;
        }
        if (i2 == 1) {
            h(kVar);
            return 0;
        }
        if (i2 == 2) {
            n(kVar);
            return 0;
        }
        if (i2 == 3) {
            m(kVar);
            return 0;
        }
        if (i2 == 4) {
            d(kVar);
            return 0;
        }
        if (i2 == 5) {
            return k(kVar, wVar);
        }
        throw new IllegalStateException();
    }

    public final void h(k kVar) {
        byte[] bArr = this.f10707b;
        kVar.u(bArr, 0, bArr.length);
        kVar.r();
        this.f10713h = 2;
    }

    public final void j() {
        ((a0) x0.i(this.f10712g)).d((this.f10720o * 1000000) / ((long) ((FlacStreamMetadata) x0.i(this.f10715j)).sampleRate), 1, this.f10719n, 0, null);
    }

    public final int k(k kVar, w wVar) {
        boolean z;
        g.e(this.f10712g);
        g.e(this.f10715j);
        c cVar = this.f10718m;
        if (cVar != null && cVar.d()) {
            return this.f10718m.c(kVar, wVar);
        }
        if (this.f10720o == -1) {
            this.f10720o = p.i(kVar, this.f10715j);
            return 0;
        }
        int iF = this.f10708c.f();
        if (iF < 32768) {
            int iB = kVar.b(this.f10708c.d(), iF, 32768 - iF);
            z = iB == -1;
            if (!z) {
                this.f10708c.O(iF + iB);
            } else if (this.f10708c.a() == 0) {
                j();
                return -1;
            }
        } else {
            z = false;
        }
        int iE = this.f10708c.e();
        int i2 = this.f10719n;
        int i3 = this.f10716k;
        if (i2 < i3) {
            i0 i0Var = this.f10708c;
            i0Var.Q(Math.min(i3 - i2, i0Var.a()));
        }
        long jB = b(this.f10708c, z);
        int iE2 = this.f10708c.e() - iE;
        this.f10708c.P(iE);
        this.f10712g.c(this.f10708c, iE2);
        this.f10719n += iE2;
        if (jB != -1) {
            j();
            this.f10719n = 0;
            this.f10720o = jB;
        }
        if (this.f10708c.a() < 16) {
            int iA = this.f10708c.a();
            System.arraycopy(this.f10708c.d(), this.f10708c.e(), this.f10708c.d(), 0, iA);
            this.f10708c.P(0);
            this.f10708c.O(iA);
        }
        return 0;
    }

    public final void l(k kVar) {
        this.f10714i = q.d(kVar, !this.f10709d);
        this.f10713h = 1;
    }

    public final void m(k kVar) {
        q.a aVar = new q.a(this.f10715j);
        boolean zE = false;
        while (!zE) {
            zE = q.e(kVar, aVar);
            this.f10715j = (FlacStreamMetadata) x0.i(aVar.f11494a);
        }
        g.e(this.f10715j);
        this.f10716k = Math.max(this.f10715j.minFrameSize, 6);
        ((a0) x0.i(this.f10712g)).e(this.f10715j.getFormat(this.f10707b, this.f10714i));
        this.f10713h = 4;
    }

    public final void n(k kVar) throws w1 {
        q.j(kVar);
        this.f10713h = 3;
    }

    @Override // c.f.a.b.z2.j
    public void release() {
    }
}
