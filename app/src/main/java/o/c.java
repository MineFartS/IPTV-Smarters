package o;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface c<R, T> {

    /* JADX INFO: loaded from: classes.dex */
    public static abstract class a {
        public static Class<?> b(Type type) {
            return o.j(type);
        }

        @Nullable
        public abstract c<?, ?> a(Type type, Annotation[] annotationArr, m mVar);
    }

    Type a();

    T b(b<R> bVar);
}
