package c.f.a.b;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import c.f.a.b.b1;
import c.f.a.b.b3.a;
import c.f.a.b.d2;
import c.f.a.b.e3.f0;
import c.f.a.b.e3.i0;
import c.f.a.b.g3.o;
import c.f.a.b.h2;
import c.f.a.b.p1;
import c.f.a.b.p2;
import c.f.a.b.v1;
import c.f.a.b.x2.y;
import c.f.b.b.t;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class h1 implements Handler.Callback, f0.a, o.a, v1.d, b1.a, d2.a {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public int E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public int J;
    public h K;
    public long L;
    public int M;
    public boolean N;
    public d1 O;
    public long P;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h2[] f8528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j2[] f8529c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c.f.a.b.g3.o f8530d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c.f.a.b.g3.p f8531e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o1 f8532f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c.f.a.b.i3.i f8533g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c.f.a.b.j3.v f8534h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HandlerThread f8535i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Looper f8536j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p2.c f8537k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p2.b f8538l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f8539m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f8540n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b1 f8541o;
    public final ArrayList<d> p;
    public final c.f.a.b.j3.i q;
    public final f r;
    public final t1 s;
    public final v1 t;
    public final n1 u;
    public final long v;
    public m2 w;
    public y1 x;
    public e y;
    public boolean z;

    public class a implements h2.a {
        public a() {
        }

        @Override // c.f.a.b.h2.a
        public void a() {
            h1.this.f8534h.f(2);
        }

        @Override // c.f.a.b.h2.a
        public void b(long j2) {
            if (j2 >= 2000) {
                h1.this.H = true;
            }
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<v1.c> f8543a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c.f.a.b.e3.u0 f8544b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f8545c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f8546d;

        public b(List<v1.c> list, c.f.a.b.e3.u0 u0Var, int i2, long j2) {
            this.f8543a = list;
            this.f8544b = u0Var;
            this.f8545c = i2;
            this.f8546d = j2;
        }

        public /* synthetic */ b(List list, c.f.a.b.e3.u0 u0Var, int i2, long j2, a aVar) {
            this(list, u0Var, i2, j2);
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f8547a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f8548b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f8549c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final c.f.a.b.e3.u0 f8550d;
    }

    public static final class d implements Comparable<d> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d2 f8551b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f8552c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f8553d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f8554e;

        public d(d2 d2Var) {
            this.f8551b = d2Var;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            Object obj = this.f8554e;
            if ((obj == null) != (dVar.f8554e == null)) {
                return obj != null ? -1 : 1;
            }
            if (obj == null) {
                return 0;
            }
            int i2 = this.f8552c - dVar.f8552c;
            return i2 != 0 ? i2 : c.f.a.b.j3.x0.p(this.f8553d, dVar.f8553d);
        }

        public void b(int i2, long j2, Object obj) {
            this.f8552c = i2;
            this.f8553d = j2;
            this.f8554e = obj;
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f8555a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public y1 f8556b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f8557c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f8558d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f8559e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f8560f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f8561g;

        public e(y1 y1Var) {
            this.f8556b = y1Var;
        }

        public void b(int i2) {
            this.f8555a |= i2 > 0;
            this.f8557c += i2;
        }

        public void c(int i2) {
            this.f8555a = true;
            this.f8560f = true;
            this.f8561g = i2;
        }

        public void d(y1 y1Var) {
            this.f8555a |= this.f8556b != y1Var;
            this.f8556b = y1Var;
        }

        public void e(int i2) {
            if (this.f8558d && this.f8559e != 5) {
                c.f.a.b.j3.g.a(i2 == 5);
                return;
            }
            this.f8555a = true;
            this.f8558d = true;
            this.f8559e = i2;
        }
    }

    public interface f {
        void a(e eVar);
    }

    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i0.a f8562a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f8563b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f8564c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f8565d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f8566e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f8567f;

        public g(i0.a aVar, long j2, long j3, boolean z, boolean z2, boolean z3) {
            this.f8562a = aVar;
            this.f8563b = j2;
            this.f8564c = j3;
            this.f8565d = z;
            this.f8566e = z2;
            this.f8567f = z3;
        }
    }

    public static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p2 f8568a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f8569b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f8570c;

        public h(p2 p2Var, int i2, long j2) {
            this.f8568a = p2Var;
            this.f8569b = i2;
            this.f8570c = j2;
        }
    }

    public h1(h2[] h2VarArr, c.f.a.b.g3.o oVar, c.f.a.b.g3.p pVar, o1 o1Var, c.f.a.b.i3.i iVar, int i2, boolean z, c.f.a.b.s2.h1 h1Var, m2 m2Var, n1 n1Var, long j2, boolean z2, Looper looper, c.f.a.b.j3.i iVar2, f fVar) {
        this.r = fVar;
        this.f8528b = h2VarArr;
        this.f8530d = oVar;
        this.f8531e = pVar;
        this.f8532f = o1Var;
        this.f8533g = iVar;
        this.E = i2;
        this.F = z;
        this.w = m2Var;
        this.u = n1Var;
        this.v = j2;
        this.P = j2;
        this.A = z2;
        this.q = iVar2;
        this.f8539m = o1Var.b();
        this.f8540n = o1Var.a();
        y1 y1VarK = y1.k(pVar);
        this.x = y1VarK;
        this.y = new e(y1VarK);
        this.f8529c = new j2[h2VarArr.length];
        for (int i3 = 0; i3 < h2VarArr.length; i3++) {
            h2VarArr[i3].l(i3);
            this.f8529c[i3] = h2VarArr[i3].i();
        }
        this.f8541o = new b1(this, iVar2);
        this.p = new ArrayList<>();
        this.f8537k = new p2.c();
        this.f8538l = new p2.b();
        oVar.b(this, iVar);
        this.N = true;
        Handler handler = new Handler(looper);
        this.s = new t1(h1Var, handler);
        this.t = new v1(this, h1Var, handler);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.f8535i = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.f8536j = looper2;
        this.f8534h = iVar2.d(looper2, this);
    }

    public static boolean O(h2 h2Var) {
        return h2Var.getState() != 0;
    }

    public static boolean Q(y1 y1Var, p2.b bVar) {
        i0.a aVar = y1Var.f10461c;
        p2 p2Var = y1Var.f10460b;
        return p2Var.q() || p2Var.h(aVar.f7476a, bVar).f9707g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Boolean S() {
        return Boolean.valueOf(this.z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void U(d2 d2Var) {
        try {
            m(d2Var);
        } catch (d1 e2) {
            c.f.a.b.j3.z.e("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e2);
            throw new RuntimeException(e2);
        }
    }

    public static void u0(p2 p2Var, d dVar, p2.c cVar, p2.b bVar) {
        int i2 = p2Var.n(p2Var.h(dVar.f8554e, bVar).f9704d, cVar).t;
        Object obj = p2Var.g(i2, bVar, true).f9703c;
        long j2 = bVar.f9705e;
        dVar.b(i2, j2 != -9223372036854775807L ? j2 - 1 : Long.MAX_VALUE, obj);
    }

    public static boolean v0(d dVar, p2 p2Var, p2 p2Var2, int i2, boolean z, p2.c cVar, p2.b bVar) {
        Object obj = dVar.f8554e;
        if (obj == null) {
            Pair<Object, Long> pairY0 = y0(p2Var, new h(dVar.f8551b.g(), dVar.f8551b.i(), dVar.f8551b.e() == Long.MIN_VALUE ? -9223372036854775807L : w0.d(dVar.f8551b.e())), false, i2, z, cVar, bVar);
            if (pairY0 == null) {
                return false;
            }
            dVar.b(p2Var.b(pairY0.first), ((Long) pairY0.second).longValue(), pairY0.first);
            if (dVar.f8551b.e() == Long.MIN_VALUE) {
                u0(p2Var, dVar, cVar, bVar);
            }
            return true;
        }
        int iB = p2Var.b(obj);
        if (iB == -1) {
            return false;
        }
        if (dVar.f8551b.e() == Long.MIN_VALUE) {
            u0(p2Var, dVar, cVar, bVar);
            return true;
        }
        dVar.f8552c = iB;
        p2Var2.h(dVar.f8554e, bVar);
        if (bVar.f9707g && p2Var2.n(bVar.f9704d, cVar).s == p2Var2.b(dVar.f8554e)) {
            Pair<Object, Long> pairJ = p2Var.j(cVar, bVar, p2Var.h(dVar.f8554e, bVar).f9704d, dVar.f8553d + bVar.o());
            dVar.b(p2Var.b(pairJ.first), ((Long) pairJ.second).longValue(), pairJ.first);
        }
        return true;
    }

    public static k1[] w(c.f.a.b.g3.h hVar) {
        int length = hVar != null ? hVar.length() : 0;
        k1[] k1VarArr = new k1[length];
        for (int i2 = 0; i2 < length; i2++) {
            k1VarArr[i2] = hVar.g(i2);
        }
        return k1VarArr;
    }

    public static g x0(p2 p2Var, y1 y1Var, h hVar, t1 t1Var, int i2, boolean z, p2.c cVar, p2.b bVar) {
        int i3;
        i0.a aVar;
        long jLongValue;
        int i4;
        boolean z2;
        boolean z3;
        boolean z4;
        int iA;
        int iA2;
        boolean z5;
        t1 t1Var2;
        long j2;
        int i5;
        boolean z6;
        int iA3;
        boolean z7;
        boolean z8;
        if (p2Var.q()) {
            return new g(y1.l(), 0L, -9223372036854775807L, false, true, false);
        }
        i0.a aVar2 = y1Var.f10461c;
        Object obj = aVar2.f7476a;
        boolean zQ = Q(y1Var, bVar);
        long j3 = (y1Var.f10461c.b() || zQ) ? y1Var.f10462d : y1Var.t;
        boolean z9 = false;
        if (hVar != null) {
            i3 = -1;
            Pair<Object, Long> pairY0 = y0(p2Var, hVar, true, i2, z, cVar, bVar);
            if (pairY0 == null) {
                iA3 = p2Var.a(z);
                jLongValue = j3;
                z6 = false;
                z7 = false;
                z8 = true;
            } else {
                if (hVar.f8570c == -9223372036854775807L) {
                    iA3 = p2Var.h(pairY0.first, bVar).f9704d;
                    jLongValue = j3;
                    z6 = false;
                } else {
                    obj = pairY0.first;
                    jLongValue = ((Long) pairY0.second).longValue();
                    z6 = true;
                    iA3 = -1;
                }
                z7 = y1Var.f10464f == 4;
                z8 = false;
            }
            z4 = z6;
            z2 = z7;
            z3 = z8;
            i4 = iA3;
            aVar = aVar2;
        } else {
            i3 = -1;
            if (y1Var.f10460b.q()) {
                iA = p2Var.a(z);
            } else if (p2Var.b(obj) == -1) {
                Object objZ0 = z0(cVar, bVar, i2, z, obj, y1Var.f10460b, p2Var);
                if (objZ0 == null) {
                    iA2 = p2Var.a(z);
                    z5 = true;
                } else {
                    iA2 = p2Var.h(objZ0, bVar).f9704d;
                    z5 = false;
                }
                i4 = iA2;
                z3 = z5;
                jLongValue = j3;
                aVar = aVar2;
                z2 = false;
                z4 = false;
            } else if (j3 == -9223372036854775807L) {
                iA = p2Var.h(obj, bVar).f9704d;
            } else if (zQ) {
                aVar = aVar2;
                y1Var.f10460b.h(aVar.f7476a, bVar);
                if (y1Var.f10460b.n(bVar.f9704d, cVar).s == y1Var.f10460b.b(aVar.f7476a)) {
                    Pair<Object, Long> pairJ = p2Var.j(cVar, bVar, p2Var.h(obj, bVar).f9704d, j3 + bVar.o());
                    obj = pairJ.first;
                    jLongValue = ((Long) pairJ.second).longValue();
                } else {
                    jLongValue = j3;
                }
                i4 = -1;
                z2 = false;
                z3 = false;
                z4 = true;
            } else {
                aVar = aVar2;
                jLongValue = j3;
                i4 = -1;
                z2 = false;
                z3 = false;
                z4 = false;
            }
            i4 = iA;
            jLongValue = j3;
            aVar = aVar2;
            z2 = false;
            z3 = false;
            z4 = false;
        }
        if (i4 != i3) {
            Pair<Object, Long> pairJ2 = p2Var.j(cVar, bVar, i4, -9223372036854775807L);
            obj = pairJ2.first;
            jLongValue = ((Long) pairJ2.second).longValue();
            t1Var2 = t1Var;
            j2 = -9223372036854775807L;
        } else {
            t1Var2 = t1Var;
            j2 = jLongValue;
        }
        i0.a aVarA = t1Var2.A(p2Var, obj, jLongValue);
        boolean z10 = aVarA.f7480e == i3 || ((i5 = aVar.f7480e) != i3 && aVarA.f7477b >= i5);
        boolean zEquals = aVar.f7476a.equals(obj);
        boolean z11 = zEquals && !aVar.b() && !aVarA.b() && z10;
        p2Var.h(obj, bVar);
        if (zEquals && !zQ && j3 == j2 && ((aVarA.b() && bVar.r(aVarA.f7477b)) || (aVar.b() && bVar.r(aVar.f7477b)))) {
            z9 = true;
        }
        if (z11 || z9) {
            aVarA = aVar;
        }
        if (aVarA.b()) {
            if (aVarA.equals(aVar)) {
                jLongValue = y1Var.t;
            } else {
                p2Var.h(aVarA.f7476a, bVar);
                jLongValue = aVarA.f7478c == bVar.l(aVarA.f7477b) ? bVar.g() : 0L;
            }
        }
        return new g(aVarA, jLongValue, j2, z2, z3, z4);
    }

    public static Pair<Object, Long> y0(p2 p2Var, h hVar, boolean z, int i2, boolean z2, p2.c cVar, p2.b bVar) {
        Pair<Object, Long> pairJ;
        Object objZ0;
        p2 p2Var2 = hVar.f8568a;
        if (p2Var.q()) {
            return null;
        }
        p2 p2Var3 = p2Var2.q() ? p2Var : p2Var2;
        try {
            pairJ = p2Var3.j(cVar, bVar, hVar.f8569b, hVar.f8570c);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (p2Var.equals(p2Var3)) {
            return pairJ;
        }
        if (p2Var.b(pairJ.first) != -1) {
            return (p2Var3.h(pairJ.first, bVar).f9707g && p2Var3.n(bVar.f9704d, cVar).s == p2Var3.b(pairJ.first)) ? p2Var.j(cVar, bVar, p2Var.h(pairJ.first, bVar).f9704d, hVar.f8570c) : pairJ;
        }
        if (z && (objZ0 = z0(cVar, bVar, i2, z2, pairJ.first, p2Var3, p2Var)) != null) {
            return p2Var.j(cVar, bVar, p2Var.h(objZ0, bVar).f9704d, -9223372036854775807L);
        }
        return null;
    }

    public static Object z0(p2.c cVar, p2.b bVar, int i2, boolean z, Object obj, p2 p2Var, p2 p2Var2) {
        int iB = p2Var.b(obj);
        int i3 = p2Var.i();
        int iD = iB;
        int iB2 = -1;
        for (int i4 = 0; i4 < i3 && iB2 == -1; i4++) {
            iD = p2Var.d(iD, bVar, cVar, i2, z);
            if (iD == -1) {
                break;
            }
            iB2 = p2Var2.b(p2Var.m(iD));
        }
        if (iB2 == -1) {
            return null;
        }
        return p2Var2.m(iB2);
    }

    public Looper A() {
        return this.f8536j;
    }

    public final void A0(long j2, long j3) {
        this.f8534h.i(2);
        this.f8534h.h(2, j2 + j3);
    }

    public final long B() {
        return C(this.x.r);
    }

    public void B0(p2 p2Var, int i2, long j2) {
        this.f8534h.j(3, new h(p2Var, i2, j2)).a();
    }

    public final long C(long j2) {
        r1 r1VarI = this.s.i();
        if (r1VarI == null) {
            return 0L;
        }
        return Math.max(0L, j2 - r1VarI.y(this.L));
    }

    public final void C0(boolean z) throws d1 {
        i0.a aVar = this.s.o().f9775f.f9801a;
        long jF0 = F0(aVar, this.x.t, true, false);
        if (jF0 != this.x.t) {
            y1 y1Var = this.x;
            this.x = K(aVar, jF0, y1Var.f10462d, y1Var.f10463e, z, 5);
        }
    }

    public final void D(c.f.a.b.e3.f0 f0Var) {
        if (this.s.u(f0Var)) {
            this.s.y(this.L);
            V();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00ab A[Catch: all -> 0x0147, TryCatch #1 {all -> 0x0147, blocks: (B:22:0x00a1, B:24:0x00ab, B:27:0x00b1, B:29:0x00b7, B:30:0x00ba, B:32:0x00c0, B:34:0x00ca, B:36:0x00d2, B:40:0x00da, B:42:0x00e4, B:44:0x00f4, B:48:0x00fe, B:52:0x0110, B:56:0x0119), top: B:75:0x00a1 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void D0(c.f.a.b.h1.h r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.h1.D0(c.f.a.b.h1$h):void");
    }

    public final void E(IOException iOException, int i2) {
        d1 d1VarE = d1.e(iOException, i2);
        r1 r1VarO = this.s.o();
        if (r1VarO != null) {
            d1VarE = d1VarE.c(r1VarO.f9775f.f9801a);
        }
        c.f.a.b.j3.z.e("ExoPlayerImplInternal", "Playback error", d1VarE);
        i1(false, false);
        this.x = this.x.f(d1VarE);
    }

    public final long E0(i0.a aVar, long j2, boolean z) {
        return F0(aVar, j2, this.s.o() != this.s.p(), z);
    }

    public final void F(boolean z) {
        r1 r1VarI = this.s.i();
        i0.a aVar = r1VarI == null ? this.x.f10461c : r1VarI.f9775f.f9801a;
        boolean z2 = !this.x.f10470l.equals(aVar);
        if (z2) {
            this.x = this.x.b(aVar);
        }
        y1 y1Var = this.x;
        y1Var.r = r1VarI == null ? y1Var.t : r1VarI.i();
        this.x.s = B();
        if ((z2 || z) && r1VarI != null && r1VarI.f9773d) {
            m1(r1VarI.n(), r1VarI.o());
        }
    }

    public final long F0(i0.a aVar, long j2, boolean z, boolean z2) throws d1 {
        j1();
        this.C = false;
        if (z2 || this.x.f10464f == 3) {
            a1(2);
        }
        r1 r1VarO = this.s.o();
        r1 r1VarJ = r1VarO;
        while (r1VarJ != null && !aVar.equals(r1VarJ.f9775f.f9801a)) {
            r1VarJ = r1VarJ.j();
        }
        if (z || r1VarO != r1VarJ || (r1VarJ != null && r1VarJ.z(j2) < 0)) {
            for (h2 h2Var : this.f8528b) {
                n(h2Var);
            }
            if (r1VarJ != null) {
                while (this.s.o() != r1VarJ) {
                    this.s.a();
                }
                this.s.z(r1VarJ);
                r1VarJ.x(0L);
                q();
            }
        }
        t1 t1Var = this.s;
        if (r1VarJ != null) {
            t1Var.z(r1VarJ);
            if (r1VarJ.f9773d) {
                long j3 = r1VarJ.f9775f.f9805e;
                if (j3 != -9223372036854775807L && j2 >= j3) {
                    j2 = Math.max(0L, j3 - 1);
                }
                if (r1VarJ.f9774e) {
                    long jO = r1VarJ.f9770a.o(j2);
                    r1VarJ.f9770a.v(jO - this.f8539m, this.f8540n);
                    j2 = jO;
                }
            } else {
                r1VarJ.f9775f = r1VarJ.f9775f.b(j2);
            }
            t0(j2);
            V();
        } else {
            t1Var.e();
            t0(j2);
        }
        F(false);
        this.f8534h.f(2);
        return j2;
    }

    public final void G(p2 p2Var, boolean z) throws Throwable {
        boolean z2;
        g gVarX0 = x0(p2Var, this.x, this.K, this.s, this.E, this.F, this.f8537k, this.f8538l);
        i0.a aVar = gVarX0.f8562a;
        long j2 = gVarX0.f8564c;
        boolean z3 = gVarX0.f8565d;
        long jE0 = gVarX0.f8563b;
        boolean z4 = (this.x.f10461c.equals(aVar) && jE0 == this.x.t) ? false : true;
        h hVar = null;
        try {
            if (gVarX0.f8566e) {
                if (this.x.f10464f != 1) {
                    a1(4);
                }
                r0(false, false, false, true);
            }
            try {
                if (z4) {
                    z2 = false;
                    if (!p2Var.q()) {
                        for (r1 r1VarO = this.s.o(); r1VarO != null; r1VarO = r1VarO.j()) {
                            if (r1VarO.f9775f.f9801a.equals(aVar)) {
                                r1VarO.f9775f = this.s.q(p2Var, r1VarO.f9775f);
                                r1VarO.A();
                            }
                        }
                        jE0 = E0(aVar, jE0, z3);
                    }
                } else {
                    z2 = false;
                    if (!this.s.F(p2Var, this.L, y())) {
                        C0(false);
                    }
                }
                y1 y1Var = this.x;
                l1(p2Var, aVar, y1Var.f10460b, y1Var.f10461c, gVarX0.f8567f ? jE0 : -9223372036854775807L);
                if (z4 || j2 != this.x.f10462d) {
                    y1 y1Var2 = this.x;
                    Object obj = y1Var2.f10461c.f7476a;
                    p2 p2Var2 = y1Var2.f10460b;
                    this.x = K(aVar, jE0, j2, this.x.f10463e, z4 && z && !p2Var2.q() && !p2Var2.h(obj, this.f8538l).f9707g, p2Var.b(obj) == -1 ? 4 : 3);
                }
                s0();
                w0(p2Var, this.x.f10460b);
                this.x = this.x.j(p2Var);
                if (!p2Var.q()) {
                    this.K = null;
                }
                F(z2);
            } catch (Throwable th) {
                th = th;
                hVar = null;
                y1 y1Var3 = this.x;
                h hVar2 = hVar;
                l1(p2Var, aVar, y1Var3.f10460b, y1Var3.f10461c, gVarX0.f8567f ? jE0 : -9223372036854775807L);
                if (z4 || j2 != this.x.f10462d) {
                    y1 y1Var4 = this.x;
                    Object obj2 = y1Var4.f10461c.f7476a;
                    p2 p2Var3 = y1Var4.f10460b;
                    this.x = K(aVar, jE0, j2, this.x.f10463e, z4 && z && !p2Var3.q() && !p2Var3.h(obj2, this.f8538l).f9707g, p2Var.b(obj2) == -1 ? 4 : 3);
                }
                s0();
                w0(p2Var, this.x.f10460b);
                this.x = this.x.j(p2Var);
                if (!p2Var.q()) {
                    this.K = hVar2;
                }
                F(false);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final void G0(d2 d2Var) {
        if (d2Var.e() == -9223372036854775807L) {
            H0(d2Var);
            return;
        }
        if (this.x.f10460b.q()) {
            this.p.add(new d(d2Var));
            return;
        }
        d dVar = new d(d2Var);
        p2 p2Var = this.x.f10460b;
        if (!v0(dVar, p2Var, p2Var, this.E, this.F, this.f8537k, this.f8538l)) {
            d2Var.k(false);
        } else {
            this.p.add(dVar);
            Collections.sort(this.p);
        }
    }

    public final void H(c.f.a.b.e3.f0 f0Var) throws d1 {
        if (this.s.u(f0Var)) {
            r1 r1VarI = this.s.i();
            r1VarI.p(this.f8541o.c().f10622c, this.x.f10460b);
            m1(r1VarI.n(), r1VarI.o());
            if (r1VarI == this.s.o()) {
                t0(r1VarI.f9775f.f9802b);
                q();
                y1 y1Var = this.x;
                i0.a aVar = y1Var.f10461c;
                long j2 = r1VarI.f9775f.f9802b;
                this.x = K(aVar, j2, y1Var.f10462d, j2, false, 5);
            }
            V();
        }
    }

    public final void H0(d2 d2Var) {
        if (d2Var.c() != this.f8536j) {
            this.f8534h.j(15, d2Var).a();
            return;
        }
        m(d2Var);
        int i2 = this.x.f10464f;
        if (i2 == 3 || i2 == 2) {
            this.f8534h.f(2);
        }
    }

    public final void I(z1 z1Var, float f2, boolean z, boolean z2) {
        if (z) {
            if (z2) {
                this.y.b(1);
            }
            this.x = this.x.g(z1Var);
        }
        p1(z1Var.f10622c);
        for (h2 h2Var : this.f8528b) {
            if (h2Var != null) {
                h2Var.k(f2, z1Var.f10622c);
            }
        }
    }

    public final void I0(final d2 d2Var) {
        Looper looperC = d2Var.c();
        if (looperC.getThread().isAlive()) {
            this.q.d(looperC, null).b(new Runnable() { // from class: c.f.a.b.b0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6511b.U(d2Var);
                }
            });
        } else {
            c.f.a.b.j3.z.i("TAG", "Trying to send message on a dead thread.");
            d2Var.k(false);
        }
    }

    public final void J(z1 z1Var, boolean z) {
        I(z1Var, z1Var.f10622c, true, z);
    }

    public final void J0(long j2) {
        for (h2 h2Var : this.f8528b) {
            if (h2Var.q() != null) {
                K0(h2Var, j2);
            }
        }
    }

    public final y1 K(i0.a aVar, long j2, long j3, long j4, boolean z, int i2) {
        List<c.f.a.b.b3.a> listJ;
        c.f.a.b.e3.a1 a1Var;
        c.f.a.b.g3.p pVar;
        this.N = (!this.N && j2 == this.x.t && aVar.equals(this.x.f10461c)) ? false : true;
        s0();
        y1 y1Var = this.x;
        c.f.a.b.e3.a1 a1Var2 = y1Var.f10467i;
        c.f.a.b.g3.p pVar2 = y1Var.f10468j;
        List<c.f.a.b.b3.a> list = y1Var.f10469k;
        if (this.t.r()) {
            r1 r1VarO = this.s.o();
            c.f.a.b.e3.a1 a1VarN = r1VarO == null ? c.f.a.b.e3.a1.f6902b : r1VarO.n();
            c.f.a.b.g3.p pVarO = r1VarO == null ? this.f8531e : r1VarO.o();
            c.f.b.b.t<c.f.a.b.b3.a> tVarU = u(pVarO.f8524c);
            if (r1VarO != null) {
                s1 s1Var = r1VarO.f9775f;
                if (s1Var.f9803c != j3) {
                    r1VarO.f9775f = s1Var.a(j3);
                }
            }
            a1Var = a1VarN;
            pVar = pVarO;
            listJ = tVarU;
        } else if (aVar.equals(this.x.f10461c)) {
            listJ = list;
            a1Var = a1Var2;
            pVar = pVar2;
        } else {
            a1Var = c.f.a.b.e3.a1.f6902b;
            pVar = this.f8531e;
            listJ = c.f.b.b.t.J();
        }
        if (z) {
            this.y.e(i2);
        }
        return this.x.c(aVar, j2, j3, j4, B(), a1Var, pVar, listJ);
    }

    public final void K0(h2 h2Var, long j2) {
        h2Var.h();
        if (h2Var instanceof c.f.a.b.f3.m) {
            ((c.f.a.b.f3.m) h2Var).U(j2);
        }
    }

    public final boolean L(h2 h2Var, r1 r1Var) {
        r1 r1VarJ = r1Var.j();
        return r1Var.f9775f.f9806f && r1VarJ.f9773d && ((h2Var instanceof c.f.a.b.f3.m) || h2Var.s() >= r1VarJ.m());
    }

    public final void L0(boolean z, AtomicBoolean atomicBoolean) {
        if (this.G != z) {
            this.G = z;
            if (!z) {
                for (h2 h2Var : this.f8528b) {
                    if (!O(h2Var)) {
                        h2Var.reset();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    public final boolean M() {
        r1 r1VarP = this.s.p();
        if (!r1VarP.f9773d) {
            return false;
        }
        int i2 = 0;
        while (true) {
            h2[] h2VarArr = this.f8528b;
            if (i2 >= h2VarArr.length) {
                return true;
            }
            h2 h2Var = h2VarArr[i2];
            c.f.a.b.e3.s0 s0Var = r1VarP.f9772c[i2];
            if (h2Var.q() != s0Var || (s0Var != null && !h2Var.f() && !L(h2Var, r1VarP))) {
                break;
            }
            i2++;
        }
        return false;
    }

    public final void M0(b bVar) throws Throwable {
        this.y.b(1);
        if (bVar.f8545c != -1) {
            this.K = new h(new e2(bVar.f8543a, bVar.f8544b), bVar.f8545c, bVar.f8546d);
        }
        G(this.t.C(bVar.f8543a, bVar.f8544b), false);
    }

    public final boolean N() {
        r1 r1VarI = this.s.i();
        return (r1VarI == null || r1VarI.k() == Long.MIN_VALUE) ? false : true;
    }

    public void N0(List<v1.c> list, int i2, long j2, c.f.a.b.e3.u0 u0Var) {
        this.f8534h.j(17, new b(list, u0Var, i2, j2, null)).a();
    }

    public final void O0(boolean z) {
        if (z == this.I) {
            return;
        }
        this.I = z;
        y1 y1Var = this.x;
        int i2 = y1Var.f10464f;
        if (z || i2 == 4 || i2 == 1) {
            this.x = y1Var.d(z);
        } else {
            this.f8534h.f(2);
        }
    }

    public final boolean P() {
        r1 r1VarO = this.s.o();
        long j2 = r1VarO.f9775f.f9805e;
        return r1VarO.f9773d && (j2 == -9223372036854775807L || this.x.t < j2 || !d1());
    }

    public final void P0(boolean z) throws d1 {
        this.A = z;
        s0();
        if (!this.B || this.s.p() == this.s.o()) {
            return;
        }
        C0(true);
        F(false);
    }

    public void Q0(boolean z, int i2) {
        this.f8534h.a(1, z ? 1 : 0, i2).a();
    }

    public final void R0(boolean z, int i2, boolean z2, int i3) {
        this.y.b(z2 ? 1 : 0);
        this.y.c(i3);
        this.x = this.x.e(z, i2);
        this.C = false;
        g0(z);
        if (!d1()) {
            j1();
            o1();
            return;
        }
        int i4 = this.x.f10464f;
        if (i4 == 3) {
            g1();
        } else if (i4 != 2) {
            return;
        }
        this.f8534h.f(2);
    }

    public void S0(z1 z1Var) {
        this.f8534h.j(4, z1Var).a();
    }

    public final void T0(z1 z1Var) {
        this.f8541o.d(z1Var);
        J(this.f8541o.c(), true);
    }

    public void U0(int i2) {
        this.f8534h.a(11, i2, 0).a();
    }

    public final void V() {
        boolean zC1 = c1();
        this.D = zC1;
        if (zC1) {
            this.s.i().d(this.L);
        }
        k1();
    }

    public final void V0(int i2) throws d1 {
        this.E = i2;
        if (!this.s.G(this.x.f10460b, i2)) {
            C0(true);
        }
        F(false);
    }

    public final void W() {
        this.y.d(this.x);
        if (this.y.f8555a) {
            this.r.a(this.y);
            this.y = new e(this.x);
        }
    }

    public final void W0(m2 m2Var) {
        this.w = m2Var;
    }

    public final boolean X(long j2, long j3) {
        if (this.I && this.H) {
            return false;
        }
        A0(j2, j3);
        return true;
    }

    public void X0(boolean z) {
        this.f8534h.a(12, z ? 1 : 0, 0).a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        if (r1 > 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
    
        r3 = r7.p.get(r1 - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        if (r3 == null) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        r4 = r3.f8552c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
    
        if (r4 > r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004b, code lost:
    
        if (r4 != r0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        if (r3.f8553d <= r8) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        r1 = r1 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
    
        if (r1 <= 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
    
        if (r1 >= r7.p.size()) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0060, code lost:
    
        r3 = r7.p.get(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0069, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006a, code lost:
    
        if (r3 == null) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006e, code lost:
    
        if (r3.f8554e == null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0070, code lost:
    
        r4 = r3.f8552c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0072, code lost:
    
        if (r4 < r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0074, code lost:
    
        if (r4 != r0) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007a, code lost:
    
        if (r3.f8553d > r8) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007c, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0084, code lost:
    
        if (r1 >= r7.p.size()) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0087, code lost:
    
        if (r3 == null) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008b, code lost:
    
        if (r3.f8554e == null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008f, code lost:
    
        if (r3.f8552c != r0) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0091, code lost:
    
        r4 = r3.f8553d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0095, code lost:
    
        if (r4 <= r8) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0099, code lost:
    
        if (r4 > r10) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x009b, code lost:
    
        H0(r3.f8551b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a6, code lost:
    
        if (r3.f8551b.b() != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ae, code lost:
    
        if (r3.f8551b.j() == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b1, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00b4, code lost:
    
        r7.p.remove(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00bf, code lost:
    
        if (r1 >= r7.p.size()) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c1, code lost:
    
        r3 = r7.p.get(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ca, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00cc, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d3, code lost:
    
        if (r3.f8551b.b() != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00dd, code lost:
    
        r7.p.remove(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00e2, code lost:
    
        throw r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00e3, code lost:
    
        r7.M = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00e5, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0045, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x006a, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0055 -> B:12:0x0039). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0084 -> B:25:0x0060). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Y(long r8, long r10) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.h1.Y(long, long):void");
    }

    public final void Y0(boolean z) throws d1 {
        this.F = z;
        if (!this.s.H(this.x.f10460b, z)) {
            C0(true);
        }
        F(false);
    }

    public final void Z() {
        s1 s1VarN;
        this.s.y(this.L);
        if (this.s.D() && (s1VarN = this.s.n(this.L, this.x)) != null) {
            r1 r1VarF = this.s.f(this.f8529c, this.f8530d, this.f8532f.g(), this.t, s1VarN, this.f8531e);
            r1VarF.f9770a.r(this, s1VarN.f9802b);
            if (this.s.o() == r1VarF) {
                t0(r1VarF.m());
            }
            F(false);
        }
        if (!this.D) {
            V();
        } else {
            this.D = N();
            k1();
        }
    }

    public final void Z0(c.f.a.b.e3.u0 u0Var) throws Throwable {
        this.y.b(1);
        G(this.t.D(u0Var), false);
    }

    @Override // c.f.a.b.g3.o.a
    public void a() {
        this.f8534h.f(10);
    }

    public final void a0() {
        boolean z = false;
        while (b1()) {
            if (z) {
                W();
            }
            r1 r1VarO = this.s.o();
            r1 r1VarA = this.s.a();
            s1 s1Var = r1VarA.f9775f;
            i0.a aVar = s1Var.f9801a;
            long j2 = s1Var.f9802b;
            y1 y1VarK = K(aVar, j2, s1Var.f9803c, j2, true, 0);
            this.x = y1VarK;
            p2 p2Var = y1VarK.f10460b;
            l1(p2Var, r1VarA.f9775f.f9801a, p2Var, r1VarO.f9775f.f9801a, -9223372036854775807L);
            s0();
            o1();
            z = true;
        }
    }

    public final void a1(int i2) {
        y1 y1Var = this.x;
        if (y1Var.f10464f != i2) {
            this.x = y1Var.h(i2);
        }
    }

    @Override // c.f.a.b.d2.a
    public synchronized void b(d2 d2Var) {
        if (!this.z && this.f8535i.isAlive()) {
            this.f8534h.j(14, d2Var).a();
            return;
        }
        c.f.a.b.j3.z.i("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        d2Var.k(false);
    }

    public final void b0() {
        r1 r1VarP = this.s.p();
        if (r1VarP == null) {
            return;
        }
        int i2 = 0;
        if (r1VarP.j() != null && !this.B) {
            if (M()) {
                if (r1VarP.j().f9773d || this.L >= r1VarP.j().m()) {
                    c.f.a.b.g3.p pVarO = r1VarP.o();
                    r1 r1VarB = this.s.b();
                    c.f.a.b.g3.p pVarO2 = r1VarB.o();
                    if (r1VarB.f9773d && r1VarB.f9770a.q() != -9223372036854775807L) {
                        J0(r1VarB.m());
                        return;
                    }
                    for (int i3 = 0; i3 < this.f8528b.length; i3++) {
                        boolean zC = pVarO.c(i3);
                        boolean zC2 = pVarO2.c(i3);
                        if (zC && !this.f8528b[i3].u()) {
                            boolean z = this.f8529c[i3].getTrackType() == 7;
                            k2 k2Var = pVarO.f8523b[i3];
                            k2 k2Var2 = pVarO2.f8523b[i3];
                            if (!zC2 || !k2Var2.equals(k2Var) || z) {
                                K0(this.f8528b[i3], r1VarB.m());
                            }
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (!r1VarP.f9775f.f9809i && !this.B) {
            return;
        }
        while (true) {
            h2[] h2VarArr = this.f8528b;
            if (i2 >= h2VarArr.length) {
                return;
            }
            h2 h2Var = h2VarArr[i2];
            c.f.a.b.e3.s0 s0Var = r1VarP.f9772c[i2];
            if (s0Var != null && h2Var.q() == s0Var && h2Var.f()) {
                long j2 = r1VarP.f9775f.f9805e;
                K0(h2Var, (j2 == -9223372036854775807L || j2 == Long.MIN_VALUE) ? -9223372036854775807L : r1VarP.l() + r1VarP.f9775f.f9805e);
            }
            i2++;
        }
    }

    public final boolean b1() {
        r1 r1VarO;
        r1 r1VarJ;
        return d1() && !this.B && (r1VarO = this.s.o()) != null && (r1VarJ = r1VarO.j()) != null && this.L >= r1VarJ.m() && r1VarJ.f9776g;
    }

    @Override // c.f.a.b.v1.d
    public void c() {
        this.f8534h.f(22);
    }

    public final void c0() throws d1 {
        r1 r1VarP = this.s.p();
        if (r1VarP == null || this.s.o() == r1VarP || r1VarP.f9776g || !p0()) {
            return;
        }
        q();
    }

    public final boolean c1() {
        if (!N()) {
            return false;
        }
        r1 r1VarI = this.s.i();
        return this.f8532f.f(r1VarI == this.s.o() ? r1VarI.y(this.L) : r1VarI.y(this.L) - r1VarI.f9775f.f9802b, C(r1VarI.k()), this.f8541o.c().f10622c);
    }

    @Override // c.f.a.b.b1.a
    public void d(z1 z1Var) {
        this.f8534h.j(16, z1Var).a();
    }

    public final void d0() throws Throwable {
        G(this.t.h(), true);
    }

    public final boolean d1() {
        y1 y1Var = this.x;
        return y1Var.f10471m && y1Var.f10472n == 0;
    }

    public final void e0(c cVar) throws Throwable {
        this.y.b(1);
        G(this.t.v(cVar.f8547a, cVar.f8548b, cVar.f8549c, cVar.f8550d), false);
    }

    public final boolean e1(boolean z) {
        if (this.J == 0) {
            return P();
        }
        if (!z) {
            return false;
        }
        y1 y1Var = this.x;
        if (!y1Var.f10466h) {
            return true;
        }
        long jC = f1(y1Var.f10460b, this.s.o().f9775f.f9801a) ? this.u.c() : -9223372036854775807L;
        r1 r1VarI = this.s.i();
        return (r1VarI.q() && r1VarI.f9775f.f9809i) || (r1VarI.f9775f.f9801a.b() && !r1VarI.f9773d) || this.f8532f.e(B(), this.f8541o.c().f10622c, this.C, jC);
    }

    public final void f0() {
        for (r1 r1VarO = this.s.o(); r1VarO != null; r1VarO = r1VarO.j()) {
            for (c.f.a.b.g3.h hVar : r1VarO.o().f8524c) {
                if (hVar != null) {
                    hVar.q();
                }
            }
        }
    }

    public final boolean f1(p2 p2Var, i0.a aVar) {
        if (aVar.b() || p2Var.q()) {
            return false;
        }
        p2Var.n(p2Var.h(aVar.f7476a, this.f8538l).f9704d, this.f8537k);
        if (!this.f8537k.f()) {
            return false;
        }
        p2.c cVar = this.f8537k;
        return cVar.f9721m && cVar.f9718j != -9223372036854775807L;
    }

    public final void g(b bVar, int i2) throws Throwable {
        this.y.b(1);
        v1 v1Var = this.t;
        if (i2 == -1) {
            i2 = v1Var.p();
        }
        G(v1Var.e(i2, bVar.f8543a, bVar.f8544b), false);
    }

    public final void g0(boolean z) {
        for (r1 r1VarO = this.s.o(); r1VarO != null; r1VarO = r1VarO.j()) {
            for (c.f.a.b.g3.h hVar : r1VarO.o().f8524c) {
                if (hVar != null) {
                    hVar.f(z);
                }
            }
        }
    }

    public final void g1() {
        this.C = false;
        this.f8541o.g();
        for (h2 h2Var : this.f8528b) {
            if (O(h2Var)) {
                h2Var.start();
            }
        }
    }

    public void h(int i2, List<v1.c> list, c.f.a.b.e3.u0 u0Var) {
        this.f8534h.g(18, i2, 0, new b(list, u0Var, -1, -9223372036854775807L, null)).a();
    }

    public final void h0() {
        for (r1 r1VarO = this.s.o(); r1VarO != null; r1VarO = r1VarO.j()) {
            for (c.f.a.b.g3.h hVar : r1VarO.o().f8524c) {
                if (hVar != null) {
                    hVar.r();
                }
            }
        }
    }

    public void h1() {
        this.f8534h.c(6).a();
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) throws Throwable {
        d1 e2;
        int i2;
        IOException iOException;
        r1 r1VarP;
        try {
            switch (message.what) {
                case 0:
                    k0();
                    break;
                case 1:
                    R0(message.arg1 != 0, message.arg2, true, 1);
                    break;
                case 2:
                    o();
                    break;
                case 3:
                    D0((h) message.obj);
                    break;
                case 4:
                    T0((z1) message.obj);
                    break;
                case 5:
                    W0((m2) message.obj);
                    break;
                case 6:
                    i1(false, true);
                    break;
                case 7:
                    m0();
                    return true;
                case 8:
                    H((c.f.a.b.e3.f0) message.obj);
                    break;
                case 9:
                    D((c.f.a.b.e3.f0) message.obj);
                    break;
                case 10:
                    q0();
                    break;
                case 11:
                    V0(message.arg1);
                    break;
                case 12:
                    Y0(message.arg1 != 0);
                    break;
                case 13:
                    L0(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    G0((d2) message.obj);
                    break;
                case 15:
                    I0((d2) message.obj);
                    break;
                case 16:
                    J((z1) message.obj, false);
                    break;
                case 17:
                    M0((b) message.obj);
                    break;
                case 18:
                    g((b) message.obj, message.arg1);
                    break;
                case 19:
                    e0((c) message.obj);
                    break;
                case 20:
                    n0(message.arg1, message.arg2, (c.f.a.b.e3.u0) message.obj);
                    break;
                case 21:
                    Z0((c.f.a.b.e3.u0) message.obj);
                    break;
                case 22:
                    d0();
                    break;
                case 23:
                    P0(message.arg1 != 0);
                    break;
                case 24:
                    O0(message.arg1 == 1);
                    break;
                case 25:
                    l();
                    break;
                default:
                    return false;
            }
        } catch (d1 e3) {
            e2 = e3;
            if (e2.f6844f == 1 && (r1VarP = this.s.p()) != null) {
                e2 = e2.c(r1VarP.f9775f.f9801a);
            }
            if (e2.f6850l && this.O == null) {
                c.f.a.b.j3.z.j("ExoPlayerImplInternal", "Recoverable renderer error", e2);
                this.O = e2;
                c.f.a.b.j3.v vVar = this.f8534h;
                vVar.d(vVar.j(25, e2));
            } else {
                if (this.O != null) {
                    e2 = this.O;
                }
                c.f.a.b.j3.z.e("ExoPlayerImplInternal", "Playback error", e2);
                i1(true, false);
                this.x = this.x.f(e2);
            }
        } catch (c.f.a.b.e3.o e4) {
            i2 = AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE;
            iOException = e4;
            E(iOException, i2);
        } catch (c.f.a.b.i3.q e5) {
            i2 = e5.f9054b;
            iOException = e5;
            E(iOException, i2);
        } catch (w1 e6) {
            int i3 = e6.f10310c;
            if (i3 == 1) {
                i = e6.f10309b ? AdError.MEDIATION_ERROR_CODE : 3003;
            } else if (i3 == 4) {
                i = e6.f10309b ? 3002 : 3004;
            }
            E(e6, i);
        } catch (y.a e7) {
            i2 = e7.f10454b;
            iOException = e7;
            E(iOException, i2);
        } catch (IOException e8) {
            i2 = AdError.SERVER_ERROR_CODE;
            iOException = e8;
            E(iOException, i2);
        } catch (RuntimeException e9) {
            e2 = d1.g(e9, ((e9 instanceof IllegalStateException) || (e9 instanceof IllegalArgumentException)) ? 1004 : 1000);
            c.f.a.b.j3.z.e("ExoPlayerImplInternal", "Playback error", e2);
            i1(true, false);
            this.x = this.x.f(e2);
        }
        W();
        return true;
    }

    @Override // c.f.a.b.e3.t0.a
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public void i(c.f.a.b.e3.f0 f0Var) {
        this.f8534h.j(9, f0Var).a();
    }

    public final void i1(boolean z, boolean z2) {
        r0(z || !this.G, false, true, false);
        this.y.b(z2 ? 1 : 0);
        this.f8532f.h();
        a1(1);
    }

    public void j0() {
        this.f8534h.c(0).a();
    }

    public final void j1() {
        this.f8541o.h();
        for (h2 h2Var : this.f8528b) {
            if (O(h2Var)) {
                s(h2Var);
            }
        }
    }

    @Override // c.f.a.b.e3.f0.a
    public void k(c.f.a.b.e3.f0 f0Var) {
        this.f8534h.j(8, f0Var).a();
    }

    public final void k0() {
        this.y.b(1);
        r0(false, false, false, true);
        this.f8532f.onPrepared();
        a1(this.x.f10460b.q() ? 4 : 2);
        this.t.w(this.f8533g.d());
        this.f8534h.f(2);
    }

    public final void k1() {
        r1 r1VarI = this.s.i();
        boolean z = this.D || (r1VarI != null && r1VarI.f9770a.d());
        y1 y1Var = this.x;
        if (z != y1Var.f10466h) {
            this.x = y1Var.a(z);
        }
    }

    public final void l() throws d1 {
        C0(true);
    }

    public synchronized boolean l0() {
        if (!this.z && this.f8535i.isAlive()) {
            this.f8534h.f(7);
            q1(new c.f.b.a.o() { // from class: c.f.a.b.a0
                @Override // c.f.b.a.o
                public final Object get() {
                    return this.f6384b.S();
                }
            }, this.v);
            return this.z;
        }
        return true;
    }

    public final void l1(p2 p2Var, i0.a aVar, p2 p2Var2, i0.a aVar2, long j2) {
        if (p2Var.q() || !f1(p2Var, aVar)) {
            float f2 = this.f8541o.c().f10622c;
            z1 z1Var = this.x.f10473o;
            if (f2 != z1Var.f10622c) {
                this.f8541o.d(z1Var);
                return;
            }
            return;
        }
        p2Var.n(p2Var.h(aVar.f7476a, this.f8538l).f9704d, this.f8537k);
        this.u.a((p1.f) c.f.a.b.j3.x0.i(this.f8537k.f9723o));
        if (j2 != -9223372036854775807L) {
            this.u.e(x(p2Var, aVar.f7476a, j2));
            return;
        }
        if (c.f.a.b.j3.x0.b(p2Var2.q() ? null : p2Var2.n(p2Var2.h(aVar2.f7476a, this.f8538l).f9704d, this.f8537k).f9713e, this.f8537k.f9713e)) {
            return;
        }
        this.u.e(-9223372036854775807L);
    }

    public final void m(d2 d2Var) {
        if (d2Var.j()) {
            return;
        }
        try {
            d2Var.f().p(d2Var.h(), d2Var.d());
        } finally {
            d2Var.k(true);
        }
    }

    public final void m0() {
        r0(true, false, true, false);
        this.f8532f.d();
        a1(1);
        this.f8535i.quit();
        synchronized (this) {
            this.z = true;
            notifyAll();
        }
    }

    public final void m1(c.f.a.b.e3.a1 a1Var, c.f.a.b.g3.p pVar) {
        this.f8532f.c(this.f8528b, a1Var, pVar.f8524c);
    }

    public final void n(h2 h2Var) {
        if (O(h2Var)) {
            this.f8541o.a(h2Var);
            s(h2Var);
            h2Var.disable();
            this.J--;
        }
    }

    public final void n0(int i2, int i3, c.f.a.b.e3.u0 u0Var) throws Throwable {
        this.y.b(1);
        G(this.t.A(i2, i3, u0Var), false);
    }

    public final void n1() throws d1 {
        if (this.x.f10460b.q() || !this.t.r()) {
            return;
        }
        Z();
        b0();
        c0();
        a0();
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01aa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0138  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o() throws c.f.a.b.d1 {
        /*
            Method dump skipped, instruction units count: 466
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.h1.o():void");
    }

    public void o0(int i2, int i3, c.f.a.b.e3.u0 u0Var) {
        this.f8534h.g(20, i2, i3, u0Var).a();
    }

    public final void o1() {
        r1 r1VarO = this.s.o();
        if (r1VarO == null) {
            return;
        }
        long jQ = r1VarO.f9773d ? r1VarO.f9770a.q() : -9223372036854775807L;
        if (jQ != -9223372036854775807L) {
            t0(jQ);
            if (jQ != this.x.t) {
                y1 y1Var = this.x;
                this.x = K(y1Var.f10461c, jQ, y1Var.f10462d, jQ, true, 5);
            }
        } else {
            long jI = this.f8541o.i(r1VarO != this.s.p());
            this.L = jI;
            long jY = r1VarO.y(jI);
            Y(this.x.t, jY);
            this.x.t = jY;
        }
        this.x.r = this.s.i().i();
        this.x.s = B();
        y1 y1Var2 = this.x;
        if (y1Var2.f10471m && y1Var2.f10464f == 3 && f1(y1Var2.f10460b, y1Var2.f10461c) && this.x.f10473o.f10622c == 1.0f) {
            float fB = this.u.b(v(), B());
            if (this.f8541o.c().f10622c != fB) {
                this.f8541o.d(this.x.f10473o.b(fB));
                I(this.x.f10473o, this.f8541o.c().f10622c, false, false);
            }
        }
    }

    public final void p(int i2, boolean z) throws d1 {
        h2 h2Var = this.f8528b[i2];
        if (O(h2Var)) {
            return;
        }
        r1 r1VarP = this.s.p();
        boolean z2 = r1VarP == this.s.o();
        c.f.a.b.g3.p pVarO = r1VarP.o();
        k2 k2Var = pVarO.f8523b[i2];
        k1[] k1VarArrW = w(pVarO.f8524c[i2]);
        boolean z3 = d1() && this.x.f10464f == 3;
        boolean z4 = !z && z3;
        this.J++;
        h2Var.m(k2Var, k1VarArrW, r1VarP.f9772c[i2], this.L, z4, z2, r1VarP.m(), r1VarP.l());
        h2Var.p(103, new a());
        this.f8541o.b(h2Var);
        if (z3) {
            h2Var.start();
        }
    }

    public final boolean p0() {
        r1 r1VarP = this.s.p();
        c.f.a.b.g3.p pVarO = r1VarP.o();
        int i2 = 0;
        boolean z = false;
        while (true) {
            h2[] h2VarArr = this.f8528b;
            if (i2 >= h2VarArr.length) {
                return !z;
            }
            h2 h2Var = h2VarArr[i2];
            if (O(h2Var)) {
                boolean z2 = h2Var.q() != r1VarP.f9772c[i2];
                if (!pVarO.c(i2) || z2) {
                    if (!h2Var.u()) {
                        h2Var.g(w(pVarO.f8524c[i2]), r1VarP.f9772c[i2], r1VarP.m(), r1VarP.l());
                    } else if (h2Var.b()) {
                        n(h2Var);
                    } else {
                        z = true;
                    }
                }
            }
            i2++;
        }
    }

    public final void p1(float f2) {
        for (r1 r1VarO = this.s.o(); r1VarO != null; r1VarO = r1VarO.j()) {
            for (c.f.a.b.g3.h hVar : r1VarO.o().f8524c) {
                if (hVar != null) {
                    hVar.o(f2);
                }
            }
        }
    }

    public final void q() throws d1 {
        r(new boolean[this.f8528b.length]);
    }

    public final void q0() throws d1 {
        float f2 = this.f8541o.c().f10622c;
        r1 r1VarP = this.s.p();
        boolean z = true;
        for (r1 r1VarO = this.s.o(); r1VarO != null && r1VarO.f9773d; r1VarO = r1VarO.j()) {
            c.f.a.b.g3.p pVarV = r1VarO.v(f2, this.x.f10460b);
            if (!pVarV.a(r1VarO.o())) {
                t1 t1Var = this.s;
                if (z) {
                    r1 r1VarO2 = t1Var.o();
                    boolean z2 = this.s.z(r1VarO2);
                    boolean[] zArr = new boolean[this.f8528b.length];
                    long jB = r1VarO2.b(pVarV, this.x.t, z2, zArr);
                    y1 y1Var = this.x;
                    boolean z3 = (y1Var.f10464f == 4 || jB == y1Var.t) ? false : true;
                    y1 y1Var2 = this.x;
                    this.x = K(y1Var2.f10461c, jB, y1Var2.f10462d, y1Var2.f10463e, z3, 5);
                    if (z3) {
                        t0(jB);
                    }
                    boolean[] zArr2 = new boolean[this.f8528b.length];
                    int i2 = 0;
                    while (true) {
                        h2[] h2VarArr = this.f8528b;
                        if (i2 >= h2VarArr.length) {
                            break;
                        }
                        h2 h2Var = h2VarArr[i2];
                        zArr2[i2] = O(h2Var);
                        c.f.a.b.e3.s0 s0Var = r1VarO2.f9772c[i2];
                        if (zArr2[i2]) {
                            if (s0Var != h2Var.q()) {
                                n(h2Var);
                            } else if (zArr[i2]) {
                                h2Var.t(this.L);
                            }
                        }
                        i2++;
                    }
                    r(zArr2);
                } else {
                    t1Var.z(r1VarO);
                    if (r1VarO.f9773d) {
                        r1VarO.a(pVarV, Math.max(r1VarO.f9775f.f9802b, r1VarO.y(this.L)), false);
                    }
                }
                F(true);
                if (this.x.f10464f != 4) {
                    V();
                    o1();
                    this.f8534h.f(2);
                    return;
                }
                return;
            }
            if (r1VarO == r1VarP) {
                z = false;
            }
        }
    }

    public final synchronized void q1(c.f.b.a.o<Boolean> oVar, long j2) {
        long jB = this.q.b() + j2;
        boolean z = false;
        while (!oVar.get().booleanValue() && j2 > 0) {
            try {
                this.q.e();
                wait(j2);
            } catch (InterruptedException unused) {
                z = true;
            }
            j2 = jB - this.q.b();
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public final void r(boolean[] zArr) throws d1 {
        r1 r1VarP = this.s.p();
        c.f.a.b.g3.p pVarO = r1VarP.o();
        for (int i2 = 0; i2 < this.f8528b.length; i2++) {
            if (!pVarO.c(i2)) {
                this.f8528b[i2].reset();
            }
        }
        for (int i3 = 0; i3 < this.f8528b.length; i3++) {
            if (pVarO.c(i3)) {
                p(i3, zArr[i3]);
            }
        }
        r1VarP.f9776g = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x009b A[PHI: r4 r5 r7
  0x009b: PHI (r4v3 c.f.a.b.e3.i0$a) = (r4v2 c.f.a.b.e3.i0$a), (r4v8 c.f.a.b.e3.i0$a) binds: [B:29:0x006e, B:31:0x0093] A[DONT_GENERATE, DONT_INLINE]
  0x009b: PHI (r5v2 long) = (r5v1 long), (r5v4 long) binds: [B:29:0x006e, B:31:0x0093] A[DONT_GENERATE, DONT_INLINE]
  0x009b: PHI (r7v3 long) = (r7v2 long), (r7v5 long) binds: [B:29:0x006e, B:31:0x0093] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r0(boolean r30, boolean r31, boolean r32, boolean r33) {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.h1.r0(boolean, boolean, boolean, boolean):void");
    }

    public final void s(h2 h2Var) {
        if (h2Var.getState() == 2) {
            h2Var.stop();
        }
    }

    public final void s0() {
        r1 r1VarO = this.s.o();
        this.B = r1VarO != null && r1VarO.f9775f.f9808h && this.A;
    }

    public void t(long j2) {
        this.P = j2;
    }

    public final void t0(long j2) {
        r1 r1VarO = this.s.o();
        if (r1VarO != null) {
            j2 = r1VarO.z(j2);
        }
        this.L = j2;
        this.f8541o.e(j2);
        for (h2 h2Var : this.f8528b) {
            if (O(h2Var)) {
                h2Var.t(this.L);
            }
        }
        f0();
    }

    public final c.f.b.b.t<c.f.a.b.b3.a> u(c.f.a.b.g3.h[] hVarArr) {
        t.a aVar = new t.a();
        boolean z = false;
        for (c.f.a.b.g3.h hVar : hVarArr) {
            if (hVar != null) {
                c.f.a.b.b3.a aVar2 = hVar.g(0).f9336k;
                if (aVar2 == null) {
                    aVar.d(new c.f.a.b.b3.a(new a.b[0]));
                } else {
                    aVar.d(aVar2);
                    z = true;
                }
            }
        }
        return z ? aVar.e() : c.f.b.b.t.J();
    }

    public final long v() {
        y1 y1Var = this.x;
        return x(y1Var.f10460b, y1Var.f10461c.f7476a, y1Var.t);
    }

    public final void w0(p2 p2Var, p2 p2Var2) {
        if (p2Var.q() && p2Var2.q()) {
            return;
        }
        for (int size = this.p.size() - 1; size >= 0; size--) {
            if (!v0(this.p.get(size), p2Var, p2Var2, this.E, this.F, this.f8537k, this.f8538l)) {
                this.p.get(size).f8551b.k(false);
                this.p.remove(size);
            }
        }
        Collections.sort(this.p);
    }

    public final long x(p2 p2Var, Object obj, long j2) {
        p2Var.n(p2Var.h(obj, this.f8538l).f9704d, this.f8537k);
        p2.c cVar = this.f8537k;
        if (cVar.f9718j != -9223372036854775807L && cVar.f()) {
            p2.c cVar2 = this.f8537k;
            if (cVar2.f9721m) {
                return w0.d(cVar2.a() - this.f8537k.f9718j) - (j2 + this.f8538l.o());
            }
        }
        return -9223372036854775807L;
    }

    public final long y() {
        r1 r1VarP = this.s.p();
        if (r1VarP == null) {
            return 0L;
        }
        long jL = r1VarP.l();
        if (!r1VarP.f9773d) {
            return jL;
        }
        int i2 = 0;
        while (true) {
            h2[] h2VarArr = this.f8528b;
            if (i2 >= h2VarArr.length) {
                return jL;
            }
            if (O(h2VarArr[i2]) && this.f8528b[i2].q() == r1VarP.f9772c[i2]) {
                long jS = this.f8528b[i2].s();
                if (jS == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                jL = Math.max(jS, jL);
            }
            i2++;
        }
    }

    public final Pair<i0.a, Long> z(p2 p2Var) {
        if (p2Var.q()) {
            return Pair.create(y1.l(), 0L);
        }
        Pair<Object, Long> pairJ = p2Var.j(this.f8537k, this.f8538l, p2Var.a(this.F), -9223372036854775807L);
        i0.a aVarA = this.s.A(p2Var, pairJ.first, 0L);
        long jLongValue = ((Long) pairJ.second).longValue();
        if (aVarA.b()) {
            p2Var.h(aVarA.f7476a, this.f8538l);
            jLongValue = aVarA.f7478c == this.f8538l.l(aVarA.f7477b) ? this.f8538l.g() : 0L;
        }
        return Pair.create(aVarA, Long.valueOf(jLongValue));
    }
}
