package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.facebook.ads.internal.exoplayer2.offline.DownloadAction;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class EU implements Runnable {
    public static byte[] A01;
    public final /* synthetic */ C0662Ed A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 116);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-73, -39, -22, -33, -27, -28, -106, -36, -33, -30, -37, -106, -30, -27, -41, -38, -33, -28, -35, -106, -36, -41, -33, -30, -37, -38, -92, -66, -23, -15, -24, -26, -23, -37, -34, -57, -37, -24, -37, -31, -33, -20};
    }

    public EU(C0662Ed c0662Ed) {
        this.A00 = c0662Ed;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        DownloadAction[] downloadActionArrA04;
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            try {
                downloadActionArrA04 = this.A00.A09.A04(this.A00.A0E);
            } catch (Throwable th) {
                Log.e(A00(27, 15, 6), A00(0, 27, 2), th);
                downloadActionArrA04 = new DownloadAction[0];
            }
            this.A00.A07.post(new ET(this, downloadActionArrA04));
        } catch (Throwable th2) {
            C0822Kp.A00(th2, this);
        }
    }
}
