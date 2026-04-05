package c.f.d.w;

import c.f.d.t;
import c.f.d.u;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements u, Cloneable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f16497b = new d();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f16501f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f16498c = -1.0d;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16499d = 136;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f16500e = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List<c.f.d.a> f16502g = Collections.emptyList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List<c.f.d.a> f16503h = Collections.emptyList();

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class a<T> extends t<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public t<T> f16504a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f16505b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f16506c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ c.f.d.e f16507d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ c.f.d.x.a f16508e;

        public a(boolean z, boolean z2, c.f.d.e eVar, c.f.d.x.a aVar) {
            this.f16505b = z;
            this.f16506c = z2;
            this.f16507d = eVar;
            this.f16508e = aVar;
        }

        @Override // c.f.d.t
        public T b(c.f.d.y.a aVar) throws IOException {
            if (!this.f16505b) {
                return e().b(aVar);
            }
            aVar.L0();
            return null;
        }

        @Override // c.f.d.t
        public void d(c.f.d.y.c cVar, T t) throws IOException {
            if (this.f16506c) {
                cVar.v();
            } else {
                e().d(cVar, t);
            }
        }

        public final t<T> e() {
            t<T> tVar = this.f16504a;
            if (tVar != null) {
                return tVar;
            }
            t<T> tVarN = this.f16507d.n(d.this, this.f16508e);
            this.f16504a = tVarN;
            return tVarN;
        }
    }

    @Override // c.f.d.u
    public <T> t<T> a(c.f.d.e eVar, c.f.d.x.a<T> aVar) {
        Class<? super T> clsC = aVar.c();
        boolean zE = e(clsC);
        boolean z = zE || f(clsC, true);
        boolean z2 = zE || f(clsC, false);
        if (z || z2) {
            return new a(z2, z, eVar, aVar);
        }
        return null;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d clone() {
        try {
            return (d) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public boolean c(Class<?> cls, boolean z) {
        return e(cls) || f(cls, z);
    }

    public final boolean e(Class<?> cls) {
        if (this.f16498c == -1.0d || n((c.f.d.v.d) cls.getAnnotation(c.f.d.v.d.class), (c.f.d.v.e) cls.getAnnotation(c.f.d.v.e.class))) {
            return (!this.f16500e && j(cls)) || h(cls);
        }
        return true;
    }

    public final boolean f(Class<?> cls, boolean z) {
        Iterator<c.f.d.a> it = (z ? this.f16502g : this.f16503h).iterator();
        while (it.hasNext()) {
            if (it.next().b(cls)) {
                return true;
            }
        }
        return false;
    }

    public boolean g(Field field, boolean z) {
        c.f.d.v.a aVar;
        if ((this.f16499d & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.f16498c != -1.0d && !n((c.f.d.v.d) field.getAnnotation(c.f.d.v.d.class), (c.f.d.v.e) field.getAnnotation(c.f.d.v.e.class))) || field.isSynthetic()) {
            return true;
        }
        if (this.f16501f && ((aVar = (c.f.d.v.a) field.getAnnotation(c.f.d.v.a.class)) == null || (!z ? aVar.deserialize() : aVar.serialize()))) {
            return true;
        }
        if ((!this.f16500e && j(field.getType())) || h(field.getType())) {
            return true;
        }
        List<c.f.d.a> list = z ? this.f16502g : this.f16503h;
        if (list.isEmpty()) {
            return false;
        }
        c.f.d.b bVar = new c.f.d.b(field);
        Iterator<c.f.d.a> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().a(bVar)) {
                return true;
            }
        }
        return false;
    }

    public final boolean h(Class<?> cls) {
        return !Enum.class.isAssignableFrom(cls) && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    public final boolean j(Class<?> cls) {
        return cls.isMemberClass() && !k(cls);
    }

    public final boolean k(Class<?> cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    public final boolean l(c.f.d.v.d dVar) {
        return dVar == null || dVar.value() <= this.f16498c;
    }

    public final boolean m(c.f.d.v.e eVar) {
        return eVar == null || eVar.value() > this.f16498c;
    }

    public final boolean n(c.f.d.v.d dVar, c.f.d.v.e eVar) {
        return l(dVar) && m(eVar);
    }
}
