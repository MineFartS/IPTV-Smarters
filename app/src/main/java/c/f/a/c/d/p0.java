package c.f.a.c.d;

import c.f.a.c.d.e;
import com.google.android.gms.common.api.Status;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class p0 extends c.f.a.c.d.v.i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f11738b;

    public p0(d0 d0Var) {
        this.f11738b = d0Var;
    }

    @Override // c.f.a.c.d.v.j
    public final void C(final c.f.a.c.d.v.d dVar) {
        this.f11738b.f11592e.post(new Runnable(this, dVar) { // from class: c.f.a.c.d.w0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final p0 f12220b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final c.f.a.c.d.v.d f12221c;

            {
                this.f12220b = this;
                this.f12221c = dVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                p0 p0Var = this.f12220b;
                p0Var.f11738b.x(this.f12221c);
            }
        });
    }

    @Override // c.f.a.c.d.v.j
    public final void H1(int i2) {
        this.f11738b.V(i2);
    }

    @Override // c.f.a.c.d.v.j
    public final void V1(final String str, final String str2) {
        d0.f11588a.a("Receive (type=text, ns=%s) %s", str, str2);
        this.f11738b.f11592e.post(new Runnable(this, str, str2) { // from class: c.f.a.c.d.z0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final p0 f12230b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f12231c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final String f12232d;

            {
                this.f12230b = this;
                this.f12231c = str;
                this.f12232d = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                e.InterfaceC0151e interfaceC0151e;
                p0 p0Var = this.f12230b;
                String str3 = this.f12231c;
                String str4 = this.f12232d;
                synchronized (p0Var.f11738b.x) {
                    interfaceC0151e = p0Var.f11738b.x.get(str3);
                }
                if (interfaceC0151e != null) {
                    interfaceC0151e.a(p0Var.f11738b.v, str3, str4);
                } else {
                    d0.f11588a.a("Discarded message for unknown namespace '%s'", str3);
                }
            }
        });
    }

    @Override // c.f.a.c.d.v.j
    public final void b2(final c.f.a.c.d.v.p0 p0Var) {
        this.f11738b.f11592e.post(new Runnable(this, p0Var) { // from class: c.f.a.c.d.x0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final p0 f12225b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final c.f.a.c.d.v.p0 f12226c;

            {
                this.f12225b = this;
                this.f12226c = p0Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                p0 p0Var2 = this.f12225b;
                p0Var2.f11738b.y(this.f12226c);
            }
        });
    }

    @Override // c.f.a.c.d.v.j
    public final void g0(final int i2) {
        this.f11738b.f11592e.post(new Runnable(this, i2) { // from class: c.f.a.c.d.t0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final p0 f11775b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final int f11776c;

            {
                this.f11775b = this;
                this.f11776c = i2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                p0 p0Var = this.f11775b;
                int i3 = this.f11776c;
                p0Var.f11738b.b0();
                p0Var.f11738b.f11593f = z1.f12233a;
                synchronized (p0Var.f11738b.z) {
                    Iterator it = p0Var.f11738b.z.iterator();
                    while (it.hasNext()) {
                        ((a2) it.next()).d(i3);
                    }
                }
                p0Var.f11738b.Z();
                d0 d0Var = p0Var.f11738b;
                d0Var.e(d0Var.f11591d);
            }
        });
    }

    @Override // c.f.a.c.d.v.j
    public final void i(d dVar, String str, String str2, boolean z) {
        this.f11738b.f11601n = dVar;
        this.f11738b.f11602o = str;
        this.f11738b.j(new c.f.a.c.d.v.i0(new Status(0), dVar, str, str2, z));
    }

    @Override // c.f.a.c.d.v.j
    public final void m(final int i2) {
        this.f11738b.f11592e.post(new Runnable(this, i2) { // from class: c.f.a.c.d.r0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final p0 f11767b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final int f11768c;

            {
                this.f11767b = this;
                this.f11768c = i2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                p0 p0Var = this.f11767b;
                int i3 = this.f11768c;
                if (i3 != 0) {
                    p0Var.f11738b.f11593f = z1.f12233a;
                    synchronized (p0Var.f11738b.z) {
                        Iterator it = p0Var.f11738b.z.iterator();
                        while (it.hasNext()) {
                            ((a2) it.next()).c(i3);
                        }
                    }
                    p0Var.f11738b.Z();
                    return;
                }
                p0Var.f11738b.f11593f = z1.f12234b;
                d0.L(p0Var.f11738b, true);
                d0.P(p0Var.f11738b, true);
                synchronized (p0Var.f11738b.z) {
                    Iterator it2 = p0Var.f11738b.z.iterator();
                    while (it2.hasNext()) {
                        ((a2) it2.next()).a();
                    }
                }
            }
        });
    }

    @Override // c.f.a.c.d.v.j
    public final void m0(String str, long j2, int i2) {
        this.f11738b.i(j2, i2);
    }

    @Override // c.f.a.c.d.v.j
    public final void m1(int i2) {
        this.f11738b.V(i2);
    }

    @Override // c.f.a.c.d.v.j
    public final void p(final int i2) {
        this.f11738b.f11592e.post(new Runnable(this, i2) { // from class: c.f.a.c.d.v0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final p0 f12218b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final int f12219c;

            {
                this.f12218b = this;
                this.f12219c = i2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                p0 p0Var = this.f12218b;
                int i3 = this.f12219c;
                p0Var.f11738b.f11593f = z1.f12235c;
                synchronized (p0Var.f11738b.z) {
                    Iterator it = p0Var.f11738b.z.iterator();
                    while (it.hasNext()) {
                        ((a2) it.next()).b(i3);
                    }
                }
            }
        });
    }

    @Override // c.f.a.c.d.v.j
    public final void q(int i2) {
        this.f11738b.S(i2);
    }

    @Override // c.f.a.c.d.v.j
    public final void q1(String str, byte[] bArr) {
        d0.f11588a.a("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
    }

    @Override // c.f.a.c.d.v.j
    public final void s2(final int i2) {
        this.f11738b.V(i2);
        if (this.f11738b.y != null) {
            this.f11738b.f11592e.post(new Runnable(this, i2) { // from class: c.f.a.c.d.u0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final p0 f12119b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final int f12120c;

                {
                    this.f12119b = this;
                    this.f12120c = i2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    p0 p0Var = this.f12119b;
                    p0Var.f11738b.y.b(this.f12120c);
                }
            });
        }
    }

    @Override // c.f.a.c.d.v.j
    public final void y(String str, double d2, boolean z) {
        d0.f11588a.a("Deprecated callback: \"onStatusReceived\"", new Object[0]);
    }

    @Override // c.f.a.c.d.v.j
    public final void z2(String str, long j2) {
        this.f11738b.i(j2, 0);
    }
}
