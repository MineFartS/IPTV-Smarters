package c.f.a.b.z2.h0;

import c.f.a.b.z2.k;

/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long[] f10851a = {128, 64, 32, 16, 8, 4, 2, 1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f10852b = new byte[8];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10854d;

    public static long a(byte[] bArr, int i2, boolean z) {
        long j2 = ((long) bArr[0]) & 255;
        if (z) {
            j2 &= f10851a[i2 - 1] ^ (-1);
        }
        for (int i3 = 1; i3 < i2; i3++) {
            j2 = (j2 << 8) | (((long) bArr[i3]) & 255);
        }
        return j2;
    }

    public static int c(int i2) {
        long j2;
        int i3 = 0;
        do {
            long[] jArr = f10851a;
            if (i3 >= jArr.length) {
                return -1;
            }
            j2 = jArr[i3] & ((long) i2);
            i3++;
        } while (j2 == 0);
        return i3;
    }

    public int b() {
        return this.f10854d;
    }

    public long d(k kVar, boolean z, boolean z2, int i2) {
        if (this.f10853c == 0) {
            if (!kVar.d(this.f10852b, 0, 1, z)) {
                return -1L;
            }
            int iC = c(this.f10852b[0] & 255);
            this.f10854d = iC;
            if (iC == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f10853c = 1;
        }
        int i3 = this.f10854d;
        if (i3 > i2) {
            this.f10853c = 0;
            return -2L;
        }
        if (i3 != 1) {
            kVar.l(this.f10852b, 1, i3 - 1);
        }
        this.f10853c = 0;
        return a(this.f10852b, this.f10854d, z2);
    }

    public void e() {
        this.f10853c = 0;
        this.f10854d = 0;
    }
}
