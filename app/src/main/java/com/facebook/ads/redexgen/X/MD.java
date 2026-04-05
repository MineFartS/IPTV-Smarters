package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class MD {

    @Nullable
    public static MD A02;
    public final C1237aO A00;
    public final MF A01;

    public MD(X2 x2, Executor executor, C05408v c05408v) {
        this.A01 = new MF(x2);
        this.A00 = new C1237aO(executor, c05408v, x2);
    }

    private void A00() {
        this.A01.A03(this.A00);
    }

    public static void A01(X2 x2, Executor executor, C05408v c05408v) {
        if (!JT.A0t(x2)) {
            return;
        }
        MD md = A02;
        if (md == null) {
            A02 = new MD(x2, executor, c05408v);
            A02.A00();
        } else {
            md.A02(c05408v);
        }
    }

    private void A02(C05408v c05408v) {
        this.A00.A07(c05408v);
    }
}
