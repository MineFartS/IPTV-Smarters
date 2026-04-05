package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.os.SystemClock;
import android.view.OrientationEventListener;
import javax.annotation.Nullable;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6G, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C6G {

    @Nullable
    public static OrientationEventListener A02;
    public static String[] A03;
    public final C6E A00;
    public final EnumC04846h A01;

    static {
        A01();
    }

    public static void A01() {
        A03 = new String[]{"ciYSwpO57ig7", "AgXvWM7vBAP276b3F", "h3L2uX2266ICJ0F8mxeOzYeo", "sn1Bi96p4g3FJ3lBwfTgs4qOj566", "nEyUaJreiz", "9f6cxckTFidZYnVMHRSclm", "9nbfinSPxnf3N791gNAhDrqxfgbV", "EACetWGUN5dpVn0xkHaZeeKDOZ"};
    }

    public C6G(C6E c6e, EnumC04846h enumC04846h) {
        this.A00 = c6e;
        this.A01 = enumC04846h;
    }

    public final synchronized void A02() {
        if (A02 != null) {
            A02.disable();
            A02 = null;
        }
    }

    public final synchronized void A03(final Context context) {
        if (A02 == null) {
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            final C04936q c04936q = this.A01 == EnumC04846h.A0G ? null : new C04936q(context == null ? BuildConfig.FLAVOR : context.getPackageName());
            final int i2 = 3;
            A02 = new OrientationEventListener(context, i2) { // from class: com.facebook.ads.redexgen.X.6F
                @Override // android.view.OrientationEventListener
                public final void onOrientationChanged(int i3) {
                    this.A01.A00.A02(new C1129Wq(jElapsedRealtime, c04936q, i3), C6D.A0A);
                }
            };
            A02.enable();
            return;
        }
        String[] strArr = A03;
        if (strArr[7].length() == strArr[1].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A03;
        strArr2[7] = "WLHhaS1yyOUNNZKQvAoQ3Zw3xj";
        strArr2[1] = "prMYx6h4YCDadOhBb";
    }
}
