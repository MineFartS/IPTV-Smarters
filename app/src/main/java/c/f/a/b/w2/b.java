package c.f.a.b.w2;

import c.f.a.b.v0;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f10312a = new b(0, 0, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v0<b> f10313b = new v0() { // from class: c.f.a.b.w2.a
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10314c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f10315d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f10316e;

    public b(int i2, int i3, int i4) {
        this.f10314c = i2;
        this.f10315d = i3;
        this.f10316e = i4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f10314c == bVar.f10314c && this.f10315d == bVar.f10315d && this.f10316e == bVar.f10316e;
    }

    public int hashCode() {
        return ((((527 + this.f10314c) * 31) + this.f10315d) * 31) + this.f10316e;
    }
}
