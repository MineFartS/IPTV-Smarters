package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class li {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ala f22312a;

    public li(ala alaVar) {
        this.f22312a = alaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof li) {
            return this.f22312a.equals(((li) obj).f22312a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f22312a.hashCode();
    }
}
