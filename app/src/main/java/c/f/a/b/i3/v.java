package c.f.a.b.i3;

import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class v implements p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f9110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<n0> f9111c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p f9112d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p f9113e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public p f9114f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p f9115g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p f9116h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p f9117i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p f9118j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public p f9119k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p f9120l;

    public v(Context context, p pVar) {
        this.f9110b = context.getApplicationContext();
        this.f9112d = (p) c.f.a.b.j3.g.e(pVar);
    }

    public final p A() {
        if (this.f9116h == null) {
            try {
                p pVar = (p) Class.forName("c.f.a.b.y2.g.a").getConstructor(new Class[0]).newInstance(new Object[0]);
                this.f9116h = pVar;
                f(pVar);
            } catch (ClassNotFoundException unused) {
                c.f.a.b.j3.z.i("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e2) {
                throw new RuntimeException("Error instantiating RTMP extension", e2);
            }
            if (this.f9116h == null) {
                this.f9116h = this.f9112d;
            }
        }
        return this.f9116h;
    }

    public final p B() {
        if (this.f9117i == null) {
            o0 o0Var = new o0();
            this.f9117i = o0Var;
            f(o0Var);
        }
        return this.f9117i;
    }

    public final void C(p pVar, n0 n0Var) {
        if (pVar != null) {
            pVar.h(n0Var);
        }
    }

    @Override // c.f.a.b.i3.p
    public Uri a() {
        p pVar = this.f9120l;
        if (pVar == null) {
            return null;
        }
        return pVar.a();
    }

    @Override // c.f.a.b.i3.l
    public int b(byte[] bArr, int i2, int i3) {
        return ((p) c.f.a.b.j3.g.e(this.f9120l)).b(bArr, i2, i3);
    }

    @Override // c.f.a.b.i3.p
    public void close() {
        p pVar = this.f9120l;
        if (pVar != null) {
            try {
                pVar.close();
            } finally {
                this.f9120l = null;
            }
        }
    }

    public final void f(p pVar) {
        for (int i2 = 0; i2 < this.f9111c.size(); i2++) {
            pVar.h(this.f9111c.get(i2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    @Override // c.f.a.b.i3.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long g(c.f.a.b.i3.s r3) {
        /*
            r2 = this;
            c.f.a.b.i3.p r0 = r2.f9120l
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            c.f.a.b.j3.g.g(r0)
            android.net.Uri r0 = r3.f9061a
            java.lang.String r0 = r0.getScheme()
            android.net.Uri r1 = r3.f9061a
            boolean r1 = c.f.a.b.j3.x0.t0(r1)
            if (r1 == 0) goto L2e
            android.net.Uri r0 = r3.f9061a
            java.lang.String r0 = r0.getPath()
            if (r0 == 0) goto L29
            java.lang.String r1 = "/android_asset/"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L29
            goto L36
        L29:
            c.f.a.b.i3.p r0 = r2.y()
            goto L3a
        L2e:
            java.lang.String r1 = "asset"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L3d
        L36:
            c.f.a.b.i3.p r0 = r2.v()
        L3a:
            r2.f9120l = r0
            goto L8a
        L3d:
            java.lang.String r1 = "content"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L4a
            c.f.a.b.i3.p r0 = r2.w()
            goto L3a
        L4a:
            java.lang.String r1 = "rtmp"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L57
            c.f.a.b.i3.p r0 = r2.A()
            goto L3a
        L57:
            java.lang.String r1 = "udp"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L64
            c.f.a.b.i3.p r0 = r2.B()
            goto L3a
        L64:
            java.lang.String r1 = "data"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L71
            c.f.a.b.i3.p r0 = r2.x()
            goto L3a
        L71:
            java.lang.String r1 = "rawresource"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L85
            java.lang.String r1 = "android.resource"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L82
            goto L85
        L82:
            c.f.a.b.i3.p r0 = r2.f9112d
            goto L3a
        L85:
            c.f.a.b.i3.p r0 = r2.z()
            goto L3a
        L8a:
            c.f.a.b.i3.p r0 = r2.f9120l
            long r0 = r0.g(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.i3.v.g(c.f.a.b.i3.s):long");
    }

    @Override // c.f.a.b.i3.p
    public void h(n0 n0Var) {
        c.f.a.b.j3.g.e(n0Var);
        this.f9112d.h(n0Var);
        this.f9111c.add(n0Var);
        C(this.f9113e, n0Var);
        C(this.f9114f, n0Var);
        C(this.f9115g, n0Var);
        C(this.f9116h, n0Var);
        C(this.f9117i, n0Var);
        C(this.f9118j, n0Var);
        C(this.f9119k, n0Var);
    }

    @Override // c.f.a.b.i3.p
    public Map<String, List<String>> q() {
        p pVar = this.f9120l;
        return pVar == null ? Collections.emptyMap() : pVar.q();
    }

    public final p v() {
        if (this.f9114f == null) {
            g gVar = new g(this.f9110b);
            this.f9114f = gVar;
            f(gVar);
        }
        return this.f9114f;
    }

    public final p w() {
        if (this.f9115g == null) {
            k kVar = new k(this.f9110b);
            this.f9115g = kVar;
            f(kVar);
        }
        return this.f9115g;
    }

    public final p x() {
        if (this.f9118j == null) {
            m mVar = new m();
            this.f9118j = mVar;
            f(mVar);
        }
        return this.f9118j;
    }

    public final p y() {
        if (this.f9113e == null) {
            a0 a0Var = new a0();
            this.f9113e = a0Var;
            f(a0Var);
        }
        return this.f9113e;
    }

    public final p z() {
        if (this.f9119k == null) {
            k0 k0Var = new k0(this.f9110b);
            this.f9119k = k0Var;
            f(k0Var);
        }
        return this.f9119k;
    }
}
