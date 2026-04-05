package c.f.a.c.j.c;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
public abstract class d1<T> implements Serializable {
    public static <T> d1<T> a(@NullableDecl T t) {
        return t == null ? y0.f13138b : new f1(t);
    }

    @NullableDecl
    public abstract T b();
}
