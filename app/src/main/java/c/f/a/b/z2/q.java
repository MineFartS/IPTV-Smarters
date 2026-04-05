package c.f.a.b.z2;

import c.f.a.b.j3.h0;
import c.f.a.b.j3.i0;
import c.f.a.b.w1;
import com.google.android.exoplayer2.extractor.FlacStreamMetadata;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class q {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public FlacStreamMetadata f11494a;

        public a(FlacStreamMetadata flacStreamMetadata) {
            this.f11494a = flacStreamMetadata;
        }
    }

    public static boolean a(k kVar) {
        i0 i0Var = new i0(4);
        kVar.u(i0Var.d(), 0, 4);
        return i0Var.F() == 1716281667;
    }

    public static int b(k kVar) throws w1 {
        kVar.r();
        i0 i0Var = new i0(2);
        kVar.u(i0Var.d(), 0, 2);
        int iJ = i0Var.J();
        int i2 = iJ >> 2;
        kVar.r();
        if (i2 == 16382) {
            return iJ;
        }
        throw w1.a("First frame does not start with sync code.", null);
    }

    public static c.f.a.b.b3.a c(k kVar, boolean z) {
        c.f.a.b.b3.a aVarA = new u().a(kVar, z ? null : c.f.a.b.b3.m.h.f6574a);
        if (aVarA == null || aVarA.e() == 0) {
            return null;
        }
        return aVarA;
    }

    public static c.f.a.b.b3.a d(k kVar, boolean z) {
        kVar.r();
        long j2 = kVar.j();
        c.f.a.b.b3.a aVarC = c(kVar, z);
        kVar.s((int) (kVar.j() - j2));
        return aVarC;
    }

    public static boolean e(k kVar, a aVar) {
        FlacStreamMetadata flacStreamMetadataCopyWithPictureFrames;
        kVar.r();
        h0 h0Var = new h0(new byte[4]);
        kVar.u(h0Var.f9198a, 0, 4);
        boolean zG = h0Var.g();
        int iH = h0Var.h(7);
        int iH2 = h0Var.h(24) + 4;
        if (iH == 0) {
            flacStreamMetadataCopyWithPictureFrames = i(kVar);
        } else {
            FlacStreamMetadata flacStreamMetadata = aVar.f11494a;
            if (flacStreamMetadata == null) {
                throw new IllegalArgumentException();
            }
            if (iH == 3) {
                flacStreamMetadataCopyWithPictureFrames = flacStreamMetadata.copyWithSeekTable(g(kVar, iH2));
            } else if (iH == 4) {
                flacStreamMetadataCopyWithPictureFrames = flacStreamMetadata.copyWithVorbisComments(k(kVar, iH2));
            } else {
                if (iH != 6) {
                    kVar.s(iH2);
                    return zG;
                }
                flacStreamMetadataCopyWithPictureFrames = flacStreamMetadata.copyWithPictureFrames(Collections.singletonList(f(kVar, iH2)));
            }
        }
        aVar.f11494a = flacStreamMetadataCopyWithPictureFrames;
        return zG;
    }

    public static PictureFrame f(k kVar, int i2) {
        i0 i0Var = new i0(i2);
        kVar.l(i0Var.d(), 0, i2);
        i0Var.Q(4);
        int iN = i0Var.n();
        String strB = i0Var.B(i0Var.n(), c.f.b.a.d.f15782a);
        String strA = i0Var.A(i0Var.n());
        int iN2 = i0Var.n();
        int iN3 = i0Var.n();
        int iN4 = i0Var.n();
        int iN5 = i0Var.n();
        int iN6 = i0Var.n();
        byte[] bArr = new byte[iN6];
        i0Var.j(bArr, 0, iN6);
        return new PictureFrame(iN, strB, strA, iN2, iN3, iN4, iN5, bArr);
    }

    public static FlacStreamMetadata.a g(k kVar, int i2) {
        i0 i0Var = new i0(i2);
        kVar.l(i0Var.d(), 0, i2);
        return h(i0Var);
    }

    public static FlacStreamMetadata.a h(i0 i0Var) {
        i0Var.Q(1);
        int iG = i0Var.G();
        long jE = ((long) i0Var.e()) + ((long) iG);
        int i2 = iG / 18;
        long[] jArrCopyOf = new long[i2];
        long[] jArrCopyOf2 = new long[i2];
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            long jW = i0Var.w();
            if (jW == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i3);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i3);
                break;
            }
            jArrCopyOf[i3] = jW;
            jArrCopyOf2[i3] = i0Var.w();
            i0Var.Q(2);
            i3++;
        }
        i0Var.Q((int) (jE - ((long) i0Var.e())));
        return new FlacStreamMetadata.a(jArrCopyOf, jArrCopyOf2);
    }

    public static FlacStreamMetadata i(k kVar) {
        byte[] bArr = new byte[38];
        kVar.l(bArr, 0, 38);
        return new FlacStreamMetadata(bArr, 4);
    }

    public static void j(k kVar) throws w1 {
        i0 i0Var = new i0(4);
        kVar.l(i0Var.d(), 0, 4);
        if (i0Var.F() != 1716281667) {
            throw w1.a("Failed to read FLAC stream marker.", null);
        }
    }

    public static List<String> k(k kVar, int i2) {
        i0 i0Var = new i0(i2);
        kVar.l(i0Var.d(), 0, i2);
        i0Var.Q(4);
        return Arrays.asList(c0.i(i0Var, false, false).f10663b);
    }
}
