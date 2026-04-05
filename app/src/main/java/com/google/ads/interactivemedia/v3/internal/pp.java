package com.google.ads.interactivemedia.v3.internal;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class pp extends ov {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f22736d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f22737e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private byte[] f22738f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private byte[] f22739g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f22740h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f22741i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f22742j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f22743k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f22744l;

    public pp() {
        ajr.d(true);
        byte[] bArr = amn.f20140f;
        this.f22738f = bArr;
        this.f22739g = bArr;
    }

    private final int q(long j2) {
        return (int) ((j2 * ((long) this.f22651b.f22573b)) / 1000000);
    }

    private final int r(ByteBuffer byteBuffer) {
        for (int iPosition = byteBuffer.position(); iPosition < byteBuffer.limit(); iPosition += 2) {
            if (Math.abs((int) byteBuffer.getShort(iPosition)) > 1024) {
                int i2 = this.f22736d;
                return i2 * (iPosition / i2);
            }
        }
        return byteBuffer.limit();
    }

    private final void s(byte[] bArr, int i2) {
        j(i2).put(bArr, 0, i2).flip();
        if (i2 > 0) {
            this.f22743k = true;
        }
    }

    private final void t(ByteBuffer byteBuffer, byte[] bArr, int i2) {
        int iMin = Math.min(byteBuffer.remaining(), this.f22742j);
        int i3 = this.f22742j - iMin;
        System.arraycopy(bArr, i2 - i3, this.f22739g, 0, i3);
        byteBuffer.position(byteBuffer.limit() - iMin);
        byteBuffer.get(this.f22739g, i3, iMin);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nz
    public final void e(ByteBuffer byteBuffer) {
        int iLimit;
        int iPosition;
        while (byteBuffer.hasRemaining() && !n()) {
            int i2 = this.f22740h;
            int i3 = 1;
            if (i2 == 0) {
                iLimit = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + this.f22738f.length));
                int iLimit2 = byteBuffer.limit();
                while (true) {
                    iLimit2 -= 2;
                    if (iLimit2 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    } else if (Math.abs((int) byteBuffer.getShort(iLimit2)) > 1024) {
                        int i4 = this.f22736d;
                        iPosition = ((iLimit2 / i4) * i4) + i4;
                        break;
                    }
                }
                if (iPosition == byteBuffer.position()) {
                    this.f22740h = i3;
                } else {
                    byteBuffer.limit(iPosition);
                    int iRemaining = byteBuffer.remaining();
                    j(iRemaining).put(byteBuffer).flip();
                    if (iRemaining > 0) {
                        this.f22743k = true;
                    }
                }
                byteBuffer.limit(iLimit);
            } else if (i2 != 1) {
                iLimit = byteBuffer.limit();
                int iR = r(byteBuffer);
                byteBuffer.limit(iR);
                this.f22744l += (long) (byteBuffer.remaining() / this.f22736d);
                t(byteBuffer, this.f22739g, this.f22742j);
                if (iR < iLimit) {
                    s(this.f22739g, this.f22742j);
                    this.f22740h = 0;
                    byteBuffer.limit(iLimit);
                }
            } else {
                iLimit = byteBuffer.limit();
                int iR2 = r(byteBuffer);
                int iPosition2 = iR2 - byteBuffer.position();
                byte[] bArr = this.f22738f;
                int length = bArr.length;
                int i5 = this.f22741i;
                int i6 = length - i5;
                if (iR2 >= iLimit || iPosition2 >= i6) {
                    int iMin = Math.min(iPosition2, i6);
                    byteBuffer.limit(byteBuffer.position() + iMin);
                    byteBuffer.get(this.f22738f, this.f22741i, iMin);
                    int i7 = this.f22741i + iMin;
                    this.f22741i = i7;
                    byte[] bArr2 = this.f22738f;
                    if (i7 == bArr2.length) {
                        if (this.f22743k) {
                            s(bArr2, this.f22742j);
                            long j2 = this.f22744l;
                            int i8 = this.f22741i;
                            int i9 = this.f22742j;
                            this.f22744l = j2 + ((long) ((i8 - (i9 + i9)) / this.f22736d));
                            i7 = i8;
                        } else {
                            this.f22744l += (long) ((i7 - this.f22742j) / this.f22736d);
                        }
                        t(byteBuffer, this.f22738f, i7);
                        this.f22741i = 0;
                        i3 = 2;
                        this.f22740h = i3;
                    }
                    byteBuffer.limit(iLimit);
                } else {
                    s(bArr, i5);
                    this.f22741i = 0;
                    this.f22740h = 0;
                }
            }
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ov, com.google.ads.interactivemedia.v3.internal.nz
    public final boolean g() {
        return this.f22737e;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ov
    public final nx i(nx nxVar) throws ny {
        if (nxVar.f22575d == 2) {
            return this.f22737e ? nxVar : nx.f22572a;
        }
        throw new ny(nxVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ov
    public final void k() {
        if (this.f22737e) {
            this.f22736d = this.f22651b.f22576e;
            int iQ = q(150000L) * this.f22736d;
            if (this.f22738f.length != iQ) {
                this.f22738f = new byte[iQ];
            }
            int iQ2 = q(20000L) * this.f22736d;
            this.f22742j = iQ2;
            if (this.f22739g.length != iQ2) {
                this.f22739g = new byte[iQ2];
            }
        }
        this.f22740h = 0;
        this.f22744l = 0L;
        this.f22741i = 0;
        this.f22743k = false;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ov
    public final void l() {
        int i2 = this.f22741i;
        if (i2 > 0) {
            s(this.f22738f, i2);
        }
        if (this.f22743k) {
            return;
        }
        this.f22744l += (long) (this.f22742j / this.f22736d);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ov
    public final void m() {
        this.f22737e = false;
        this.f22742j = 0;
        byte[] bArr = amn.f20140f;
        this.f22738f = bArr;
        this.f22739g = bArr;
    }

    public final long o() {
        return this.f22744l;
    }

    public final void p(boolean z) {
        this.f22737e = z;
    }
}
