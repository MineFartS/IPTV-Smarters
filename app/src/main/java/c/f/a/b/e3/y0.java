package c.f.a.b.e3;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes2.dex */
public final class y0<V> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.f.a.b.j3.m<V> f8050c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray<V> f8049b = new SparseArray<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8048a = -1;

    public y0(c.f.a.b.j3.m<V> mVar) {
        this.f8050c = mVar;
    }

    public void a(int i2, V v) {
        if (this.f8048a == -1) {
            c.f.a.b.j3.g.g(this.f8049b.size() == 0);
            this.f8048a = 0;
        }
        if (this.f8049b.size() > 0) {
            SparseArray<V> sparseArray = this.f8049b;
            int iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
            c.f.a.b.j3.g.a(i2 >= iKeyAt);
            if (iKeyAt == i2) {
                c.f.a.b.j3.m<V> mVar = this.f8050c;
                SparseArray<V> sparseArray2 = this.f8049b;
                mVar.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.f8049b.append(i2, v);
    }

    public void b() {
        for (int i2 = 0; i2 < this.f8049b.size(); i2++) {
            this.f8050c.accept(this.f8049b.valueAt(i2));
        }
        this.f8048a = -1;
        this.f8049b.clear();
    }

    public void c(int i2) {
        for (int size = this.f8049b.size() - 1; size >= 0 && i2 < this.f8049b.keyAt(size); size--) {
            this.f8050c.accept(this.f8049b.valueAt(size));
            this.f8049b.removeAt(size);
        }
        this.f8048a = this.f8049b.size() > 0 ? Math.min(this.f8048a, this.f8049b.size() - 1) : -1;
    }

    public void d(int i2) {
        int i3 = 0;
        while (i3 < this.f8049b.size() - 1) {
            int i4 = i3 + 1;
            if (i2 < this.f8049b.keyAt(i4)) {
                return;
            }
            this.f8050c.accept(this.f8049b.valueAt(i3));
            this.f8049b.removeAt(i3);
            int i5 = this.f8048a;
            if (i5 > 0) {
                this.f8048a = i5 - 1;
            }
            i3 = i4;
        }
    }

    public V e(int i2) {
        if (this.f8048a == -1) {
            this.f8048a = 0;
        }
        while (true) {
            int i3 = this.f8048a;
            if (i3 <= 0 || i2 >= this.f8049b.keyAt(i3)) {
                break;
            }
            this.f8048a--;
        }
        while (this.f8048a < this.f8049b.size() - 1 && i2 >= this.f8049b.keyAt(this.f8048a + 1)) {
            this.f8048a++;
        }
        return this.f8049b.valueAt(this.f8048a);
    }

    public V f() {
        return this.f8049b.valueAt(r0.size() - 1);
    }

    public boolean g() {
        return this.f8049b.size() == 0;
    }
}
