package c.f.a.b.e3.e1.p;

import android.net.Uri;
import c.f.a.b.e3.e1.p.k;
import c.f.a.b.k1;
import c.f.b.b.t;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f7203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k1 f7204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t<c.f.a.b.e3.e1.p.b> f7205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f7206d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<e> f7207e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i f7208f;

    public static class b extends j implements c.f.a.b.e3.e1.j {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final k.a f7209g;

        public b(long j2, k1 k1Var, List<c.f.a.b.e3.e1.p.b> list, k.a aVar, List<e> list2) {
            super(j2, k1Var, list, aVar, list2);
            this.f7209g = aVar;
        }

        @Override // c.f.a.b.e3.e1.j
        public long a(long j2, long j3) {
            return this.f7209g.h(j2, j3);
        }

        @Override // c.f.a.b.e3.e1.j
        public long b(long j2) {
            return this.f7209g.j(j2);
        }

        @Override // c.f.a.b.e3.e1.j
        public long c(long j2, long j3) {
            return this.f7209g.d(j2, j3);
        }

        @Override // c.f.a.b.e3.e1.j
        public long d(long j2, long j3) {
            return this.f7209g.f(j2, j3);
        }

        @Override // c.f.a.b.e3.e1.j
        public i e(long j2) {
            return this.f7209g.k(this, j2);
        }

        @Override // c.f.a.b.e3.e1.j
        public long f(long j2, long j3) {
            return this.f7209g.i(j2, j3);
        }

        @Override // c.f.a.b.e3.e1.j
        public boolean g() {
            return this.f7209g.l();
        }

        @Override // c.f.a.b.e3.e1.j
        public long h() {
            return this.f7209g.e();
        }

        @Override // c.f.a.b.e3.e1.j
        public long i(long j2) {
            return this.f7209g.g(j2);
        }

        @Override // c.f.a.b.e3.e1.j
        public long j(long j2, long j3) {
            return this.f7209g.c(j2, j3);
        }

        @Override // c.f.a.b.e3.e1.p.j
        public String k() {
            return null;
        }

        @Override // c.f.a.b.e3.e1.p.j
        public c.f.a.b.e3.e1.j l() {
            return this;
        }

        @Override // c.f.a.b.e3.e1.p.j
        public i m() {
            return null;
        }
    }

    public static class c extends j {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Uri f7210g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final long f7211h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final String f7212i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final i f7213j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final m f7214k;

        public c(long j2, k1 k1Var, List<c.f.a.b.e3.e1.p.b> list, k.e eVar, List<e> list2, String str, long j3) {
            super(j2, k1Var, list, eVar, list2);
            this.f7210g = Uri.parse(list.get(0).f7152a);
            i iVarC = eVar.c();
            this.f7213j = iVarC;
            this.f7212i = str;
            this.f7211h = j3;
            this.f7214k = iVarC != null ? null : new m(new i(null, 0L, j3));
        }

        @Override // c.f.a.b.e3.e1.p.j
        public String k() {
            return this.f7212i;
        }

        @Override // c.f.a.b.e3.e1.p.j
        public c.f.a.b.e3.e1.j l() {
            return this.f7214k;
        }

        @Override // c.f.a.b.e3.e1.p.j
        public i m() {
            return this.f7213j;
        }
    }

    public j(long j2, k1 k1Var, List<c.f.a.b.e3.e1.p.b> list, k kVar, List<e> list2) {
        c.f.a.b.j3.g.a(!list.isEmpty());
        this.f7203a = j2;
        this.f7204b = k1Var;
        this.f7205c = t.D(list);
        this.f7207e = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
        this.f7208f = kVar.a(this);
        this.f7206d = kVar.b();
    }

    public static j o(long j2, k1 k1Var, List<c.f.a.b.e3.e1.p.b> list, k kVar, List<e> list2) {
        return p(j2, k1Var, list, kVar, list2, null);
    }

    public static j p(long j2, k1 k1Var, List<c.f.a.b.e3.e1.p.b> list, k kVar, List<e> list2, String str) {
        if (kVar instanceof k.e) {
            return new c(j2, k1Var, list, (k.e) kVar, list2, str, -1L);
        }
        if (kVar instanceof k.a) {
            return new b(j2, k1Var, list, (k.a) kVar, list2);
        }
        throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
    }

    public abstract String k();

    public abstract c.f.a.b.e3.e1.j l();

    public abstract i m();

    public i n() {
        return this.f7208f;
    }
}
