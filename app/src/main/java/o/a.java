package o;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import k.b0;
import k.d0;
import o.e;
import o.q.w;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends e.a {

    /* JADX INFO: renamed from: o.a$a, reason: collision with other inner class name */
    public static final class C0320a implements o.e<d0, d0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0320a f31237a = new C0320a();

        @Override // o.e
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public d0 a(d0 d0Var) {
            try {
                return o.a(d0Var);
            } finally {
                d0Var.close();
            }
        }
    }

    public static final class b implements o.e<b0, b0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f31238a = new b();

        @Override // o.e
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b0 a(b0 b0Var) {
            return b0Var;
        }
    }

    public static final class c implements o.e<d0, d0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f31239a = new c();

        @Override // o.e
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public d0 a(d0 d0Var) {
            return d0Var;
        }
    }

    public static final class d implements o.e<Object, String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f31240a = new d();

        @Override // o.e
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public String a(Object obj) {
            return obj.toString();
        }
    }

    public static final class e implements o.e<d0, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f31241a = new e();

        @Override // o.e
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void a(d0 d0Var) {
            d0Var.close();
            return null;
        }
    }

    @Override // o.e.a
    public o.e<?, b0> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, m mVar) {
        if (b0.class.isAssignableFrom(o.j(type))) {
            return b.f31238a;
        }
        return null;
    }

    @Override // o.e.a
    public o.e<d0, ?> b(Type type, Annotation[] annotationArr, m mVar) {
        if (type == d0.class) {
            return o.o(annotationArr, w.class) ? c.f31239a : C0320a.f31237a;
        }
        if (type == Void.class) {
            return e.f31241a;
        }
        return null;
    }
}
