package c.d.a.t;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Class<?> f5961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Class<?> f5962b;

    public g() {
    }

    public g(Class<?> cls, Class<?> cls2) {
        a(cls, cls2);
    }

    public void a(Class<?> cls, Class<?> cls2) {
        this.f5961a = cls;
        this.f5962b = cls2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        return this.f5961a.equals(gVar.f5961a) && this.f5962b.equals(gVar.f5962b);
    }

    public int hashCode() {
        return (this.f5961a.hashCode() * 31) + this.f5962b.hashCode();
    }

    public String toString() {
        return "MultiClassKey{first=" + this.f5961a + ", second=" + this.f5962b + '}';
    }
}
