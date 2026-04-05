package c.f.a.b;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e2 extends q0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f6885f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f6886g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int[] f6887h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int[] f6888i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p2[] f6889j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object[] f6890k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final HashMap<Object, Integer> f6891l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(Collection<? extends u1> collection, c.f.a.b.e3.u0 u0Var) {
        super(false, u0Var);
        int iP = 0;
        int size = collection.size();
        this.f6887h = new int[size];
        this.f6888i = new int[size];
        this.f6889j = new p2[size];
        this.f6890k = new Object[size];
        this.f6891l = new HashMap<>();
        int i2 = 0;
        int i3 = 0;
        for (u1 u1Var : collection) {
            this.f6889j[i3] = u1Var.b();
            this.f6888i[i3] = iP;
            this.f6887h[i3] = i2;
            iP += this.f6889j[i3].p();
            i2 += this.f6889j[i3].i();
            this.f6890k[i3] = u1Var.a();
            this.f6891l.put(this.f6890k[i3], Integer.valueOf(i3));
            i3++;
        }
        this.f6885f = iP;
        this.f6886g = i2;
    }

    @Override // c.f.a.b.q0
    public int A(int i2) {
        return this.f6888i[i2];
    }

    @Override // c.f.a.b.q0
    public p2 D(int i2) {
        return this.f6889j[i2];
    }

    public List<p2> E() {
        return Arrays.asList(this.f6889j);
    }

    @Override // c.f.a.b.p2
    public int i() {
        return this.f6886g;
    }

    @Override // c.f.a.b.p2
    public int p() {
        return this.f6885f;
    }

    @Override // c.f.a.b.q0
    public int s(Object obj) {
        Integer num = this.f6891l.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // c.f.a.b.q0
    public int t(int i2) {
        return c.f.a.b.j3.x0.g(this.f6887h, i2 + 1, false, false);
    }

    @Override // c.f.a.b.q0
    public int u(int i2) {
        return c.f.a.b.j3.x0.g(this.f6888i, i2 + 1, false, false);
    }

    @Override // c.f.a.b.q0
    public Object x(int i2) {
        return this.f6890k[i2];
    }

    @Override // c.f.a.b.q0
    public int z(int i2) {
        return this.f6887h[i2];
    }
}
