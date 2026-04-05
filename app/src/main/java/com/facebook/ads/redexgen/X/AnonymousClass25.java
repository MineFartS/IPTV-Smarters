package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.joda.time.DateTimeFieldType;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.25, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AnonymousClass25 {
    public static byte[] A03;
    public static String[] A04;

    @Nullable
    public C0789Jg A00;
    public final List<String> A02 = new ArrayList();
    public final List<String> A01 = new ArrayList();

    static {
        A02();
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 71);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{106, 120, 66, 73, 67, 29, DateTimeFieldType.HOUR_OF_DAY, 30, DateTimeFieldType.HOUR_OF_DAY, DateTimeFieldType.MILLIS_OF_SECOND, DateTimeFieldType.SECOND_OF_MINUTE, 47, DateTimeFieldType.HOUR_OF_DAY, DateTimeFieldType.SECOND_OF_DAY, 47, 0, 2, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.MILLIS_OF_DAY, DateTimeFieldType.SECOND_OF_MINUTE, 2, DateTimeFieldType.SECOND_OF_MINUTE, 30, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.SECOND_OF_MINUTE, 3, 60, 35, 39, 58, 60, 61, 32, 12, 32, 54, 63, 54, 48, 39, 54, 55, 52, 51, 38, 53, 51, 100, 98, 116, 99, 78, 123, 126, 100, 99, 127, 116, 104, 70, 89, 72, 110, 80, 92, 110, 88, 110, 66, 84, 84, 88, 95, 86, 110, 69, 89, 88, 66};
    }

    public static void A02() {
        A04 = new String[]{"WaajtisyqSdmr5n0MmqvTq", "fdIaRasDBQ3mzQVC7YD5nGkHzZAmQvnJ", "WAxtNKI8ST0O8UsrAPtnvhIOfFZAxPRo", "iXpFblfpqQgQYwoemHyqPvk55iTf4XTw", "RtKJcmIp3WHhRmLDIsvrFFxbXoefOAJz", "sGysMZG", "ia7vWYD1O3n4XjJSJMs69oivtzC", "7HN0WjvVbr0DvNKb02v1a"};
    }

    public AnonymousClass25() {
    }

    public AnonymousClass25(C0789Jg c0789Jg) {
        this.A00 = c0789Jg;
    }

    public final Map<String, String> A03() {
        HashMap map = new HashMap();
        map.put(A00(47, 12, 86), new JSONArray((Collection) this.A02).toString());
        map.put(A00(26, 16, 20), new JSONArray((Collection) this.A01).toString());
        return map;
    }

    public final void A04() {
        this.A02.clear();
        this.A01.clear();
    }

    public final void A05() {
        this.A02.add(A00(5, 21, 55));
        C0789Jg c0789Jg = this.A00;
        if (c0789Jg != null) {
            c0789Jg.A03(EnumC0788Jf.A0B, null);
        }
    }

    public final void A06() {
        this.A02.add(A00(42, 5, 0));
    }

    public final void A07() {
        this.A02.add(A00(59, 20, 118));
        C0789Jg c0789Jg = this.A00;
        if (c0789Jg != null) {
            c0789Jg.A03(EnumC0788Jf.A0C, null);
        }
    }

    public final void A08(int i2) {
        this.A01.add(String.valueOf(i2));
    }

    public final void A09(AnonymousClass24 anonymousClass24) {
        this.A02.add(anonymousClass24.A02() + A00(1, 4, 96));
        C0789Jg c0789Jg = this.A00;
        if (c0789Jg != null) {
            c0789Jg.A03(EnumC0788Jf.A09, null);
        }
    }

    public final void A0A(AnonymousClass24 anonymousClass24, int i2) {
        this.A02.add(anonymousClass24.A02() + A00(0, 1, 114) + i2);
    }

    public final boolean A0B() {
        if (this.A02.isEmpty()) {
            List<String> list = this.A01;
            if (A04[0].length() != 22) {
                throw new RuntimeException();
            }
            String[] strArr = A04;
            strArr[3] = "1yk3ZSNQ1BStxV76R0ws43k7I6sqjrng";
            strArr[1] = "j3RusJXAZ4GZuuXU7mrgX9kSNDex5H9F";
            if (list.isEmpty()) {
                return false;
            }
        }
        return true;
    }
}
