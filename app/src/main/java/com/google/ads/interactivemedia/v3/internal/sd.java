package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class sd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final sd f22934a = new sd(0, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f22935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f22936c;

    public sd(long j2, long j3) {
        this.f22935b = j2;
        this.f22936c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && sd.class == obj.getClass()) {
            sd sdVar = (sd) obj;
            if (this.f22935b == sdVar.f22935b && this.f22936c == sdVar.f22936c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f22935b) * 31) + ((int) this.f22936c);
    }

    public final String toString() {
        long j2 = this.f22935b;
        long j3 = this.f22936c;
        StringBuilder sb = new StringBuilder(60);
        sb.append("[timeUs=");
        sb.append(j2);
        sb.append(", position=");
        sb.append(j3);
        sb.append("]");
        return sb.toString();
    }
}
