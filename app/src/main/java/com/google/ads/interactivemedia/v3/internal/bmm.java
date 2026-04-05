package com.google.ads.interactivemedia.v3.internal;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class bmm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Class<?> f21412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final bni f21413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final bni f21414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final bni f21415d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f21412a = cls;
        f21413b = ab(false);
        f21414c = ab(true);
        f21415d = new bni(null);
    }

    public static void A(int i2, List<?> list, bnq bnqVar, bmk bmkVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            ((bkj) bnqVar).w(i2, list.get(i3), bmkVar);
        }
    }

    public static void B(int i2, List<Integer> list, bnq bnqVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        bnqVar.y(i2, list, z);
    }

    public static void C(int i2, List<Long> list, bnq bnqVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        bnqVar.A(i2, list, z);
    }

    public static void D(int i2, List<Integer> list, bnq bnqVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        bnqVar.C(i2, list, z);
    }

    public static void E(int i2, List<Long> list, bnq bnqVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        bnqVar.E(i2, list, z);
    }

    public static void F(int i2, List<String> list, bnq bnqVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        bnqVar.H(i2, list);
    }

    public static void G(int i2, List<Integer> list, bnq bnqVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        bnqVar.J(i2, list, z);
    }

    public static void H(int i2, List<Long> list, bnq bnqVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        bnqVar.L(i2, list, z);
    }

    public static boolean I(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int J(int i2, List<?> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * bki.an(i2);
    }

    public static int K(int i2, List<Integer> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return c(list) + (size * bki.D(i2));
    }

    public static int L(int i2, List<?> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * bki.ap(i2);
    }

    public static int M(int i2, List<?> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * bki.aq(i2);
    }

    public static int N(int i2, List<Integer> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return g(list) + (size * bki.D(i2));
    }

    public static int O(int i2, List<Long> list) {
        if (list.size() == 0) {
            return 0;
        }
        return h(list) + (list.size() * bki.D(i2));
    }

    public static int P(int i2, List<Integer> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return k(list) + (size * bki.D(i2));
    }

    public static int Q(int i2, List<Long> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return l(list) + (size * bki.D(i2));
    }

    public static int R(int i2, List<Integer> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return n(list) + (size * bki.D(i2));
    }

    public static int S(int i2, List<Long> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return o(list) + (size * bki.D(i2));
    }

    public static bni T() {
        return f21413b;
    }

    public static bni U() {
        return f21414c;
    }

    public static bni V() {
        return f21415d;
    }

    public static <UT, UB> UB W(int i2, List<Integer> list, bla blaVar, UB ub, bni bniVar) {
        if (blaVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                int iIntValue = list.get(i4).intValue();
                if (blaVar.a(iIntValue)) {
                    if (i4 != i3) {
                        list.set(i3, Integer.valueOf(iIntValue));
                    }
                    i3++;
                } else {
                    ub = (UB) X(i2, iIntValue, ub, bniVar);
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
                if (!blaVar.a(iIntValue2)) {
                    ub = (UB) X(i2, iIntValue2, ub, bniVar);
                    it.remove();
                }
            }
        }
        return ub;
    }

    public static <UT, UB> UB X(int i2, int i3, UB ub, bni bniVar) {
        if (ub == null) {
            ub = (UB) bmz.e();
        }
        bni.r(ub, i2, i3);
        return ub;
    }

    public static <T, UT, UB> void Y(bni bniVar, T t, T t2) {
        bniVar.m(t, bni.v(bniVar.j(t), bniVar.j(t2)));
    }

    public static <T> void Z(bmb bmbVar, T t, T t2, long j2) {
        bnh.t(t, j2, bmb.h(bnh.f(t, j2), bnh.f(t2, j2)));
    }

    public static int a(List<?> list) {
        return list.size();
    }

    public static <T, FT extends bkp<FT>> void aa(blt bltVar, T t) {
        blt.e(t);
        throw null;
    }

    private static bni ab(boolean z) {
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
            return (bni) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static int b(int i2, List<bkd> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iD = size * bki.D(i2);
        for (int i3 = 0; i3 < list.size(); i3++) {
            iD += bki.n(list.get(i3));
        }
        return iD;
    }

    public static int c(List<Integer> list) {
        int iR;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof bky) {
            bky bkyVar = (bky) list;
            iR = 0;
            while (i2 < size) {
                iR += bki.r(bkyVar.e(i2));
                i2++;
            }
        } else {
            iR = 0;
            while (i2 < size) {
                iR += bki.r(list.get(i2).intValue());
                i2++;
            }
        }
        return iR;
    }

    public static int d(List<?> list) {
        return list.size() * 4;
    }

    public static int e(List<?> list) {
        return list.size() * 8;
    }

    public static int f(int i2, List<blz> list, bmk bmkVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iP = 0;
        for (int i3 = 0; i3 < size; i3++) {
            iP += bki.p(i2, list.get(i3), bmkVar);
        }
        return iP;
    }

    public static int g(List<Integer> list) {
        int iR;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof bky) {
            bky bkyVar = (bky) list;
            iR = 0;
            while (i2 < size) {
                iR += bki.r(bkyVar.e(i2));
                i2++;
            }
        } else {
            iR = 0;
            while (i2 < size) {
                iR += bki.r(list.get(i2).intValue());
                i2++;
            }
        }
        return iR;
    }

    public static int h(List<Long> list) {
        int iH;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof blo) {
            blo bloVar = (blo) list;
            iH = 0;
            while (i2 < size) {
                iH += bki.H(bloVar.e(i2));
                i2++;
            }
        } else {
            iH = 0;
            while (i2 < size) {
                iH += bki.H(list.get(i2).longValue());
                i2++;
            }
        }
        return iH;
    }

    public static int i(int i2, Object obj, bmk bmkVar) {
        return obj instanceof bli ? bki.t(i2, (bli) obj) : bki.D(i2) + bki.w((blz) obj, bmkVar);
    }

    public static int j(int i2, List<?> list, bmk bmkVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iD = bki.D(i2) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            iD += obj instanceof bli ? bki.u((bli) obj) : bki.w((blz) obj, bmkVar);
        }
        return iD;
    }

    public static int k(List<Integer> list) {
        int iY;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof bky) {
            bky bkyVar = (bky) list;
            iY = 0;
            while (i2 < size) {
                iY += bki.y(bkyVar.e(i2));
                i2++;
            }
        } else {
            iY = 0;
            while (i2 < size) {
                iY += bki.y(list.get(i2).intValue());
                i2++;
            }
        }
        return iY;
    }

    public static int l(List<Long> list) {
        int iA;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof blo) {
            blo bloVar = (blo) list;
            iA = 0;
            while (i2 < size) {
                iA += bki.A(bloVar.e(i2));
                i2++;
            }
        } else {
            iA = 0;
            while (i2 < size) {
                iA += bki.A(list.get(i2).longValue());
                i2++;
            }
        }
        return iA;
    }

    public static int m(int i2, List<?> list) {
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        int iD = bki.D(i2) * size;
        if (list instanceof blk) {
            blk blkVar = (blk) list;
            while (i3 < size) {
                Object objF = blkVar.f(i3);
                iD += objF instanceof bkd ? bki.n((bkd) objF) : bki.C((String) objF);
                i3++;
            }
        } else {
            while (i3 < size) {
                Object obj = list.get(i3);
                iD += obj instanceof bkd ? bki.n((bkd) obj) : bki.C((String) obj);
                i3++;
            }
        }
        return iD;
    }

    public static int n(List<Integer> list) {
        int iF;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof bky) {
            bky bkyVar = (bky) list;
            iF = 0;
            while (i2 < size) {
                iF += bki.F(bkyVar.e(i2));
                i2++;
            }
        } else {
            iF = 0;
            while (i2 < size) {
                iF += bki.F(list.get(i2).intValue());
                i2++;
            }
        }
        return iF;
    }

    public static int o(List<Long> list) {
        int iH;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof blo) {
            blo bloVar = (blo) list;
            iH = 0;
            while (i2 < size) {
                iH += bki.H(bloVar.e(i2));
                i2++;
            }
        } else {
            iH = 0;
            while (i2 < size) {
                iH += bki.H(list.get(i2).longValue());
                i2++;
            }
        }
        return iH;
    }

    public static void p(Class<?> cls) {
        Class<?> cls2;
        if (!bkx.class.isAssignableFrom(cls) && (cls2 = f21412a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void q(int i2, List<Boolean> list, bnq bnqVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        bnqVar.c(i2, list, z);
    }

    public static void r(int i2, List<bkd> list, bnq bnqVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        bnqVar.e(i2, list);
    }

    public static void s(int i2, List<Double> list, bnq bnqVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        bnqVar.g(i2, list, z);
    }

    public static void t(int i2, List<Integer> list, bnq bnqVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        bnqVar.j(i2, list, z);
    }

    public static void u(int i2, List<Integer> list, bnq bnqVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        bnqVar.l(i2, list, z);
    }

    public static void v(int i2, List<Long> list, bnq bnqVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        bnqVar.n(i2, list, z);
    }

    public static void w(int i2, List<Float> list, bnq bnqVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        bnqVar.p(i2, list, z);
    }

    public static void x(int i2, List<?> list, bnq bnqVar, bmk bmkVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            ((bkj) bnqVar).q(i2, list.get(i3), bmkVar);
        }
    }

    public static void y(int i2, List<Integer> list, bnq bnqVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        bnqVar.s(i2, list, z);
    }

    public static void z(int i2, List<Long> list, bnq bnqVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        bnqVar.u(i2, list, z);
    }
}
