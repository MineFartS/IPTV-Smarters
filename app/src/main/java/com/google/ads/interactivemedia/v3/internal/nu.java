package com.google.ads.interactivemedia.v3.internal;

import android.media.AudioAttributes;

/* JADX INFO: loaded from: classes.dex */
public final class nu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nu f22565a = pn.b(1, 1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22566b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f22567c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f22568d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AudioAttributes f22569e;

    public /* synthetic */ nu(int i2, int i3) {
    }

    public final AudioAttributes a() {
        if (this.f22569e == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1);
            if (amn.f20135a >= 29) {
                usage.setAllowedCapturePolicy(1);
            }
            this.f22569e = usage.build();
        }
        return this.f22569e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || nu.class != obj.getClass()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 15699889;
    }
}
