package com.google.ads.interactivemedia.v3.internal;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* JADX INFO: loaded from: classes.dex */
public final class yj implements yi {
    private yj() {
    }

    public /* synthetic */ yj(byte[] bArr) {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.yi
    public final int a() {
        return MediaCodecList.getCodecCount();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.yi
    public final MediaCodecInfo b(int i2) {
        return MediaCodecList.getCodecInfoAt(i2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.yi
    public final boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.yi
    public final boolean d() {
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.yi
    public final boolean e(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }
}
