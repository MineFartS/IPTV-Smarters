package c.f.a.b.t2;

import c.f.a.b.j3.x0;
import c.f.a.b.t2.s;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class j0 extends a0 {
    @Override // c.f.a.b.t2.s
    public void c(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i2 = iLimit - iPosition;
        int i3 = this.f9989b.f10174d;
        if (i3 == 3) {
            i2 *= 2;
        } else if (i3 == 4) {
            i2 /= 2;
        } else if (i3 != 268435456) {
            if (i3 != 536870912) {
                if (i3 != 805306368) {
                    throw new IllegalStateException();
                }
                i2 /= 2;
            } else {
                i2 /= 3;
                i2 *= 2;
            }
        }
        ByteBuffer byteBufferK = k(i2);
        int i4 = this.f9989b.f10174d;
        if (i4 == 3) {
            while (iPosition < iLimit) {
                byteBufferK.put((byte) 0);
                byteBufferK.put((byte) ((byteBuffer.get(iPosition) & 255) - 128));
                iPosition++;
            }
        } else if (i4 == 4) {
            while (iPosition < iLimit) {
                short sQ = (short) (x0.q(byteBuffer.getFloat(iPosition), -1.0f, 1.0f) * 32767.0f);
                byteBufferK.put((byte) (sQ & 255));
                byteBufferK.put((byte) ((sQ >> 8) & 255));
                iPosition += 4;
            }
        } else if (i4 == 268435456) {
            while (iPosition < iLimit) {
                byteBufferK.put(byteBuffer.get(iPosition + 1));
                byteBufferK.put(byteBuffer.get(iPosition));
                iPosition += 2;
            }
        } else if (i4 == 536870912) {
            while (iPosition < iLimit) {
                byteBufferK.put(byteBuffer.get(iPosition + 1));
                byteBufferK.put(byteBuffer.get(iPosition + 2));
                iPosition += 3;
            }
        } else {
            if (i4 != 805306368) {
                throw new IllegalStateException();
            }
            while (iPosition < iLimit) {
                byteBufferK.put(byteBuffer.get(iPosition + 2));
                byteBufferK.put(byteBuffer.get(iPosition + 3));
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferK.flip();
    }

    @Override // c.f.a.b.t2.a0
    public s.a g(s.a aVar) throws s.b {
        int i2 = aVar.f10174d;
        if (i2 == 3 || i2 == 2 || i2 == 268435456 || i2 == 536870912 || i2 == 805306368 || i2 == 4) {
            return i2 != 2 ? new s.a(aVar.f10172b, aVar.f10173c, 2) : s.a.f10171a;
        }
        throw new s.b(aVar);
    }
}
