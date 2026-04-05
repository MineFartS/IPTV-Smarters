package c.f.a.c.j.h;

/* JADX INFO: loaded from: classes2.dex */
public final class h7 implements o7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o7[] f13353a;

    public h7(o7... o7VarArr) {
        this.f13353a = o7VarArr;
    }

    @Override // c.f.a.c.j.h.o7
    public final boolean a(Class<?> cls) {
        o7[] o7VarArr = this.f13353a;
        for (int i2 = 0; i2 < 2; i2++) {
            if (o7VarArr[i2].a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // c.f.a.c.j.h.o7
    public final n7 b(Class<?> cls) {
        o7[] o7VarArr = this.f13353a;
        for (int i2 = 0; i2 < 2; i2++) {
            o7 o7Var = o7VarArr[i2];
            if (o7Var.a(cls)) {
                return o7Var.b(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }
}
