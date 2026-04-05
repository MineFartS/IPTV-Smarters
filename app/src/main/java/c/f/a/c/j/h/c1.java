package c.f.a.c.j.h;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class c1 extends i6<d1, c1> implements r7 {
    public c1() {
        super(d1.zzn);
    }

    public /* synthetic */ c1(z0 z0Var) {
        super(d1.zzn);
    }

    public final c1 A() {
        if (this.f13368d) {
            p();
            this.f13368d = false;
        }
        ((d1) this.f13367c).zzj = l6.o();
        return this;
    }

    public final int u() {
        return ((d1) this.f13367c).B();
    }

    public final b1 w(int i2) {
        return ((d1) this.f13367c).C(i2);
    }

    public final c1 y(int i2, a1 a1Var) {
        if (this.f13368d) {
            p();
            this.f13368d = false;
        }
        d1.I((d1) this.f13367c, i2, a1Var.m());
        return this;
    }

    public final List<h0> z() {
        return Collections.unmodifiableList(((d1) this.f13367c).D());
    }
}
