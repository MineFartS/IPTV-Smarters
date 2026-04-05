package c.f.a.b.e3.g1;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseArray;
import c.f.a.b.e3.g1.a0;
import c.f.a.b.e3.g1.v;
import c.f.a.b.e3.g1.w;
import c.f.a.b.e3.g1.y;
import c.f.a.b.j3.x0;
import c.f.a.b.w0;
import c.f.a.b.w1;
import c.f.b.b.t;
import com.amazonaws.http.HttpHeader;
import com.amazonaws.services.s3.Headers;
import com.google.android.exoplayer2.source.rtsp.RtspMediaSource;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.net.SocketFactory;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class t implements Closeable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f7669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f7670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Uri f7671d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a0.a f7672e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f7673f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f7678k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public b f7679l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public s f7680m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f7681n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f7682o;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayDeque<w.d> f7674g = new ArrayDeque<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final SparseArray<d0> f7675h = new SparseArray<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final d f7676i = new d();
    public long p = -9223372036854775807L;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public y f7677j = new y(new c());

    public final class b implements Runnable, Closeable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Handler f7683b = x0.x();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f7684c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f7685d;

        public b(long j2) {
            this.f7684c = j2;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f7685d = false;
            this.f7683b.removeCallbacks(this);
        }

        public void d() {
            if (this.f7685d) {
                return;
            }
            this.f7685d = true;
            this.f7683b.postDelayed(this, this.f7684c);
        }

        @Override // java.lang.Runnable
        public void run() {
            t.this.f7676i.d(t.this.f7671d, t.this.f7678k);
            this.f7683b.postDelayed(this, this.f7684c);
        }
    }

    public final class c implements y.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f7687a = x0.x();

        public c() {
        }

        @Override // c.f.a.b.e3.g1.y.d
        public /* synthetic */ void a(Exception exc) {
            z.a(this, exc);
        }

        @Override // c.f.a.b.e3.g1.y.d
        public /* synthetic */ void b(List list, Exception exc) {
            z.b(this, list, exc);
        }

        @Override // c.f.a.b.e3.g1.y.d
        public void c(final List<String> list) {
            this.f7687a.post(new Runnable() { // from class: c.f.a.b.e3.g1.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7503b.f(list);
                }
            });
        }

        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final void f(List<String> list) {
            e0 e0VarH = a0.h(list);
            int i2 = Integer.parseInt((String) c.f.a.b.j3.g.e(e0VarH.f7511b.d("CSeq")));
            d0 d0Var = (d0) t.this.f7675h.get(i2);
            if (d0Var == null) {
                return;
            }
            t.this.f7675h.remove(i2);
            int i3 = d0Var.f7506b;
            try {
                int i4 = e0VarH.f7510a;
                if (i4 != 200) {
                    if (i4 == 401 && t.this.f7672e != null && !t.this.f7682o) {
                        String strD = e0VarH.f7511b.d("WWW-Authenticate");
                        if (strD == null) {
                            throw w1.c("Missing WWW-Authenticate header in a 401 response.", null);
                        }
                        t.this.f7680m = a0.k(strD);
                        t.this.f7676i.b();
                        t.this.f7682o = true;
                        return;
                    }
                    t.this.D0(new RtspMediaSource.b(a0.o(i3) + " " + e0VarH.f7510a));
                    return;
                }
                switch (i3) {
                    case 1:
                    case 3:
                    case 7:
                    case 8:
                    case 9:
                    case 11:
                    case 12:
                        return;
                    case 2:
                        g(new u(i4, j0.b(e0VarH.f7512c)));
                        return;
                    case 4:
                        h(new b0(i4, a0.g(e0VarH.f7511b.d("Public"))));
                        return;
                    case 5:
                        i();
                        return;
                    case 6:
                        String strD2 = e0VarH.f7511b.d(Headers.RANGE);
                        f0 f0VarD = strD2 == null ? f0.f7514a : f0.d(strD2);
                        String strD3 = e0VarH.f7511b.d("RTP-Info");
                        j(new c0(e0VarH.f7510a, f0VarD, strD3 == null ? c.f.b.b.t.J() : h0.a(strD3)));
                        return;
                    case 10:
                        String strD4 = e0VarH.f7511b.d("Session");
                        String strD5 = e0VarH.f7511b.d("Transport");
                        if (strD4 == null || strD5 == null) {
                            throw w1.c("Missing mandatory session or transport header", null);
                        }
                        k(new g0(e0VarH.f7510a, a0.i(strD4), strD5));
                        return;
                    default:
                        throw new IllegalStateException();
                }
            } catch (w1 e2) {
                t.this.D0(new RtspMediaSource.b(e2));
            }
        }

        public final void g(u uVar) {
            f0 f0VarD = f0.f7514a;
            String str = uVar.f7693b.f7529a.get("range");
            if (str != null) {
                try {
                    f0VarD = f0.d(str);
                } catch (w1 e2) {
                    t.this.f7669b.b("SDP format error.", e2);
                    return;
                }
            }
            c.f.b.b.t<x> tVarB0 = t.B0(uVar.f7693b, t.this.f7671d);
            if (tVarB0.isEmpty()) {
                t.this.f7669b.b("No playable track.", null);
            } else {
                t.this.f7669b.g(f0VarD, tVarB0);
                t.this.f7681n = true;
            }
        }

        public final void h(b0 b0Var) {
            if (t.this.f7679l != null) {
                return;
            }
            if (t.I0(b0Var.f7498b)) {
                t.this.f7676i.c(t.this.f7671d, t.this.f7678k);
            } else {
                t.this.f7669b.b("DESCRIBE not supported.", null);
            }
        }

        public final void i() {
            if (t.this.p != -9223372036854775807L) {
                t tVar = t.this;
                tVar.L0(w0.e(tVar.p));
            }
        }

        public final void j(c0 c0Var) {
            if (t.this.f7679l == null) {
                t tVar = t.this;
                tVar.f7679l = tVar.new b(30000L);
                t.this.f7679l.d();
            }
            t.this.f7670c.f(w0.d(c0Var.f7501b.f7516c), c0Var.f7502c);
            t.this.p = -9223372036854775807L;
        }

        public final void k(g0 g0Var) {
            t.this.f7678k = g0Var.f7520b.f7492a;
            t.this.C0();
        }
    }

    public final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f7689a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public d0 f7690b;

        public d() {
        }

        public final d0 a(int i2, String str, Map<String, String> map, Uri uri) {
            v.b bVar = new v.b();
            int i3 = this.f7689a;
            this.f7689a = i3 + 1;
            bVar.b("CSeq", String.valueOf(i3));
            bVar.b(HttpHeader.USER_AGENT, t.this.f7673f);
            if (str != null) {
                bVar.b("Session", str);
            }
            if (t.this.f7680m != null) {
                c.f.a.b.j3.g.i(t.this.f7672e);
                try {
                    bVar.b("Authorization", t.this.f7680m.a(t.this.f7672e, uri, i2));
                } catch (w1 e2) {
                    t.this.D0(new RtspMediaSource.b(e2));
                }
            }
            bVar.d(map);
            return new d0(uri, i2, bVar.e(), BuildConfig.FLAVOR);
        }

        public void b() {
            c.f.a.b.j3.g.i(this.f7690b);
            c.f.b.b.u<String, String> uVarB = this.f7690b.f7507c.b();
            HashMap map = new HashMap();
            for (String str : uVarB.keySet()) {
                if (!str.equals("CSeq") && !str.equals(HttpHeader.USER_AGENT) && !str.equals("Session") && !str.equals("Authorization")) {
                    map.put(str, c.f.b.b.y.c(uVarB.get(str)));
                }
            }
            g(a(this.f7690b.f7506b, t.this.f7678k, map, this.f7690b.f7505a));
        }

        public void c(Uri uri, String str) {
            g(a(2, str, c.f.b.b.v.k(), uri));
        }

        public void d(Uri uri, String str) {
            g(a(4, str, c.f.b.b.v.k(), uri));
        }

        public void e(Uri uri, String str) {
            g(a(5, str, c.f.b.b.v.k(), uri));
        }

        public void f(Uri uri, long j2, String str) {
            g(a(6, str, c.f.b.b.v.l(Headers.RANGE, f0.b(j2)), uri));
        }

        public final void g(d0 d0Var) {
            int i2 = Integer.parseInt((String) c.f.a.b.j3.g.e(d0Var.f7507c.d("CSeq")));
            c.f.a.b.j3.g.g(t.this.f7675h.get(i2) == null);
            t.this.f7675h.append(i2, d0Var);
            t.this.f7677j.o(a0.m(d0Var));
            this.f7690b = d0Var;
        }

        public void h(Uri uri, String str, String str2) {
            g(a(10, str2, c.f.b.b.v.l("Transport", str), uri));
        }

        public void i(Uri uri, String str) {
            g(a(12, str, c.f.b.b.v.k(), uri));
        }
    }

    public interface e {
        void c(RtspMediaSource.b bVar);

        void d();

        void f(long j2, c.f.b.b.t<h0> tVar);
    }

    public interface f {
        void b(String str, Throwable th);

        void g(f0 f0Var, c.f.b.b.t<x> tVar);
    }

    public t(f fVar, e eVar, String str, Uri uri) {
        this.f7669b = fVar;
        this.f7670c = eVar;
        this.f7671d = a0.l(uri);
        this.f7672e = a0.j(uri);
        this.f7673f = str;
    }

    public static c.f.b.b.t<x> B0(i0 i0Var, Uri uri) {
        t.a aVar = new t.a();
        for (int i2 = 0; i2 < i0Var.f7530b.size(); i2++) {
            j jVar = i0Var.f7530b.get(i2);
            if (q.b(jVar)) {
                aVar.d(new x(jVar, uri));
            }
        }
        return aVar.e();
    }

    public static Socket E0(Uri uri) {
        c.f.a.b.j3.g.a(uri.getHost() != null);
        return SocketFactory.getDefault().createSocket((String) c.f.a.b.j3.g.e(uri.getHost()), uri.getPort() > 0 ? uri.getPort() : 554);
    }

    public static boolean I0(List<Integer> list) {
        return list.isEmpty() || list.contains(2);
    }

    public final void C0() {
        w.d dVarPollFirst = this.f7674g.pollFirst();
        if (dVarPollFirst == null) {
            this.f7670c.d();
        } else {
            this.f7676i.h(dVarPollFirst.b(), dVarPollFirst.c(), this.f7678k);
        }
    }

    public final void D0(Throwable th) {
        RtspMediaSource.b bVar = th instanceof RtspMediaSource.b ? (RtspMediaSource.b) th : new RtspMediaSource.b(th);
        if (this.f7681n) {
            this.f7670c.c(bVar);
        } else {
            this.f7669b.b(c.f.b.a.n.c(th.getMessage()), th);
        }
    }

    public void F0(int i2, y.b bVar) {
        this.f7677j.n(i2, bVar);
    }

    public void G0() {
        try {
            close();
            y yVar = new y(new c());
            this.f7677j = yVar;
            yVar.m(E0(this.f7671d));
            this.f7678k = null;
            this.f7682o = false;
            this.f7680m = null;
        } catch (IOException e2) {
            this.f7670c.c(new RtspMediaSource.b(e2));
        }
    }

    public void H0(long j2) {
        this.f7676i.e(this.f7671d, (String) c.f.a.b.j3.g.e(this.f7678k));
        this.p = j2;
    }

    public void J0(List<w.d> list) {
        this.f7674g.addAll(list);
        C0();
    }

    public void K0() throws IOException {
        try {
            this.f7677j.m(E0(this.f7671d));
            this.f7676i.d(this.f7671d, this.f7678k);
        } catch (IOException e2) {
            x0.o(this.f7677j);
            throw e2;
        }
    }

    public void L0(long j2) {
        this.f7676i.f(this.f7671d, j2, (String) c.f.a.b.j3.g.e(this.f7678k));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        b bVar = this.f7679l;
        if (bVar != null) {
            bVar.close();
            this.f7679l = null;
            this.f7676i.i(this.f7671d, (String) c.f.a.b.j3.g.e(this.f7678k));
        }
        this.f7677j.close();
    }
}
