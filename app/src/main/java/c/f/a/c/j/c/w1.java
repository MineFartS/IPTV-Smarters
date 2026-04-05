package c.f.a.c.j.c;

import java.util.AbstractMap;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX INFO: loaded from: classes2.dex */
public final class w1<K, V> extends k1<Map.Entry<K, V>> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t1 f13123d;

    public w1(t1 t1Var) {
        this.f13123d = t1Var;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i2) {
        c1.c(i2, this.f13123d.f13083g);
        int i3 = i2 * 2;
        return new AbstractMap.SimpleImmutableEntry(this.f13123d.f13081e[i3], this.f13123d.f13081e[i3 + 1]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f13123d.f13083g;
    }
}
