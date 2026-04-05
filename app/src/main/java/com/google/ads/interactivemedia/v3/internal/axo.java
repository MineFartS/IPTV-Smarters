package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class axo implements Comparable<axo> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f20693a;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(axo axoVar) {
        axo axoVar2 = axoVar;
        int length = this.f20693a.length;
        int length2 = axoVar2.f20693a.length;
        if (length != length2) {
            return length - length2;
        }
        int i2 = 0;
        while (true) {
            byte[] bArr = this.f20693a;
            if (i2 >= bArr.length) {
                return 0;
            }
            byte b2 = bArr[i2];
            byte b3 = axoVar2.f20693a[i2];
            if (b2 != b3) {
                return b2 - b3;
            }
            i2++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof axo) {
            return Arrays.equals(this.f20693a, ((axo) obj).f20693a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f20693a);
    }

    public final String toString() {
        byte[] bArr = this.f20693a;
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (byte b2 : bArr) {
            int i2 = b2 & 255;
            sb.append("0123456789abcdef".charAt(i2 >> 4));
            sb.append("0123456789abcdef".charAt(i2 & 15));
        }
        return sb.toString();
    }
}
