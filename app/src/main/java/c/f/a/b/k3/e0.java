package c.f.a.b.k3;

import c.f.a.b.v0;

/* JADX INFO: loaded from: classes2.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e0 f9369a = new e0(0, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v0<e0> f9370b = new v0() { // from class: c.f.a.b.k3.l
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9371c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9372d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f9373e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f9374f;

    public e0(int i2, int i3) {
        this(i2, i3, 0, 1.0f);
    }

    public e0(int i2, int i3, int i4, float f2) {
        this.f9371c = i2;
        this.f9372d = i3;
        this.f9373e = i4;
        this.f9374f = f2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return this.f9371c == e0Var.f9371c && this.f9372d == e0Var.f9372d && this.f9373e == e0Var.f9373e && this.f9374f == e0Var.f9374f;
    }

    public int hashCode() {
        return ((((((217 + this.f9371c) * 31) + this.f9372d) * 31) + this.f9373e) * 31) + Float.floatToRawIntBits(this.f9374f);
    }
}
