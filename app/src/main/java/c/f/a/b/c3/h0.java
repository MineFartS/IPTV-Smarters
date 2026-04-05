package c.f.a.b.c3;

import android.net.Uri;
import c.f.a.b.c3.c0;
import c.f.a.b.c3.e0;
import c.f.a.b.i3.i0;
import c.f.a.b.i3.p0.d;
import c.f.a.b.i3.p0.k;
import c.f.a.b.i3.s;
import c.f.a.b.j3.k0;
import c.f.a.b.j3.n0;
import c.f.a.b.j3.x0;
import c.f.a.b.p1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h0<M extends e0<M>> implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c.f.a.b.i3.s f6720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0.a<M> f6721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList<i0> f6722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d.c f6723d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c.f.a.b.i3.p0.b f6724e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c.f.a.b.i3.p0.i f6725f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k0 f6726g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Executor f6727h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList<n0<?, ?>> f6728i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile boolean f6729j;

    public class a extends n0<M, IOException> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ c.f.a.b.i3.p f6730i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ c.f.a.b.i3.s f6731j;

        public a(c.f.a.b.i3.p pVar, c.f.a.b.i3.s sVar) {
            this.f6730i = pVar;
            this.f6731j = sVar;
        }

        @Override // c.f.a.b.j3.n0
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public M d() {
            return (M) c.f.a.b.i3.i0.g(this.f6730i, h0.this.f6721b, this.f6731j, 4);
        }
    }

    public static final class b implements k.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c0.a f6733a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f6734b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f6735c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f6736d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f6737e;

        public b(c0.a aVar, long j2, int i2, long j3, int i3) {
            this.f6733a = aVar;
            this.f6734b = j2;
            this.f6735c = i2;
            this.f6736d = j3;
            this.f6737e = i3;
        }

        @Override // c.f.a.b.i3.p0.k.a
        public void a(long j2, long j3, long j4) {
            long j5 = this.f6736d + j4;
            this.f6736d = j5;
            this.f6733a.a(this.f6734b, j5, b());
        }

        public final float b() {
            long j2 = this.f6734b;
            if (j2 != -1 && j2 != 0) {
                return (this.f6736d * 100.0f) / j2;
            }
            int i2 = this.f6735c;
            if (i2 != 0) {
                return (this.f6737e * 100.0f) / i2;
            }
            return -1.0f;
        }

        public void c() {
            this.f6737e++;
            this.f6733a.a(this.f6734b, this.f6736d, b());
        }
    }

    public static class c implements Comparable<c> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f6738b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c.f.a.b.i3.s f6739c;

        public c(long j2, c.f.a.b.i3.s sVar) {
            this.f6738b = j2;
            this.f6739c = sVar;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            return x0.p(this.f6738b, cVar.f6738b);
        }
    }

    public static final class d extends n0<Void, IOException> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final c f6740i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final c.f.a.b.i3.p0.d f6741j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final b f6742k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final byte[] f6743l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final c.f.a.b.i3.p0.k f6744m;

        public d(c cVar, c.f.a.b.i3.p0.d dVar, b bVar, byte[] bArr) {
            this.f6740i = cVar;
            this.f6741j = dVar;
            this.f6742k = bVar;
            this.f6743l = bArr;
            this.f6744m = new c.f.a.b.i3.p0.k(dVar, cVar.f6739c, bArr, bVar);
        }

        @Override // c.f.a.b.j3.n0
        public void c() {
            this.f6744m.b();
        }

        @Override // c.f.a.b.j3.n0
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Void d() throws IOException {
            this.f6744m.a();
            b bVar = this.f6742k;
            if (bVar == null) {
                return null;
            }
            bVar.c();
            return null;
        }
    }

    public h0(p1 p1Var, i0.a<M> aVar, d.c cVar, Executor executor) {
        c.f.a.b.j3.g.e(p1Var.f9643d);
        this.f6720a = f(p1Var.f9643d.f9685a);
        this.f6721b = aVar;
        this.f6722c = new ArrayList<>(p1Var.f9643d.f9689e);
        this.f6723d = cVar;
        this.f6727h = executor;
        this.f6724e = (c.f.a.b.i3.p0.b) c.f.a.b.j3.g.e(cVar.f());
        this.f6725f = cVar.g();
        this.f6726g = cVar.h();
        this.f6728i = new ArrayList<>();
    }

    public static boolean d(c.f.a.b.i3.s sVar, c.f.a.b.i3.s sVar2) {
        if (sVar.f9061a.equals(sVar2.f9061a)) {
            long j2 = sVar.f9068h;
            if (j2 != -1 && sVar.f9067g + j2 == sVar2.f9067g && x0.b(sVar.f9069i, sVar2.f9069i) && sVar.f9070j == sVar2.f9070j && sVar.f9063c == sVar2.f9063c && sVar.f9065e.equals(sVar2.f9065e)) {
                return true;
            }
        }
        return false;
    }

    public static c.f.a.b.i3.s f(Uri uri) {
        return new s.b().i(uri).b(1).a();
    }

    public static void i(List<c> list, c.f.a.b.i3.p0.i iVar) {
        HashMap map = new HashMap();
        int i2 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            c cVar = list.get(i3);
            String strA = iVar.a(cVar.f6739c);
            Integer num = (Integer) map.get(strA);
            c cVar2 = num == null ? null : list.get(num.intValue());
            if (cVar2 == null || cVar.f6738b > cVar2.f6738b + 20000000 || !d(cVar2.f6739c, cVar.f6739c)) {
                map.put(strA, Integer.valueOf(i2));
                list.set(i2, cVar);
                i2++;
            } else {
                long j2 = cVar.f6739c.f9068h;
                list.set(((Integer) c.f.a.b.j3.g.e(num)).intValue(), new c(cVar2.f6738b, cVar2.f6739c.f(0L, j2 != -1 ? cVar2.f6739c.f9068h + j2 : -1L)));
            }
        }
        x0.N0(list, i2, list.size());
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x01a7 A[LOOP:1: B:84:0x019f->B:86:0x01a7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01c0 A[LOOP:2: B:88:0x01be->B:89:0x01c0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01d5  */
    @Override // c.f.a.b.c3.c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(c.f.a.b.c3.c0.a r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 477
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.c3.h0.a(c.f.a.b.c3.c0$a):void");
    }

    public final <T> void c(n0<T, ?> n0Var) {
        synchronized (this.f6728i) {
            if (this.f6729j) {
                throw new InterruptedException();
            }
            this.f6728i.add(n0Var);
        }
    }

    @Override // c.f.a.b.c3.c0
    public void cancel() {
        synchronized (this.f6728i) {
            this.f6729j = true;
            for (int i2 = 0; i2 < this.f6728i.size(); i2++) {
                this.f6728i.get(i2).cancel(true);
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:23|38|24|(2:27|(2:29|46)(3:45|31|32))(2:26|47)|30) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0040, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0042, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0043, code lost:
    
        r0 = (java.lang.Throwable) c.f.a.b.j3.g.e(r4.getCause());
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        if ((r0 instanceof c.f.a.b.j3.k0.a) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0054, code lost:
    
        if ((r0 instanceof java.io.IOException) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0056, code lost:
    
        c.f.a.b.j3.x0.S0(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0062, code lost:
    
        throw ((java.io.IOException) r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0063, code lost:
    
        r3.a();
        k(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0069, code lost:
    
        throw r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <T> T e(c.f.a.b.j3.n0<T, ?> r3, boolean r4) throws java.lang.Throwable {
        /*
            r2 = this;
            if (r4 == 0) goto L20
            r3.run()
            java.lang.Object r3 = r3.get()     // Catch: java.util.concurrent.ExecutionException -> La
            return r3
        La:
            r4 = move-exception
            java.lang.Throwable r0 = r4.getCause()
            java.lang.Object r0 = c.f.a.b.j3.g.e(r0)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            boolean r1 = r0 instanceof java.io.IOException
            if (r1 != 0) goto L1d
            c.f.a.b.j3.x0.S0(r4)
            goto L20
        L1d:
            java.io.IOException r0 = (java.io.IOException) r0
            throw r0
        L20:
            boolean r4 = r2.f6729j
            if (r4 != 0) goto L6a
            c.f.a.b.j3.k0 r4 = r2.f6726g
            if (r4 == 0) goto L2d
            r0 = -1000(0xfffffffffffffc18, float:NaN)
            r4.b(r0)
        L2d:
            r2.c(r3)
            java.util.concurrent.Executor r4 = r2.f6727h
            r4.execute(r3)
            java.lang.Object r4 = r3.get()     // Catch: java.lang.Throwable -> L40 java.util.concurrent.ExecutionException -> L42
            r3.a()
            r2.k(r3)
            return r4
        L40:
            r4 = move-exception
            goto L63
        L42:
            r4 = move-exception
            java.lang.Throwable r0 = r4.getCause()     // Catch: java.lang.Throwable -> L40
            java.lang.Object r0 = c.f.a.b.j3.g.e(r0)     // Catch: java.lang.Throwable -> L40
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch: java.lang.Throwable -> L40
            boolean r1 = r0 instanceof c.f.a.b.j3.k0.a     // Catch: java.lang.Throwable -> L40
            if (r1 == 0) goto L52
            goto L59
        L52:
            boolean r1 = r0 instanceof java.io.IOException     // Catch: java.lang.Throwable -> L40
            if (r1 != 0) goto L60
            c.f.a.b.j3.x0.S0(r4)     // Catch: java.lang.Throwable -> L40
        L59:
            r3.a()
            r2.k(r3)
            goto L20
        L60:
            java.io.IOException r0 = (java.io.IOException) r0     // Catch: java.lang.Throwable -> L40
            throw r0     // Catch: java.lang.Throwable -> L40
        L63:
            r3.a()
            r2.k(r3)
            throw r4
        L6a:
            java.lang.InterruptedException r3 = new java.lang.InterruptedException
            r3.<init>()
            goto L71
        L70:
            throw r3
        L71:
            goto L70
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.c3.h0.e(c.f.a.b.j3.n0, boolean):java.lang.Object");
    }

    public final M g(c.f.a.b.i3.p pVar, c.f.a.b.i3.s sVar, boolean z) {
        return (M) e(new a(pVar, sVar), z);
    }

    public abstract List<c> h(c.f.a.b.i3.p pVar, M m2, boolean z);

    public final void j(int i2) {
        synchronized (this.f6728i) {
            this.f6728i.remove(i2);
        }
    }

    public final void k(n0<?, ?> n0Var) {
        synchronized (this.f6728i) {
            this.f6728i.remove(n0Var);
        }
    }

    @Override // c.f.a.b.c3.c0
    public final void remove() {
        c.f.a.b.i3.p0.d dVarD = this.f6723d.d();
        try {
            try {
                List<c> listH = h(dVarD, g(dVarD, this.f6720a, true), true);
                for (int i2 = 0; i2 < listH.size(); i2++) {
                    this.f6724e.i(this.f6725f.a(listH.get(i2).f6739c));
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (Exception unused2) {
            }
        } finally {
            this.f6724e.i(this.f6725f.a(this.f6720a));
        }
    }
}
