package com.google.ads.interactivemedia.v3.internal;

import android.util.Log;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class xt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f23751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f23752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f23753c;

    public final long a(ke keVar, pz pzVar) {
        if (this.f23753c) {
            return pzVar.f22803d;
        }
        ByteBuffer byteBuffer = pzVar.f22801b;
        ajr.b(byteBuffer);
        int i2 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            i2 = (i2 << 8) | (byteBuffer.get(i3) & 255);
        }
        int iC = pm.c(i2);
        if (iC == -1) {
            this.f23753c = true;
            Log.w("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
            return pzVar.f22803d;
        }
        long j2 = this.f23751a;
        if (j2 != 0) {
            long j3 = (1000000 * j2) / ((long) keVar.z);
            this.f23751a = j2 + ((long) iC);
            return this.f23752b + j3;
        }
        long j4 = pzVar.f22803d;
        this.f23752b = j4;
        this.f23751a = ((long) iC) - 529;
        return j4;
    }

    public final void b() {
        this.f23751a = 0L;
        this.f23752b = 0L;
        this.f23753c = false;
    }
}
