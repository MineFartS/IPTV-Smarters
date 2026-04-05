package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class SB implements InterfaceC03761z {
    public static byte[] A05;
    public final InterfaceC03661p A00;
    public final X2 A01;
    public final String A02 = UUID.randomUUID().toString();
    public final Handler A03;
    public final InterfaceC03711u A04;

    static {
        A03();
    }

    public static String A02(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 36);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A05 = new byte[]{-65, -46, -53, -63, -55, -62, -36, -62, -43, -47, -49, -66, -48, -36, -56, -62, -42, -46, -41, -35, -24, -50, -37, -37, -40, -37, -24, -52, -40, -51, -50, -24, -44, -50, -30, -83, -82, -84, -71, -101, -98, -71, -93, -98, -71, -91, -97, -77, -24, -23, -25, -12, -38, -25, -25, -28, -25, -12, -30, -38, -24, -24, -42, -36, -38, -12, -32, -38, -18};
    }

    public abstract void A05();

    public SB(X2 x2, InterfaceC03721v interfaceC03721v) {
        this.A01 = x2;
        DynamicLoaderFactory.makeLoader(this.A01).getInitApi().onAdLoadInvoked(this.A01);
        this.A00 = new S8(x2, this);
        this.A03 = new Handler(Looper.getMainLooper());
        this.A04 = interfaceC03721v.A4M(this.A00, this);
    }

    public final void A04() {
        if (!JT.A0j(this.A01)) {
            return;
        }
        ExecutorC0851Lu.A00(new SA(this));
    }

    public final void A06(int i2, AdErrorType adErrorType, @Nullable String str) {
        Bundle bundle = new Bundle();
        String strA02 = A02(48, 21, 113);
        if (str != null) {
            bundle.putString(strA02, str);
        } else {
            bundle.putString(strA02, adErrorType.getDefaultErrorMessage());
        }
        bundle.putInt(A02(17, 18, 101), adErrorType.getErrorCode());
        AAF(i2, this.A02, bundle);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03761z
    public final void AAF(int i2, String str, @Nullable Bundle bundle) {
        Message messageObtain = Message.obtain((Handler) null, i2);
        messageObtain.getData().putString(A02(35, 13, 54), str);
        if (bundle != null) {
            messageObtain.getData().putBundle(A02(0, 17, 89), bundle);
        }
        this.A03.post(new S9(this, messageObtain));
    }
}
