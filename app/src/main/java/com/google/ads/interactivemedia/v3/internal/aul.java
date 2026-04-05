package com.google.ads.interactivemedia.v3.internal;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class aul extends avt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f20578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f20579b;

    public aul(Object obj) {
        this.f20579b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f20578a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f20578a) {
            throw new NoSuchElementException();
        }
        this.f20578a = true;
        return this.f20579b;
    }
}
