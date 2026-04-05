package c.f.a.b.e3.e1.p;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7154c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f7155d;

    public b(String str) {
        this(str, str, 1, 1);
    }

    public b(String str, String str2, int i2, int i3) {
        this.f7152a = str;
        this.f7153b = str2;
        this.f7154c = i2;
        this.f7155d = i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f7154c == bVar.f7154c && this.f7155d == bVar.f7155d && c.f.b.a.h.a(this.f7152a, bVar.f7152a) && c.f.b.a.h.a(this.f7153b, bVar.f7153b);
    }

    public int hashCode() {
        return c.f.b.a.h.b(this.f7152a, this.f7153b, Integer.valueOf(this.f7154c), Integer.valueOf(this.f7155d));
    }
}
