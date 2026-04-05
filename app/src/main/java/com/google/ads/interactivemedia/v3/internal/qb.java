package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class qb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22811a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f22813c;

    static {
        new qb(0, 0);
    }

    public qb(int i2, int i3) {
        this.f22812b = i2;
        this.f22813c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qb)) {
            return false;
        }
        qb qbVar = (qb) obj;
        int i2 = qbVar.f22811a;
        return this.f22812b == qbVar.f22812b && this.f22813c == qbVar.f22813c;
    }

    public final int hashCode() {
        return ((this.f22812b + 16337) * 31) + this.f22813c;
    }
}
