package com.google.ads.interactivemedia.v3.internal;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class asw<T> implements Iterator<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f20484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f20485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f20486d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ata f20487e;

    public /* synthetic */ asw(ata ataVar) {
        this.f20487e = ataVar;
        this.f20484b = ataVar.f20503f;
        this.f20485c = ataVar.d();
    }

    private final void b() {
        if (this.f20487e.f20503f != this.f20484b) {
            throw new ConcurrentModificationException();
        }
    }

    public abstract T a(int i2);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f20485c >= 0;
    }

    @Override // java.util.Iterator
    public final T next() {
        b();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i2 = this.f20485c;
        this.f20486d = i2;
        T tA = a(i2);
        this.f20485c = this.f20487e.e(this.f20485c);
        return tA;
    }

    @Override // java.util.Iterator
    public final void remove() {
        b();
        auv.p(this.f20486d >= 0);
        this.f20484b += 32;
        ata ataVar = this.f20487e;
        ataVar.remove(ataVar.f20500b[this.f20486d]);
        this.f20485c--;
        this.f20486d = -1;
    }
}
