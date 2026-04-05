package c.f.a.c.f.o.n;

import c.f.a.c.f.o.n.j;

/* JADX INFO: loaded from: classes2.dex */
public final class g1 extends e1<Void> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r0 f12416c;

    public g1(r0 r0Var, c.f.a.c.o.j<Void> jVar) {
        super(3, jVar);
        this.f12416c = r0Var;
    }

    @Override // c.f.a.c.f.o.n.j1
    public final /* bridge */ /* synthetic */ void c(t tVar, boolean z) {
    }

    @Override // c.f.a.c.f.o.n.o0
    public final c.f.a.c.f.d[] f(d0<?> d0Var) {
        return this.f12416c.f12495a.c();
    }

    @Override // c.f.a.c.f.o.n.o0
    public final boolean g(d0<?> d0Var) {
        return this.f12416c.f12495a.e();
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
    @Override // c.f.a.c.f.o.n.e1
    public final void h(d0<?> d0Var) {
        this.f12416c.f12495a.d(d0Var.s(), this.f12392b);
        j.a<?> aVarB = this.f12416c.f12495a.b();
        if (aVarB != null) {
            d0Var.t().put(aVarB, this.f12416c);
        }
    }
}
