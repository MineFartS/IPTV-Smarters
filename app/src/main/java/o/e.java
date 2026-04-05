package o;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import k.b0;
import k.d0;

/* JADX INFO: loaded from: classes2.dex */
public interface e<F, T> {

    /* JADX INFO: loaded from: classes.dex */
    public static abstract class a {
        @Nullable
        public e<?, b0> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, m mVar) {
            return null;
        }

        @Nullable
        public e<d0, ?> b(Type type, Annotation[] annotationArr, m mVar) {
            return null;
        }

        @Nullable
        public e<?, String> c(Type type, Annotation[] annotationArr, m mVar) {
            return null;
        }
    }

    T a(F f2);
}
