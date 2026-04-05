package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class blr implements bml {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final blx f21368a = new blp();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final blx f21369b;

    public blr() {
        blx blxVar;
        blx[] blxVarArr = new blx[2];
        blxVarArr[0] = blp.c();
        try {
            blxVar = (blx) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            blxVar = f21368a;
        }
        blxVarArr[1] = blxVar;
        blq blqVar = new blq(blxVarArr);
        bld.j(blqVar, "messageInfoFactory");
        this.f21369b = blqVar;
    }

    private static boolean b(blw blwVar) {
        return blwVar.c() == 1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bml
    public final <T> bmk<T> a(Class<T> cls) {
        bmx bmxVarA;
        bln blnVarE;
        bni bniVarU;
        blt bltVarA;
        bmb bmbVarA;
        bni bniVarT;
        blt bltVarA2;
        bmm.p(cls);
        blw blwVarA = this.f21369b.a(cls);
        boolean zB = blwVarA.b();
        boolean zIsAssignableFrom = bkx.class.isAssignableFrom(cls);
        if (zB) {
            if (zIsAssignableFrom) {
                bniVarT = bmm.V();
                bltVarA2 = bkn.b();
            } else {
                bniVarT = bmm.T();
                bltVarA2 = bkn.a();
            }
            return bmd.c(bniVarT, bltVarA2, blwVarA.a());
        }
        if (zIsAssignableFrom) {
            boolean zB2 = b(blwVarA);
            bmxVarA = bme.b();
            blnVarE = bln.f();
            bniVarU = bmm.V();
            bltVarA = zB2 ? bkn.b() : null;
            bmbVarA = blv.b();
        } else {
            boolean zB3 = b(blwVarA);
            bmxVarA = bme.a();
            blnVarE = bln.e();
            if (zB3) {
                bniVarU = bmm.T();
                bltVarA = bkn.a();
            } else {
                bniVarU = bmm.U();
                bltVarA = null;
            }
            bmbVarA = blv.a();
        }
        return bmc.n(blwVarA, bmxVarA, blnVarE, bniVarU, bltVarA, bmbVarA);
    }
}
