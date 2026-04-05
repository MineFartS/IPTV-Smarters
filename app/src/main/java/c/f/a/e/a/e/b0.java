package c.f.a.e.a.e;

/* JADX INFO: loaded from: classes2.dex */
public final class b0<T> implements c0, z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f15709a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile c0<T> f15710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Object f15711c = f15709a;

    public b0(c0<T> c0Var) {
        this.f15710b = c0Var;
    }

    public static <P extends c0<T>, T> c0<T> b(P p) {
        n.c(p);
        return p instanceof b0 ? p : new b0(p);
    }

    public static <P extends c0<T>, T> z<T> c(P p) {
        if (p instanceof z) {
            return (z) p;
        }
        n.c(p);
        return new b0(p);
    }

    @Override // c.f.a.e.a.e.c0
    public final T a() {
        T tA = (T) this.f15711c;
        Object obj = f15709a;
        if (tA == obj) {
            synchronized (this) {
                tA = (T) this.f15711c;
                if (tA == obj) {
                    tA = this.f15710b.a();
                    Object obj2 = this.f15711c;
                    if (obj2 != obj && obj2 != tA) {
                        String strValueOf = String.valueOf(obj2);
                        String strValueOf2 = String.valueOf(tA);
                        StringBuilder sb = new StringBuilder(strValueOf.length() + 118 + strValueOf2.length());
                        sb.append("Scoped provider was invoked recursively returning different results: ");
                        sb.append(strValueOf);
                        sb.append(" & ");
                        sb.append(strValueOf2);
                        sb.append(". This is likely due to a circular dependency.");
                        throw new IllegalStateException(sb.toString());
                    }
                    this.f15711c = tA;
                    this.f15710b = null;
                }
            }
        }
        return tA;
    }
}
