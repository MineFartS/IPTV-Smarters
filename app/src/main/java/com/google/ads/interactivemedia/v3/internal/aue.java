package com.google.ads.interactivemedia.v3.internal;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class aue extends avt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterator<? extends ats> f20567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f20568b = aum.f20580a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ aui f20569c;

    public aue(aui auiVar) {
        this.f20569c = auiVar;
        this.f20567a = ((aty) auiVar.f20574b.values()).iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f20568b.hasNext() || this.f20567a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f20568b.hasNext()) {
            this.f20568b = this.f20567a.next().listIterator();
        }
        return this.f20568b.next();
    }
}
