package c.f.a.b.c3;

/* JADX INFO: loaded from: classes2.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f6766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f6768c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f6769d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f6770e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f6771f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f6772g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final z f6773h;

    public r(a0 a0Var, int i2, long j2, long j3, long j4, int i3, int i4) {
        this(a0Var, i2, j2, j3, j4, i3, i4, new z());
    }

    public r(a0 a0Var, int i2, long j2, long j3, long j4, int i3, int i4, z zVar) {
        c.f.a.b.j3.g.e(zVar);
        c.f.a.b.j3.g.a((i4 == 0) == (i2 != 4));
        if (i3 != 0) {
            c.f.a.b.j3.g.a((i2 == 2 || i2 == 0) ? false : true);
        }
        this.f6766a = a0Var;
        this.f6767b = i2;
        this.f6768c = j2;
        this.f6769d = j3;
        this.f6770e = j4;
        this.f6771f = i3;
        this.f6772g = i4;
        this.f6773h = zVar;
    }

    public long a() {
        return this.f6773h.f6839a;
    }

    public float b() {
        return this.f6773h.f6840b;
    }

    public boolean c() {
        int i2 = this.f6767b;
        return i2 == 3 || i2 == 4;
    }
}
