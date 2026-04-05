package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class me {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f22394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f22395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f22396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f22397d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f22398e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f22399f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private acw f22400g = acw.f19217a;

    public final int a(int i2) {
        return this.f22400g.a(i2).f19211b;
    }

    public final int b(long j2) {
        long j3 = this.f22397d;
        if (j2 == Long.MIN_VALUE || j3 == -9223372036854775807L) {
            return -1;
        }
        int i2 = (j2 > j3 ? 1 : (j2 == j3 ? 0 : -1));
        return -1;
    }

    public final int c(long j2) {
        return -1;
    }

    public final int d(int i2) {
        return this.f22400g.a(i2).a();
    }

    public final int e(int i2, int i3) {
        return this.f22400g.a(i2).b(i3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && me.class.equals(obj.getClass())) {
            me meVar = (me) obj;
            if (amn.O(this.f22394a, meVar.f22394a) && amn.O(this.f22395b, meVar.f22395b) && this.f22396c == meVar.f22396c && this.f22397d == meVar.f22397d && this.f22398e == meVar.f22398e && this.f22399f == meVar.f22399f && amn.O(this.f22400g, meVar.f22400g)) {
                return true;
            }
        }
        return false;
    }

    public final long f(int i2, int i3) {
        acv acvVarA = this.f22400g.a(i2);
        if (acvVarA.f19211b != -1) {
            return acvVarA.f19214e[i3];
        }
        return -9223372036854775807L;
    }

    public final void g(int i2) {
        long j2 = this.f22400g.a(i2).f19210a;
    }

    public final void h() {
        long j2 = this.f22400g.f19219b;
    }

    public final int hashCode() {
        Object obj = this.f22394a;
        int iHashCode = ((obj == null ? 0 : obj.hashCode()) + 217) * 31;
        Object obj2 = this.f22395b;
        int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
        int i2 = this.f22396c;
        long j2 = this.f22397d;
        long j3 = this.f22398e;
        return ((((((((((iHashCode + iHashCode2) * 31) + i2) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31) + (this.f22399f ? 1 : 0)) * 31) + this.f22400g.hashCode();
    }

    public final void i(int i2) {
        long j2 = this.f22400g.a(i2).f19215f;
    }

    public final void j(int i2) {
        boolean z = this.f22400g.a(i2).f19216g;
    }

    public final me k(Object obj, Object obj2, long j2, long j3) {
        l(obj, obj2, j2, j3, acw.f19217a, false);
        return this;
    }

    public final void l(Object obj, Object obj2, long j2, long j3, acw acwVar, boolean z) {
        this.f22394a = obj;
        this.f22395b = obj2;
        this.f22396c = 0;
        this.f22397d = j2;
        this.f22398e = j3;
        this.f22400g = acwVar;
        this.f22399f = z;
    }
}
