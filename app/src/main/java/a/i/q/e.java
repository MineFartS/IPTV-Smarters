package a.i.q;

/* JADX INFO: loaded from: classes.dex */
public class e<F, S> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F f1955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final S f1956b;

    public e(F f2, S s) {
        this.f1955a = f2;
        this.f1956b = s;
    }

    public static <A, B> e<A, B> a(A a2, B b2) {
        return new e<>(a2, b2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return d.a(eVar.f1955a, this.f1955a) && d.a(eVar.f1956b, this.f1956b);
    }

    public int hashCode() {
        F f2 = this.f1955a;
        int iHashCode = f2 == null ? 0 : f2.hashCode();
        S s = this.f1956b;
        return iHashCode ^ (s != null ? s.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.f1955a + " " + this.f1956b + "}";
    }
}
