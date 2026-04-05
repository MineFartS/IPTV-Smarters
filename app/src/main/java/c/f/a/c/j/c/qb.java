package c.f.a.c.j.c;

/* JADX INFO: loaded from: classes2.dex */
public final class qb implements yb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public yb[] f13045a;

    public qb(yb... ybVarArr) {
        this.f13045a = ybVarArr;
    }

    @Override // c.f.a.c.j.c.yb
    public final boolean a(Class<?> cls) {
        for (yb ybVar : this.f13045a) {
            if (ybVar.a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // c.f.a.c.j.c.yb
    public final zb b(Class<?> cls) {
        for (yb ybVar : this.f13045a) {
            if (ybVar.a(cls)) {
                return ybVar.b(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }
}
