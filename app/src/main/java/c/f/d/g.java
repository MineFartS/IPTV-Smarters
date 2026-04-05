package c.f.d;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends j implements Iterable<j> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<j> f16460b = new ArrayList();

    public void B(j jVar) {
        if (jVar == null) {
            jVar = l.f16461a;
        }
        this.f16460b.add(jVar);
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof g) && ((g) obj).f16460b.equals(this.f16460b));
    }

    public int hashCode() {
        return this.f16460b.hashCode();
    }

    @Override // c.f.d.j
    public String i() {
        if (this.f16460b.size() == 1) {
            return this.f16460b.get(0).i();
        }
        throw new IllegalStateException();
    }

    @Override // java.lang.Iterable
    public Iterator<j> iterator() {
        return this.f16460b.iterator();
    }
}
