package c.f.a.b.e3;

/* JADX INFO: loaded from: classes2.dex */
public class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f7476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f7479d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f7480e;

    public g0(g0 g0Var) {
        this.f7476a = g0Var.f7476a;
        this.f7477b = g0Var.f7477b;
        this.f7478c = g0Var.f7478c;
        this.f7479d = g0Var.f7479d;
        this.f7480e = g0Var.f7480e;
    }

    public g0(Object obj) {
        this(obj, -1L);
    }

    public g0(Object obj, int i2, int i3, long j2) {
        this(obj, i2, i3, j2, -1);
    }

    public g0(Object obj, int i2, int i3, long j2, int i4) {
        this.f7476a = obj;
        this.f7477b = i2;
        this.f7478c = i3;
        this.f7479d = j2;
        this.f7480e = i4;
    }

    public g0(Object obj, long j2) {
        this(obj, -1, -1, j2, -1);
    }

    public g0(Object obj, long j2, int i2) {
        this(obj, -1, -1, j2, i2);
    }

    public g0 a(Object obj) {
        return this.f7476a.equals(obj) ? this : new g0(obj, this.f7477b, this.f7478c, this.f7479d, this.f7480e);
    }

    public boolean b() {
        return this.f7477b != -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return this.f7476a.equals(g0Var.f7476a) && this.f7477b == g0Var.f7477b && this.f7478c == g0Var.f7478c && this.f7479d == g0Var.f7479d && this.f7480e == g0Var.f7480e;
    }

    public int hashCode() {
        return ((((((((527 + this.f7476a.hashCode()) * 31) + this.f7477b) * 31) + this.f7478c) * 31) + ((int) this.f7479d)) * 31) + this.f7480e;
    }
}
