package c.f.a.c.j.c;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX INFO: loaded from: classes2.dex */
public final class cd<K, V> implements Iterator<Map.Entry<K, V>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f12784c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Iterator<Map.Entry<K, V>> f12785d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uc f12786e;

    public cd(uc ucVar) {
        this.f12786e = ucVar;
        this.f12783b = -1;
    }

    public /* synthetic */ cd(uc ucVar, tc tcVar) {
        this(ucVar);
    }

    public final Iterator<Map.Entry<K, V>> a() {
        if (this.f12785d == null) {
            this.f12785d = this.f12786e.f13106d.entrySet().iterator();
        }
        return this.f12785d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f12783b + 1 < this.f12786e.f13105c.size() || (!this.f12786e.f13106d.isEmpty() && a().hasNext());
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        this.f12784c = true;
        int i2 = this.f12783b + 1;
        this.f12783b = i2;
        return i2 < this.f12786e.f13105c.size() ? (Map.Entry<K, V>) this.f12786e.f13105c.get(this.f12783b) : a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f12784c) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f12784c = false;
        this.f12786e.q();
        if (this.f12783b >= this.f12786e.f13105c.size()) {
            a().remove();
            return;
        }
        uc ucVar = this.f12786e;
        int i2 = this.f12783b;
        this.f12783b = i2 - 1;
        ucVar.j(i2);
    }
}
