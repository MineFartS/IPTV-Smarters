package c.d.a.t;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class e<T, Y> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5958c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap<T, Y> f5956a = new LinkedHashMap<>(100, 0.75f, true);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5959d = 0;

    public e(int i2) {
        this.f5958c = i2;
        this.f5957b = i2;
    }

    public void d() {
        m(0);
    }

    public final void f() {
        m(this.f5957b);
    }

    public Y g(T t) {
        return this.f5956a.get(t);
    }

    public int h() {
        return this.f5959d;
    }

    public int i(Y y) {
        return 1;
    }

    public void j(T t, Y y) {
    }

    public Y k(T t, Y y) {
        if (i(y) >= this.f5957b) {
            j(t, y);
            return null;
        }
        Y yPut = this.f5956a.put(t, y);
        if (y != null) {
            this.f5959d += i(y);
        }
        if (yPut != null) {
            this.f5959d -= i(yPut);
        }
        f();
        return yPut;
    }

    public Y l(T t) {
        Y yRemove = this.f5956a.remove(t);
        if (yRemove != null) {
            this.f5959d -= i(yRemove);
        }
        return yRemove;
    }

    public void m(int i2) {
        while (this.f5959d > i2) {
            Map.Entry<T, Y> next = this.f5956a.entrySet().iterator().next();
            Y value = next.getValue();
            this.f5959d -= i(value);
            T key = next.getKey();
            this.f5956a.remove(key);
            j(key, value);
        }
    }
}
