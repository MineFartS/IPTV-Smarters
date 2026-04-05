package com.google.ads.interactivemedia.v3.internal;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class ps extends ov {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f22774d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f22775e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f22776f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f22777g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private byte[] f22778h = amn.f20140f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f22779i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f22780j;

    @Override // com.google.ads.interactivemedia.v3.internal.ov, com.google.ads.interactivemedia.v3.internal.nz
    public final ByteBuffer b() {
        int i2;
        if (super.h() && (i2 = this.f22779i) > 0) {
            j(i2).put(this.f22778h, 0, this.f22779i).flip();
            this.f22779i = 0;
        }
        return super.b();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nz
    public final void e(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i2 = iLimit - iPosition;
        if (i2 == 0) {
            return;
        }
        int iMin = Math.min(i2, this.f22777g);
        this.f22780j += (long) (iMin / this.f22651b.f22576e);
        this.f22777g -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f22777g > 0) {
            return;
        }
        int i3 = i2 - iMin;
        int length = (this.f22779i + i3) - this.f22778h.length;
        ByteBuffer byteBufferJ = j(length);
        int iC = amn.c(length, 0, this.f22779i);
        byteBufferJ.put(this.f22778h, 0, iC);
        int iC2 = amn.c(length - iC, 0, i3);
        byteBuffer.limit(byteBuffer.position() + iC2);
        byteBufferJ.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i4 = i3 - iC2;
        int i5 = this.f22779i - iC;
        this.f22779i = i5;
        byte[] bArr = this.f22778h;
        System.arraycopy(bArr, iC, bArr, 0, i5);
        byteBuffer.get(this.f22778h, this.f22779i, i4);
        this.f22779i += i4;
        byteBufferJ.flip();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ov, com.google.ads.interactivemedia.v3.internal.nz
    public final boolean h() {
        return super.h() && this.f22779i == 0;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ov
    public final nx i(nx nxVar) throws ny {
        if (nxVar.f22575d != 2) {
            throw new ny(nxVar);
        }
        this.f22776f = true;
        return (this.f22774d == 0 && this.f22775e == 0) ? nx.f22572a : nxVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ov
    public final void k() {
        if (this.f22776f) {
            this.f22776f = false;
            int i2 = this.f22775e;
            int i3 = this.f22651b.f22576e;
            this.f22778h = new byte[i2 * i3];
            this.f22777g = this.f22774d * i3;
        }
        this.f22779i = 0;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ov
    public final void l() {
        if (this.f22776f) {
            int i2 = this.f22779i;
            if (i2 > 0) {
                this.f22780j += (long) (i2 / this.f22651b.f22576e);
            }
            this.f22779i = 0;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ov
    public final void m() {
        this.f22778h = amn.f20140f;
    }

    public final long o() {
        return this.f22780j;
    }

    public final void p() {
        this.f22780j = 0L;
    }

    public final void q(int i2, int i3) {
        this.f22774d = i2;
        this.f22775e = i3;
    }
}
