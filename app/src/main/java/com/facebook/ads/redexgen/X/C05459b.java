package com.facebook.ads.redexgen.X;

import androidx.annotation.VisibleForTesting;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C05459b implements Closeable {
    public static byte[] A03;
    public static String[] A04;
    public final C9R A01;
    public final Deque<C05449a> A02 = new LinkedList();
    public boolean A00 = false;

    static {
        A04();
        A03();
    }

    public static String A02(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            int i6 = bArrCopyOfRange[i5] ^ i4;
            if (A04[5].length() != 16) {
                throw new RuntimeException();
            }
            String[] strArr = A04;
            strArr[0] = "u097qyCEcqL0dCUFF3RqUSqj";
            strArr[6] = "TBb0mUAcLDsBFXHpNBOq9rzF";
            bArrCopyOfRange[i5] = (byte) (i6 ^ 113);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        byte[] bArr = {5, 41, 51, 42, 34, 102, 40, 41, 50, 102, 39, 34, 34, 102, 52, 35, 37, 41, 52, 34, 102, 50, 41, 102, 40, 35, 49, 42, 63, 102, 39, 34, 34, 35, 34, 102, 32, 47, 42, 35, 42, DateTimeFieldType.HALFDAY_OF_DAY, 5, 0, 9, 8, 76, 24, 3, 76, 8, 9, 0, 9, 24, 9, 76, 10, 5, 0, 9, 76, 75, 73, 31, 75, 106, 77, 69, 64, 73, 72, 12, 88, 67, 12, 64, 69, 95, 88, 12, 74, 69, 64, 73, 72, 12, 69, 66, 12, 72, 69, 94, 73, 79, 88, 67, 94, 85, 12, 11, 9, 95, 11, 28, 59, 51, 54, 63, 62, 122, 46, 53, 122, 54, 53, 59, 62, 122, 60, 51, 54, 63, 122, 125, 127, 41, 125, 118, 122, 41, 49, 51, 42, 42, 51, 52, 61, 122, 59, 54, 54, 122, 42, 40, 63, 44, 51, 53, 47, 41, 122, 60, 51, 54, 63, 41, 122, 47, 52, 46, 51, 54, 122, 127, 62, 61, 28, 29, 94, DateTimeFieldType.CLOCKHOUR_OF_DAY, 28, 29, 7, 26, DateTimeFieldType.SECOND_OF_DAY, 6, 28, 6, 0, 83, 29, DateTimeFieldType.MINUTE_OF_DAY, 30, DateTimeFieldType.MILLIS_OF_DAY, DateTimeFieldType.MILLIS_OF_SECOND, 83, DateTimeFieldType.SECOND_OF_MINUTE, 26, 31, DateTimeFieldType.MILLIS_OF_DAY, 83, 26, 29, 83, 31, 28, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.SECOND_OF_DAY, 26, 29, DateTimeFieldType.SECOND_OF_DAY, 83, DateTimeFieldType.MILLIS_OF_SECOND, 26, 1, DateTimeFieldType.MILLIS_OF_DAY, DateTimeFieldType.CLOCKHOUR_OF_DAY, 7, 28, 1, 10, 73, 83, 86, DateTimeFieldType.MILLIS_OF_SECOND, 95, 83, 30, 26, 29, 83, 26, 0, 83, 86, DateTimeFieldType.MILLIS_OF_SECOND, 29, 42, 44, 32, 61, 43, 9, 38, 35, 42, 28, 42, 62, 58, 42, 33, 44, 42, 111, 46, 35, 61, 42, 46, 43, 54, 111, 44, 35, 32, 60, 42, 43, 107, 80, 85, 80, 81, 73, 80, 30, 88, 87, 82, 91, 30, 87, 80, 30, 82, 81, 89, 89, 87, 80, 89, 30, 90, 87, 76, 91, 93, 74, 81, 76, 71, 4, 30, 25, 27, 77, 25};
        String[] strArr = A04;
        if (strArr[3].charAt(18) != strArr[2].charAt(18)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[3] = "rXUNYUFSY3Wwjf0Rt9wI3pKgcM0mrVi5";
        strArr2[2] = "NbfmFkvRWQfztm8Xt0wszzyUhHEjBSFU";
        A03 = bArr;
    }

    public static void A04() {
        A04 = new String[]{"Gii7pzXwK3MpiHC8B9NJqbzL", "8Pqq6WSNf8vKrPOx7XSY9C7", "LI4waC8pDZc7B2Ob9Mw4umyD0YVp7Iep", "HQVOS1q9k5iJuCSZxlwiHtDpSPIo2CAf", "0wBrPWYDPAFL7IDgbo0bQ8s", "e5cW7wYXRGqKaYX8", "aNUR51q123XM3tsFczjtkJvp", "F8bzMC9kGkJ5CLi2olbpsia5Bq7Sq0"};
    }

    public C05459b(C9R c9r, C9Z c9z) throws IOException {
        this.A01 = c9r;
        A06(c9r, c9z);
        if (this.A02.isEmpty()) {
            A00();
        }
    }

    private C05449a A00() throws IOException {
        int iA00 = -1;
        if (!this.A02.isEmpty()) {
            iA00 = this.A02.getLast().A00();
        }
        int i2 = iA00 + 1;
        this.A02.add(new C05449a(i2, new C9X(new File(this.A01.A05(), A01(i2)))));
        return this.A02.getLast();
    }

    @VisibleForTesting
    public static String A01(int i2) {
        return Integer.toString(i2);
    }

    private void A05(int i2, File file) throws IOException {
        C9X c9x = new C9X(file);
        c9x.A05();
        this.A02.addFirst(new C05449a(i2, c9x));
    }

    private void A06(C9R c9r, C9Z c9z) throws IOException {
        File[] fileArrListFiles = c9r.A05().listFiles();
        if (fileArrListFiles != null) {
            HashMap map = new HashMap();
            HashSet<File> hashSet = new HashSet();
            int i2 = -1;
            for (File file : fileArrListFiles) {
                try {
                    int i3 = Integer.parseInt(file.getName());
                    map.put(Integer.valueOf(i3), file);
                    if (i3 > i2) {
                        i2 = i3;
                    }
                } catch (NumberFormatException unused) {
                    hashSet.add(file);
                    c9z.ACY(String.format(Locale.US, A02(260, 39, 79), file.getCanonicalPath()));
                }
            }
            if (!map.isEmpty()) {
                int i4 = i2;
                while (map.containsKey(Integer.valueOf(i4 - 1))) {
                    i4--;
                }
                Iterator it = new HashSet(map.keySet()).iterator();
                while (it.hasNext()) {
                    int iIntValue = ((Integer) it.next()).intValue();
                    if (iIntValue < i4) {
                        c9z.ACY(String.format(Locale.US, A02(166, 61, 2), Integer.valueOf(iIntValue), Integer.valueOf(i4)));
                        hashSet.add(map.remove(Integer.valueOf(iIntValue)));
                    }
                }
                while (i2 >= i4) {
                    Integer numValueOf = Integer.valueOf(i2);
                    if (A04[7].length() == 23) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A04;
                    strArr[5] = "fmCLvQkSN3nY4ZJN";
                    strArr[5] = "fmCLvQkSN3nY4ZJN";
                    File file2 = (File) map.get(numValueOf);
                    try {
                        A05(i2, file2);
                        map.remove(Integer.valueOf(i2));
                        i2--;
                    } catch (IOException e2) {
                        c9z.ACZ(String.format(Locale.US, A02(104, 62, 43), file2.getCanonicalPath(), Integer.valueOf(i2)), e2);
                        hashSet.addAll(map.values());
                    }
                }
            }
            for (File file3 : hashSet) {
                if (!file3.delete()) {
                    c9z.ACY(String.format(Locale.US, A02(40, 26, 29), file3.getCanonicalPath()));
                }
            }
            return;
        }
        throw new IOException(String.format(Locale.US, A02(66, 38, 93), c9r.A05().getCanonicalPath()));
    }

    public final synchronized int A07() throws IOException {
        if (!this.A00) {
            if (this.A02.isEmpty()) {
                return -1;
            }
            return this.A02.getFirst().A00();
        }
        throw new IOException(A02(227, 33, 62));
    }

    public final synchronized int A08() throws IOException {
        if (!this.A00) {
            if (this.A02.isEmpty()) {
                return 0;
            }
            return this.A02.getFirst().A01();
        }
        throw new IOException(A02(227, 33, 62));
    }

    public final synchronized int A09() throws IOException {
        if (!this.A00) {
        } else {
            throw new IOException(A02(227, 33, 62));
        }
        return this.A02.size();
    }

    public final synchronized int A0A() throws IOException {
        int iA01;
        if (!this.A00) {
            iA01 = 0;
            Iterator<C05449a> it = this.A02.iterator();
            while (it.hasNext()) {
                iA01 += it.next().A01();
            }
        } else {
            throw new IOException(A02(227, 33, 62));
        }
        return iA01;
    }

    public final synchronized C9P A0B(int i2, int i3, byte[] bArr, int i4, int[] iArr, int i5) throws IOException {
        if (!this.A00) {
            for (C05449a c05449a : this.A02) {
                if (c05449a.A00() == i2) {
                    return new C9P(i2, c05449a.A02(i3, bArr, i4, iArr, i5));
                }
            }
            return new C9P(-1, new C9O(C9N.A04, -1, -1, 0));
        }
        throw new IOException(A02(227, 33, 62));
    }

    public final synchronized void A0C() throws IOException {
        if (!this.A00) {
            for (C05449a file : this.A02) {
                file.A04();
            }
            this.A02.clear();
            A00();
        } else {
            throw new IOException(A02(227, 33, 62));
        }
        String[] strArr = A04;
        if (strArr[0].length() != strArr[6].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[0] = "Q8tRgYQjLjZu9wWv5pfP6FNK";
        strArr2[6] = "ZBO8PuR7N2UupXyTknUyfTWg";
    }

    public final synchronized void A0D(byte[] bArr) throws IOException {
        if (!this.A00) {
            if ((this.A02.isEmpty() || !this.A02.getLast().A05(bArr)) && !A00().A05(bArr)) {
                throw new IOException(A02(0, 40, 55));
            }
        } else {
            throw new IOException(A02(227, 33, 62));
        }
    }

    public final synchronized boolean A0E() throws IOException {
        if (!this.A00) {
            if (this.A02.size() > 1) {
                C05449a first = this.A02.getFirst();
                this.A02.removeFirst();
                first.A04();
                return true;
            }
            return false;
        }
        throw new IOException(A02(227, 33, 62));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        if (this.A00) {
            return;
        }
        this.A00 = true;
        for (C05449a file : this.A02) {
            file.A03();
        }
    }
}
