package c.f.a.c.j.f;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class j extends WeakReference<Throwable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13181a;

    public j(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        this.f13181a = System.identityHashCode(th);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == j.class) {
            if (this == obj) {
                return true;
            }
            j jVar = (j) obj;
            if (this.f13181a == jVar.f13181a && get() == jVar.get()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f13181a;
    }
}
