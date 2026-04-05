package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.BatteryManager;
import android.os.Build;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import javax.inject.Singleton;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Un, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@Singleton
public final class C1074Un extends C6U {
    public static byte[] A01;
    public static String[] A02;
    public final BatteryManager A00;

    static {
        A03();
        A02();
    }

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 124);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-7, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.MINUTE_OF_DAY, 37, 37, DateTimeFieldType.MILLIS_OF_DAY, 35, 42, 30, DateTimeFieldType.MINUTE_OF_DAY, 31, DateTimeFieldType.MINUTE_OF_DAY, 24, DateTimeFieldType.MILLIS_OF_DAY, 35, 42, -11, -18, -1, -18, -11, 60, 81, 0, -16, -18, -7, -14};
    }

    public static void A03() {
        A02 = new String[]{"bPMdIRdGv", "GS1RiQ0Fe2OXcQcIkCuEDku7WILZ5IDY", "TsFhxeN3ooiOzKyGYimy4dCB8t9rX6Qk", "tDBwPFCmRryD0Q4apJFJlrgk6DNKamUD", "oUUA5cBoIxHqACzkd5Y2T9kUvSWODdEm", "FnX3lwsUZnwMMkDv8sp6DIbywwAIHXWj", "YZLb9o623eUfyZOuivTCDkgv5wbAGsEp", "CfH0aVj4RQl6Eoew8HOriE9Hjjy"};
    }

    public C1074Un(Context context, C04715u c04715u) {
        super(context, c04715u);
        this.A00 = (BatteryManager) context.getSystemService(A01(1, 14, 53));
    }

    public final InterfaceC04806d A0H() {
        return new C1066Uf(this);
    }

    public final InterfaceC04806d A0I() {
        return new C1072Ul(this);
    }

    public final InterfaceC04806d A0J() {
        HashMap map = new HashMap();
        map.put(A01(21, 1, 82), 2);
        map.put(A01(0, 1, 28), 3);
        return new C1071Uk(this, map);
    }

    public final InterfaceC04806d A0K() {
        HashMap map = new HashMap();
        map.put(A01(15, 1, 66), A01(16, 5, 13));
        map.put(A01(22, 1, 98), A01(23, 5, 17));
        return new C1061Ua(this, map);
    }

    public final InterfaceC04806d A0L() {
        return new C1069Ui(this);
    }

    public final InterfaceC04806d A0M() {
        return new C1064Ud(this);
    }

    public final InterfaceC04806d A0N() {
        return new C1067Ug(this);
    }

    public final InterfaceC04806d A0O() {
        return new C1073Um(this);
    }

    public final InterfaceC04806d A0P() {
        return new C1065Ue(this);
    }

    public final InterfaceC04806d A0Q() {
        return new C1062Ub(this);
    }

    public final InterfaceC04806d A0R() {
        return new C1068Uh(this);
    }

    public final InterfaceC04806d A0S() {
        return new C1063Uc(this);
    }

    public final InterfaceC04806d A0T() {
        return new C1070Uj(this);
    }

    public final AbstractC04956s A0U(int i2) {
        if (Build.VERSION.SDK_INT < 21) {
            return A08(EnumC04916o.A05);
        }
        BatteryManager batteryManager = this.A00;
        if (A02[4].charAt(5) != 'c') {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[3] = "Z0BpikLZimvh7GQ0e0YfQZg6u7WmYRcx";
        strArr[6] = "N2CtCcOuXuTLuGr2kU7dW0gd7w3dfDGl";
        if (batteryManager != null) {
            return A05(batteryManager.getIntProperty(i2));
        }
        return A08(EnumC04916o.A07);
    }

    @SuppressLint({"Nullable Dereference"})
    public final AbstractC04956s A0V(HashMap<String, Integer> resultMap) {
        if (Build.VERSION.SDK_INT < 21) {
            return A08(EnumC04916o.A05);
        }
        BatteryManager batteryManager = this.A00;
        if (A02[4].charAt(5) != 'c') {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[3] = "VX9OpHMsf9E36khSHc5jiQggPTjCMNcl";
        strArr[6] = "9ZxqnrvyvCCPPfnmtmMIQlgDqEWsMyB8";
        if (batteryManager != null) {
            Set<String> setKeySet = resultMap.keySet();
            HashMap<String, Integer> map = new HashMap<>();
            for (String str : setKeySet) {
                map.put(str, Integer.valueOf(this.A00.getIntProperty(resultMap.get(str).intValue())));
            }
            return A0D(map);
        }
        return A08(EnumC04916o.A07);
    }
}
