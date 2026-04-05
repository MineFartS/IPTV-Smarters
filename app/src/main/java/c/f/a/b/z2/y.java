package c.f.a.b.z2;

/* JADX INFO: loaded from: classes2.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y f11511a = new y(0, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f11512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f11513c;

    public y(long j2, long j3) {
        this.f11512b = j2;
        this.f11513c = j3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y.class != obj.getClass()) {
            return false;
        }
        y yVar = (y) obj;
        return this.f11512b == yVar.f11512b && this.f11513c == yVar.f11513c;
    }

    public int hashCode() {
        return (((int) this.f11512b) * 31) + ((int) this.f11513c);
    }

    public String toString() {
        return "[timeUs=" + this.f11512b + ", position=" + this.f11513c + "]";
    }
}
