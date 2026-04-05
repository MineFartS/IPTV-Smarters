package com.google.ads.interactivemedia.v3.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class avk<K, V> extends aud<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final aud<Object, Object> f20611a = new avk(null, new Object[0], 0);
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient Object[] f20612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient Object f20613c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient int f20614d;

    private avk(Object obj, Object[] objArr, int i2) {
        this.f20613c = obj;
        this.f20612b = objArr;
        this.f20614d = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
    
        r2[r6] = (byte) r3;
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0097, code lost:
    
        r2[r6] = (short) r3;
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00cc, code lost:
    
        r2[r7] = r3;
        r1 = r1 + 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [int[]] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r8v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <K, V> com.google.ads.interactivemedia.v3.internal.avk<K, V> l(int r10, java.lang.Object[] r11) {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.avk.l(int, java.lang.Object[]):com.google.ads.interactivemedia.v3.internal.avk");
    }

    private static IllegalArgumentException m(Object obj, Object obj2, Object[] objArr, int i2) {
        String strValueOf = String.valueOf(obj);
        String strValueOf2 = String.valueOf(obj2);
        String strValueOf3 = String.valueOf(objArr[i2]);
        String strValueOf4 = String.valueOf(objArr[i2 ^ 1]);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        StringBuilder sb = new StringBuilder(length + 39 + length2 + strValueOf3.length() + strValueOf4.length());
        sb.append("Multiple entries with same key: ");
        sb.append(strValueOf);
        sb.append("=");
        sb.append(strValueOf2);
        sb.append(" and ");
        sb.append(strValueOf3);
        sb.append("=");
        sb.append(strValueOf4);
        return new IllegalArgumentException(sb.toString());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aud
    public final ats<V> a() {
        return new avj(this.f20612b, 1, this.f20614d);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aud
    public final auk<Map.Entry<K, V>> f() {
        return new avh(this, this.f20612b, this.f20614d);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aud
    public final auk<K> g() {
        return new avi(this, new avj(this.f20612b, 0, this.f20614d));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aud, java.util.Map
    public final V get(Object obj) {
        Object obj2 = this.f20613c;
        Object[] objArr = this.f20612b;
        int i2 = this.f20614d;
        if (obj == null) {
            return null;
        }
        if (i2 == 1) {
            if (objArr[0].equals(obj)) {
                return (V) objArr[1];
            }
            return null;
        }
        if (obj2 == null) {
            return null;
        }
        if (obj2 instanceof byte[]) {
            byte[] bArr = (byte[]) obj2;
            int length = bArr.length - 1;
            int iT = auv.t(obj.hashCode());
            while (true) {
                int i3 = iT & length;
                int i4 = bArr[i3] & 255;
                if (i4 == 255) {
                    return null;
                }
                if (objArr[i4].equals(obj)) {
                    return (V) objArr[i4 ^ 1];
                }
                iT = i3 + 1;
            }
        } else if (obj2 instanceof short[]) {
            short[] sArr = (short[]) obj2;
            int length2 = sArr.length - 1;
            int iT2 = auv.t(obj.hashCode());
            while (true) {
                int i5 = iT2 & length2;
                char c2 = (char) sArr[i5];
                if (c2 == 65535) {
                    return null;
                }
                if (objArr[c2].equals(obj)) {
                    return (V) objArr[c2 ^ 1];
                }
                iT2 = i5 + 1;
            }
        } else {
            int[] iArr = (int[]) obj2;
            int length3 = iArr.length - 1;
            int iT3 = auv.t(obj.hashCode());
            while (true) {
                int i6 = iT3 & length3;
                int i7 = iArr[i6];
                if (i7 == -1) {
                    return null;
                }
                if (objArr[i7].equals(obj)) {
                    return (V) objArr[i7 ^ 1];
                }
                iT3 = i6 + 1;
            }
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aud
    public final void j() {
    }

    @Override // java.util.Map
    public final int size() {
        return this.f20614d;
    }
}
