package c.f.c.o;

/* JADX INFO: loaded from: classes2.dex */
public class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<T> f16151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f16152b;

    public T a() {
        return this.f16152b;
    }

    public Class<T> b() {
        return this.f16151a;
    }

    public String toString() {
        return String.format("Event{type: %s, payload: %s}", this.f16151a, this.f16152b);
    }
}
