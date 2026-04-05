package c.f.a.c.j.c;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class rc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class<?> f13061a = K();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final hd<?, ?> f13062b = U(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final hd<?, ?> f13063c = U(true);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final hd<?, ?> f13064d = new jd();

    public static void A(int i2, List<Integer> list, ce ceVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ceVar.u(i2, list, z);
    }

    public static int B(List<Integer> list) {
        int iW;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof qa) {
            qa qaVar = (qa) list;
            iW = 0;
            while (i2 < size) {
                iW += z9.w(qaVar.e(i2));
                i2++;
            }
        } else {
            iW = 0;
            while (i2 < size) {
                iW += z9.w(list.get(i2).intValue());
                i2++;
            }
        }
        return iW;
    }

    public static void C(int i2, List<Integer> list, ce ceVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ceVar.H(i2, list, z);
    }

    public static int D(List<Integer> list) {
        int iX;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof qa) {
            qa qaVar = (qa) list;
            iX = 0;
            while (i2 < size) {
                iX += z9.x(qaVar.e(i2));
                i2++;
            }
        } else {
            iX = 0;
            while (i2 < size) {
                iX += z9.x(list.get(i2).intValue());
                i2++;
            }
        }
        return iX;
    }

    public static void E(int i2, List<Integer> list, ce ceVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ceVar.r(i2, list, z);
    }

    public static int F(List<Integer> list) {
        int iY;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof qa) {
            qa qaVar = (qa) list;
            iY = 0;
            while (i2 < size) {
                iY += z9.y(qaVar.e(i2));
                i2++;
            }
        } else {
            iY = 0;
            while (i2 < size) {
                iY += z9.y(list.get(i2).intValue());
                i2++;
            }
        }
        return iY;
    }

    public static void G(int i2, List<Integer> list, ce ceVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ceVar.v(i2, list, z);
    }

    public static hd<?, ?> H() {
        return f13062b;
    }

    public static hd<?, ?> I() {
        return f13063c;
    }

    public static hd<?, ?> J() {
        return f13064d;
    }

    public static Class<?> K() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Class<?> L() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int M(List<?> list) {
        return list.size() << 2;
    }

    public static void N(int i2, List<Integer> list, ce ceVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ceVar.h(i2, list, z);
    }

    public static int O(List<?> list) {
        return list.size() << 3;
    }

    public static void P(int i2, List<Boolean> list, ce ceVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ceVar.b(i2, list, z);
    }

    public static int Q(int i2, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return s(list) + (list.size() * z9.u(i2));
    }

    public static int R(List<?> list) {
        return list.size();
    }

    public static int S(int i2, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return v(list) + (size * z9.u(i2));
    }

    public static int T(int i2, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return x(list) + (size * z9.u(i2));
    }

    public static hd<?, ?> U(boolean z) {
        try {
            Class<?> clsL = L();
            if (clsL == null) {
                return null;
            }
            return (hd) clsL.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int V(int i2, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z(list) + (size * z9.u(i2));
    }

    public static int W(int i2, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return B(list) + (size * z9.u(i2));
    }

    public static int X(int i2, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return D(list) + (size * z9.u(i2));
    }

    public static int Y(int i2, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return F(list) + (size * z9.u(i2));
    }

    public static int Z(int i2, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * z9.t0(i2, 0);
    }

    public static void a(int i2, List<String> list, ce ceVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ceVar.O(i2, list);
    }

    public static int a0(int i2, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * z9.f0(i2, 0L);
    }

    public static void b(int i2, List<?> list, ce ceVar, pc pcVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ceVar.K(i2, list, pcVar);
    }

    public static int b0(int i2, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * z9.S(i2, true);
    }

    public static void c(int i2, List<Double> list, ce ceVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ceVar.I(i2, list, z);
    }

    public static <T, FT extends ka<FT>> void d(da<FT> daVar, T t, T t2) {
        ia<T> iaVarC = daVar.c(t2);
        if (iaVarC.f12878b.isEmpty()) {
            return;
        }
        daVar.e(t).g(iaVarC);
    }

    public static <T> void e(ub ubVar, T t, T t2, long j2) {
        nd.g(t, j2, ubVar.c(nd.G(t, j2), nd.G(t2, j2)));
    }

    public static <T, UT, UB> void f(hd<UT, UB> hdVar, T t, T t2) {
        hdVar.c(t, hdVar.d(hdVar.g(t), hdVar.g(t2)));
    }

    public static void g(int i2, List<m9> list, ce ceVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ceVar.J(i2, list);
    }

    public static void h(int i2, List<?> list, ce ceVar, pc pcVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ceVar.N(i2, list, pcVar);
    }

    public static void i(int i2, List<Float> list, ce ceVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ceVar.M(i2, list, z);
    }

    public static int j(int i2, Object obj, pc pcVar) {
        return obj instanceof fb ? z9.c(i2, (fb) obj) : z9.H(i2, (bc) obj, pcVar);
    }

    public static int k(int i2, List<?> list) {
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        int iU = z9.u(i2) * size;
        if (list instanceof hb) {
            hb hbVar = (hb) list;
            while (i3 < size) {
                Object objG = hbVar.G(i3);
                iU += objG instanceof m9 ? z9.I((m9) objG) : z9.v((String) objG);
                i3++;
            }
        } else {
            while (i3 < size) {
                Object obj = list.get(i3);
                iU += obj instanceof m9 ? z9.I((m9) obj) : z9.v((String) obj);
                i3++;
            }
        }
        return iU;
    }

    public static int l(int i2, List<?> list, pc pcVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iU = z9.u(i2) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            iU += obj instanceof fb ? z9.d((fb) obj) : z9.e((bc) obj, pcVar);
        }
        return iU;
    }

    public static void m(int i2, List<Long> list, ce ceVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ceVar.l(i2, list, z);
    }

    public static int n(int i2, List<m9> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iU = size * z9.u(i2);
        for (int i3 = 0; i3 < list.size(); i3++) {
            iU += z9.I(list.get(i3));
        }
        return iU;
    }

    public static int o(int i2, List<bc> list, pc pcVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iR = 0;
        for (int i3 = 0; i3 < size; i3++) {
            iR += z9.R(i2, list.get(i3), pcVar);
        }
        return iR;
    }

    public static void p(int i2, List<Long> list, ce ceVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ceVar.E(i2, list, z);
    }

    public static void q(int i2, List<Long> list, ce ceVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ceVar.C(i2, list, z);
    }

    public static boolean r(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int s(List<Long> list) {
        int iX0;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof pb) {
            pb pbVar = (pb) list;
            iX0 = 0;
            while (i2 < size) {
                iX0 += z9.x0(pbVar.e(i2));
                i2++;
            }
        } else {
            iX0 = 0;
            while (i2 < size) {
                iX0 += z9.x0(list.get(i2).longValue());
                i2++;
            }
        }
        return iX0;
    }

    public static void t(int i2, List<Long> list, ce ceVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ceVar.A(i2, list, z);
    }

    public static void u(Class<?> cls) {
        Class<?> cls2;
        if (!oa.class.isAssignableFrom(cls) && (cls2 = f13061a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static int v(List<Long> list) {
        int iA0;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof pb) {
            pb pbVar = (pb) list;
            iA0 = 0;
            while (i2 < size) {
                iA0 += z9.A0(pbVar.e(i2));
                i2++;
            }
        } else {
            iA0 = 0;
            while (i2 < size) {
                iA0 += z9.A0(list.get(i2).longValue());
                i2++;
            }
        }
        return iA0;
    }

    public static void w(int i2, List<Long> list, ce ceVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ceVar.p(i2, list, z);
    }

    public static int x(List<Long> list) {
        int iB0;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof pb) {
            pb pbVar = (pb) list;
            iB0 = 0;
            while (i2 < size) {
                iB0 += z9.B0(pbVar.e(i2));
                i2++;
            }
        } else {
            iB0 = 0;
            while (i2 < size) {
                iB0 += z9.B0(list.get(i2).longValue());
                i2++;
            }
        }
        return iB0;
    }

    public static void y(int i2, List<Integer> list, ce ceVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ceVar.f(i2, list, z);
    }

    public static int z(List<Integer> list) {
        int iB;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof qa) {
            qa qaVar = (qa) list;
            iB = 0;
            while (i2 < size) {
                iB += z9.B(qaVar.e(i2));
                i2++;
            }
        } else {
            iB = 0;
            while (i2 < size) {
                iB += z9.B(list.get(i2).intValue());
                i2++;
            }
        }
        return iB;
    }
}
