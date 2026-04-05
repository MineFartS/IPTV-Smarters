package c.f.a.b.t2;

import c.f.a.b.j3.x0;
import c.f.a.b.t2.s;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class k0 extends a0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f10087i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f10088j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final short f10089k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f10090l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f10091m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public byte[] f10092n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public byte[] f10093o;
    public int p;
    public int q;
    public int r;
    public boolean s;
    public long t;

    public k0() {
        this(150000L, 20000L, (short) 1024);
    }

    public k0(long j2, long j3, short s) {
        c.f.a.b.j3.g.a(j3 <= j2);
        this.f10087i = j2;
        this.f10088j = j3;
        this.f10089k = s;
        byte[] bArr = x0.f9301f;
        this.f10092n = bArr;
        this.f10093o = bArr;
    }

    @Override // c.f.a.b.t2.s
    public void c(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !f()) {
            int i2 = this.p;
            if (i2 == 0) {
                s(byteBuffer);
            } else if (i2 == 1) {
                r(byteBuffer);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException();
                }
                t(byteBuffer);
            }
        }
    }

    @Override // c.f.a.b.t2.a0
    public s.a g(s.a aVar) throws s.b {
        if (aVar.f10174d == 2) {
            return this.f10091m ? aVar : s.a.f10171a;
        }
        throw new s.b(aVar);
    }

    @Override // c.f.a.b.t2.a0
    public void h() {
        if (this.f10091m) {
            this.f10090l = this.f9989b.f10175e;
            int iL = l(this.f10087i) * this.f10090l;
            if (this.f10092n.length != iL) {
                this.f10092n = new byte[iL];
            }
            int iL2 = l(this.f10088j) * this.f10090l;
            this.r = iL2;
            if (this.f10093o.length != iL2) {
                this.f10093o = new byte[iL2];
            }
        }
        this.p = 0;
        this.t = 0L;
        this.q = 0;
        this.s = false;
    }

    @Override // c.f.a.b.t2.a0
    public void i() {
        int i2 = this.q;
        if (i2 > 0) {
            q(this.f10092n, i2);
        }
        if (this.s) {
            return;
        }
        this.t += (long) (this.r / this.f10090l);
    }

    @Override // c.f.a.b.t2.a0, c.f.a.b.t2.s
    public boolean isActive() {
        return this.f10091m;
    }

    @Override // c.f.a.b.t2.a0
    public void j() {
        this.f10091m = false;
        this.r = 0;
        byte[] bArr = x0.f9301f;
        this.f10092n = bArr;
        this.f10093o = bArr;
    }

    public final int l(long j2) {
        return (int) ((j2 * ((long) this.f9989b.f10172b)) / 1000000);
    }

    public final int m(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        do {
            iLimit -= 2;
            if (iLimit < byteBuffer.position()) {
                return byteBuffer.position();
            }
        } while (Math.abs((int) byteBuffer.getShort(iLimit)) <= this.f10089k);
        int i2 = this.f10090l;
        return ((iLimit / i2) * i2) + i2;
    }

    public final int n(ByteBuffer byteBuffer) {
        for (int iPosition = byteBuffer.position(); iPosition < byteBuffer.limit(); iPosition += 2) {
            if (Math.abs((int) byteBuffer.getShort(iPosition)) > this.f10089k) {
                int i2 = this.f10090l;
                return i2 * (iPosition / i2);
            }
        }
        return byteBuffer.limit();
    }

    public long o() {
        return this.t;
    }

    public final void p(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        k(iRemaining).put(byteBuffer).flip();
        if (iRemaining > 0) {
            this.s = true;
        }
    }

    public final void q(byte[] bArr, int i2) {
        k(i2).put(bArr, 0, i2).flip();
        if (i2 > 0) {
            this.s = true;
        }
    }

    public final void r(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        int iN = n(byteBuffer);
        int iPosition = iN - byteBuffer.position();
        byte[] bArr = this.f10092n;
        int length = bArr.length;
        int i2 = this.q;
        int i3 = length - i2;
        if (iN < iLimit && iPosition < i3) {
            q(bArr, i2);
            this.q = 0;
            this.p = 0;
            return;
        }
        int iMin = Math.min(iPosition, i3);
        byteBuffer.limit(byteBuffer.position() + iMin);
        byteBuffer.get(this.f10092n, this.q, iMin);
        int i4 = this.q + iMin;
        this.q = i4;
        byte[] bArr2 = this.f10092n;
        if (i4 == bArr2.length) {
            if (this.s) {
                q(bArr2, this.r);
                this.t += (long) ((this.q - (this.r * 2)) / this.f10090l);
            } else {
                this.t += (long) ((i4 - this.r) / this.f10090l);
            }
            v(byteBuffer, this.f10092n, this.q);
            this.q = 0;
            this.p = 2;
        }
        byteBuffer.limit(iLimit);
    }

    public final void s(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + this.f10092n.length));
        int iM = m(byteBuffer);
        if (iM == byteBuffer.position()) {
            this.p = 1;
        } else {
            byteBuffer.limit(iM);
            p(byteBuffer);
        }
        byteBuffer.limit(iLimit);
    }

    public final void t(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        int iN = n(byteBuffer);
        byteBuffer.limit(iN);
        this.t += (long) (byteBuffer.remaining() / this.f10090l);
        v(byteBuffer, this.f10093o, this.r);
        if (iN < iLimit) {
            q(this.f10093o, this.r);
            this.p = 0;
            byteBuffer.limit(iLimit);
        }
    }

    public void u(boolean z) {
        this.f10091m = z;
    }

    public final void v(ByteBuffer byteBuffer, byte[] bArr, int i2) {
        int iMin = Math.min(byteBuffer.remaining(), this.r);
        int i3 = this.r - iMin;
        System.arraycopy(bArr, i2 - i3, this.f10093o, 0, i3);
        byteBuffer.position(byteBuffer.limit() - iMin);
        byteBuffer.get(this.f10093o, i3, iMin);
    }
}
