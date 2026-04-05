package c.f.a.a;

/* JADX INFO: loaded from: classes.dex */
public final class a<T> extends c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f6008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f6009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f6010c;

    public a(Integer num, T t, d dVar) {
        this.f6008a = num;
        if (t == null) {
            throw new NullPointerException("Null payload");
        }
        this.f6009b = t;
        if (dVar == null) {
            throw new NullPointerException("Null priority");
        }
        this.f6010c = dVar;
    }

    @Override // c.f.a.a.c
    public Integer a() {
        return this.f6008a;
    }

    @Override // c.f.a.a.c
    public T b() {
        return this.f6009b;
    }

    @Override // c.f.a.a.c
    public d c() {
        return this.f6010c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        Integer num = this.f6008a;
        if (num != null ? num.equals(cVar.a()) : cVar.a() == null) {
            if (this.f6009b.equals(cVar.b()) && this.f6010c.equals(cVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.f6008a;
        return (((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f6009b.hashCode()) * 1000003) ^ this.f6010c.hashCode();
    }

    public String toString() {
        return "Event{code=" + this.f6008a + ", payload=" + this.f6009b + ", priority=" + this.f6010c + "}";
    }
}
