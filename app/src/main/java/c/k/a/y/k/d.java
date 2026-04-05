package c.k.a.y.k;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l.f f18471a = l.f.s(":status");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l.f f18472b = l.f.s(":method");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l.f f18473c = l.f.s(":path");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l.f f18474d = l.f.s(":scheme");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l.f f18475e = l.f.s(":authority");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final l.f f18476f = l.f.s(":host");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final l.f f18477g = l.f.s(":version");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l.f f18478h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l.f f18479i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f18480j;

    public d(String str, String str2) {
        this(l.f.s(str), l.f.s(str2));
    }

    public d(l.f fVar, String str) {
        this(fVar, l.f.s(str));
    }

    public d(l.f fVar, l.f fVar2) {
        this.f18478h = fVar;
        this.f18479i = fVar2;
        this.f18480j = fVar.size() + 32 + fVar2.size();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f18478h.equals(dVar.f18478h) && this.f18479i.equals(dVar.f18479i);
    }

    public int hashCode() {
        return ((527 + this.f18478h.hashCode()) * 31) + this.f18479i.hashCode();
    }

    public String toString() {
        return String.format("%s: %s", this.f18478h.E(), this.f18479i.E());
    }
}
