package c.f.a.e.a.e;

/* JADX INFO: loaded from: classes2.dex */
public final class a0<T> implements c0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c0<T> f15707a;

    public static <T> void b(c0<T> c0Var, c0<T> c0Var2) {
        n.c(c0Var2);
        a0 a0Var = (a0) c0Var;
        if (a0Var.f15707a != null) {
            throw new IllegalStateException();
        }
        a0Var.f15707a = c0Var2;
    }

    @Override // c.f.a.e.a.e.c0
    public final T a() {
        c0<T> c0Var = this.f15707a;
        if (c0Var != null) {
            return c0Var.a();
        }
        throw new IllegalStateException();
    }
}
