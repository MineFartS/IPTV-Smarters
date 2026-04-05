package com.facebook.ads.redexgen.X;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ConfigurationInfo;
import java.util.Arrays;
import javax.annotation.Nullable;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class U7 extends C6U {
    public static byte[] A04;

    @Nullable
    public ConfigurationInfo A00;
    public final ActivityManager.RunningAppProcessInfo A01;
    public final ActivityManager A02;
    public final Context A03;

    static {
        A05();
    }

    public static String A04(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 6);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A04 = new byte[]{DateTimeFieldType.HALFDAY_OF_DAY, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 24, 5, 26, 5, 24, DateTimeFieldType.SECOND_OF_MINUTE};
    }

    public U7(Context context, C04715u c04715u) {
        super(context, c04715u);
        this.A03 = context;
        this.A02 = (ActivityManager) this.A03.getSystemService(A04(0, 8, 106));
        ActivityManager activityManager = this.A02;
        if (activityManager != null) {
            this.A00 = activityManager.getDeviceConfigurationInfo();
        }
        this.A01 = new ActivityManager.RunningAppProcessInfo();
    }

    public final InterfaceC04806d A0H() {
        return new U4(this);
    }

    public final InterfaceC04806d A0I() {
        return new U5(this);
    }

    public final InterfaceC04806d A0J() {
        return new U0(this);
    }

    public final InterfaceC04806d A0K() {
        return new U1(this);
    }

    public final InterfaceC04806d A0L() {
        return new U2(this);
    }

    public final InterfaceC04806d A0M() {
        return new C1060Tz(this);
    }

    public final InterfaceC04806d A0N() {
        return new U3(this);
    }

    public final InterfaceC04806d A0O() {
        return new C1059Ty(this);
    }

    public final InterfaceC04806d A0P() {
        return new U6(this);
    }

    public final InterfaceC04806d A0Q() {
        return new C1057Tw(this);
    }

    public final InterfaceC04806d A0R() {
        return new C1058Tx(this);
    }
}
