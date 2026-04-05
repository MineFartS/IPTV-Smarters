package c.f.a.c.k.b;

/* JADX INFO: loaded from: classes2.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f14201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f14202d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f14203e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f14204f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f14205g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Long f14206h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Long f14207i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Long f14208j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Boolean f14209k;

    public p(String str, String str2, long j2, long j3, long j4, long j5, long j6, Long l2, Long l3, Long l4, Boolean bool) {
        c.f.a.c.f.q.o.e(str);
        c.f.a.c.f.q.o.e(str2);
        c.f.a.c.f.q.o.a(j2 >= 0);
        c.f.a.c.f.q.o.a(j3 >= 0);
        c.f.a.c.f.q.o.a(j4 >= 0);
        c.f.a.c.f.q.o.a(j6 >= 0);
        this.f14199a = str;
        this.f14200b = str2;
        this.f14201c = j2;
        this.f14202d = j3;
        this.f14203e = j4;
        this.f14204f = j5;
        this.f14205g = j6;
        this.f14206h = l2;
        this.f14207i = l3;
        this.f14208j = l4;
        this.f14209k = bool;
    }

    public final p a(long j2) {
        return new p(this.f14199a, this.f14200b, this.f14201c, this.f14202d, this.f14203e, j2, this.f14205g, this.f14206h, this.f14207i, this.f14208j, this.f14209k);
    }

    public final p b(long j2, long j3) {
        return new p(this.f14199a, this.f14200b, this.f14201c, this.f14202d, this.f14203e, this.f14204f, j2, Long.valueOf(j3), this.f14207i, this.f14208j, this.f14209k);
    }

    public final p c(Long l2, Long l3, Boolean bool) {
        return new p(this.f14199a, this.f14200b, this.f14201c, this.f14202d, this.f14203e, this.f14204f, this.f14205g, this.f14206h, l2, l3, (bool == null || bool.booleanValue()) ? bool : null);
    }
}
