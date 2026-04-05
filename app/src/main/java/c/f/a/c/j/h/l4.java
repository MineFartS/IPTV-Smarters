package c.f.a.c.j.h;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class l4 extends WeakReference<Throwable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13412a;

    public l4(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        this.f13412a = System.identityHashCode(th);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == l4.class) {
            if (this == obj) {
                return true;
            }
            l4 l4Var = (l4) obj;
            if (this.f13412a == l4Var.f13412a && get() == l4Var.get()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f13412a;
    }
}
