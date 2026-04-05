package com.google.ads.interactivemedia.v3.internal;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class su extends sw {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f23009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long[] f23010c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long[] f23011d;

    public su() {
        super(new ri());
        this.f23009b = -9223372036854775807L;
        this.f23010c = new long[0];
        this.f23011d = new long[0];
    }

    private static Double g(alx alxVar) {
        return Double.valueOf(Double.longBitsToDouble(alxVar.r()));
    }

    private static Object h(alx alxVar, int i2) {
        if (i2 == 0) {
            return g(alxVar);
        }
        if (i2 == 1) {
            return Boolean.valueOf(alxVar.k() == 1);
        }
        if (i2 == 2) {
            return i(alxVar);
        }
        if (i2 != 3) {
            if (i2 == 8) {
                return j(alxVar);
            }
            if (i2 != 10) {
                if (i2 != 11) {
                    return null;
                }
                Date date = new Date((long) g(alxVar).doubleValue());
                alxVar.J(2);
                return date;
            }
            int iN = alxVar.n();
            ArrayList arrayList = new ArrayList(iN);
            for (int i3 = 0; i3 < iN; i3++) {
                Object objH = h(alxVar, alxVar.k());
                if (objH != null) {
                    arrayList.add(objH);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strI = i(alxVar);
            int iK = alxVar.k();
            if (iK == 9) {
                return map;
            }
            Object objH2 = h(alxVar, iK);
            if (objH2 != null) {
                map.put(strI, objH2);
            }
        }
    }

    private static String i(alx alxVar) {
        int iO = alxVar.o();
        int iC = alxVar.c();
        alxVar.J(iO);
        return new String(alxVar.K(), iC, iO);
    }

    private static HashMap<String, Object> j(alx alxVar) {
        int iN = alxVar.n();
        HashMap<String, Object> map = new HashMap<>(iN);
        for (int i2 = 0; i2 < iN; i2++) {
            String strI = i(alxVar);
            Object objH = h(alxVar, alxVar.k());
            if (objH != null) {
                map.put(strI, objH);
            }
        }
        return map;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.sw
    public final boolean a(alx alxVar) {
        return true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.sw
    public final boolean b(alx alxVar, long j2) {
        if (alxVar.k() != 2 || !"onMetaData".equals(i(alxVar)) || alxVar.k() != 8) {
            return false;
        }
        HashMap<String, Object> mapJ = j(alxVar);
        Object obj = mapJ.get("duration");
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (dDoubleValue > 0.0d) {
                this.f23009b = (long) (dDoubleValue * 1000000.0d);
            }
        }
        Object obj2 = mapJ.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f23010c = new long[size];
                this.f23011d = new long[size];
                for (int i2 = 0; i2 < size; i2++) {
                    Object obj5 = list.get(i2);
                    Object obj6 = list2.get(i2);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.f23010c = new long[0];
                        this.f23011d = new long[0];
                        break;
                    }
                    this.f23010c[i2] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                    this.f23011d[i2] = ((Double) obj5).longValue();
                }
            }
        }
        return false;
    }

    public final long c() {
        return this.f23009b;
    }

    public final long[] d() {
        return this.f23011d;
    }

    public final long[] e() {
        return this.f23010c;
    }
}
