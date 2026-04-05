package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.Nullable;
import com.facebook.ads.redexgen.X.InterfaceC0751Hu;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ht, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@SuppressLint({"HandlerLeak"})
public final class HandlerC0750Ht<T extends InterfaceC0751Hu> extends Handler implements Runnable {
    public static byte[] A0A;
    public int A00;

    @Nullable
    public InterfaceC0749Hs<T> A01;
    public IOException A02;
    public final int A03;
    public final long A04;
    public final T A05;
    public volatile Thread A06;
    public volatile boolean A07;
    public volatile boolean A08;
    public final /* synthetic */ C1302bR A09;

    static {
        A04();
    }

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0A, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 16);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A0A = new byte[]{-96, -61, -75, -72, -88, -75, -57, -65, -113, -75, -76, -113, -90, -115, -91, -83, -81, -78, -71, 96, -91, -78, -78, -81, -78, 96, -84, -81, -95, -92, -87, -82, -89, 96, -77, -76, -78, -91, -95, -83, -70, -45, -54, -35, -43, -54, -56, -39, -54, -55, -123, -54, -41, -41, -44, -41, -123, -47, -44, -58, -55, -50, -45, -52, -123, -40, -39, -41, -54, -58, -46, -87, -62, -71, -52, -60, -71, -73, -56, -71, -72, 116, -71, -52, -73, -71, -60, -56, -67, -61, -62, 116, -68, -75, -62, -72, -64, -67, -62, -69, 116, -64, -61, -75, -72, 116, -73, -61, -63, -60, -64, -71, -56, -71, -72, -38, -13, -22, -3, -11, -22, -24, -7, -22, -23, -91, -22, -3, -24, -22, -11, -7, -18, -12, -13, -91, -15, -12, -26, -23, -18, -13, -20, -91, -8, -7, -9, -22, -26, -14, -94, -91, -105, -102, 112};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Hs != com.facebook.ads.internal.exoplayer2.upstream.Loader$Callback<T extends com.facebook.ads.redexgen.X.Hu> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ht != com.facebook.ads.internal.exoplayer2.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.Hu> */
    public HandlerC0750Ht(C1302bR c1302bR, Looper looper, T loadable, InterfaceC0749Hs<T> interfaceC0749Hs, int i2, long j2) {
        super(looper);
        this.A09 = c1302bR;
        this.A05 = loadable;
        this.A01 = interfaceC0749Hs;
        this.A03 = i2;
        this.A04 = j2;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ht != com.facebook.ads.internal.exoplayer2.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.Hu> */
    private long A00() {
        return Math.min((this.A00 - 1) * 1000, 5000);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ht != com.facebook.ads.internal.exoplayer2.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.Hu> */
    private void A02() {
        this.A02 = null;
        this.A09.A02.execute(this.A09.A00);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ht != com.facebook.ads.internal.exoplayer2.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.Hu> */
    private void A03() {
        this.A09.A00 = null;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ht != com.facebook.ads.internal.exoplayer2.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.Hu> */
    public final void A05(int i2) throws IOException {
        IOException iOException = this.A02;
        if (iOException == null || this.A00 <= i2) {
        } else {
            throw iOException;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ht != com.facebook.ads.internal.exoplayer2.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.Hu> */
    public final void A06(long j2) {
        IM.A04(this.A09.A00 == null);
        this.A09.A00 = this;
        if (j2 > 0) {
            sendEmptyMessageDelayed(0, j2);
        } else {
            A02();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ht != com.facebook.ads.internal.exoplayer2.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.Hu> */
    public final void A07(boolean z) {
        this.A08 = z;
        this.A02 = null;
        if (hasMessages(0)) {
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
            }
        } else {
            this.A07 = true;
            this.A05.A3y();
            if (this.A06 != null) {
                this.A06.interrupt();
            }
        }
        if (z) {
            A03();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.A01.AA1(this.A05, jElapsedRealtime, jElapsedRealtime - this.A04, true);
            this.A01 = null;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ht != com.facebook.ads.internal.exoplayer2.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.Hu> */
    @Override // android.os.Handler
    public final void handleMessage(Message message) throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            if (this.A08) {
                return;
            }
            if (message.what == 0) {
                A02();
                return;
            }
            if (message.what != 4) {
                A03();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j2 = jElapsedRealtime - this.A04;
                if (this.A07) {
                    this.A01.AA1(this.A05, jElapsedRealtime, j2, false);
                    return;
                }
                int i2 = message.what;
                if (i2 == 1) {
                    this.A01.AA1(this.A05, jElapsedRealtime, j2, false);
                    return;
                }
                if (i2 == 2) {
                    try {
                        this.A01.AA3(this.A05, jElapsedRealtime, j2);
                        return;
                    } catch (RuntimeException e2) {
                        Log.e(A01(0, 8, 68), A01(71, 44, 68), e2);
                        this.A09.A01 = new C0755Hy(e2);
                        return;
                    }
                }
                if (i2 != 3) {
                    return;
                }
                this.A02 = (IOException) message.obj;
                int iAA4 = this.A01.AA4(this.A05, jElapsedRealtime, j2, this.A02);
                if (iAA4 != 3) {
                    if (iAA4 == 2) {
                        return;
                    }
                    this.A00 = iAA4 == 1 ? 1 : this.A00 + 1;
                    A06(A00());
                    return;
                }
                this.A09.A01 = this.A02;
                return;
            }
            throw ((Error) message.obj);
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ht != com.facebook.ads.internal.exoplayer2.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.Hu> */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        String strA01 = A01(0, 8, 68);
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            try {
                try {
                    try {
                        try {
                            this.A06 = Thread.currentThread();
                            if (!this.A07) {
                                C0781Iy.A02(A01(150, 5, 38) + this.A05.getClass().getSimpleName());
                                try {
                                    this.A05.A7u();
                                } finally {
                                    C0781Iy.A00();
                                }
                            }
                            if (!this.A08) {
                                sendEmptyMessage(2);
                            }
                        } catch (Error e2) {
                            Log.e(strA01, A01(40, 31, 85), e2);
                            if (!this.A08) {
                                obtainMessage(4, e2).sendToTarget();
                            }
                            throw e2;
                        } catch (InterruptedException unused) {
                            IM.A04(this.A07);
                            if (!this.A08) {
                                sendEmptyMessage(2);
                            }
                        }
                    } catch (OutOfMemoryError e3) {
                        Log.e(strA01, A01(8, 32, 48), e3);
                        if (!this.A08) {
                            obtainMessage(3, new C0755Hy(e3)).sendToTarget();
                        }
                    }
                } catch (Exception e4) {
                    Log.e(strA01, A01(115, 35, 117), e4);
                    if (!this.A08) {
                        obtainMessage(3, new C0755Hy(e4)).sendToTarget();
                    }
                }
            } catch (IOException e5) {
                if (!this.A08) {
                    obtainMessage(3, e5).sendToTarget();
                }
            }
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }
}
