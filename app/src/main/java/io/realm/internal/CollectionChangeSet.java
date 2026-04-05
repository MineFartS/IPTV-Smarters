package io.realm.internal;

import e.a.b;
import e.a.g.c;
import e.a.g.d;

/* JADX INFO: loaded from: classes2.dex */
public class CollectionChangeSet implements b, d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static long f30393b = nativeGetFinalizerPtr();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f30394c;

    public CollectionChangeSet(long j2) {
        this.f30394c = j2;
        c.f30344c.a(this);
    }

    public static native long nativeGetFinalizerPtr();

    @Override // e.a.g.d
    public long getNativeFinalizerPtr() {
        return f30393b;
    }

    @Override // e.a.g.d
    public long getNativePtr() {
        return this.f30394c;
    }
}
