package c.f.a.c.j.c;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class m0 extends c.f.a.c.d.u.u.l.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f12938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12939c;

    public m0(View view, int i2) {
        this.f12938b = view;
        this.f12939c = i2;
        view.setEnabled(false);
    }

    @Override // c.f.a.c.d.u.u.l.a
    public final void c() {
        g();
    }

    @Override // c.f.a.c.d.u.u.l.a
    public final void d() {
        this.f12938b.setEnabled(false);
    }

    @Override // c.f.a.c.d.u.u.l.a
    public final void e(c.f.a.c.d.u.d dVar) {
        super.e(dVar);
        g();
    }

    @Override // c.f.a.c.d.u.u.l.a
    public final void f() {
        this.f12938b.setEnabled(false);
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
            if (r0 == 0) goto L48
            boolean r2 = r0.p()
            r3 = 1
            if (r2 != 0) goto L10
        Le:
            r2 = 0
            goto L35
        L10:
            c.f.a.c.d.q r2 = r0.l()
            r4 = 128(0x80, double:6.3E-322)
            boolean r4 = r2.g0(r4)
            if (r4 == 0) goto L1e
        L1c:
            r2 = 1
            goto L35
        L1e:
            int r4 = r2.b0()
            if (r4 != 0) goto L1c
            int r4 = r2.L()
            java.lang.Integer r2 = r2.N(r4)
            if (r2 == 0) goto Le
            int r2 = r2.intValue()
            if (r2 <= 0) goto Le
            goto L1c
        L35:
            if (r2 == 0) goto L48
            boolean r0 = r0.v()
            if (r0 != 0) goto L48
            android.view.View r0 = r6.f12938b
            r0.setVisibility(r1)
            android.view.View r0 = r6.f12938b
            r0.setEnabled(r3)
            return
        L48:
            android.view.View r0 = r6.f12938b
            int r2 = r6.f12939c
            r0.setVisibility(r2)
            android.view.View r0 = r6.f12938b
            r0.setEnabled(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.c.j.c.m0.g():void");
    }
}
