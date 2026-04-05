package c.f.a.b.i3;

import android.content.Context;
import android.os.Handler;
import android.support.v4.media.session.PlaybackStateCompat;
import c.f.a.b.i3.i;
import c.f.a.b.j3.f0;
import c.f.a.b.j3.x0;
import com.facebook.ads.AdError;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class u implements i, n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c.f.b.b.u<String, Integer> f9090a = j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c.f.b.b.t<Long> f9091b = c.f.b.b.t.N(6200000L, 3900000L, 2300000L, 1300000L, 620000L);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c.f.b.b.t<Long> f9092c = c.f.b.b.t.N(248000L, 160000L, 142000L, 127000L, 113000L);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c.f.b.b.t<Long> f9093d = c.f.b.b.t.N(2200000L, 1300000L, 950000L, 760000L, 520000L);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c.f.b.b.t<Long> f9094e = c.f.b.b.t.N(4400000L, 2300000L, 1500000L, 1100000L, 640000L);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c.f.b.b.t<Long> f9095f = c.f.b.b.t.N(10000000L, 7200000L, 5000000L, 2700000L, 1600000L);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c.f.b.b.t<Long> f9096g = c.f.b.b.t.N(2600000L, 2200000L, 2000000L, 1500000L, 470000L);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static u f9097h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c.f.b.b.v<Integer, Long> f9098i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final i.a.C0136a f9099j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final c.f.a.b.j3.o0 f9100k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c.f.a.b.j3.i f9101l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f9102m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f9103n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f9104o;
    public long p;
    public int q;
    public long r;
    public long s;
    public long t;
    public long u;
    public boolean v;
    public int w;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f9105a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Map<Integer, Long> f9106b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f9107c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public c.f.a.b.j3.i f9108d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f9109e;

        public b(Context context) {
            this.f9105a = context == null ? null : context.getApplicationContext();
            this.f9106b = c(x0.N(context));
            this.f9107c = AdError.SERVER_ERROR_CODE;
            this.f9108d = c.f.a.b.j3.i.f9202a;
            this.f9109e = true;
        }

        public static c.f.b.b.t<Integer> b(String str) {
            c.f.b.b.t<Integer> tVar = u.f9090a.get(str);
            return tVar.isEmpty() ? c.f.b.b.t.O(2, 2, 2, 2, 2, 2) : tVar;
        }

        public static Map<Integer, Long> c(String str) {
            c.f.b.b.t<Integer> tVarB = b(str);
            HashMap map = new HashMap(8);
            map.put(0, 1000000L);
            c.f.b.b.t<Long> tVar = u.f9091b;
            map.put(2, tVar.get(tVarB.get(0).intValue()));
            map.put(3, u.f9092c.get(tVarB.get(1).intValue()));
            map.put(4, u.f9093d.get(tVarB.get(2).intValue()));
            map.put(5, u.f9094e.get(tVarB.get(3).intValue()));
            map.put(10, u.f9095f.get(tVarB.get(4).intValue()));
            map.put(9, u.f9096g.get(tVarB.get(5).intValue()));
            map.put(7, tVar.get(tVarB.get(0).intValue()));
            return map;
        }

        public u a() {
            return new u(this.f9105a, this.f9106b, this.f9107c, this.f9108d, this.f9109e);
        }
    }

    public u(Context context, Map<Integer, Long> map, int i2, c.f.a.b.j3.i iVar, boolean z) {
        this.f9098i = c.f.b.b.v.d(map);
        this.f9099j = new i.a.C0136a();
        this.f9100k = new c.f.a.b.j3.o0(i2);
        this.f9101l = iVar;
        this.f9102m = z;
        if (context == null) {
            this.q = 0;
            this.t = k(0);
            return;
        }
        c.f.a.b.j3.f0 f0VarC = c.f.a.b.j3.f0.c(context);
        int iE = f0VarC.e();
        this.q = iE;
        this.t = k(iE);
        f0VarC.i(new f0.c() { // from class: c.f.a.b.i3.b
            @Override // c.f.a.b.j3.f0.c
            public final void a(int i3) {
                this.f8843a.p(i3);
            }
        });
    }

    public static c.f.b.b.u<String, Integer> j() {
        return c.f.b.b.u.s().i("AD", 1, 2, 0, 0, 2, 2).i("AE", 1, 4, 4, 4, 2, 2).i("AF", 4, 4, 3, 4, 2, 2).i("AG", 4, 2, 1, 4, 2, 2).i("AI", 1, 2, 2, 2, 2, 2).i("AL", 1, 1, 1, 1, 2, 2).i("AM", 2, 2, 1, 3, 2, 2).i("AO", 3, 4, 3, 1, 2, 2).i("AR", 2, 4, 2, 1, 2, 2).i("AS", 2, 2, 3, 3, 2, 2).i("AT", 0, 1, 0, 0, 0, 2).i("AU", 0, 2, 0, 1, 1, 2).i("AW", 1, 2, 0, 4, 2, 2).i("AX", 0, 2, 2, 2, 2, 2).i("AZ", 3, 3, 3, 4, 4, 2).i("BA", 1, 1, 0, 1, 2, 2).i("BB", 0, 2, 0, 0, 2, 2).i("BD", 2, 0, 3, 3, 2, 2).i("BE", 0, 0, 2, 3, 2, 2).i("BF", 4, 4, 4, 2, 2, 2).i("BG", 0, 1, 0, 0, 2, 2).i("BH", 1, 0, 2, 4, 2, 2).i("BI", 4, 4, 4, 4, 2, 2).i("BJ", 4, 4, 4, 4, 2, 2).i("BL", 1, 2, 2, 2, 2, 2).i("BM", 0, 2, 0, 0, 2, 2).i("BN", 3, 2, 1, 0, 2, 2).i("BO", 1, 2, 4, 2, 2, 2).i("BQ", 1, 2, 1, 2, 2, 2).i("BR", 2, 4, 3, 2, 2, 2).i("BS", 2, 2, 1, 3, 2, 2).i("BT", 3, 0, 3, 2, 2, 2).i("BW", 3, 4, 1, 1, 2, 2).i("BY", 1, 1, 1, 2, 2, 2).i("BZ", 2, 2, 2, 2, 2, 2).i("CA", 0, 3, 1, 2, 4, 2).i("CD", 4, 2, 2, 1, 2, 2).i("CF", 4, 2, 3, 2, 2, 2).i("CG", 3, 4, 2, 2, 2, 2).i("CH", 0, 0, 0, 0, 1, 2).i("CI", 3, 3, 3, 3, 2, 2).i("CK", 2, 2, 3, 0, 2, 2).i("CL", 1, 1, 2, 2, 2, 2).i("CM", 3, 4, 3, 2, 2, 2).i("CN", 2, 2, 2, 1, 3, 2).i("CO", 2, 3, 4, 2, 2, 2).i("CR", 2, 3, 4, 4, 2, 2).i("CU", 4, 4, 2, 2, 2, 2).i("CV", 2, 3, 1, 0, 2, 2).i("CW", 1, 2, 0, 0, 2, 2).i("CY", 1, 1, 0, 0, 2, 2).i("CZ", 0, 1, 0, 0, 1, 2).i("DE", 0, 0, 1, 1, 0, 2).i("DJ", 4, 0, 4, 4, 2, 2).i("DK", 0, 0, 1, 0, 0, 2).i("DM", 1, 2, 2, 2, 2, 2).i("DO", 3, 4, 4, 4, 2, 2).i("DZ", 3, 3, 4, 4, 2, 4).i("EC", 2, 4, 3, 1, 2, 2).i("EE", 0, 1, 0, 0, 2, 2).i("EG", 3, 4, 3, 3, 2, 2).i("EH", 2, 2, 2, 2, 2, 2).i("ER", 4, 2, 2, 2, 2, 2).i("ES", 0, 1, 1, 1, 2, 2).i("ET", 4, 4, 4, 1, 2, 2).i("FI", 0, 0, 0, 0, 0, 2).i("FJ", 3, 0, 2, 3, 2, 2).i("FK", 4, 2, 2, 2, 2, 2).i("FM", 3, 2, 4, 4, 2, 2).i("FO", 1, 2, 0, 1, 2, 2).i("FR", 1, 1, 2, 0, 1, 2).i("GA", 3, 4, 1, 1, 2, 2).i("GB", 0, 0, 1, 1, 1, 2).i("GD", 1, 2, 2, 2, 2, 2).i("GE", 1, 1, 1, 2, 2, 2).i("GF", 2, 2, 2, 3, 2, 2).i("GG", 1, 2, 0, 0, 2, 2).i("GH", 3, 1, 3, 2, 2, 2).i("GI", 0, 2, 0, 0, 2, 2).i("GL", 1, 2, 0, 0, 2, 2).i("GM", 4, 3, 2, 4, 2, 2).i("GN", 4, 3, 4, 2, 2, 2).i("GP", 2, 1, 2, 3, 2, 2).i("GQ", 4, 2, 2, 4, 2, 2).i("GR", 1, 2, 0, 0, 2, 2).i("GT", 3, 2, 3, 1, 2, 2).i("GU", 1, 2, 3, 4, 2, 2).i("GW", 4, 4, 4, 4, 2, 2).i("GY", 3, 3, 3, 4, 2, 2).i("HK", 0, 1, 2, 3, 2, 0).i("HN", 3, 1, 3, 3, 2, 2).i("HR", 1, 1, 0, 0, 3, 2).i("HT", 4, 4, 4, 4, 2, 2).i("HU", 0, 0, 0, 0, 0, 2).i("ID", 3, 2, 3, 3, 2, 2).i("IE", 0, 0, 1, 1, 3, 2).i("IL", 1, 0, 2, 3, 4, 2).i("IM", 0, 2, 0, 1, 2, 2).i("IN", 2, 1, 3, 3, 2, 2).i("IO", 4, 2, 2, 4, 2, 2).i("IQ", 3, 3, 4, 4, 2, 2).i("IR", 3, 2, 3, 2, 2, 2).i("IS", 0, 2, 0, 0, 2, 2).i("IT", 0, 4, 0, 1, 2, 2).i("JE", 2, 2, 1, 2, 2, 2).i("JM", 3, 3, 4, 4, 2, 2).i("JO", 2, 2, 1, 1, 2, 2).i("JP", 0, 0, 0, 0, 2, 1).i("KE", 3, 4, 2, 2, 2, 2).i("KG", 2, 0, 1, 1, 2, 2).i("KH", 1, 0, 4, 3, 2, 2).i("KI", 4, 2, 4, 3, 2, 2).i("KM", 4, 3, 2, 3, 2, 2).i("KN", 1, 2, 2, 2, 2, 2).i("KP", 4, 2, 2, 2, 2, 2).i("KR", 0, 0, 1, 3, 1, 2).i("KW", 1, 3, 1, 1, 1, 2).i("KY", 1, 2, 0, 2, 2, 2).i("KZ", 2, 2, 2, 3, 2, 2).i("LA", 1, 2, 1, 1, 2, 2).i("LB", 3, 2, 0, 0, 2, 2).i("LC", 1, 2, 0, 0, 2, 2).i("LI", 0, 2, 2, 2, 2, 2).i("LK", 2, 0, 2, 3, 2, 2).i("LR", 3, 4, 4, 3, 2, 2).i("LS", 3, 3, 2, 3, 2, 2).i("LT", 0, 0, 0, 0, 2, 2).i("LU", 1, 0, 1, 1, 2, 2).i("LV", 0, 0, 0, 0, 2, 2).i("LY", 4, 2, 4, 3, 2, 2).i("MA", 3, 2, 2, 1, 2, 2).i("MC", 0, 2, 0, 0, 2, 2).i("MD", 1, 2, 0, 0, 2, 2).i("ME", 1, 2, 0, 1, 2, 2).i("MF", 2, 2, 1, 1, 2, 2).i("MG", 3, 4, 2, 2, 2, 2).i("MH", 4, 2, 2, 4, 2, 2).i("MK", 1, 1, 0, 0, 2, 2).i("ML", 4, 4, 2, 2, 2, 2).i("MM", 2, 3, 3, 3, 2, 2).i("MN", 2, 4, 2, 2, 2, 2).i("MO", 0, 2, 4, 4, 2, 2).i("MP", 0, 2, 2, 2, 2, 2).i("MQ", 2, 2, 2, 3, 2, 2).i("MR", 3, 0, 4, 3, 2, 2).i("MS", 1, 2, 2, 2, 2, 2).i("MT", 0, 2, 0, 0, 2, 2).i("MU", 2, 1, 1, 2, 2, 2).i("MV", 4, 3, 2, 4, 2, 2).i("MW", 4, 2, 1, 0, 2, 2).i("MX", 2, 4, 4, 4, 4, 2).i("MY", 1, 0, 3, 2, 2, 2).i("MZ", 3, 3, 2, 1, 2, 2).i("NA", 4, 3, 3, 2, 2, 2).i("NC", 3, 0, 4, 4, 2, 2).i("NE", 4, 4, 4, 4, 2, 2).i("NF", 2, 2, 2, 2, 2, 2).i("NG", 3, 3, 2, 3, 2, 2).i("NI", 2, 1, 4, 4, 2, 2).i("NL", 0, 2, 3, 2, 0, 2).i("NO", 0, 1, 2, 0, 0, 2).i("NP", 2, 0, 4, 2, 2, 2).i("NR", 3, 2, 3, 1, 2, 2).i("NU", 4, 2, 2, 2, 2, 2).i("NZ", 0, 2, 1, 2, 4, 2).i("OM", 2, 2, 1, 3, 3, 2).i("PA", 1, 3, 3, 3, 2, 2).i("PE", 2, 3, 4, 4, 2, 2).i("PF", 2, 2, 2, 1, 2, 2).i("PG", 4, 4, 3, 2, 2, 2).i("PH", 2, 1, 3, 3, 3, 2).i("PK", 3, 2, 3, 3, 2, 2).i("PL", 1, 0, 1, 2, 3, 2).i("PM", 0, 2, 2, 2, 2, 2).i("PR", 2, 1, 2, 2, 4, 3).i("PS", 3, 3, 2, 2, 2, 2).i("PT", 0, 1, 1, 0, 2, 2).i("PW", 1, 2, 4, 1, 2, 2).i("PY", 2, 0, 3, 2, 2, 2).i("QA", 2, 3, 1, 2, 3, 2).i("RE", 1, 0, 2, 2, 2, 2).i("RO", 0, 1, 0, 1, 0, 2).i("RS", 1, 2, 0, 0, 2, 2).i("RU", 0, 1, 0, 1, 4, 2).i("RW", 3, 3, 3, 1, 2, 2).i("SA", 2, 2, 2, 1, 1, 2).i("SB", 4, 2, 3, 2, 2, 2).i("SC", 4, 2, 1, 3, 2, 2).i("SD", 4, 4, 4, 4, 2, 2).i("SE", 0, 0, 0, 0, 0, 2).i("SG", 1, 0, 1, 2, 3, 2).i("SH", 4, 2, 2, 2, 2, 2).i("SI", 0, 0, 0, 0, 2, 2).i("SJ", 2, 2, 2, 2, 2, 2).i("SK", 0, 1, 0, 0, 2, 2).i("SL", 4, 3, 4, 0, 2, 2).i("SM", 0, 2, 2, 2, 2, 2).i("SN", 4, 4, 4, 4, 2, 2).i("SO", 3, 3, 3, 4, 2, 2).i("SR", 3, 2, 2, 2, 2, 2).i("SS", 4, 4, 3, 3, 2, 2).i("ST", 2, 2, 1, 2, 2, 2).i("SV", 2, 1, 4, 3, 2, 2).i("SX", 2, 2, 1, 0, 2, 2).i("SY", 4, 3, 3, 2, 2, 2).i("SZ", 3, 3, 2, 4, 2, 2).i("TC", 2, 2, 2, 0, 2, 2).i("TD", 4, 3, 4, 4, 2, 2).i("TG", 3, 2, 2, 4, 2, 2).i("TH", 0, 3, 2, 3, 2, 2).i("TJ", 4, 4, 4, 4, 2, 2).i("TL", 4, 0, 4, 4, 2, 2).i("TM", 4, 2, 4, 3, 2, 2).i("TN", 2, 1, 1, 2, 2, 2).i("TO", 3, 3, 4, 3, 2, 2).i("TR", 1, 2, 1, 1, 2, 2).i("TT", 1, 4, 0, 1, 2, 2).i("TV", 3, 2, 2, 4, 2, 2).i("TW", 0, 0, 0, 0, 1, 0).i("TZ", 3, 3, 3, 2, 2, 2).i("UA", 0, 3, 1, 1, 2, 2).i("UG", 3, 2, 3, 3, 2, 2).i("US", 1, 1, 2, 2, 4, 2).i("UY", 2, 2, 1, 1, 2, 2).i("UZ", 2, 1, 3, 4, 2, 2).i("VC", 1, 2, 2, 2, 2, 2).i("VE", 4, 4, 4, 4, 2, 2).i("VG", 2, 2, 1, 1, 2, 2).i("VI", 1, 2, 1, 2, 2, 2).i("VN", 0, 1, 3, 4, 2, 2).i("VU", 4, 0, 3, 1, 2, 2).i("WF", 4, 2, 2, 4, 2, 2).i("WS", 3, 1, 3, 1, 2, 2).i("XK", 0, 1, 1, 0, 2, 2).i("YE", 4, 4, 4, 3, 2, 2).i("YT", 4, 2, 2, 3, 2, 2).i("ZA", 3, 3, 2, 1, 2, 2).i("ZM", 3, 2, 3, 3, 2, 2).i("ZW", 3, 2, 4, 3, 2, 2).f();
    }

    public static synchronized u l(Context context) {
        if (f9097h == null) {
            f9097h = new b(context).a();
        }
        return f9097h;
    }

    public static boolean m(s sVar, boolean z) {
        return z && !sVar.d(8);
    }

    @Override // c.f.a.b.i3.i
    public /* synthetic */ long a() {
        return h.a(this);
    }

    @Override // c.f.a.b.i3.n0
    public synchronized void b(p pVar, s sVar, boolean z) {
        if (m(sVar, z)) {
            c.f.a.b.j3.g.g(this.f9103n > 0);
            long jB = this.f9101l.b();
            int i2 = (int) (jB - this.f9104o);
            this.r += (long) i2;
            long j2 = this.s;
            long j3 = this.p;
            this.s = j2 + j3;
            if (i2 > 0) {
                this.f9100k.a((int) Math.sqrt(j3), (j3 * 8000.0f) / i2);
                if (this.r >= 2000 || this.s >= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) {
                    this.t = (long) this.f9100k.d(0.5f);
                }
                o(i2, this.p, this.t);
                this.f9104o = jB;
                this.p = 0L;
            }
            this.f9103n--;
        }
    }

    @Override // c.f.a.b.i3.n0
    public synchronized void c(p pVar, s sVar, boolean z) {
        if (m(sVar, z)) {
            if (this.f9103n == 0) {
                this.f9104o = this.f9101l.b();
            }
            this.f9103n++;
        }
    }

    @Override // c.f.a.b.i3.i
    public n0 d() {
        return this;
    }

    @Override // c.f.a.b.i3.i
    public void e(i.a aVar) {
        this.f9099j.d(aVar);
    }

    @Override // c.f.a.b.i3.i
    public synchronized long f() {
        return this.t;
    }

    @Override // c.f.a.b.i3.n0
    public synchronized void g(p pVar, s sVar, boolean z, int i2) {
        if (m(sVar, z)) {
            this.p += (long) i2;
        }
    }

    @Override // c.f.a.b.i3.i
    public void h(Handler handler, i.a aVar) {
        c.f.a.b.j3.g.e(handler);
        c.f.a.b.j3.g.e(aVar);
        this.f9099j.a(handler, aVar);
    }

    @Override // c.f.a.b.i3.n0
    public void i(p pVar, s sVar, boolean z) {
    }

    public final long k(int i2) {
        Long l2 = this.f9098i.get(Integer.valueOf(i2));
        if (l2 == null) {
            l2 = this.f9098i.get(0);
        }
        if (l2 == null) {
            l2 = 1000000L;
        }
        return l2.longValue();
    }

    public final void o(int i2, long j2, long j3) {
        if (i2 == 0 && j2 == 0 && j3 == this.u) {
            return;
        }
        this.u = j3;
        this.f9099j.b(i2, j2, j3);
    }

    public final synchronized void p(int i2) {
        int i3 = this.q;
        if (i3 == 0 || this.f9102m) {
            if (this.v) {
                i2 = this.w;
            }
            if (i3 == i2) {
                return;
            }
            this.q = i2;
            if (i2 != 1 && i2 != 0 && i2 != 8) {
                this.t = k(i2);
                long jB = this.f9101l.b();
                o(this.f9103n > 0 ? (int) (jB - this.f9104o) : 0, this.p, this.t);
                this.f9104o = jB;
                this.p = 0L;
                this.s = 0L;
                this.r = 0L;
                this.f9100k.g();
            }
        }
    }
}
