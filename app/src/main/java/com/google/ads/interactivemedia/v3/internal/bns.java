package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bns {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f21487a = 0;

    public final int a() {
        return this.f21487a;
    }

    public final bns b(Object obj, Object obj2) {
        c(obj, obj2);
        return this;
    }

    public final void c(Object obj, Object obj2) {
        if (this.f21487a == 0 && obj != obj2) {
            if (obj == null) {
                this.f21487a = -1;
                return;
            }
            if (obj2 == null) {
                this.f21487a = 1;
                return;
            }
            if (!obj.getClass().isArray()) {
                this.f21487a = ((Comparable) obj).compareTo(obj2);
                return;
            }
            int i2 = 0;
            if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                long[] jArr2 = (long[]) obj2;
                if (this.f21487a == 0 && jArr != jArr2) {
                    int length = jArr.length;
                    int length2 = jArr2.length;
                    if (length != length2) {
                        this.f21487a = length >= length2 ? 1 : -1;
                        return;
                    }
                    while (i2 < jArr.length && this.f21487a == 0) {
                        this.f21487a = (jArr[i2] > jArr2[i2] ? 1 : (jArr[i2] == jArr2[i2] ? 0 : -1));
                        i2++;
                    }
                    return;
                }
                return;
            }
            if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                int[] iArr2 = (int[]) obj2;
                if (this.f21487a != 0 || iArr == iArr2) {
                    return;
                }
                int length3 = iArr.length;
                int length4 = iArr2.length;
                if (length3 != length4) {
                    this.f21487a = length3 >= length4 ? 1 : -1;
                    return;
                }
                for (int i3 = 0; i3 < iArr.length && this.f21487a == 0; i3++) {
                    int i4 = iArr[i3];
                    int i5 = iArr2[i3];
                    this.f21487a = i4 == i5 ? 0 : i4 < i5 ? -1 : 1;
                }
                return;
            }
            if (obj instanceof short[]) {
                short[] sArr = (short[]) obj;
                short[] sArr2 = (short[]) obj2;
                if (this.f21487a != 0 || sArr == sArr2) {
                    return;
                }
                int length5 = sArr.length;
                int length6 = sArr2.length;
                if (length5 != length6) {
                    this.f21487a = length5 >= length6 ? 1 : -1;
                    return;
                }
                while (i2 < sArr.length && this.f21487a == 0) {
                    this.f21487a = sArr[i2] - sArr2[i2];
                    i2++;
                }
                return;
            }
            if (obj instanceof char[]) {
                char[] cArr = (char[]) obj;
                char[] cArr2 = (char[]) obj2;
                if (this.f21487a != 0 || cArr == cArr2) {
                    return;
                }
                int length7 = cArr.length;
                int length8 = cArr2.length;
                if (length7 != length8) {
                    this.f21487a = length7 >= length8 ? 1 : -1;
                    return;
                }
                while (i2 < cArr.length && this.f21487a == 0) {
                    this.f21487a = cArr[i2] - cArr2[i2];
                    i2++;
                }
                return;
            }
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (this.f21487a != 0 || bArr == bArr2) {
                    return;
                }
                int length9 = bArr.length;
                int length10 = bArr2.length;
                if (length9 != length10) {
                    this.f21487a = length9 >= length10 ? 1 : -1;
                    return;
                }
                while (i2 < bArr.length && this.f21487a == 0) {
                    this.f21487a = bArr[i2] - bArr2[i2];
                    i2++;
                }
                return;
            }
            if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                double[] dArr2 = (double[]) obj2;
                if (this.f21487a != 0 || dArr == dArr2) {
                    return;
                }
                int length11 = dArr.length;
                int length12 = dArr2.length;
                if (length11 != length12) {
                    this.f21487a = length11 >= length12 ? 1 : -1;
                    return;
                }
                while (i2 < dArr.length && this.f21487a == 0) {
                    this.f21487a = Double.compare(dArr[i2], dArr2[i2]);
                    i2++;
                }
                return;
            }
            if (obj instanceof float[]) {
                float[] fArr = (float[]) obj;
                float[] fArr2 = (float[]) obj2;
                if (this.f21487a != 0 || fArr == fArr2) {
                    return;
                }
                int length13 = fArr.length;
                int length14 = fArr2.length;
                if (length13 != length14) {
                    this.f21487a = length13 >= length14 ? 1 : -1;
                    return;
                }
                while (i2 < fArr.length && this.f21487a == 0) {
                    this.f21487a = Float.compare(fArr[i2], fArr2[i2]);
                    i2++;
                }
                return;
            }
            if (!(obj instanceof boolean[])) {
                Object[] objArr = (Object[]) obj;
                Object[] objArr2 = (Object[]) obj2;
                if (this.f21487a != 0 || objArr == objArr2) {
                    return;
                }
                int length15 = objArr.length;
                int length16 = objArr2.length;
                if (length15 != length16) {
                    this.f21487a = length15 >= length16 ? 1 : -1;
                    return;
                }
                while (i2 < objArr.length && this.f21487a == 0) {
                    c(objArr[i2], objArr2[i2]);
                    i2++;
                }
                return;
            }
            boolean[] zArr = (boolean[]) obj;
            boolean[] zArr2 = (boolean[]) obj2;
            if (this.f21487a != 0 || zArr == zArr2) {
                return;
            }
            int length17 = zArr.length;
            int length18 = zArr2.length;
            if (length17 != length18) {
                this.f21487a = length17 >= length18 ? 1 : -1;
                return;
            }
            while (i2 < zArr.length && this.f21487a == 0) {
                boolean z = zArr[i2];
                if (z != zArr2[i2]) {
                    if (z) {
                        this.f21487a = 1;
                    } else {
                        this.f21487a = -1;
                    }
                }
                i2++;
            }
        }
    }
}
