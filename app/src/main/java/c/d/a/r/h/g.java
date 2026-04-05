package c.d.a.r.h;

/* JADX INFO: loaded from: classes.dex */
public abstract class g<Z> extends a<Z> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5932c;

    public g() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public g(int i2, int i3) {
        this.f5931b = i2;
        this.f5932c = i3;
    }

    @Override // c.d.a.r.h.j
    public final void i(h hVar) {
        if (c.d.a.t.h.k(this.f5931b, this.f5932c)) {
            hVar.e(this.f5931b, this.f5932c);
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + this.f5931b + " and height: " + this.f5932c + ", either provide dimensions in the constructor or call override()");
    }
}
