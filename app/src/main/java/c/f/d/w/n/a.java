package c.f.d.w.n;

import c.f.d.t;
import c.f.d.u;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class a<E> extends t<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f16545a = new C0204a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class<E> f16546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t<E> f16547c;

    /* JADX INFO: renamed from: c.f.d.w.n.a$a, reason: collision with other inner class name */
    public class C0204a implements u {
        @Override // c.f.d.u
        public <T> t<T> a(c.f.d.e eVar, c.f.d.x.a<T> aVar) {
            Type typeE = aVar.e();
            if (!(typeE instanceof GenericArrayType) && (!(typeE instanceof Class) || !((Class) typeE).isArray())) {
                return null;
            }
            Type typeG = c.f.d.w.b.g(typeE);
            return new a(eVar, eVar.l(c.f.d.x.a.b(typeG)), c.f.d.w.b.k(typeG));
        }
    }

    public a(c.f.d.e eVar, t<E> tVar, Class<E> cls) {
        this.f16547c = new m(eVar, tVar, cls);
        this.f16546b = cls;
    }

    @Override // c.f.d.t
    public Object b(c.f.d.y.a aVar) throws IOException {
        if (aVar.B0() == c.f.d.y.b.NULL) {
            aVar.c0();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.d();
        while (aVar.s()) {
            arrayList.add(this.f16547c.b(aVar));
        }
        aVar.o();
        int size = arrayList.size();
        Object objNewInstance = Array.newInstance((Class<?>) this.f16546b, size);
        for (int i2 = 0; i2 < size; i2++) {
            Array.set(objNewInstance, i2, arrayList.get(i2));
        }
        return objNewInstance;
    }

    @Override // c.f.d.t
    public void d(c.f.d.y.c cVar, Object obj) throws IOException {
        if (obj == null) {
            cVar.v();
            return;
        }
        cVar.l();
        int length = Array.getLength(obj);
        for (int i2 = 0; i2 < length; i2++) {
            this.f16547c.d(cVar, (E) Array.get(obj, i2));
        }
        cVar.o();
    }
}
