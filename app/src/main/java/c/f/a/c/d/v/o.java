package c.f.a.c.d.v;

import android.os.SystemClock;
import c.f.a.c.d.c;
import com.facebook.ads.AdError;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import java.util.Iterator;
import java.util.Locale;
import org.achartengine.chart.TimeChart;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class o extends y {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f12184e = a.k("com.google.cast.media");
    public final t A;
    public final t B;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f12185f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c.f.a.c.d.q f12186g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Long f12187h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public q f12188i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f12189j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final t f12190k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final t f12191l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final t f12192m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final t f12193n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f12194o;
    public final t p;
    public final t q;
    public final t r;
    public final t s;
    public final t t;
    public final t u;
    public final t v;
    public final t w;
    public final t x;
    public final t y;
    public final t z;

    public o(String str) {
        super(f12184e, "MediaControlChannel", null);
        t tVar = new t(TimeChart.DAY);
        this.f12189j = tVar;
        t tVar2 = new t(TimeChart.DAY);
        this.f12190k = tVar2;
        t tVar3 = new t(TimeChart.DAY);
        this.f12191l = tVar3;
        t tVar4 = new t(TimeChart.DAY);
        this.f12192m = tVar4;
        t tVar5 = new t(10000L);
        this.f12193n = tVar5;
        t tVar6 = new t(TimeChart.DAY);
        this.f12194o = tVar6;
        t tVar7 = new t(TimeChart.DAY);
        this.p = tVar7;
        t tVar8 = new t(TimeChart.DAY);
        this.q = tVar8;
        t tVar9 = new t(TimeChart.DAY);
        this.r = tVar9;
        t tVar10 = new t(TimeChart.DAY);
        this.s = tVar10;
        t tVar11 = new t(TimeChart.DAY);
        this.t = tVar11;
        t tVar12 = new t(TimeChart.DAY);
        this.u = tVar12;
        t tVar13 = new t(TimeChart.DAY);
        this.v = tVar13;
        t tVar14 = new t(TimeChart.DAY);
        this.w = tVar14;
        t tVar15 = new t(TimeChart.DAY);
        this.x = tVar15;
        t tVar16 = new t(TimeChart.DAY);
        this.z = tVar16;
        this.y = new t(TimeChart.DAY);
        t tVar17 = new t(TimeChart.DAY);
        this.A = tVar17;
        t tVar18 = new t(TimeChart.DAY);
        this.B = tVar18;
        i(tVar);
        i(tVar2);
        i(tVar3);
        i(tVar4);
        i(tVar5);
        i(tVar6);
        i(tVar7);
        i(tVar8);
        i(tVar9);
        i(tVar10);
        i(tVar11);
        i(tVar12);
        i(tVar13);
        i(tVar14);
        i(tVar15);
        i(tVar16);
        i(tVar16);
        i(tVar17);
        i(tVar18);
        M();
    }

    public static /* synthetic */ Long G(o oVar, Long l2) {
        oVar.f12187h = null;
        return null;
    }

    public static int[] L(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        int[] iArr = new int[jSONArray.length()];
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            iArr[i2] = jSONArray.getInt(i2);
        }
        return iArr;
    }

    public static s N(JSONObject jSONObject) {
        MediaError mediaErrorM = MediaError.M(jSONObject);
        s sVar = new s();
        sVar.f12202a = jSONObject.optJSONObject("customData");
        sVar.f12203b = mediaErrorM;
        return sVar;
    }

    public final long A(u uVar, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        long jG = g();
        try {
            jSONObject2.put("requestId", jG);
            jSONObject2.put("type", "PAUSE");
            jSONObject2.put("mediaSessionId", O());
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException unused) {
        }
        d(jSONObject2.toString(), jG, null);
        this.f12190k.c(jG, uVar);
        return jG;
    }

    public final long B(u uVar, int[] iArr) {
        JSONObject jSONObject = new JSONObject();
        long jG = g();
        try {
            jSONObject.put("requestId", jG);
            jSONObject.put("type", "QUEUE_GET_ITEMS");
            jSONObject.put("mediaSessionId", O());
            JSONArray jSONArray = new JSONArray();
            for (int i2 : iArr) {
                jSONArray.put(i2);
            }
            jSONObject.put("itemIds", jSONArray);
        } catch (JSONException unused) {
        }
        d(jSONObject.toString(), jG, null);
        this.y.c(jG, uVar);
        return jG;
    }

    public final long C(u uVar, int[] iArr, int i2, JSONObject jSONObject) {
        if (iArr == null || iArr.length == 0) {
            throw new IllegalArgumentException("itemIdsToReorder must not be null or empty.");
        }
        JSONObject jSONObject2 = new JSONObject();
        long jG = g();
        try {
            jSONObject2.put("requestId", jG);
            jSONObject2.put("type", "QUEUE_REORDER");
            jSONObject2.put("mediaSessionId", O());
            JSONArray jSONArray = new JSONArray();
            for (int i3 = 0; i3 < iArr.length; i3++) {
                jSONArray.put(i3, iArr[i3]);
            }
            jSONObject2.put("itemIds", jSONArray);
            if (i2 != 0) {
                jSONObject2.put("insertBefore", i2);
            }
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException unused) {
        }
        d(jSONObject2.toString(), jG, null);
        this.w.c(jG, uVar);
        return jG;
    }

    public final long D(u uVar, int[] iArr, JSONObject jSONObject) {
        if (iArr == null || iArr.length == 0) {
            throw new IllegalArgumentException("itemIdsToRemove must not be null or empty.");
        }
        JSONObject jSONObject2 = new JSONObject();
        long jG = g();
        try {
            jSONObject2.put("requestId", jG);
            jSONObject2.put("type", "QUEUE_REMOVE");
            jSONObject2.put("mediaSessionId", O());
            JSONArray jSONArray = new JSONArray();
            for (int i2 = 0; i2 < iArr.length; i2++) {
                jSONArray.put(i2, iArr[i2]);
            }
            jSONObject2.put("itemIds", jSONArray);
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException unused) {
        }
        d(jSONObject2.toString(), jG, null);
        this.v.c(jG, uVar);
        return jG;
    }

    public final long E(u uVar, long[] jArr) {
        if (jArr == null) {
            throw new IllegalArgumentException("trackIds cannot be null");
        }
        JSONObject jSONObject = new JSONObject();
        long jG = g();
        try {
            jSONObject.put("requestId", jG);
            jSONObject.put("type", "EDIT_TRACKS_INFO");
            jSONObject.put("mediaSessionId", O());
            JSONArray jSONArray = new JSONArray();
            for (int i2 = 0; i2 < jArr.length; i2++) {
                jSONArray.put(i2, jArr[i2]);
            }
            jSONObject.put("activeTrackIds", jSONArray);
        } catch (JSONException unused) {
        }
        d(jSONObject.toString(), jG, null);
        this.r.c(jG, uVar);
        return jG;
    }

    public final long F(u uVar, c.f.a.c.d.o[] oVarArr, int i2, int i3, long j2, JSONObject jSONObject) {
        String strB;
        if (oVarArr == null || oVarArr.length == 0) {
            throw new IllegalArgumentException("items must not be null or empty.");
        }
        if (i2 < 0 || i2 >= oVarArr.length) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Invalid startIndex: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
        if (j2 != -1 && j2 < 0) {
            StringBuilder sb2 = new StringBuilder(54);
            sb2.append("playPosition can not be negative: ");
            sb2.append(j2);
            throw new IllegalArgumentException(sb2.toString());
        }
        JSONObject jSONObject2 = new JSONObject();
        long jG = g();
        this.f12189j.c(jG, uVar);
        try {
            jSONObject2.put("requestId", jG);
            jSONObject2.put("type", "QUEUE_LOAD");
            JSONArray jSONArray = new JSONArray();
            for (int i4 = 0; i4 < oVarArr.length; i4++) {
                jSONArray.put(i4, oVarArr[i4].R());
            }
            jSONObject2.put("items", jSONArray);
            strB = c.f.a.c.d.v.c.a.b(Integer.valueOf(i3));
        } catch (JSONException unused) {
        }
        if (strB == null) {
            StringBuilder sb3 = new StringBuilder(32);
            sb3.append("Invalid repeat mode: ");
            sb3.append(i3);
            throw new IllegalArgumentException(sb3.toString());
        }
        jSONObject2.put("repeatMode", strB);
        jSONObject2.put("startIndex", i2);
        if (j2 != -1) {
            jSONObject2.put("currentTime", a.b(j2));
        }
        if (jSONObject != null) {
            jSONObject2.put("customData", jSONObject);
        }
        d(jSONObject2.toString(), jG, null);
        return jG;
    }

    public final void H(q qVar) {
        this.f12188i = qVar;
    }

    public final long I(u uVar) {
        JSONObject jSONObject = new JSONObject();
        long jG = g();
        try {
            jSONObject.put("requestId", jG);
            jSONObject.put("type", "GET_STATUS");
            c.f.a.c.d.q qVar = this.f12186g;
            if (qVar != null) {
                jSONObject.put("mediaSessionId", qVar.n0());
            }
        } catch (JSONException unused) {
        }
        d(jSONObject.toString(), jG, null);
        this.q.c(jG, uVar);
        return jG;
    }

    public final long J(u uVar) {
        JSONObject jSONObject = new JSONObject();
        long jG = g();
        try {
            jSONObject.put("requestId", jG);
            jSONObject.put("type", "QUEUE_GET_ITEM_IDS");
            jSONObject.put("mediaSessionId", O());
        } catch (JSONException unused) {
        }
        d(jSONObject.toString(), jG, null);
        this.x.c(jG, uVar);
        return jG;
    }

    public final long K(u uVar, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        long jG = g();
        try {
            jSONObject2.put("requestId", jG);
            jSONObject2.put("type", "PLAY");
            jSONObject2.put("mediaSessionId", O());
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException unused) {
        }
        d(jSONObject2.toString(), jG, null);
        this.f12191l.c(jG, uVar);
        return jG;
    }

    public final void M() {
        this.f12185f = 0L;
        this.f12186g = null;
        Iterator<t> it = j().iterator();
        while (it.hasNext()) {
            it.next().e(AdError.CACHE_ERROR_CODE);
        }
    }

    public final long O() throws p {
        c.f.a.c.d.q qVar = this.f12186g;
        if (qVar != null) {
            return qVar.n0();
        }
        throw new p();
    }

    @Override // c.f.a.c.d.v.g0
    public final void e(long j2, int i2) {
        Iterator<t> it = j().iterator();
        while (it.hasNext()) {
            it.next().f(j2, i2, null);
        }
    }

    @Override // c.f.a.c.d.v.y, c.f.a.c.d.v.g0
    public final void f() {
        super.f();
        M();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0087  */
    @Override // c.f.a.c.d.v.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 798
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.c.d.v.o.h(java.lang.String):void");
    }

    public final long k() {
        c.f.a.c.d.q qVar;
        c cVarJ;
        c.f.a.c.d.a aVarK;
        if (this.f12185f == 0 || (qVar = this.f12186g) == null || (cVarJ = qVar.J()) == null || (aVarK = this.f12186g.K()) == null) {
            return 0L;
        }
        double d2 = 0.0d;
        if (this.f12186g.T() == 0.0d && this.f12186g.U() == 2) {
            d2 = 1.0d;
        }
        return v(d2, cVarJ.K(), aVarK.L());
    }

    public final long l() {
        c.f.a.c.d.i iVarQ;
        c.f.a.c.d.q qVar = this.f12186g;
        if (qVar == null || (iVarQ = qVar.Q()) == null) {
            return 0L;
        }
        long jI = iVarQ.I();
        return !iVarQ.K() ? v(1.0d, jI, -1L) : jI;
    }

    public final long m() {
        c.f.a.c.d.i iVarQ;
        c.f.a.c.d.q qVar = this.f12186g;
        if (qVar == null || (iVarQ = qVar.Q()) == null) {
            return 0L;
        }
        long J = iVarQ.J();
        if (iVarQ.L()) {
            J = v(1.0d, J, -1L);
        }
        return iVarQ.K() ? Math.min(J, iVarQ.I()) : J;
    }

    public final long n() {
        MediaInfo mediaInfoO = o();
        if (mediaInfoO == null) {
            return 0L;
        }
        Long l2 = this.f12187h;
        if (l2 == null) {
            if (this.f12185f == 0) {
                return 0L;
            }
            double dT = this.f12186g.T();
            long jC0 = this.f12186g.c0();
            return (dT == 0.0d || this.f12186g.U() != 2) ? jC0 : v(dT, jC0, mediaInfoO.R());
        }
        if (l2.equals(4294967296000L)) {
            if (this.f12186g.Q() != null) {
                return Math.min(l2.longValue(), l());
            }
            if (q() >= 0) {
                return Math.min(l2.longValue(), q());
            }
        }
        return l2.longValue();
    }

    public final MediaInfo o() {
        c.f.a.c.d.q qVar = this.f12186g;
        if (qVar == null) {
            return null;
        }
        return qVar.S();
    }

    public final c.f.a.c.d.q p() {
        return this.f12186g;
    }

    public final long q() {
        MediaInfo mediaInfoO = o();
        if (mediaInfoO != null) {
            return mediaInfoO.R();
        }
        return 0L;
    }

    public final void r() {
        q qVar = this.f12188i;
        if (qVar != null) {
            qVar.a();
        }
    }

    public final void s() {
        q qVar = this.f12188i;
        if (qVar != null) {
            qVar.c();
        }
    }

    public final void t() {
        q qVar = this.f12188i;
        if (qVar != null) {
            qVar.b();
        }
    }

    public final void u() {
        q qVar = this.f12188i;
        if (qVar != null) {
            qVar.d();
        }
    }

    public final long v(double d2, long j2, long j3) {
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f12185f;
        if (jElapsedRealtime < 0) {
            jElapsedRealtime = 0;
        }
        if (jElapsedRealtime == 0) {
            return j2;
        }
        double d3 = jElapsedRealtime;
        Double.isNaN(d3);
        long j4 = j2 + ((long) (d3 * d2));
        if (j3 > 0 && j4 > j3) {
            return j3;
        }
        if (j4 < 0) {
            return 0L;
        }
        return j4;
    }

    public final long w(u uVar) {
        JSONObject jSONObject = new JSONObject();
        long jG = g();
        try {
            jSONObject.put("requestId", jG);
            jSONObject.put("type", "SKIP_AD");
            jSONObject.put("mediaSessionId", O());
        } catch (JSONException e2) {
            this.f12150a.g(String.format(Locale.ROOT, "Error creating SkipAd message: %s", e2.getMessage()), new Object[0]);
        }
        d(jSONObject.toString(), jG, null);
        this.B.c(jG, uVar);
        return jG;
    }

    public final long x(u uVar, int i2, long j2, c.f.a.c.d.o[] oVarArr, int i3, Integer num, JSONObject jSONObject) {
        if (j2 != -1 && j2 < 0) {
            StringBuilder sb = new StringBuilder(53);
            sb.append("playPosition cannot be negative: ");
            sb.append(j2);
            throw new IllegalArgumentException(sb.toString());
        }
        JSONObject jSONObject2 = new JSONObject();
        long jG = g();
        try {
            jSONObject2.put("requestId", jG);
            jSONObject2.put("type", "QUEUE_UPDATE");
            jSONObject2.put("mediaSessionId", O());
            if (i2 != 0) {
                jSONObject2.put("currentItemId", i2);
            }
            if (i3 != 0) {
                jSONObject2.put("jump", i3);
            }
            if (oVarArr != null && oVarArr.length > 0) {
                JSONArray jSONArray = new JSONArray();
                for (int i4 = 0; i4 < oVarArr.length; i4++) {
                    jSONArray.put(i4, oVarArr[i4].R());
                }
                jSONObject2.put("items", jSONArray);
            }
            String strB = c.f.a.c.d.v.c.a.b(num);
            if (strB != null) {
                jSONObject2.put("repeatMode", strB);
            }
            if (j2 != -1) {
                jSONObject2.put("currentTime", a.b(j2));
            }
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException unused) {
        }
        d(jSONObject2.toString(), jG, null);
        this.u.c(jG, uVar);
        return jG;
    }

    public final long y(u uVar, c.f.a.c.d.k kVar) {
        if (kVar.N() == null && kVar.P() == null) {
            throw new IllegalArgumentException("MediaInfo and MediaQueueData should not be both null");
        }
        JSONObject jSONObjectR = kVar.R();
        if (jSONObjectR == null) {
            throw new IllegalArgumentException("Failed to jsonify the load request due to malformed request");
        }
        long jG = g();
        try {
            jSONObjectR.put("requestId", jG);
            jSONObjectR.put("type", "LOAD");
        } catch (JSONException unused) {
        }
        d(jSONObjectR.toString(), jG, null);
        this.f12189j.c(jG, uVar);
        return jG;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0056 A[Catch: JSONException -> 0x005f, TRY_LEAVE, TryCatch #0 {JSONException -> 0x005f, blocks: (B:6:0x0019, B:10:0x0042, B:14:0x0050, B:16:0x0056, B:11:0x0046), top: B:20:0x0019 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long z(c.f.a.c.d.v.u r9, c.f.a.c.d.p r10) {
        /*
            r8 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            long r1 = r8.g()
            boolean r3 = r10.d()
            if (r3 == 0) goto L15
            r3 = 4294967296000(0x3e800000000, double:2.1219957909653E-311)
            goto L19
        L15:
            long r3 = r10.b()
        L19:
            java.lang.String r5 = "requestId"
            r0.put(r5, r1)     // Catch: org.json.JSONException -> L5f
            java.lang.String r5 = "type"
            java.lang.String r6 = "SEEK"
            r0.put(r5, r6)     // Catch: org.json.JSONException -> L5f
            java.lang.String r5 = "mediaSessionId"
            long r6 = r8.O()     // Catch: org.json.JSONException -> L5f
            r0.put(r5, r6)     // Catch: org.json.JSONException -> L5f
            java.lang.String r5 = "currentTime"
            double r6 = c.f.a.c.d.v.a.b(r3)     // Catch: org.json.JSONException -> L5f
            r0.put(r5, r6)     // Catch: org.json.JSONException -> L5f
            int r5 = r10.c()     // Catch: org.json.JSONException -> L5f
            r6 = 1
            java.lang.String r7 = "resumeState"
            if (r5 != r6) goto L46
            java.lang.String r5 = "PLAYBACK_START"
        L42:
            r0.put(r7, r5)     // Catch: org.json.JSONException -> L5f
            goto L50
        L46:
            int r5 = r10.c()     // Catch: org.json.JSONException -> L5f
            r6 = 2
            if (r5 != r6) goto L50
            java.lang.String r5 = "PLAYBACK_PAUSE"
            goto L42
        L50:
            org.json.JSONObject r5 = r10.a()     // Catch: org.json.JSONException -> L5f
            if (r5 == 0) goto L5f
            java.lang.String r5 = "customData"
            org.json.JSONObject r10 = r10.a()     // Catch: org.json.JSONException -> L5f
            r0.put(r5, r10)     // Catch: org.json.JSONException -> L5f
        L5f:
            java.lang.String r10 = r0.toString()
            r0 = 0
            r8.d(r10, r1, r0)
            java.lang.Long r10 = java.lang.Long.valueOf(r3)
            r8.f12187h = r10
            c.f.a.c.d.v.t r10 = r8.f12193n
            c.f.a.c.d.v.n r0 = new c.f.a.c.d.v.n
            r0.<init>(r8, r9)
            r10.c(r1, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.c.d.v.o.z(c.f.a.c.d.v.u, c.f.a.c.d.p):long");
    }
}
