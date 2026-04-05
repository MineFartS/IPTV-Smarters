package com.google.ads.interactivemedia.v3.internal;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class bjw implements bjz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bkd f21255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f21256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f21257c;

    public bjw() {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public bjw(bkd bkdVar) {
        this();
        this.f21255a = bkdVar;
        this.f21256b = 0;
        this.f21257c = bkdVar.d();
    }

    public final byte a() {
        int i2 = this.f21256b;
        if (i2 >= this.f21257c) {
            throw new NoSuchElementException();
        }
        this.f21256b = i2 + 1;
        return this.f21255a.b(i2);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f21256b < this.f21257c;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Byte next() {
        return Byte.valueOf(a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
