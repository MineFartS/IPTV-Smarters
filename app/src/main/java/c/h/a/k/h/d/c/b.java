package c.h.a.k.h.d.c;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f17919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17920c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f17921d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f17922e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f17923f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b f17924g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b f17925h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f17926i;

    public b(a aVar, long j2, long j3, String str, String str2, String str3) {
        this.f17922e = aVar;
        this.f17918a = j2;
        this.f17919b = j3;
        this.f17920c = str;
        this.f17923f = str2;
        this.f17921d = str3;
    }

    public a a() {
        return this.f17922e;
    }

    public String b() {
        return this.f17921d;
    }

    public long c() {
        return this.f17919b;
    }

    public b d() {
        return this.f17925h;
    }

    public b e() {
        return this.f17924g;
    }

    public long f() {
        return this.f17918a;
    }

    public String g() {
        return this.f17920c;
    }

    public boolean h(int i2) {
        long jCurrentTimeMillis = System.currentTimeMillis() + ((long) i2);
        return jCurrentTimeMillis >= this.f17918a && jCurrentTimeMillis <= this.f17919b;
    }

    public boolean i() {
        return this.f17926i;
    }

    public void j(b bVar) {
        this.f17925h = bVar;
    }

    public void k(b bVar) {
        this.f17924g = bVar;
    }
}
