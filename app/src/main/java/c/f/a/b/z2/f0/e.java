package c.f.a.b.z2.f0;

import c.f.a.b.j3.i0;
import c.f.a.b.w1;
import c.f.a.b.z2.a0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f10750a;

    public static final class a extends w1 {
        public a(String str) {
            super(str, null, false, 1);
        }
    }

    public e(a0 a0Var) {
        this.f10750a = a0Var;
    }

    public final boolean a(i0 i0Var, long j2) {
        return b(i0Var) && c(i0Var, j2);
    }

    public abstract boolean b(i0 i0Var);

    public abstract boolean c(i0 i0Var, long j2);
}
