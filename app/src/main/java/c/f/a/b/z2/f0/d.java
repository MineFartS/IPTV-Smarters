package c.f.a.b.z2.f0;

import c.f.a.b.j3.i0;
import c.f.a.b.z2.i;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f10747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long[] f10748c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long[] f10749d;

    public d() {
        super(new i());
        this.f10747b = -9223372036854775807L;
        this.f10748c = new long[0];
        this.f10749d = new long[0];
    }

    public static Boolean g(i0 i0Var) {
        return Boolean.valueOf(i0Var.D() == 1);
    }

    public static Object h(i0 i0Var, int i2) {
        if (i2 == 0) {
            return j(i0Var);
        }
        if (i2 == 1) {
            return g(i0Var);
        }
        if (i2 == 2) {
            return n(i0Var);
        }
        if (i2 == 3) {
            return l(i0Var);
        }
        if (i2 == 8) {
            return k(i0Var);
        }
        if (i2 == 10) {
            return m(i0Var);
        }
        if (i2 != 11) {
            return null;
        }
        return i(i0Var);
    }

    public static Date i(i0 i0Var) {
        Date date = new Date((long) j(i0Var).doubleValue());
        i0Var.Q(2);
        return date;
    }

    public static Double j(i0 i0Var) {
        return Double.valueOf(Double.longBitsToDouble(i0Var.w()));
    }

    public static HashMap<String, Object> k(i0 i0Var) {
        int iH = i0Var.H();
        HashMap<String, Object> map = new HashMap<>(iH);
        for (int i2 = 0; i2 < iH; i2++) {
            String strN = n(i0Var);
            Object objH = h(i0Var, o(i0Var));
            if (objH != null) {
                map.put(strN, objH);
            }
        }
        return map;
    }

    public static HashMap<String, Object> l(i0 i0Var) {
        HashMap<String, Object> map = new HashMap<>();
        while (true) {
            String strN = n(i0Var);
            int iO = o(i0Var);
            if (iO == 9) {
                return map;
            }
            Object objH = h(i0Var, iO);
            if (objH != null) {
                map.put(strN, objH);
            }
        }
    }

    public static ArrayList<Object> m(i0 i0Var) {
        int iH = i0Var.H();
        ArrayList<Object> arrayList = new ArrayList<>(iH);
        for (int i2 = 0; i2 < iH; i2++) {
            Object objH = h(i0Var, o(i0Var));
            if (objH != null) {
                arrayList.add(objH);
            }
        }
        return arrayList;
    }

    public static String n(i0 i0Var) {
        int iJ = i0Var.J();
        int iE = i0Var.e();
        i0Var.Q(iJ);
        return new String(i0Var.d(), iE, iJ);
    }

    public static int o(i0 i0Var) {
        return i0Var.D();
    }

    @Override // c.f.a.b.z2.f0.e
    public boolean b(i0 i0Var) {
        return true;
    }

    @Override // c.f.a.b.z2.f0.e
    public boolean c(i0 i0Var, long j2) {
        if (o(i0Var) != 2 || !"onMetaData".equals(n(i0Var)) || o(i0Var) != 8) {
            return false;
        }
        HashMap<String, Object> mapK = k(i0Var);
        Object obj = mapK.get("duration");
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (dDoubleValue > 0.0d) {
                this.f10747b = (long) (dDoubleValue * 1000000.0d);
            }
        }
        Object obj2 = mapK.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f10748c = new long[size];
                this.f10749d = new long[size];
                for (int i2 = 0; i2 < size; i2++) {
                    Object obj5 = list.get(i2);
                    Object obj6 = list2.get(i2);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.f10748c = new long[0];
                        this.f10749d = new long[0];
                        break;
                    }
                    this.f10748c[i2] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                    this.f10749d[i2] = ((Double) obj5).longValue();
                }
            }
        }
        return false;
    }

    public long d() {
        return this.f10747b;
    }

    public long[] e() {
        return this.f10749d;
    }

    public long[] f() {
        return this.f10748c;
    }
}
