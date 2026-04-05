package c.f.a.c.j.c;

import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
public final class u1<K, V> extends o1<K, V> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final o1<Object, Object> f13091f = new u1(null, new Object[0], 0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final transient Object[] f13093h;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient Object f13092g = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final transient int f13094i = 0;

    public u1(Object obj, Object[] objArr, int i2) {
        this.f13093h = objArr;
    }

    @Override // c.f.a.c.j.c.o1
    public final s1<Map.Entry<K, V>> c() {
        return new t1(this, this.f13093h, 0, 0);
    }

    @Override // c.f.a.c.j.c.o1
    public final s1<K> d() {
        return new v1(this, new y1(this.f13093h, 0, 0));
    }

    @Override // c.f.a.c.j.c.o1
    public final j1<V> e() {
        return new y1(this.f13093h, 1, 0);
    }

    @Override // c.f.a.c.j.c.o1, java.util.Map
    @NullableDecl
    public final V get(@NullableDecl Object obj) {
        return null;
    }

    @Override // java.util.Map
    public final int size() {
        return 0;
    }
}
