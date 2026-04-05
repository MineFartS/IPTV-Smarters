package c.f.a.c.j.c;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX INFO: loaded from: classes2.dex */
public final class wc<K, V> implements Iterator<Map.Entry<K, V>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Iterator<Map.Entry<K, V>> f13129c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uc f13130d;

    public wc(uc ucVar) {
        this.f13130d = ucVar;
        this.f13128b = ucVar.f13105c.size();
    }

    public /* synthetic */ wc(uc ucVar, tc tcVar) {
        this(ucVar);
    }

    public final Iterator<Map.Entry<K, V>> a() {
        if (this.f13129c == null) {
            this.f13129c = this.f13130d.f13109g.entrySet().iterator();
        }
        return this.f13129c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i2 = this.f13128b;
        return (i2 > 0 && i2 <= this.f13130d.f13105c.size()) || a().hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Map.Entry<K, V> next;
        if (a().hasNext()) {
            next = a().next();
        } else {
            List list = this.f13130d.f13105c;
            int i2 = this.f13128b - 1;
            this.f13128b = i2;
            next = (Map.Entry<K, V>) list.get(i2);
        }
        return next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
