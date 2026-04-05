package a.b.p;

import a.i.r.b0;
import a.i.r.c0;
import a.i.r.d0;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Interpolator f387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c0 f388d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f389e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f386b = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d0 f390f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<b0> f385a = new ArrayList<>();

    public class a extends d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f391a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f392b = 0;

        public a() {
        }

        @Override // a.i.r.c0
        public void b(View view) {
            int i2 = this.f392b + 1;
            this.f392b = i2;
            if (i2 == h.this.f385a.size()) {
                c0 c0Var = h.this.f388d;
                if (c0Var != null) {
                    c0Var.b(null);
                }
                d();
            }
        }

        @Override // a.i.r.d0, a.i.r.c0
        public void c(View view) {
            if (this.f391a) {
                return;
            }
            this.f391a = true;
            c0 c0Var = h.this.f388d;
            if (c0Var != null) {
                c0Var.c(null);
            }
        }

        public void d() {
            this.f392b = 0;
            this.f391a = false;
            h.this.b();
        }
    }

    public void a() {
        if (this.f389e) {
            Iterator<b0> it = this.f385a.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
            this.f389e = false;
        }
    }

    public void b() {
        this.f389e = false;
    }

    public h c(b0 b0Var) {
        if (!this.f389e) {
            this.f385a.add(b0Var);
        }
        return this;
    }

    public h d(b0 b0Var, b0 b0Var2) {
        this.f385a.add(b0Var);
        b0Var2.j(b0Var.c());
        this.f385a.add(b0Var2);
        return this;
    }

    public h e(long j2) {
        if (!this.f389e) {
            this.f386b = j2;
        }
        return this;
    }

    public h f(Interpolator interpolator) {
        if (!this.f389e) {
            this.f387c = interpolator;
        }
        return this;
    }

    public h g(c0 c0Var) {
        if (!this.f389e) {
            this.f388d = c0Var;
        }
        return this;
    }

    public void h() {
        if (this.f389e) {
            return;
        }
        for (b0 b0Var : this.f385a) {
            long j2 = this.f386b;
            if (j2 >= 0) {
                b0Var.f(j2);
            }
            Interpolator interpolator = this.f387c;
            if (interpolator != null) {
                b0Var.g(interpolator);
            }
            if (this.f388d != null) {
                b0Var.h(this.f390f);
            }
            b0Var.l();
        }
        this.f389e = true;
    }
}
