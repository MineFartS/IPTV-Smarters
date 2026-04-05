package c.f.a.b.j3;

import android.util.SparseBooleanArray;

/* JADX INFO: loaded from: classes2.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseBooleanArray f9277a;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SparseBooleanArray f9278a = new SparseBooleanArray();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f9279b;

        public b a(int i2) {
            g.g(!this.f9279b);
            this.f9278a.append(i2, true);
            return this;
        }

        public b b(t tVar) {
            for (int i2 = 0; i2 < tVar.d(); i2++) {
                a(tVar.c(i2));
            }
            return this;
        }

        public b c(int... iArr) {
            for (int i2 : iArr) {
                a(i2);
            }
            return this;
        }

        public b d(int i2, boolean z) {
            return z ? a(i2) : this;
        }

        public t e() {
            g.g(!this.f9279b);
            this.f9279b = true;
            return new t(this.f9278a);
        }
    }

    public t(SparseBooleanArray sparseBooleanArray) {
        this.f9277a = sparseBooleanArray;
    }

    public boolean a(int i2) {
        return this.f9277a.get(i2);
    }

    public boolean b(int... iArr) {
        for (int i2 : iArr) {
            if (a(i2)) {
                return true;
            }
        }
        return false;
    }

    public int c(int i2) {
        g.c(i2, 0, d());
        return this.f9277a.keyAt(i2);
    }

    public int d() {
        return this.f9277a.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t) {
            return this.f9277a.equals(((t) obj).f9277a);
        }
        return false;
    }

    public int hashCode() {
        return this.f9277a.hashCode();
    }
}
