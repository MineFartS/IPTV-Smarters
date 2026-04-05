package c.d.a.n.i.n;

import c.d.a.n.i.n.h;
import java.util.Queue;

/* JADX INFO: loaded from: classes.dex */
public abstract class b<T extends h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Queue<T> f5600a = c.d.a.t.h.c(20);

    public abstract T a();

    public T b() {
        T tPoll = this.f5600a.poll();
        return tPoll == null ? (T) a() : tPoll;
    }

    public void c(T t) {
        if (this.f5600a.size() < 20) {
            this.f5600a.offer(t);
        }
    }
}
