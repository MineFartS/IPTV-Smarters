package com.facebook.ads.redexgen.X;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import java.util.Arrays;
import java.util.Map;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1322bl implements View.OnClickListener, View.OnLongClickListener, View.OnTouchListener, C8A {
    public static byte[] A02;
    public final X2 A00;
    public final /* synthetic */ C1320bj A01;

    static {
        A03();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 59);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A02 = new byte[]{43, DateTimeFieldType.HOUR_OF_HALFDAY, 74, 9, 11, 4, 4, 5, 30, 74, 8, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 74, 9, 6, 3, 9, 1, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, DateTimeFieldType.HOUR_OF_HALFDAY, 74, 8, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 12, 5, 24, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 74, 3, 30, 74, 3, 25, 74, 28, 3, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 29, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, DateTimeFieldType.HOUR_OF_HALFDAY, 68, 66, 109, 104, 98, 106, 114, 33, 105, 96, 113, 113, 100, 111, 100, 101, 33, 117, 110, 110, 33, 103, 96, 114, 117, 47, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.CLOCKHOUR_OF_DAY, DateTimeFieldType.MINUTE_OF_HOUR, 39, 54, 59, 55, 60, 49, 55, 28, 55, 38, 37, 61, 32, 57, 30, 61, 53, 56, 25, 86, 2, 25, 3, DateTimeFieldType.SECOND_OF_MINUTE, 30, 86, DateTimeFieldType.MINUTE_OF_DAY, DateTimeFieldType.MILLIS_OF_SECOND, 2, DateTimeFieldType.MILLIS_OF_SECOND, 86, 4, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.SECOND_OF_MINUTE, 25, 4, DateTimeFieldType.MINUTE_OF_DAY, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.MINUTE_OF_DAY, 90, 86, 6, 26, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.MILLIS_OF_SECOND, 5, DateTimeFieldType.MINUTE_OF_HOUR, 86, DateTimeFieldType.MINUTE_OF_HOUR, 24, 5, 3, 4, DateTimeFieldType.MINUTE_OF_HOUR, 86, 2, 25, 3, DateTimeFieldType.SECOND_OF_MINUTE, 30, 86, DateTimeFieldType.MINUTE_OF_HOUR, 0, DateTimeFieldType.MINUTE_OF_HOUR, 24, 2, 5, 86, 4, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.MILLIS_OF_SECOND, DateTimeFieldType.SECOND_OF_MINUTE, 30, 86, 2, 30, DateTimeFieldType.MINUTE_OF_HOUR, 86, DateTimeFieldType.MILLIS_OF_SECOND, DateTimeFieldType.MINUTE_OF_DAY, 86, 32, 31, DateTimeFieldType.MINUTE_OF_HOUR, 1, 86, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 86, 4, DateTimeFieldType.MINUTE_OF_HOUR, 2, 3, 4, 24, 31, 24, DateTimeFieldType.HOUR_OF_DAY, 86, DateTimeFieldType.CLOCKHOUR_OF_DAY, DateTimeFieldType.MILLIS_OF_SECOND, 26, 5, DateTimeFieldType.MINUTE_OF_HOUR, 86, 31, DateTimeFieldType.CLOCKHOUR_OF_DAY, 86, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 25, 3, 86, 31, 24, 2, DateTimeFieldType.MINUTE_OF_HOUR, 4, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.MINUTE_OF_HOUR, 6, 2, 86, 2, 30, DateTimeFieldType.MINUTE_OF_HOUR, 86, DateTimeFieldType.MINUTE_OF_HOUR, 0, DateTimeFieldType.MINUTE_OF_HOUR, 24, 2, 88, 33, 39, 60, 94, 68, 89};
    }

    public ViewOnClickListenerC1322bl(C1320bj c1320bj, X2 x2) {
        this.A01 = c1320bj;
        this.A00 = x2;
    }

    public /* synthetic */ ViewOnClickListenerC1322bl(C1320bj c1320bj, X2 x2, C1340c6 c1340c6) {
        this(c1320bj, x2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> A01() {
        Map<String, String> mapA06 = new C0897Np().A04(this.A01.A0N).A03(this.A01.A0b).A06();
        if (this.A01.A0H != null) {
            mapA06.put(A00(204, 3, 11), String.valueOf(this.A01.A0H.A04()));
        }
        if (this.A01.A0S) {
            mapA06.put(A00(201, 3, 116), String.valueOf(this.A01.A0S));
        }
        return mapA06;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05(Map<String, String> map) {
        if (this.A01.A0W != null) {
            this.A01.A0W.A0Z(map);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C8A
    public final X2 A5H() {
        return this.A00;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            boolean zA09 = this.A01.A0b.A09();
            String strA00 = A00(66, 20, 105);
            if (!zA09) {
                Log.e(strA00, A00(86, 115, 77));
            }
            int iA0D = JT.A0D(this.A01.A0Y);
            if (iA0D < 0 || this.A01.A0b.A04() >= iA0D) {
                if (!this.A01.A0b.A0A(this.A01.A0Y)) {
                    if (JT.A0x(this.A01.A0Y)) {
                        if (this.A01.A0W != null) {
                            this.A01.A0W.A0d(A01());
                        }
                        LU.A00(new DialogInterfaceOnClickListenerC0800Jr(this), new DialogInterfaceOnClickListenerC0801Js(this), LD.A00());
                        return;
                    }
                    A05(A01());
                    return;
                }
                if (this.A01.A0W != null) {
                    this.A01.A0W.A0a(A01());
                    return;
                }
                return;
            }
            if (!this.A01.A0b.A08()) {
                Log.e(strA00, A00(0, 41, 81));
            } else {
                Log.e(strA00, A00(41, 25, 58));
            }
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        if (this.A01.A03 == null || this.A01.A0K == null) {
            return false;
        }
        this.A01.A0K.setBounds(0, 0, this.A01.A03.getWidth(), this.A01.A03.getHeight());
        this.A01.A0K.A0E(!this.A01.A0K.A0F());
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.A01.A0b.A07(motionEvent, this.A01.A03, view);
        return this.A01.A02 != null && this.A01.A02.onTouch(view, motionEvent);
    }
}
