package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6E, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C6E {
    public final C04715u A00;
    public final Map<Integer, C04776a> A01;
    public final AtomicBoolean A02 = new AtomicBoolean();

    public C6E(C04715u c04715u, Map<Integer, C04776a> map) {
        this.A00 = c04715u;
        this.A01 = map;
        this.A02.compareAndSet(false, true);
    }

    private int A00(int i2) {
        if (this.A00.A0e(i2) != null) {
            return this.A00.A0e(i2).intValue();
        }
        return this.A00.A0R();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.5z != com.facebook.ads.internal.botdetection.interval.buffer.CircularBuffer<com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef> */
    private synchronized void A01(AbstractC04956s abstractC04956s, C04776a c04776a) {
        int iA00 = c04776a.A00();
        Map<Integer, C04765z<AbstractC04956s>> mapA03 = C04826f.A01().A03();
        if (mapA03.containsKey(Integer.valueOf(iA00))) {
            C04765z<AbstractC04956s> c04765z = mapA03.get(Integer.valueOf(iA00));
            AbstractC04956s abstractC04956sA03 = c04765z != null ? c04765z.A03() : null;
            if (c04765z == null) {
                c04765z = new C04765z<>(A00(iA00));
            }
            if (!abstractC04956s.A0C(abstractC04956sA03, c04776a.A03())) {
                c04765z.A05(abstractC04956s);
                C04826f.A01().A04(iA00, c04765z, abstractC04956s.A06());
            }
        } else {
            C04765z<AbstractC04956s> c04765z2 = new C04765z<>(A00(iA00));
            c04765z2.A05(abstractC04956s);
            C04826f.A01().A04(iA00, c04765z2, abstractC04956s.A06());
        }
    }

    @SuppressLint({"CatchGeneralException"})
    public final void A02(AbstractC04956s abstractC04956s, C6D c6d) {
        if (!this.A02.get()) {
            return;
        }
        try {
            switch (c6d) {
                case A0E:
                    C04776a c04776a = this.A01.get(10800);
                    if (abstractC04956s == null || c04776a == null) {
                        return;
                    } else {
                        A01(abstractC04956s, c04776a);
                    }
                    break;
                case A03:
                    C04776a c04776a2 = this.A01.get(10810);
                    if (abstractC04956s == null || c04776a2 == null) {
                        return;
                    } else {
                        A01(abstractC04956s, c04776a2);
                    }
                    break;
                case A09:
                    C04776a c04776a3 = this.A01.get(10812);
                    if (abstractC04956s == null || c04776a3 == null) {
                        return;
                    } else {
                        A01(abstractC04956s, c04776a3);
                    }
                    break;
                case A06:
                    C04776a c04776a4 = this.A01.get(10813);
                    if (abstractC04956s == null || c04776a4 == null) {
                        return;
                    } else {
                        A01(abstractC04956s, c04776a4);
                    }
                    break;
                case A0A:
                    C04776a c04776a5 = this.A01.get(10814);
                    if (abstractC04956s == null || c04776a5 == null) {
                        return;
                    } else {
                        A01(abstractC04956s, c04776a5);
                    }
                    break;
                case A0B:
                    C04776a c04776a6 = this.A01.get(10815);
                    if (abstractC04956s == null || c04776a6 == null) {
                        return;
                    } else {
                        A01(abstractC04956s, c04776a6);
                    }
                    break;
                case A0D:
                    C04776a c04776a7 = this.A01.get(10816);
                    if (abstractC04956s == null || c04776a7 == null) {
                        return;
                    } else {
                        A01(abstractC04956s, c04776a7);
                    }
                    break;
                case A08:
                    C04776a c04776a8 = this.A01.get(10817);
                    if (abstractC04956s == null || c04776a8 == null) {
                        return;
                    } else {
                        A01(abstractC04956s, c04776a8);
                    }
                    break;
                case A05:
                    C04776a c04776a9 = this.A01.get(10818);
                    if (abstractC04956s == null || c04776a9 == null) {
                        return;
                    } else {
                        A01(abstractC04956s, c04776a9);
                    }
                    break;
                case A04:
                    C04776a c04776a10 = this.A01.get(10819);
                    if (abstractC04956s == null || c04776a10 == null) {
                        return;
                    } else {
                        A01(abstractC04956s, c04776a10);
                    }
                    break;
                case A0C:
                    C04776a c04776a11 = this.A01.get(10820);
                    if (abstractC04956s == null || c04776a11 == null) {
                        return;
                    } else {
                        A01(abstractC04956s, c04776a11);
                    }
                    break;
            }
        } catch (Throwable th) {
            AnonymousClass66.A04(th);
        }
    }
}
