package io.realm.internal;

import e.a.g.c;
import e.a.g.d;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

/* JADX INFO: loaded from: classes2.dex */
public final class NativeObjectReference extends PhantomReference<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static b f30395a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f30396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f30397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f30398d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public NativeObjectReference f30399e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public NativeObjectReference f30400f;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public NativeObjectReference f30401a;

        public b() {
        }

        public synchronized void a(NativeObjectReference nativeObjectReference) {
            nativeObjectReference.f30399e = null;
            nativeObjectReference.f30400f = this.f30401a;
            NativeObjectReference nativeObjectReference2 = this.f30401a;
            if (nativeObjectReference2 != null) {
                nativeObjectReference2.f30399e = nativeObjectReference;
            }
            this.f30401a = nativeObjectReference;
        }

        public synchronized void b(NativeObjectReference nativeObjectReference) {
            NativeObjectReference nativeObjectReference2 = nativeObjectReference.f30400f;
            NativeObjectReference nativeObjectReference3 = nativeObjectReference.f30399e;
            nativeObjectReference.f30400f = null;
            nativeObjectReference.f30399e = null;
            if (nativeObjectReference3 != null) {
                nativeObjectReference3.f30400f = nativeObjectReference2;
            } else {
                this.f30401a = nativeObjectReference2;
            }
            if (nativeObjectReference2 != null) {
                nativeObjectReference2.f30399e = nativeObjectReference3;
            }
        }
    }

    public NativeObjectReference(c cVar, d dVar, ReferenceQueue<? super d> referenceQueue) {
        super(dVar, referenceQueue);
        this.f30396b = dVar.getNativePtr();
        this.f30397c = dVar.getNativeFinalizerPtr();
        this.f30398d = cVar;
        f30395a.a(this);
    }

    public static native void nativeCleanUp(long j2, long j3);

    public void e() {
        synchronized (this.f30398d) {
            nativeCleanUp(this.f30397c, this.f30396b);
        }
        f30395a.b(this);
    }
}
