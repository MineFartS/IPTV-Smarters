package com.facebook.ads.redexgen.X;

import android.app.ActivityManager;
import android.content.Context;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C05318m {
    public static Sensor A00;
    public static Sensor A01;
    public static SensorEventListener A02;
    public static SensorEventListener A03;
    public static SensorManager A04;
    public static Map<String, String> A05;
    public static byte[] A06;
    public static String[] A07;
    public static final AtomicReference<String> A08;
    public static volatile float[] A09;
    public static volatile float[] A0A;

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 78);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A06 = new byte[]{-97, -12, -16, -14, -14, -12, -5, -12, 1, -2, -4, -12, 3, -12, 1, -18, -67, -65, -48, -59, -46, -59, -48, -43, 41, 54, 44, 58, 55, 49, 44, -10, 49, 54, 60, 45, 54, 60, -10, 41, 43, 60, 49, 55, 54, -10, 10, 9, 28, 28, DateTimeFieldType.HALFDAY_OF_DAY, 26, 33, 39, 11, DateTimeFieldType.CLOCKHOUR_OF_DAY, 9, DateTimeFieldType.MILLIS_OF_DAY, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, DateTimeFieldType.HALFDAY_OF_DAY, 12, DateTimeFieldType.MILLIS_OF_SECOND, 44, DateTimeFieldType.MILLIS_OF_SECOND, 31, 34, DateTimeFieldType.MILLIS_OF_SECOND, 24, 34, 27, DateTimeFieldType.SECOND_OF_MINUTE, 35, 27, 35, 37, 40, 47, 33, 32, 51, 51, 36, 49, 56, -4, 1, -6, 11, 0, 2, 7, 0, 35, 47, 34, 34, 28, 48, 45, 30, 32, 34, -18, -20, -11, -20, -7, -16, -22, DateTimeFieldType.MINUTE_OF_HOUR, 12, 29, 12, DateTimeFieldType.MINUTE_OF_HOUR, -60, -63, -58, -77, -58, -69, -63, -64, -79, -60, -76, -78, -67, -74, 4, -10, -1, 4, 0, 3, 8, 9, -10, 9, 10, 8, 45, 40, 45, 26, 37, 24, 38, 30, 38, 40, 43, 50, DateTimeFieldType.CLOCKHOUR_OF_DAY, DateTimeFieldType.HOUR_OF_DAY, -49};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:645)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static void A08(Context context) {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        String strValueOf = String.valueOf(((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize()));
        A08.set(strValueOf);
        A05.put(A01(92, 10, 111), strValueOf);
    }

    static {
        A03();
        A04 = null;
        A00 = null;
        A01 = null;
        A05 = new ConcurrentHashMap();
        A07 = new String[]{A01(152, 1, 74), A01(153, 1, 74), A01(154, 1, 7)};
        A08 = new AtomicReference<>();
    }

    @Nullable
    public static String A00() {
        return A08.get();
    }

    public static Map<String, String> A02() {
        Map<String, String> currentAnalogInfo = new HashMap<>();
        currentAnalogInfo.putAll(A05);
        A0C(currentAnalogInfo);
        return currentAnalogInfo;
    }

    public static synchronized void A06() {
        if (A04 != null) {
            A04.unregisterListener(A02);
        }
        A02 = null;
    }

    public static synchronized void A07() {
        if (A04 != null) {
            A04.unregisterListener(A03);
        }
        A03 = null;
    }

    public static void A09(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService(A01(16, 8, 14))).getMemoryInfo(memoryInfo);
        A05.put(A01(61, 16, 104), String.valueOf(memoryInfo.availMem));
        if (Build.VERSION.SDK_INT >= 16) {
            A05.put(A01(140, 12, 107), String.valueOf(memoryInfo.totalMem));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.facebook.ads.redexgen.X.8C] */
    /* JADX WARN: Type inference failed for: r6v1, types: [com.facebook.ads.redexgen.X.8C] */
    /* JADX WARN: Type inference failed for: r6v2, types: [android.content.Intent] */
    public static void A0A(C8C c8c) {
        try {
            c8c = c8c.registerReceiver(null, new IntentFilter(A01(24, 37, 122)));
            if (c8c == 0) {
                return;
            }
            int status = c8c.getIntExtra(A01(109, 5, 89), -1);
            int level = c8c.getIntExtra(A01(123, 5, 3), -1);
            int intExtra = c8c.getIntExtra(A01(134, 6, 71), -1);
            boolean z = intExtra == 2 || intExtra == 5;
            float f2 = 0.0f;
            if (level > 0) {
                float batteryLevel = level;
                f2 = (status / batteryLevel) * 100.0f;
            }
            A05.put(A01(77, 7, 113), String.valueOf(f2));
            A05.put(A01(84, 8, 75), z ? A01(1, 1, 117) : A01(0, 1, 33));
        } catch (IllegalArgumentException e2) {
            c8c.A04().A86(A01(102, 7, 57), C05228d.A1A, new C05238e(e2));
        }
    }

    public static synchronized void A0B(C8C c8c) {
        A09(c8c);
        A0A(c8c);
        if (A04 == null) {
            A04 = (SensorManager) c8c.getSystemService(A01(128, 6, 67));
            if (A04 == null) {
                return;
            }
        }
        if (A00 == null) {
            A00 = A04.getDefaultSensor(1);
        }
        if (A01 == null) {
            A01 = A04.getDefaultSensor(4);
        }
        C05288j c05288j = null;
        if (A02 == null) {
            A02 = new C05298k();
            if (A00 != null) {
                A04.registerListener(A02, A00, 3);
            }
        }
        if (A03 == null) {
            A03 = new C05308l();
            if (A01 != null) {
                A04.registerListener(A03, A01, 3);
            }
        }
    }

    public static void A0C(Map<String, String> map) {
        float[] currentGyroscopeValues = A09;
        float[] fArr = A0A;
        if (currentGyroscopeValues != null) {
            int iMin = Math.min(A07.length, currentGyroscopeValues.length);
            for (int i2 = 0; i2 < iMin; i2++) {
                map.put(A01(2, 14, 65) + A07[i2], String.valueOf(currentGyroscopeValues[i2]));
            }
        }
        if (fArr != null) {
            int iMin2 = Math.min(A07.length, fArr.length);
            for (int i3 = 0; i3 < iMin2; i3++) {
                map.put(A01(114, 9, 4) + A07[i3], String.valueOf(fArr[i3]));
            }
        }
    }
}
