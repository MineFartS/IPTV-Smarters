package c.f.d.w.n;

import c.f.d.t;
import c.f.d.u;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends t<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f16563a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.f.d.e f16564b;

    public class a implements u {
        @Override // c.f.d.u
        public <T> t<T> a(c.f.d.e eVar, c.f.d.x.a<T> aVar) {
            if (aVar.c() == Object.class) {
                return new h(eVar);
            }
            return null;
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16565a;

        static {
            int[] iArr = new int[c.f.d.y.b.values().length];
            f16565a = iArr;
            try {
                iArr[c.f.d.y.b.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16565a[c.f.d.y.b.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16565a[c.f.d.y.b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16565a[c.f.d.y.b.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16565a[c.f.d.y.b.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16565a[c.f.d.y.b.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public h(c.f.d.e eVar) {
        this.f16564b = eVar;
    }

    @Override // c.f.d.t
    public Object b(c.f.d.y.a aVar) throws IOException {
        switch (b.f16565a[aVar.B0().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                aVar.d();
                while (aVar.s()) {
                    arrayList.add(b(aVar));
                }
                aVar.o();
                return arrayList;
            case 2:
                c.f.d.w.h hVar = new c.f.d.w.h();
                aVar.i();
                while (aVar.s()) {
                    hVar.put(aVar.U(), b(aVar));
                }
                aVar.p();
                return hVar;
            case 3:
                return aVar.w0();
            case 4:
                return Double.valueOf(aVar.x());
            case 5:
                return Boolean.valueOf(aVar.w());
            case 6:
                aVar.c0();
                return null;
            default:
                throw new IllegalStateException();
        }
    }

    @Override // c.f.d.t
    public void d(c.f.d.y.c cVar, Object obj) throws IOException {
        if (obj == null) {
            cVar.v();
            return;
        }
        t tVarM = this.f16564b.m(obj.getClass());
        if (!(tVarM instanceof h)) {
            tVarM.d(cVar, obj);
        } else {
            cVar.m();
            cVar.p();
        }
    }
}
