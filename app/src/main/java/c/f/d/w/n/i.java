package c.f.d.w.n;

import c.f.d.r;
import c.f.d.t;
import c.f.d.u;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class i implements u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.f.d.w.c f16566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.f.d.d f16567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c.f.d.w.d f16568d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f16569e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c.f.d.w.o.b f16570f = c.f.d.w.o.b.a();

    public class a extends c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Field f16571d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f16572e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ t f16573f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ c.f.d.e f16574g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ c.f.d.x.a f16575h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ boolean f16576i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, boolean z, boolean z2, Field field, boolean z3, t tVar, c.f.d.e eVar, c.f.d.x.a aVar, boolean z4) {
            super(str, z, z2);
            this.f16571d = field;
            this.f16572e = z3;
            this.f16573f = tVar;
            this.f16574g = eVar;
            this.f16575h = aVar;
            this.f16576i = z4;
        }

        @Override // c.f.d.w.n.i.c
        public void a(c.f.d.y.a aVar, Object obj) throws IllegalAccessException {
            Object objB = this.f16573f.b(aVar);
            if (objB == null && this.f16576i) {
                return;
            }
            this.f16571d.set(obj, objB);
        }

        @Override // c.f.d.w.n.i.c
        public void b(c.f.d.y.c cVar, Object obj) throws IllegalAccessException {
            (this.f16572e ? this.f16573f : new m(this.f16574g, this.f16573f, this.f16575h.e())).d(cVar, this.f16571d.get(obj));
        }

        @Override // c.f.d.w.n.i.c
        public boolean c(Object obj) {
            return this.f16581b && this.f16571d.get(obj) != obj;
        }
    }

    public static final class b<T> extends t<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c.f.d.w.i<T> f16578a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map<String, c> f16579b;

        public b(c.f.d.w.i<T> iVar, Map<String, c> map) {
            this.f16578a = iVar;
            this.f16579b = map;
        }

        @Override // c.f.d.t
        public T b(c.f.d.y.a aVar) throws IOException {
            if (aVar.B0() == c.f.d.y.b.NULL) {
                aVar.c0();
                return null;
            }
            T tA = this.f16578a.a();
            try {
                aVar.i();
                while (aVar.s()) {
                    c cVar = this.f16579b.get(aVar.U());
                    if (cVar == null || !cVar.f16582c) {
                        aVar.L0();
                    } else {
                        cVar.a(aVar, tA);
                    }
                }
                aVar.p();
                return tA;
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            } catch (IllegalStateException e3) {
                throw new r(e3);
            }
        }

        @Override // c.f.d.t
        public void d(c.f.d.y.c cVar, T t) throws IOException {
            if (t == null) {
                cVar.v();
                return;
            }
            cVar.m();
            try {
                for (c cVar2 : this.f16579b.values()) {
                    if (cVar2.c(t)) {
                        cVar.t(cVar2.f16580a);
                        cVar2.b(cVar, t);
                    }
                }
                cVar.p();
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f16580a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f16581b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f16582c;

        public c(String str, boolean z, boolean z2) {
            this.f16580a = str;
            this.f16581b = z;
            this.f16582c = z2;
        }

        public abstract void a(c.f.d.y.a aVar, Object obj);

        public abstract void b(c.f.d.y.c cVar, Object obj);

        public abstract boolean c(Object obj);
    }

    public i(c.f.d.w.c cVar, c.f.d.d dVar, c.f.d.w.d dVar2, d dVar3) {
        this.f16566b = cVar;
        this.f16567c = dVar;
        this.f16568d = dVar2;
        this.f16569e = dVar3;
    }

    public static boolean d(Field field, boolean z, c.f.d.w.d dVar) {
        return (dVar.c(field.getType(), z) || dVar.g(field, z)) ? false : true;
    }

    @Override // c.f.d.u
    public <T> t<T> a(c.f.d.e eVar, c.f.d.x.a<T> aVar) {
        Class<? super T> clsC = aVar.c();
        if (Object.class.isAssignableFrom(clsC)) {
            return new b(this.f16566b.a(aVar), e(eVar, aVar, clsC));
        }
        return null;
    }

    public final c b(c.f.d.e eVar, Field field, String str, c.f.d.x.a<?> aVar, boolean z, boolean z2) {
        boolean zA = c.f.d.w.k.a(aVar.c());
        c.f.d.v.b bVar = (c.f.d.v.b) field.getAnnotation(c.f.d.v.b.class);
        t<?> tVarB = bVar != null ? this.f16569e.b(this.f16566b, eVar, aVar, bVar) : null;
        boolean z3 = tVarB != null;
        if (tVarB == null) {
            tVarB = eVar.l(aVar);
        }
        return new a(str, z, z2, field, z3, tVarB, eVar, aVar, zA);
    }

    public boolean c(Field field, boolean z) {
        return d(field, z, this.f16568d);
    }

    public final Map<String, c> e(c.f.d.e eVar, c.f.d.x.a<?> aVar, Class<?> cls) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        Type typeE = aVar.e();
        c.f.d.x.a<?> aVarB = aVar;
        Class<?> clsC = cls;
        while (clsC != Object.class) {
            Field[] declaredFields = clsC.getDeclaredFields();
            int length = declaredFields.length;
            boolean z = false;
            int i2 = 0;
            while (i2 < length) {
                Field field = declaredFields[i2];
                boolean zC = c(field, true);
                boolean zC2 = c(field, z);
                if (zC || zC2) {
                    this.f16570f.b(field);
                    Type typeP = c.f.d.w.b.p(aVarB.e(), clsC, field.getGenericType());
                    List<String> listF = f(field);
                    int size = listF.size();
                    c cVar = null;
                    int i3 = 0;
                    while (i3 < size) {
                        String str = listF.get(i3);
                        boolean z2 = i3 != 0 ? false : zC;
                        int i4 = i3;
                        c cVar2 = cVar;
                        int i5 = size;
                        List<String> list = listF;
                        Field field2 = field;
                        cVar = cVar2 == null ? (c) linkedHashMap.put(str, b(eVar, field, str, c.f.d.x.a.b(typeP), z2, zC2)) : cVar2;
                        i3 = i4 + 1;
                        zC = z2;
                        listF = list;
                        size = i5;
                        field = field2;
                    }
                    c cVar3 = cVar;
                    if (cVar3 != null) {
                        throw new IllegalArgumentException(typeE + " declares multiple JSON fields named " + cVar3.f16580a);
                    }
                }
                i2++;
                z = false;
            }
            aVarB = c.f.d.x.a.b(c.f.d.w.b.p(aVarB.e(), clsC, clsC.getGenericSuperclass()));
            clsC = aVarB.c();
        }
        return linkedHashMap;
    }

    public final List<String> f(Field field) {
        c.f.d.v.c cVar = (c.f.d.v.c) field.getAnnotation(c.f.d.v.c.class);
        if (cVar == null) {
            return Collections.singletonList(this.f16567c.translateName(field));
        }
        String strValue = cVar.value();
        String[] strArrAlternate = cVar.alternate();
        if (strArrAlternate.length == 0) {
            return Collections.singletonList(strValue);
        }
        ArrayList arrayList = new ArrayList(strArrAlternate.length + 1);
        arrayList.add(strValue);
        for (String str : strArrAlternate) {
            arrayList.add(str);
        }
        return arrayList;
    }
}
