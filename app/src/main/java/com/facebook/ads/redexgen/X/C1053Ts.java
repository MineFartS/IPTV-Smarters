package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.concurrent.ThreadSafe;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ts, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@ThreadSafe
public final class C1053Ts implements InterfaceC04735w {
    public static String[] A06;
    public EnumC04816e A00;
    public AnonymousClass72 A01;
    public AnonymousClass73 A02;
    public final C04715u A03;
    public final C6P A04;
    public final AtomicBoolean A05 = new AtomicBoolean();

    static {
        A04();
    }

    public static void A04() {
        A06 = new String[]{"9Omy7cax2OJ4", "ulOhDbnf", "JfFg1yjSSK9TQh7N867q1b7oOj16BTWR", "cs88erT1Nmdhof2Vlv4YHjmvLJ5hV6oE", "codoSKf0AAHHcDxXKaV5ItDp", "Lc71QfpBcjqOx3z6Bpry4MoTnJ3L2Amk", "Bxh30V7DNH8aSp9XNgBHezc1nItbXmG0", "iIuCBEGs"};
    }

    public C1053Ts(C04715u c04715u, C6P c6p) {
        this.A03 = c04715u;
        this.A04 = c6p;
    }

    private final synchronized void A05() {
        if (this.A02 != null && this.A05.get()) {
            this.A01.A01(this.A02);
            C05016y.A00().A05();
            this.A04.A02();
            this.A05.compareAndSet(true, false);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.facebook.ads.redexgen.X.73] */
    public final synchronized void A06(final EnumC04816e enumC04816e) {
        if (this.A05.get() || enumC04816e == null) {
            return;
        }
        if (this.A03.A0k() && AnonymousClass71.A0F(enumC04816e)) {
            this.A01 = new AnonymousClass72(C05016y.A00().A04().getLooper());
            this.A00 = enumC04816e;
            final Runnable runnable = new Runnable(enumC04816e) { // from class: com.facebook.ads.redexgen.X.5y
                public EnumC04816e A00;

                {
                    this.A00 = enumC04816e;
                }

                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    if (C0822Kp.A02(this)) {
                        return;
                    }
                    try {
                        this.A01.A04.A04(EnumC04836g.A03, this.A00, null);
                        this.A01.A01.A02(this.A01.A02, TimeUnit.SECONDS.toMillis(this.A01.A03.A0T()));
                    } catch (Throwable th) {
                        C0822Kp.A00(th, this);
                    }
                }
            };
            this.A02 = new Runnable(runnable) { // from class: com.facebook.ads.redexgen.X.73
                public static String[] A01;
                public final Runnable A00;

                static {
                    A00();
                }

                public static void A00() {
                    A01 = new String[]{"z7DaAYMF8mD5H3Qw6B0df8iWMA5TwaAo", "i1Wz58ppkDzwzyk3vUo3iJD7WEPTUBrQ", "4oPzuaqB78YGGa8PxFst9tbpOvboFZdU", "DouWW69VsyGxi7cZQAT3hM5mkvCiYUWz", "5sMQ3NVw4qAuaNcVNLKcvGJPjeyRgc94", "cawbZ6x1RsnaWkC6S2Mb4x7gKiXWIBBw", "BT64P8yXTg3gcHo3v2kn4U06ifDkl76a", "4iKgaC96n3YCvkeVNFuu4kvW5LMIVzNy"};
                }

                {
                    this.A00 = runnable;
                }

                @Override // java.lang.Runnable
                @SuppressLint({"CatchGeneralException"})
                public final void run() throws Throwable {
                    if (C0822Kp.A02(this)) {
                        return;
                    }
                    try {
                        this.A00.run();
                    } catch (Throwable t) {
                        try {
                            AnonymousClass66.A04(t);
                        } catch (Throwable th) {
                            if (A01[0].charAt(29) != 'a') {
                                Throwable t2 = new RuntimeException();
                                throw t2;
                            }
                            String[] strArr = A01;
                            strArr[0] = "SMPhcSCea3djEKnuzKFzvQw1eCBqlauj";
                            strArr[0] = "SMPhcSCea3djEKnuzKFzvQw1eCBqlauj";
                            C0822Kp.A00(th, this);
                        }
                    }
                }
            };
            this.A04.A03(enumC04816e);
            this.A01.A00(this.A02);
            this.A05.compareAndSet(false, true);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04735w
    public final synchronized void ADh(EnumC04816e enumC04816e) {
        if (this.A00 == enumC04816e) {
            return;
        }
        this.A00 = enumC04816e;
        if (enumC04816e == EnumC04816e.A04) {
            A05();
        } else {
            A06(enumC04816e);
        }
        String[] strArr = A06;
        if (strArr[5].charAt(25) != strArr[3].charAt(25)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A06;
        strArr2[6] = "6KXzTJPK6a3Rx51uMQDwScazunOB6mre";
        strArr2[6] = "6KXzTJPK6a3Rx51uMQDwScazunOB6mre";
    }
}
