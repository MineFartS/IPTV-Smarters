package c.f.a.c.d.u.u.l;

import android.text.format.DateUtils;
import c.f.a.c.d.o;
import c.f.a.c.d.q;
import com.google.android.gms.cast.MediaInfo;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f12071a = d.f12074b;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c.f.a.c.d.u.u.i f12072b;

    public static c e() {
        return new c();
    }

    public static String r(long j2) {
        if (j2 >= 0) {
            return DateUtils.formatElapsedTime(j2 / 1000);
        }
        String strValueOf = String.valueOf(DateUtils.formatElapsedTime((-j2) / 1000));
        return strValueOf.length() != 0 ? "-".concat(strValueOf) : new String("-");
    }

    public final int a() {
        long jG;
        MediaInfo mediaInfoM;
        c.f.a.c.d.u.u.i iVar = this.f12072b;
        long jLongValue = 1;
        if (iVar != null && iVar.p()) {
            if (this.f12072b.r()) {
                Long lM = m();
                if (lM == null && (lM = o()) == null) {
                    jG = this.f12072b.g();
                    jLongValue = Math.max(jG, 1L);
                } else {
                    jLongValue = lM.longValue();
                }
            } else {
                if (this.f12072b.s()) {
                    o oVarI = this.f12072b.i();
                    if (oVarI != null && (mediaInfoM = oVarI.M()) != null) {
                        jG = mediaInfoM.R();
                    }
                } else {
                    jG = this.f12072b.o();
                }
                jLongValue = Math.max(jG, 1L);
            }
        }
        return Math.max((int) (jLongValue - k()), 1);
    }

    public final c.f.a.c.d.l b() {
        MediaInfo mediaInfoJ;
        c.f.a.c.d.u.u.i iVar = this.f12072b;
        if (iVar == null || !iVar.p() || (mediaInfoJ = this.f12072b.j()) == null) {
            return null;
        }
        return mediaInfoJ.P();
    }

    public final boolean c(long j2) {
        c.f.a.c.d.u.u.i iVar = this.f12072b;
        return iVar != null && iVar.p() && this.f12072b.w() && (((long) j()) + k()) - j2 < 10000;
    }

    public final int d(long j2) {
        return (int) (j2 - k());
    }

    public final int f() {
        c.f.a.c.d.u.u.i iVar = this.f12072b;
        if (iVar == null || !iVar.p()) {
            return 0;
        }
        if (!this.f12072b.r() && this.f12072b.s()) {
            return 0;
        }
        int iG = (int) (this.f12072b.g() - k());
        if (this.f12072b.w()) {
            iG = c.f.a.c.d.v.a.h(iG, i(), j());
        }
        return c.f.a.c.d.v.a.h(iG, 0, a());
    }

    public final boolean g() {
        return (((long) f()) + k()) - (((long) i()) + k()) < 10000;
    }

    public final boolean h() {
        return c(((long) f()) + k());
    }

    public final int i() {
        c.f.a.c.d.u.u.i iVar = this.f12072b;
        if (iVar != null && iVar.p() && this.f12072b.r() && this.f12072b.w()) {
            return c.f.a.c.d.v.a.h((int) (n().longValue() - k()), 0, a());
        }
        return 0;
    }

    public final int j() {
        c.f.a.c.d.u.u.i iVar = this.f12072b;
        if (iVar == null || !iVar.p() || !this.f12072b.r()) {
            return a();
        }
        if (this.f12072b.w()) {
            return c.f.a.c.d.v.a.h((int) (o().longValue() - k()), 0, a());
        }
        return 0;
    }

    public final long k() {
        c.f.a.c.d.u.u.i iVar = this.f12072b;
        if (iVar == null || !iVar.p() || !this.f12072b.r()) {
            return 0L;
        }
        Long l2 = l();
        if (l2 != null) {
            return l2.longValue();
        }
        Long lN = n();
        return lN != null ? lN.longValue() : this.f12072b.g();
    }

    public final Long l() {
        c.f.a.c.d.u.u.i iVar = this.f12072b;
        if (iVar != null && iVar.p() && this.f12072b.r()) {
            MediaInfo mediaInfoJ = this.f12072b.j();
            c.f.a.c.d.l lVarB = b();
            if (mediaInfoJ != null && lVarB != null && lVarB.e("com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA") && (lVarB.e("com.google.android.gms.cast.metadata.SECTION_DURATION") || this.f12072b.w())) {
                return Long.valueOf(lVarB.L("com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA"));
            }
        }
        return null;
    }

    public final Long m() {
        c.f.a.c.d.l lVarB;
        Long l2;
        c.f.a.c.d.u.u.i iVar = this.f12072b;
        if (iVar == null || !iVar.p() || !this.f12072b.r() || (lVarB = b()) == null || !lVarB.e("com.google.android.gms.cast.metadata.SECTION_DURATION") || (l2 = l()) == null) {
            return null;
        }
        return Long.valueOf(l2.longValue() + lVarB.L("com.google.android.gms.cast.metadata.SECTION_DURATION"));
    }

    public final Long n() {
        q qVarL;
        c.f.a.c.d.u.u.i iVar = this.f12072b;
        if (iVar == null || !iVar.p() || !this.f12072b.r() || !this.f12072b.w() || (qVarL = this.f12072b.l()) == null || qVarL.Q() == null) {
            return null;
        }
        return Long.valueOf(this.f12072b.f());
    }

    public final Long o() {
        q qVarL;
        c.f.a.c.d.u.u.i iVar = this.f12072b;
        if (iVar == null || !iVar.p() || !this.f12072b.r() || !this.f12072b.w() || (qVarL = this.f12072b.l()) == null || qVarL.Q() == null) {
            return null;
        }
        return Long.valueOf(this.f12072b.e());
    }

    public final Long p() {
        MediaInfo mediaInfoJ;
        c.f.a.c.d.u.u.i iVar = this.f12072b;
        if (iVar == null || !iVar.p() || !this.f12072b.r() || (mediaInfoJ = this.f12072b.j()) == null || mediaInfoJ.Q() == -1) {
            return null;
        }
        return Long.valueOf(mediaInfoJ.Q());
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String q(long r5) {
        /*
            r4 = this;
            c.f.a.c.d.u.u.i r0 = r4.f12072b
            r1 = 0
            if (r0 == 0) goto L71
            boolean r0 = r0.p()
            if (r0 != 0) goto Lc
            goto L71
        Lc:
            int[] r0 = c.f.a.c.d.u.u.l.e.f12076a
            c.f.a.c.d.u.u.i r2 = r4.f12072b
            if (r2 == 0) goto L31
            boolean r2 = r2.p()
            if (r2 != 0) goto L19
            goto L31
        L19:
            c.f.a.c.d.u.u.i r2 = r4.f12072b
            boolean r2 = r2.r()
            if (r2 == 0) goto L31
            int r2 = c.f.a.c.d.u.u.l.c.f12071a
            int r3 = c.f.a.c.d.u.u.l.d.f12073a
            if (r2 != r3) goto L28
            goto L31
        L28:
            java.lang.Long r2 = r4.p()
            if (r2 == 0) goto L33
            int r3 = c.f.a.c.d.u.u.l.d.f12074b
            goto L33
        L31:
            int r3 = c.f.a.c.d.u.u.l.d.f12073a
        L33:
            r2 = 1
            int r3 = r3 - r2
            r0 = r0[r3]
            if (r0 == r2) goto L5a
            r2 = 2
            if (r0 == r2) goto L3d
            return r1
        L3d:
            c.f.a.c.d.u.u.i r0 = r4.f12072b
            boolean r0 = r0.r()
            if (r0 == 0) goto L50
            java.lang.Long r0 = r4.l()
            if (r0 != 0) goto L50
            java.lang.String r5 = r(r5)
            return r5
        L50:
            long r0 = r4.k()
            long r5 = r5 - r0
            java.lang.String r5 = r(r5)
            return r5
        L5a:
            java.lang.Long r0 = r4.p()
            long r0 = r0.longValue()
            long r0 = r0 + r5
            java.text.DateFormat r5 = java.text.DateFormat.getTimeInstance()
            java.util.Date r6 = new java.util.Date
            r6.<init>(r0)
            java.lang.String r5 = r5.format(r6)
            return r5
        L71:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.c.d.u.u.l.c.q(long):java.lang.String");
    }

    public final long s(int i2) {
        return ((long) i2) + k();
    }
}
