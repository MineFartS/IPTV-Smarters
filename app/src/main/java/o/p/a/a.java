package o.p.a;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import k.b0;
import k.d0;
import o.e;
import o.m;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c.f.d.e f31366a;

    public a(c.f.d.e eVar) {
        this.f31366a = eVar;
    }

    public static a d() {
        return e(new c.f.d.e());
    }

    public static a e(c.f.d.e eVar) {
        if (eVar != null) {
            return new a(eVar);
        }
        throw new NullPointerException("gson == null");
    }

    @Override // o.e.a
    public e<?, b0> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, m mVar) {
        return new b(this.f31366a, this.f31366a.l(c.f.d.x.a.b(type)));
    }

    @Override // o.e.a
    public e<d0, ?> b(Type type, Annotation[] annotationArr, m mVar) {
        return new c(this.f31366a, this.f31366a.l(c.f.d.x.a.b(type)));
    }
}
