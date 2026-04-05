package c.f.a.b.j3;

import java.io.IOException;
import java.util.Collections;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes2.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f9216a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PriorityQueue<Integer> f9217b = new PriorityQueue<>(10, Collections.reverseOrder());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9218c = Integer.MIN_VALUE;

    public static class a extends IOException {
        public a(int i2, int i3) {
            super("Priority too low [priority=" + i2 + ", highest=" + i3 + "]");
        }
    }

    public void a(int i2) {
        synchronized (this.f9216a) {
            this.f9217b.add(Integer.valueOf(i2));
            this.f9218c = Math.max(this.f9218c, i2);
        }
    }

    public void b(int i2) {
        synchronized (this.f9216a) {
            while (this.f9218c != i2) {
                this.f9216a.wait();
            }
        }
    }

    public void c(int i2) {
        synchronized (this.f9216a) {
            if (this.f9218c != i2) {
                throw new a(i2, this.f9218c);
            }
        }
    }

    public void d(int i2) {
        synchronized (this.f9216a) {
            this.f9217b.remove(Integer.valueOf(i2));
            this.f9218c = this.f9217b.isEmpty() ? Integer.MIN_VALUE : ((Integer) x0.i(this.f9217b.peek())).intValue();
            this.f9216a.notifyAll();
        }
    }
}
