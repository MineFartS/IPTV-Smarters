package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import org.joda.time.DateTimeFieldType;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1K, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1K {
    public static byte[] A06;
    public static String[] A07;
    public int A00;
    public int A01;
    public long A03;
    public String A04;
    public int A02 = 0;
    public LinkedList<Integer> A05 = new LinkedList<>();

    static {
        A03();
        A02();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 106);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A06 = new byte[]{70, 27, 12, 109, 60, 8, 31, 11, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 31, DateTimeFieldType.SECOND_OF_DAY, 25, 3, 90, 57, 27, 10, 10, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.SECOND_OF_DAY, 29, 90, 62, 27, DateTimeFieldType.HOUR_OF_HALFDAY, 27, 64, 90, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.SECOND_OF_DAY, 31, 90, 51, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.HOUR_OF_HALFDAY, 31, 29, 31, 8, 90, DateTimeFieldType.SECOND_OF_MINUTE, 25, 25, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 8, 8, 31, DateTimeFieldType.SECOND_OF_DAY, 25, 31, 1, 11, 9, 24, 53, 62, 51, 34, 41, 32, 36, 53, 52, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 57, 52, 55, 59, 59, 45, 42, 42, 61, 54, 59, 61, 43, 119, 98, 117, 110, 104, 99, 57, 46, 52, 53, 30, 46, 34, 34, 52, 51, 51, 36, 47, 34, 36, 30, 50, 36, 34, 50, 102, 113, 107, 106, 65, 110, 123, 108, 119, 113, 122, 34, 27};
    }

    public static void A03() {
        A07 = new String[]{"Du56ltgKKs1OVAX5", "GkTmjkH3MPiTFcKSZdtZeP", "KEGdoxZZnAdDUnYCV96i9ePmYlw0nVcs", "eeVVi2jaa6aVR", "fQADRcl3z4I9sbyUvoxt9O6e4jXdGtkI", "3SSpimwT8orOGywmbz8JxKLw4xXAqR", "PizR3LI8tsUKIk44MqfkEczppTSirtIQ", "PpMlGdJ0WRh5qmood9xHloOk"};
    }

    public C1K(String str) {
        this.A04 = str;
    }

    private void A01() {
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        while (!this.A05.isEmpty() && this.A05.peekFirst() != null && jCurrentTimeMillis - ((long) this.A05.peekFirst().intValue()) >= this.A00) {
            this.A05.removeFirst();
        }
    }

    public final void A04(int i2) {
        this.A02 = i2;
    }

    public final void A05(int i2, int i3, long j2) {
        this.A00 = i2;
        this.A01 = i3;
        this.A03 = j2;
    }

    public final void A06(JSONArray jSONArray) throws JSONException {
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            if (jSONArray.get(i2) instanceof Integer) {
                this.A05.addLast((Integer) jSONArray.get(i2));
            } else {
                throw new JSONException(A00(4, 47, 16));
            }
        }
    }

    public final void A07(boolean z) {
        if (z) {
            this.A05.addLast(Integer.valueOf((int) (System.currentTimeMillis() / 1000)));
        }
        A01();
    }

    public final boolean A08() {
        return ((long) this.A05.size()) >= this.A03;
    }

    public final boolean A09() {
        return (System.currentTimeMillis() / 1000) - ((long) this.A02) <= ((long) this.A01);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(A00(115, 1, 51));
        sb.append(A00(55, 12, 58));
        String strA00 = A00(1, 1, 75);
        sb.append(strA00);
        sb.append(this.A04);
        String strA002 = A00(0, 1, 0);
        sb.append(strA002);
        sb.append(A00(78, 6, 109));
        sb.append(strA00);
        sb.append(this.A00);
        sb.append(strA002);
        sb.append(A00(104, 11, 116));
        sb.append(strA00);
        sb.append(this.A01);
        sb.append(strA002);
        sb.append(A00(52, 3, 2));
        sb.append(strA00);
        sb.append(this.A03);
        sb.append(strA002);
        sb.append(A00(84, 20, 43));
        sb.append(strA00);
        sb.append(this.A02);
        sb.append(strA002);
        sb.append(A00(67, 11, 50));
        sb.append(A00(2, 2, 92));
        Iterator<Integer> it = this.A05.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            if (A07[1].length() != 22) {
                throw new RuntimeException();
            }
            String[] strArr = A07;
            strArr[7] = "ktnl640oaPGPfDqOI7";
            strArr[7] = "ktnl640oaPGPfDqOI7";
            if (zHasNext) {
                sb.append(it.next());
                if (it.hasNext()) {
                    sb.append(strA002);
                }
            } else {
                sb.append(A00(51, 1, 54));
                sb.append(A00(116, 1, 12));
                return sb.toString();
            }
        }
    }
}
