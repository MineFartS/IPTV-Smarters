package com.facebook.ads.redexgen.X;

import android.content.DialogInterface;
import java.util.Arrays;
import java.util.Map;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Jr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class DialogInterfaceOnClickListenerC0800Jr implements DialogInterface.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ ViewOnClickListenerC1322bl A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 39);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{7, DateTimeFieldType.HOUR_OF_DAY, -3, DateTimeFieldType.MINUTE_OF_DAY, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.HALFDAY_OF_DAY, -3, DateTimeFieldType.HOUR_OF_DAY, DateTimeFieldType.MINUTE_OF_DAY, 3, DateTimeFieldType.HOUR_OF_HALFDAY, -12, -14, -11, -27};
    }

    public DialogInterfaceOnClickListenerC0800Jr(ViewOnClickListenerC1322bl viewOnClickListenerC1322bl) {
        this.A00 = viewOnClickListenerC1322bl;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        Map mapA01 = this.A00.A01();
        mapA01.put(A00(0, 11, 119), A00(11, 4, 89));
        this.A00.A05(mapA01);
    }
}
