package c.f.a.b;

/* JADX INFO: loaded from: classes.dex */
public final class z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z1 f10620a = new z1(1.0f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v0<z1> f10621b = new v0() { // from class: c.f.a.b.i0
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f10622c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f10623d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f10624e;

    public z1(float f2) {
        this(f2, 1.0f);
    }

    public z1(float f2, float f3) {
        c.f.a.b.j3.g.a(f2 > 0.0f);
        c.f.a.b.j3.g.a(f3 > 0.0f);
        this.f10622c = f2;
        this.f10623d = f3;
        this.f10624e = Math.round(f2 * 1000.0f);
    }

    public long a(long j2) {
        return j2 * ((long) this.f10624e);
    }

    public z1 b(float f2) {
        return new z1(f2, this.f10623d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z1.class != obj.getClass()) {
            return false;
        }
        z1 z1Var = (z1) obj;
        return this.f10622c == z1Var.f10622c && this.f10623d == z1Var.f10623d;
    }

    public int hashCode() {
        return ((527 + Float.floatToRawIntBits(this.f10622c)) * 31) + Float.floatToRawIntBits(this.f10623d);
    }

    public String toString() {
        return c.f.a.b.j3.x0.D("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f10622c), Float.valueOf(this.f10623d));
    }
}
