package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.drm.DrmInitData;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3S, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
@TargetApi(16)
public abstract class C3S extends D0 {
    public static byte[] A0d;
    public static String[] A0e;
    public static final byte[] A0f;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public MediaCodec A06;
    public Format A07;
    public InterfaceC0611By<YS> A08;
    public InterfaceC0611By<YS> A09;
    public C0638Dd A0A;
    public ByteBuffer A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public ByteBuffer[] A0S;
    public ByteBuffer[] A0T;
    public BZ A0U;
    public final MediaCodec.BufferInfo A0V;
    public final AC A0W;
    public final YH A0X;
    public final YH A0Y;

    @Nullable
    public final InterfaceC0612Bz<YS> A0Z;
    public final InterfaceC0644Dj A0a;
    public final List<Long> A0b;
    public final boolean A0c;

    public static String A0a(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0d, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 20);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0k() {
        A0d = new byte[]{76, 64, 2, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.SECOND_OF_DAY, 64, 118, 116, 116, 116, 116, 116, 117, 114, 115, 112, 118, 7, 116, 116, 6, 0, 5, 118, 113, 125, 116, 116, 116, 116, 116, 116, 117, 114, 124, 7, 1, 116, 2, 117, 119, 118, 116, 116, 116, 116, 116, 116, 117, 114, 113, 124, 124, 124, 112, 116, 0, 7, 1, 115, 117, 117, 124, 5, 116, 116, 116, 118, 2, 6, 2, 117, 7, 119, 117, 7, 119, 118, 115, 113, 0, 115, 124, 7, 0, DateTimeFieldType.MINUTE_OF_DAY, 4, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 8, 26, 3, 29, 26, 8, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 117, 89, 85, 78, 91, 90, 34, DateTimeFieldType.SECOND_OF_DAY, 11, 70, DateTimeFieldType.SECOND_OF_MINUTE, 3, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 9, 8, 70, DateTimeFieldType.SECOND_OF_DAY, 3, DateTimeFieldType.MILLIS_OF_SECOND, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, DateTimeFieldType.SECOND_OF_DAY, 3, DateTimeFieldType.SECOND_OF_MINUTE, 70, DateTimeFieldType.SECOND_OF_MINUTE, 3, 5, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.SECOND_OF_DAY, 3, 70, 2, 3, 5, 9, 2, 3, DateTimeFieldType.SECOND_OF_DAY, 70, 0, 9, DateTimeFieldType.SECOND_OF_DAY, 70, 62, DateTimeFieldType.MILLIS_OF_DAY, DateTimeFieldType.MILLIS_OF_SECOND, 26, DateTimeFieldType.MINUTE_OF_DAY, 83, 1, DateTimeFieldType.MILLIS_OF_DAY, 2, 6, 26, 1, DateTimeFieldType.MILLIS_OF_DAY, 0, 83, DateTimeFieldType.MINUTE_OF_DAY, 83, 55, 1, 30, 32, DateTimeFieldType.MILLIS_OF_DAY, 0, 0, 26, 28, 29, 62, DateTimeFieldType.MINUTE_OF_DAY, 29, DateTimeFieldType.MINUTE_OF_DAY, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.MILLIS_OF_DAY, 1, 125, 85, 84, 89, 81, 115, 95, 84, 85, 83, 98, 85, 94, 84, 85, 66, 85, 66, 125, 127, 106, 28, 119, 74, 75, 92, 93, 65, 28, 83, 68, 81, 28, 86, 87, 81, 27, 25, 12, 122, DateTimeFieldType.HOUR_OF_DAY, 44, 45, 58, 59, 39, 122, 53, 34, 55, 122, 48, 49, 55, 122, 39, 49, 55, 33, 38, 49, 74, 72, 93, 43, 72, 81, 78, 43, 68, 80, 65, 76, 74, 43, 65, 64, 70, 74, 65, 64, 87, 43, 72, 85, 54, 127, 125, 104, 30, 125, 100, 123, 30, 102, 121, 116, 117, 127, 30, 116, 117, 115, 127, 116, 117, 98, 30, 113, 102, 115, 3, 1, DateTimeFieldType.SECOND_OF_DAY, 98, 2, 58, 37, 40, 37, 45, 98, 36, 126, 122, 120, 98, 40, 41, 47, 35, 40, 41, 47, 45, 56, 78, 46, DateTimeFieldType.MILLIS_OF_DAY, 9, 4, 9, 1, 78, 8, 82, 86, 84, 78, 4, 5, 3, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 4, 5, 78, DateTimeFieldType.MINUTE_OF_HOUR, 5, 3, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.MINUTE_OF_DAY, 5, 121, 123, 110, 24, 101, 115, 117, 24, 87, 64, 85, 24, 82, 83, 85, 72, 74, 95, 41, 84, 66, 68, 41, 102, 113, 100, 41, 99, 98, 100, 41, 116, 98, 100, 114, 117, 98, 45, 47, 58, 76, 3, DateTimeFieldType.HOUR_OF_HALFDAY, DateTimeFieldType.HOUR_OF_HALFDAY, DateTimeFieldType.SECOND_OF_MINUTE, 11, 12, 12, 7, DateTimeFieldType.CLOCKHOUR_OF_DAY, 76, DateTimeFieldType.SECOND_OF_DAY, 11, 6, 7, DateTimeFieldType.HALFDAY_OF_DAY, 76, 6, 7, 1, DateTimeFieldType.HALFDAY_OF_DAY, 6, 7, DateTimeFieldType.CLOCKHOUR_OF_DAY, 76, 3, DateTimeFieldType.SECOND_OF_DAY, 1, 1, 3, DateTimeFieldType.MILLIS_OF_DAY, 96, 47, 35, 34, 33, 41, 39, 45, 96, 47, 56, 45, 96, 42, 43, 45, 33, 42, 43, 60, 96, 47, 57, 43, 61, 33, 35, 43, 63, 61, 40, 94, DateTimeFieldType.HOUR_OF_DAY, 29, 28, 31, DateTimeFieldType.MILLIS_OF_SECOND, 25, DateTimeFieldType.MINUTE_OF_HOUR, 94, DateTimeFieldType.HOUR_OF_DAY, 6, DateTimeFieldType.MINUTE_OF_HOUR, 94, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.MINUTE_OF_HOUR, 31, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.SECOND_OF_MINUTE, 2, 94, DateTimeFieldType.HOUR_OF_DAY, 7, DateTimeFieldType.SECOND_OF_MINUTE, 3, 31, 29, DateTimeFieldType.SECOND_OF_MINUTE, 94, 3, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.MINUTE_OF_HOUR, 5, 2, DateTimeFieldType.SECOND_OF_MINUTE, 121, 123, 110, 24, 81, 89, 89, 81, 90, 83, 24, 87, 87, 85, 24, 82, 83, 85, 89, 82, 83, 68, 30, 28, 9, 127, 54, 62, 62, 54, 61, 52, 127, 39, 62, 35, 51, 56, 34, 127, 53, 52, 50, 62, 53, 52, 35, 2, 0, DateTimeFieldType.SECOND_OF_MINUTE, 99, 63, 38, 99, 59, 36, 41, 40, 34, DateTimeFieldType.MINUTE_OF_DAY, 41, 40, 46, 34, 41, 40, 63, 99, 44, 59, 46, 112, 110, DateTimeFieldType.HOUR_OF_HALFDAY, 98, DateTimeFieldType.MILLIS_OF_DAY, DateTimeFieldType.MINUTE_OF_DAY, DateTimeFieldType.MINUTE_OF_HOUR, 41, 55, 87, 59, 79, 72, 74, 106, 116, DateTimeFieldType.SECOND_OF_DAY, 126, 1, 9, 9, 116, 106, 10, 109, DateTimeFieldType.CLOCKHOUR_OF_DAY, DateTimeFieldType.MILLIS_OF_SECOND, DateTimeFieldType.MILLIS_OF_SECOND, 79, 81, 49, 72, 41, 36, 41, 106, 97, 104, 103, 103, 108, 101, 36, 106, 102, 124, 103, 125, 63, 51, 50, 58, 53, 59, 41, 46, 57, 31, 51, 56, 57, 63, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 30, 9, DateTimeFieldType.HALFDAY_OF_DAY, 24, 9, 47, 3, 8, 9, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 86, 96, 118, 101, 109, 106, 69, 106, 96, 66, 97, 97, 96, 83, 89, 90, 64, 91, 81, 80, 71, 24, DateTimeFieldType.MINUTE_OF_DAY, DateTimeFieldType.HOUR_OF_DAY, 11, DateTimeFieldType.CLOCKHOUR_OF_DAY, 26, 27, 12, 33, DateTimeFieldType.MINUTE_OF_DAY, 10, 27, 5, DateTimeFieldType.CLOCKHOUR_OF_DAY, DateTimeFieldType.HALFDAY_OF_DAY, DateTimeFieldType.MILLIS_OF_SECOND, DateTimeFieldType.MINUTE_OF_DAY, 7, DateTimeFieldType.CLOCKHOUR_OF_DAY, 43, 33, 113, 115, 115, 115, 45, 32, 44, 34, 45, 49, 30, 31, 80, 3, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.MINUTE_OF_HOUR, 5, 2, DateTimeFieldType.SECOND_OF_MINUTE, 80, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.MINUTE_OF_HOUR, 31, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.SECOND_OF_MINUTE, 2, 80, DateTimeFieldType.HOUR_OF_DAY, 6, DateTimeFieldType.HOUR_OF_DAY, 25, 28, DateTimeFieldType.HOUR_OF_DAY, DateTimeFieldType.MINUTE_OF_DAY, 28, DateTimeFieldType.SECOND_OF_MINUTE, 94, 80, 36, 2, 9, 25, 30, DateTimeFieldType.MILLIS_OF_SECOND, 80, 4, 31, 80, 0, 2, 31, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.SECOND_OF_DAY, 80, 7, 25, 4, 24, 80, 118, 113, 100, 119, 113, 70, 106, 97, 96, 102, 102, 123, 126, 115, 98, 123, 115, 78, 80, 93, 77, 81};
    }

    public static void A0l() {
        A0e = new String[]{"9OVkIR1fNYEoLuJhr4v44UGIqobat2iA", "rvjyAE4a8qg3Symxb7ylQnmZk1yEw18g", "yq3KpxRuPN0WZ8jbU7FQkuT3q90s4j9W", "QhWwoh5s4IWFZsopFlKjqr3qYdcDlMjY", "GXhQrMO3EYw7GpvgdmF2LLQyblaoRrya", "HarHLo3NfHHJ1sn22D42qgtNJjG4ySv5", "mWzZtnKFhVqOEEmQC7RHyJpmfpW8oE62", "x54zHbOQHTTVCgIECmCrfbqAOALLU5ir"};
    }

    public abstract int A1D(InterfaceC0644Dj interfaceC0644Dj, InterfaceC0612Bz<YS> interfaceC0612Bz, Format format) throws C0647Dm;

    public abstract void A1P(C0638Dd c0638Dd, MediaCodec mediaCodec, Format format, MediaCrypto mediaCrypto) throws C0647Dm;

    public abstract boolean A1R(long j2, long j3, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i2, int i3, long j4, boolean z) throws C05699z;

    static {
        A0l();
        A0k();
        A0f = J1.A0l(A0a(7, 76, 80));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bz != com.facebook.ads.internal.exoplayer2.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.drm.FrameworkMediaCrypto> */
    public C3S(int i2, InterfaceC0644Dj interfaceC0644Dj, @Nullable InterfaceC0612Bz<YS> interfaceC0612Bz, boolean z) {
        super(i2);
        IM.A04(J1.A02 >= 16);
        this.A0a = (InterfaceC0644Dj) IM.A01(interfaceC0644Dj);
        this.A0Z = interfaceC0612Bz;
        this.A0c = z;
        this.A0X = new YH(0);
        this.A0Y = YH.A02();
        this.A0W = new AC();
        this.A0b = new ArrayList();
        this.A0V = new MediaCodec.BufferInfo();
        this.A01 = 0;
        this.A02 = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010a A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int A0X(java.lang.String r6) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C3S.A0X(java.lang.String):int");
    }

    private final long A0Y() {
        return 0L;
    }

    public static MediaCodec.CryptoInfo A0Z(YH yh, int i2) {
        MediaCodec.CryptoInfo cryptoInfoA02 = yh.A02.A02();
        if (i2 == 0) {
            return cryptoInfoA02;
        }
        if (cryptoInfoA02.numBytesOfClearData == null) {
            String[] strArr = A0e;
            if (strArr[1].charAt(9) == strArr[6].charAt(9)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0e;
            strArr2[5] = "UbtyB27B24Biu3n6sBWjRVSN4hFFB4s1";
            strArr2[5] = "UbtyB27B24Biu3n6sBWjRVSN4hFFB4s1";
            cryptoInfoA02.numBytesOfClearData = new int[1];
        }
        int[] iArr = cryptoInfoA02.numBytesOfClearData;
        iArr[0] = iArr[0] + i2;
        return cryptoInfoA02;
    }

    private ByteBuffer A0b(int i2) {
        if (J1.A02 >= 21) {
            return this.A06.getInputBuffer(i2);
        }
        return this.A0S[i2];
    }

    private ByteBuffer A0c(int i2) {
        if (J1.A02 >= 21) {
            return this.A06.getOutputBuffer(i2);
        }
        return this.A0T[i2];
    }

    private void A0d() {
        if (J1.A02 < 21) {
            this.A0S = this.A06.getInputBuffers();
            this.A0T = this.A06.getOutputBuffers();
        }
    }

    private void A0e() throws C05699z {
        if (this.A02 == 2) {
            A1I();
            A1K();
        } else {
            this.A0N = true;
            A1J();
        }
    }

    private void A0f() {
        if (J1.A02 < 21) {
            this.A0T = this.A06.getOutputBuffers();
        }
    }

    private void A0g() throws C05699z {
        MediaFormat outputFormat = this.A06.getOutputFormat();
        if (this.A00 != 0 && outputFormat.getInteger(A0a(739, 5, 45)) == 32 && outputFormat.getInteger(A0a(664, 6, 81)) == 32) {
            this.A0O = true;
            return;
        }
        if (this.A0I) {
            outputFormat.setInteger(A0a(580, 13, 29), 1);
        }
        A1M(this.A06, outputFormat);
    }

    private void A0h() {
        if (J1.A02 < 21) {
            this.A0S = null;
            this.A0T = null;
        }
    }

    private void A0i() {
        this.A03 = -1;
        this.A0X.A01 = null;
    }

    private void A0j() {
        this.A04 = -1;
        this.A0B = null;
    }

    private void A0m(C0640Df c0640Df) throws C05699z {
        throw C05699z.A01(c0640Df, A10());
    }

    private boolean A0n() {
        if (A0a(95, 6, 32).equals(J1.A05)) {
            if (!A0a(87, 4, 90).equals(J1.A06)) {
                if (A0a(83, 4, 82).equals(J1.A06)) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0206, code lost:
    
        if (r16.A0X.A03() == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0208, code lost:
    
        r16.A0b.add(java.lang.Long.valueOf(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0211, code lost:
    
        r16.A0X.A08();
        A1O(r16.A0X);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x021b, code lost:
    
        if (r6 == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x021e, code lost:
    
        r16.A06.queueInputBuffer(r16.A03, 0, r16.A0X.A01.limit(), r7, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0231, code lost:
    
        r6 = A0Z(r16.A0X, r5);
        r16.A06.queueSecureInputBuffer(r16.A03, 0, r6, r7, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0240, code lost:
    
        A0i();
        r16.A0J = true;
        r16.A01 = 0;
        r16.A0U.A04++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x024e, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x024f, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0258, code lost:
    
        throw com.facebook.ads.redexgen.X.C05699z.A01(r1, A10());
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0095, code lost:
    
        if (r7 != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0097, code lost:
    
        r16.A0C = false;
        r16.A0X.A01.put(com.facebook.ads.redexgen.X.C3S.A0f);
        r16.A06.queueInputBuffer(r16.A03, 0, com.facebook.ads.redexgen.X.C3S.A0f.length, 0, 0);
        A0i();
        r16.A0J = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b5, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c2, code lost:
    
        if (r7 != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c5, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c8, code lost:
    
        if (r16.A0R == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ca, code lost:
    
        r6 = -4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00cc, code lost:
    
        if (r6 != (-3)) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ce, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d1, code lost:
    
        if (r16.A01 != 1) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d3, code lost:
    
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d4, code lost:
    
        r8 = r16.A07.A0P.size();
        r6 = com.facebook.ads.redexgen.X.C3S.A0e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ee, code lost:
    
        if (r6[1].charAt(9) == r6[6].charAt(9)) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f0, code lost:
    
        r6 = com.facebook.ads.redexgen.X.C3S.A0e;
        r6[7] = "0VatHXJ47YZXuQNTjh1Q4vWnAJchohqJ";
        r6[7] = "0VatHXJ47YZXuQNTjh1Q4vWnAJchohqJ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00fc, code lost:
    
        if (r7 >= r8) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00fe, code lost:
    
        r16.A0X.A01.put(r16.A07.A0P.get(r7));
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0112, code lost:
    
        r6 = com.facebook.ads.redexgen.X.C3S.A0e;
        r6[3] = "zOhD8BhFeW0zpu1geu8qUgn88iwXK5ep";
        r6[0] = "60rX9qlLFkokv4JD1C8g9QKhync8N1Cu";
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x011e, code lost:
    
        if (r7 >= r8) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0121, code lost:
    
        r16.A01 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0123, code lost:
    
        r7 = r16.A0X.A01;
        r6 = com.facebook.ads.redexgen.X.C3S.A0e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0139, code lost:
    
        if (r6[1].charAt(9) == r6[6].charAt(9)) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x013b, code lost:
    
        r6 = com.facebook.ads.redexgen.X.C3S.A0e;
        r6[1] = "39aArsNj3IDVPnG6lUIYrUviornu3auc";
        r6[6] = "ZVN5NvQX1lR02F2nkBpRehMiTRLfpSWC";
        r5 = r7.position();
        r6 = A12(r16.A0W, r16.A0X, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0155, code lost:
    
        r5 = r7.position();
        r6 = A12(r16.A0W, r16.A0X, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0164, code lost:
    
        if (r6 != (-5)) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0168, code lost:
    
        if (r16.A01 != 2) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x016a, code lost:
    
        r16.A0X.A07();
        r16.A01 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0171, code lost:
    
        A1N(r16.A0W.A00);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0178, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x017f, code lost:
    
        if (r16.A0X.A04() == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0183, code lost:
    
        if (r16.A01 != 2) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0185, code lost:
    
        r16.A0X.A07();
        r16.A01 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x018c, code lost:
    
        r16.A0M = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0190, code lost:
    
        if (r16.A0J != false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0192, code lost:
    
        A0e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0195, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0198, code lost:
    
        if (r16.A0G == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x019b, code lost:
    
        r16.A0K = true;
        r16.A06.queueInputBuffer(r16.A03, 0, 0, 0, 4);
        A0i();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01ac, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01ad, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01b6, code lost:
    
        throw com.facebook.ads.redexgen.X.C05699z.A01(r1, A10());
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01b9, code lost:
    
        if (r16.A0Q == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01c1, code lost:
    
        if (r16.A0X.A05() != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01c3, code lost:
    
        r16.A0X.A07();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01ca, code lost:
    
        if (r16.A01 != 2) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01cc, code lost:
    
        r16.A01 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01ce, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01cf, code lost:
    
        r16.A0Q = false;
        r6 = r16.A0X.A0A();
        r16.A0R = A0y(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01df, code lost:
    
        if (r16.A0R == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01e1, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01e4, code lost:
    
        if (r16.A0D == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01e6, code lost:
    
        if (r6 != false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01e8, code lost:
    
        com.facebook.ads.redexgen.X.C0764Ih.A0B(r16.A0X.A01);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01f7, code lost:
    
        if (r16.A0X.A01.position() != 0) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01f9, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01fa, code lost:
    
        r16.A0D = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01fc, code lost:
    
        r7 = r16.A0X.A00;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0o() throws com.facebook.ads.redexgen.X.C05699z {
        /*
            Method dump skipped, instruction units count: 601
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C3S.A0o():boolean");
    }

    private boolean A0p() {
        return this.A04 >= 0;
    }

    private boolean A0q(long j2) {
        int size = this.A0b.size();
        for (int i2 = 0; i2 < size; i2++) {
            long jLongValue = this.A0b.get(i2).longValue();
            String[] strArr = A0e;
            if (strArr[1].charAt(9) == strArr[6].charAt(9)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0e;
            strArr2[4] = "ML5bMotUrNJfefR5zyFOe6FKAXdvvO6A";
            strArr2[2] = "SdeYytwJjEjJxI17XZFSuNmI9VlWoLpo";
            if (jLongValue == j2) {
                this.A0b.remove(i2);
                if (A0e[5].charAt(22) != 'm') {
                    String[] strArr3 = A0e;
                    strArr3[4] = "PN0xo47Kt8nFjD42DkF1Rwv3kccfY0ZU";
                    strArr3[2] = "8XhLexKKIuuBUtz2cCFHUx77okN3o4VX";
                    return true;
                }
                String[] strArr4 = A0e;
                strArr4[1] = "MaO0vnTK96XnVNRleRSpONjFXCjP5Eov";
                strArr4[6] = "hUdEzwsPaliJglUJ7NraoDZ4Fn5DncmA";
                return false;
            }
        }
        return false;
    }

    private boolean A0r(long j2, long j3) throws C05699z {
        boolean zA1R;
        int iDequeueOutputBuffer;
        if (!A0p()) {
            if (this.A0F && this.A0K) {
                try {
                    iDequeueOutputBuffer = this.A06.dequeueOutputBuffer(this.A0V, A0Y());
                } catch (IllegalStateException unused) {
                    A0e();
                    if (this.A0N) {
                        A1I();
                    }
                    return false;
                }
            } else {
                iDequeueOutputBuffer = this.A06.dequeueOutputBuffer(this.A0V, A0Y());
            }
            if (iDequeueOutputBuffer >= 0) {
                if (this.A0O) {
                    this.A0O = false;
                    this.A06.releaseOutputBuffer(iDequeueOutputBuffer, false);
                    return true;
                }
                if (this.A0V.size == 0 && (this.A0V.flags & 4) != 0) {
                    A0e();
                    return false;
                }
                this.A04 = iDequeueOutputBuffer;
                this.A0B = A0c(iDequeueOutputBuffer);
                ByteBuffer byteBuffer = this.A0B;
                if (byteBuffer != null) {
                    byteBuffer.position(this.A0V.offset);
                    this.A0B.limit(this.A0V.offset + this.A0V.size);
                }
                this.A0P = A0q(this.A0V.presentationTimeUs);
            } else {
                if (iDequeueOutputBuffer == -2) {
                    A0g();
                    return true;
                }
                if (iDequeueOutputBuffer == -3) {
                    A0f();
                    return true;
                }
                if (this.A0G && (this.A0M || this.A02 == 2)) {
                    A0e();
                }
                return false;
            }
        }
        boolean z = this.A0F;
        String[] strArr = A0e;
        if (strArr[3].charAt(8) != strArr[0].charAt(8)) {
            String[] strArr2 = A0e;
            strArr2[3] = "H6QEdKrNS5VKUI2eiDzJYDiDaOSTSHZm";
            strArr2[0] = "qtM0JqIstAlLtY5WeeeWIRjDSmIhrDzd";
            if (z && this.A0K) {
                try {
                    zA1R = A1R(j2, j3, this.A06, this.A0B, this.A04, this.A0V.flags, this.A0V.presentationTimeUs, this.A0P);
                } catch (IllegalStateException unused2) {
                    A0e();
                    boolean z2 = this.A0N;
                    String[] strArr3 = A0e;
                    if (strArr3[4].charAt(18) == strArr3[2].charAt(18)) {
                        String[] strArr4 = A0e;
                        strArr4[3] = "kLeAoHdKyNjlIY3W2lnlzypZ7jBCZpds";
                        strArr4[0] = "12vglqLCD0wnh38LM4o4LF1q7CPuStNa";
                        if (z2) {
                            A1I();
                        }
                        return false;
                    }
                }
            } else {
                zA1R = A1R(j2, j3, this.A06, this.A0B, this.A04, this.A0V.flags, this.A0V.presentationTimeUs, this.A0P);
            }
            if (zA1R) {
                A1L(this.A0V.presentationTimeUs);
                boolean z3 = (this.A0V.flags & 4) != 0;
                A0j();
                if (!z3) {
                    return true;
                }
                A0e();
            }
            return false;
        }
        throw new RuntimeException();
    }

    public static boolean A0s(C0638Dd c0638Dd) {
        String str = c0638Dd.A02;
        if (J1.A02 > 17 || (!A0a(521, 24, 89).equals(str) && !A0a(374, 31, 118).equals(str))) {
            if (A0a(95, 6, 32).equals(J1.A05)) {
                if (!A0a(91, 4, 72).equals(J1.A06) || !c0638Dd.A05) {
                }
            }
            return false;
        }
        return true;
    }

    public static boolean A0t(String str) {
        if (J1.A02 > 23 || !A0a(496, 25, 69).equals(str)) {
            if (J1.A02 <= 19) {
                if (A0a(658, 6, 87).equals(J1.A03)) {
                    String[] strArr = A0e;
                    if (strArr[3].charAt(8) == strArr[0].charAt(8)) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A0e;
                    strArr2[1] = "95wFKgRrMS7zF0LnDUBUyEKLdOv2pw0Q";
                    strArr2[6] = "8UM2DR4qd3kvfN0lEIyvKJByOBGtF0J9";
                    if (A0a(405, 31, 90).equals(str) || A0a(436, 38, 100).equals(str)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static boolean A0u(String str) {
        return J1.A02 == 21 && A0a(474, 22, 34).equals(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0v(java.lang.String r4) {
        /*
            int r0 = com.facebook.ads.redexgen.X.J1.A02
            r1 = 18
            if (r0 < r1) goto L81
            int r0 = com.facebook.ads.redexgen.X.J1.A02
            if (r0 != r1) goto L4a
            r2 = 337(0x151, float:4.72E-43)
            r1 = 15
            r0 = 34
            java.lang.String r0 = A0a(r2, r1, r0)
            boolean r3 = r0.equals(r4)
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C3S.A0e
            r0 = 3
            r1 = r2[r0]
            r0 = 0
            r2 = r2[r0]
            r0 = 8
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L85
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C3S.A0e
            java.lang.String r1 = "meV5e9Kkfi1Cw7qLNaZXa1JKO1Lv4Z7w"
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = "iFBSwhWIKfzcqDOwhwOBewnG37AI8L0V"
            r0 = 6
            r2[r0] = r1
            if (r3 != 0) goto L81
            r2 = 352(0x160, float:4.93E-43)
            r1 = 22
            r0 = 19
            java.lang.String r0 = A0a(r2, r1, r0)
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L81
        L4a:
            int r1 = com.facebook.ads.redexgen.X.J1.A02
            r0 = 19
            if (r1 != r0) goto L83
            java.lang.String r3 = com.facebook.ads.redexgen.X.J1.A06
            r2 = 559(0x22f, float:7.83E-43)
            r1 = 7
            r0 = 45
            java.lang.String r0 = A0a(r2, r1, r0)
            boolean r0 = r3.startsWith(r0)
            if (r0 == 0) goto L83
            r2 = 193(0xc1, float:2.7E-43)
            r1 = 18
            r0 = 38
            java.lang.String r0 = A0a(r2, r1, r0)
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L81
            r2 = 211(0xd3, float:2.96E-43)
            r1 = 25
            r0 = 64
            java.lang.String r0 = A0a(r2, r1, r0)
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L83
        L81:
            r0 = 1
        L82:
            return r0
        L83:
            r0 = 0
            goto L82
        L85:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C3S.A0v(java.lang.String):boolean");
    }

    public static boolean A0w(String str, Format format) {
        return J1.A02 < 21 && format.A0P.isEmpty() && A0a(261, 25, 36).equals(str);
    }

    public static boolean A0x(String str, Format format) {
        return J1.A02 <= 18 && format.A05 == 1 && A0a(236, 25, 17).equals(str);
    }

    private boolean A0y(boolean z) throws C05699z {
        if (this.A08 == null || (!z && this.A0c)) {
            return false;
        }
        int iA75 = this.A08.A75();
        if (iA75 != 1) {
            return iA75 != 4;
        }
        throw C05699z.A01(this.A08.A6D(), A10());
    }

    @Override // com.facebook.ads.redexgen.X.D0
    public void A14() {
        this.A07 = null;
        try {
            A1I();
            try {
                if (this.A08 != null) {
                    this.A0Z.ACM(this.A08);
                }
                try {
                    if (this.A09 != null && this.A09 != this.A08) {
                        this.A0Z.ACM(this.A09);
                    }
                } finally {
                }
            } catch (Throwable th) {
                try {
                    if (this.A09 != null && this.A09 != this.A08) {
                        this.A0Z.ACM(this.A09);
                    }
                    throw th;
                } finally {
                }
            }
        } catch (Throwable th2) {
            try {
                if (this.A08 != null) {
                    this.A0Z.ACM(this.A08);
                }
                try {
                    if (this.A09 != null && this.A09 != this.A08) {
                        this.A0Z.ACM(this.A09);
                    }
                    throw th2;
                } finally {
                }
            } catch (Throwable th3) {
                try {
                    if (this.A09 != null && this.A09 != this.A08) {
                        this.A0Z.ACM(this.A09);
                    }
                    throw th3;
                } finally {
                }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.D0
    public void A15() {
    }

    @Override // com.facebook.ads.redexgen.X.D0
    public void A16() {
    }

    @Override // com.facebook.ads.redexgen.X.D0
    public void A17(long j2, boolean z) throws C05699z {
        this.A0M = false;
        this.A0N = false;
        if (this.A06 != null) {
            A1H();
        }
    }

    @Override // com.facebook.ads.redexgen.X.D0
    public void A18(boolean z) throws C05699z {
        this.A0U = new BZ();
    }

    public int A1C(MediaCodec mediaCodec, C0638Dd c0638Dd, Format format, Format format2) {
        return 0;
    }

    public final MediaCodec A1E() {
        return this.A06;
    }

    public final C0638Dd A1F() {
        return this.A0A;
    }

    public C0638Dd A1G(InterfaceC0644Dj interfaceC0644Dj, Format format, boolean z) throws C0647Dm {
        return interfaceC0644Dj.A62(format.A0O, z);
    }

    public void A1H() throws C05699z {
        this.A05 = -9223372036854775807L;
        A0i();
        A0j();
        this.A0Q = true;
        this.A0R = false;
        this.A0P = false;
        this.A0b.clear();
        this.A0C = false;
        this.A0O = false;
        if (this.A0H || (this.A0E && this.A0K)) {
            A1I();
            A1K();
        } else {
            int i2 = this.A02;
            if (A0e[7].charAt(4) != 'H') {
                throw new RuntimeException();
            }
            String[] strArr = A0e;
            strArr[1] = "wbouPn2Ftm3cpLG8fvuyld6AKnPflzbx";
            strArr[6] = "bzy96m6ZRNxMDmYLQEfFnOCqhh49XGXp";
            if (i2 != 0) {
                A1I();
                A1K();
            } else {
                this.A06.flush();
                this.A0J = false;
            }
        }
        if (this.A0L && this.A07 != null) {
            this.A01 = 1;
        }
    }

    public void A1I() {
        this.A05 = -9223372036854775807L;
        A0i();
        A0j();
        this.A0R = false;
        this.A0P = false;
        this.A0b.clear();
        A0h();
        this.A0A = null;
        this.A0L = false;
        this.A0J = false;
        this.A0D = false;
        this.A0H = false;
        this.A00 = 0;
        this.A0G = false;
        this.A0E = false;
        this.A0I = false;
        this.A0C = false;
        this.A0O = false;
        this.A0K = false;
        this.A01 = 0;
        this.A02 = 0;
        if (this.A06 != null) {
            this.A0U.A01++;
            try {
                this.A06.stop();
                try {
                    this.A06.release();
                    this.A06 = null;
                    InterfaceC0611By<YS> interfaceC0611By = this.A08;
                    if (interfaceC0611By != null && this.A09 != interfaceC0611By) {
                        try {
                            this.A0Z.ACM(interfaceC0611By);
                        } finally {
                        }
                    }
                } catch (Throwable th) {
                    this.A06 = null;
                    InterfaceC0611By<YS> interfaceC0611By2 = this.A08;
                    if (interfaceC0611By2 != null && this.A09 != interfaceC0611By2) {
                        try {
                            this.A0Z.ACM(interfaceC0611By2);
                        } finally {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    this.A06.release();
                    this.A06 = null;
                    InterfaceC0611By<YS> interfaceC0611By3 = this.A08;
                    if (interfaceC0611By3 != null && this.A09 != interfaceC0611By3) {
                        try {
                            this.A0Z.ACM(interfaceC0611By3);
                        } finally {
                        }
                    }
                    throw th2;
                } catch (Throwable th3) {
                    this.A06 = null;
                    InterfaceC0611By<YS> interfaceC0611By4 = this.A08;
                    if (interfaceC0611By4 != null && this.A09 != interfaceC0611By4) {
                        try {
                            this.A0Z.ACM(interfaceC0611By4);
                        } finally {
                        }
                    }
                    throw th3;
                }
            }
        }
    }

    public void A1J() throws C05699z {
    }

    public final void A1K() throws C05699z {
        Format format;
        long jElapsedRealtime;
        if (this.A06 != null || (format = this.A07) == null) {
            return;
        }
        this.A08 = this.A09;
        String str = format.A0O;
        MediaCrypto mediaCryptoA00 = null;
        boolean zA01 = false;
        InterfaceC0611By<YS> interfaceC0611By = this.A08;
        if (interfaceC0611By != null) {
            YS ys = (YS) interfaceC0611By.A6Z();
            if (A0e[5].charAt(22) == 'm') {
                throw new RuntimeException();
            }
            String[] strArr = A0e;
            strArr[1] = "HTFGGBgFgI6ylI68q0FeBZ95y7T9Xgss";
            strArr[6] = "P6HI8GYxdJJ1MGo6JXYXPe6FB7j5p6fI";
            if (ys == null) {
                if (this.A08.A6D() == null) {
                    return;
                }
            } else {
                mediaCryptoA00 = ys.A00();
                zA01 = ys.A01(str);
            }
            if (A0n()) {
                int iA75 = this.A08.A75();
                if (iA75 == 1) {
                    throw C05699z.A01(this.A08.A6D(), A10());
                }
                if (A0e[7].charAt(4) != 'H') {
                    if (iA75 != 4) {
                        return;
                    }
                } else {
                    String[] strArr2 = A0e;
                    strArr2[7] = "zdcyHT7sTCB3al7NiJFn52Vz5qRveBVU";
                    strArr2[7] = "zdcyHT7sTCB3al7NiJFn52Vz5qRveBVU";
                    if (iA75 != 4) {
                        return;
                    }
                }
            }
        }
        if (this.A0A == null) {
            try {
                this.A0A = A1G(this.A0a, this.A07, zA01);
                if (this.A0A == null && zA01) {
                    this.A0A = A1G(this.A0a, this.A07, false);
                    if (this.A0A != null) {
                        Log.w(A0a(175, 18, 36), A0a(101, 40, 114) + str + A0a(0, 6, 116) + A0a(670, 52, 100) + this.A0A.A02 + A0a(6, 1, 76));
                    }
                }
            } catch (C0647Dm e2) {
                A0m(new C0640Df(this.A07, e2, zA01, -49998));
            }
            if (this.A0A == null) {
                A0m(new C0640Df(this.A07, (Throwable) null, zA01, -49999));
            }
        }
        if (!A1S(this.A0A)) {
            return;
        }
        String str2 = this.A0A.A02;
        this.A00 = A0X(str2);
        this.A0D = A0w(str2, this.A07);
        this.A0H = A0v(str2);
        this.A0G = A0s(this.A0A);
        this.A0E = A0t(str2);
        this.A0F = A0u(str2);
        this.A0I = A0x(str2, this.A07);
        try {
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            StringBuilder sb = new StringBuilder();
            String codecName = A0a(607, 12, 120);
            sb.append(codecName);
            sb.append(str2);
            String codecName2 = sb.toString();
            C0781Iy.A02(codecName2);
            this.A06 = MediaCodec.createByCodecName(str2);
            C0781Iy.A00();
            String codecName3 = A0a(593, 14, 72);
            C0781Iy.A02(codecName3);
            A1P(this.A0A, this.A06, this.A07, mediaCryptoA00);
            C0781Iy.A00();
            String codecName4 = A0a(722, 10, 17);
            C0781Iy.A02(codecName4);
            this.A06.start();
            C0781Iy.A00();
            long jElapsedRealtime3 = SystemClock.elapsedRealtime();
            A1Q(str2, jElapsedRealtime3, jElapsedRealtime3 - jElapsedRealtime2);
            A0d();
        } catch (Exception e3) {
            A0m(new C0640Df(this.A07, e3, zA01, str2));
        }
        if (A75() == 2) {
            jElapsedRealtime = SystemClock.elapsedRealtime() + 1000;
        } else {
            jElapsedRealtime = -9223372036854775807L;
        }
        this.A05 = jElapsedRealtime;
        A0i();
        A0j();
        this.A0Q = true;
        this.A0U.A00++;
    }

    public void A1L(long j2) {
    }

    public void A1M(MediaCodec mediaCodec, MediaFormat mediaFormat) throws C05699z {
    }

    public void A1N(Format format) throws C05699z {
        MediaCodec mediaCodec;
        int iA1C;
        Format format2 = this.A07;
        this.A07 = format;
        if (!J1.A0k(this.A07.A0H, format2 == null ? null : format2.A0H)) {
            if (this.A07.A0H != null) {
                InterfaceC0612Bz<YS> interfaceC0612Bz = this.A0Z;
                if (A0e[5].charAt(22) != 'm') {
                    String[] strArr = A0e;
                    strArr[4] = "js0xY6djzstMh1ZGSSFwxrm9J2KEODfF";
                    strArr[2] = "gNDkR57A7pqknHdJ9eFPG5bc7UDUELIy";
                    if (interfaceC0612Bz != null) {
                        Looper looperMyLooper = Looper.myLooper();
                        DrmInitData drmInitData = this.A07.A0H;
                        if (A0e[5].charAt(22) != 'm') {
                            String[] strArr2 = A0e;
                            strArr2[7] = "L1yeHoCGmaJe3p3nUxagVjwy9TYWwSRI";
                            strArr2[7] = "L1yeHoCGmaJe3p3nUxagVjwy9TYWwSRI";
                            this.A09 = interfaceC0612Bz.A2Q(looperMyLooper, drmInitData);
                            InterfaceC0611By<YS> interfaceC0611By = this.A09;
                            if (interfaceC0611By == this.A08) {
                                InterfaceC0612Bz<YS> interfaceC0612Bz2 = this.A0Z;
                                String[] strArr3 = A0e;
                                if (strArr3[1].charAt(9) == strArr3[6].charAt(9)) {
                                    throw new RuntimeException();
                                }
                                String[] strArr4 = A0e;
                                strArr4[1] = "PNJFXv8k8SK4Yjj8VNQjLQpnTp0fAy1J";
                                strArr4[6] = "VCM67JEqNnPycf67Mw9BgN4gUhlxC0Ru";
                                interfaceC0612Bz2.ACM(interfaceC0611By);
                            }
                        }
                    } else {
                        throw C05699z.A01(new IllegalStateException(A0a(141, 34, 103)), A10());
                    }
                }
                throw new RuntimeException();
            }
            this.A09 = null;
        }
        boolean z = false;
        if (this.A09 == this.A08 && (mediaCodec = this.A06) != null && (iA1C = A1C(mediaCodec, this.A0A, format2, this.A07)) != 0) {
            if (iA1C == 1) {
                z = true;
            } else if (iA1C == 3) {
                z = true;
                this.A0L = true;
                this.A01 = 1;
                int i2 = this.A00;
                this.A0C = i2 == 2 || (i2 == 1 && this.A07.A0F == format2.A0F && this.A07.A08 == format2.A08);
            } else {
                throw new IllegalStateException();
            }
        }
        if (!z) {
            if (this.A0J) {
                this.A02 = 1;
            } else {
                A1I();
                A1K();
            }
        }
    }

    public void A1O(YH yh) {
    }

    public void A1Q(String str, long j2, long j3) {
    }

    public boolean A1S(C0638Dd c0638Dd) {
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.Y0
    public boolean A7e() {
        return this.A0N;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0074  */
    @Override // com.facebook.ads.redexgen.X.Y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A7m() {
        /*
            r6 = this;
            com.facebook.ads.internal.exoplayer2.Format r0 = r6.A07
            if (r0 == 0) goto L92
            boolean r3 = r6.A0R
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C3S.A0e
            r0 = 5
            r1 = r1[r0]
            r0 = 22
            char r1 = r1.charAt(r0)
            r0 = 109(0x6d, float:1.53E-43)
            if (r1 == r0) goto L94
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C3S.A0e
            java.lang.String r1 = "4HO9JQHKOwc6R3VWcS8R4aXAnHys3aci"
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = "eJ1ha0lSNb53SSfCNHliM2QVteujQRGV"
            r0 = 6
            r2[r0] = r1
            if (r3 != 0) goto L92
            boolean r0 = r6.A1A()
            if (r0 != 0) goto L7e
            boolean r3 = r6.A0p()
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C3S.A0e
            r0 = 3
            r1 = r2[r0]
            r0 = 0
            r2 = r2[r0]
            r0 = 8
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L8f
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C3S.A0e
            java.lang.String r1 = "OQSQFxnlZZo22DxvkKeXHq8FF7pzfl1u"
            r0 = 5
            r2[r0] = r1
            java.lang.String r1 = "OQSQFxnlZZo22DxvkKeXHq8FF7pzfl1u"
            r0 = 5
            r2[r0] = r1
            if (r3 != 0) goto L7e
        L4f:
            long r4 = r6.A05
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C3S.A0e
            r0 = 7
            r1 = r1[r0]
            r0 = 4
            char r1 = r1.charAt(r0)
            r0 = 72
            if (r1 == r0) goto L80
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C3S.A0e
            java.lang.String r1 = "x7dDRka8TdETs6VLaaF6zooftcMnhKq2"
            r0 = 4
            r2[r0] = r1
            java.lang.String r1 = "EId5jOcDiZLe1q4ZwHFfLyVQFAikb5sI"
            r0 = 2
            r2[r0] = r1
            if (r3 == 0) goto L92
        L74:
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r1 = r6.A05
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L92
        L7e:
            r0 = 1
        L7f:
            return r0
        L80:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C3S.A0e
            java.lang.String r1 = "3vglA6G8yuA12iVw0aFHPuEKtU4GGV7V"
            r0 = 3
            r2[r0] = r1
            java.lang.String r1 = "dEcUfU5Lns9loW0elZLaj7FKzckicWHS"
            r0 = 0
            r2[r0] = r1
            if (r3 == 0) goto L92
            goto L74
        L8f:
            if (r3 != 0) goto L7e
            goto L4f
        L92:
            r0 = 0
            goto L7f
        L94:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C3S.A7m():boolean");
    }

    @Override // com.facebook.ads.redexgen.X.Y0
    public final void ACT(long j2, long j3) throws C05699z {
        if (this.A0N) {
            A1J();
            return;
        }
        if (this.A07 == null) {
            this.A0Y.A07();
            int iA12 = A12(this.A0W, this.A0Y, true);
            if (iA12 == -5) {
                A1N(this.A0W.A00);
            } else {
                if (iA12 == -4) {
                    IM.A04(this.A0Y.A04());
                    this.A0M = true;
                    A0e();
                    String[] strArr = A0e;
                    if (strArr[3].charAt(8) == strArr[0].charAt(8)) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A0e;
                    strArr2[7] = "aKhyH6I995l1LklLucgRLjJ4pFFWcDrl";
                    strArr2[7] = "aKhyH6I995l1LklLucgRLjJ4pFFWcDrl";
                    return;
                }
                return;
            }
        }
        A1K();
        if (this.A06 != null) {
            C0781Iy.A02(A0a(619, 12, 16));
            while (A0r(j2, j3)) {
            }
            while (A0o()) {
            }
            C0781Iy.A00();
        } else {
            this.A0U.A07 += A11(j2);
            this.A0Y.A07();
            int iA122 = A12(this.A0W, this.A0Y, false);
            if (iA122 == -5) {
                AC ac = this.A0W;
                if (A0e[7].charAt(4) != 'H') {
                    throw new RuntimeException();
                }
                String[] strArr3 = A0e;
                strArr3[7] = "H5HsHl4f2eN3vdaE4L0NqH64hfjdivD8";
                strArr3[7] = "H5HsHl4f2eN3vdaE4L0NqH64hfjdivD8";
                A1N(ac.A00);
            } else if (iA122 == -4) {
                IM.A04(this.A0Y.A04());
                this.A0M = true;
                A0e();
            }
        }
        this.A0U.A00();
    }

    @Override // com.facebook.ads.redexgen.X.AX
    public final int ADV(Format format) throws C05699z {
        try {
            return A1D(this.A0a, this.A0Z, format);
        } catch (C0647Dm e2) {
            throw C05699z.A01(e2, A10());
        }
    }

    @Override // com.facebook.ads.redexgen.X.D0, com.facebook.ads.redexgen.X.AX
    public final int ADX() {
        return 8;
    }
}
