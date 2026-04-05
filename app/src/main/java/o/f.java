package o;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import o.c;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c.a f31242a = new f();

    public class a implements c<Object, b<?>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Type f31243a;

        public a(Type type) {
            this.f31243a = type;
        }

        @Override // o.c
        public Type a() {
            return this.f31243a;
        }

        @Override // o.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public b<Object> b(b<Object> bVar) {
            return bVar;
        }
    }

    @Override // o.c.a
    public c<?, ?> a(Type type, Annotation[] annotationArr, m mVar) {
        if (c.a.b(type) != b.class) {
            return null;
        }
        return new a(o.g(type));
    }
}
