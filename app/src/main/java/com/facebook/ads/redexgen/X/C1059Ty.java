package com.facebook.ads.redexgen.X;

import android.app.ActivityManager;
import android.os.Build;
import android.support.v4.media.session.PlaybackStateCompat;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ty, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1059Ty implements InterfaceC04806d {
    public final /* synthetic */ U7 A00;

    public C1059Ty(U7 u7) {
        this.A00 = u7;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04806d
    public final AbstractC04956s A51() {
        if (Build.VERSION.SDK_INT < 16) {
            return this.A00.A08(EnumC04916o.A05);
        }
        if (this.A00.A02 != null) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            this.A00.A02.getMemoryInfo(memoryInfo);
            return this.A00.A07(memoryInfo.totalMem / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
        }
        return this.A00.A08(EnumC04916o.A07);
    }
}
