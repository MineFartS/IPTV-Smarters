package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.os.Process;
import java.util.Arrays;
import javax.annotation.Nullable;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Us, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1079Us extends C6U {
    public static byte[] A01;

    @Nullable
    public final BluetoothAdapter A00;

    static {
        A03();
    }

    public static String A02(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 106);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A01 = new byte[]{-4, 9, -1, DateTimeFieldType.HALFDAY_OF_DAY, 10, 4, -1, -55, 11, 0, DateTimeFieldType.HALFDAY_OF_DAY, 8, 4, DateTimeFieldType.HOUR_OF_HALFDAY, DateTimeFieldType.HOUR_OF_HALFDAY, 4, 10, 9, -55, -35, -25, -16, -32, -17, -22, -22, -17, -29};
    }

    public C1079Us(Context context, C04715u c04715u) {
        super(context, c04715u);
        this.A00 = A04(context) ? BluetoothAdapter.getDefaultAdapter() : null;
    }

    public static boolean A04(Context context) {
        return context.checkPermission(A02(0, 28, 49), Process.myPid(), Process.myUid()) == 0;
    }

    @SuppressLint({"MissingPermission", "CatchGeneralException"})
    public final InterfaceC04806d A0H() {
        return new C1075Uo(this);
    }

    @SuppressLint({"MissingPermission", "CatchGeneralException"})
    public final InterfaceC04806d A0I() {
        return new C1076Up(this);
    }

    @SuppressLint({"MissingPermission"})
    public final InterfaceC04806d A0J() {
        return new C1077Uq(this);
    }
}
