package c.f.a.b.i3;

import c.f.a.b.j3.x0;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j implements p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f8905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList<n0> f8906c = new ArrayList<>(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8907d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public s f8908e;

    public j(boolean z) {
        this.f8905b = z;
    }

    @Override // c.f.a.b.i3.p
    public final void h(n0 n0Var) {
        c.f.a.b.j3.g.e(n0Var);
        if (this.f8906c.contains(n0Var)) {
            return;
        }
        this.f8906c.add(n0Var);
        this.f8907d++;
    }

    @Override // c.f.a.b.i3.p
    public /* synthetic */ Map q() {
        return o.a(this);
    }

    public final void v(int i2) {
        s sVar = (s) x0.i(this.f8908e);
        for (int i3 = 0; i3 < this.f8907d; i3++) {
            this.f8906c.get(i3).g(this, sVar, this.f8905b, i2);
        }
    }

    public final void w() {
        s sVar = (s) x0.i(this.f8908e);
        for (int i2 = 0; i2 < this.f8907d; i2++) {
            this.f8906c.get(i2).b(this, sVar, this.f8905b);
        }
        this.f8908e = null;
    }

    public final void x(s sVar) {
        for (int i2 = 0; i2 < this.f8907d; i2++) {
            this.f8906c.get(i2).i(this, sVar, this.f8905b);
        }
    }

    public final void y(s sVar) {
        this.f8908e = sVar;
        for (int i2 = 0; i2 < this.f8907d; i2++) {
            this.f8906c.get(i2).c(this, sVar, this.f8905b);
        }
    }
}
