package c.f.a.c.j.h;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class e8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class<?> f13304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q8<?, ?> f13305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q8<?, ?> f13306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final q8<?, ?> f13307d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f13304a = cls;
        f13305b = C(false);
        f13306c = C(true);
        f13307d = new s8();
    }

    public static void A(Class<?> cls) {
        Class<?> cls2;
        if (!l6.class.isAssignableFrom(cls) && (cls2 = f13304a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void B(int i2, List<?> list, u5 u5Var, c8 c8Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            u5Var.D(i2, list.get(i3), c8Var);
        }
    }

    public static q8<?, ?> C(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (q8) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static int D(List<Long> list) {
        int iD;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof f7) {
            f7 f7Var = (f7) list;
            iD = 0;
            while (i2 < size) {
                iD += t5.D(f7Var.w(i2));
                i2++;
            }
        } else {
            iD = 0;
            while (i2 < size) {
                iD += t5.D(list.get(i2).longValue());
                i2++;
            }
        }
        return iD;
    }

    public static int E(int i2, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return D(list) + (list.size() * t5.A(i2));
    }

    public static int F(List<Long> list) {
        int iD;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof f7) {
            f7 f7Var = (f7) list;
            iD = 0;
            while (i2 < size) {
                iD += t5.D(f7Var.w(i2));
                i2++;
            }
        } else {
            iD = 0;
            while (i2 < size) {
                iD += t5.D(list.get(i2).longValue());
                i2++;
            }
        }
        return iD;
    }

    public static int G(int i2, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return F(list) + (size * t5.A(i2));
    }

    public static int H(List<Long> list) {
        int iD;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof f7) {
            f7 f7Var = (f7) list;
            iD = 0;
            while (i2 < size) {
                iD += t5.D(t5.d(f7Var.w(i2)));
                i2++;
            }
        } else {
            iD = 0;
            while (i2 < size) {
                iD += t5.D(t5.d(list.get(i2).longValue()));
                i2++;
            }
        }
        return iD;
    }

    public static int I(int i2, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return H(list) + (size * t5.A(i2));
    }

    public static int J(List<Integer> list) {
        int iB;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof m6) {
            m6 m6Var = (m6) list;
            iB = 0;
            while (i2 < size) {
                iB += t5.B(m6Var.g(i2));
                i2++;
            }
        } else {
            iB = 0;
            while (i2 < size) {
                iB += t5.B(list.get(i2).intValue());
                i2++;
            }
        }
        return iB;
    }

    public static int K(int i2, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return J(list) + (size * t5.A(i2));
    }

    public static int L(List<Integer> list) {
        int iB;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof m6) {
            m6 m6Var = (m6) list;
            iB = 0;
            while (i2 < size) {
                iB += t5.B(m6Var.g(i2));
                i2++;
            }
        } else {
            iB = 0;
            while (i2 < size) {
                iB += t5.B(list.get(i2).intValue());
                i2++;
            }
        }
        return iB;
    }

    public static int M(int i2, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return L(list) + (size * t5.A(i2));
    }

    public static int N(List<Integer> list) {
        int iC;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof m6) {
            m6 m6Var = (m6) list;
            iC = 0;
            while (i2 < size) {
                iC += t5.C(m6Var.g(i2));
                i2++;
            }
        } else {
            iC = 0;
            while (i2 < size) {
                iC += t5.C(list.get(i2).intValue());
                i2++;
            }
        }
        return iC;
    }

    public static int O(int i2, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return N(list) + (size * t5.A(i2));
    }

    public static int P(List<Integer> list) {
        int iC;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof m6) {
            m6 m6Var = (m6) list;
            iC = 0;
            while (i2 < size) {
                iC += t5.C(t5.c(m6Var.g(i2)));
                i2++;
            }
        } else {
            iC = 0;
            while (i2 < size) {
                iC += t5.C(t5.c(list.get(i2).intValue()));
                i2++;
            }
        }
        return iC;
    }

    public static int Q(int i2, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return P(list) + (size * t5.A(i2));
    }

    public static int R(List<?> list) {
        return list.size() * 4;
    }

    public static int S(int i2, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (t5.A(i2) + 4);
    }

    public static int T(List<?> list) {
        return list.size() * 8;
    }

    public static int U(int i2, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (t5.A(i2) + 8);
    }

    public static int V(List<?> list) {
        return list.size();
    }

    public static int W(int i2, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (t5.A(i2) + 1);
    }

    public static int X(int i2, List<?> list) {
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        int iA = t5.A(i2) * size;
        if (list instanceof a7) {
            a7 a7Var = (a7) list;
            while (i3 < size) {
                Object objP = a7Var.p(i3);
                iA += objP instanceof l5 ? t5.a((l5) objP) : t5.E((String) objP);
                i3++;
            }
        } else {
            while (i3 < size) {
                Object obj = list.get(i3);
                iA += obj instanceof l5 ? t5.a((l5) obj) : t5.E((String) obj);
                i3++;
            }
        }
        return iA;
    }

    public static int Y(int i2, Object obj, c8 c8Var) {
        if (!(obj instanceof y6)) {
            return t5.A(i2) + t5.b((q7) obj, c8Var);
        }
        int iA = t5.A(i2);
        int iA2 = ((y6) obj).a();
        return iA + t5.C(iA2) + iA2;
    }

    public static int Z(int i2, List<?> list, c8 c8Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iA = t5.A(i2) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            iA += obj instanceof y6 ? t5.F((y6) obj) : t5.b((q7) obj, c8Var);
        }
        return iA;
    }

    public static q8<?, ?> a() {
        return f13305b;
    }

    public static int a0(int i2, List<l5> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iA = size * t5.A(i2);
        for (int i3 = 0; i3 < list.size(); i3++) {
            iA += t5.a(list.get(i3));
        }
        return iA;
    }

    public static q8<?, ?> b() {
        return f13306c;
    }

    public static int b0(int i2, List<q7> list, c8 c8Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iG = 0;
        for (int i3 = 0; i3 < size; i3++) {
            iG += t5.g(i2, list.get(i3), c8Var);
        }
        return iG;
    }

    public static q8<?, ?> c() {
        return f13307d;
    }

    public static boolean d(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static <T, FT extends c6<FT>> void e(z5<FT> z5Var, T t, T t2) {
        z5Var.b(t2);
        throw null;
    }

    public static <T, UT, UB> void f(q8<UT, UB> q8Var, T t, T t2) {
        q8Var.c(t, q8Var.f(q8Var.d(t), q8Var.d(t2)));
    }

    public static <UT, UB> UB g(int i2, List<Integer> list, p6 p6Var, UB ub, q8<UT, UB> q8Var) {
        if (p6Var == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                int iIntValue = list.get(i4).intValue();
                if (p6Var.a(iIntValue)) {
                    if (i4 != i3) {
                        list.set(i3, Integer.valueOf(iIntValue));
                    }
                    i3++;
                } else {
                    ub = (UB) h(i2, iIntValue, ub, q8Var);
                }
            }
            if (i3 != size) {
                list.subList(i3, size).clear();
                return ub;
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = it.next().intValue();
                if (!p6Var.a(iIntValue2)) {
                    ub = (UB) h(i2, iIntValue2, ub, q8Var);
                    it.remove();
                }
            }
        }
        return ub;
    }

    public static <UT, UB> UB h(int i2, int i3, UB ub, q8<UT, UB> q8Var) {
        if (ub == null) {
            ub = q8Var.b();
        }
        q8Var.a(ub, i2, i3);
        return ub;
    }

    public static <T> void i(l7 l7Var, T t, T t2, long j2) {
        c9.z(t, j2, l7.b(c9.y(t, j2), c9.y(t2, j2)));
    }

    public static void j(int i2, List<Double> list, u5 u5Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        u5Var.b(i2, list, z);
    }

    public static void k(int i2, List<Float> list, u5 u5Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        u5Var.a(i2, list, z);
    }

    public static void l(int i2, List<Long> list, u5 u5Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        u5Var.I(i2, list, z);
    }

    public static void m(int i2, List<Long> list, u5 u5Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        u5Var.J(i2, list, z);
    }

    public static void n(int i2, List<Long> list, u5 u5Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        u5Var.k(i2, list, z);
    }

    public static void o(int i2, List<Long> list, u5 u5Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        u5Var.K(i2, list, z);
    }

    public static void p(int i2, List<Long> list, u5 u5Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        u5Var.i(i2, list, z);
    }

    public static void q(int i2, List<Integer> list, u5 u5Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        u5Var.G(i2, list, z);
    }

    public static void r(int i2, List<Integer> list, u5 u5Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        u5Var.g(i2, list, z);
    }

    public static void s(int i2, List<Integer> list, u5 u5Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        u5Var.j(i2, list, z);
    }

    public static void t(int i2, List<Integer> list, u5 u5Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        u5Var.H(i2, list, z);
    }

    public static void u(int i2, List<Integer> list, u5 u5Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        u5Var.h(i2, list, z);
    }

    public static void v(int i2, List<Integer> list, u5 u5Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        u5Var.c(i2, list, z);
    }

    public static void w(int i2, List<Boolean> list, u5 u5Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        u5Var.d(i2, list, z);
    }

    public static void x(int i2, List<String> list, u5 u5Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        u5Var.e(i2, list);
    }

    public static void y(int i2, List<l5> list, u5 u5Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        u5Var.f(i2, list);
    }

    public static void z(int i2, List<?> list, u5 u5Var, c8 c8Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            u5Var.C(i2, list.get(i3), c8Var);
        }
    }
}
