package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.os.Looper;
import com.facebook.ads.internal.exoplayer2.drm.DrmInitData;
import com.facebook.ads.redexgen.X.C0;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Bz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@TargetApi(16)
public interface InterfaceC0612Bz<T extends C0> {
    InterfaceC0611By<T> A2Q(Looper looper, DrmInitData drmInitData);

    boolean A3x(DrmInitData drmInitData);

    void ACM(InterfaceC0611By<T> interfaceC0611By);
}
