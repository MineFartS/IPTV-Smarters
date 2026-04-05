package a.v;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f3525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f3526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f3527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f3528d;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public q<?> f3529a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f3531c;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f3530b = false;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f3532d = false;

        public d a() {
            if (this.f3529a == null) {
                this.f3529a = q.e(this.f3531c);
            }
            return new d(this.f3529a, this.f3530b, this.f3531c, this.f3532d);
        }

        public a b(Object obj) {
            this.f3531c = obj;
            this.f3532d = true;
            return this;
        }

        public a c(boolean z) {
            this.f3530b = z;
            return this;
        }

        public a d(q<?> qVar) {
            this.f3529a = qVar;
            return this;
        }
    }

    public d(q<?> qVar, boolean z, Object obj, boolean z2) {
        if (!qVar.f() && z) {
            throw new IllegalArgumentException(qVar.c() + " does not allow nullable values");
        }
        if (!z && z2 && obj == null) {
            throw new IllegalArgumentException("Argument with type " + qVar.c() + " has null value but is not nullable.");
        }
        this.f3525a = qVar;
        this.f3526b = z;
        this.f3528d = obj;
        this.f3527c = z2;
    }

    public q<?> a() {
        return this.f3525a;
    }

    public boolean b() {
        return this.f3527c;
    }

    public void c(String str, Bundle bundle) {
        if (this.f3527c) {
            this.f3525a.i(bundle, str, this.f3528d);
        }
    }

    public boolean d(String str, Bundle bundle) {
        if (!this.f3526b && bundle.containsKey(str) && bundle.get(str) == null) {
            return false;
        }
        try {
            this.f3525a.b(bundle, str);
            return true;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f3526b != dVar.f3526b || this.f3527c != dVar.f3527c || !this.f3525a.equals(dVar.f3525a)) {
            return false;
        }
        Object obj2 = this.f3528d;
        Object obj3 = dVar.f3528d;
        return obj2 != null ? obj2.equals(obj3) : obj3 == null;
    }

    public int hashCode() {
        int iHashCode = ((((this.f3525a.hashCode() * 31) + (this.f3526b ? 1 : 0)) * 31) + (this.f3527c ? 1 : 0)) * 31;
        Object obj = this.f3528d;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }
}
