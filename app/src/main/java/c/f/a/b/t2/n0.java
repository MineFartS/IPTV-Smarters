package c.f.a.b.t2;

import c.f.a.b.j3.x0;
import c.f.a.b.t2.s;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class n0 extends a0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f10141i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f10142j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f10143k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f10144l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public byte[] f10145m = x0.f9301f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f10146n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f10147o;

    @Override // c.f.a.b.t2.a0, c.f.a.b.t2.s
    public ByteBuffer a() {
        int i2;
        if (super.b() && (i2 = this.f10146n) > 0) {
            k(i2).put(this.f10145m, 0, this.f10146n).flip();
            this.f10146n = 0;
        }
        return super.a();
    }

    @Override // c.f.a.b.t2.a0, c.f.a.b.t2.s
    public boolean b() {
        return super.b() && this.f10146n == 0;
    }

    @Override // c.f.a.b.t2.s
    public void c(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i2 = iLimit - iPosition;
        if (i2 == 0) {
            return;
        }
        int iMin = Math.min(i2, this.f10144l);
        this.f10147o += (long) (iMin / this.f9989b.f10175e);
        this.f10144l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f10144l > 0) {
            return;
        }
        int i3 = i2 - iMin;
        int length = (this.f10146n + i3) - this.f10145m.length;
        ByteBuffer byteBufferK = k(length);
        int iR = x0.r(length, 0, this.f10146n);
        byteBufferK.put(this.f10145m, 0, iR);
        int iR2 = x0.r(length - iR, 0, i3);
        byteBuffer.limit(byteBuffer.position() + iR2);
        byteBufferK.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i4 = i3 - iR2;
        int i5 = this.f10146n - iR;
        this.f10146n = i5;
        byte[] bArr = this.f10145m;
        System.arraycopy(bArr, iR, bArr, 0, i5);
        byteBuffer.get(this.f10145m, this.f10146n, i4);
        this.f10146n += i4;
        byteBufferK.flip();
    }

    @Override // c.f.a.b.t2.a0
    public s.a g(s.a aVar) throws s.b {
        if (aVar.f10174d != 2) {
            throw new s.b(aVar);
        }
        this.f10143k = true;
        return (this.f10141i == 0 && this.f10142j == 0) ? s.a.f10171a : aVar;
    }

    @Override // c.f.a.b.t2.a0
    public void h() {
        if (this.f10143k) {
            this.f10143k = false;
            int i2 = this.f10142j;
            int i3 = this.f9989b.f10175e;
            this.f10145m = new byte[i2 * i3];
            this.f10144l = this.f10141i * i3;
        }
        this.f10146n = 0;
    }

    @Override // c.f.a.b.t2.a0
    public void i() {
        if (this.f10143k) {
            int i2 = this.f10146n;
            if (i2 > 0) {
                this.f10147o += (long) (i2 / this.f9989b.f10175e);
            }
            this.f10146n = 0;
        }
    }

    @Override // c.f.a.b.t2.a0
    public void j() {
        this.f10145m = x0.f9301f;
    }

    public long l() {
        return this.f10147o;
    }

    public void m() {
        this.f10147o = 0L;
    }

    public void n(int i2, int i3) {
        this.f10141i = i2;
        this.f10142j = i3;
    }
}
