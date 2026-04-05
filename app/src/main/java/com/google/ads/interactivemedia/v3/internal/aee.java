package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import android.util.SparseArray;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class aee extends aac {
    private long A;
    private int B;
    private final aeh C;
    private final aec D;
    private final ajr E;
    private final awa F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final kn f19347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ajg f19348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final qq f19349c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f19350d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final abo f19351e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final akl<? extends aer> f19352f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f19353g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final SparseArray<adu> f19354h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Runnable f19355i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Runnable f19356j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final aen f19357k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final akk f19358l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ajh f19359m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private akj f19360n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private akq f19361o;
    private IOException p;
    private Handler q;
    private kl r;
    private Uri s;
    private final Uri t;
    private aer u;
    private boolean v;
    private long w;
    private long x;
    private long y;
    private int z;

    static {
        ka.b("goog.exo.dash");
    }

    public /* synthetic */ aee(kn knVar, ajg ajgVar, akl aklVar, aeh aehVar, awa awaVar, qq qqVar, ajr ajrVar, long j2, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f19347a = knVar;
        this.r = knVar.f22194c;
        km kmVar = knVar.f22193b;
        ajr.b(kmVar);
        this.s = kmVar.f22184a;
        this.t = knVar.f22193b.f22184a;
        this.u = null;
        this.f19348b = ajgVar;
        this.f19352f = aklVar;
        this.C = aehVar;
        this.f19349c = qqVar;
        this.E = ajrVar;
        this.f19350d = j2;
        this.F = awaVar;
        this.f19351e = d(null);
        this.f19353g = new Object();
        this.f19354h = new SparseArray<>();
        this.f19357k = new ady(this);
        this.A = -9223372036854775807L;
        this.y = -9223372036854775807L;
        int i2 = 1;
        this.D = new aec(this, i2);
        this.f19358l = new aeb(this);
        this.f19355i = new adv(this);
        this.f19356j = new adv(this, i2);
    }

    private final void M() {
        amf.e(this.f19360n, new adw(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N(IOException iOException) {
        alj.a("DashMediaSource", "Failed to resolve time offset.", iOException);
        P(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O(long j2) {
        this.y = j2;
        P(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x024a A[PHI: r13
  0x024a: PHI (r13v17 float) = (r13v12 float), (r13v15 float) binds: [B:121:0x0248, B:125:0x0253] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void P(boolean r38) {
        /*
            Method dump skipped, instruction units count: 908
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.aee.P(boolean):void");
    }

    private final void Q(afl aflVar, akl<Long> aklVar) {
        S(new akm(this.f19359m, Uri.parse(aflVar.f19499b), 5, aklVar), new aec(this), 1);
    }

    private final void R(long j2) {
        this.q.postDelayed(this.f19355i, j2);
    }

    private final <T> void S(akm<T> akmVar, akc<akm<T>> akcVar, int i2) {
        this.f19360n.b(akmVar, akcVar, i2);
        this.f19351e.j(new aax(akmVar.f19988b), akmVar.f19989c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T() {
        Uri uri;
        this.q.removeCallbacks(this.f19355i);
        if (this.f19360n.k()) {
            return;
        }
        if (this.f19360n.l()) {
            this.v = true;
            return;
        }
        synchronized (this.f19353g) {
            uri = this.s;
        }
        this.v = false;
        S(new akm(this.f19359m, uri, 4, this.f19352f), this.D, ajr.i(4));
    }

    private static boolean U(aew aewVar) {
        for (int i2 = 0; i2 < aewVar.f19449c.size(); i2++) {
            int i3 = aewVar.f19449c.get(i2).f19410b;
            if (i3 == 1 || i3 == 2) {
                return true;
            }
        }
        return false;
    }

    public final akd A(akm<Long> akmVar, long j2, long j3, IOException iOException) {
        abo aboVar = this.f19351e;
        long j4 = akmVar.f19987a;
        akmVar.b();
        akmVar.d();
        akmVar.a();
        aboVar.h(new aax(), akmVar.f19989c, iOException, true);
        N(iOException);
        return akj.f19982b;
    }

    public final /* synthetic */ void G() {
        P(false);
    }

    public final void H(long j2) {
        long j3 = this.A;
        if (j3 == -9223372036854775807L || j3 < j2) {
            this.A = j2;
        }
    }

    public final void I() {
        this.q.removeCallbacks(this.f19356j);
        T();
    }

    public final void J(akm<?> akmVar, long j2, long j3) {
        long j4 = akmVar.f19987a;
        akmVar.b();
        akmVar.d();
        akmVar.a();
        this.f19351e.d(new aax(), akmVar.f19989c);
    }

    public final void K(akm<aer> akmVar, long j2, long j3) {
        long j4 = akmVar.f19987a;
        akmVar.b();
        akmVar.d();
        akmVar.a();
        this.f19351e.f(new aax(), akmVar.f19989c);
        aer aerVarC = akmVar.c();
        aer aerVar = this.u;
        int iB = aerVar == null ? 0 : aerVar.b();
        long j5 = aerVarC.e(0).f19448b;
        int i2 = 0;
        while (i2 < iB && this.u.e(i2).f19448b < j5) {
            i2++;
        }
        if (aerVarC.f19418d) {
            if (iB - i2 > aerVarC.b()) {
                Log.w("DashMediaSource", "Loaded out of sync manifest");
            } else {
                long j6 = this.A;
                if (j6 != -9223372036854775807L) {
                    long j7 = aerVarC.f19422h;
                    if (1000 * j7 <= j6) {
                        StringBuilder sb = new StringBuilder(73);
                        sb.append("Loaded stale dynamic manifest: ");
                        sb.append(j7);
                        sb.append(", ");
                        sb.append(j6);
                        Log.w("DashMediaSource", sb.toString());
                    }
                }
                this.z = 0;
            }
            int i3 = this.z;
            this.z = i3 + 1;
            if (i3 < ajr.i(akmVar.f19989c)) {
                R(Math.min((this.z - 1) * 1000, 5000));
                return;
            } else {
                this.p = new ads();
                return;
            }
        }
        this.u = aerVarC;
        this.v = aerVarC.f19418d & this.v;
        this.w = j2 - j3;
        this.x = j2;
        synchronized (this.f19353g) {
            if (akmVar.f19988b.f19897a == this.s) {
                Uri uriB = this.u.f19425k;
                if (uriB == null) {
                    uriB = akmVar.b();
                }
                this.s = uriB;
            }
        }
        if (iB != 0) {
            this.B += i2;
            P(true);
            return;
        }
        aer aerVar2 = this.u;
        if (!aerVar2.f19418d) {
            P(true);
            return;
        }
        afl aflVar = aerVar2.f19423i;
        if (aflVar == null) {
            M();
            return;
        }
        String str = aflVar.f19498a;
        if (amn.O(str, "urn:mpeg:dash:utc:direct:2014") || amn.O(str, "urn:mpeg:dash:utc:direct:2012")) {
            try {
                O(amn.o(aflVar.f19499b) - this.x);
                return;
            } catch (lb e2) {
                N(e2);
                return;
            }
        }
        if (amn.O(str, "urn:mpeg:dash:utc:http-iso:2014") || amn.O(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            Q(aflVar, new aea());
            return;
        }
        if (amn.O(str, "urn:mpeg:dash:utc:http-xsdate:2014") || amn.O(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            Q(aflVar, new aed(null));
        } else if (amn.O(str, "urn:mpeg:dash:utc:ntp:2014") || amn.O(str, "urn:mpeg:dash:utc:ntp:2012")) {
            M();
        } else {
            N(new IOException("Unsupported UTC timing scheme"));
        }
    }

    public final void L(akm<Long> akmVar, long j2, long j3) {
        long j4 = akmVar.f19987a;
        akmVar.b();
        akmVar.d();
        akmVar.a();
        this.f19351e.f(new aax(), akmVar.f19989c);
        O(akmVar.c().longValue() - j2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abi
    public final kn V() {
        return this.f19347a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abi
    public final void W(abe abeVar) {
        adu aduVar = (adu) abeVar;
        aduVar.o();
        this.f19354h.remove(aduVar.f19308a);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abi
    public final abe X(abg abgVar, ajm ajmVar, long j2) {
        int iIntValue = ((Integer) abgVar.f19056a).intValue() - this.B;
        abo aboVarE = e(abgVar, this.u.e(iIntValue).f19448b);
        adu aduVar = new adu(iIntValue + this.B, this.u, iIntValue, this.C, this.f19361o, this.f19349c, b(abgVar), this.E, aboVarE, this.y, this.f19358l, ajmVar, this.F, this.f19357k, null, null, null, null);
        this.f19354h.put(aduVar.f19308a, aduVar);
        return aduVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aac
    public final void m(akq akqVar) {
        this.f19361o = akqVar;
        this.f19349c.d();
        this.f19359m = this.f19348b.a();
        this.f19360n = new akj("DashMediaSource");
        this.q = amn.v();
        T();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aac
    public final void p() {
        this.v = false;
        this.f19359m = null;
        akj akjVar = this.f19360n;
        if (akjVar != null) {
            akjVar.i();
            this.f19360n = null;
        }
        this.w = 0L;
        this.x = 0L;
        this.u = null;
        this.s = this.t;
        this.p = null;
        Handler handler = this.q;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.q = null;
        }
        this.y = -9223372036854775807L;
        this.z = 0;
        this.A = -9223372036854775807L;
        this.B = 0;
        this.f19354h.clear();
        this.f19349c.e();
    }

    public final akd y(akm<aer> akmVar, long j2, long j3, IOException iOException, int i2) {
        long j4 = akmVar.f19987a;
        akmVar.b();
        akmVar.d();
        akmVar.a();
        aax aaxVar = new aax();
        new abc(akmVar.f19989c);
        long j5 = ajr.j(new akb(iOException, i2));
        akd akdVarC = j5 == -9223372036854775807L ? akj.f19983c : akj.c(false, j5);
        this.f19351e.h(aaxVar, akmVar.f19989c, iOException, !akdVarC.c());
        return akdVarC;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abi
    public final void z() {
        this.f19358l.a();
    }
}
