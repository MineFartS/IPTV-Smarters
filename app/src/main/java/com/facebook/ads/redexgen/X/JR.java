package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Messenger;
import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class JR {
    public static byte[] A06;
    public Messenger A00;
    public boolean A01 = false;
    public final ServiceConnection A02 = new JQ(this);
    public final X2 A03;
    public final String A04;
    public final String A05;

    static {
        A06();
    }

    public static String A05(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 98);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A06 = new byte[]{-35, -50, -33, -50, -38, -20, -50, -37, -20, -30, -30, -42, -47, -18, -33, -16, -33, -21, -3, -18, -16, -19, -14, -19, -31, -19, -22, -3, -12, -29, -16, -15, -25, -19, -20, 6, -9, 8, -9, 3, DateTimeFieldType.SECOND_OF_MINUTE, 8, -5, 7, 11, -5, 9, 10, DateTimeFieldType.SECOND_OF_MINUTE, -1, -6, -67, -50, -48, -40, -50, -44, -46, -100, -48, -36, -38, -35, -36, -37, -46, -37, -31, -115, -37, -36, -31, -115, -45, -36, -30, -37, -47, -115, -36, -33, -115, -38, -42, -32, -32, -42, -37, -44, -115, -35, -46, -33, -38, -42, -32, -32, -42, -36, -37, -32, -12, DateTimeFieldType.MILLIS_OF_DAY, DateTimeFieldType.MINUTE_OF_HOUR, 7, 9, DateTimeFieldType.MILLIS_OF_SECOND, DateTimeFieldType.MILLIS_OF_SECOND, DateTimeFieldType.HALFDAY_OF_DAY, DateTimeFieldType.MINUTE_OF_DAY, 11, -60, DateTimeFieldType.MILLIS_OF_DAY, 9, DateTimeFieldType.SECOND_OF_MINUTE, 25, 9, DateTimeFieldType.MILLIS_OF_SECOND, 24, -33, -21, -23, -86, -30, -35, -33, -31, -34, -21, -21, -25, -86, -35, -15, -32, -27, -31, -22, -33, -31, -22, -31, -16, -13, -21, -18, -25, -86, -67, -15, -32, -27, -31, -22, -33, -31, -54, -31, -16, -13, -21, -18, -25, -49, -31, -18, -14, -27, -33, -31, 66, 78, 76, DateTimeFieldType.HALFDAY_OF_DAY, 69, 64, 66, 68, 65, 78, 78, 74, DateTimeFieldType.HALFDAY_OF_DAY, 74, 64, 83, 64, 77, 64, DateTimeFieldType.SECOND_OF_MINUTE, 28, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 11, 34, DateTimeFieldType.HALFDAY_OF_DAY, 24, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.CLOCKHOUR_OF_DAY, DateTimeFieldType.HALFDAY_OF_DAY, 32, DateTimeFieldType.SECOND_OF_MINUTE, 27, 26};
    }

    public JR(X2 x2, String str, String str2) {
        this.A03 = x2;
        this.A05 = str;
        this.A04 = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bundle A00() {
        Bundle bundle = new Bundle();
        bundle.putInt(A05(13, 22, 60), 1);
        bundle.putString(A05(0, 13, 43), this.A04);
        bundle.putString(A05(35, 16, 84), this.A05);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(int i2, C05238e c05238e) {
        this.A03.A04().A86(A05(189, 14, 74), i2, c05238e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A08(int i2, C05238e c05238e) {
        this.A03.A04().A87(A05(189, 14, 74), i2, c05238e);
    }

    public final void A0C() {
        A08(C05228d.A1Y, new C05238e(A05(101, 18, 66), this.A05));
        Intent intent = new Intent();
        intent.setClassName(A05(170, 19, 125), A05(119, 51, 26));
        try {
            if (!this.A03.bindService(intent, this.A02, 1)) {
                A08(C05228d.A1U, new C05238e(A05(51, 50, 11)));
                this.A03.unbindService(this.A02);
            }
        } catch (Exception e2) {
            A07(C05228d.A1T, new C05238e(e2));
        }
    }
}
