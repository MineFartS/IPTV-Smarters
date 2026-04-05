package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Rw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1007Rw extends AbstractRunnableC0829Kx {
    public static byte[] A02;
    public static String[] A03;
    public final /* synthetic */ AbstractC1010Rz A00;
    public final /* synthetic */ C1256ah A01;

    static {
        A03();
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A03;
            if (strArr[4].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[0] = "oScLyKWb3fn2oYJPJdX8D34ZjyUzRvxz";
            strArr2[3] = "G9gk2wDsh72JfZvDy2Lys6UEtMP3Y1SB";
            if (i5 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 84);
            i5++;
        }
    }

    public static void A01() {
        A02 = new byte[]{51, 52, 44, 59, 54, 51, 62, 122, 42, 54, 59, 57, 63, 55, 63, 52, 46, 122, 51, 52, 122, 40, 63, 41, 42, 53, 52, 41, 63};
    }

    public static void A03() {
        A03 = new String[]{"rcAoHT8yzEEoCxFmEfFHXcUl0vjpGdgY", "LSTuq6Bu4IKsOuvOF", "N9ND8qL7XSSd32I", "yk3W1HvskfBH2x0X91qy9qW3VKhe7rxg", "6nHANpKnXNhaq6nYT", "xMxpxuwRsi8wtxmAob8T1Ch5JVdvxyTv", BuildConfig.FLAVOR, "PgJ"};
    }

    public C1007Rw(AbstractC1010Rz abstractC1010Rz, C1256ah c1256ah) {
        this.A00 = abstractC1010Rz;
        this.A01 = c1256ah;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0829Kx
    public final void A07() {
        C05408v c05408vA00 = this.A01.A00();
        if (c05408vA00 == null || c05408vA00.A05() == null) {
            String strA00 = A00(0, 29, 14);
            K7 k7 = new K7(AdErrorType.NO_AD_PLACEMENT, strA00);
            this.A00.A0C.A0A().A4Z(k7.A04().getErrorCode(), strA00);
            this.A00.A07.A0F(k7);
            return;
        }
        this.A00.A05 = c05408vA00;
        this.A00.A0O();
    }
}
