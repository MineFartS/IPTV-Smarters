package c.f.a.c.j.h;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class k8 implements Iterator<Map.Entry> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13400b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f13401c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Iterator<Map.Entry> f13402d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m8 f13403e;

    public /* synthetic */ k8(m8 m8Var, f8 f8Var) {
        this.f13403e = m8Var;
    }

    public final Iterator<Map.Entry> a() {
        if (this.f13402d == null) {
            this.f13402d = this.f13403e.f13436d.entrySet().iterator();
        }
        return this.f13402d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f13400b + 1 >= this.f13403e.f13435c.size()) {
            return !this.f13403e.f13436d.isEmpty() && a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Map.Entry next() {
        this.f13401c = true;
        int i2 = this.f13400b + 1;
        this.f13400b = i2;
        return (Map.Entry) (i2 < this.f13403e.f13435c.size() ? this.f13403e.f13435c.get(this.f13400b) : a().next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f13401c) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f13401c = false;
        this.f13403e.n();
        if (this.f13400b >= this.f13403e.f13435c.size()) {
            a().remove();
            return;
        }
        m8 m8Var = this.f13403e;
        int i2 = this.f13400b;
        this.f13400b = i2 - 1;
        m8Var.l(i2);
    }
}
