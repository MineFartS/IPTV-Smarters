package com.google.ads.interactivemedia.v3.internal;

import android.media.MediaCodec;

/* JADX INFO: loaded from: classes.dex */
public final class pu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediaCodec.CryptoInfo f22782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MediaCodec.CryptoInfo.Pattern f22783b = new MediaCodec.CryptoInfo.Pattern(0, 0);

    public static /* synthetic */ void a(pu puVar, int i2, int i3) {
        puVar.f22783b.set(i2, i3);
        puVar.f22782a.setPattern(puVar.f22783b);
    }
}
