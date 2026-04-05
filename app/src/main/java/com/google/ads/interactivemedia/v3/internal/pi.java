package com.google.ads.interactivemedia.v3.internal;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class pi extends ov {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f22709d = Float.floatToIntBits(Float.NaN);

    private static void o(int i2, ByteBuffer byteBuffer) {
        double d2 = i2;
        Double.isNaN(d2);
        int iFloatToIntBits = Float.floatToIntBits((float) (d2 * 4.656612875245797E-10d));
        if (iFloatToIntBits == f22709d) {
            iFloatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nz
    public final void e(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferJ;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i2 = iLimit - iPosition;
        int i3 = this.f22651b.f22575d;
        if (i3 == 536870912) {
            byteBufferJ = j((i2 / 3) * 4);
            while (iPosition < iLimit) {
                o(((byteBuffer.get(iPosition) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition + 2) & 255) << 24), byteBufferJ);
                iPosition += 3;
            }
        } else {
            if (i3 != 805306368) {
                throw new IllegalStateException();
            }
            byteBufferJ = j(i2);
            while (iPosition < iLimit) {
                o((byteBuffer.get(iPosition) & 255) | ((byteBuffer.get(iPosition + 1) & 255) << 8) | ((byteBuffer.get(iPosition + 2) & 255) << 16) | ((byteBuffer.get(iPosition + 3) & 255) << 24), byteBufferJ);
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferJ.flip();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ov
    public final nx i(nx nxVar) throws ny {
        int i2 = nxVar.f22575d;
        if (amn.Q(i2)) {
            return i2 != 4 ? new nx(nxVar.f22573b, nxVar.f22574c, 4) : nx.f22572a;
        }
        throw new ny(nxVar);
    }
}
