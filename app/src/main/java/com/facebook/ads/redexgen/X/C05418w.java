package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.joda.time.DateTimeFieldType;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C05418w {
    public static byte[] A0F;
    public static final AdPlacementType A0G;
    public static final String A0H;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public AdPlacementType A0B;
    public List<C05398u> A0C;
    public boolean A0D;
    public final long A0E = System.currentTimeMillis();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 13 out of bounds for length 13
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:645)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C05418w(java.util.Map<java.lang.String, java.lang.String> r12) {
        /*
            Method dump skipped, instruction units count: 810
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C05418w.<init>(java.util.Map):void");
    }

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0F, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 114);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A0F = new byte[]{47, 80, 123, 121, 117, 125, 122, 41, 30, 96, 93, 85, 76, 87, 64, 86, 24, 1, 74, 91, 78, 82, 7, DateTimeFieldType.SECOND_OF_MINUTE, 76, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 40, 32, 37, 44, 45, 105, 61, 38, 105, 58, 44, 61, 105, 42, 38, 38, 34, 32, 44, 103, 47, 45, 47, 36, 41, 45, 46, 32, 41, 87, 91, 90, 66, 107, 64, 70, 85, 87, 95, 93, 90, 83, 107, 80, 85, 64, 85, 56, 63, 39, 48, 61, 56, 53, 48, 37, 56, 62, 63, DateTimeFieldType.HOUR_OF_HALFDAY, 53, 36, 35, 48, 37, 56, 62, 63, DateTimeFieldType.HOUR_OF_HALFDAY, 56, 63, DateTimeFieldType.HOUR_OF_HALFDAY, 34, 52, 50, 62, 63, 53, 34, DateTimeFieldType.HOUR_OF_HALFDAY, 10, DateTimeFieldType.HALFDAY_OF_DAY, 60, DateTimeFieldType.SECOND_OF_MINUTE, 10, 6, DateTimeFieldType.SECOND_OF_DAY, 2, 1, 10, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 10, DateTimeFieldType.MILLIS_OF_SECOND, 26, 60, DateTimeFieldType.MINUTE_OF_HOUR, 6, DateTimeFieldType.HOUR_OF_DAY, 0, 6, DateTimeFieldType.HALFDAY_OF_DAY, DateTimeFieldType.MILLIS_OF_SECOND, 2, 4, 6, 75, 87, 90, 88, 94, 86, 94, 85, 79, 100, 83, 94, 82, 92, 83, 79, 75, 87, 90, 88, 94, 86, 94, 85, 79, 100, 76, 82, 95, 79, 83, 64, 87, 84, 64, 87, 65, 90, 94, 73, 74, 94, 73, 95, 68, 115, 88, 68, 94, 73, 95, 68, 67, 64, 72, 75, 92, 72, 76, 92, 74, 77, 102, 77, 80, 84, 92, 86, 76, 77, 110, 99, 106, 127, 39, 56, 53, 52, 62, DateTimeFieldType.HOUR_OF_HALFDAY, 37, 56, 60, 52, DateTimeFieldType.HOUR_OF_HALFDAY, 33, 62, 61, 61, 56, 63, 54, DateTimeFieldType.HOUR_OF_HALFDAY, 56, 63, 37, 52, 35, 39, 48, 61, 89, 70, 74, 88, 78, 77, 70, 67, 70, 91, 86, 112, 76, 71, 74, 76, 68, 112, 70, 65, 70, 91, 70, 78, 67, 112, 75, 74, 67, 78, 86, 64, 95, 83, 65, 87, 84, 95, 90, 95, 66, 79, 105, 85, 94, 83, 85, 93, 105, 95, 88, 66, 83, 68, 64, 87, 90, 66, 93, 81, 67, 85, 86, 93, 88, 93, 64, 77, 107, 87, 92, 81, 87, 95, 107, 64, 93, 87, 95, 81, 70};
    }

    static {
        A02();
        A0H = C05418w.class.getSimpleName();
        A0G = AdPlacementType.UNKNOWN;
    }

    public static C05418w A00(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Iterator<String> itKeys = jSONObject.keys();
        HashMap map = new HashMap();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, String.valueOf(jSONObject.opt(next)));
        }
        return new C05418w(map);
    }

    public final int A03() {
        return this.A02 * 1000;
    }

    public final int A04() {
        return this.A03;
    }

    public final int A05() {
        return this.A06;
    }

    public final int A06() {
        return this.A07;
    }

    public final int A07() {
        return this.A08;
    }

    public final int A08() {
        return this.A09;
    }

    public final int A09() {
        return this.A0A;
    }

    public final long A0A() {
        return this.A04 * 1000;
    }

    public final long A0B() {
        return this.A05 * 1000;
    }

    public final long A0C() {
        return this.A0E;
    }

    public final AdPlacementType A0D() {
        return this.A0B;
    }

    public final boolean A0E() {
        return this.A0D;
    }
}
