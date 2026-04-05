package com.google.ads.interactivemedia.v3.internal;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class po extends ov {
    @Override // com.google.ads.interactivemedia.v3.internal.nz
    public final void e(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i2 = iLimit - iPosition;
        int i3 = this.f22651b.f22575d;
        if (i3 == 3) {
            i2 += i2;
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
                i2 += i2;
            }
        }
        ByteBuffer byteBufferJ = j(i2);
        int i4 = this.f22651b.f22575d;
        if (i4 == 3) {
            while (iPosition < iLimit) {
                byteBufferJ.put((byte) 0);
                byteBufferJ.put((byte) ((byteBuffer.get(iPosition) & 255) - 128));
                iPosition++;
            }
        } else if (i4 == 4) {
            while (iPosition < iLimit) {
                short sA = (short) (amn.a(byteBuffer.getFloat(iPosition), -1.0f, 1.0f) * 32767.0f);
                byteBufferJ.put((byte) (sA & 255));
                byteBufferJ.put((byte) ((sA >> 8) & 255));
                iPosition += 4;
            }
        } else if (i4 == 268435456) {
            while (iPosition < iLimit) {
                byteBufferJ.put(byteBuffer.get(iPosition + 1));
                byteBufferJ.put(byteBuffer.get(iPosition));
                iPosition += 2;
            }
        } else if (i4 == 536870912) {
            while (iPosition < iLimit) {
                byteBufferJ.put(byteBuffer.get(iPosition + 1));
                byteBufferJ.put(byteBuffer.get(iPosition + 2));
                iPosition += 3;
            }
        } else {
            if (i4 != 805306368) {
                throw new IllegalStateException();
            }
            while (iPosition < iLimit) {
                byteBufferJ.put(byteBuffer.get(iPosition + 2));
                byteBufferJ.put(byteBuffer.get(iPosition + 3));
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferJ.flip();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ov
    public final nx i(nx nxVar) throws ny {
        int i2 = nxVar.f22575d;
        if (i2 != 3) {
            if (i2 == 2) {
                return nx.f22572a;
            }
            if (i2 != 268435456 && i2 != 536870912 && i2 != 805306368 && i2 != 4) {
                throw new ny(nxVar);
            }
        }
        return new nx(nxVar.f22573b, nxVar.f22574c, 2);
    }
}
