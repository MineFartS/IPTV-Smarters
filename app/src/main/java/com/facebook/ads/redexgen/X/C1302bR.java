package com.facebook.ads.redexgen.X;

import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1302bR implements InterfaceC0756Hz {
    public static String[] A03;
    public HandlerC0750Ht<? extends InterfaceC0751Hu> A00;
    public IOException A01;
    public final ExecutorService A02;

    static {
        A04();
    }

    public static void A04() {
        A03 = new String[]{"zA1HDLVhPd9PsL9PenCbpcrAKXxlN0d6", "FLS1DqH1RbizqOpj", "1z8O9NEtb5xyjYGA", "8w8GUSv0BTEQmaLhHrYTkFjQIFXWxu0p", "o1jGjvwpoOOHSDmJh0w1BZ4ZQReO8O7V", BuildConfig.FLAVOR, "IXAYHKYtOagUrLCRc2OBPi2ErH2JE5Q2", "ufrZt7t49gDVq6vRzV1VlqPqnp3Kfu3W"};
    }

    public C1302bR(String str) {
        this.A02 = J1.A0W(str);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Hs != com.facebook.ads.internal.exoplayer2.upstream.Loader$Callback<T extends com.facebook.ads.redexgen.X.Hu> */
    public final <T extends InterfaceC0751Hu> long A05(T loadable, InterfaceC0749Hs<T> interfaceC0749Hs, int i2) {
        Looper looperMyLooper = Looper.myLooper();
        IM.A04(looperMyLooper != null);
        this.A01 = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new HandlerC0750Ht(this, looperMyLooper, loadable, interfaceC0749Hs, i2, jElapsedRealtime).A06(0L);
        return jElapsedRealtime;
    }

    public final void A06() {
        this.A00.A07(false);
    }

    public final void A07(int i2) throws IOException {
        IOException iOException = this.A01;
        if (iOException == null) {
            HandlerC0750Ht<? extends InterfaceC0751Hu> handlerC0750Ht = this.A00;
            if (handlerC0750Ht != null) {
                if (A03[0].charAt(1) != 'f') {
                    String[] strArr = A03;
                    strArr[2] = "ShO16ogjgPVIHMzl";
                    strArr[1] = "8gZONBnlwtDMou1V";
                    if (i2 == Integer.MIN_VALUE) {
                        i2 = handlerC0750Ht.A03;
                    }
                    handlerC0750Ht.A05(i2);
                    return;
                }
                throw new RuntimeException();
            }
            return;
        }
        throw iOException;
    }

    public final void A08(@Nullable InterfaceC0752Hv interfaceC0752Hv) {
        HandlerC0750Ht<? extends InterfaceC0751Hu> handlerC0750Ht = this.A00;
        if (handlerC0750Ht != null) {
            handlerC0750Ht.A07(true);
        }
        if (interfaceC0752Hv != null) {
            this.A02.execute(new RunnableC0753Hw(interfaceC0752Hv));
        }
        this.A02.shutdown();
    }

    public final boolean A09() {
        return this.A00 != null;
    }
}
