package com.facebook.ads.redexgen.X;

import android.util.Base64;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1285bA extends AbstractRunnableC0829Kx {
    public static byte[] A02;
    public static String[] A03;
    public final /* synthetic */ KX A00;
    public final /* synthetic */ C0809Ka A01;

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
            if (strArr[2].charAt(31) == strArr[3].charAt(31)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[7] = "vKWhPjbFalI70MxhKihYQQhrE25QXeUX";
            strArr2[7] = "vKWhPjbFalI70MxhKihYQQhrE25QXeUX";
            if (i5 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 89);
            i5++;
        }
    }

    public static void A01() {
        A02 = new byte[]{-51, -85, -67, -96, -97, -84, -84, -93, -80, -67, -87, -93, -73};
    }

    public static void A03() {
        A03 = new String[]{"HdBP5Xz", "1x1Spdd4leaR6rMyIqz7jDuVALPBafGP", "axXL5TnL0HBMXsVKsrA9GDOWQxSG9OY6", "1dEgnVHIT0m43fI6JYH9hpNhfyiBWS6N", "iEi5yE", "UjLwzpYsoJIrFySVWBkKISpV5tCrd9dB", "Qbq65yz", "qKKFep347IAmJ8sue1lLg6VgEBnKG6W3"};
    }

    public C1285bA(C0809Ka c0809Ka, KX kx) {
        this.A01 = c0809Ka;
        this.A00 = kx;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0829Kx
    public final void A07() {
        C05318m.A08(this.A01.A05);
        C04525a.A08(this.A01.A05);
        boolean z = true;
        this.A01.A04 = this.A00.A09(AnonymousClass97.A00().A02(this.A01.A05, true).A6B());
        try {
            this.A01.A04.put(A00(1, 12, 5), new String(Base64.encode((this.A01.A05.getPackageName() + A00(0, 1, 84) + this.A01.A05.getPackageManager().getInstallerPackageName(this.A01.A05.getPackageName())).getBytes(), 2)));
        } catch (Exception unused) {
        }
        try {
            if (this.A00.A06() != KD.A04 && this.A00.A06() != KD.A06 && this.A00.A06() != KD.A05 && this.A00.A06() != null) {
                z = false;
            }
            QP.A02(z, this.A01.A05).ABh(this.A01.A07, new QL().A06(this.A01.A04).A09(), this.A01.A04(C0848Lr.A00()));
        } catch (Exception e2) {
            AdErrorType adErrorType = AdErrorType.AD_REQUEST_FAILED;
            String message = e2.getMessage();
            C0S c0sA0A = this.A01.A05.A0A();
            C0809Ka c0809Ka = this.A01;
            String errorMessage = A03[4];
            if (errorMessage.length() == 14) {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[0] = "AzlAWwW";
            strArr[6] = "AhjxiUn";
            c0sA0A.A2m(C0848Lr.A01(c0809Ka.A00), adErrorType.getErrorCode(), message, adErrorType.isPublicError());
            this.A01.A0G(K7.A02(adErrorType, message));
        }
    }
}
