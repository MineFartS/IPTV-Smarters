package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import com.facebook.ads.AdError;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ajo implements aja, akq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final aua<String, Integer> f19911a = k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final aty<Long> f19912b = aty.q(6200000L, 3900000L, 2300000L, 1300000L, 620000L);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final aty<Long> f19913c = aty.q(248000L, 160000L, 142000L, 127000L, 113000L);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final aty<Long> f19914d = aty.q(2200000L, 1300000L, 950000L, 760000L, 520000L);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final aty<Long> f19915e = aty.q(4400000L, 2300000L, 1500000L, 1100000L, 640000L);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final aty<Long> f19916f = aty.q(10000000L, 7200000L, 5000000L, 2700000L, 1600000L);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final aty<Long> f19917g = aty.q(2600000L, 2200000L, 2000000L, 1500000L, 470000L);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static ajo f19918h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final aud<Integer, Long> f19919i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final aiy f19920j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final amb f19921k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final akt f19922l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f19923m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f19924n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f19925o;
    private long p;
    private int q;
    private long r;
    private long s;
    private long t;
    private long u;

    @Deprecated
    public ajo() {
        aud.e();
        akt aktVar = akt.f20013a;
        throw null;
    }

    public /* synthetic */ ajo(Context context, Map map, int i2, akt aktVar, boolean z) {
        this.f19919i = aud.d(map);
        this.f19920j = new aiy();
        this.f19921k = new amb(AdError.SERVER_ERROR_CODE);
        this.f19922l = aktVar;
        this.f19923m = true;
        if (context == null) {
            this.q = 0;
            this.t = j(0);
            return;
        }
        alv alvVarB = alv.b(context);
        int iA = alvVarB.a();
        this.q = iA;
        this.t = j(iA);
        alvVarB.d(new ajn(this));
    }

    public static synchronized ajo d(Context context) {
        if (f19918h == null) {
            Context applicationContext = context == null ? null : context.getApplicationContext();
            aty<Integer> atyVarA = f19911a.a(amn.G(context));
            if (atyVarA.isEmpty()) {
                atyVarA = aty.r(2, 2, 2, 2, 2, 2);
            }
            HashMap map = new HashMap(8);
            map.put(0, 1000000L);
            aty<Long> atyVar = f19912b;
            map.put(2, atyVar.get(atyVarA.get(0).intValue()));
            map.put(3, f19913c.get(atyVarA.get(1).intValue()));
            map.put(4, f19914d.get(atyVarA.get(2).intValue()));
            map.put(5, f19915e.get(atyVarA.get(3).intValue()));
            map.put(10, f19916f.get(atyVarA.get(4).intValue()));
            map.put(9, f19917g.get(atyVarA.get(5).intValue()));
            map.put(7, atyVar.get(atyVarA.get(0).intValue()));
            f19918h = ajr.a(applicationContext, map, AdError.SERVER_ERROR_CODE, akt.f20013a, true);
        }
        return f19918h;
    }

    private final long j(int i2) {
        Long l2 = this.f19919i.get(Integer.valueOf(i2));
        if (l2 == null) {
            l2 = this.f19919i.get(0);
        }
        if (l2 == null) {
            l2 = 1000000L;
        }
        return l2.longValue();
    }

    private static aua<String, Integer> k() {
        atz atzVarB = aua.b();
        atzVarB.c("AD", 1, 2, 0, 0, 2, 2);
        atzVarB.c("AE", 1, 4, 4, 4, 2, 2);
        atzVarB.c("AF", 4, 4, 3, 4, 2, 2);
        atzVarB.c("AG", 4, 2, 1, 4, 2, 2);
        atzVarB.c("AI", 1, 2, 2, 2, 2, 2);
        atzVarB.c("AL", 1, 1, 1, 1, 2, 2);
        atzVarB.c("AM", 2, 2, 1, 3, 2, 2);
        atzVarB.c("AO", 3, 4, 3, 1, 2, 2);
        atzVarB.c("AR", 2, 4, 2, 1, 2, 2);
        atzVarB.c("AS", 2, 2, 3, 3, 2, 2);
        atzVarB.c("AT", 0, 1, 0, 0, 0, 2);
        atzVarB.c("AU", 0, 2, 0, 1, 1, 2);
        atzVarB.c("AW", 1, 2, 0, 4, 2, 2);
        atzVarB.c("AX", 0, 2, 2, 2, 2, 2);
        atzVarB.c("AZ", 3, 3, 3, 4, 4, 2);
        atzVarB.c("BA", 1, 1, 0, 1, 2, 2);
        atzVarB.c("BB", 0, 2, 0, 0, 2, 2);
        atzVarB.c("BD", 2, 0, 3, 3, 2, 2);
        atzVarB.c("BE", 0, 0, 2, 3, 2, 2);
        atzVarB.c("BF", 4, 4, 4, 2, 2, 2);
        atzVarB.c("BG", 0, 1, 0, 0, 2, 2);
        atzVarB.c("BH", 1, 0, 2, 4, 2, 2);
        atzVarB.c("BI", 4, 4, 4, 4, 2, 2);
        atzVarB.c("BJ", 4, 4, 4, 4, 2, 2);
        atzVarB.c("BL", 1, 2, 2, 2, 2, 2);
        atzVarB.c("BM", 0, 2, 0, 0, 2, 2);
        atzVarB.c("BN", 3, 2, 1, 0, 2, 2);
        atzVarB.c("BO", 1, 2, 4, 2, 2, 2);
        atzVarB.c("BQ", 1, 2, 1, 2, 2, 2);
        atzVarB.c("BR", 2, 4, 3, 2, 2, 2);
        atzVarB.c("BS", 2, 2, 1, 3, 2, 2);
        atzVarB.c("BT", 3, 0, 3, 2, 2, 2);
        atzVarB.c("BW", 3, 4, 1, 1, 2, 2);
        atzVarB.c("BY", 1, 1, 1, 2, 2, 2);
        atzVarB.c("BZ", 2, 2, 2, 2, 2, 2);
        atzVarB.c("CA", 0, 3, 1, 2, 4, 2);
        atzVarB.c("CD", 4, 2, 2, 1, 2, 2);
        atzVarB.c("CF", 4, 2, 3, 2, 2, 2);
        atzVarB.c("CG", 3, 4, 2, 2, 2, 2);
        atzVarB.c("CH", 0, 0, 0, 0, 1, 2);
        atzVarB.c("CI", 3, 3, 3, 3, 2, 2);
        atzVarB.c("CK", 2, 2, 3, 0, 2, 2);
        atzVarB.c("CL", 1, 1, 2, 2, 2, 2);
        atzVarB.c("CM", 3, 4, 3, 2, 2, 2);
        atzVarB.c("CN", 2, 2, 2, 1, 3, 2);
        atzVarB.c("CO", 2, 3, 4, 2, 2, 2);
        atzVarB.c("CR", 2, 3, 4, 4, 2, 2);
        atzVarB.c("CU", 4, 4, 2, 2, 2, 2);
        atzVarB.c("CV", 2, 3, 1, 0, 2, 2);
        atzVarB.c("CW", 1, 2, 0, 0, 2, 2);
        atzVarB.c("CY", 1, 1, 0, 0, 2, 2);
        atzVarB.c("CZ", 0, 1, 0, 0, 1, 2);
        atzVarB.c("DE", 0, 0, 1, 1, 0, 2);
        atzVarB.c("DJ", 4, 0, 4, 4, 2, 2);
        atzVarB.c("DK", 0, 0, 1, 0, 0, 2);
        atzVarB.c("DM", 1, 2, 2, 2, 2, 2);
        atzVarB.c("DO", 3, 4, 4, 4, 2, 2);
        atzVarB.c("DZ", 3, 3, 4, 4, 2, 4);
        atzVarB.c("EC", 2, 4, 3, 1, 2, 2);
        atzVarB.c("EE", 0, 1, 0, 0, 2, 2);
        atzVarB.c("EG", 3, 4, 3, 3, 2, 2);
        atzVarB.c("EH", 2, 2, 2, 2, 2, 2);
        atzVarB.c("ER", 4, 2, 2, 2, 2, 2);
        atzVarB.c("ES", 0, 1, 1, 1, 2, 2);
        atzVarB.c("ET", 4, 4, 4, 1, 2, 2);
        atzVarB.c("FI", 0, 0, 0, 0, 0, 2);
        atzVarB.c("FJ", 3, 0, 2, 3, 2, 2);
        atzVarB.c("FK", 4, 2, 2, 2, 2, 2);
        atzVarB.c("FM", 3, 2, 4, 4, 2, 2);
        atzVarB.c("FO", 1, 2, 0, 1, 2, 2);
        atzVarB.c("FR", 1, 1, 2, 0, 1, 2);
        atzVarB.c("GA", 3, 4, 1, 1, 2, 2);
        atzVarB.c("GB", 0, 0, 1, 1, 1, 2);
        atzVarB.c("GD", 1, 2, 2, 2, 2, 2);
        atzVarB.c("GE", 1, 1, 1, 2, 2, 2);
        atzVarB.c("GF", 2, 2, 2, 3, 2, 2);
        atzVarB.c("GG", 1, 2, 0, 0, 2, 2);
        atzVarB.c("GH", 3, 1, 3, 2, 2, 2);
        atzVarB.c("GI", 0, 2, 0, 0, 2, 2);
        atzVarB.c("GL", 1, 2, 0, 0, 2, 2);
        atzVarB.c("GM", 4, 3, 2, 4, 2, 2);
        atzVarB.c("GN", 4, 3, 4, 2, 2, 2);
        atzVarB.c("GP", 2, 1, 2, 3, 2, 2);
        atzVarB.c("GQ", 4, 2, 2, 4, 2, 2);
        atzVarB.c("GR", 1, 2, 0, 0, 2, 2);
        atzVarB.c("GT", 3, 2, 3, 1, 2, 2);
        atzVarB.c("GU", 1, 2, 3, 4, 2, 2);
        atzVarB.c("GW", 4, 4, 4, 4, 2, 2);
        atzVarB.c("GY", 3, 3, 3, 4, 2, 2);
        atzVarB.c("HK", 0, 1, 2, 3, 2, 0);
        atzVarB.c("HN", 3, 1, 3, 3, 2, 2);
        atzVarB.c("HR", 1, 1, 0, 0, 3, 2);
        atzVarB.c("HT", 4, 4, 4, 4, 2, 2);
        atzVarB.c("HU", 0, 0, 0, 0, 0, 2);
        atzVarB.c("ID", 3, 2, 3, 3, 2, 2);
        atzVarB.c("IE", 0, 0, 1, 1, 3, 2);
        atzVarB.c("IL", 1, 0, 2, 3, 4, 2);
        atzVarB.c("IM", 0, 2, 0, 1, 2, 2);
        atzVarB.c("IN", 2, 1, 3, 3, 2, 2);
        atzVarB.c("IO", 4, 2, 2, 4, 2, 2);
        atzVarB.c("IQ", 3, 3, 4, 4, 2, 2);
        atzVarB.c("IR", 3, 2, 3, 2, 2, 2);
        atzVarB.c("IS", 0, 2, 0, 0, 2, 2);
        atzVarB.c("IT", 0, 4, 0, 1, 2, 2);
        atzVarB.c("JE", 2, 2, 1, 2, 2, 2);
        atzVarB.c("JM", 3, 3, 4, 4, 2, 2);
        atzVarB.c("JO", 2, 2, 1, 1, 2, 2);
        atzVarB.c("JP", 0, 0, 0, 0, 2, 1);
        atzVarB.c("KE", 3, 4, 2, 2, 2, 2);
        atzVarB.c("KG", 2, 0, 1, 1, 2, 2);
        atzVarB.c("KH", 1, 0, 4, 3, 2, 2);
        atzVarB.c("KI", 4, 2, 4, 3, 2, 2);
        atzVarB.c("KM", 4, 3, 2, 3, 2, 2);
        atzVarB.c("KN", 1, 2, 2, 2, 2, 2);
        atzVarB.c("KP", 4, 2, 2, 2, 2, 2);
        atzVarB.c("KR", 0, 0, 1, 3, 1, 2);
        atzVarB.c("KW", 1, 3, 1, 1, 1, 2);
        atzVarB.c("KY", 1, 2, 0, 2, 2, 2);
        atzVarB.c("KZ", 2, 2, 2, 3, 2, 2);
        atzVarB.c("LA", 1, 2, 1, 1, 2, 2);
        atzVarB.c("LB", 3, 2, 0, 0, 2, 2);
        atzVarB.c("LC", 1, 2, 0, 0, 2, 2);
        atzVarB.c("LI", 0, 2, 2, 2, 2, 2);
        atzVarB.c("LK", 2, 0, 2, 3, 2, 2);
        atzVarB.c("LR", 3, 4, 4, 3, 2, 2);
        atzVarB.c("LS", 3, 3, 2, 3, 2, 2);
        atzVarB.c("LT", 0, 0, 0, 0, 2, 2);
        atzVarB.c("LU", 1, 0, 1, 1, 2, 2);
        atzVarB.c("LV", 0, 0, 0, 0, 2, 2);
        atzVarB.c("LY", 4, 2, 4, 3, 2, 2);
        atzVarB.c("MA", 3, 2, 2, 1, 2, 2);
        atzVarB.c("MC", 0, 2, 0, 0, 2, 2);
        atzVarB.c("MD", 1, 2, 0, 0, 2, 2);
        atzVarB.c("ME", 1, 2, 0, 1, 2, 2);
        atzVarB.c("MF", 2, 2, 1, 1, 2, 2);
        atzVarB.c("MG", 3, 4, 2, 2, 2, 2);
        atzVarB.c("MH", 4, 2, 2, 4, 2, 2);
        atzVarB.c("MK", 1, 1, 0, 0, 2, 2);
        atzVarB.c("ML", 4, 4, 2, 2, 2, 2);
        atzVarB.c("MM", 2, 3, 3, 3, 2, 2);
        atzVarB.c("MN", 2, 4, 2, 2, 2, 2);
        atzVarB.c("MO", 0, 2, 4, 4, 2, 2);
        atzVarB.c("MP", 0, 2, 2, 2, 2, 2);
        atzVarB.c("MQ", 2, 2, 2, 3, 2, 2);
        atzVarB.c("MR", 3, 0, 4, 3, 2, 2);
        atzVarB.c("MS", 1, 2, 2, 2, 2, 2);
        atzVarB.c("MT", 0, 2, 0, 0, 2, 2);
        atzVarB.c("MU", 2, 1, 1, 2, 2, 2);
        atzVarB.c("MV", 4, 3, 2, 4, 2, 2);
        atzVarB.c("MW", 4, 2, 1, 0, 2, 2);
        atzVarB.c("MX", 2, 4, 4, 4, 4, 2);
        atzVarB.c("MY", 1, 0, 3, 2, 2, 2);
        atzVarB.c("MZ", 3, 3, 2, 1, 2, 2);
        atzVarB.c("NA", 4, 3, 3, 2, 2, 2);
        atzVarB.c("NC", 3, 0, 4, 4, 2, 2);
        atzVarB.c("NE", 4, 4, 4, 4, 2, 2);
        atzVarB.c("NF", 2, 2, 2, 2, 2, 2);
        atzVarB.c("NG", 3, 3, 2, 3, 2, 2);
        atzVarB.c("NI", 2, 1, 4, 4, 2, 2);
        atzVarB.c("NL", 0, 2, 3, 2, 0, 2);
        atzVarB.c("NO", 0, 1, 2, 0, 0, 2);
        atzVarB.c("NP", 2, 0, 4, 2, 2, 2);
        atzVarB.c("NR", 3, 2, 3, 1, 2, 2);
        atzVarB.c("NU", 4, 2, 2, 2, 2, 2);
        atzVarB.c("NZ", 0, 2, 1, 2, 4, 2);
        atzVarB.c("OM", 2, 2, 1, 3, 3, 2);
        atzVarB.c("PA", 1, 3, 3, 3, 2, 2);
        atzVarB.c("PE", 2, 3, 4, 4, 2, 2);
        atzVarB.c("PF", 2, 2, 2, 1, 2, 2);
        atzVarB.c("PG", 4, 4, 3, 2, 2, 2);
        atzVarB.c("PH", 2, 1, 3, 3, 3, 2);
        atzVarB.c("PK", 3, 2, 3, 3, 2, 2);
        atzVarB.c("PL", 1, 0, 1, 2, 3, 2);
        atzVarB.c("PM", 0, 2, 2, 2, 2, 2);
        atzVarB.c("PR", 2, 1, 2, 2, 4, 3);
        atzVarB.c("PS", 3, 3, 2, 2, 2, 2);
        atzVarB.c("PT", 0, 1, 1, 0, 2, 2);
        atzVarB.c("PW", 1, 2, 4, 1, 2, 2);
        atzVarB.c("PY", 2, 0, 3, 2, 2, 2);
        atzVarB.c("QA", 2, 3, 1, 2, 3, 2);
        atzVarB.c("RE", 1, 0, 2, 2, 2, 2);
        atzVarB.c("RO", 0, 1, 0, 1, 0, 2);
        atzVarB.c("RS", 1, 2, 0, 0, 2, 2);
        atzVarB.c("RU", 0, 1, 0, 1, 4, 2);
        atzVarB.c("RW", 3, 3, 3, 1, 2, 2);
        atzVarB.c("SA", 2, 2, 2, 1, 1, 2);
        atzVarB.c("SB", 4, 2, 3, 2, 2, 2);
        atzVarB.c("SC", 4, 2, 1, 3, 2, 2);
        atzVarB.c("SD", 4, 4, 4, 4, 2, 2);
        atzVarB.c("SE", 0, 0, 0, 0, 0, 2);
        atzVarB.c("SG", 1, 0, 1, 2, 3, 2);
        atzVarB.c("SH", 4, 2, 2, 2, 2, 2);
        atzVarB.c("SI", 0, 0, 0, 0, 2, 2);
        atzVarB.c("SJ", 2, 2, 2, 2, 2, 2);
        atzVarB.c("SK", 0, 1, 0, 0, 2, 2);
        atzVarB.c("SL", 4, 3, 4, 0, 2, 2);
        atzVarB.c("SM", 0, 2, 2, 2, 2, 2);
        atzVarB.c("SN", 4, 4, 4, 4, 2, 2);
        atzVarB.c("SO", 3, 3, 3, 4, 2, 2);
        atzVarB.c("SR", 3, 2, 2, 2, 2, 2);
        atzVarB.c("SS", 4, 4, 3, 3, 2, 2);
        atzVarB.c("ST", 2, 2, 1, 2, 2, 2);
        atzVarB.c("SV", 2, 1, 4, 3, 2, 2);
        atzVarB.c("SX", 2, 2, 1, 0, 2, 2);
        atzVarB.c("SY", 4, 3, 3, 2, 2, 2);
        atzVarB.c("SZ", 3, 3, 2, 4, 2, 2);
        atzVarB.c("TC", 2, 2, 2, 0, 2, 2);
        atzVarB.c("TD", 4, 3, 4, 4, 2, 2);
        atzVarB.c("TG", 3, 2, 2, 4, 2, 2);
        atzVarB.c("TH", 0, 3, 2, 3, 2, 2);
        atzVarB.c("TJ", 4, 4, 4, 4, 2, 2);
        atzVarB.c("TL", 4, 0, 4, 4, 2, 2);
        atzVarB.c("TM", 4, 2, 4, 3, 2, 2);
        atzVarB.c("TN", 2, 1, 1, 2, 2, 2);
        atzVarB.c("TO", 3, 3, 4, 3, 2, 2);
        atzVarB.c("TR", 1, 2, 1, 1, 2, 2);
        atzVarB.c("TT", 1, 4, 0, 1, 2, 2);
        atzVarB.c("TV", 3, 2, 2, 4, 2, 2);
        atzVarB.c("TW", 0, 0, 0, 0, 1, 0);
        atzVarB.c("TZ", 3, 3, 3, 2, 2, 2);
        atzVarB.c("UA", 0, 3, 1, 1, 2, 2);
        atzVarB.c("UG", 3, 2, 3, 3, 2, 2);
        atzVarB.c("US", 1, 1, 2, 2, 4, 2);
        atzVarB.c("UY", 2, 2, 1, 1, 2, 2);
        atzVarB.c("UZ", 2, 1, 3, 4, 2, 2);
        atzVarB.c("VC", 1, 2, 2, 2, 2, 2);
        atzVarB.c("VE", 4, 4, 4, 4, 2, 2);
        atzVarB.c("VG", 2, 2, 1, 1, 2, 2);
        atzVarB.c("VI", 1, 2, 1, 2, 2, 2);
        atzVarB.c("VN", 0, 1, 3, 4, 2, 2);
        atzVarB.c("VU", 4, 0, 3, 1, 2, 2);
        atzVarB.c("WF", 4, 2, 2, 4, 2, 2);
        atzVarB.c("WS", 3, 1, 3, 1, 2, 2);
        atzVarB.c("XK", 0, 1, 1, 0, 2, 2);
        atzVarB.c("YE", 4, 4, 4, 3, 2, 2);
        atzVarB.c("YT", 4, 2, 2, 3, 2, 2);
        atzVarB.c("ZA", 3, 3, 2, 1, 2, 2);
        atzVarB.c("ZM", 3, 2, 3, 3, 2, 2);
        atzVarB.c("ZW", 3, 2, 4, 3, 2, 2);
        return atzVarB.a();
    }

    private final void l(int i2, long j2, long j3) {
        int i3;
        if (i2 != 0) {
            i3 = i2;
        } else if (j2 == 0 && j3 == this.u) {
            return;
        } else {
            i3 = 0;
        }
        this.u = j3;
        this.f19920j.b(i3, j2, j3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void m(int i2) {
        int i3 = this.q;
        if (i3 == 0 || this.f19923m) {
            if (i3 == i2) {
                return;
            }
            this.q = i2;
            if (i2 != 1 && i2 != 0 && i2 != 8) {
                this.t = j(i2);
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                l(this.f19924n > 0 ? (int) (jElapsedRealtime - this.f19925o) : 0, this.p, this.t);
                this.f19925o = jElapsedRealtime;
                this.p = 0L;
                this.s = 0L;
                this.r = 0L;
                this.f19921k.b();
            }
        }
    }

    private static boolean n(ajl ajlVar, boolean z) {
        return z && !ajlVar.c(8);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aja
    public final synchronized long a() {
        return this.t;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aja
    public final void b(Handler handler, aiz aizVar) {
        this.f19920j.a(handler, aizVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aja
    public final void c(aiz aizVar) {
        this.f19920j.c(aizVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.akq
    public final synchronized void f(ajl ajlVar, boolean z, int i2) {
        if (n(ajlVar, z)) {
            this.p += (long) i2;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.akq
    public final synchronized void g(ajl ajlVar, boolean z) {
        if (n(ajlVar, z)) {
            ajr.f(this.f19924n > 0);
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            int i2 = (int) (jElapsedRealtime - this.f19925o);
            this.r += (long) i2;
            long j2 = this.s;
            long j3 = this.p;
            this.s = j2 + j3;
            if (i2 > 0) {
                this.f19921k.a((int) Math.sqrt(j3), (j3 * 8000.0f) / i2);
                if (this.r >= 2000 || this.s >= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) {
                    this.t = (long) this.f19921k.c();
                }
                l(i2, this.p, this.t);
                this.f19925o = jElapsedRealtime;
                this.p = 0L;
            }
            this.f19924n--;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.akq
    public final void h() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.akq
    public final synchronized void i(ajl ajlVar, boolean z) {
        if (n(ajlVar, z)) {
            if (this.f19924n == 0) {
                this.f19925o = SystemClock.elapsedRealtime();
            }
            this.f19924n++;
        }
    }
}
