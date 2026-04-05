package c.f.d.w.n;

import c.f.d.q;
import c.f.d.t;
import c.f.d.u;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.f.d.w.c f16553b;

    public d(c.f.d.w.c cVar) {
        this.f16553b = cVar;
    }

    @Override // c.f.d.u
    public <T> t<T> a(c.f.d.e eVar, c.f.d.x.a<T> aVar) {
        c.f.d.v.b bVar = (c.f.d.v.b) aVar.c().getAnnotation(c.f.d.v.b.class);
        if (bVar == null) {
            return null;
        }
        return (t<T>) b(this.f16553b, eVar, aVar, bVar);
    }

    public t<?> b(c.f.d.w.c cVar, c.f.d.e eVar, c.f.d.x.a<?> aVar, c.f.d.v.b bVar) {
        t<?> lVar;
        Object objA = cVar.a(c.f.d.x.a.a(bVar.value())).a();
        if (objA instanceof t) {
            lVar = (t) objA;
        } else if (objA instanceof u) {
            lVar = ((u) objA).a(eVar, aVar);
        } else {
            boolean z = objA instanceof q;
            if (!z && !(objA instanceof c.f.d.i)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objA.getClass().getName() + " as a @JsonAdapter for " + aVar.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            lVar = new l<>(z ? (q) objA : null, objA instanceof c.f.d.i ? (c.f.d.i) objA : null, eVar, aVar, null);
        }
        return (lVar == null || !bVar.nullSafe()) ? lVar : lVar.a();
    }
}
