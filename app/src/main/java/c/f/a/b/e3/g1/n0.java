package c.f.a.b.e3.g1;

import c.f.a.b.e3.g1.l;
import c.f.a.b.j3.x0;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class n0 implements l.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f7609a;

    public n0(long j2) {
        this.f7609a = j2;
    }

    @Override // c.f.a.b.e3.g1.l.a
    public l a(int i2) throws IOException {
        m0 m0Var = new m0(this.f7609a);
        m0 m0Var2 = new m0(this.f7609a);
        try {
            m0Var.g(r.a(0));
            int iE = m0Var.e();
            boolean z = iE % 2 == 0;
            m0Var2.g(r.a(z ? iE + 1 : iE - 1));
            if (z) {
                m0Var.f(m0Var2);
                return m0Var;
            }
            m0Var2.f(m0Var);
            return m0Var2;
        } catch (IOException e2) {
            x0.n(m0Var);
            x0.n(m0Var2);
            throw e2;
        }
    }

    @Override // c.f.a.b.e3.g1.l.a
    public l.a b() {
        return new l0(this.f7609a);
    }
}
