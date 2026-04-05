package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class ahz implements Comparable<ahz> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f19776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f19777b;

    public ahz(ke keVar, int i2) {
        this.f19776a = 1 == (keVar.f22148d & 1);
        this.f19777b = aig.e(i2, false);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(ahz ahzVar) {
        return ate.j().d(this.f19777b, ahzVar.f19777b).d(this.f19776a, ahzVar.f19776a).a();
    }
}
