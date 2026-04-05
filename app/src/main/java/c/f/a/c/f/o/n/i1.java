package c.f.a.c.f.o.n;

import c.f.a.c.f.o.n.j;

/* JADX INFO: loaded from: classes2.dex */
public final class i1 extends e1<Boolean> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j.a<?> f12422c;

    public i1(j.a<?> aVar, c.f.a.c.o.j<Boolean> jVar) {
        super(4, jVar);
        this.f12422c = aVar;
    }

    @Override // c.f.a.c.f.o.n.j1
    public final /* bridge */ /* synthetic */ void c(t tVar, boolean z) {
    }

    @Override // c.f.a.c.f.o.n.o0
    public final c.f.a.c.f.d[] f(d0<?> d0Var) {
        r0 r0Var = d0Var.t().get(this.f12422c);
        if (r0Var == null) {
            return null;
        }
        return r0Var.f12495a.c();
    }

    @Override // c.f.a.c.f.o.n.o0
    public final boolean g(d0<?> d0Var) {
        r0 r0Var = d0Var.t().get(this.f12422c);
        return r0Var != null && r0Var.f12495a.e();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: JadxRuntimeException in pass: FinishTypeInference
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r0v4 boolean
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
        */
    @Override // c.f.a.c.f.o.n.e1
    public final void h(c.f.a.c.f.o.n.d0<?> r4) {
        /*
            r3 = this;
            java.util.Map r0 = r4.t()
            c.f.a.c.f.o.n.j$a<?> r1 = r3.f12422c
            java.lang.Object r0 = r0.remove(r1)
            c.f.a.c.f.o.n.r0 r0 = (c.f.a.c.f.o.n.r0) r0
            if (r0 == 0) goto L1f
            c.f.a.c.f.o.n.s<c.f.a.c.f.o.a$b, ?> r1 = r0.f12496b
            c.f.a.c.f.o.a$f r4 = r4.s()
            c.f.a.c.o.j<T> r2 = r3.f12392b
            r1.b(r4, r2)
            c.f.a.c.f.o.n.n<c.f.a.c.f.o.a$b, ?> r4 = r0.f12495a
            r4.a()
            return
        L1f:
            c.f.a.c.o.j<T> r4 = r3.f12392b
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r4.e(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.c.f.o.n.i1.h(c.f.a.c.f.o.n.d0):void");
    }
}
