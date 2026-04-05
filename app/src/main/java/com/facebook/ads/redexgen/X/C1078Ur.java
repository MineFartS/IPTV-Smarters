package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothClass;
import android.bluetooth.BluetoothDevice;
import android.os.Build;
import java.util.Arrays;
import org.joda.time.DateTimeFieldType;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ur, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1078Ur implements InterfaceC04866j {
    public static byte[] A06;
    public static String[] A07;
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final String A05;

    static {
        A03();
        A02();
    }

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 56);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A06 = new byte[]{-95, -96, DateTimeFieldType.HOUR_OF_DAY, 8, 7, -72, -24, -38, -21, -20, 25};
    }

    public static void A03() {
        A07 = new String[]{"KDgd6MNQp", "zljFFu", "VjilcxnSKsnTmReAVmpDdy6aJMg5f7s6", "M9UxMwGxDbbJlDHBhdVrbnElbrcIb6xK", "Ta0jv7L5NWawm2KziAACyDWzZYF122Ra", "gHFWFjUMy", "XbHlXA", "YSRve52qNSnKNw3HKqPQ6WGg63dcEGZy"};
    }

    @SuppressLint({"MissingPermission"})
    public C1078Ur(BluetoothDevice bluetoothDevice) {
        this.A05 = bluetoothDevice.getName();
        this.A03 = bluetoothDevice.getBondState();
        if (Build.VERSION.SDK_INT >= 18) {
            this.A04 = bluetoothDevice.getType();
        } else {
            this.A04 = -1;
        }
        this.A00 = bluetoothDevice.getBluetoothClass().getDeviceClass();
        this.A01 = bluetoothDevice.getBluetoothClass().getMajorDeviceClass();
        this.A02 = A00(bluetoothDevice.getBluetoothClass());
    }

    public static int A00(BluetoothClass bluetoothClass) {
        int i2 = 0;
        for (int i3 = 0; i3 < 31; i3++) {
            String[] strArr = A07;
            if (strArr[4].charAt(13) == strArr[2].charAt(13)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[7] = "ZZNppqHA2hsJ2mypaqhwEDmNkJueeDWX";
            strArr2[7] = "ZZNppqHA2hsJ2mypaqhwEDmNkJueeDWX";
            if (bluetoothClass.hasService(1 << i3)) {
                i2 |= 1 << i3;
            }
        }
        return i2;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04866j
    public final boolean A7f(Object obj) {
        C1078Ur c1078Ur = (C1078Ur) obj;
        if (((this.A05 == null && c1078Ur.A05 == null) || this.A05.equals(c1078Ur.A05)) && this.A03 == c1078Ur.A03 && this.A04 == c1078Ur.A04 && this.A00 == c1078Ur.A00) {
            int i2 = this.A01;
            if (A07[3].charAt(27) != 'I') {
                throw new RuntimeException();
            }
            String[] strArr = A07;
            strArr[5] = "lCz1bJjVX";
            strArr[0] = "UsNKRzwfX";
            if (i2 == c1078Ur.A01 && this.A02 == c1078Ur.A02) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04866j
    @SuppressLint({"BadMethodUse-java.lang.String.length"})
    public final int ADF() {
        return (this.A05 != null ? A01(5, 1, 18).length() + this.A05.length() : 0) + A01(8, 2, 64).length() + 4 + A01(10, 1, 109).length() + 4 + A01(0, 2, 5).length() + 4 + A01(2, 3, 108).length() + 4 + A01(6, 2, 61).length() + 4;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04866j
    public final JSONObject ADY() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(A01(5, 1, 18), this.A05);
        jSONObject.put(A01(8, 2, 64), this.A03);
        jSONObject.put(A01(10, 1, 109), this.A04);
        jSONObject.put(A01(0, 2, 5), this.A00);
        jSONObject.put(A01(2, 3, 108), this.A01);
        jSONObject.put(A01(6, 2, 61), this.A02);
        return jSONObject;
    }
}
