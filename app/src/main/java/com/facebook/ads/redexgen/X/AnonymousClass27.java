package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.27, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
@TargetApi(16)
public final class AnonymousClass27 extends C3S implements InterfaceC0759Ic {
    public static byte[] A0E;
    public static String[] A0F;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public MediaFormat A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final Context A0B;
    public final B5 A0C;
    public final BB A0D;

    static {
        A07();
        A06();
    }

    public static String A04(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0E, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 16);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A0E = new byte[]{7, 5, DateTimeFieldType.CLOCKHOUR_OF_DAY, 102, 27, DateTimeFieldType.HALFDAY_OF_DAY, 11, 102, 41, 41, 43, 102, 44, 45, 43, 65, 67, 86, 32, 105, 97, 97, 105, 98, 107, 32, 124, 111, 121, 32, 106, 107, 109, 97, 106, 107, 124, 54, 57, 51, 37, 56, 62, 51, 121, 36, 56, 49, 35, 32, 54, 37, 50, 121, 59, 50, 54, 57, 53, 54, 52, 60, 64, 84, 69, 72, 78, DateTimeFieldType.HOUR_OF_HALFDAY, 83, 64, 86, 24, DateTimeFieldType.MINUTE_OF_HOUR, 26, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.SECOND_OF_MINUTE, 30, DateTimeFieldType.MILLIS_OF_SECOND, 86, 24, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.HOUR_OF_HALFDAY, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 63, 50, 37, 56, 59, 35, 50, 76, 65, 86, 75, 85, 72, 80, 65, 95, 83, 74, 31, 91, 92, 66, 71, 70, 31, 65, 91, 72, 87, 70, 66, 70, 78, 48, 50, 41, 47, 50, 41, 52, 57, 121, 107, 103, 122, 102, 111, 39, 120, 107, 126, 111, 70, 84, 88, 70, 64, 91, 82, 5, 26, DateTimeFieldType.HALFDAY_OF_DAY, DateTimeFieldType.CLOCKHOUR_OF_DAY, 25, DateTimeFieldType.MINUTE_OF_HOUR, 11, 26};
    }

    public static void A07() {
        A0F = new String[]{"aLXIjAOeq43kD47uUx47KIQfBztZ5JR6", "bYDvuG1CO7Q3NDumZhhBhB8jHe", "lzauC9VKCpzgBdv7KHug0xPju0EyyDRc", "zBmjWuq", "FwqFg", "FmVSMSIXQUSd0OcxsELVimAN3SmZwHxI", "I9K2sHUvqtNZm1Rj9xJMtQcmEPzsJytW", "SRtBuggTCbvw2MXSYfok3SEL95E53gc0"};
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bz != com.facebook.ads.internal.exoplayer2.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.drm.FrameworkMediaCrypto> */
    public AnonymousClass27(Context context, InterfaceC0644Dj interfaceC0644Dj, @Nullable InterfaceC0612Bz<YS> interfaceC0612Bz, boolean z, @Nullable Handler handler, @Nullable B6 b6, @Nullable C0586Ar c0586Ar, InterfaceC0593Ay... interfaceC0593AyArr) {
        this(context, interfaceC0644Dj, interfaceC0612Bz, z, handler, b6, new Y9(c0586Ar, interfaceC0593AyArr));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bz != com.facebook.ads.internal.exoplayer2.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.drm.FrameworkMediaCrypto> */
    public AnonymousClass27(Context context, InterfaceC0644Dj interfaceC0644Dj, @Nullable InterfaceC0612Bz<YS> interfaceC0612Bz, boolean z, @Nullable Handler handler, @Nullable B6 b6, BB bb) {
        super(1, interfaceC0644Dj, interfaceC0612Bz, z);
        this.A0B = context.getApplicationContext();
        this.A0D = bb;
        this.A0C = new B5(handler, b6);
        bb.AD2(new YB(this));
    }

    private int A00(C0638Dd c0638Dd, Format format) {
        PackageManager packageManager;
        if (J1.A02 < 24) {
            if (A04(15, 22, 30).equals(c0638Dd.A02)) {
                boolean z = true;
                if (J1.A02 == 23 && (packageManager = this.A0B.getPackageManager()) != null && packageManager.hasSystemFeature(A04(37, 25, 71))) {
                    z = false;
                }
                if (z) {
                    return -1;
                }
            }
        }
        return format.A09;
    }

    private final int A01(C0638Dd c0638Dd, Format format, Format[] formatArr) {
        return A00(c0638Dd, format);
    }

    @SuppressLint({"InlinedApi"})
    private final MediaFormat A02(Format format, String str, int i2) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString(A04(113, 4, 59), str);
        mediaFormat.setInteger(A04(71, 13, 107), format.A05);
        mediaFormat.setInteger(A04(125, 11, 26), format.A0C);
        C0650Dp.A07(mediaFormat, format.A0P);
        C0650Dp.A05(mediaFormat, A04(99, 14, 34), i2);
        if (J1.A02 >= 23) {
            mediaFormat.setInteger(A04(117, 8, 80), 0);
        }
        return mediaFormat;
    }

    private void A05() {
        long jA5w = this.A0D.A5w(A7e());
        if (jA5w != Long.MIN_VALUE) {
            if (!this.A08) {
                jA5w = Math.max(this.A05, jA5w);
            }
            this.A05 = jA5w;
            this.A08 = false;
        }
    }

    public static boolean A09(String str) {
        if (J1.A02 < 24 && A04(0, 15, 88).equals(str)) {
            if (A04(136, 7, 37).equals(J1.A05) && (J1.A03.startsWith(A04(143, 8, 111)) || J1.A03.startsWith(A04(84, 7, 71)) || J1.A03.startsWith(A04(91, 8, 52)))) {
                return true;
            }
        }
        return false;
    }

    private final boolean A0A(String str) {
        int iA00 = C0761Ie.A00(str);
        if (iA00 != 0) {
            boolean zA7d = this.A0D.A7d(iA00);
            if (A0F[5].charAt(2) != 'V') {
                throw new RuntimeException();
            }
            String[] strArr = A0F;
            strArr[1] = "OP";
            strArr[1] = "OP";
            if (zA7d) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.C3S, com.facebook.ads.redexgen.X.D0
    public final void A14() {
        try {
            this.A0D.ACG();
            try {
                super.A14();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.A14();
                throw th;
            } finally {
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3S, com.facebook.ads.redexgen.X.D0
    public final void A15() {
        super.A15();
        this.A0D.ABj();
    }

    @Override // com.facebook.ads.redexgen.X.C3S, com.facebook.ads.redexgen.X.D0
    public final void A16() {
        A05();
        this.A0D.pause();
        super.A16();
    }

    @Override // com.facebook.ads.redexgen.X.C3S, com.facebook.ads.redexgen.X.D0
    public final void A17(long j2, boolean z) throws C05699z {
        super.A17(j2, z);
        this.A0D.reset();
        this.A05 = j2;
        this.A07 = true;
        this.A08 = true;
    }

    @Override // com.facebook.ads.redexgen.X.C3S, com.facebook.ads.redexgen.X.D0
    public final void A18(boolean z) throws C05699z {
        super.A18(z);
        this.A0C.A05(this.A0U);
        int i2 = A13().A00;
        if (i2 != 0) {
            this.A0D.A4v(i2);
        } else {
            this.A0D.A4m();
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3S
    public final int A1C(MediaCodec mediaCodec, C0638Dd c0638Dd, Format format, Format format2) {
        return 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bz != com.facebook.ads.internal.exoplayer2.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.drm.FrameworkMediaCrypto> */
    /* JADX WARN: Incorrect condition in loop: B:30:0x0079 */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ef  */
    @Override // com.facebook.ads.redexgen.X.C3S
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int A1D(com.facebook.ads.redexgen.X.InterfaceC0644Dj r15, com.facebook.ads.redexgen.X.InterfaceC0612Bz<com.facebook.ads.redexgen.X.YS> r16, com.facebook.ads.internal.exoplayer2.Format r17) throws com.facebook.ads.redexgen.X.C0647Dm {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AnonymousClass27.A1D(com.facebook.ads.redexgen.X.Dj, com.facebook.ads.redexgen.X.Bz, com.facebook.ads.internal.exoplayer2.Format):int");
    }

    @Override // com.facebook.ads.redexgen.X.C3S
    public final C0638Dd A1G(InterfaceC0644Dj interfaceC0644Dj, Format format, boolean z) throws C0647Dm {
        C0638Dd c0638DdA6j;
        if (A0A(format.A0O) && (c0638DdA6j = interfaceC0644Dj.A6j()) != null) {
            return c0638DdA6j;
        }
        return super.A1G(interfaceC0644Dj, format, z);
    }

    @Override // com.facebook.ads.redexgen.X.C3S
    public final void A1J() throws C05699z {
        try {
            this.A0D.ABk();
        } catch (BA e2) {
            throw C05699z.A01(e2, A10());
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3S
    public final void A1M(MediaCodec mediaCodec, MediaFormat mediaFormat) throws C05699z {
        int i2;
        int[] iArr;
        int i3;
        MediaFormat mediaFormat2 = this.A06;
        if (mediaFormat2 != null) {
            i2 = C0761Ie.A00(mediaFormat2.getString(A04(113, 4, 59)));
            mediaFormat = this.A06;
        } else {
            i2 = this.A04;
        }
        int integer = mediaFormat.getInteger(A04(71, 13, 107));
        int integer2 = mediaFormat.getInteger(A04(125, 11, 26));
        if (this.A09 && integer == 6 && (i3 = this.A00) < 6) {
            iArr = new int[i3];
            for (int i4 = 0; i4 < this.A00; i4++) {
                iArr[i4] = i4;
            }
        } else {
            iArr = null;
        }
        try {
            this.A0D.A46(i2, integer, integer2, 0, iArr, this.A02, this.A03);
        } catch (B7 e2) {
            throw C05699z.A01(e2, A10());
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3S
    public final void A1N(Format format) throws C05699z {
        super.A1N(format);
        this.A0C.A03(format);
        this.A04 = A04(62, 9, 49).equals(format.A0O) ? format.A0A : 2;
        this.A00 = format.A05;
        this.A02 = format.A06;
        this.A03 = format.A07;
    }

    @Override // com.facebook.ads.redexgen.X.C3S
    public final void A1O(YH yh) {
        if (this.A07 && !yh.A03()) {
            if (Math.abs(yh.A00 - this.A05) > 500000) {
                this.A05 = yh.A00;
            }
            this.A07 = false;
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3S
    public final void A1P(C0638Dd c0638Dd, MediaCodec mediaCodec, Format format, MediaCrypto mediaCrypto) {
        this.A01 = A01(c0638Dd, format, A1B());
        this.A09 = A09(c0638Dd.A02);
        this.A0A = c0638Dd.A04;
        MediaFormat mediaFormatA02 = A02(format, c0638Dd.A01 == null ? A04(62, 9, 49) : c0638Dd.A01, this.A01);
        mediaCodec.configure(mediaFormatA02, (Surface) null, mediaCrypto, 0);
        if (this.A0A) {
            this.A06 = mediaFormatA02;
            this.A06.setString(A04(113, 4, 59), format.A0O);
        } else {
            this.A06 = null;
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3S
    public final void A1Q(String str, long j2, long j3) {
        this.A0C.A06(str, j2, j3);
    }

    @Override // com.facebook.ads.redexgen.X.C3S
    public final boolean A1R(long j2, long j3, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i2, int i3, long j4, boolean z) throws C05699z {
        if (this.A0A && (i3 & 2) != 0) {
            mediaCodec.releaseOutputBuffer(i2, false);
            return true;
        }
        if (z) {
            mediaCodec.releaseOutputBuffer(i2, false);
            this.A0U.A08++;
            this.A0D.A7L();
            return true;
        }
        try {
            if (!this.A0D.A7K(byteBuffer, j4)) {
                return false;
            }
            mediaCodec.releaseOutputBuffer(i2, false);
            this.A0U.A06++;
            return true;
        } catch (B8 | BA e2) {
            throw C05699z.A01(e2, A10());
        }
    }

    @Override // com.facebook.ads.redexgen.X.D0, com.facebook.ads.redexgen.X.Y0
    public final InterfaceC0759Ic A6Y() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0759Ic
    public final AK A6o() {
        return this.A0D.A6o();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0759Ic
    public final long A6r() {
        if (A75() == 2) {
            A05();
        }
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.X.D0, com.facebook.ads.redexgen.X.AU
    public final void A7M(int i2, Object obj) throws C05699z {
        if (i2 != 2) {
            if (i2 != 3) {
                super.A7M(i2, obj);
                return;
            } else {
                this.A0D.ACv((C0585Aq) obj);
                return;
            }
        }
        BB bb = this.A0D;
        if (A0F[7].charAt(17) == 'P') {
            throw new RuntimeException();
        }
        String[] strArr = A0F;
        strArr[4] = "awvXiH99cLu1HaadjiPENScqQYAeI";
        strArr[4] = "awvXiH99cLu1HaadjiPENScqQYAeI";
        bb.setVolume(((Float) obj).floatValue());
    }

    @Override // com.facebook.ads.redexgen.X.C3S, com.facebook.ads.redexgen.X.Y0
    public final boolean A7e() {
        return super.A7e() && this.A0D.A7e();
    }

    @Override // com.facebook.ads.redexgen.X.C3S, com.facebook.ads.redexgen.X.Y0
    public final boolean A7m() {
        return this.A0D.A7O() || super.A7m();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0759Ic
    public final AK AD6(AK ak) {
        return this.A0D.AD6(ak);
    }
}
