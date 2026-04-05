package c.f.a.b;

/* JADX INFO: loaded from: classes.dex */
public final class m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m2 f9582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m2 f9583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m2 f9584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m2 f9585d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m2 f9586e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f9587f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f9588g;

    static {
        m2 m2Var = new m2(0L, 0L);
        f9582a = m2Var;
        f9583b = new m2(Long.MAX_VALUE, Long.MAX_VALUE);
        f9584c = new m2(Long.MAX_VALUE, 0L);
        f9585d = new m2(0L, Long.MAX_VALUE);
        f9586e = m2Var;
    }

    public m2(long j2, long j3) {
        c.f.a.b.j3.g.a(j2 >= 0);
        c.f.a.b.j3.g.a(j3 >= 0);
        this.f9587f = j2;
        this.f9588g = j3;
    }

    public long a(long j2, long j3, long j4) {
        long j5 = this.f9587f;
        if (j5 == 0 && this.f9588g == 0) {
            return j2;
        }
        long jY0 = c.f.a.b.j3.x0.Y0(j2, j5, Long.MIN_VALUE);
        long jA = c.f.a.b.j3.x0.a(j2, this.f9588g, Long.MAX_VALUE);
        boolean z = jY0 <= j3 && j3 <= jA;
        boolean z2 = jY0 <= j4 && j4 <= jA;
        return (z && z2) ? Math.abs(j3 - j2) <= Math.abs(j4 - j2) ? j3 : j4 : z ? j3 : z2 ? j4 : jY0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m2.class != obj.getClass()) {
            return false;
        }
        m2 m2Var = (m2) obj;
        return this.f9587f == m2Var.f9587f && this.f9588g == m2Var.f9588g;
    }

    public int hashCode() {
        return (((int) this.f9587f) * 31) + ((int) this.f9588g);
    }
}
