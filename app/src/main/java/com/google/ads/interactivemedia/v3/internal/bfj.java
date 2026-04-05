package com.google.ads.interactivemedia.v3.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class bfj extends bfl implements Iterable<bfl> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<bfl> f21045a = new ArrayList();

    public final void a(bfl bflVar) {
        this.f21045a.add(bflVar);
    }

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof bfj) && ((bfj) obj).f21045a.equals(this.f21045a));
    }

    public final int hashCode() {
        return this.f21045a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator<bfl> iterator() {
        return this.f21045a.iterator();
    }
}
