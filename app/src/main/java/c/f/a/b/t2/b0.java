package c.f.a.b.t2;

import c.f.a.b.t2.s;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class b0 extends a0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f9998i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f9999j;

    @Override // c.f.a.b.t2.s
    public void c(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) c.f.a.b.j3.g.e(this.f9999j);
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferK = k(((iLimit - iPosition) / this.f9989b.f10175e) * this.f9990c.f10175e);
        while (iPosition < iLimit) {
            for (int i2 : iArr) {
                byteBufferK.putShort(byteBuffer.getShort((i2 * 2) + iPosition));
            }
            iPosition += this.f9989b.f10175e;
        }
        byteBuffer.position(iLimit);
        byteBufferK.flip();
    }

    @Override // c.f.a.b.t2.a0
    public s.a g(s.a aVar) throws s.b {
        int[] iArr = this.f9998i;
        if (iArr == null) {
            return s.a.f10171a;
        }
        if (aVar.f10174d != 2) {
            throw new s.b(aVar);
        }
        boolean z = aVar.f10173c != iArr.length;
        int i2 = 0;
        while (i2 < iArr.length) {
            int i3 = iArr[i2];
            if (i3 >= aVar.f10173c) {
                throw new s.b(aVar);
            }
            z |= i3 != i2;
            i2++;
        }
        return z ? new s.a(aVar.f10172b, iArr.length, 2) : s.a.f10171a;
    }

    @Override // c.f.a.b.t2.a0
    public void h() {
        this.f9999j = this.f9998i;
    }

    @Override // c.f.a.b.t2.a0
    public void j() {
        this.f9999j = null;
        this.f9998i = null;
    }

    public void l(int[] iArr) {
        this.f9998i = iArr;
    }
}
