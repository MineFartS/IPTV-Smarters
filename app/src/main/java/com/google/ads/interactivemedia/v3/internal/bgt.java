package com.google.ads.interactivemedia.v3.internal;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class bgt<T> implements Iterator<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public bgu f21090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public bgu f21091b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f21092c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bgv f21093d;

    public bgt(bgv bgvVar) {
        this.f21093d = bgvVar;
        this.f21090a = bgvVar.f21107e.f21097d;
        this.f21092c = bgvVar.f21106d;
    }

    public final bgu a() {
        bgu bguVar = this.f21090a;
        bgv bgvVar = this.f21093d;
        if (bguVar == bgvVar.f21107e) {
            throw new NoSuchElementException();
        }
        if (bgvVar.f21106d != this.f21092c) {
            throw new ConcurrentModificationException();
        }
        this.f21090a = bguVar.f21097d;
        this.f21091b = bguVar;
        return bguVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f21090a != this.f21093d.f21107e;
    }

    @Override // java.util.Iterator
    public final void remove() {
        bgu bguVar = this.f21091b;
        if (bguVar == null) {
            throw new IllegalStateException();
        }
        this.f21093d.e(bguVar, true);
        this.f21091b = null;
        this.f21092c = this.f21093d.f21106d;
    }
}
