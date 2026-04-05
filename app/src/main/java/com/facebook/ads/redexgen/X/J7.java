package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.checkerframework.checker.nullness.qual.MonotonicNonNull;
import com.facebook.ads.internal.exoplayer2.video.DummySurface;
import java.util.Arrays;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class J7 extends HandlerThread implements Handler.Callback {
    public static byte[] A05;
    public static String[] A06;

    @MonotonicNonNull
    public Handler A00;

    @MonotonicNonNull
    public IW A01;

    @Nullable
    public DummySurface A02;

    @Nullable
    public Error A03;

    @Nullable
    public RuntimeException A04;

    static {
        A03();
        A02();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 34);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A05 = new byte[]{-37, 12, 4, 4, DateTimeFieldType.CLOCKHOUR_OF_DAY, -22, 12, 9, -3, -8, -6, -4, 105, -124, -116, -113, -120, -121, 67, -105, -110, 67, -116, -111, -116, -105, -116, -124, -113, -116, -99, -120, 67, -121, -104, -112, -112, -100, 67, -106, -104, -107, -119, -124, -122, -120, -67, -40, -32, -29, -36, -37, -105, -21, -26, -105, -23, -36, -29, -36, -40, -22, -36, -105, -37, -20, -28, -28, -16, -105, -22, -20, -23, -35, -40, -38, -36, -84, -67, -75, -75, -63, -101, -67, -70, -82, -87, -85, -83};
    }

    public static void A03() {
        A06 = new String[]{"L", "9k7Pg8ue4ZIXn9jDpJsIn7Y5i4sLfdQW", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "4SytZoOdC4egIy1bJES6fjmccl1RDrII", "b", "aqFbtiWePH", "f8vuNOtDeAKfZNviyc1t9DlvtFT95IRo"};
    }

    public J7() {
        super(A00(77, 12, 38));
    }

    private void A01() {
        IM.A01(this.A01);
        this.A01.A09();
    }

    private void A04(int i2) {
        IM.A01(this.A01);
        this.A01.A0A(i2);
        this.A02 = new DummySurface(this, this.A01.A08(), i2 != 0);
    }

    public final DummySurface A05(int i2) {
        start();
        this.A00 = new Handler(getLooper(), this);
        this.A01 = new IW(this.A00);
        boolean z = false;
        synchronized (this) {
            this.A00.obtainMessage(1, i2, 0).sendToTarget();
            while (this.A02 == null && this.A04 == null && this.A03 == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
        }
        if (z) {
            Thread threadCurrentThread = Thread.currentThread();
            String[] strArr = A06;
            if (strArr[1].charAt(24) == strArr[7].charAt(24)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[3] = BuildConfig.FLAVOR;
            strArr2[2] = BuildConfig.FLAVOR;
            threadCurrentThread.interrupt();
        }
        RuntimeException runtimeException = this.A04;
        if (runtimeException == null) {
            Error error = this.A03;
            if (error == null) {
                return (DummySurface) IM.A01(this.A02);
            }
            throw error;
        }
        throw runtimeException;
    }

    public final void A06() {
        IM.A01(this.A00);
        this.A00.sendEmptyMessage(2);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i2 = message.what;
        try {
            if (i2 != 1) {
                if (i2 != 2) {
                    return true;
                }
                try {
                    A01();
                } finally {
                    try {
                    } finally {
                    }
                }
                return true;
            }
            try {
                A04(message.arg1);
                synchronized (this) {
                    notify();
                }
            } catch (Error e2) {
                Log.e(A00(0, 12, 117), A00(12, 34, 1), e2);
                this.A03 = e2;
                synchronized (this) {
                    notify();
                }
            } catch (RuntimeException e3) {
                Log.e(A00(0, 12, 117), A00(12, 34, 1), e3);
                this.A04 = e3;
                synchronized (this) {
                    notify();
                }
            }
            return true;
        } catch (Throwable th) {
            synchronized (this) {
                notify();
                throw th;
            }
        }
    }
}
