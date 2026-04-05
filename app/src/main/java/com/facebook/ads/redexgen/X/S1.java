package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class S1 implements InterfaceC03480x {
    public static byte[] A02;
    public static String[] A03;
    public final /* synthetic */ C0679Ew A00;
    public final /* synthetic */ Runnable A01;

    static {
        A02();
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            int i6 = (bArrCopyOfRange[i5] ^ i4) ^ 34;
            String[] strArr = A03;
            if (strArr[5].charAt(5) == strArr[1].charAt(5)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[5] = "sVZQ6Ml9fBzEITS5ybXWTtwXQoWqWbAN";
            strArr2[1] = "MwEMOJFXQFuJpU8zWQ85tYeWswvxAO3B";
            bArrCopyOfRange[i5] = (byte) i6;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{104, 108, 56, 104, 56, 109, 58, 57, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 42, 47, 62, 58, 43, 60, 110, 39, 61, 110, 32, 59, 34, 34, 110, 33, 32, 110, 34, 33, 47, 42, 7, 32, 58, 43, 60, 61, 58, 39, 58, 39, 47, 34, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 42, 93, 122, 96, 113, 102, 103, 96, 125, 96, 125, 117, 120, 52, 125, 121, 100, 102, 113, 103, 103, 125, 123, 122, 52, 114, 125, 102, 113, 112, 106, 101, 111, 121, 100, 98, 111, 37, 98, 101, 127, 110, 101, 127, 37, 106, 104, 127, 98, 100, 101, 37, 93, 66, 78, 92, 47, 62, 39, 96, 97, 70, 97, 123, 106, 125, 124, 123, 102, 123, 102, 110, 99, 67, 96, 104, 104, 102, 97, 104, 70, 98, 127, 125, 106, 124, 124, 102, 96, 97};
    }

    public static void A02() {
        A03 = new String[]{"CodBKn6Rx4Nd2NCJ9VlYeJoUvBmT0K9p", "5Rf8WjvcJZOUdeEvkpnEyeT6h0OK8cqO", "9H9umRBAwWbsUQsHVAjP1GvoefoGWKiv", "nqryT6E7", "BkgpBj4q", "vUmBCwuwnOwC6wDkIlhiKnb32h6Srhe1", "47HB5bdSxtP74yDXUEGozfNjn4WOkRGN", "xids5JFtyjlo4uGEh5DI8Wwgi7h0jVQM"};
    }

    public S1(C0679Ew c0679Ew, Runnable runnable) {
        this.A00 = c0679Ew;
        this.A01 = runnable;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03480x
    public final void A9o(RZ rz, String str, boolean z) {
        this.A00.A07.A0B();
        boolean z2 = !TextUtils.isEmpty(str);
        if (z && z2) {
            Intent intent = new Intent(A00(74, 26, 41));
            intent.setData(Uri.parse(str));
            LB.A0C(this.A00.A0C, intent);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03480x
    public final void A9p(RZ rz) {
        this.A00.A07.A02();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03480x
    public final void A9q(RZ rz) {
        this.A00.A07.A04();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03480x
    public final void A9r(RZ rz) {
        if (rz != this.A00.A01) {
            return;
        }
        if (rz == null) {
            this.A00.A0C.A04().A86(A00(100, 3, 108), C05228d.A0M, new C05238e(A00(8, 37, 108)));
            A9s(rz, AdError.internalError(AdError.INTERNAL_ERROR_2004));
            return;
        }
        this.A00.A0G().removeCallbacks(this.A01);
        C0679Ew c0679Ew = this.A00;
        c0679Ew.A02 = rz;
        super/*com.facebook.ads.redexgen.X.Rz*/.A0J();
        this.A00.A07.A0E(rz);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03480x
    public final void A9s(RZ rz, AdError adError) {
        if (rz != this.A00.A01) {
            return;
        }
        this.A00.A0G().removeCallbacks(this.A01);
        this.A00.A0P(rz);
        if (!JT.A0i(this.A00.A0C)) {
            this.A00.A0O();
        }
        this.A00.A0C.A0A().A4Z(adError.getErrorCode(), adError.getErrorMessage());
        this.A00.A07.A0F(new K7(adError.getErrorCode(), adError.getErrorMessage()));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03480x
    public final void A9t(RZ rz) {
        KL.A05(A00(103, 31, 45), A00(45, 29, 54), A00(0, 8, 121));
        this.A00.A07.A0C();
        this.A00.A0M();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03480x
    public final void A9u() {
        this.A00.A07.A07();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03480x
    public final void A9v() {
        this.A00.A07.A05();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03480x
    public final void A9w() {
        this.A00.A07.A06();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03480x
    public final void onInterstitialActivityDestroyed() {
        this.A00.A07.A00();
    }
}
