package c.f.a.b;

import c.f.a.b.e3.i0;

/* JADX INFO: loaded from: classes.dex */
public final class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0.a f9801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f9802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f9803c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f9804d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f9805e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f9806f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f9807g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f9808h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f9809i;

    public s1(i0.a aVar, long j2, long j3, long j4, long j5, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = false;
        c.f.a.b.j3.g.a(!z4 || z2);
        c.f.a.b.j3.g.a(!z3 || z2);
        if (!z || (!z2 && !z3 && !z4)) {
            z5 = true;
        }
        c.f.a.b.j3.g.a(z5);
        this.f9801a = aVar;
        this.f9802b = j2;
        this.f9803c = j3;
        this.f9804d = j4;
        this.f9805e = j5;
        this.f9806f = z;
        this.f9807g = z2;
        this.f9808h = z3;
        this.f9809i = z4;
    }

    public s1 a(long j2) {
        return j2 == this.f9803c ? this : new s1(this.f9801a, this.f9802b, j2, this.f9804d, this.f9805e, this.f9806f, this.f9807g, this.f9808h, this.f9809i);
    }

    public s1 b(long j2) {
        return j2 == this.f9802b ? this : new s1(this.f9801a, j2, this.f9803c, this.f9804d, this.f9805e, this.f9806f, this.f9807g, this.f9808h, this.f9809i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s1.class != obj.getClass()) {
            return false;
        }
        s1 s1Var = (s1) obj;
        return this.f9802b == s1Var.f9802b && this.f9803c == s1Var.f9803c && this.f9804d == s1Var.f9804d && this.f9805e == s1Var.f9805e && this.f9806f == s1Var.f9806f && this.f9807g == s1Var.f9807g && this.f9808h == s1Var.f9808h && this.f9809i == s1Var.f9809i && c.f.a.b.j3.x0.b(this.f9801a, s1Var.f9801a);
    }

    public int hashCode() {
        return ((((((((((((((((527 + this.f9801a.hashCode()) * 31) + ((int) this.f9802b)) * 31) + ((int) this.f9803c)) * 31) + ((int) this.f9804d)) * 31) + ((int) this.f9805e)) * 31) + (this.f9806f ? 1 : 0)) * 31) + (this.f9807g ? 1 : 0)) * 31) + (this.f9808h ? 1 : 0)) * 31) + (this.f9809i ? 1 : 0);
    }
}
