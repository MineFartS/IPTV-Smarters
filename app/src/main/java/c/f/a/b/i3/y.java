package c.f.a.b.i3;

import c.f.a.b.i3.c0;
import c.f.a.b.i3.f0;
import c.f.a.b.i3.g0;
import c.f.a.b.w1;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class y implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9142a;

    public y() {
        this(-1);
    }

    public y(int i2) {
        this.f9142a = i2;
    }

    @Override // c.f.a.b.i3.f0
    public long a(f0.c cVar) {
        IOException iOException = cVar.f8868c;
        if ((iOException instanceof w1) || (iOException instanceof FileNotFoundException) || (iOException instanceof c0.a) || (iOException instanceof g0.h)) {
            return -9223372036854775807L;
        }
        return Math.min((cVar.f8869d - 1) * 1000, 5000);
    }

    @Override // c.f.a.b.i3.f0
    public f0.b b(f0.a aVar, f0.c cVar) {
        if (!e(cVar.f8868c)) {
            return null;
        }
        if (aVar.a(1)) {
            return new f0.b(1, 300000L);
        }
        if (aVar.a(2)) {
            return new f0.b(2, 60000L);
        }
        return null;
    }

    @Override // c.f.a.b.i3.f0
    public /* synthetic */ void c(long j2) {
        e0.a(this, j2);
    }

    @Override // c.f.a.b.i3.f0
    public int d(int i2) {
        int i3 = this.f9142a;
        return i3 == -1 ? i2 == 7 ? 6 : 3 : i3;
    }

    public boolean e(IOException iOException) {
        if (!(iOException instanceof c0.e)) {
            return false;
        }
        int i2 = ((c0.e) iOException).f8849e;
        return i2 == 403 || i2 == 404 || i2 == 410 || i2 == 416 || i2 == 500 || i2 == 503;
    }
}
