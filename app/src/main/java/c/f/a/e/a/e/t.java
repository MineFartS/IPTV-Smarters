package c.f.a.e.a.e;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class t extends WeakReference<Throwable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15738a;

    public t(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        this.f15738a = System.identityHashCode(th);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == t.class) {
            if (this == obj) {
                return true;
            }
            t tVar = (t) obj;
            if (this.f15738a == tVar.f15738a && get() == tVar.get()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f15738a;
    }
}
