package com.facebook.ads.redexgen.X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.io.Serializable;
import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.14, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AnonymousClass14 extends BroadcastReceiver {
    public static byte[] A03;
    public static String[] A04;
    public Context A00;
    public C05589o A01;
    public boolean A02 = false;

    static {
        A02();
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 97);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{25, 3, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, DateTimeFieldType.HALFDAY_OF_DAY, 78, 6, 1, 3, 5, 2, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 11, 78, 1, 4, DateTimeFieldType.MINUTE_OF_HOUR, 78, 9, DateTimeFieldType.HOUR_OF_HALFDAY, DateTimeFieldType.SECOND_OF_DAY, 5, DateTimeFieldType.MINUTE_OF_DAY, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.SECOND_OF_DAY, 9, DateTimeFieldType.SECOND_OF_DAY, 9, 1, 12, 78, 4, 9, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.CLOCKHOUR_OF_DAY, 12, 1, 25, 5, 4, DateTimeFieldType.MINUTE_OF_HOUR, 31, 29, 94, DateTimeFieldType.MILLIS_OF_DAY, DateTimeFieldType.HOUR_OF_DAY, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.MINUTE_OF_DAY, 31, 31, 27, 94, DateTimeFieldType.HOUR_OF_DAY, DateTimeFieldType.SECOND_OF_DAY, 3, 94, 25, 30, 4, DateTimeFieldType.SECOND_OF_MINUTE, 2, 3, 4, 25, 4, 25, DateTimeFieldType.HOUR_OF_DAY, 28, 94, DateTimeFieldType.SECOND_OF_DAY, 25, 3, 0, 28, DateTimeFieldType.HOUR_OF_DAY, 9, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.SECOND_OF_DAY, 74, DateTimeFieldType.MINUTE_OF_DAY, 1, DateTimeFieldType.MINUTE_OF_DAY, 25, 3, 81, 68, 83, 71, 78, 83, 76, 98, 85, 64, 98, 77, 72, 66, 74, 83, 70, 81, 69, 76, 81, 78, 96, 87, 66, 96, 79, 74, 64, 72, 25, 45, 50, 63, 62, 52, DateTimeFieldType.MINUTE_OF_DAY, 53, 47, 62, 41, 40, 47, 50, 47, 58, 55, 30, 45, 62, 53, 47, 2, 29, DateTimeFieldType.CLOCKHOUR_OF_DAY, DateTimeFieldType.HOUR_OF_DAY, 27, 61, 26, 0, DateTimeFieldType.HOUR_OF_DAY, 6, 7, 0, 29, 0, DateTimeFieldType.SECOND_OF_MINUTE, 24, 49, 2, DateTimeFieldType.HOUR_OF_DAY, 26, 0, 78};
    }

    public static void A02() {
        A04 = new String[]{"X1IVw5mZrPwWgp59pDL9aLZ3Fov3W2Wm", "N1AsLxATz8LfRIPBbwS0prqi9bKFNGwZ", "KvfN8PD7zJtQDsMeVTqT5dRzLvhiPQFs", "CwJ4sBopjGul5sxVyPsrv7O0APgi12j8", "riYYfsMk5nddhbnpPSj9znzkTr5bDpPf", "Be1xHvNUMQ0R9QZ", "t7JwnvsmbbV8km6q46", "oSYhwD14tF3vT8zAS1lFRiV2H2FAfEUD"};
    }

    public AnonymousClass14(C05589o c05589o, Context context) {
        this.A01 = c05589o;
        this.A00 = context;
    }

    public final void A03() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(A00(40, 40, 17) + this.A01.getUniqueId());
        intentFilter.addAction(A00(137, 22, 21) + this.A01.getUniqueId());
        intentFilter.addAction(A00(100, 16, 66) + this.A01.getUniqueId());
        C2F.A00(this.A00).A07(this, intentFilter);
    }

    public final void A04() {
        try {
            C2F.A00(this.A00).A06(this);
        } catch (Exception unused) {
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String[] strArrSplit = intent.getAction().split(A00(0, 1, 66));
        if (strArrSplit.length != 2 || !strArrSplit[1].equals(this.A01.getUniqueId())) {
            return;
        }
        if (strArrSplit[0].equals(A00(1, 39, 1))) {
            if (this.A01.getListener() != null) {
                this.A01.getListener().A9Y();
                this.A01.getListener().ABQ();
                return;
            }
            return;
        }
        String str = strArrSplit[0];
        if (A04[2].charAt(17) != 'T') {
            throw new RuntimeException();
        }
        String[] strArr = A04;
        strArr[7] = "czH1g8WXqBVBzZgoSLVA20jYFFcQLh15";
        strArr[7] = "czH1g8WXqBVBzZgoSLVA20jYFFcQLh15";
        if (str.equals(A00(116, 21, 58))) {
            Serializable serializableExtra = intent.getSerializableExtra(A00(80, 5, 22));
            if (serializableExtra instanceof C0774Ir) {
                if (this.A01.getListener() != null) {
                    this.A01.getListener().A9e();
                    this.A01.getListener().ABQ();
                }
                if (this.A02) {
                    this.A01.A0V(1);
                } else {
                    this.A01.A0V(((C0774Ir) serializableExtra).A01());
                }
                this.A01.setVisibility(0);
                this.A01.A0Y(PD.A05, 1);
                return;
            }
            if (serializableExtra instanceof KN) {
                if (this.A01.getListener() == null) {
                    return;
                }
                MZ listener = this.A01.getListener();
                if (A04[4].charAt(15) != 'p') {
                    throw new RuntimeException();
                }
                String[] strArr2 = A04;
                strArr2[0] = "WizhEabCQfIhxCPZxjxQrLo8096TZ2te";
                strArr2[0] = "WizhEabCQfIhxCPZxjxQrLo8096TZ2te";
                listener.A9h();
                return;
            }
            if (serializableExtra instanceof KM) {
                if (this.A01.getListener() == null) {
                    return;
                }
                this.A01.getListener().A9i();
                return;
            }
            if (serializableExtra instanceof C7q) {
                if (this.A01.getListener() != null) {
                    this.A01.getListener().A9F();
                }
                this.A02 = true;
                return;
            }
            if (serializableExtra instanceof KJ) {
                if (this.A01.getListener() != null) {
                    MZ listener2 = this.A01.getListener();
                    if (A04[5].length() != 15) {
                        String[] strArr3 = A04;
                        strArr3[5] = "OhpiyJuLhpOH2Z5";
                        strArr3[5] = "OhpiyJuLhpOH2Z5";
                        listener2.AAS();
                    } else {
                        String[] strArr4 = A04;
                        strArr4[1] = "rjxpcIZarLCWG40Y5u8euDt94bevKfNO";
                        strArr4[1] = "rjxpcIZarLCWG40Y5u8euDt94bevKfNO";
                        listener2.AAS();
                    }
                }
                this.A02 = false;
                return;
            }
            if (!(serializableExtra instanceof C05137o) || this.A01.getListener() == null) {
                return;
            }
            this.A01.getListener().onPause();
            return;
        }
        if (!strArrSplit[0].equals(A00(85, 15, 64))) {
            return;
        }
        this.A01.A0i();
    }
}
