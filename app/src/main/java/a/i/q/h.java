package a.i.q;

/* JADX INFO: loaded from: classes.dex */
public class h<T> extends g<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f1959c;

    public h(int i2) {
        super(i2);
        this.f1959c = new Object();
    }

    @Override // a.i.q.g, a.i.q.f
    public boolean a(T t) {
        boolean zA;
        synchronized (this.f1959c) {
            zA = super.a(t);
        }
        return zA;
    }

    @Override // a.i.q.g, a.i.q.f
    public T b() {
        T t;
        synchronized (this.f1959c) {
            t = (T) super.b();
        }
        return t;
    }
}
