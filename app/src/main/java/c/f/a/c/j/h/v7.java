package c.f.a.c.j.h;

/* JADX INFO: loaded from: classes2.dex */
public final class v7<T> implements c8<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q7 f13590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q8<?, ?> f13591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f13592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z5<?> f13593d;

    public v7(q8<?, ?> q8Var, z5<?> z5Var, q7 q7Var) {
        this.f13591b = q8Var;
        this.f13592c = z5Var.a(q7Var);
        this.f13593d = z5Var;
        this.f13590a = q7Var;
    }

    public static <T> v7<T> i(q8<?, ?> q8Var, z5<?> z5Var, q7 q7Var) {
        return new v7<>(q8Var, z5Var, q7Var);
    }

    @Override // c.f.a.c.j.h.c8
    public final void a(T t, T t2) {
        e8.f(this.f13591b, t, t2);
        if (this.f13592c) {
            e8.e(this.f13593d, t, t2);
        }
    }

    @Override // c.f.a.c.j.h.c8
    public final boolean b(T t) {
        this.f13593d.b(t);
        throw null;
    }

    @Override // c.f.a.c.j.h.c8
    public final int c(T t) {
        q8<?, ?> q8Var = this.f13591b;
        int iG = q8Var.g(q8Var.d(t));
        if (!this.f13592c) {
            return iG;
        }
        this.f13593d.b(t);
        throw null;
    }

    @Override // c.f.a.c.j.h.c8
    public final int d(T t) {
        int iHashCode = this.f13591b.d(t).hashCode();
        if (!this.f13592c) {
            return iHashCode;
        }
        this.f13593d.b(t);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // c.f.a.c.j.h.c8
    public final void e(T t, byte[] bArr, int i2, int i3, w4 w4Var) {
        l6 l6Var = (l6) t;
        if (l6Var.zzc == r8.a()) {
            l6Var.zzc = r8.b();
        }
        throw null;
    }

    @Override // c.f.a.c.j.h.c8
    public final void f(T t) {
        this.f13591b.e(t);
        this.f13593d.c(t);
    }

    @Override // c.f.a.c.j.h.c8
    public final void g(T t, u5 u5Var) {
        this.f13593d.b(t);
        throw null;
    }

    @Override // c.f.a.c.j.h.c8
    public final boolean h(T t, T t2) {
        if (!this.f13591b.d(t).equals(this.f13591b.d(t2))) {
            return false;
        }
        if (!this.f13592c) {
            return true;
        }
        this.f13593d.b(t);
        this.f13593d.b(t2);
        throw null;
    }

    @Override // c.f.a.c.j.h.c8
    public final T zza() {
        return (T) this.f13590a.a().Q();
    }
}
