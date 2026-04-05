package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class le {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final le f22306a = new le(1.0f, 1.0f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f22307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f22308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f22309d;

    public le(float f2, float f3) {
        ajr.d(f2 > 0.0f);
        ajr.d(f3 > 0.0f);
        this.f22307b = f2;
        this.f22308c = f3;
        this.f22309d = Math.round(f2 * 1000.0f);
    }

    public final long a(long j2) {
        return j2 * ((long) this.f22309d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && le.class == obj.getClass()) {
            le leVar = (le) obj;
            if (this.f22307b == leVar.f22307b && this.f22308c == leVar.f22308c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.f22307b) + 527) * 31) + Float.floatToRawIntBits(this.f22308c);
    }

    public final String toString() {
        return amn.B("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f22307b), Float.valueOf(this.f22308c));
    }
}
