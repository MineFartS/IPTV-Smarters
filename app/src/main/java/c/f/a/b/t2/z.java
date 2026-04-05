package c.f.a.b.t2;

/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f10214b;

    public z(int i2, float f2) {
        this.f10213a = i2;
        this.f10214b = f2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z.class != obj.getClass()) {
            return false;
        }
        z zVar = (z) obj;
        return this.f10213a == zVar.f10213a && Float.compare(zVar.f10214b, this.f10214b) == 0;
    }

    public int hashCode() {
        return ((527 + this.f10213a) * 31) + Float.floatToIntBits(this.f10214b);
    }
}
