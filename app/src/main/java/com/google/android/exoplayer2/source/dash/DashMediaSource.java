package com.google.android.exoplayer2.source.dash;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import c.f.a.b.e3.a0;
import c.f.a.b.e3.d0;
import c.f.a.b.e3.e1.g;
import c.f.a.b.e3.e1.i;
import c.f.a.b.e3.e1.j;
import c.f.a.b.e3.e1.m;
import c.f.a.b.e3.e1.o;
import c.f.a.b.e3.i0;
import c.f.a.b.e3.j0;
import c.f.a.b.e3.k0;
import c.f.a.b.e3.n;
import c.f.a.b.e3.u;
import c.f.a.b.i1;
import c.f.a.b.i3.f0;
import c.f.a.b.i3.g0;
import c.f.a.b.i3.h0;
import c.f.a.b.i3.i0;
import c.f.a.b.i3.n0;
import c.f.a.b.i3.p;
import c.f.a.b.i3.y;
import c.f.a.b.j3.p0;
import c.f.a.b.j3.x0;
import c.f.a.b.j3.z;
import c.f.a.b.p1;
import c.f.a.b.p2;
import c.f.a.b.w0;
import c.f.a.b.w1;
import c.f.a.b.x2.c0;
import c.f.a.b.x2.e0;
import c.f.a.b.x2.v;
import com.google.android.exoplayer2.source.dash.DashMediaSource;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class DashMediaSource extends n {
    public g0 A;
    public n0 B;
    public IOException C;
    public Handler D;
    public p1.f E;
    public Uri F;
    public Uri G;
    public c.f.a.b.e3.e1.p.c H;
    public boolean I;
    public long J;
    public long K;
    public long L;
    public int M;
    public long N;
    public int O;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p1 f23917h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f23918i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p.a f23919j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final g.a f23920k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final u f23921l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final c0 f23922m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final f0 f23923n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final c.f.a.b.e3.e1.f f23924o;
    public final long p;
    public final j0.a q;
    public final i0.a<? extends c.f.a.b.e3.e1.p.c> r;
    public final e s;
    public final Object t;
    public final SparseArray<i> u;
    public final Runnable v;
    public final Runnable w;
    public final o.b x;
    public final h0 y;
    public p z;

    public static final class Factory implements k0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g.a f23925a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final p.a f23926b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f23927c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public e0 f23928d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public u f23929e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public f0 f23930f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f23931g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f23932h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public i0.a<? extends c.f.a.b.e3.e1.p.c> f23933i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public List<c.f.a.b.c3.i0> f23934j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f23935k;

        public Factory(g.a aVar, p.a aVar2) {
            this.f23925a = (g.a) c.f.a.b.j3.g.e(aVar);
            this.f23926b = aVar2;
            this.f23928d = new v();
            this.f23930f = new y();
            this.f23931g = -9223372036854775807L;
            this.f23932h = 30000L;
            this.f23929e = new c.f.a.b.e3.v();
            this.f23934j = Collections.emptyList();
        }

        public Factory(p.a aVar) {
            this(new m.a(aVar), aVar);
        }

        public static /* synthetic */ c0 e(c0 c0Var, p1 p1Var) {
            return c0Var;
        }

        @Override // c.f.a.b.e3.k0
        public int[] b() {
            return new int[]{0};
        }

        @Override // c.f.a.b.e3.k0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public DashMediaSource a(p1 p1Var) {
            p1 p1VarA = p1Var;
            c.f.a.b.j3.g.e(p1VarA.f9643d);
            i0.a dVar = this.f23933i;
            if (dVar == null) {
                dVar = new c.f.a.b.e3.e1.p.d();
            }
            List<c.f.a.b.c3.i0> list = p1VarA.f9643d.f9689e.isEmpty() ? this.f23934j : p1VarA.f9643d.f9689e;
            i0.a f0Var = !list.isEmpty() ? new c.f.a.b.c3.f0(dVar, list) : dVar;
            p1.g gVar = p1VarA.f9643d;
            boolean z = gVar.f9692h == null && this.f23935k != null;
            boolean z2 = gVar.f9689e.isEmpty() && !list.isEmpty();
            boolean z3 = p1VarA.f9644e.f9680c == -9223372036854775807L && this.f23931g != -9223372036854775807L;
            if (z || z2 || z3) {
                p1.c cVarA = p1Var.a();
                if (z) {
                    cVarA.A(this.f23935k);
                }
                if (z2) {
                    cVarA.y(list);
                }
                if (z3) {
                    cVarA.u(this.f23931g);
                }
                p1VarA = cVarA.a();
            }
            p1 p1Var2 = p1VarA;
            return new DashMediaSource(p1Var2, null, this.f23926b, f0Var, this.f23925a, this.f23929e, this.f23928d.a(p1Var2), this.f23930f, this.f23932h, null);
        }

        @Override // c.f.a.b.e3.k0
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Factory c(final c0 c0Var) {
            if (c0Var == null) {
                g(null);
            } else {
                g(new e0() { // from class: c.f.a.b.e3.e1.c
                    @Override // c.f.a.b.x2.e0
                    public final c0 a(p1 p1Var) {
                        c0 c0Var2 = c0Var;
                        DashMediaSource.Factory.e(c0Var2, p1Var);
                        return c0Var2;
                    }
                });
            }
            return this;
        }

        public Factory g(e0 e0Var) {
            boolean z;
            if (e0Var != null) {
                this.f23928d = e0Var;
                z = true;
            } else {
                this.f23928d = new v();
                z = false;
            }
            this.f23927c = z;
            return this;
        }
    }

    public class a implements p0.b {
        public a() {
        }

        @Override // c.f.a.b.j3.p0.b
        public void a(IOException iOException) {
            DashMediaSource.this.Z(iOException);
        }

        @Override // c.f.a.b.j3.p0.b
        public void b() {
            DashMediaSource.this.a0(p0.h());
        }
    }

    public static final class b extends p2 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f23937c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f23938d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f23939e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f23940f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f23941g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final long f23942h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final long f23943i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final c.f.a.b.e3.e1.p.c f23944j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final p1 f23945k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final p1.f f23946l;

        public b(long j2, long j3, long j4, int i2, long j5, long j6, long j7, c.f.a.b.e3.e1.p.c cVar, p1 p1Var, p1.f fVar) {
            c.f.a.b.j3.g.g(cVar.f7159d == (fVar != null));
            this.f23937c = j2;
            this.f23938d = j3;
            this.f23939e = j4;
            this.f23940f = i2;
            this.f23941g = j5;
            this.f23942h = j6;
            this.f23943i = j7;
            this.f23944j = cVar;
            this.f23945k = p1Var;
            this.f23946l = fVar;
        }

        public static boolean t(c.f.a.b.e3.e1.p.c cVar) {
            return cVar.f7159d && cVar.f7160e != -9223372036854775807L && cVar.f7157b == -9223372036854775807L;
        }

        @Override // c.f.a.b.p2
        public int b(Object obj) {
            int iIntValue;
            if ((obj instanceof Integer) && (iIntValue = ((Integer) obj).intValue() - this.f23940f) >= 0 && iIntValue < i()) {
                return iIntValue;
            }
            return -1;
        }

        @Override // c.f.a.b.p2
        public p2.b g(int i2, p2.b bVar, boolean z) {
            c.f.a.b.j3.g.c(i2, 0, i());
            return bVar.s(z ? this.f23944j.d(i2).f7189a : null, z ? Integer.valueOf(this.f23940f + i2) : null, 0, this.f23944j.g(i2), w0.d(this.f23944j.d(i2).f7190b - this.f23944j.d(0).f7190b) - this.f23941g);
        }

        @Override // c.f.a.b.p2
        public int i() {
            return this.f23944j.e();
        }

        @Override // c.f.a.b.p2
        public Object m(int i2) {
            c.f.a.b.j3.g.c(i2, 0, i());
            return Integer.valueOf(this.f23940f + i2);
        }

        @Override // c.f.a.b.p2
        public p2.c o(int i2, p2.c cVar, long j2) {
            c.f.a.b.j3.g.c(i2, 0, 1);
            long jS = s(j2);
            Object obj = p2.c.f9709a;
            p1 p1Var = this.f23945k;
            c.f.a.b.e3.e1.p.c cVar2 = this.f23944j;
            return cVar.g(obj, p1Var, cVar2, this.f23937c, this.f23938d, this.f23939e, true, t(cVar2), this.f23946l, jS, this.f23942h, 0, i() - 1, this.f23941g);
        }

        @Override // c.f.a.b.p2
        public int p() {
            return 1;
        }

        public final long s(long j2) {
            j jVarL;
            long j3 = this.f23943i;
            if (!t(this.f23944j)) {
                return j3;
            }
            if (j2 > 0) {
                j3 += j2;
                if (j3 > this.f23942h) {
                    return -9223372036854775807L;
                }
            }
            long j4 = this.f23941g + j3;
            long jG = this.f23944j.g(0);
            int i2 = 0;
            while (i2 < this.f23944j.e() - 1 && j4 >= jG) {
                j4 -= jG;
                i2++;
                jG = this.f23944j.g(i2);
            }
            c.f.a.b.e3.e1.p.g gVarD = this.f23944j.d(i2);
            int iA = gVarD.a(2);
            return (iA == -1 || (jVarL = gVarD.f7191c.get(iA).f7148c.get(0).l()) == null || jVarL.i(jG) == 0) ? j3 : (j3 + jVarL.b(jVarL.f(j4, jG))) - j4;
        }
    }

    public final class c implements o.b {
        public c() {
        }

        public /* synthetic */ c(DashMediaSource dashMediaSource, a aVar) {
            this();
        }

        @Override // c.f.a.b.e3.e1.o.b
        public void a() {
            DashMediaSource.this.T();
        }

        @Override // c.f.a.b.e3.e1.o.b
        public void b(long j2) {
            DashMediaSource.this.S(j2);
        }
    }

    public static final class d implements i0.a<Long> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Pattern f23948b = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

        @Override // c.f.a.b.i3.i0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Long a(Uri uri, InputStream inputStream) throws IOException {
            String line = new BufferedReader(new InputStreamReader(inputStream, c.f.b.a.d.f15784c)).readLine();
            try {
                Matcher matcher = f23948b.matcher(line);
                if (!matcher.matches()) {
                    throw w1.c("Couldn't parse timestamp: " + line, null);
                }
                String strGroup = matcher.group(1);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                long time = simpleDateFormat.parse(strGroup).getTime();
                if (!"Z".equals(matcher.group(2))) {
                    long j2 = "+".equals(matcher.group(4)) ? 1L : -1L;
                    long j3 = Long.parseLong(matcher.group(5));
                    String strGroup2 = matcher.group(7);
                    time -= j2 * ((((j3 * 60) + (TextUtils.isEmpty(strGroup2) ? 0L : Long.parseLong(strGroup2))) * 60) * 1000);
                }
                return Long.valueOf(time);
            } catch (ParseException e2) {
                throw w1.c(null, e2);
            }
        }
    }

    public final class e implements g0.b<i0<c.f.a.b.e3.e1.p.c>> {
        public e() {
        }

        public /* synthetic */ e(DashMediaSource dashMediaSource, a aVar) {
            this();
        }

        @Override // c.f.a.b.i3.g0.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void k(i0<c.f.a.b.e3.e1.p.c> i0Var, long j2, long j3, boolean z) {
            DashMediaSource.this.U(i0Var, j2, j3);
        }

        @Override // c.f.a.b.i3.g0.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void m(i0<c.f.a.b.e3.e1.p.c> i0Var, long j2, long j3) {
            DashMediaSource.this.V(i0Var, j2, j3);
        }

        @Override // c.f.a.b.i3.g0.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public g0.c u(i0<c.f.a.b.e3.e1.p.c> i0Var, long j2, long j3, IOException iOException, int i2) {
            return DashMediaSource.this.W(i0Var, j2, j3, iOException, i2);
        }
    }

    public final class f implements h0 {
        public f() {
        }

        @Override // c.f.a.b.i3.h0
        public void a() throws IOException {
            DashMediaSource.this.A.a();
            b();
        }

        public final void b() throws IOException {
            if (DashMediaSource.this.C != null) {
                throw DashMediaSource.this.C;
            }
        }
    }

    public final class g implements g0.b<i0<Long>> {
        public g() {
        }

        public /* synthetic */ g(DashMediaSource dashMediaSource, a aVar) {
            this();
        }

        @Override // c.f.a.b.i3.g0.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void k(i0<Long> i0Var, long j2, long j3, boolean z) {
            DashMediaSource.this.U(i0Var, j2, j3);
        }

        @Override // c.f.a.b.i3.g0.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void m(i0<Long> i0Var, long j2, long j3) {
            DashMediaSource.this.X(i0Var, j2, j3);
        }

        @Override // c.f.a.b.i3.g0.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public g0.c u(i0<Long> i0Var, long j2, long j3, IOException iOException, int i2) {
            return DashMediaSource.this.Y(i0Var, j2, j3, iOException);
        }
    }

    public static final class h implements i0.a<Long> {
        public h() {
        }

        public /* synthetic */ h(a aVar) {
            this();
        }

        @Override // c.f.a.b.i3.i0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Long a(Uri uri, InputStream inputStream) {
            return Long.valueOf(x0.I0(new BufferedReader(new InputStreamReader(inputStream)).readLine()));
        }
    }

    static {
        i1.a("goog.exo.dash");
    }

    public DashMediaSource(p1 p1Var, c.f.a.b.e3.e1.p.c cVar, p.a aVar, i0.a<? extends c.f.a.b.e3.e1.p.c> aVar2, g.a aVar3, u uVar, c0 c0Var, f0 f0Var, long j2) {
        this.f23917h = p1Var;
        this.E = p1Var.f9644e;
        this.F = ((p1.g) c.f.a.b.j3.g.e(p1Var.f9643d)).f9685a;
        this.G = p1Var.f9643d.f9685a;
        this.H = cVar;
        this.f23919j = aVar;
        this.r = aVar2;
        this.f23920k = aVar3;
        this.f23922m = c0Var;
        this.f23923n = f0Var;
        this.p = j2;
        this.f23921l = uVar;
        this.f23924o = new c.f.a.b.e3.e1.f();
        boolean z = cVar != null;
        this.f23918i = z;
        a aVar4 = null;
        this.q = w(null);
        this.t = new Object();
        this.u = new SparseArray<>();
        this.x = new c(this, aVar4);
        this.N = -9223372036854775807L;
        this.L = -9223372036854775807L;
        if (!z) {
            this.s = new e(this, aVar4);
            this.y = new f();
            this.v = new Runnable() { // from class: c.f.a.b.e3.e1.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7066b.h0();
                }
            };
            this.w = new Runnable() { // from class: c.f.a.b.e3.e1.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7068b.Q();
                }
            };
            return;
        }
        c.f.a.b.j3.g.g(true ^ cVar.f7159d);
        this.s = null;
        this.v = null;
        this.w = null;
        this.y = new h0.a();
    }

    public /* synthetic */ DashMediaSource(p1 p1Var, c.f.a.b.e3.e1.p.c cVar, p.a aVar, i0.a aVar2, g.a aVar3, u uVar, c0 c0Var, f0 f0Var, long j2, a aVar4) {
        this(p1Var, cVar, aVar, aVar2, aVar3, uVar, c0Var, f0Var, j2);
    }

    public static long I(c.f.a.b.e3.e1.p.g gVar, long j2, long j3) {
        long jD = w0.d(gVar.f7190b);
        boolean zM = M(gVar);
        long jMin = Long.MAX_VALUE;
        for (int i2 = 0; i2 < gVar.f7191c.size(); i2++) {
            c.f.a.b.e3.e1.p.a aVar = gVar.f7191c.get(i2);
            List<c.f.a.b.e3.e1.p.j> list = aVar.f7148c;
            if ((!zM || aVar.f7147b != 3) && !list.isEmpty()) {
                j jVarL = list.get(0).l();
                if (jVarL == null) {
                    return jD + j2;
                }
                long j4 = jVarL.j(j2, j3);
                if (j4 == 0) {
                    return jD;
                }
                long jC = (jVarL.c(j2, j3) + j4) - 1;
                jMin = Math.min(jMin, jVarL.a(jC, j2) + jVarL.b(jC) + jD);
            }
        }
        return jMin;
    }

    public static long J(c.f.a.b.e3.e1.p.g gVar, long j2, long j3) {
        long jD = w0.d(gVar.f7190b);
        boolean zM = M(gVar);
        long jMax = jD;
        for (int i2 = 0; i2 < gVar.f7191c.size(); i2++) {
            c.f.a.b.e3.e1.p.a aVar = gVar.f7191c.get(i2);
            List<c.f.a.b.e3.e1.p.j> list = aVar.f7148c;
            if ((!zM || aVar.f7147b != 3) && !list.isEmpty()) {
                j jVarL = list.get(0).l();
                if (jVarL == null || jVarL.j(j2, j3) == 0) {
                    return jD;
                }
                jMax = Math.max(jMax, jVarL.b(jVarL.c(j2, j3)) + jD);
            }
        }
        return jMax;
    }

    public static long K(c.f.a.b.e3.e1.p.c cVar, long j2) {
        j jVarL;
        int iE = cVar.e() - 1;
        c.f.a.b.e3.e1.p.g gVarD = cVar.d(iE);
        long jD = w0.d(gVarD.f7190b);
        long jG = cVar.g(iE);
        long jD2 = w0.d(j2);
        long jD3 = w0.d(cVar.f7156a);
        long jD4 = w0.d(5000L);
        for (int i2 = 0; i2 < gVarD.f7191c.size(); i2++) {
            List<c.f.a.b.e3.e1.p.j> list = gVarD.f7191c.get(i2).f7148c;
            if (!list.isEmpty() && (jVarL = list.get(0).l()) != null) {
                long jD5 = ((jD3 + jD) + jVarL.d(jG, jD2)) - jD2;
                if (jD5 < jD4 - 100000 || (jD5 > jD4 && jD5 < jD4 + 100000)) {
                    jD4 = jD5;
                }
            }
        }
        return c.f.b.e.b.a(jD4, 1000L, RoundingMode.CEILING);
    }

    public static boolean M(c.f.a.b.e3.e1.p.g gVar) {
        for (int i2 = 0; i2 < gVar.f7191c.size(); i2++) {
            int i3 = gVar.f7191c.get(i2).f7147b;
            if (i3 == 1 || i3 == 2) {
                return true;
            }
        }
        return false;
    }

    public static boolean N(c.f.a.b.e3.e1.p.g gVar) {
        for (int i2 = 0; i2 < gVar.f7191c.size(); i2++) {
            j jVarL = gVar.f7191c.get(i2).f7148c.get(0).l();
            if (jVarL == null || jVarL.g()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void Q() {
        b0(false);
    }

    @Override // c.f.a.b.e3.n
    public void B(n0 n0Var) {
        this.B = n0Var;
        this.f23922m.prepare();
        if (this.f23918i) {
            b0(false);
            return;
        }
        this.z = this.f23919j.a();
        this.A = new g0("DashMediaSource");
        this.D = x0.x();
        h0();
    }

    @Override // c.f.a.b.e3.n
    public void D() {
        this.I = false;
        this.z = null;
        g0 g0Var = this.A;
        if (g0Var != null) {
            g0Var.l();
            this.A = null;
        }
        this.J = 0L;
        this.K = 0L;
        this.H = this.f23918i ? this.H : null;
        this.F = this.G;
        this.C = null;
        Handler handler = this.D;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.D = null;
        }
        this.L = -9223372036854775807L;
        this.M = 0;
        this.N = -9223372036854775807L;
        this.O = 0;
        this.u.clear();
        this.f23924o.i();
        this.f23922m.release();
    }

    public final long L() {
        return Math.min((this.M - 1) * 1000, 5000);
    }

    public final void R() {
        p0.j(this.A, new a());
    }

    public void S(long j2) {
        long j3 = this.N;
        if (j3 == -9223372036854775807L || j3 < j2) {
            this.N = j2;
        }
    }

    public void T() {
        this.D.removeCallbacks(this.w);
        h0();
    }

    public void U(i0<?> i0Var, long j2, long j3) {
        a0 a0Var = new a0(i0Var.f8899a, i0Var.f8900b, i0Var.f(), i0Var.d(), j2, j3, i0Var.b());
        this.f23923n.c(i0Var.f8899a);
        this.q.q(a0Var, i0Var.f8901c);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void V(c.f.a.b.i3.i0<c.f.a.b.e3.e1.p.c> r19, long r20, long r22) {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.DashMediaSource.V(c.f.a.b.i3.i0, long, long):void");
    }

    public g0.c W(i0<c.f.a.b.e3.e1.p.c> i0Var, long j2, long j3, IOException iOException, int i2) {
        a0 a0Var = new a0(i0Var.f8899a, i0Var.f8900b, i0Var.f(), i0Var.d(), j2, j3, i0Var.b());
        long jA = this.f23923n.a(new f0.c(a0Var, new d0(i0Var.f8901c), iOException, i2));
        g0.c cVarH = jA == -9223372036854775807L ? g0.f8878d : g0.h(false, jA);
        boolean z = !cVarH.c();
        this.q.x(a0Var, i0Var.f8901c, iOException, z);
        if (z) {
            this.f23923n.c(i0Var.f8899a);
        }
        return cVarH;
    }

    public void X(i0<Long> i0Var, long j2, long j3) {
        a0 a0Var = new a0(i0Var.f8899a, i0Var.f8900b, i0Var.f(), i0Var.d(), j2, j3, i0Var.b());
        this.f23923n.c(i0Var.f8899a);
        this.q.t(a0Var, i0Var.f8901c);
        a0(i0Var.e().longValue() - j2);
    }

    public g0.c Y(i0<Long> i0Var, long j2, long j3, IOException iOException) {
        this.q.x(new a0(i0Var.f8899a, i0Var.f8900b, i0Var.f(), i0Var.d(), j2, j3, i0Var.b()), i0Var.f8901c, iOException, true);
        this.f23923n.c(i0Var.f8899a);
        Z(iOException);
        return g0.f8877c;
    }

    public final void Z(IOException iOException) {
        z.e("DashMediaSource", "Failed to resolve time offset.", iOException);
        b0(true);
    }

    @Override // c.f.a.b.e3.i0
    public c.f.a.b.e3.f0 a(i0.a aVar, c.f.a.b.i3.f fVar, long j2) {
        int iIntValue = ((Integer) aVar.f7476a).intValue() - this.O;
        j0.a aVarX = x(aVar, this.H.d(iIntValue).f7190b);
        i iVar = new i(iIntValue + this.O, this.H, this.f23924o, iIntValue, this.f23920k, this.B, this.f23922m, t(aVar), this.f23923n, aVarX, this.L, this.y, fVar, this.f23921l, this.x);
        this.u.put(iVar.f7075d, iVar);
        return iVar;
    }

    public final void a0(long j2) {
        this.L = j2;
        b0(true);
    }

    public final void b0(boolean z) {
        long j2;
        c.f.a.b.e3.e1.p.g gVar;
        long j3;
        for (int i2 = 0; i2 < this.u.size(); i2++) {
            int iKeyAt = this.u.keyAt(i2);
            if (iKeyAt >= this.O) {
                this.u.valueAt(i2).M(this.H, iKeyAt - this.O);
            }
        }
        c.f.a.b.e3.e1.p.g gVarD = this.H.d(0);
        int iE = this.H.e() - 1;
        c.f.a.b.e3.e1.p.g gVarD2 = this.H.d(iE);
        long jG = this.H.g(iE);
        long jD = w0.d(x0.Z(this.L));
        long J = J(gVarD, this.H.g(0), jD);
        long jI = I(gVarD2, jG, jD);
        boolean z2 = this.H.f7159d && !N(gVarD2);
        if (z2) {
            long j4 = this.H.f7161f;
            if (j4 != -9223372036854775807L) {
                J = Math.max(J, jI - w0.d(j4));
            }
        }
        long j5 = jI - J;
        c.f.a.b.e3.e1.p.c cVar = this.H;
        if (cVar.f7159d) {
            c.f.a.b.j3.g.g(cVar.f7156a != -9223372036854775807L);
            long jD2 = (jD - w0.d(this.H.f7156a)) - J;
            i0(jD2, j5);
            long jE = this.H.f7156a + w0.e(J);
            long jD3 = jD2 - w0.d(this.E.f9680c);
            long jMin = Math.min(5000000L, j5 / 2);
            if (jD3 < jMin) {
                j3 = jMin;
                j2 = jE;
            } else {
                j2 = jE;
                j3 = jD3;
            }
            gVar = gVarD;
        } else {
            j2 = -9223372036854775807L;
            gVar = gVarD;
            j3 = 0;
        }
        long jD4 = J - w0.d(gVar.f7190b);
        c.f.a.b.e3.e1.p.c cVar2 = this.H;
        C(new b(cVar2.f7156a, j2, this.L, this.O, jD4, j5, j3, cVar2, this.f23917h, cVar2.f7159d ? this.E : null));
        if (this.f23918i) {
            return;
        }
        this.D.removeCallbacks(this.w);
        if (z2) {
            this.D.postDelayed(this.w, K(this.H, x0.Z(this.L)));
        }
        if (this.I) {
            h0();
            return;
        }
        if (z) {
            c.f.a.b.e3.e1.p.c cVar3 = this.H;
            if (cVar3.f7159d) {
                long j6 = cVar3.f7160e;
                if (j6 != -9223372036854775807L) {
                    if (j6 == 0) {
                        j6 = 5000;
                    }
                    f0(Math.max(0L, (this.J + j6) - SystemClock.elapsedRealtime()));
                }
            }
        }
    }

    public final void c0(c.f.a.b.e3.e1.p.o oVar) {
        i0.a<Long> dVar;
        String str = oVar.f7242a;
        if (x0.b(str, "urn:mpeg:dash:utc:direct:2014") || x0.b(str, "urn:mpeg:dash:utc:direct:2012")) {
            d0(oVar);
            return;
        }
        if (x0.b(str, "urn:mpeg:dash:utc:http-iso:2014") || x0.b(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            dVar = new d();
        } else {
            if (!x0.b(str, "urn:mpeg:dash:utc:http-xsdate:2014") && !x0.b(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
                if (x0.b(str, "urn:mpeg:dash:utc:ntp:2014") || x0.b(str, "urn:mpeg:dash:utc:ntp:2012")) {
                    R();
                    return;
                } else {
                    Z(new IOException("Unsupported UTC timing scheme"));
                    return;
                }
            }
            dVar = new h(null);
        }
        e0(oVar, dVar);
    }

    public final void d0(c.f.a.b.e3.e1.p.o oVar) {
        try {
            a0(x0.I0(oVar.f7243b) - this.K);
        } catch (w1 e2) {
            Z(e2);
        }
    }

    public final void e0(c.f.a.b.e3.e1.p.o oVar, i0.a<Long> aVar) {
        g0(new c.f.a.b.i3.i0(this.z, Uri.parse(oVar.f7243b), 5, aVar), new g(this, null), 1);
    }

    public final void f0(long j2) {
        this.D.postDelayed(this.v, j2);
    }

    public final <T> void g0(c.f.a.b.i3.i0<T> i0Var, g0.b<c.f.a.b.i3.i0<T>> bVar, int i2) {
        this.q.z(new a0(i0Var.f8899a, i0Var.f8900b, this.A.n(i0Var, bVar, i2)), i0Var.f8901c);
    }

    @Override // c.f.a.b.e3.i0
    public p1 h() {
        return this.f23917h;
    }

    public final void h0() {
        Uri uri;
        this.D.removeCallbacks(this.v);
        if (this.A.i()) {
            return;
        }
        if (this.A.j()) {
            this.I = true;
            return;
        }
        synchronized (this.t) {
            uri = this.F;
        }
        this.I = false;
        g0(new c.f.a.b.i3.i0(this.z, uri, 4, this.r), this.s, this.f23923n.d(4));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i0(long r15, long r17) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.DashMediaSource.i0(long, long):void");
    }

    @Override // c.f.a.b.e3.i0
    public void l() {
        this.y.a();
    }

    @Override // c.f.a.b.e3.i0
    public void o(c.f.a.b.e3.f0 f0Var) {
        i iVar = (i) f0Var;
        iVar.I();
        this.u.remove(iVar.f7075d);
    }
}
