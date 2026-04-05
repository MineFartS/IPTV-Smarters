package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class bnt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<Set<bnz<bnx, bnx>>> f21488a = new ThreadLocal<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<Class<?>> f21490c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f21489b = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String[] f21491d = null;

    public bnt() {
        ArrayList arrayList = new ArrayList();
        this.f21490c = arrayList;
        arrayList.add(String.class);
    }

    public static Set<bnz<bnx, bnx>> a() {
        return f21488a.get();
    }

    public static bnz<bnx, bnx> b(Object obj, Object obj2) {
        return bnz.c(new bnx(obj), new bnx(obj2));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean c(java.lang.Object r5, java.lang.Object r6, java.lang.String... r7) {
        /*
            r0 = 0
            if (r5 != r6) goto L6
            r0 = 1
            goto L70
        L6:
            if (r6 != 0) goto La
            goto L70
        La:
            com.google.ads.interactivemedia.v3.internal.bnt r1 = new com.google.ads.interactivemedia.v3.internal.bnt
            r1.<init>()
            r1.f21491d = r7
            boolean r7 = r1.f21489b
            if (r7 != 0) goto L16
            goto L6e
        L16:
            if (r5 == r6) goto L6e
            java.lang.Class r7 = r5.getClass()
            java.lang.Class r2 = r6.getClass()
            boolean r3 = r7.isInstance(r6)
            if (r3 == 0) goto L2d
            boolean r3 = r2.isInstance(r5)
            if (r3 != 0) goto L39
            goto L3b
        L2d:
            boolean r3 = r2.isInstance(r5)
            if (r3 == 0) goto L6c
            boolean r3 = r7.isInstance(r6)
            if (r3 != 0) goto L3b
        L39:
            r3 = r7
            goto L3c
        L3b:
            r3 = r2
        L3c:
            boolean r4 = r3.isArray()     // Catch: java.lang.IllegalArgumentException -> L6c
            if (r4 == 0) goto L46
            r1.f(r5, r6)     // Catch: java.lang.IllegalArgumentException -> L6c
            goto L6e
        L46:
            java.util.List<java.lang.Class<?>> r4 = r1.f21490c     // Catch: java.lang.IllegalArgumentException -> L6c
            boolean r7 = r4.contains(r7)     // Catch: java.lang.IllegalArgumentException -> L6c
            if (r7 != 0) goto L65
            java.util.List<java.lang.Class<?>> r7 = r1.f21490c     // Catch: java.lang.IllegalArgumentException -> L6c
            boolean r7 = r7.contains(r2)     // Catch: java.lang.IllegalArgumentException -> L6c
            if (r7 == 0) goto L57
            goto L65
        L57:
            r1.h(r5, r6, r3)     // Catch: java.lang.IllegalArgumentException -> L6c
            java.lang.Class r7 = r3.getSuperclass()     // Catch: java.lang.IllegalArgumentException -> L6c
            if (r7 == 0) goto L6e
            java.lang.Class r3 = r3.getSuperclass()     // Catch: java.lang.IllegalArgumentException -> L6c
            goto L57
        L65:
            boolean r5 = r5.equals(r6)     // Catch: java.lang.IllegalArgumentException -> L6c
            r1.f21489b = r5     // Catch: java.lang.IllegalArgumentException -> L6c
            goto L6e
        L6c:
            r1.f21489b = r0
        L6e:
            boolean r0 = r1.f21489b
        L70:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.bnt.c(java.lang.Object, java.lang.Object, java.lang.String[]):boolean");
    }

    private final void h(Object obj, Object obj2, Class<?> cls) {
        Set<bnz<bnx, bnx>> setA = a();
        bnz<bnx, bnx> bnzVarB = b(obj, obj2);
        bny bnyVar = (bny) bnzVarB;
        bnz bnzVarC = bnz.c(bnyVar.f21497b, bnyVar.f21496a);
        if (setA == null || !(setA.contains(bnzVarB) || setA.contains(bnzVarC))) {
            try {
                Set<bnz<bnx, bnx>> setA2 = a();
                if (setA2 == null) {
                    setA2 = new HashSet<>();
                    f21488a.set(setA2);
                }
                setA2.add(b(obj, obj2));
                Field[] declaredFields = cls.getDeclaredFields();
                AccessibleObject.setAccessible(declaredFields, true);
                for (int i2 = 0; i2 < declaredFields.length && this.f21489b; i2++) {
                    Field field = declaredFields[i2];
                    if (!ars.i(this.f21491d, field.getName()) && !field.getName().contains("$") && !Modifier.isTransient(field.getModifiers()) && !Modifier.isStatic(field.getModifiers()) && !field.isAnnotationPresent(bnu.class)) {
                        try {
                            f(field.get(obj), field.get(obj2));
                        } catch (IllegalAccessException unused) {
                            throw new InternalError("Unexpected IllegalAccessException");
                        }
                    }
                }
            } finally {
                i(obj, obj2);
            }
        }
    }

    private static void i(Object obj, Object obj2) {
        Set<bnz<bnx, bnx>> setA = a();
        if (setA != null) {
            setA.remove(b(obj, obj2));
            if (setA.isEmpty()) {
                f21488a.remove();
            }
        }
    }

    public final void d(int i2, int i3) {
        if (this.f21489b) {
            this.f21489b = i2 == i3;
        }
    }

    public final void e(long j2, long j3) {
        if (this.f21489b) {
            this.f21489b = j2 == j3;
        }
    }

    public final void f(Object obj, Object obj2) {
        if (this.f21489b && obj != obj2) {
            if (obj == null || obj2 == null) {
                g();
                return;
            }
            if (!obj.getClass().isArray()) {
                this.f21489b = obj.equals(obj2);
                return;
            }
            if (obj.getClass() != obj2.getClass()) {
                g();
                return;
            }
            int i2 = 0;
            if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                long[] jArr2 = (long[]) obj2;
                if (this.f21489b && jArr != jArr2) {
                    if (jArr.length != jArr2.length) {
                        g();
                        return;
                    }
                    while (i2 < jArr.length && this.f21489b) {
                        e(jArr[i2], jArr2[i2]);
                        i2++;
                    }
                    return;
                }
                return;
            }
            if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                int[] iArr2 = (int[]) obj2;
                if (!this.f21489b || iArr == iArr2) {
                    return;
                }
                if (iArr.length != iArr2.length) {
                    g();
                    return;
                }
                while (i2 < iArr.length && this.f21489b) {
                    d(iArr[i2], iArr2[i2]);
                    i2++;
                }
                return;
            }
            if (obj instanceof short[]) {
                short[] sArr = (short[]) obj;
                short[] sArr2 = (short[]) obj2;
                if (!this.f21489b || sArr == sArr2) {
                    return;
                }
                if (sArr.length != sArr2.length) {
                    g();
                    return;
                }
                for (int i3 = 0; i3 < sArr.length && this.f21489b; i3++) {
                    this.f21489b = sArr[i3] == sArr2[i3];
                }
                return;
            }
            if (obj instanceof char[]) {
                char[] cArr = (char[]) obj;
                char[] cArr2 = (char[]) obj2;
                if (!this.f21489b || cArr == cArr2) {
                    return;
                }
                if (cArr.length != cArr2.length) {
                    g();
                    return;
                }
                for (int i4 = 0; i4 < cArr.length && this.f21489b; i4++) {
                    this.f21489b = cArr[i4] == cArr2[i4];
                }
                return;
            }
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (!this.f21489b || bArr == bArr2) {
                    return;
                }
                if (bArr.length != bArr2.length) {
                    g();
                    return;
                }
                for (int i5 = 0; i5 < bArr.length && this.f21489b; i5++) {
                    this.f21489b = bArr[i5] == bArr2[i5];
                }
                return;
            }
            if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                double[] dArr2 = (double[]) obj2;
                if (!this.f21489b || dArr == dArr2) {
                    return;
                }
                if (dArr.length != dArr2.length) {
                    g();
                    return;
                }
                while (i2 < dArr.length && this.f21489b) {
                    e(Double.doubleToLongBits(dArr[i2]), Double.doubleToLongBits(dArr2[i2]));
                    i2++;
                }
                return;
            }
            if (obj instanceof float[]) {
                float[] fArr = (float[]) obj;
                float[] fArr2 = (float[]) obj2;
                if (!this.f21489b || fArr == fArr2) {
                    return;
                }
                if (fArr.length != fArr2.length) {
                    g();
                    return;
                }
                while (i2 < fArr.length && this.f21489b) {
                    d(Float.floatToIntBits(fArr[i2]), Float.floatToIntBits(fArr2[i2]));
                    i2++;
                }
                return;
            }
            if (!(obj instanceof boolean[])) {
                Object[] objArr = (Object[]) obj;
                Object[] objArr2 = (Object[]) obj2;
                if (!this.f21489b || objArr == objArr2) {
                    return;
                }
                if (objArr.length != objArr2.length) {
                    g();
                    return;
                }
                while (i2 < objArr.length && this.f21489b) {
                    f(objArr[i2], objArr2[i2]);
                    i2++;
                }
                return;
            }
            boolean[] zArr = (boolean[]) obj;
            boolean[] zArr2 = (boolean[]) obj2;
            if (!this.f21489b || zArr == zArr2) {
                return;
            }
            if (zArr.length != zArr2.length) {
                g();
                return;
            }
            for (int i6 = 0; i6 < zArr.length && this.f21489b; i6++) {
                this.f21489b = zArr[i6] == zArr2[i6];
            }
        }
    }

    public final void g() {
        this.f21489b = false;
    }
}
