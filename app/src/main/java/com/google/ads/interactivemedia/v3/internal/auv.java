package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class auv {
    public static int a(int i2) {
        if (i2 < 3) {
            q(i2, "expectedSize");
            return i2 + 1;
        }
        if (i2 < 1073741824) {
            return (int) ((i2 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static <V> V b(Map<?, V> map, Object obj) {
        ars.g(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    public static <K, V> HashMap<K, V> c(int i2) {
        return new HashMap<>(a(i2));
    }

    public static <K, V> Map.Entry<K, V> d(K k2, V v) {
        return new att(k2, v);
    }

    public static <T> T e(Iterator<T> it) {
        T next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static <T> T f(Iterator<T> it) {
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        it.remove();
        return next;
    }

    public static void g(Iterator<?> it) {
        ars.g(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static int h(int i2, int i3) {
        return i2 & (i3 ^ (-1));
    }

    public static int i(int i2, int i3, int i4) {
        return (i2 & (i4 ^ (-1))) | (i3 & i4);
    }

    public static int j(int i2) {
        return (i2 < 32 ? 4 : 2) * (i2 + 1);
    }

    public static int k(Object obj, Object obj2, int i2, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i3;
        int i4;
        int iU = u(obj);
        int i5 = iU & i2;
        int iL = l(obj3, i5);
        if (iL == 0) {
            return -1;
        }
        int iH = h(iU, i2);
        int i6 = -1;
        while (true) {
            i3 = iL - 1;
            i4 = iArr[i3];
            if (h(i4, i2) == iH && w(obj, objArr[i3]) && (objArr2 == null || w(obj2, objArr2[i3]))) {
                break;
            }
            int i7 = i4 & i2;
            if (i7 == 0) {
                return -1;
            }
            i6 = i3;
            iL = i7;
        }
        int i8 = i4 & i2;
        if (i6 == -1) {
            n(obj3, i5, i8);
        } else {
            iArr[i6] = i(iArr[i6], i8, i2);
        }
        return i3;
    }

    public static int l(Object obj, int i2) {
        return obj instanceof byte[] ? ((byte[]) obj)[i2] & 255 : obj instanceof short[] ? (char) ((short[]) obj)[i2] : ((int[]) obj)[i2];
    }

    public static Object m(int i2) {
        if (i2 >= 2 && i2 <= 1073741824 && Integer.highestOneBit(i2) == i2) {
            return i2 <= 256 ? new byte[i2] : i2 <= 65536 ? new short[i2] : new int[i2];
        }
        StringBuilder sb = new StringBuilder(52);
        sb.append("must be power of 2 between 2^1 and 2^30: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static void n(Object obj, int i2, int i3) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i2] = (byte) i3;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i2] = (short) i3;
        } else {
            ((int[]) obj)[i2] = i3;
        }
    }

    public static void o(Object obj, Object obj2) {
        if (obj == null) {
            String strValueOf = String.valueOf(obj2);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 24);
            sb.append("null key in entry: null=");
            sb.append(strValueOf);
            throw new NullPointerException(sb.toString());
        }
        if (obj2 != null) {
            return;
        }
        String strValueOf2 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 26);
        sb2.append("null value in entry: ");
        sb2.append(strValueOf2);
        sb2.append("=null");
        throw new NullPointerException(sb2.toString());
    }

    public static void p(boolean z) {
        ars.e(z, "no calls to next() since the last call to remove()");
    }

    public static void q(int i2, String str) {
        if (i2 >= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder(str.length() + 40);
        sb.append(str);
        sb.append(" cannot be negative but was: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T r(Iterable<T> iterable) {
        if (!(iterable instanceof List)) {
            return (T) e(iterable.iterator());
        }
        if (iterable.isEmpty()) {
            throw new NoSuchElementException();
        }
        return (T) y(iterable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T s(Iterable<? extends T> iterable) {
        if (iterable.isEmpty()) {
            return null;
        }
        return (T) y(iterable);
    }

    public static int t(int i2) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i2) * (-862048943)), 15)) * 461845907);
    }

    public static int u(Object obj) {
        return t(obj == null ? 0 : obj.hashCode());
    }

    public static int v(int i2) {
        int iMax = Math.max(i2, 2);
        int iHighestOneBit = Integer.highestOneBit(iMax);
        if (iMax <= iHighestOneBit) {
            return iHighestOneBit;
        }
        int i3 = iHighestOneBit + iHighestOneBit;
        if (i3 > 0) {
            return i3;
        }
        return 1073741824;
    }

    public static boolean w(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static final boolean x(bex bexVar) {
        ark arkVar = (ark) bexVar.a().getAnnotation(ark.class);
        return arkVar != null && Arrays.asList(arkVar.b()).contains(bexVar.b());
    }

    private static <T> T y(List<T> list) {
        return list.get(list.size() - 1);
    }
}
