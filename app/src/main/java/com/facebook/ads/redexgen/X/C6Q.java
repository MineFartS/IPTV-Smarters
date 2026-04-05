package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import java.util.List;
import java.util.Map;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6Q, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class C6Q {
    public static String[] A02;
    public final Context A00;
    public final C04715u A01;

    static {
        A01();
    }

    public static void A01() {
        A02 = new String[]{"HSkcF60AiAyYJizD2I8vIjqhfibhLk4F", "vdkNajAjw36u5RvY9xFki59AuKhwr3og", BuildConfig.FLAVOR, "sseZ8EdYk7i", "1PxOfa9BsFlCUZKt15VhEMgvVyvUPrjN", "QpqokUuVk7nKJb7TmK", "vU9iDbhGXBQk4voVJMEMlbxkWIFvNann", "KoP5O6PQnxDmDbSqeBv0xhaZ"};
    }

    public C6Q(Context context, C04715u c04715u) {
        this.A00 = context;
        this.A01 = c04715u;
    }

    private int A00(C04715u c04715u, C04776a c04776a) {
        if (c04715u.A0e(c04776a.A00()) != null) {
            return c04715u.A0e(c04776a.A00()).intValue();
        }
        if (c04776a.A03().contains(EnumC04846h.A0B)) {
            return c04715u.A0S();
        }
        if (c04776a.A03().contains(EnumC04846h.A08)) {
            return c04715u.A0R();
        }
        return c04715u.A0V();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.5z != com.facebook.ads.internal.botdetection.interval.buffer.CircularBuffer<com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef> */
    @SuppressLint({"CatchGeneralException"})
    public final synchronized void A02(EnumC04816e enumC04816e, List<C04776a> list) {
        AbstractC04956s abstractC04956sA04;
        Map<Integer, C04765z<AbstractC04956s>> mapA03 = C04826f.A01().A03();
        for (C04776a c04776a : list) {
            InterfaceC04806d signalExecutor = c04776a.A02(enumC04816e);
            if (signalExecutor != null) {
                try {
                    abstractC04956sA04 = signalExecutor.A51();
                } catch (Throwable th) {
                    abstractC04956sA04 = AnonymousClass71.A04(this.A00.getPackageName(), th);
                }
                if (abstractC04956sA04 != null && abstractC04956sA04.A08() != null) {
                    if (c04776a.A03().contains(EnumC04846h.A0B) && mapA03.containsKey(Integer.valueOf(c04776a.A00()))) {
                        C04765z<AbstractC04956s> c04765z = mapA03.get(Integer.valueOf(c04776a.A00()));
                        AbstractC04956s abstractC04956sA03 = c04765z != null ? c04765z.A03() : null;
                        if (c04765z == null) {
                            c04765z = new C04765z<>(A00(this.A01, c04776a));
                        }
                        if (abstractC04956sA03 == null || !abstractC04956sA04.A0C(abstractC04956sA03, c04776a.A03())) {
                            c04765z.A05(abstractC04956sA04);
                            C04826f.A01().A04(c04776a.A00(), c04765z, abstractC04956sA04.A06());
                        }
                    } else {
                        C04765z<AbstractC04956s> c04765z2 = new C04765z<>(A00(this.A01, c04776a));
                        c04765z2.A05(abstractC04956sA04);
                        C04826f.A01().A04(c04776a.A00(), c04765z2, abstractC04956sA04.A06());
                    }
                }
            }
        }
        String[] strArr = A02;
        if (strArr[0].charAt(9) == strArr[1].charAt(9)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[5] = "mCdjiAVU6tB7YULC7P";
        strArr2[2] = BuildConfig.FLAVOR;
    }
}
