package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class S7 implements AnonymousClass12 {
    public static byte[] A02;
    public static String[] A03;
    public final /* synthetic */ C0676Et A00;
    public final /* synthetic */ Runnable A01;

    static {
        A02();
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 97);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{83, 87, 87, 82, 83, 0, 2, 5, 112, 71, 85, 67, 80, 70, 71, 70, 2, 116, 75, 70, 71, 77, 2, 75, 79, 82, 80, 71, 81, 81, 75, 77, 76, 2, 68, 75, 80, 71, 70, 70, 71, 123, 76, 94, 72, 91, 77, 76, 77, 127, 64, 77, 76, 70, 104, 77, 101, 70, 78, 78, 64, 71, 78, 96, 68, 89, 91, 76, 90, 90, 64, 70, 71};
    }

    public static void A02() {
        A03 = new String[]{"gOGPE1XGqnroAJihU7XGAfTAdWa21jWC", "Kcs30m2Uc1eFMAQARd2pOhOOSRswugkg", "xkwB", "vFLx4ryI8nKhSFQKGVnAMH5qObxMihWN", "NnwKyO2XMzRH0BXfVduboZ9DAJ5a5svW", "U3uRLxNZuwH", "U9y6Wp3Jad2LD1", "sOAhAPVwmiqriGnbgM61Uai8lTIQh97W"};
    }

    public S7(C0676Et c0676Et, Runnable runnable) {
        this.A00 = c0676Et;
        this.A01 = runnable;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass12
    public final void AAo(AbstractC0992Rh abstractC0992Rh) {
        this.A00.A07.A05();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass12
    public final void AAp(AbstractC0992Rh abstractC0992Rh) {
        this.A00.A07.A06();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass12
    public final void AAq(AbstractC0992Rh abstractC0992Rh) {
        this.A00.A07.A0B();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass12
    public final void AAr(AbstractC0992Rh abstractC0992Rh) {
        this.A00.A0G().removeCallbacks(this.A01);
        C0676Et c0676Et = this.A00;
        c0676Et.A02 = abstractC0992Rh;
        super/*com.facebook.ads.redexgen.X.Rz*/.A0J();
        this.A00.A07.A0E(abstractC0992Rh);
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass12
    public final void AAs(AbstractC0992Rh abstractC0992Rh) {
        KL.A05(A00(39, 34, 72), A00(8, 31, 67), A00(0, 8, 7));
        this.A00.A07.A0C();
        this.A00.A0M();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass12
    public final void AAt(AbstractC0992Rh abstractC0992Rh) {
        this.A00.A07.A07();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass12
    public final void AAu(AbstractC0992Rh abstractC0992Rh, AdError adError) {
        this.A00.A0G().removeCallbacks(this.A01);
        this.A00.A0C.A0A().A4Z(adError.getErrorCode(), adError.getErrorMessage());
        if (AdError.AD_PRESENTATION_ERROR.equals(adError) && JT.A14(this.A00.A0C)) {
            this.A00.A07.A0F(K7.A01(AdErrorType.AD_PRESENTATION_ERROR));
        } else {
            C0676Et c0676Et = this.A00;
            if (A03[2].length() != 4) {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[2] = "s57s";
            strArr[2] = "s57s";
            c0676Et.A07.A0F(K7.A01(AdErrorType.INTERNAL_ERROR));
        }
        this.A00.A0P(abstractC0992Rh);
        this.A00.A0O();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass12
    public final void onRewardedVideoActivityDestroyed() {
        this.A00.A07.A08();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass12
    public final void onRewardedVideoClosed() {
        this.A00.A07.A09();
    }
}
