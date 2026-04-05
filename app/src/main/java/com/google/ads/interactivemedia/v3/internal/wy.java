package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class wy extends rd {
    public wy(aml amlVar, long j2, long j3) {
        super(new qy(), new wq(amlVar), j2, j2 + 1, 0L, j3, 188L, 1000);
    }

    public wy(aml amlVar, long j2, long j3, int i2, int i3) {
        super(new qy(), new wx(i2, amlVar, 112800), j2, j2 + 1, 0L, j3, 188L, 940);
    }

    public static /* synthetic */ int h(byte[] bArr, int i2) {
        return (bArr[i2 + 3] & 255) | ((bArr[i2] & 255) << 24) | ((bArr[i2 + 1] & 255) << 16) | ((bArr[i2 + 2] & 255) << 8);
    }
}
