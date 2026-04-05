package com.facebook.ads.redexgen.X;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1156Xr<T> implements C9U<T> {
    public static byte[] A06;
    public static String[] A07;
    public C9M A00;
    public C9M A01;
    public List<C1156Xr<T>.RecordFileBasedFetch> A02 = new ArrayList();
    public boolean A03;
    public final C9L A04;
    public final C05459b A05;

    static {
        A02();
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 98);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{-28, 2, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, -63, DateTimeFieldType.CLOCKHOUR_OF_DAY, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, DateTimeFieldType.HALFDAY_OF_DAY, 26, -63, 5, 6, DateTimeFieldType.HALFDAY_OF_DAY, 6, DateTimeFieldType.SECOND_OF_MINUTE, 6, -63, 4, DateTimeFieldType.MILLIS_OF_DAY, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.CLOCKHOUR_OF_DAY, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.SECOND_OF_DAY, -63, DateTimeFieldType.HOUR_OF_DAY, DateTimeFieldType.CLOCKHOUR_OF_DAY, 10, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, DateTimeFieldType.SECOND_OF_MINUTE, 10, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 8, -63, 2, DateTimeFieldType.SECOND_OF_MINUTE, -63, DateTimeFieldType.SECOND_OF_MINUTE, 9, 6, -63, 5, 2, DateTimeFieldType.SECOND_OF_MINUTE, 2, 3, 2, DateTimeFieldType.SECOND_OF_DAY, 6, -63, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.SECOND_OF_MINUTE, 2, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.SECOND_OF_MINUTE, -38, 12, 9, 10, 6, 9, -73, 7, 6, 10, 0, 11, 0, 6, 5, -73, 0, 10, -73, -8, 11, -73, -65, -68, -5, -61, -68, -5, -64, -61, -73, -8, 5, -5, -73, 9, -4, -6, 6, 9, -5, -73, -3, 0, 3, -4, -73, 10, -4, 8, 12, -4, 5, -6, -4, -73, 10, 11, -8, 9, 11, 10, -73, -8, 11, -73, -65, -68, -5, -61, -68, -5, -64, -47, -73, -5, -8, 11, -8, -73, -1, -8, 10, -73, 7, 9, 6, -7, -8, -7, 3, DateTimeFieldType.CLOCKHOUR_OF_DAY, -73, -7, -4, -4, 5, -73, 3, 6, 10, 11, -78, -28, -31, -30, -34, -31, -113, -33, -34, -30, -40, -29, -40, -34, -35, -113, -40, -30, -113, -48, -29, -113, -105, -108, -45, -101, -108, -45, -104, -101, -113, -47, -28, -29, -113, -31, -44, -46, -34, -31, -45, -113, -43, -40, -37, -44, -113, -30, -44, -32, -28, -44, -35, -46, -44, -113, -34, -35, -37, -24, -113, -41, -48, -30, -113, -43, -40, -37, -44, -113, -108, -45, -87, -113, -45, -48, -29, -48, -113, -41, -48, -30, -113, -33, -31, -34, -47, -48, -47, -37, -24, -113, -47, -44, -44, -35, -113, -37, -34, -30, -29, -27, 0, 8, 11, 4, 3, -65, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.HOUR_OF_HALFDAY, -65, 0, 3, 3, -65, 3, 0, DateTimeFieldType.MINUTE_OF_HOUR, 0, -65, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.HOUR_OF_HALFDAY, -65, 11, DateTimeFieldType.HOUR_OF_HALFDAY, 6, -72, -45, -37, -34, -41, -42, -110, -26, -31, -110, -43, -34, -41, -45, -28, -110, -42, -45, -26, -45, -44, -45, -27, -41, -9, DateTimeFieldType.MINUTE_OF_DAY, 26, 29, DateTimeFieldType.MILLIS_OF_DAY, DateTimeFieldType.SECOND_OF_MINUTE, -47, 37, 32, -47, DateTimeFieldType.MILLIS_OF_SECOND, DateTimeFieldType.MILLIS_OF_DAY, 37, DateTimeFieldType.SECOND_OF_DAY, 25, -47, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.MINUTE_OF_DAY, 37, DateTimeFieldType.MINUTE_OF_DAY, -47, DateTimeFieldType.MILLIS_OF_SECOND, 35, 32, 30, -47, 29, 32, 24, 34, 61, 69, 72, 65, 64, -4, 80, 75, -4, 67, 65, 80, -4, 78, 65, 63, 75, 78, 64, -4, 63, 75, 81, 74, 80, 5, 32, 40, 43, 36, 35, -33, 51, 46, -33, 52, 47, 35, 32, 51, 36, -33, 37, 40, 43, 36, -33, 50, 36, 48, 52, 36, 45, 34, 36, 43, 62, 60, 72, 75, 61, 31, 66, 69, 62, 27, 58, 76, 62, 61, 43, 62, 60, 72, 75, 61, 29, 58, 77, 58, 59, 58, 76, 62, -7, 60, 69, 72, 76, 62, 61, -8, 11, 9, DateTimeFieldType.SECOND_OF_MINUTE, 24, 10, -20, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, DateTimeFieldType.MINUTE_OF_DAY, 11, -24, 7, 25, 11, 10, -8, 11, 9, DateTimeFieldType.SECOND_OF_MINUTE, 24, 10, -22, 7, 26, 7, 8, 7, 25, 11, -58, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 25, -58, 9, DateTimeFieldType.MINUTE_OF_DAY, DateTimeFieldType.SECOND_OF_MINUTE, 25, 11, 10, -24, 1, -2, 1, 2, 10, 1, -77, -27, -8, -10, 2, 5, -9, -39, -4, -1, -8, -43, -12, 6, -8, -9, -27, -8, -10, 2, 5, -9, -41, -12, 7, -12, -11, -12, 6, -8, -77, -7, -8, 7, -10, -5, 11, 29, 26, 27, DateTimeFieldType.MILLIS_OF_SECOND, 26, 5, 2, DateTimeFieldType.SECOND_OF_MINUTE, 2};
    }

    public static void A02() {
        A07 = new String[]{"qjHjxJEnKto6KXykxGUV", "2zWwgsdc0YI2n1wuHJ0aHIsPzdmfxqsH", "nH8zlfZwPcU2YCM90OUKaCidDMv0PXY6", "9v530zo2HQQRKyJKvzn5HrUNTPRL7Myp", "K3vwlAe6bCWVMYHegp9FYHqzcyyslUPY", "TkUFKGPVf3MACXJSEel58pLd1ZQWiXgG", "k6Fq1", "q4H6OwDTyeTkPN5vSxQjqxUvCkQfNX6D"};
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Xr != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    public C1156Xr(C9R c9r, C9Z c9z) throws IOException {
        this.A05 = new C05459b(c9r.A04(A00(515, 4, 63)), c9z);
        this.A04 = new C9L(new File(c9r.A05(), A00(509, 6, 70)));
        this.A00 = this.A04.A04();
        A06(c9z);
        this.A01 = this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Xr != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    private void A03(int i2, int i3) throws IOException {
        this.A00 = new C9M(i2, i3);
        this.A04.A05(this.A00);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Xq != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T>$RecordFileBasedFetch */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Xr != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    /* JADX WARN: Incorrect inner types in method signature: (Lcom/facebook/ads/redexgen/X/Xr<TT;>.RecordFileBasedFetch;)V */
    public synchronized void A04(C1155Xq c1155Xq) throws C05479d {
        if (!this.A03) {
            if (A07(c1155Xq)) {
                if (c1155Xq.A55() == 0) {
                    return;
                }
                if (this.A00.A05(c1155Xq.A00().A02) == 0) {
                    try {
                        Iterator<C9Y> it = c1155Xq.A00.iterator();
                        while (it.hasNext()) {
                            if (it.next().A00 == this.A05.A08() && this.A05.A0E()) {
                                A03(this.A05.A07(), 0);
                            } else {
                                A03(this.A05.A07(), c1155Xq.A00().A00);
                                break;
                            }
                        }
                        if (this.A01.A05(this.A00) < 0) {
                            this.A01 = this.A00;
                        }
                        return;
                    } catch (IOException e2) {
                        throw new C05479d(A00(361, 30, 93), e2);
                    }
                }
                throw new C05479d(A00(0, 54, 63));
            }
            throw new C05479d(A00(466, 43, 49));
        }
        throw new C05479d(A00(427, 39, 68));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Xr != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    private void A06(C9Z c9z) throws IOException {
        C9M c9m = new C9M(this.A05.A07(), 0);
        if (c9m.A05(this.A00) > 0) {
            c9z.ACY(String.format(Locale.US, A00(54, 102, 53), Integer.valueOf(this.A00.A03()), Integer.valueOf(this.A00.A04()), Integer.valueOf(c9m.A03()), Integer.valueOf(c9m.A04())));
            this.A00 = c9m;
            return;
        }
        while (c9m.A03() < this.A00.A03()) {
            if (this.A05.A0E()) {
                c9m = new C9M(this.A05.A07(), 0);
            } else {
                c9z.ACY(String.format(Locale.US, A00(156, 101, 13), Integer.valueOf(this.A00.A03()), Integer.valueOf(this.A00.A04()), Integer.valueOf(c9m.A03())));
                this.A00 = new C9M(this.A05.A07(), this.A05.A08());
                this.A04.A05(this.A00);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Xq != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T>$RecordFileBasedFetch */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Xr != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    /* JADX WARN: Incorrect inner types in method signature: (Lcom/facebook/ads/redexgen/X/Xr<TT;>.RecordFileBasedFetch;)Z */
    public synchronized boolean A07(C1155Xq c1155Xq) {
        if (!this.A02.remove(c1155Xq)) {
            return false;
        }
        if (c1155Xq.A55() > 0 && c1155Xq.A01().A02.A06(c1155Xq.A01().A01).equals(this.A01)) {
            this.A01 = c1155Xq.A00().A02;
        }
        if (A07[6].length() == 28) {
            throw new RuntimeException();
        }
        String[] strArr = A07;
        strArr[6] = "RJmBk8mp9ukvkOiT1GdeN9JCmreSI8hk";
        strArr[6] = "RJmBk8mp9ukvkOiT1GdeN9JCmreSI8hk";
        return true;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Xq != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T>$RecordFileBasedFetch */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Xr != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    @Override // com.facebook.ads.redexgen.X.C9U
    public final synchronized C9T A54(byte[] bArr, int[] iArr) throws C05479d {
        C1156Xr<T>.RecordFileBasedFetch c1155Xq;
        if (!this.A03) {
            int iA02 = 0;
            int i2 = 0;
            try {
                ArrayList arrayList = new ArrayList();
                boolean z = true;
                while (true) {
                    C9P c9pA0B = this.A05.A0B(this.A01.A03(), this.A01.A04(), bArr, iA02, iArr, i2);
                    int iA00 = c9pA0B.A01().A00() - c9pA0B.A01().A01();
                    iA02 += c9pA0B.A01().A02();
                    i2 += iA00;
                    if (c9pA0B.A01().A03() == C9N.A02) {
                        arrayList.add(c9pA0B);
                    }
                    if (c9pA0B.A01().A03() == C9N.A03) {
                        break;
                    }
                    if (c9pA0B.A01().A03() == C9N.A04) {
                        if (this.A05.A07() + this.A05.A09() == this.A01.A03() + 1) {
                            z = false;
                            break;
                        }
                        this.A01 = new C9M(this.A01.A03() + 1, 0);
                    } else {
                        this.A01 = this.A01.A06(iA00);
                    }
                }
                c1155Xq = new C1155Xq(this, arrayList, z);
                this.A02.add(c1155Xq);
                if (!arrayList.isEmpty()) {
                    this.A01 = c1155Xq.A01().A02.A06(c1155Xq.A01().A01);
                }
            } catch (IOException e2) {
                throw new C05479d(A00(306, 29, 79), e2);
            }
        } else {
            throw new C05479d(A00(391, 36, 119));
        }
        return c1155Xq;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Xr != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    @Override // com.facebook.ads.redexgen.X.C9U
    public final synchronized int A6s() throws C05479d {
        int iA0A;
        if (!this.A03) {
            try {
                iA0A = this.A05.A0A();
                if (this.A00.A03() == this.A05.A07()) {
                    iA0A -= this.A00.A04();
                }
            } catch (IOException e2) {
                throw new C05479d(A00(335, 26, 122), e2);
            }
        } else {
            throw new C05479d(A00(427, 39, 68));
        }
        return iA0A;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Xr != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    @Override // com.facebook.ads.redexgen.X.C9U
    public final synchronized void ADT(byte[] bArr) throws C05479d {
        if (!this.A03) {
            try {
                this.A05.A0D(bArr);
            } catch (IOException e2) {
                throw new C05479d(A00(257, 25, 61), e2);
            }
        } else {
            throw new C05479d(A00(427, 39, 68));
        }
        String[] strArr = A07;
        if (strArr[5].charAt(29) != strArr[7].charAt(29)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A07;
        strArr2[6] = "aLWzj";
        strArr2[6] = "aLWzj";
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Xr != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    @Override // com.facebook.ads.redexgen.X.C9U
    public final synchronized void clear() throws C05479d {
        try {
            this.A05.A0C();
            A03(this.A05.A07(), 0);
            this.A02.clear();
        } catch (IOException e2) {
            throw new C05479d(A00(282, 24, 16), e2);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Xr != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        if (this.A03) {
            return;
        }
        this.A03 = true;
        this.A02.clear();
        this.A04.close();
        this.A05.close();
    }
}
