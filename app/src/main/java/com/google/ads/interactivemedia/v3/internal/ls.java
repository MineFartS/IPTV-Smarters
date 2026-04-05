package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class ls {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ls f22341a = new ls(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f22342b;

    public ls(boolean z) {
        this.f22342b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && ls.class == obj.getClass() && this.f22342b == ((ls) obj).f22342b;
    }

    public final int hashCode() {
        return this.f22342b ? 0 : 1;
    }
}
