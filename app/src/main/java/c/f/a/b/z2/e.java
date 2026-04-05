package c.f.a.b.z2;

import c.f.a.b.j3.x0;
import c.f.a.b.z2.x;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f10696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f10697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f10698d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f10699e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f10700f;

    public e(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f10696b = iArr;
        this.f10697c = jArr;
        this.f10698d = jArr2;
        this.f10699e = jArr3;
        int length = iArr.length;
        this.f10695a = length;
        if (length > 0) {
            this.f10700f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f10700f = 0L;
        }
    }

    public int a(long j2) {
        return x0.h(this.f10699e, j2, true, true);
    }

    @Override // c.f.a.b.z2.x
    public boolean f() {
        return true;
    }

    @Override // c.f.a.b.z2.x
    public x.a h(long j2) {
        int iA = a(j2);
        y yVar = new y(this.f10699e[iA], this.f10697c[iA]);
        if (yVar.f11512b >= j2 || iA == this.f10695a - 1) {
            return new x.a(yVar);
        }
        int i2 = iA + 1;
        return new x.a(yVar, new y(this.f10699e[i2], this.f10697c[i2]));
    }

    @Override // c.f.a.b.z2.x
    public long i() {
        return this.f10700f;
    }

    public String toString() {
        return "ChunkIndex(length=" + this.f10695a + ", sizes=" + Arrays.toString(this.f10696b) + ", offsets=" + Arrays.toString(this.f10697c) + ", timeUs=" + Arrays.toString(this.f10699e) + ", durationsUs=" + Arrays.toString(this.f10698d) + ")";
    }
}
