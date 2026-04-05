package c.f.a.b.e3.g1;

import c.f.a.b.e3.g1.p;
import java.util.Comparator;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes2.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TreeSet<a> f7655a = new TreeSet<>(new Comparator() { // from class: c.f.a.b.e3.g1.c
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return p.b(((p.a) obj).f7659a.f7617h, ((p.a) obj2).f7659a.f7617h);
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7657c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f7658d;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o f7659a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f7660b;

        public a(o oVar, long j2) {
            this.f7659a = oVar;
            this.f7660b = j2;
        }
    }

    public p() {
        h();
    }

    public static int b(int i2, int i3) {
        int iMin;
        int i4 = i2 - i3;
        return (Math.abs(i4) <= 1000 || (iMin = (Math.min(i2, i3) - Math.max(i2, i3)) + 65535) >= 1000) ? i4 : i2 < i3 ? iMin : -iMin;
    }

    public static int d(int i2) {
        return (i2 + 1) % 65535;
    }

    public static int g(int i2) {
        if (i2 == 0) {
            return 65534;
        }
        return (i2 - 1) % 65535;
    }

    public final synchronized void a(a aVar) {
        this.f7656b = aVar.f7659a.f7617h;
        this.f7655a.add(aVar);
    }

    public synchronized boolean e(o oVar, long j2) {
        if (this.f7655a.size() >= 5000) {
            throw new IllegalStateException("Queue size limit of 5000 reached.");
        }
        int i2 = oVar.f7617h;
        if (!this.f7658d) {
            h();
            this.f7657c = g(i2);
            this.f7658d = true;
            a(new a(oVar, j2));
            return true;
        }
        if (Math.abs(b(i2, d(this.f7656b))) < 1000) {
            if (b(i2, this.f7657c) <= 0) {
                return false;
            }
            a(new a(oVar, j2));
            return true;
        }
        this.f7657c = g(i2);
        this.f7655a.clear();
        a(new a(oVar, j2));
        return true;
    }

    public synchronized o f(long j2) {
        if (this.f7655a.isEmpty()) {
            return null;
        }
        a aVarFirst = this.f7655a.first();
        int i2 = aVarFirst.f7659a.f7617h;
        if (i2 != d(this.f7657c) && j2 < aVarFirst.f7660b) {
            return null;
        }
        this.f7655a.pollFirst();
        this.f7657c = i2;
        return aVarFirst.f7659a;
    }

    public synchronized void h() {
        this.f7655a.clear();
        this.f7658d = false;
        this.f7657c = -1;
        this.f7656b = -1;
    }
}
