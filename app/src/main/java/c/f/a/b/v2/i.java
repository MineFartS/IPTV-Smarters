package c.f.a.b.v2;

import c.f.a.b.v2.e;
import c.f.a.b.v2.f;
import c.f.a.b.v2.h;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public abstract class i<I extends f, O extends h, E extends e> implements c<I, O, E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Thread f10289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f10290b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayDeque<I> f10291c = new ArrayDeque<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayDeque<O> f10292d = new ArrayDeque<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final I[] f10293e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final O[] f10294f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f10295g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f10296h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public I f10297i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public E f10298j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f10299k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f10300l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f10301m;

    public class a extends Thread {
        public a(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            i.this.t();
        }
    }

    public i(I[] iArr, O[] oArr) {
        this.f10293e = iArr;
        this.f10295g = iArr.length;
        for (int i2 = 0; i2 < this.f10295g; i2++) {
            ((I[]) this.f10293e)[i2] = g();
        }
        this.f10294f = oArr;
        this.f10296h = oArr.length;
        for (int i3 = 0; i3 < this.f10296h; i3++) {
            ((O[]) this.f10294f)[i3] = h();
        }
        a aVar = new a("ExoPlayer:SimpleDecoder");
        this.f10289a = aVar;
        aVar.start();
    }

    public final boolean f() {
        return !this.f10291c.isEmpty() && this.f10296h > 0;
    }

    @Override // c.f.a.b.v2.c
    public final void flush() {
        synchronized (this.f10290b) {
            this.f10299k = true;
            this.f10301m = 0;
            I i2 = this.f10297i;
            if (i2 != null) {
                q(i2);
                this.f10297i = null;
            }
            while (!this.f10291c.isEmpty()) {
                q(this.f10291c.removeFirst());
            }
            while (!this.f10292d.isEmpty()) {
                this.f10292d.removeFirst().release();
            }
        }
    }

    public abstract I g();

    public abstract O h();

    public abstract E i(Throwable th);

    public abstract E j(I i2, O o2, boolean z);

    public final boolean k() {
        E e2;
        synchronized (this.f10290b) {
            while (!this.f10300l && !f()) {
                this.f10290b.wait();
            }
            if (this.f10300l) {
                return false;
            }
            I iRemoveFirst = this.f10291c.removeFirst();
            O[] oArr = this.f10294f;
            int i2 = this.f10296h - 1;
            this.f10296h = i2;
            O o2 = oArr[i2];
            boolean z = this.f10299k;
            this.f10299k = false;
            if (iRemoveFirst.isEndOfStream()) {
                o2.addFlag(4);
            } else {
                if (iRemoveFirst.isDecodeOnly()) {
                    o2.addFlag(Integer.MIN_VALUE);
                }
                try {
                    e2 = (E) j(iRemoveFirst, o2, z);
                } catch (OutOfMemoryError | RuntimeException e3) {
                    e2 = (E) i(e3);
                }
                if (e2 != null) {
                    synchronized (this.f10290b) {
                        this.f10298j = e2;
                    }
                    return false;
                }
            }
            synchronized (this.f10290b) {
                if (this.f10299k) {
                    o2.release();
                    q(iRemoveFirst);
                } else if (o2.isDecodeOnly()) {
                    this.f10301m++;
                    o2.release();
                    q(iRemoveFirst);
                } else {
                    o2.skippedOutputBufferCount = this.f10301m;
                    this.f10301m = 0;
                    this.f10292d.addLast(o2);
                    q(iRemoveFirst);
                }
            }
            return true;
        }
    }

    @Override // c.f.a.b.v2.c
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final I c() {
        I i2;
        synchronized (this.f10290b) {
            o();
            c.f.a.b.j3.g.g(this.f10297i == null);
            int i3 = this.f10295g;
            if (i3 == 0) {
                i2 = null;
            } else {
                I[] iArr = this.f10293e;
                int i4 = i3 - 1;
                this.f10295g = i4;
                i2 = iArr[i4];
            }
            this.f10297i = i2;
        }
        return i2;
    }

    @Override // c.f.a.b.v2.c
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final O b() {
        synchronized (this.f10290b) {
            o();
            if (this.f10292d.isEmpty()) {
                return null;
            }
            return this.f10292d.removeFirst();
        }
    }

    public final void n() {
        if (f()) {
            this.f10290b.notify();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: E extends c.f.a.b.v2.e */
    public final void o() throws E {
        E e2 = this.f10298j;
        if (e2 != null) {
            throw e2;
        }
    }

    @Override // c.f.a.b.v2.c
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final void d(I i2) {
        synchronized (this.f10290b) {
            o();
            c.f.a.b.j3.g.a(i2 == this.f10297i);
            this.f10291c.addLast(i2);
            n();
            this.f10297i = null;
        }
    }

    public final void q(I i2) {
        i2.clear();
        I[] iArr = this.f10293e;
        int i3 = this.f10295g;
        this.f10295g = i3 + 1;
        iArr[i3] = i2;
    }

    public void r(O o2) {
        synchronized (this.f10290b) {
            s(o2);
            n();
        }
    }

    @Override // c.f.a.b.v2.c
    public void release() {
        synchronized (this.f10290b) {
            this.f10300l = true;
            this.f10290b.notify();
        }
        try {
            this.f10289a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    public final void s(O o2) {
        o2.clear();
        O[] oArr = this.f10294f;
        int i2 = this.f10296h;
        this.f10296h = i2 + 1;
        oArr[i2] = o2;
    }

    public final void t() {
        do {
            try {
            } catch (InterruptedException e2) {
                throw new IllegalStateException(e2);
            }
        } while (k());
    }

    public final void u(int i2) {
        c.f.a.b.j3.g.g(this.f10295g == this.f10293e.length);
        for (I i3 : this.f10293e) {
            i3.i(i2);
        }
    }
}
