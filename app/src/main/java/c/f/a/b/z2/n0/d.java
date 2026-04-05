package c.f.a.b.z2.n0;

import android.util.Pair;
import c.f.a.b.j3.g;
import c.f.a.b.j3.i0;
import c.f.a.b.j3.x0;
import c.f.a.b.j3.z;
import c.f.a.b.w1;
import c.f.a.b.z2.k;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f11485a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f11486b;

        public a(int i2, long j2) {
            this.f11485a = i2;
            this.f11486b = j2;
        }

        public static a a(k kVar, i0 i0Var) {
            kVar.u(i0Var.d(), 0, 8);
            i0Var.P(0);
            return new a(i0Var.n(), i0Var.t());
        }
    }

    public static c a(k kVar) {
        a aVarA;
        byte[] bArr;
        g.e(kVar);
        i0 i0Var = new i0(16);
        if (a.a(kVar, i0Var).f11485a != 1380533830) {
            return null;
        }
        kVar.u(i0Var.d(), 0, 4);
        i0Var.P(0);
        int iN = i0Var.n();
        if (iN != 1463899717) {
            z.d("WavHeaderReader", "Unsupported RIFF format: " + iN);
            return null;
        }
        while (true) {
            aVarA = a.a(kVar, i0Var);
            if (aVarA.f11485a == 1718449184) {
                break;
            }
            kVar.m((int) aVarA.f11486b);
        }
        g.g(aVarA.f11486b >= 16);
        kVar.u(i0Var.d(), 0, 16);
        i0Var.P(0);
        int iV = i0Var.v();
        int iV2 = i0Var.v();
        int iU = i0Var.u();
        int iU2 = i0Var.u();
        int iV3 = i0Var.v();
        int iV4 = i0Var.v();
        int i2 = ((int) aVarA.f11486b) - 16;
        if (i2 > 0) {
            byte[] bArr2 = new byte[i2];
            kVar.u(bArr2, 0, i2);
            bArr = bArr2;
        } else {
            bArr = x0.f9301f;
        }
        return new c(iV, iV2, iU, iU2, iV3, iV4, bArr);
    }

    public static Pair<Long, Long> b(k kVar) throws w1 {
        g.e(kVar);
        kVar.r();
        i0 i0Var = new i0(8);
        while (true) {
            a aVarA = a.a(kVar, i0Var);
            int i2 = aVarA.f11485a;
            if (i2 == 1684108385) {
                kVar.s(8);
                long position = kVar.getPosition();
                long j2 = aVarA.f11486b + position;
                long length = kVar.getLength();
                if (length != -1 && j2 > length) {
                    z.i("WavHeaderReader", "Data exceeds input length: " + j2 + ", " + length);
                    j2 = length;
                }
                return Pair.create(Long.valueOf(position), Long.valueOf(j2));
            }
            if (i2 != 1380533830 && i2 != 1718449184) {
                z.i("WavHeaderReader", "Ignoring unknown WAV chunk: " + aVarA.f11485a);
            }
            long j3 = aVarA.f11486b + 8;
            if (aVarA.f11485a == 1380533830) {
                j3 = 12;
            }
            if (j3 > 2147483647L) {
                throw w1.e("Chunk is too large (~2GB+) to skip; id: " + aVarA.f11485a);
            }
            kVar.s((int) j3);
        }
    }
}
