package c.f.a.c.j.c;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class n0 extends c.f.a.c.d.u.u.l.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f12951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12952c;

    public n0(View view, int i2) {
        this.f12951b = view;
        this.f12952c = i2;
        view.setEnabled(false);
    }

    @Override // c.f.a.c.d.u.u.l.a
    public final void c() {
        g();
    }

    @Override // c.f.a.c.d.u.u.l.a
    public final void d() {
        this.f12951b.setEnabled(false);
    }

    @Override // c.f.a.c.d.u.u.l.a
    public final void e(c.f.a.c.d.u.d dVar) {
        super.e(dVar);
        g();
    }

    @Override // c.f.a.c.d.u.u.l.a
    public final void f() {
        this.f12951b.setEnabled(false);
        super.f();
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g() {
        /*
            r6 = this;
            c.f.a.c.d.u.u.i r0 = r6.b()
            r1 = 0
            if (r0 == 0) goto L4d
            boolean r2 = r0.p()
            r3 = 1
            if (r2 != 0) goto L10
        Le:
            r2 = 0
            goto L3a
        L10:
            c.f.a.c.d.q r2 = r0.l()
            r4 = 64
            boolean r4 = r2.g0(r4)
            if (r4 == 0) goto L1e
        L1c:
            r2 = 1
            goto L3a
        L1e:
            int r4 = r2.b0()
            if (r4 != 0) goto L1c
            int r4 = r2.L()
            java.lang.Integer r4 = r2.N(r4)
            if (r4 == 0) goto Le
            int r4 = r4.intValue()
            int r2 = r2.Z()
            int r2 = r2 - r3
            if (r4 >= r2) goto Le
            goto L1c
        L3a:
            if (r2 == 0) goto L4d
            boolean r0 = r0.v()
            if (r0 != 0) goto L4d
            android.view.View r0 = r6.f12951b
            r0.setVisibility(r1)
            android.view.View r0 = r6.f12951b
            r0.setEnabled(r3)
            return
        L4d:
            android.view.View r0 = r6.f12951b
            int r2 = r6.f12952c
            r0.setVisibility(r2)
            android.view.View r0 = r6.f12951b
            r0.setEnabled(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.c.j.c.n0.g():void");
    }
}
