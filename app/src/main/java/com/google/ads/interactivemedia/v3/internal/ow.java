package com.google.ads.interactivemedia.v3.internal;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class ow extends ov {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int[] f22658d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int[] f22659e;

    @Override // com.google.ads.interactivemedia.v3.internal.nz
    public final void e(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) ajr.b(this.f22659e);
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferJ = j(((iLimit - iPosition) / this.f22651b.f22576e) * this.f22652c.f22576e);
        while (iPosition < iLimit) {
            for (int i2 : iArr) {
                byteBufferJ.putShort(byteBuffer.getShort(i2 + i2 + iPosition));
            }
            iPosition += this.f22651b.f22576e;
        }
        byteBuffer.position(iLimit);
        byteBufferJ.flip();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ov
    public final nx i(nx nxVar) throws ny {
        int[] iArr = this.f22658d;
        if (iArr == null) {
            return nx.f22572a;
        }
        if (nxVar.f22575d != 2) {
            throw new ny(nxVar);
        }
        boolean z = nxVar.f22574c != iArr.length;
        int i2 = 0;
        while (true) {
            int length = iArr.length;
            if (i2 >= length) {
                return z ? new nx(nxVar.f22573b, length, 2) : nx.f22572a;
            }
            int i3 = iArr[i2];
            if (i3 >= nxVar.f22574c) {
                throw new ny(nxVar);
            }
            z |= i3 != i2;
            i2++;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ov
    public final void k() {
        this.f22659e = this.f22658d;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ov
    public final void m() {
        this.f22659e = null;
        this.f22658d = null;
    }

    public final void o(int[] iArr) {
        this.f22658d = iArr;
    }
}
