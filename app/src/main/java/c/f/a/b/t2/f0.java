package c.f.a.b.t2;

import c.f.a.b.j3.x0;
import c.f.a.b.t2.s;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class f0 extends a0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f10057i = Float.floatToIntBits(Float.NaN);

    public static void l(int i2, ByteBuffer byteBuffer) {
        double d2 = i2;
        Double.isNaN(d2);
        int iFloatToIntBits = Float.floatToIntBits((float) (d2 * 4.656612875245797E-10d));
        if (iFloatToIntBits == f10057i) {
            iFloatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }

    @Override // c.f.a.b.t2.s
    public void c(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferK;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i2 = iLimit - iPosition;
        int i3 = this.f9989b.f10174d;
        if (i3 == 536870912) {
            byteBufferK = k((i2 / 3) * 4);
            while (iPosition < iLimit) {
                l(((byteBuffer.get(iPosition) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition + 2) & 255) << 24), byteBufferK);
                iPosition += 3;
            }
        } else {
            if (i3 != 805306368) {
                throw new IllegalStateException();
            }
            byteBufferK = k(i2);
            while (iPosition < iLimit) {
                l((byteBuffer.get(iPosition) & 255) | ((byteBuffer.get(iPosition + 1) & 255) << 8) | ((byteBuffer.get(iPosition + 2) & 255) << 16) | ((byteBuffer.get(iPosition + 3) & 255) << 24), byteBufferK);
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferK.flip();
    }

    @Override // c.f.a.b.t2.a0
    public s.a g(s.a aVar) throws s.b {
        int i2 = aVar.f10174d;
        if (x0.q0(i2)) {
            return i2 != 4 ? new s.a(aVar.f10172b, aVar.f10173c, 4) : s.a.f10171a;
        }
        throw new s.b(aVar);
    }
}
