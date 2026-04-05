package c.f.a.c.j.c;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class gb<K> implements Iterator<Map.Entry<K, Object>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator<Map.Entry<K, Object>> f12851b;

    public gb(Iterator<Map.Entry<K, Object>> it) {
        this.f12851b = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f12851b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Map.Entry<K, Object> next = this.f12851b.next();
        return next.getValue() instanceof bb ? new db(next) : next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f12851b.remove();
    }
}
