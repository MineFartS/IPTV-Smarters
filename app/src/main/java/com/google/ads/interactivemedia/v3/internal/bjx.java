package com.google.ads.interactivemedia.v3.internal;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: loaded from: classes.dex */
public final class bjx extends bkb {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f21258c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f21259d;

    public bjx(byte[] bArr, int i2, int i3) {
        super(bArr);
        bkd.l(0, i3, bArr.length);
        this.f21258c = 0;
        this.f21259d = i3;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkb, com.google.ads.interactivemedia.v3.internal.bkd
    public final byte a(int i2) {
        int i3 = this.f21259d;
        if (((i3 - (i2 + 1)) | i2) >= 0) {
            return this.f21260a[i2];
        }
        if (i2 < 0) {
            StringBuilder sb = new StringBuilder(22);
            sb.append("Index < 0: ");
            sb.append(i2);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Index > length: ");
        sb2.append(i2);
        sb2.append(", ");
        sb2.append(i3);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkb, com.google.ads.interactivemedia.v3.internal.bkd
    public final byte b(int i2) {
        return this.f21260a[i2];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkb
    public final int c() {
        return 0;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkb, com.google.ads.interactivemedia.v3.internal.bkd
    public final int d() {
        return this.f21259d;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkb, com.google.ads.interactivemedia.v3.internal.bkd
    public final void e(byte[] bArr, int i2) {
        System.arraycopy(this.f21260a, 0, bArr, 0, i2);
    }

    public Object writeReplace() {
        return bkd.r(t());
    }
}
