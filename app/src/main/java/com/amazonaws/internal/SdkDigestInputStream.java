package com.amazonaws.internal;

import java.io.IOException;
import java.io.InputStream;
import java.security.DigestInputStream;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public class SdkDigestInputStream extends DigestInputStream implements MetricAware {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int SKIP_BUF_SIZE = 2048;

    public SdkDigestInputStream(InputStream inputStream, MessageDigest messageDigest) {
        super(inputStream, messageDigest);
    }

    @Override // com.amazonaws.internal.MetricAware
    @Deprecated
    public final boolean isMetricActivated() {
        if (((DigestInputStream) this).in instanceof MetricAware) {
            return ((MetricAware) ((DigestInputStream) this).in).isMetricActivated();
        }
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j2) throws IOException {
        if (j2 <= 0) {
            return j2;
        }
        int iMin = (int) Math.min(2048L, j2);
        byte[] bArr = new byte[iMin];
        long j3 = j2;
        while (j3 > 0) {
            int i2 = read(bArr, 0, (int) Math.min(j3, iMin));
            if (i2 == -1) {
                if (j3 == j2) {
                    return -1L;
                }
                return j2 - j3;
            }
            j3 -= (long) i2;
        }
        return j2;
    }
}
