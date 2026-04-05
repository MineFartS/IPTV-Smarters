package c.f.b.g;

import c.f.b.a.k;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes.dex */
public abstract class a<T> {
    public final Type a() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        k.g(genericSuperclass instanceof ParameterizedType, "%s isn't parameterized", genericSuperclass);
        return ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
    }
}
