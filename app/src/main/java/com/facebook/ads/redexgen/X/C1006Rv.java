package com.facebook.ads.redexgen.X;

import android.view.View;
import com.facebook.ads.AdError;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Rv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1006Rv implements InterfaceC03460v {
    public static byte[] A02;
    public static String[] A03;
    public final /* synthetic */ C0680Ex A00;
    public final /* synthetic */ Runnable A01;

    static {
        A02();
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            byte b2 = (byte) ((bArrCopyOfRange[i5] - i4) - 16);
            if (A03[2].charAt(4) == 'y') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[5] = "2VG06oAYTcRzKBDE7gWFCU36hzL5px1b";
            strArr[7] = "j1xG2z3v9jq0UO66H2WqYNbpklLAu6IG";
            bArrCopyOfRange[i5] = b2;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{114, 111, 119, 116, -95, 110, 113, -96, -124, -93, -80, -80, -89, -76, 98, -85, -81, -78, -76, -89, -75, -75, -85, -79, -80, 98, -88, -85, -76, -89, -90, -118, -119, 93, 124, -119, -119, -128, -115, 103, -118, -126, -126, -124, -119, -126, 100, -120, -117, -115, -128, -114, -114, -124, -118, -119};
    }

    public static void A02() {
        A03 = new String[]{"7FIKHU9lgq27", "AgQqvAltXhi1bYF8zppFCZ", "CRAmwsbXNtyv0vmCJJ9qOPCwxUiND3E6", "ItQqdqoRYHMWKQzbVRTeHzNwEAi", "W2szVhKnaW", "HNVKE5hkEvipBMdeuLWXlSQ07SgK2Jmi", "9NOG2BA2dnlUEqMWgY53wMXC47FXKBrl", "EneshuO9jiHnlHF2bjWwp7WA0EKVaMOF"};
    }

    public C1006Rv(C0680Ex c0680Ex, Runnable runnable) {
        this.A00 = c0680Ex;
        this.A01 = runnable;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03460v
    public final void A95(RY ry) {
        this.A00.A00.A0A().A3k();
        this.A00.A07.A0B();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03460v
    public final void A96(RY ry, View view) {
        this.A00.A00.A0A().A3j(ry == this.A00.A01);
        if (ry != this.A00.A01) {
            return;
        }
        this.A00.A0G().removeCallbacks(this.A01);
        InterfaceC03380n interfaceC03380n = this.A00.A02;
        C0680Ex c0680Ex = this.A00;
        c0680Ex.A02 = ry;
        ((AbstractC1010Rz) c0680Ex).A00 = view;
        if (!c0680Ex.A0D) {
            this.A00.A07.A0E(ry);
        } else {
            this.A00.A07.A0D(view);
            this.A00.A0P(interfaceC03380n);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03460v
    public final void A97(RY ry, AdError adError) {
        this.A00.A00.A0A().A3l(ry == this.A00.A01, adError.getErrorCode());
        if (ry != this.A00.A01) {
            return;
        }
        this.A00.A0G().removeCallbacks(this.A01);
        this.A00.A0P(ry);
        this.A00.A0O();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03460v
    public final void A98(RY ry) {
        KL.A05(A00(31, 25, 11), A00(8, 23, 50), A00(0, 8, 46));
        this.A00.A00.A0A().A3m();
        this.A00.A07.A0C();
        this.A00.A0M();
    }
}
