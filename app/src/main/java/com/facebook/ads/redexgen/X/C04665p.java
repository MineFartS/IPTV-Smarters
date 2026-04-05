package com.facebook.ads.redexgen.X;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import com.facebook.ads.internal.api.BidderTokenProviderApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C04665p implements BidderTokenProviderApi {
    public static byte[] A03;
    public X3 A00;
    public String A01;

    @VisibleForTesting
    public final C0833Lb A02 = new C0833Lb(300000000000L, new C1045Tk(this));

    static {
        A03();
    }

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 5);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{-100, -87, -100, -89, -86, -94, 112, 103, 118, 121, 113, 116, 109, -127, 118, 123, 114, 103, 119, 105, 119, 119, 109, 115, 114, -125, 120, 109, 113, 105};
    }

    public static AnonymousClass94 A00(X3 x3) {
        return JT.A0n(x3) ? AnonymousClass95.A01(A01(0, 6, 86), A01(18, 12, 31), A01(6, 12, 29)) : AnonymousClass95.A00();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02() {
        X3 x3;
        synchronized (this) {
            x3 = this.A00;
        }
        if (x3 == null) {
            return;
        }
        String strA78 = AnonymousClass97.A00().A02(x3, true).A78(A00(x3));
        synchronized (this) {
            this.A01 = strA78;
        }
    }

    public final void A05() {
        this.A02.A05();
    }

    @Override // com.facebook.ads.internal.api.BidderTokenProviderApi
    public final synchronized String getBidderToken(Context context) {
        this.A00 = AnonymousClass52.A07(context);
        DynamicLoaderFactory.makeLoader(this.A00).getInitApi().maybeAttachCrashListener(this.A00);
        if (C1140Xb.A02().A0B(this.A00).ADC() || this.A01 == null) {
            A02();
            this.A02.A04().A03();
        }
        this.A02.A06();
        return this.A01;
    }
}
