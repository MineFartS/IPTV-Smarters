package c.f.a.b;

/* JADX INFO: loaded from: classes.dex */
public final class k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k2 f9356a = new k2(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f9357b;

    public k2(boolean z) {
        this.f9357b = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && k2.class == obj.getClass() && this.f9357b == ((k2) obj).f9357b;
    }

    public int hashCode() {
        return !this.f9357b ? 1 : 0;
    }
}
