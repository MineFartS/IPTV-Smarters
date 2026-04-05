package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class abx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f19107b;

    public abx(int i2, boolean z) {
        this.f19106a = i2;
        this.f19107b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && abx.class == obj.getClass()) {
            abx abxVar = (abx) obj;
            if (this.f19106a == abxVar.f19106a && this.f19107b == abxVar.f19107b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f19106a * 31) + (this.f19107b ? 1 : 0);
    }
}
