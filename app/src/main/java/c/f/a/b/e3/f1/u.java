package c.f.a.b.e3.f1;

import android.util.SparseArray;
import c.f.a.b.j3.u0;

/* JADX INFO: loaded from: classes2.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray<u0> f7354a = new SparseArray<>();

    public u0 a(int i2) {
        u0 u0Var = this.f7354a.get(i2);
        if (u0Var != null) {
            return u0Var;
        }
        u0 u0Var2 = new u0(9223372036854775806L);
        this.f7354a.put(i2, u0Var2);
        return u0Var2;
    }

    public void b() {
        this.f7354a.clear();
    }
}
