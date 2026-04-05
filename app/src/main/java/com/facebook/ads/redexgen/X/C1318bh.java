package com.facebook.ads.redexgen.X;

import android.os.ConditionVariable;
import android.util.Log;
import androidx.annotation.NonNull;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.NavigableSet;
import java.util.TreeSet;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1318bh implements I6 {
    public static boolean A06;
    public static byte[] A07;
    public static String[] A08;
    public static final HashSet<File> A09;
    public long A00;
    public boolean A01;
    public final InterfaceC1315be A02;
    public final IE A03;
    public final File A04;
    public final HashMap<String, ArrayList<I5>> A05;

    public static String A03(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 71);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A07 = new byte[]{106, 69, 68, 95, 67, 78, 89, 11, 120, 66, 70, 91, 71, 78, 104, 74, 72, 67, 78, 11, 66, 69, 88, 95, 74, 69, 72, 78, 11, 94, 88, 78, 88, 11, 95, 67, 78, 11, 77, 68, 71, 79, 78, 89, DateTimeFieldType.HOUR_OF_DAY, 11, 82, 104, 108, 113, 109, 100, 66, 96, 98, 105, 100, 94, 100, 96, 125, 97, 104, 78, 108, 110, 101, 104, 35, 100, 99, 100, 121, 100, 108, 97, 100, 119, 104, 37, 36, 0, 39, 60, 33, 58, 61, 52, 115, 58, 61, 55, 54, 43, 115, 53, 58, 63, 54, 115, 53, 50, 58, 63, 54, 55, 28, 30, 28, DateTimeFieldType.MILLIS_OF_SECOND, 26, 27, 32, 28, DateTimeFieldType.CLOCKHOUR_OF_DAY, DateTimeFieldType.HOUR_OF_DAY, 11, 26, DateTimeFieldType.HOUR_OF_DAY, 11, 32, DateTimeFieldType.MILLIS_OF_DAY, DateTimeFieldType.HOUR_OF_DAY, 27, 26, 7, 81, 26, 7, DateTimeFieldType.MILLIS_OF_DAY};
    }

    public static void A07() {
        A08 = new String[]{"eH4syubUz2tR66H4aXOA", "1d5DSBS1mhWRL66KnLBZBpyHNgki7Rvu", "v9uLJ4dIwyz0Tb4FaO07wTfk2F9lBV8v", "E1Se3PKWItYNl2w7Z0lUvGDZb88eKAvD", "3tvSVqejLSP4DWhBG1hRQ7meIfhtlUpf", "obkGL38LbEEikSiwJ4pDHOfB9GOmWii2", "dwvV", "8LO"};
    }

    static {
        A07();
        A06();
        A09 = new HashSet<>();
    }

    public C1318bh(File file, InterfaceC1315be interfaceC1315be) {
        this(file, interfaceC1315be, null, false);
    }

    public C1318bh(File file, InterfaceC1315be interfaceC1315be, IE ie) {
        if (A0E(file)) {
            this.A04 = file;
            this.A02 = interfaceC1315be;
            this.A03 = ie;
            this.A05 = new HashMap<>();
            ConditionVariable conditionVariable = new ConditionVariable();
            new IJ(this, A03(57, 24, 74), conditionVariable).start();
            conditionVariable.block();
            return;
        }
        throw new IllegalStateException(A03(0, 46, 108) + file);
    }

    public C1318bh(File file, InterfaceC1315be interfaceC1315be, byte[] bArr, boolean z) {
        this(file, interfaceC1315be, new IE(file, bArr, z));
    }

    private C1319bi A00(String str, long j2) throws I4 {
        C1319bi c1319biA07;
        ID idA0A = this.A03.A0A(str);
        if (idA0A == null) {
            return C1319bi.A02(str, j2);
        }
        while (true) {
            c1319biA07 = idA0A.A07(j2);
            if (!c1319biA07.A05 || c1319biA07.A03.exists()) {
                break;
            }
            A05();
        }
        return c1319biA07;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.I6
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final synchronized C1319bi ADO(String str, long j2) throws InterruptedException, I4 {
        C1319bi c1319biADP;
        while (true) {
            c1319biADP = ADP(str, j2);
            if (c1319biADP == null) {
                wait();
            }
        }
        return c1319biADP;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.I6
    /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final synchronized C1319bi ADP(String str, long j2) throws I4 {
        boolean z = this.A01;
        if (A08[0].length() != 10) {
            String[] strArr = A08;
            strArr[3] = "i1JHZi6uUAd1FxW2ulRZEzuIvuRnbT2M";
            strArr[3] = "i1JHZi6uUAd1FxW2ulRZEzuIvuRnbT2M";
            IM.A04(!z);
            C1319bi c1319biA00 = A00(str, j2);
            if (c1319biA00.A05) {
                C1319bi c1319biA08 = this.A03.A0A(str).A08(c1319biA00);
                A0D(c1319biA00, c1319biA08);
                return c1319biA08;
            }
            ID idA0B = this.A03.A0B(str);
            if (!idA0B.A0E()) {
                idA0B.A0C(true);
                return c1319biA00;
            }
            return null;
        }
        throw new RuntimeException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04() {
        if (!this.A04.exists()) {
            this.A04.mkdirs();
            return;
        }
        this.A03.A0F();
        File[] fileArrListFiles = this.A04.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            if (!file.getName().equals(A03(106, 24, 56))) {
                C1319bi span = file.length() > 0 ? C1319bi.A00(file, this.A03) : null;
                if (span != null) {
                    A0B(span);
                } else {
                    file.delete();
                }
            }
        }
        this.A03.A0G();
        try {
            this.A03.A0H();
        } catch (I4 e2) {
            Log.e(A03(46, 11, 70), A03(81, 25, 20), e2);
        }
    }

    private void A05() throws I4 {
        ArrayList arrayList = new ArrayList();
        for (ID cachedContent : this.A03.A0E()) {
            for (C1319bi c1319bi : cachedContent.A09()) {
                if (!c1319bi.A03.exists()) {
                    arrayList.add(c1319bi);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            A09((IA) arrayList.get(i2), false);
        }
        this.A03.A0G();
        this.A03.A0H();
    }

    private void A08(IA ia) {
        ArrayList<I5> arrayList = this.A05.get(ia.A04);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).AB1(this, ia);
            }
        }
        this.A02.AB1(this, ia);
    }

    private void A09(IA ia, boolean z) throws I4 {
        ID idA0A = this.A03.A0A(ia.A04);
        if (idA0A == null || !idA0A.A0F(ia)) {
            return;
        }
        this.A00 -= ia.A01;
        if (z) {
            try {
                this.A03.A0I(idA0A.A03);
                this.A03.A0H();
            } finally {
                A08(ia);
            }
        }
    }

    private void A0B(C1319bi c1319bi) {
        this.A03.A0B(c1319bi.A04).A0A(c1319bi);
        this.A00 += c1319bi.A01;
        A0C(c1319bi);
    }

    private void A0C(C1319bi c1319bi) {
        ArrayList<I5> arrayList = this.A05.get(c1319bi.A04);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).AB0(this, c1319bi);
            }
        }
        this.A02.AB0(this, c1319bi);
    }

    private void A0D(C1319bi c1319bi, IA ia) {
        ArrayList<I5> arrayList = this.A05.get(c1319bi.A04);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).AB2(this, c1319bi, ia);
            }
        }
        this.A02.AB2(this, c1319bi, ia);
    }

    public static synchronized boolean A0E(File file) {
        if (A06) {
            return true;
        }
        boolean zAdd = A09.add(file.getAbsoluteFile());
        if (A08[3].charAt(1) != '1') {
            throw new RuntimeException();
        }
        String[] strArr = A08;
        strArr[4] = "IKpjWyjLYfQpiBWntIG6MWMycmL9Fi0T";
        strArr[1] = "4yvCWPfRVkN5zdYzJ7yblhOZllwt9yTn";
        return zAdd;
    }

    @Override // com.facebook.ads.redexgen.X.I6
    public final synchronized void A3Q(String str, II ii) throws I4 {
        IM.A04(!this.A01);
        this.A03.A0J(str, ii);
        this.A03.A0H();
    }

    @Override // com.facebook.ads.redexgen.X.I6
    public final synchronized void A44(File file) throws I4 {
        IM.A04(!this.A01);
        C1319bi c1319biA00 = C1319bi.A00(file, this.A03);
        IM.A04(c1319biA00 != null);
        ID idA0A = this.A03.A0A(c1319biA00.A04);
        IM.A01(idA0A);
        IM.A04(idA0A.A0E());
        if (file.exists()) {
            if (file.length() == 0) {
                file.delete();
                return;
            }
            long jA00 = IH.A00(idA0A.A06());
            if (jA00 != -1) {
                long j2 = c1319biA00.A02;
                long length = c1319biA00.A01;
                IM.A04(j2 + length <= jA00);
            }
            A0B(c1319biA00);
            this.A03.A0H();
            notifyAll();
        }
    }

    @Override // com.facebook.ads.redexgen.X.I6
    public final synchronized long A5a() {
        IM.A04(!this.A01);
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.I6
    public final synchronized long A5c(String str, long j2, long j3) {
        ID idA0A;
        IM.A04(!this.A01);
        idA0A = this.A03.A0A(str);
        return idA0A != null ? idA0A.A05(j2, j3) : -j3;
    }

    @Override // com.facebook.ads.redexgen.X.I6
    @NonNull
    public final synchronized NavigableSet<IA> A5d(String str) {
        ID idA0A;
        IM.A04(!this.A01);
        idA0A = this.A03.A0A(str);
        return (idA0A == null || idA0A.A0D()) ? new TreeSet() : new TreeSet((Collection) idA0A.A09());
    }

    @Override // com.facebook.ads.redexgen.X.I6
    public final synchronized long A5o(String str) {
        return IH.A00(A5p(str));
    }

    @Override // com.facebook.ads.redexgen.X.I6
    public final synchronized IG A5p(String str) {
        IM.A04(!this.A01);
        return this.A03.A0C(str);
    }

    @Override // com.facebook.ads.redexgen.X.I6
    public final synchronized void ACK(IA ia) {
        IM.A04(!this.A01);
        ID idA0A = this.A03.A0A(ia.A04);
        IM.A01(idA0A);
        IM.A04(idA0A.A0E());
        idA0A.A0C(false);
        this.A03.A0I(idA0A.A03);
        notifyAll();
    }

    @Override // com.facebook.ads.redexgen.X.I6
    public final synchronized void ACR(IA ia) throws I4 {
        IM.A04(!this.A01);
        A09(ia, true);
        if (A08[0].length() == 10) {
            throw new RuntimeException();
        }
        String[] strArr = A08;
        strArr[2] = "mDPrx6EC7JunlTiRZIITWuDkOY6RMx2Q";
        strArr[2] = "mDPrx6EC7JunlTiRZIITWuDkOY6RMx2Q";
    }

    @Override // com.facebook.ads.redexgen.X.I6
    public final synchronized void ACx(String str, long j2) throws I4 {
        II ii = new II();
        IH.A05(ii, j2);
        A3Q(str, ii);
    }

    @Override // com.facebook.ads.redexgen.X.I6
    public final synchronized File ADM(String str, long j2, long j3) throws I4 {
        ID idA0A;
        IM.A04(!this.A01);
        idA0A = this.A03.A0A(str);
        IM.A01(idA0A);
        IM.A04(idA0A.A0E());
        if (!this.A04.exists()) {
            this.A04.mkdirs();
            A05();
        }
        this.A02.AB3(this, str, j2, j3);
        return C1319bi.A04(this.A04, idA0A.A02, j2, System.currentTimeMillis());
    }
}
