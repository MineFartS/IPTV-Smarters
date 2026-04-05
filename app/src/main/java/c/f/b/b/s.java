package c.f.b.b;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
public class s<K, V> extends e<K, V> implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NullableDecl
    public final K f15953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NullableDecl
    public final V f15954c;

    public s(@NullableDecl K k2, @NullableDecl V v) {
        this.f15953b = k2;
        this.f15954c = v;
    }

    @Override // c.f.b.b.e, java.util.Map.Entry
    @NullableDecl
    public final K getKey() {
        return this.f15953b;
    }

    @Override // c.f.b.b.e, java.util.Map.Entry
    @NullableDecl
    public final V getValue() {
        return this.f15954c;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        throw new UnsupportedOperationException();
    }
}
