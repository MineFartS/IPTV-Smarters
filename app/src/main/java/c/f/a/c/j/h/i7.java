package c.f.a.c.j.h;

/* JADX INFO: loaded from: classes2.dex */
public final class i7 implements d8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o7 f13369a = new g7();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o7 f13370b;

    public i7() {
        o7 o7Var;
        o7[] o7VarArr = new o7[2];
        o7VarArr[0] = h6.c();
        try {
            o7Var = (o7) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            o7Var = f13369a;
        }
        o7VarArr[1] = o7Var;
        h7 h7Var = new h7(o7VarArr);
        u6.b(h7Var, "messageInfoFactory");
        this.f13370b = h7Var;
    }

    public static boolean b(n7 n7Var) {
        return n7Var.l() == 1;
    }

    @Override // c.f.a.c.j.h.d8
    public final <T> c8<T> a(Class<T> cls) {
        w7 w7VarA;
        e7 e7VarC;
        q8<?, ?> q8VarB;
        z5<?> z5VarB;
        l7 l7VarA;
        q8<?, ?> q8VarA;
        z5<?> z5VarB2;
        e8.A(cls);
        n7 n7VarB = this.f13370b.b(cls);
        if (n7VarB.zza()) {
            if (l6.class.isAssignableFrom(cls)) {
                q8VarA = e8.c();
                z5VarB2 = b6.a();
            } else {
                q8VarA = e8.a();
                z5VarB2 = b6.b();
            }
            return v7.i(q8VarA, z5VarB2, n7VarB.k());
        }
        if (l6.class.isAssignableFrom(cls)) {
            boolean zB = b(n7VarB);
            w7VarA = x7.b();
            e7VarC = e7.d();
            q8VarB = e8.c();
            z5VarB = zB ? b6.a() : null;
            l7VarA = m7.b();
        } else {
            boolean zB2 = b(n7VarB);
            w7VarA = x7.a();
            e7VarC = e7.c();
            if (zB2) {
                q8VarB = e8.a();
                z5VarB = b6.b();
            } else {
                q8VarB = e8.b();
                z5VarB = null;
            }
            l7VarA = m7.a();
        }
        return u7.E(cls, n7VarB, w7VarA, e7VarC, q8VarB, z5VarB, l7VarA);
    }
}
