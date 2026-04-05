package com.google.ads.interactivemedia.v3.internal;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class bms implements Iterator<Map.Entry> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bmu f21421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f21422b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f21423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Iterator<Map.Entry> f21424d;

    private final Iterator<Map.Entry> a() {
        if (this.f21424d == null) {
            this.f21424d = this.f21421a.f21428c.entrySet().iterator();
        }
        return this.f21424d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f21422b + 1 >= this.f21421a.f21427b.size()) {
            return !this.f21421a.f21428c.isEmpty() && a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Map.Entry next() {
        this.f21423c = true;
        int i2 = this.f21422b + 1;
        this.f21422b = i2;
        return (Map.Entry) (i2 < this.f21421a.f21427b.size() ? this.f21421a.f21427b.get(this.f21422b) : a().next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f21423c) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f21423c = false;
        this.f21421a.o();
        if (this.f21422b >= this.f21421a.f21427b.size()) {
            a().remove();
            return;
        }
        bmu bmuVar = this.f21421a;
        int i2 = this.f21422b;
        this.f21422b = i2 - 1;
        bmuVar.m(i2);
    }
}
