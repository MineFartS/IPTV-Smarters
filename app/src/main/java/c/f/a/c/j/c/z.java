package c.f.a.c.j.c;

import android.content.Context;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class z extends c.f.a.c.d.u.u.l.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f13150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13151c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f13152d;

    public z(View view, Context context) {
        this.f13150b = view;
        this.f13151c = context.getString(c.f.a.c.d.u.n.f11886c);
        this.f13152d = context.getString(c.f.a.c.d.u.n.f11887d);
        view.setEnabled(false);
    }

    @Override // c.f.a.c.d.u.u.l.a
    public final void c() {
        g();
    }

    @Override // c.f.a.c.d.u.u.l.a
    public final void d() {
        this.f13150b.setEnabled(false);
    }

    @Override // c.f.a.c.d.u.u.l.a
    public final void e(c.f.a.c.d.u.d dVar) {
        super.e(dVar);
        this.f13150b.setEnabled(true);
        g();
    }

    @Override // c.f.a.c.d.u.u.l.a
    public final void f() {
        this.f13150b.setEnabled(false);
        super.f();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g() {
        /*
            r8 = this;
            c.f.a.c.d.u.u.i r0 = r8.b()
            r1 = 0
            if (r0 == 0) goto L5d
            boolean r2 = r0.p()
            if (r2 == 0) goto L5d
            com.google.android.gms.cast.MediaInfo r2 = r0.j()
            r3 = 1
            if (r2 == 0) goto L46
            java.util.List r2 = r2.O()
            if (r2 == 0) goto L46
            boolean r4 = r2.isEmpty()
            if (r4 == 0) goto L21
            goto L46
        L21:
            java.util.Iterator r2 = r2.iterator()
            r4 = 0
        L26:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L46
            java.lang.Object r5 = r2.next()
            com.google.android.gms.cast.MediaTrack r5 = (com.google.android.gms.cast.MediaTrack) r5
            int r6 = r5.O()
            r7 = 2
            if (r6 != r7) goto L3e
            int r4 = r4 + 1
            if (r4 <= r3) goto L26
            goto L44
        L3e:
            int r5 = r5.O()
            if (r5 != r3) goto L26
        L44:
            r2 = 1
            goto L47
        L46:
            r2 = 0
        L47:
            if (r2 == 0) goto L5d
            boolean r0 = r0.v()
            if (r0 == 0) goto L50
            goto L5d
        L50:
            android.view.View r0 = r8.f13150b
            r0.setEnabled(r3)
            android.view.View r0 = r8.f13150b
            java.lang.String r1 = r8.f13151c
        L59:
            r0.setContentDescription(r1)
            return
        L5d:
            android.view.View r0 = r8.f13150b
            r0.setEnabled(r1)
            android.view.View r0 = r8.f13150b
            java.lang.String r1 = r8.f13152d
            goto L59
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.c.j.c.z.g():void");
    }
}
