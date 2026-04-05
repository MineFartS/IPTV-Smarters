package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import android.telephony.TelephonyManager;
import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class WZ extends C6U {
    public static byte[] A01;
    public final TelephonyManager A00;

    static {
        A05();
    }

    public static String A04(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 60);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A01 = new byte[]{DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 7, DateTimeFieldType.HOUR_OF_HALFDAY, DateTimeFieldType.HALFDAY_OF_DAY, 4};
    }

    public WZ(Context context, C04715u c04715u) {
        super(context, c04715u);
        this.A00 = (TelephonyManager) context.getSystemService(A04(0, 5, 99));
    }

    public static int A01(CellInfo cellInfo) {
        if (cellInfo != null) {
            if (Build.VERSION.SDK_INT >= 18) {
                if (cellInfo instanceof CellInfoCdma) {
                    return ((CellInfoCdma) cellInfo).getCellSignalStrength().getLevel();
                }
                if (cellInfo instanceof CellInfoGsm) {
                    return ((CellInfoGsm) cellInfo).getCellSignalStrength().getLevel();
                }
                if (cellInfo instanceof CellInfoLte) {
                    return ((CellInfoLte) cellInfo).getCellSignalStrength().getLevel();
                }
                if (cellInfo instanceof CellInfoWcdma) {
                    return ((CellInfoWcdma) cellInfo).getCellSignalStrength().getLevel();
                }
                throw new UnsupportedOperationException(cellInfo.getClass().getSimpleName());
            }
            throw new UnsupportedOperationException();
        }
        throw new NullPointerException();
    }

    public final InterfaceC04806d A0H() {
        return new WP(this);
    }

    @SuppressLint({"MissingPermission", "CatchGeneralException"})
    public final InterfaceC04806d A0I() {
        return new WQ(this);
    }

    public final InterfaceC04806d A0J() {
        return new WU(this);
    }

    public final InterfaceC04806d A0K() {
        return new WV(this);
    }

    public final InterfaceC04806d A0L() {
        return new WT(this);
    }

    public final InterfaceC04806d A0M() {
        return new WS(this);
    }

    public final InterfaceC04806d A0N() {
        return new WY(this);
    }

    public final InterfaceC04806d A0O() {
        return new WM(this);
    }

    public final InterfaceC04806d A0P() {
        return new WW(this);
    }

    public final InterfaceC04806d A0Q() {
        return new WX(this);
    }

    public final InterfaceC04806d A0R() {
        return new WN(this);
    }

    public final InterfaceC04806d A0S() {
        return new WO(this);
    }

    @SuppressLint({"MissingPermission", "CatchGeneralException"})
    public final InterfaceC04806d A0T() {
        return new WR(this);
    }
}
