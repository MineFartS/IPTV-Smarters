package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Kx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@SuppressLint({"CatchGeneralException"})
public abstract class AbstractRunnableC0829Kx implements Runnable {
    public static byte[] A01;
    public static final AtomicBoolean A02;
    public static final AtomicBoolean A03;
    public static final AtomicReference<InterfaceC0820Kn> A04;

    @Nullable
    public final C0818Kl A00;

    public static String A02(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 116);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A01 = new byte[]{124, 91, 64, 64, 79, 76, 66, 75, DateTimeFieldType.HOUR_OF_HALFDAY, 77, 92, 75, 79, 90, 75, 74, 0, DateTimeFieldType.HOUR_OF_HALFDAY, 122, 70, 92, 75, 79, 74, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.HOUR_OF_HALFDAY};
    }

    public abstract void A07();

    static {
        A03();
        A02 = new AtomicBoolean();
        A03 = new AtomicBoolean(false);
        A04 = new AtomicReference<>();
    }

    public AbstractRunnableC0829Kx() {
        if (A03.get()) {
            this.A00 = L2.A01(new L1(A02(0, 26, 90) + Thread.currentThread().getName()));
            return;
        }
        this.A00 = null;
    }

    public static void A04(boolean z) {
        A03.set(z);
    }

    public static void A05(boolean z, InterfaceC0820Kn interfaceC0820Kn) {
        A02.set(z);
        A04.set(interfaceC0820Kn);
    }

    @Nullable
    public final C0818Kl A06() {
        return this.A00;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            if (A03.get()) {
                L2.A04(this);
            }
            try {
                A07();
            } catch (Throwable th) {
                if (A02.get()) {
                    L4.A00().A7x(3301, th);
                    InterfaceC0820Kn interfaceC0820Kn = A04.get();
                    if (interfaceC0820Kn != null) {
                        interfaceC0820Kn.ACU(th, this);
                    }
                } else {
                    throw th;
                }
            }
            if (A03.get()) {
                L2.A05(this);
            }
        } catch (Throwable t) {
            C0822Kp.A00(t, this);
        }
    }
}
