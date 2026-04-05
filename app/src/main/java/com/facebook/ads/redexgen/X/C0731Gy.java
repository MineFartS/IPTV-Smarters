package com.facebook.ads.redexgen.X;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Gy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0731Gy {
    public static byte[] A0B;
    public static String[] A0C;
    public List<C0731Gy> A00;
    public final long A01;
    public final long A02;
    public final H4 A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;
    public final HashMap<String, Integer> A08;
    public final HashMap<String, Integer> A09;
    public final String[] A0A;

    static {
        A08();
        A07();
    }

    public static String A06(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0B, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 56);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        byte[] bArr = {54, 38, 101, 109, 124, 105, 108, 105, 124, 105, 46};
        if (A0C[4].charAt(11) == 'K') {
            throw new RuntimeException();
        }
        String[] strArr = A0C;
        strArr[1] = "AmdkI9Q8sE";
        strArr[1] = "AmdkI9Q8sE";
        A0B = bArr;
    }

    public static void A08() {
        A0C = new String[]{"tlVw39Ohl0PVI8fV0YPCcQegL80HNmMX", "3PVmbccCk3TYNa4naZfa0", "qupmPShVTMJhVfYkOYpITScBpcljJSOb", "vJlbAlf6aMAaV2lo2oeuySGVP617mKUN", "wib00gU5k9UeC7KFMR3e95wgyYt7DknS", "DUfNRVSmHsUyVjEYzj4oHSrvl1jpEWvG", "VaOanHTtNfMSjEnVOScoKyOAyIQNDQyO", "uu1yNZ48dLzKD2dAjoiHYwXYoxLcRzCz"};
    }

    public C0731Gy(String str, String str2, long j2, long j3, H4 h4, String[] strArr, String str3) {
        this.A05 = str;
        this.A06 = str2;
        this.A03 = h4;
        this.A0A = strArr;
        this.A07 = str2 != null;
        this.A02 = j2;
        this.A01 = j3;
        this.A04 = (String) IM.A01(str3);
        this.A09 = new HashMap<>();
        this.A08 = new HashMap<>();
    }

    private final int A00() {
        List<C0731Gy> list = this.A00;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    private SpannableStringBuilder A01(SpannableStringBuilder spannableStringBuilder) {
        int spacesToDelete = spannableStringBuilder.length();
        for (int j2 = 0; j2 < spacesToDelete; j2++) {
            if (spannableStringBuilder.charAt(j2) == ' ') {
                int i2 = j2 + 1;
                while (i2 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i2) == ' ') {
                    i2++;
                }
                int i3 = i2 - (j2 + 1);
                if (i3 > 0) {
                    spannableStringBuilder.delete(j2, j2 + i3);
                    spacesToDelete -= i3;
                }
            }
        }
        if (spacesToDelete > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
            spacesToDelete--;
        }
        for (int i4 = 0; i4 < spacesToDelete - 1; i4++) {
            if (spannableStringBuilder.charAt(i4) == '\n' && spannableStringBuilder.charAt(i4 + 1) == ' ') {
                spannableStringBuilder.delete(i4 + 1, i4 + 2);
                spacesToDelete--;
            }
        }
        if (spacesToDelete > 0 && spannableStringBuilder.charAt(spacesToDelete - 1) == ' ') {
            spannableStringBuilder.delete(spacesToDelete - 1, spacesToDelete);
            if (A0C[4].charAt(11) == 'K') {
                throw new RuntimeException();
            }
            String[] strArr = A0C;
            strArr[7] = "6UN1wY1Jt9AyUvakQ5bJnJbUcnBDq6Nx";
            strArr[7] = "6UN1wY1Jt9AyUvakQ5bJnJbUcnBDq6Nx";
            spacesToDelete--;
        }
        for (int i5 = 0; i5 < spacesToDelete - 1; i5++) {
            if (spannableStringBuilder.charAt(i5) == ' ' && spannableStringBuilder.charAt(i5 + 1) == '\n') {
                spannableStringBuilder.delete(i5, i5 + 1);
                spacesToDelete--;
            }
        }
        if (spacesToDelete > 0 && spannableStringBuilder.charAt(spacesToDelete - 1) == '\n') {
            spannableStringBuilder.delete(spacesToDelete - 1, spacesToDelete);
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder A02(String str, Map<String, SpannableStringBuilder> map) {
        if (!map.containsKey(str)) {
            map.put(str, new SpannableStringBuilder());
        }
        SpannableStringBuilder spannableStringBuilder = map.get(str);
        String[] strArr = A0C;
        if (strArr[3].charAt(21) != strArr[2].charAt(21)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0C;
        strArr2[7] = "hg6ickUmYbVaq8iUWn6QMVEg4prIKgzg";
        strArr2[7] = "hg6ickUmYbVaq8iUWn6QMVEg4prIKgzg";
        return spannableStringBuilder;
    }

    private final C0731Gy A03(int i2) {
        List<C0731Gy> list = this.A00;
        if (list != null) {
            return list.get(i2);
        }
        throw new IndexOutOfBoundsException();
    }

    public static C0731Gy A04(String str) {
        return new C0731Gy(null, H0.A02(str), -9223372036854775807L, -9223372036854775807L, null, null, A06(0, 0, 104));
    }

    public static C0731Gy A05(String str, long j2, long j3, H4 h4, String[] strArr, String str2) {
        return new C0731Gy(str, null, j2, j3, h4, strArr, str2);
    }

    private void A09(long j2, Map<String, H4> map, Map<String, SpannableStringBuilder> map2) {
        if (!A0D(j2)) {
            return;
        }
        for (Map.Entry<String, Integer> entry : this.A08.entrySet()) {
            String key = entry.getKey();
            int iIntValue = this.A09.containsKey(key) ? this.A09.get(key).intValue() : 0;
            int iIntValue2 = entry.getValue().intValue();
            if (iIntValue != iIntValue2) {
                SpannableStringBuilder regionOutput = map2.get(key);
                A0B(map, regionOutput, iIntValue, iIntValue2);
            }
        }
        for (int i2 = 0; i2 < A00(); i2++) {
            A03(i2).A09(j2, map, map2);
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:39:0x00fb */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A0A(long r10, boolean r12, java.lang.String r13, java.util.Map<java.lang.String, android.text.SpannableStringBuilder> r14) {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0731Gy.A0A(long, boolean, java.lang.String, java.util.Map):void");
    }

    private void A0B(Map<String, H4> map, SpannableStringBuilder spannableStringBuilder, int i2, int i3) {
        H4 h4A00 = H0.A00(this.A03, this.A0A, map);
        if (h4A00 != null) {
            H0.A06(spannableStringBuilder, i2, i3, h4A00);
        }
    }

    private void A0C(TreeSet<Long> treeSet, boolean z) {
        boolean zEquals = A06(10, 1, 102).equals(this.A05);
        if (z || zEquals) {
            long j2 = this.A02;
            if (A0C[1].length() == 9) {
                throw new RuntimeException();
            }
            String[] strArr = A0C;
            strArr[1] = "LOAziX4ZrknWSY3Fjl";
            strArr[1] = "LOAziX4ZrknWSY3Fjl";
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
            long j3 = this.A01;
            if (j3 != -9223372036854775807L) {
                Long lValueOf = Long.valueOf(j3);
                if (A0C[0].charAt(29) != 'm') {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0C;
                strArr2[1] = "dzTKJn1Q9f1wWrnlDp9SVW8wMEk";
                strArr2[1] = "dzTKJn1Q9f1wWrnlDp9SVW8wMEk";
                treeSet.add(lValueOf);
            }
        }
        if (this.A00 == null) {
            return;
        }
        for (int i2 = 0; i2 < this.A00.size(); i2++) {
            this.A00.get(i2).A0C(treeSet, z || zEquals);
        }
    }

    private final boolean A0D(long j2) {
        return (this.A02 == -9223372036854775807L && this.A01 == -9223372036854775807L) || (this.A02 <= j2 && this.A01 == -9223372036854775807L) || ((this.A02 == -9223372036854775807L && j2 < this.A01) || (this.A02 <= j2 && j2 < this.A01));
    }

    public final List<C0707Ga> A0E(long j2, Map<String, H4> map, Map<String, C0732Gz> map2) {
        TreeMap<String, SpannableStringBuilder> regionOutputs = new TreeMap<>();
        A0A(j2, false, this.A04, regionOutputs);
        A09(j2, map, regionOutputs);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, SpannableStringBuilder> entry : regionOutputs.entrySet()) {
            C0732Gz c0732Gz = map2.get(entry.getKey());
            arrayList.add(new C0707Ga(A01(entry.getValue()), (Layout.Alignment) null, c0732Gz.A00, c0732Gz.A05, c0732Gz.A04, c0732Gz.A01, Integer.MIN_VALUE, c0732Gz.A03, c0732Gz.A06, c0732Gz.A02));
        }
        return arrayList;
    }

    public final void A0F(C0731Gy c0731Gy) {
        if (this.A00 == null) {
            this.A00 = new ArrayList();
        }
        this.A00.add(c0731Gy);
    }

    public final long[] A0G() {
        TreeSet<Long> treeSet = new TreeSet<>();
        A0C(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        int i2 = 0;
        Iterator<Long> it = treeSet.iterator();
        while (it.hasNext()) {
            int i3 = i2 + 1;
            jArr[i2] = it.next().longValue();
            i2 = i3;
        }
        return jArr;
    }
}
