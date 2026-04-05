package c.f.a.b.i3.p0;

import c.f.a.b.j3.x0;
import java.io.IOException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes2.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f8997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f8998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.f.a.b.i3.s f8999c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f9000d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f9001e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a f9002f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f9003g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f9004h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f9005i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile boolean f9006j;

    public interface a {
        void a(long j2, long j3, long j4);
    }

    public k(d dVar, c.f.a.b.i3.s sVar, byte[] bArr, a aVar) {
        this.f8997a = dVar;
        this.f8998b = dVar.v();
        this.f8999c = sVar;
        this.f9001e = bArr == null ? new byte[131072] : bArr;
        this.f9002f = aVar;
        this.f9000d = dVar.w().a(sVar);
        this.f9003g = sVar.f9067g;
    }

    public void a() throws IOException {
        long j2;
        g();
        b bVar = this.f8998b;
        String str = this.f9000d;
        c.f.a.b.i3.s sVar = this.f8999c;
        this.f9005i = bVar.d(str, sVar.f9067g, sVar.f9068h);
        c.f.a.b.i3.s sVar2 = this.f8999c;
        long j3 = sVar2.f9068h;
        if (j3 != -1) {
            this.f9004h = sVar2.f9067g + j3;
        } else {
            long jA = n.a(this.f8998b.b(this.f9000d));
            if (jA == -1) {
                jA = -1;
            }
            this.f9004h = jA;
        }
        a aVar = this.f9002f;
        if (aVar != null) {
            aVar.a(c(), this.f9005i, 0L);
        }
        while (true) {
            long j4 = this.f9004h;
            if (j4 != -1 && this.f9003g >= j4) {
                return;
            }
            g();
            long j5 = this.f9004h;
            long jF = this.f8998b.f(this.f9000d, this.f9003g, j5 == -1 ? Long.MAX_VALUE : j5 - this.f9003g);
            if (jF > 0) {
                j2 = this.f9003g;
            } else {
                long j6 = -jF;
                if (j6 == Long.MAX_VALUE) {
                    j6 = -1;
                }
                j2 = this.f9003g;
                jF = f(j2, j6);
            }
            this.f9003g = j2 + jF;
        }
    }

    public void b() {
        this.f9006j = true;
    }

    public final long c() {
        long j2 = this.f9004h;
        if (j2 == -1) {
            return -1L;
        }
        return j2 - this.f8999c.f9067g;
    }

    public final void d(long j2) {
        this.f9005i += j2;
        a aVar = this.f9002f;
        if (aVar != null) {
            aVar.a(c(), this.f9005i, j2);
        }
    }

    public final void e(long j2) {
        if (this.f9004h == j2) {
            return;
        }
        this.f9004h = j2;
        a aVar = this.f9002f;
        if (aVar != null) {
            aVar.a(c(), this.f9005i, 0L);
        }
    }

    public final long f(long j2, long j3) throws IOException {
        long jG;
        boolean z = true;
        boolean z2 = j2 + j3 == this.f9004h || j3 == -1;
        if (j3 != -1) {
            try {
                jG = this.f8997a.g(this.f8999c.a().h(j2).g(j3).a());
            } catch (IOException unused) {
                x0.n(this.f8997a);
                jG = -1;
                z = false;
            }
        } else {
            jG = -1;
            z = false;
        }
        if (!z) {
            g();
            try {
                jG = this.f8997a.g(this.f8999c.a().h(j2).g(-1L).a());
            } catch (IOException e2) {
                x0.n(this.f8997a);
                throw e2;
            }
        }
        if (z2 && jG != -1) {
            try {
                e(jG + j2);
            } catch (IOException e3) {
                x0.n(this.f8997a);
                throw e3;
            }
        }
        int iB = 0;
        int i2 = 0;
        while (iB != -1) {
            g();
            d dVar = this.f8997a;
            byte[] bArr = this.f9001e;
            iB = dVar.b(bArr, 0, bArr.length);
            if (iB != -1) {
                d(iB);
                i2 += iB;
            }
        }
        if (z2) {
            e(j2 + ((long) i2));
        }
        this.f8997a.close();
        return i2;
    }

    public final void g() throws InterruptedIOException {
        if (this.f9006j) {
            throw new InterruptedIOException();
        }
    }
}
