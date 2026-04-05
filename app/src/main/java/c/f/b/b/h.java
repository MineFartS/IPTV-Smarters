package c.f.b.b;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
public interface h<K, V> extends Map<K, V> {
    h<V, K> B();

    @CanIgnoreReturnValue
    @NullableDecl
    V a(@NullableDecl K k2, @NullableDecl V v);
}
