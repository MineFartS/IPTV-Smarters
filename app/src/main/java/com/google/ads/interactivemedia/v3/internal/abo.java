package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class abo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final abg f19082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CopyOnWriteArrayList<abn> f19083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f19084d;

    public abo() {
        this(new CopyOnWriteArrayList(), 0, null, 0L);
    }

    private abo(CopyOnWriteArrayList<abn> copyOnWriteArrayList, int i2, abg abgVar, long j2) {
        this.f19083c = copyOnWriteArrayList;
        this.f19081a = i2;
        this.f19082b = abgVar;
        this.f19084d = j2;
    }

    private final long t(long j2) {
        long jC = iw.c(j2);
        if (jC == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.f19084d + jC;
    }

    public final abo a(int i2, abg abgVar, long j2) {
        return new abo(this.f19083c, i2, abgVar, j2);
    }

    public final void b(Handler handler, abp abpVar) {
        ajr.b(handler);
        ajr.b(abpVar);
        this.f19083c.add(new abn(handler, abpVar));
    }

    public final void c(final abc abcVar) {
        for (abn abnVar : this.f19083c) {
            final abp abpVar = abnVar.f19080b;
            amn.ao(abnVar.f19079a, new Runnable() { // from class: com.google.ads.interactivemedia.v3.internal.abl
                @Override // java.lang.Runnable
                public final void run() {
                    abo aboVar = this.f19072a;
                    abpVar.a(aboVar.f19081a, aboVar.f19082b, abcVar);
                }
            });
        }
    }

    public final void d(aax aaxVar, int i2) {
        p(aaxVar, i2, -1, null, 0, -9223372036854775807L, -9223372036854775807L);
    }

    public final void e(aax aaxVar, abc abcVar) {
        for (abn abnVar : this.f19083c) {
            amn.ao(abnVar.f19079a, new abj(this, abnVar.f19080b, aaxVar, abcVar, 1));
        }
    }

    public final void f(aax aaxVar, int i2) {
        q(aaxVar, i2, -1, null, 0, -9223372036854775807L, -9223372036854775807L);
    }

    public final void g(aax aaxVar, abc abcVar) {
        for (abn abnVar : this.f19083c) {
            amn.ao(abnVar.f19079a, new abj(this, abnVar.f19080b, aaxVar, abcVar));
        }
    }

    public final void h(aax aaxVar, int i2, IOException iOException, boolean z) {
        r(aaxVar, i2, -1, null, 0, -9223372036854775807L, -9223372036854775807L, iOException, z);
    }

    public final void i(final aax aaxVar, final abc abcVar, final IOException iOException, final boolean z) {
        for (abn abnVar : this.f19083c) {
            final abp abpVar = abnVar.f19080b;
            amn.ao(abnVar.f19079a, new Runnable() { // from class: com.google.ads.interactivemedia.v3.internal.abk
                @Override // java.lang.Runnable
                public final void run() {
                    abo aboVar = this.f19066a;
                    abpVar.ag(aboVar.f19081a, aboVar.f19082b, aaxVar, abcVar, iOException, z);
                }
            });
        }
    }

    public final void j(aax aaxVar, int i2) {
        s(aaxVar, i2, -1, null, 0, -9223372036854775807L, -9223372036854775807L);
    }

    public final void k(aax aaxVar, abc abcVar) {
        for (abn abnVar : this.f19083c) {
            amn.ao(abnVar.f19079a, new abj(this, abnVar.f19080b, aaxVar, abcVar, 2));
        }
    }

    public final void l(abp abpVar) {
        for (abn abnVar : this.f19083c) {
            if (abnVar.f19080b == abpVar) {
                this.f19083c.remove(abnVar);
            }
        }
    }

    public final void m(final abc abcVar) {
        final abg abgVar = this.f19082b;
        ajr.b(abgVar);
        for (abn abnVar : this.f19083c) {
            final abp abpVar = abnVar.f19080b;
            amn.ao(abnVar.f19079a, new Runnable() { // from class: com.google.ads.interactivemedia.v3.internal.abm
                @Override // java.lang.Runnable
                public final void run() {
                    abo aboVar = this.f19075a;
                    abpVar.ak(aboVar.f19081a, abgVar, abcVar);
                }
            });
        }
    }

    public final void n(int i2, long j2, long j3) {
        m(new abc(1, i2, null, 3, t(j2), t(j3)));
    }

    public final void o(int i2, ke keVar, int i3, long j2) {
        c(new abc(1, i2, keVar, i3, t(j2), -9223372036854775807L));
    }

    public final void p(aax aaxVar, int i2, int i3, ke keVar, int i4, long j2, long j3) {
        e(aaxVar, new abc(i2, i3, keVar, i4, t(j2), t(j3)));
    }

    public final void q(aax aaxVar, int i2, int i3, ke keVar, int i4, long j2, long j3) {
        g(aaxVar, new abc(i2, i3, keVar, i4, t(j2), t(j3)));
    }

    public final void r(aax aaxVar, int i2, int i3, ke keVar, int i4, long j2, long j3, IOException iOException, boolean z) {
        i(aaxVar, new abc(i2, i3, keVar, i4, t(j2), t(j3)), iOException, z);
    }

    public final void s(aax aaxVar, int i2, int i3, ke keVar, int i4, long j2, long j3) {
        k(aaxVar, new abc(i2, i3, keVar, i4, t(j2), t(j3)));
    }
}
