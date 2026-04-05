package com.facebook.ads.redexgen.X;

import android.util.Pair;
import com.facebook.ads.internal.exoplayer2.Format;
import java.util.Arrays;
import java.util.Collections;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class ZK implements DL {
    public static byte[] A0D;
    public static String[] A0E;
    public static final double[] A0F;
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public CR A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final boolean[] A0C = new boolean[4];
    public final DM A0B = new DM(128);

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0D, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A0E[1].length() != 23) {
                throw new RuntimeException();
            }
            String[] strArr = A0E;
            strArr[4] = "Ri5OGo1CF8gLgqNPBzhcn52enWrdUOS9";
            strArr[4] = "Ri5OGo1CF8gLgqNPBzhcn52enWrdUOS9";
            if (i5 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 59);
            i5++;
        }
    }

    public static void A02() {
        A0D = new byte[]{-2, -15, -20, -19, -9, -73, -11, -8, -19, -17, -70};
    }

    public static void A03() {
        A0E = new String[]{"YsqY7Lk0NG7yMwVwuR3aCKQ1vCFnnoD7", "imTBT5eeu9SEESxnKVa9Th5", "O0aT", "zBRiiCG0AgE79WafkQACjpG1QDeKkcp1", "wwjqIDfPN4cSDtn9coCmQZMwbPpUFodD", "uPTa", "JD3sFkMXr2jLKKNxvTNpqQokakbynhd6", "fAZgloKcDeiXibtKpEsUxRbbQwdcutNH"};
    }

    static {
        A03();
        A02();
        A0F = new double[]{23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    }

    public static Pair<Format, Long> A00(DM dm, String str) {
        byte[] bArrCopyOf = Arrays.copyOf(dm.A02, dm.A00);
        int i2 = bArrCopyOf[4] & 255;
        int i3 = bArrCopyOf[5] & 255;
        int firstByte = bArrCopyOf[6] & 255;
        int aspectRatioCode = (i2 << 4) | (i3 >> 4);
        int width = i3 & 15;
        int i4 = (width << 8) | firstByte;
        float f2 = 1.0f;
        int i5 = (bArrCopyOf[7] & 240) >> 4;
        if (i5 != 2) {
            String[] strArr = A0E;
            String str2 = strArr[2];
            String str3 = strArr[5];
            int firstByte2 = str2.length();
            if (firstByte2 == str3.length()) {
                String[] strArr2 = A0E;
                strArr2[3] = "HgbrGKSiwbnHfsjka25a0ZgViwBErbAQ";
                strArr2[6] = "kgfZHtVXJwuxNbqkZAemlWCJOmm9Ylqd";
                if (i5 != 3) {
                    if (i5 == 4) {
                        float pixelWidthHeightRatio = aspectRatioCode * 100;
                        f2 = (i4 * 121) / pixelWidthHeightRatio;
                    }
                } else {
                    float pixelWidthHeightRatio2 = aspectRatioCode * 9;
                    f2 = (i4 * 16) / pixelWidthHeightRatio2;
                }
            }
            throw new RuntimeException();
        }
        float pixelWidthHeightRatio3 = aspectRatioCode * 3;
        f2 = (i4 * 4) / pixelWidthHeightRatio3;
        Format formatA03 = Format.A03(str, A01(0, 11, 77), null, -1, -1, aspectRatioCode, i4, -1.0f, Collections.singletonList(bArrCopyOf), -1, f2, null);
        long j2 = 0;
        int i6 = (bArrCopyOf[7] & DateTimeFieldType.CLOCKHOUR_OF_HALFDAY) - 1;
        if (i6 >= 0) {
            double[] dArr = A0F;
            int frameRateCodeMinusOne = dArr.length;
            if (i6 < frameRateCodeMinusOne) {
                double d2 = dArr[i6];
                int i7 = dm.A01;
                int sequenceExtensionPosition = i7 + 9;
                int i8 = (bArrCopyOf[sequenceExtensionPosition] & 96) >> 5;
                int i9 = i7 + 9;
                if (A0E[1].length() == 23) {
                    String[] strArr3 = A0E;
                    strArr3[1] = "JkGh2MRG0HwgK9dbH7jOqv6";
                    strArr3[1] = "JkGh2MRG0HwgK9dbH7jOqv6";
                    int frameRateExtensionN = bArrCopyOf[i9];
                    int height = frameRateExtensionN & 31;
                    if (i8 != height) {
                        double frameRate = i8;
                        int firstByte3 = height + 1;
                        d2 *= (frameRate + 1.0d) / ((double) firstByte3);
                    }
                    j2 = (long) (1000000.0d / d2);
                }
                throw new RuntimeException();
            }
        }
        return Pair.create(formatA03, Long.valueOf(j2));
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0148 A[PHI: r4
  0x0148: PHI (r4v4 long) = (r4v3 long), (r4v7 long) binds: [B:51:0x0145, B:44:0x0127] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.facebook.ads.redexgen.X.DL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A48(com.facebook.ads.redexgen.X.C0768Il r22) {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.ZK.A48(com.facebook.ads.redexgen.X.Il):void");
    }

    @Override // com.facebook.ads.redexgen.X.DL
    public final void A4V(CH ch, DZ dz) {
        dz.A06();
        this.A06 = dz.A05();
        this.A05 = ch.ADb(dz.A04(), 2);
    }

    @Override // com.facebook.ads.redexgen.X.DL
    public final void ABX() {
    }

    @Override // com.facebook.ads.redexgen.X.DL
    public final void ABY(long j2, boolean z) {
        this.A01 = j2;
    }

    @Override // com.facebook.ads.redexgen.X.DL
    public final void ACl() {
        C0764Ih.A0C(this.A0C);
        this.A0B.A01();
        this.A04 = 0L;
        this.A0A = false;
    }
}
