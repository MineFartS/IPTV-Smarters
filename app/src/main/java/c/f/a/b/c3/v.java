package c.f.a.b.c3;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.SparseIntArray;
import c.f.a.b.c3.a0;
import c.f.a.b.d1;
import c.f.a.b.e3.a1;
import c.f.a.b.e3.f0;
import c.f.a.b.e3.i0;
import c.f.a.b.e3.z0;
import c.f.a.b.g3.f;
import c.f.a.b.g3.h;
import c.f.a.b.g3.j;
import c.f.a.b.g3.o;
import c.f.a.b.h2;
import c.f.a.b.i3.i;
import c.f.a.b.i3.n0;
import c.f.a.b.i3.p;
import c.f.a.b.j2;
import c.f.a.b.j3.x0;
import c.f.a.b.k1;
import c.f.a.b.l2;
import c.f.a.b.p1;
import c.f.a.b.p2;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f.d f6774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final f.d f6775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final f.d f6776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p1.g f6777d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c.f.a.b.e3.i0 f6778e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c.f.a.b.g3.f f6779f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j2[] f6780g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final SparseIntArray f6781h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Handler f6782i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p2.c f6783j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f6784k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c f6785l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public g f6786m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public a1[] f6787n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public j.a[] f6788o;
    public List<c.f.a.b.g3.h>[][] p;
    public List<c.f.a.b.g3.h>[][] q;

    public static class a implements c.f.a.b.k3.d0 {
        @Override // c.f.a.b.k3.d0
        public /* synthetic */ void F(int i2, long j2) {
            c.f.a.b.k3.c0.a(this, i2, j2);
        }

        @Override // c.f.a.b.k3.d0
        public /* synthetic */ void M(Object obj, long j2) {
            c.f.a.b.k3.c0.b(this, obj, j2);
        }

        @Override // c.f.a.b.k3.d0
        public /* synthetic */ void R(k1 k1Var) {
            c.f.a.b.k3.c0.i(this, k1Var);
        }

        @Override // c.f.a.b.k3.d0
        public /* synthetic */ void S(c.f.a.b.v2.d dVar) {
            c.f.a.b.k3.c0.g(this, dVar);
        }

        @Override // c.f.a.b.k3.d0
        public /* synthetic */ void T(k1 k1Var, c.f.a.b.v2.g gVar) {
            c.f.a.b.k3.c0.j(this, k1Var, gVar);
        }

        @Override // c.f.a.b.k3.d0
        public /* synthetic */ void Y(Exception exc) {
            c.f.a.b.k3.c0.c(this, exc);
        }

        @Override // c.f.a.b.k3.d0
        public /* synthetic */ void b(c.f.a.b.k3.e0 e0Var) {
            c.f.a.b.k3.c0.k(this, e0Var);
        }

        @Override // c.f.a.b.k3.d0
        public /* synthetic */ void c0(c.f.a.b.v2.d dVar) {
            c.f.a.b.k3.c0.f(this, dVar);
        }

        @Override // c.f.a.b.k3.d0
        public /* synthetic */ void j(String str) {
            c.f.a.b.k3.c0.e(this, str);
        }

        @Override // c.f.a.b.k3.d0
        public /* synthetic */ void j0(long j2, int i2) {
            c.f.a.b.k3.c0.h(this, j2, i2);
        }

        @Override // c.f.a.b.k3.d0
        public /* synthetic */ void m(String str, long j2, long j3) {
            c.f.a.b.k3.c0.d(this, str, j2, j3);
        }
    }

    public static class b implements c.f.a.b.t2.u {
        @Override // c.f.a.b.t2.u
        public /* synthetic */ void A(String str) {
            c.f.a.b.t2.t.c(this, str);
        }

        @Override // c.f.a.b.t2.u
        public /* synthetic */ void B(String str, long j2, long j3) {
            c.f.a.b.t2.t.b(this, str, j2, j3);
        }

        @Override // c.f.a.b.t2.u
        public /* synthetic */ void I(k1 k1Var, c.f.a.b.v2.g gVar) {
            c.f.a.b.t2.t.g(this, k1Var, gVar);
        }

        @Override // c.f.a.b.t2.u
        public /* synthetic */ void U(long j2) {
            c.f.a.b.t2.t.h(this, j2);
        }

        @Override // c.f.a.b.t2.u
        public /* synthetic */ void W(Exception exc) {
            c.f.a.b.t2.t.a(this, exc);
        }

        @Override // c.f.a.b.t2.u
        public /* synthetic */ void X(k1 k1Var) {
            c.f.a.b.t2.t.f(this, k1Var);
        }

        @Override // c.f.a.b.t2.u
        public /* synthetic */ void a(boolean z) {
            c.f.a.b.t2.t.k(this, z);
        }

        @Override // c.f.a.b.t2.u
        public /* synthetic */ void c(Exception exc) {
            c.f.a.b.t2.t.i(this, exc);
        }

        @Override // c.f.a.b.t2.u
        public /* synthetic */ void e(c.f.a.b.v2.d dVar) {
            c.f.a.b.t2.t.d(this, dVar);
        }

        @Override // c.f.a.b.t2.u
        public /* synthetic */ void g0(int i2, long j2, long j3) {
            c.f.a.b.t2.t.j(this, i2, j2, j3);
        }

        @Override // c.f.a.b.t2.u
        public /* synthetic */ void k(c.f.a.b.v2.d dVar) {
            c.f.a.b.t2.t.e(this, dVar);
        }
    }

    public interface c {
        void a(v vVar);

        void b(v vVar, IOException iOException);
    }

    public static final class d extends c.f.a.b.g3.e {

        public static final class a implements h.b {
            public a() {
            }

            public /* synthetic */ a(a aVar) {
                this();
            }

            @Override // c.f.a.b.g3.h.b
            public c.f.a.b.g3.h[] a(h.a[] aVarArr, c.f.a.b.i3.i iVar, i0.a aVar, p2 p2Var) {
                c.f.a.b.g3.h[] hVarArr = new c.f.a.b.g3.h[aVarArr.length];
                for (int i2 = 0; i2 < aVarArr.length; i2++) {
                    hVarArr[i2] = aVarArr[i2] == null ? null : new d(aVarArr[i2].f8475a, aVarArr[i2].f8476b);
                }
                return hVarArr;
            }
        }

        public d(z0 z0Var, int[] iArr) {
            super(z0Var, iArr);
        }

        @Override // c.f.a.b.g3.h
        public int b() {
            return 0;
        }

        @Override // c.f.a.b.g3.h
        public void k(long j2, long j3, long j4, List<? extends c.f.a.b.e3.d1.n> list, c.f.a.b.e3.d1.o[] oVarArr) {
        }

        @Override // c.f.a.b.g3.h
        public int n() {
            return 0;
        }

        @Override // c.f.a.b.g3.h
        public Object p() {
            return null;
        }
    }

    public static final class e implements c.f.a.b.i3.i {
        public e() {
        }

        public /* synthetic */ e(a aVar) {
            this();
        }

        @Override // c.f.a.b.i3.i
        public /* synthetic */ long a() {
            return c.f.a.b.i3.h.a(this);
        }

        @Override // c.f.a.b.i3.i
        public n0 d() {
            return null;
        }

        @Override // c.f.a.b.i3.i
        public void e(i.a aVar) {
        }

        @Override // c.f.a.b.i3.i
        public long f() {
            return 0L;
        }

        @Override // c.f.a.b.i3.i
        public void h(Handler handler, i.a aVar) {
        }
    }

    public static class f extends IOException {
    }

    public static final class g implements i0.b, f0.a, Handler.Callback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c.f.a.b.e3.i0 f6789b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final v f6790c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final c.f.a.b.i3.f f6791d = new c.f.a.b.i3.t(true, 65536);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ArrayList<c.f.a.b.e3.f0> f6792e = new ArrayList<>();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Handler f6793f = x0.A(new Handler.Callback() { // from class: c.f.a.b.c3.d
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f6703b.b(message);
            }
        });

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final HandlerThread f6794g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Handler f6795h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public p2 f6796i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public c.f.a.b.e3.f0[] f6797j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f6798k;

        public g(c.f.a.b.e3.i0 i0Var, v vVar) {
            this.f6789b = i0Var;
            this.f6790c = vVar;
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DownloadHelper");
            this.f6794g = handlerThread;
            handlerThread.start();
            Handler handlerW = x0.w(handlerThread.getLooper(), this);
            this.f6795h = handlerW;
            handlerW.sendEmptyMessage(0);
        }

        @Override // c.f.a.b.e3.i0.b
        public void a(c.f.a.b.e3.i0 i0Var, p2 p2Var) {
            c.f.a.b.e3.f0[] f0VarArr;
            if (this.f6796i != null) {
                return;
            }
            if (p2Var.n(0, new p2.c()).f()) {
                this.f6793f.obtainMessage(1, new f()).sendToTarget();
                return;
            }
            this.f6796i = p2Var;
            this.f6797j = new c.f.a.b.e3.f0[p2Var.i()];
            int i2 = 0;
            while (true) {
                f0VarArr = this.f6797j;
                if (i2 >= f0VarArr.length) {
                    break;
                }
                c.f.a.b.e3.f0 f0VarA = this.f6789b.a(new i0.a(p2Var.m(i2)), this.f6791d, 0L);
                this.f6797j[i2] = f0VarA;
                this.f6792e.add(f0VarA);
                i2++;
            }
            for (c.f.a.b.e3.f0 f0Var : f0VarArr) {
                f0Var.r(this, 0L);
            }
        }

        public final boolean b(Message message) {
            if (this.f6798k) {
                return false;
            }
            int i2 = message.what;
            if (i2 == 0) {
                this.f6790c.A();
                return true;
            }
            if (i2 != 1) {
                return false;
            }
            e();
            this.f6790c.z((IOException) x0.i(message.obj));
            return true;
        }

        @Override // c.f.a.b.e3.t0.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void i(c.f.a.b.e3.f0 f0Var) {
            if (this.f6792e.contains(f0Var)) {
                this.f6795h.obtainMessage(2, f0Var).sendToTarget();
            }
        }

        public void e() {
            if (this.f6798k) {
                return;
            }
            this.f6798k = true;
            this.f6795h.sendEmptyMessage(3);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 0) {
                this.f6789b.q(this, null);
                this.f6795h.sendEmptyMessage(1);
                return true;
            }
            int i3 = 0;
            if (i2 == 1) {
                try {
                    if (this.f6797j == null) {
                        this.f6789b.l();
                    } else {
                        while (i3 < this.f6792e.size()) {
                            this.f6792e.get(i3).n();
                            i3++;
                        }
                    }
                    this.f6795h.sendEmptyMessageDelayed(1, 100L);
                } catch (IOException e2) {
                    this.f6793f.obtainMessage(1, e2).sendToTarget();
                }
                return true;
            }
            if (i2 == 2) {
                c.f.a.b.e3.f0 f0Var = (c.f.a.b.e3.f0) message.obj;
                if (this.f6792e.contains(f0Var)) {
                    f0Var.c(0L);
                }
                return true;
            }
            if (i2 != 3) {
                return false;
            }
            c.f.a.b.e3.f0[] f0VarArr = this.f6797j;
            if (f0VarArr != null) {
                int length = f0VarArr.length;
                while (i3 < length) {
                    this.f6789b.o(f0VarArr[i3]);
                    i3++;
                }
            }
            this.f6789b.b(this);
            this.f6795h.removeCallbacksAndMessages(null);
            this.f6794g.quit();
            return true;
        }

        @Override // c.f.a.b.e3.f0.a
        public void k(c.f.a.b.e3.f0 f0Var) {
            this.f6792e.remove(f0Var);
            if (this.f6792e.isEmpty()) {
                this.f6795h.removeMessages(1);
                this.f6793f.sendEmptyMessage(0);
            }
        }
    }

    static {
        f.d dVarW = f.d.z.h().U(true).w();
        f6774a = dVarW;
        f6775b = dVarW;
        f6776c = dVarW;
    }

    public v(p1 p1Var, c.f.a.b.e3.i0 i0Var, f.d dVar, j2[] j2VarArr) {
        this.f6777d = (p1.g) c.f.a.b.j3.g.e(p1Var.f9643d);
        this.f6778e = i0Var;
        a aVar = null;
        c.f.a.b.g3.f fVar = new c.f.a.b.g3.f(dVar, new d.a(aVar));
        this.f6779f = fVar;
        this.f6780g = j2VarArr;
        this.f6781h = new SparseIntArray();
        fVar.b(new o.a() { // from class: c.f.a.b.c3.e
            @Override // c.f.a.b.g3.o.a
            public final void a() {
                v.s();
            }
        }, new e(aVar));
        this.f6782i = x0.z();
        this.f6783j = new p2.c();
    }

    public static c.f.a.b.e3.i0 g(p1 p1Var, p.a aVar, c.f.a.b.x2.c0 c0Var) {
        return new c.f.a.b.e3.w(aVar, c.f.a.b.z2.o.f11492a).c(c0Var).a(p1Var);
    }

    public static v h(Context context, p1 p1Var, l2 l2Var, p.a aVar) {
        return i(p1Var, j(context), l2Var, aVar, null);
    }

    public static v i(p1 p1Var, f.d dVar, l2 l2Var, p.a aVar, c.f.a.b.x2.c0 c0Var) {
        boolean zP = p((p1.g) c.f.a.b.j3.g.e(p1Var.f9643d));
        c.f.a.b.j3.g.a(zP || aVar != null);
        return new v(p1Var, zP ? null : g(p1Var, (p.a) x0.i(aVar), c0Var), dVar, l2Var != null ? o(l2Var) : new j2[0]);
    }

    public static f.d j(Context context) {
        return f.d.j(context).h().U(true).w();
    }

    public static j2[] o(l2 l2Var) {
        h2[] h2VarArrA = l2Var.a(x0.z(), new a(), new b(), new c.f.a.b.f3.l() { // from class: c.f.a.b.c3.f
            @Override // c.f.a.b.f3.l
            public final void Q(List list) {
                v.q(list);
            }
        }, new c.f.a.b.b3.f() { // from class: c.f.a.b.c3.a
            @Override // c.f.a.b.b3.f
            public final void D(c.f.a.b.b3.a aVar) {
                v.r(aVar);
            }
        });
        j2[] j2VarArr = new j2[h2VarArrA.length];
        for (int i2 = 0; i2 < h2VarArrA.length; i2++) {
            j2VarArr[i2] = h2VarArrA[i2].i();
        }
        return j2VarArr;
    }

    public static boolean p(p1.g gVar) {
        return x0.o0(gVar.f9685a, gVar.f9686b) == 4;
    }

    public static /* synthetic */ void q(List list) {
    }

    public static /* synthetic */ void r(c.f.a.b.b3.a aVar) {
    }

    public static /* synthetic */ void s() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void u(IOException iOException) {
        ((c) c.f.a.b.j3.g.e(this.f6785l)).b(this, iOException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void w() {
        ((c) c.f.a.b.j3.g.e(this.f6785l)).a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void y(c cVar) {
        cVar.a(this);
    }

    public final void A() {
        c.f.a.b.j3.g.e(this.f6786m);
        c.f.a.b.j3.g.e(this.f6786m.f6797j);
        c.f.a.b.j3.g.e(this.f6786m.f6796i);
        int length = this.f6786m.f6797j.length;
        int length2 = this.f6780g.length;
        this.p = (List[][]) Array.newInstance((Class<?>) List.class, length, length2);
        this.q = (List[][]) Array.newInstance((Class<?>) List.class, length, length2);
        for (int i2 = 0; i2 < length; i2++) {
            for (int i3 = 0; i3 < length2; i3++) {
                this.p[i2][i3] = new ArrayList();
                this.q[i2][i3] = Collections.unmodifiableList(this.p[i2][i3]);
            }
        }
        this.f6787n = new a1[length];
        this.f6788o = new j.a[length];
        for (int i4 = 0; i4 < length; i4++) {
            this.f6787n[i4] = this.f6786m.f6797j[i4].t();
            this.f6779f.d(D(i4).f8525d);
            this.f6788o[i4] = (j.a) c.f.a.b.j3.g.e(this.f6779f.g());
        }
        E();
        ((Handler) c.f.a.b.j3.g.e(this.f6782i)).post(new Runnable() { // from class: c.f.a.b.c3.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f6677b.w();
            }
        });
    }

    public void B(final c cVar) {
        c.f.a.b.j3.g.g(this.f6785l == null);
        this.f6785l = cVar;
        c.f.a.b.e3.i0 i0Var = this.f6778e;
        if (i0Var != null) {
            this.f6786m = new g(i0Var, this);
        } else {
            this.f6782i.post(new Runnable() { // from class: c.f.a.b.c3.g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6708b.y(cVar);
                }
            });
        }
    }

    public void C() {
        g gVar = this.f6786m;
        if (gVar != null) {
            gVar.e();
        }
    }

    @RequiresNonNull({"trackGroupArrays", "trackSelectionsByPeriodAndRenderer", "mediaPreparer", "mediaPreparer.timeline"})
    public final c.f.a.b.g3.p D(int i2) {
        boolean z;
        try {
            c.f.a.b.g3.p pVarE = this.f6779f.e(this.f6780g, this.f6787n[i2], new i0.a(this.f6786m.f6796i.m(i2)), this.f6786m.f6796i);
            for (int i3 = 0; i3 < pVarE.f8522a; i3++) {
                c.f.a.b.g3.h hVar = pVarE.f8524c[i3];
                if (hVar != null) {
                    List<c.f.a.b.g3.h> list = this.p[i2][i3];
                    int i4 = 0;
                    while (true) {
                        if (i4 >= list.size()) {
                            z = false;
                            break;
                        }
                        c.f.a.b.g3.h hVar2 = list.get(i4);
                        if (hVar2.a() == hVar.a()) {
                            this.f6781h.clear();
                            for (int i5 = 0; i5 < hVar2.length(); i5++) {
                                this.f6781h.put(hVar2.h(i5), 0);
                            }
                            for (int i6 = 0; i6 < hVar.length(); i6++) {
                                this.f6781h.put(hVar.h(i6), 0);
                            }
                            int[] iArr = new int[this.f6781h.size()];
                            for (int i7 = 0; i7 < this.f6781h.size(); i7++) {
                                iArr[i7] = this.f6781h.keyAt(i7);
                            }
                            list.set(i4, new d(hVar2.a(), iArr));
                            z = true;
                        } else {
                            i4++;
                        }
                    }
                    if (!z) {
                        list.add(hVar);
                    }
                }
            }
            return pVarE;
        } catch (d1 e2) {
            throw new UnsupportedOperationException(e2);
        }
    }

    @RequiresNonNull({"trackGroupArrays", "mappedTrackInfos", "trackSelectionsByPeriodAndRenderer", "immutableTrackSelectionsByPeriodAndRenderer", "mediaPreparer", "mediaPreparer.timeline", "mediaPreparer.mediaPeriods"})
    public final void E() {
        this.f6784k = true;
    }

    public void c(int i2, f.d dVar) {
        e();
        this.f6779f.J(dVar);
        D(i2);
    }

    public void d(int i2, int i3, f.d dVar, List<f.C0135f> list) {
        e();
        f.e eVarH = dVar.h();
        int i4 = 0;
        while (i4 < this.f6788o[i2].c()) {
            eVarH.W(i4, i4 != i3);
            i4++;
        }
        if (list.isEmpty()) {
            c(i2, eVarH.w());
            return;
        }
        a1 a1VarG = this.f6788o[i2].g(i3);
        for (int i5 = 0; i5 < list.size(); i5++) {
            eVarH.X(i3, a1VarG, list.get(i5));
            c(i2, eVarH.w());
        }
    }

    @EnsuresNonNull({"trackGroupArrays", "mappedTrackInfos", "trackSelectionsByPeriodAndRenderer", "immutableTrackSelectionsByPeriodAndRenderer", "mediaPreparer", "mediaPreparer.timeline", "mediaPreparer.mediaPeriods"})
    public final void e() {
        c.f.a.b.j3.g.g(this.f6784k);
    }

    public void f(int i2) {
        e();
        for (int i3 = 0; i3 < this.f6780g.length; i3++) {
            this.p[i2][i3].clear();
        }
    }

    public a0 k(String str, byte[] bArr) {
        a0.b bVarE = new a0.b(str, this.f6777d.f9685a).e(this.f6777d.f9686b);
        p1.e eVar = this.f6777d.f9687c;
        a0.b bVarC = bVarE.d(eVar != null ? eVar.a() : null).b(this.f6777d.f9690f).c(bArr);
        if (this.f6778e == null) {
            return bVarC.a();
        }
        e();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int length = this.p.length;
        for (int i2 = 0; i2 < length; i2++) {
            arrayList2.clear();
            int length2 = this.p[i2].length;
            for (int i3 = 0; i3 < length2; i3++) {
                arrayList2.addAll(this.p[i2][i3]);
            }
            arrayList.addAll(this.f6786m.f6797j[i2].l(arrayList2));
        }
        return bVarC.f(arrayList).a();
    }

    public a0 l(byte[] bArr) {
        return k(this.f6777d.f9685a.toString(), bArr);
    }

    public j.a m(int i2) {
        e();
        return this.f6788o[i2];
    }

    public int n() {
        if (this.f6778e == null) {
            return 0;
        }
        e();
        return this.f6787n.length;
    }

    public final void z(final IOException iOException) {
        ((Handler) c.f.a.b.j3.g.e(this.f6782i)).post(new Runnable() { // from class: c.f.a.b.c3.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f6701b.u(iOException);
            }
        });
    }
}
