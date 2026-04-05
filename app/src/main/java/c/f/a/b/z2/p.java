package c.f.a.b.z2;

import c.f.a.b.j3.i0;
import c.f.a.b.j3.x0;
import c.f.a.b.w1;
import com.google.android.exoplayer2.extractor.FlacStreamMetadata;

/* JADX INFO: loaded from: classes2.dex */
public final class p {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f11493a;
    }

    public static boolean a(i0 i0Var, FlacStreamMetadata flacStreamMetadata, int i2) {
        int iJ = j(i0Var, i2);
        return iJ != -1 && iJ <= flacStreamMetadata.maxBlockSizeSamples;
    }

    public static boolean b(i0 i0Var, int i2) {
        return i0Var.D() == x0.v(i0Var.d(), i2, i0Var.e() - 1, 0);
    }

    public static boolean c(i0 i0Var, FlacStreamMetadata flacStreamMetadata, boolean z, a aVar) {
        try {
            long jK = i0Var.K();
            if (!z) {
                jK *= (long) flacStreamMetadata.maxBlockSizeSamples;
            }
            aVar.f11493a = jK;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static boolean d(i0 i0Var, FlacStreamMetadata flacStreamMetadata, int i2, a aVar) {
        int iE = i0Var.e();
        long jF = i0Var.F();
        long j2 = jF >>> 16;
        if (j2 != i2) {
            return false;
        }
        return g((int) (15 & (jF >> 4)), flacStreamMetadata) && f((int) ((jF >> 1) & 7), flacStreamMetadata) && !(((jF & 1) > 1L ? 1 : ((jF & 1) == 1L ? 0 : -1)) == 0) && c(i0Var, flacStreamMetadata, ((j2 & 1) > 1L ? 1 : ((j2 & 1) == 1L ? 0 : -1)) == 0, aVar) && a(i0Var, flacStreamMetadata, (int) ((jF >> 12) & 15)) && e(i0Var, flacStreamMetadata, (int) ((jF >> 8) & 15)) && b(i0Var, iE);
    }

    public static boolean e(i0 i0Var, FlacStreamMetadata flacStreamMetadata, int i2) {
        int i3 = flacStreamMetadata.sampleRate;
        if (i2 == 0) {
            return true;
        }
        if (i2 <= 11) {
            return i2 == flacStreamMetadata.sampleRateLookupKey;
        }
        if (i2 == 12) {
            return i0Var.D() * 1000 == i3;
        }
        if (i2 > 14) {
            return false;
        }
        int iJ = i0Var.J();
        if (i2 == 14) {
            iJ *= 10;
        }
        return iJ == i3;
    }

    public static boolean f(int i2, FlacStreamMetadata flacStreamMetadata) {
        return i2 == 0 || i2 == flacStreamMetadata.bitsPerSampleLookupKey;
    }

    public static boolean g(int i2, FlacStreamMetadata flacStreamMetadata) {
        return i2 <= 7 ? i2 == flacStreamMetadata.channels - 1 : i2 <= 10 && flacStreamMetadata.channels == 2;
    }

    public static boolean h(k kVar, FlacStreamMetadata flacStreamMetadata, int i2, a aVar) {
        long j2 = kVar.j();
        byte[] bArr = new byte[2];
        kVar.u(bArr, 0, 2);
        if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i2) {
            kVar.r();
            kVar.m((int) (j2 - kVar.getPosition()));
            return false;
        }
        i0 i0Var = new i0(16);
        System.arraycopy(bArr, 0, i0Var.d(), 0, 2);
        i0Var.O(m.c(kVar, i0Var.d(), 2, 14));
        kVar.r();
        kVar.m((int) (j2 - kVar.getPosition()));
        return d(i0Var, flacStreamMetadata, i2, aVar);
    }

    public static long i(k kVar, FlacStreamMetadata flacStreamMetadata) throws w1 {
        kVar.r();
        kVar.m(1);
        byte[] bArr = new byte[1];
        kVar.u(bArr, 0, 1);
        boolean z = (bArr[0] & 1) == 1;
        kVar.m(2);
        int i2 = z ? 7 : 6;
        i0 i0Var = new i0(i2);
        i0Var.O(m.c(kVar, i0Var.d(), 0, i2));
        kVar.r();
        a aVar = new a();
        if (c(i0Var, flacStreamMetadata, z, aVar)) {
            return aVar.f11493a;
        }
        throw w1.a(null, null);
    }

    public static int j(i0 i0Var, int i2) {
        switch (i2) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i2 - 2);
            case 6:
                return i0Var.D() + 1;
            case 7:
                return i0Var.J() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i2 - 8);
            default:
                return -1;
        }
    }
}
