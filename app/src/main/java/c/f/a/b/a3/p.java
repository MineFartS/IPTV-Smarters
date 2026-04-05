package c.f.a.b.a3;

import c.f.a.b.j3.z;
import c.f.a.b.k1;
import c.f.a.b.t2.h0;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f6467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f6468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f6469c;

    public final long a(k1 k1Var) {
        return (this.f6467a * 1000000) / ((long) k1Var.A);
    }

    public void b() {
        this.f6467a = 0L;
        this.f6468b = 0L;
        this.f6469c = false;
    }

    public long c(k1 k1Var, c.f.a.b.v2.f fVar) {
        if (this.f6469c) {
            return fVar.f10278e;
        }
        ByteBuffer byteBuffer = (ByteBuffer) c.f.a.b.j3.g.e(fVar.f10276c);
        int i2 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            i2 = (i2 << 8) | (byteBuffer.get(i3) & 255);
        }
        int iM = h0.m(i2);
        if (iM == -1) {
            this.f6469c = true;
            z.i("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
            return fVar.f10278e;
        }
        if (this.f6467a != 0) {
            long jA = a(k1Var);
            this.f6467a += (long) iM;
            return this.f6468b + jA;
        }
        long j2 = fVar.f10278e;
        this.f6468b = j2;
        this.f6467a = ((long) iM) - 529;
        return j2;
    }
}
