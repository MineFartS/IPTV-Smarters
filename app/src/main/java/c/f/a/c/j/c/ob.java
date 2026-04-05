package c.f.a.c.j.c;

import c.f.a.c.j.c.oa;

/* JADX INFO: loaded from: classes2.dex */
public final class ob implements sc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final yb f13010a = new rb();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yb f13011b;

    public ob() {
        this(new qb(pa.c(), c()));
    }

    public ob(yb ybVar) {
        this.f13011b = (yb) sa.d(ybVar, "messageInfoFactory");
    }

    public static boolean b(zb zbVar) {
        return zbVar.c() == oa.e.f13004i;
    }

    public static yb c() {
        try {
            return (yb) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return f13010a;
        }
    }

    @Override // c.f.a.c.j.c.sc
    public final <T> pc<T> a(Class<T> cls) {
        rc.u(cls);
        zb zbVarB = this.f13011b.b(cls);
        if (zbVarB.a()) {
            return oa.class.isAssignableFrom(cls) ? ec.h(rc.J(), fa.b(), zbVarB.b()) : ec.h(rc.H(), fa.c(), zbVarB.b());
        }
        if (!oa.class.isAssignableFrom(cls)) {
            boolean zB = b(zbVarB);
            gc gcVarA = ic.a();
            kb kbVarC = kb.c();
            return zB ? fc.i(cls, zbVarB, gcVarA, kbVarC, rc.H(), fa.c(), wb.a()) : fc.i(cls, zbVarB, gcVarA, kbVarC, rc.I(), null, wb.a());
        }
        boolean zB2 = b(zbVarB);
        gc gcVarB = ic.b();
        kb kbVarD = kb.d();
        hd<?, ?> hdVarJ = rc.J();
        return zB2 ? fc.i(cls, zbVarB, gcVarB, kbVarD, hdVarJ, fa.b(), wb.b()) : fc.i(cls, zbVarB, gcVarB, kbVarD, hdVarJ, null, wb.b());
    }
}
