package c.f.a.b.g3;

import android.os.SystemClock;
import c.f.a.b.e3.z0;
import c.f.a.b.j3.x0;
import c.f.a.b.k1;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z0 f8427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f8429c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8430d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k1[] f8431e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long[] f8432f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f8433g;

    public e(z0 z0Var, int... iArr) {
        this(z0Var, iArr, 0);
    }

    public e(z0 z0Var, int[] iArr, int i2) {
        int i3 = 0;
        c.f.a.b.j3.g.g(iArr.length > 0);
        this.f8430d = i2;
        this.f8427a = (z0) c.f.a.b.j3.g.e(z0Var);
        int length = iArr.length;
        this.f8428b = length;
        this.f8431e = new k1[length];
        for (int i4 = 0; i4 < iArr.length; i4++) {
            this.f8431e[i4] = z0Var.b(iArr[i4]);
        }
        Arrays.sort(this.f8431e, new Comparator() { // from class: c.f.a.b.g3.a
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return e.t((k1) obj, (k1) obj2);
            }
        });
        this.f8429c = new int[this.f8428b];
        while (true) {
            int i5 = this.f8428b;
            if (i3 >= i5) {
                this.f8432f = new long[i5];
                return;
            } else {
                this.f8429c[i3] = z0Var.c(this.f8431e[i3]);
                i3++;
            }
        }
    }

    public static /* synthetic */ int t(k1 k1Var, k1 k1Var2) {
        return k1Var2.f9334i - k1Var.f9334i;
    }

    @Override // c.f.a.b.g3.k
    public final z0 a() {
        return this.f8427a;
    }

    @Override // c.f.a.b.g3.h
    public boolean c(int i2, long j2) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zD = d(i2, jElapsedRealtime);
        int i3 = 0;
        while (i3 < this.f8428b && !zD) {
            zD = (i3 == i2 || d(i3, jElapsedRealtime)) ? false : true;
            i3++;
        }
        if (!zD) {
            return false;
        }
        long[] jArr = this.f8432f;
        jArr[i2] = Math.max(jArr[i2], x0.a(jElapsedRealtime, j2, Long.MAX_VALUE));
        return true;
    }

    @Override // c.f.a.b.g3.h
    public boolean d(int i2, long j2) {
        return this.f8432f[i2] > j2;
    }

    @Override // c.f.a.b.g3.h
    public void disable() {
    }

    @Override // c.f.a.b.g3.h
    public /* synthetic */ boolean e(long j2, c.f.a.b.e3.d1.f fVar, List list) {
        return g.d(this, j2, fVar, list);
    }

    @Override // c.f.a.b.g3.h
    public void enable() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return this.f8427a == eVar.f8427a && Arrays.equals(this.f8429c, eVar.f8429c);
    }

    @Override // c.f.a.b.g3.h
    public /* synthetic */ void f(boolean z) {
        g.b(this, z);
    }

    @Override // c.f.a.b.g3.k
    public final k1 g(int i2) {
        return this.f8431e[i2];
    }

    @Override // c.f.a.b.g3.k
    public final int h(int i2) {
        return this.f8429c[i2];
    }

    public int hashCode() {
        if (this.f8433g == 0) {
            this.f8433g = (System.identityHashCode(this.f8427a) * 31) + Arrays.hashCode(this.f8429c);
        }
        return this.f8433g;
    }

    @Override // c.f.a.b.g3.h
    public int i(long j2, List<? extends c.f.a.b.e3.d1.n> list) {
        return list.size();
    }

    @Override // c.f.a.b.g3.k
    public final int j(k1 k1Var) {
        for (int i2 = 0; i2 < this.f8428b; i2++) {
            if (this.f8431e[i2] == k1Var) {
                return i2;
            }
        }
        return -1;
    }

    @Override // c.f.a.b.g3.h
    public final int l() {
        return this.f8429c[b()];
    }

    @Override // c.f.a.b.g3.k
    public final int length() {
        return this.f8429c.length;
    }

    @Override // c.f.a.b.g3.h
    public final k1 m() {
        return this.f8431e[b()];
    }

    @Override // c.f.a.b.g3.h
    public void o(float f2) {
    }

    @Override // c.f.a.b.g3.h
    public /* synthetic */ void q() {
        g.a(this);
    }

    @Override // c.f.a.b.g3.h
    public /* synthetic */ void r() {
        g.c(this);
    }

    @Override // c.f.a.b.g3.k
    public final int s(int i2) {
        for (int i3 = 0; i3 < this.f8428b; i3++) {
            if (this.f8429c[i3] == i2) {
                return i3;
            }
        }
        return -1;
    }
}
