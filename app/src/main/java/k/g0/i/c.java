package k.g0.i;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l.f f30680a = l.f.s(":");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l.f f30681b = l.f.s(":status");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l.f f30682c = l.f.s(":method");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l.f f30683d = l.f.s(":path");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l.f f30684e = l.f.s(":scheme");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final l.f f30685f = l.f.s(":authority");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l.f f30686g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l.f f30687h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f30688i;

    public c(String str, String str2) {
        this(l.f.s(str), l.f.s(str2));
    }

    public c(l.f fVar, String str) {
        this(fVar, l.f.s(str));
    }

    public c(l.f fVar, l.f fVar2) {
        this.f30686g = fVar;
        this.f30687h = fVar2;
        this.f30688i = fVar.size() + 32 + fVar2.size();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f30686g.equals(cVar.f30686g) && this.f30687h.equals(cVar.f30687h);
    }

    public int hashCode() {
        return ((527 + this.f30686g.hashCode()) * 31) + this.f30687h.hashCode();
    }

    public String toString() {
        return k.g0.c.l("%s: %s", this.f30686g.E(), this.f30687h.E());
    }
}
