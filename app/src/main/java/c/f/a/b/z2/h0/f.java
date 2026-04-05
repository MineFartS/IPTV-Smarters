package c.f.a.b.z2.h0;

import c.f.a.b.j3.i0;
import c.f.a.b.z2.k;

/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f10849a = new i0(8);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10850b;

    public final long a(k kVar) {
        int i2 = 0;
        kVar.u(this.f10849a.d(), 0, 1);
        int i3 = this.f10849a.d()[0] & 255;
        if (i3 == 0) {
            return Long.MIN_VALUE;
        }
        int i4 = 128;
        int i5 = 0;
        while ((i3 & i4) == 0) {
            i4 >>= 1;
            i5++;
        }
        int i6 = i3 & (i4 ^ (-1));
        kVar.u(this.f10849a.d(), 1, i5);
        while (i2 < i5) {
            i2++;
            i6 = (this.f10849a.d()[i2] & 255) + (i6 << 8);
        }
        this.f10850b += i5 + 1;
        return i6;
    }

    public boolean b(k kVar) {
        long length = kVar.getLength();
        long j2 = 1024;
        if (length != -1 && length <= 1024) {
            j2 = length;
        }
        int i2 = (int) j2;
        kVar.u(this.f10849a.d(), 0, 4);
        long jF = this.f10849a.F();
        this.f10850b = 4;
        while (jF != 440786851) {
            int i3 = this.f10850b + 1;
            this.f10850b = i3;
            if (i3 == i2) {
                return false;
            }
            kVar.u(this.f10849a.d(), 0, 1);
            jF = ((jF << 8) & (-256)) | ((long) (this.f10849a.d()[0] & 255));
        }
        long jA = a(kVar);
        long j3 = this.f10850b;
        if (jA == Long.MIN_VALUE) {
            return false;
        }
        if (length != -1 && j3 + jA >= length) {
            return false;
        }
        while (true) {
            int i4 = this.f10850b;
            long j4 = j3 + jA;
            if (i4 >= j4) {
                return ((long) i4) == j4;
            }
            if (a(kVar) == Long.MIN_VALUE) {
                return false;
            }
            long jA2 = a(kVar);
            if (jA2 < 0 || jA2 > 2147483647L) {
                break;
            }
            if (jA2 != 0) {
                int i5 = (int) jA2;
                kVar.m(i5);
                this.f10850b += i5;
            }
        }
        return false;
    }
}
