package com.google.ads.interactivemedia.v3.internal;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* JADX INFO: loaded from: classes.dex */
public final class yk implements yi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f23795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private MediaCodecInfo[] f23796b;

    public yk(boolean z, boolean z2) {
        int i2 = 1;
        if (!z && !z2) {
            i2 = 0;
        }
        this.f23795a = i2;
    }

    private final void f() {
        if (this.f23796b == null) {
            this.f23796b = new MediaCodecList(this.f23795a).getCodecInfos();
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.yi
    public final int a() {
        f();
        return this.f23796b.length;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.yi
    public final MediaCodecInfo b(int i2) {
        f();
        return this.f23796b[i2];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.yi
    public final boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.yi
    public final boolean d() {
        return true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.yi
    public final boolean e(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }
}
