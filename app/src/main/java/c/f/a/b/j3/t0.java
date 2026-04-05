package c.f.a.b.j3;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class t0<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f9280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public V[] f9281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9283d;

    public t0() {
        this(10);
    }

    public t0(int i2) {
        this.f9280a = new long[i2];
        this.f9281b = (V[]) f(i2);
    }

    public static <V> V[] f(int i2) {
        return (V[]) new Object[i2];
    }

    public synchronized void a(long j2, V v) {
        d(j2);
        e();
        b(j2, v);
    }

    public final void b(long j2, V v) {
        int i2 = this.f9282c;
        int i3 = this.f9283d;
        V[] vArr = this.f9281b;
        int length = (i2 + i3) % vArr.length;
        this.f9280a[length] = j2;
        vArr[length] = v;
        this.f9283d = i3 + 1;
    }

    public synchronized void c() {
        this.f9282c = 0;
        this.f9283d = 0;
        Arrays.fill(this.f9281b, (Object) null);
    }

    public final void d(long j2) {
        if (this.f9283d > 0) {
            if (j2 <= this.f9280a[((this.f9282c + r0) - 1) % this.f9281b.length]) {
                c();
            }
        }
    }

    public final void e() {
        int length = this.f9281b.length;
        if (this.f9283d < length) {
            return;
        }
        int i2 = length * 2;
        long[] jArr = new long[i2];
        V[] vArr = (V[]) f(i2);
        int i3 = this.f9282c;
        int i4 = length - i3;
        System.arraycopy(this.f9280a, i3, jArr, 0, i4);
        System.arraycopy(this.f9281b, this.f9282c, vArr, 0, i4);
        int i5 = this.f9282c;
        if (i5 > 0) {
            System.arraycopy(this.f9280a, 0, jArr, i4, i5);
            System.arraycopy(this.f9281b, 0, vArr, i4, this.f9282c);
        }
        this.f9280a = jArr;
        this.f9281b = vArr;
        this.f9282c = 0;
    }

    public synchronized V g(long j2) {
        return h(j2, false);
    }

    public final V h(long j2, boolean z) {
        V vK = null;
        long j3 = Long.MAX_VALUE;
        while (this.f9283d > 0) {
            long j4 = j2 - this.f9280a[this.f9282c];
            if (j4 < 0 && (z || (-j4) >= j3)) {
                break;
            }
            vK = k();
            j3 = j4;
        }
        return vK;
    }

    public synchronized V i() {
        return this.f9283d == 0 ? null : k();
    }

    public synchronized V j(long j2) {
        return h(j2, true);
    }

    public final V k() {
        g.g(this.f9283d > 0);
        V[] vArr = this.f9281b;
        int i2 = this.f9282c;
        V v = vArr[i2];
        vArr[i2] = null;
        this.f9282c = (i2 + 1) % vArr.length;
        this.f9283d--;
        return v;
    }

    public synchronized int l() {
        return this.f9283d;
    }
}
