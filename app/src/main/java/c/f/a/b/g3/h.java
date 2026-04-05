package c.f.a.b.g3;

import c.f.a.b.e3.i0;
import c.f.a.b.e3.z0;
import c.f.a.b.k1;
import c.f.a.b.p2;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface h extends k {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final z0 f8475a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f8476b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f8477c;

        public a(z0 z0Var, int... iArr) {
            this(z0Var, iArr, 0);
        }

        public a(z0 z0Var, int[] iArr, int i2) {
            this.f8475a = z0Var;
            this.f8476b = iArr;
            this.f8477c = i2;
        }
    }

    public interface b {
        h[] a(a[] aVarArr, c.f.a.b.i3.i iVar, i0.a aVar, p2 p2Var);
    }

    int b();

    boolean c(int i2, long j2);

    boolean d(int i2, long j2);

    void disable();

    boolean e(long j2, c.f.a.b.e3.d1.f fVar, List<? extends c.f.a.b.e3.d1.n> list);

    void enable();

    void f(boolean z);

    int i(long j2, List<? extends c.f.a.b.e3.d1.n> list);

    void k(long j2, long j3, long j4, List<? extends c.f.a.b.e3.d1.n> list, c.f.a.b.e3.d1.o[] oVarArr);

    int l();

    k1 m();

    int n();

    void o(float f2);

    Object p();

    void q();

    void r();
}
