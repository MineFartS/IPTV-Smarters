package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C04826f {
    public final Map<Integer, C04765z<AbstractC04956s>> A00;

    @Nullable
    public static C04826f A02 = null;
    public static long A01 = 0;

    public C04826f(Map<Integer, C04765z<AbstractC04956s>> map) {
        this.A00 = map;
    }

    public static synchronized long A00() {
        return A01;
    }

    @SuppressLint({"UseSparseArrays"})
    public static C04826f A01() {
        if (A02 == null) {
            A02 = new C04826f(Collections.synchronizedMap(new HashMap()));
        }
        return A02;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.5z != com.facebook.ads.internal.botdetection.interval.buffer.CircularBuffer<com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef> */
    private synchronized void A02(C04765z<AbstractC04956s> c04765z, int i2) {
        int iA06 = 0;
        boolean z = false;
        if (c04765z.A01() == 0) {
            z = true;
            iA06 = c04765z.A02().A06();
        }
        int updatedSize = i2 - iA06;
        A01 += (long) ((z ? 0 : 4) + updatedSize);
    }

    @SuppressLint({"PublicMethodReturnMutableCollection"})
    public final Map<Integer, C04765z<AbstractC04956s>> A03() {
        return this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.5z != com.facebook.ads.internal.botdetection.interval.buffer.CircularBuffer<com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef> */
    public final synchronized void A04(int i2, C04765z<AbstractC04956s> c04765z, int i3) {
        this.A00.put(Integer.valueOf(i2), c04765z);
        A02(c04765z, i3);
    }
}
