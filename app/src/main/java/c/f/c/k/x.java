package c.f.c.k;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class x<T> implements c.f.c.r.b<Set<T>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Set<T> f16126b = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Set<c.f.c.r.b<T>> f16125a = Collections.newSetFromMap(new ConcurrentHashMap());

    public x(Collection<c.f.c.r.b<T>> collection) {
        this.f16125a.addAll(collection);
    }

    public static x<?> b(Collection<c.f.c.r.b<?>> collection) {
        return new x<>((Set) collection);
    }

    public synchronized void a(c.f.c.r.b<T> bVar) {
        Set set;
        if (this.f16126b == null) {
            set = this.f16125a;
        } else {
            set = this.f16126b;
            bVar = (c.f.c.r.b<T>) bVar.get();
        }
        set.add(bVar);
    }

    @Override // c.f.c.r.b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Set<T> get() {
        if (this.f16126b == null) {
            synchronized (this) {
                if (this.f16126b == null) {
                    this.f16126b = Collections.newSetFromMap(new ConcurrentHashMap());
                    d();
                }
            }
        }
        return Collections.unmodifiableSet(this.f16126b);
    }

    public final synchronized void d() {
        Iterator<c.f.c.r.b<T>> it = this.f16125a.iterator();
        while (it.hasNext()) {
            this.f16126b.add(it.next().get());
        }
        this.f16125a = null;
    }
}
