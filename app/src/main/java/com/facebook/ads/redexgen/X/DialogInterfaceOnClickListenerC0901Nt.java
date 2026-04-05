package com.facebook.ads.redexgen.X;

import android.content.DialogInterface;
import java.util.Arrays;
import java.util.Map;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Nt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class DialogInterfaceOnClickListenerC0901Nt implements DialogInterface.OnClickListener {
    public static byte[] A04;
    public final /* synthetic */ C0904Nw A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ Map A03;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 89);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{27, 37, DateTimeFieldType.HOUR_OF_DAY, 38, 41, 33, DateTimeFieldType.HOUR_OF_DAY, 37, 38, DateTimeFieldType.MILLIS_OF_SECOND, 34, 42, 40, 43, 27};
    }

    public DialogInterfaceOnClickListenerC0901Nt(C0904Nw c0904Nw, Map map, String str, String str2) {
        this.A00 = c0904Nw;
        this.A03 = map;
        this.A01 = str;
        this.A02 = str2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        this.A03.put(A00(0, 11, 89), A00(11, 4, 93));
        this.A00.A06(this.A01, this.A02, this.A03);
    }
}
