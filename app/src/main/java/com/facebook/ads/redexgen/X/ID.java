package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.TreeSet;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class ID {
    public static byte[] A05;
    public static String[] A06;
    public boolean A01;
    public final int A02;
    public final String A03;
    public C1317bg A00 = C1317bg.A04;
    public final TreeSet<C1319bi> A04 = new TreeSet<>();

    static {
        A03();
        A02();
    }

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 28);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A05 = new byte[]{70, 0, 7, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 10, 3, 2, 72, 58, 110, 117, 58, 0, 55, 60, 51, 63, 59, 60, 53, 114, 61, 52, 114};
    }

    public static void A03() {
        A06 = new String[]{"MBceJWRKAgeQJNY3ZRBdRhYJgpL3jkFQ", "518xlpwWcjlWASul8lHAahT8PqQVPF3u", "9RLjFZMlaqPSYVxgrCr3N29CAF4vaCFh", "Nd9PnywG3g8LluWsmNbg8PXBjZKSlX8G", "s", "C1TdeuC5gtnvKYkq95Rq", "MkXsOhuicHq9DXlwRCZefot2VxsvXJH1", "VJm3srbtmlXEw3gKHWc"};
    }

    public ID(int i2, String str) {
        this.A02 = i2;
        this.A03 = str;
    }

    public static ID A00(int id, DataInputStream dataInputStream) throws IOException {
        ID id2 = new ID(dataInputStream.readInt(), dataInputStream.readUTF());
        if (id < 2) {
            long j2 = dataInputStream.readLong();
            II mutations = new II();
            IH.A05(mutations, j2);
            id2.A0G(mutations);
        } else {
            C1317bg c1317bgA00 = C1317bg.A00(dataInputStream);
            if (A06[4].length() == 13) {
                throw new RuntimeException();
            }
            String[] strArr = A06;
            strArr[1] = "w2ExrNvXNhLYBLEt12rGyqcfRXmaXRhw";
            strArr[1] = "w2ExrNvXNhLYBLEt12rGyqcfRXmaXRhw";
            id2.A00 = c1317bgA00;
        }
        return id2;
    }

    public final int A04(int result) {
        int iHashCode = (this.A02 * 31) + this.A03.hashCode();
        if (result < 2) {
            long jA00 = IH.A00(this.A00);
            return (iHashCode * 31) + ((int) ((jA00 >>> 32) ^ jA00));
        }
        return (iHashCode * 31) + this.A00.hashCode();
    }

    public final long A05(long queryEndPosition, long currentEndPosition) {
        C1319bi c1319biA07 = A07(queryEndPosition);
        if (c1319biA07.A01()) {
            long j2 = -Math.min(c1319biA07.A02() ? Long.MAX_VALUE : c1319biA07.A01, currentEndPosition);
            if (A06[3].charAt(14) != 'W') {
                throw new RuntimeException();
            }
            String[] strArr = A06;
            strArr[7] = "ZNj15xTvoSD0UBJTiXr";
            strArr[5] = "u99g5dbJfvVcRXaISwTW";
            return j2;
        }
        long j3 = queryEndPosition + currentEndPosition;
        long jMax = c1319biA07.A02 + c1319biA07.A01;
        if (jMax < j3) {
            for (C1319bi c1319bi : this.A04.tailSet(c1319biA07, false)) {
                if (c1319bi.A02 > jMax) {
                    break;
                }
                jMax = Math.max(jMax, c1319bi.A02 + c1319bi.A01);
                if (jMax >= j3) {
                    break;
                }
            }
        }
        return Math.min(jMax - queryEndPosition, currentEndPosition);
    }

    public final IG A06() {
        return this.A00;
    }

    public final C1319bi A07(long j2) {
        C1319bi c1319biA01 = C1319bi.A01(this.A03, j2);
        C1319bi c1319biFloor = this.A04.floor(c1319biA01);
        if (c1319biFloor != null && c1319biFloor.A02 + c1319biFloor.A01 > j2) {
            return c1319biFloor;
        }
        C1319bi c1319biCeiling = this.A04.ceiling(c1319biA01);
        if (c1319biCeiling == null) {
            return C1319bi.A02(this.A03, j2);
        }
        return C1319bi.A03(this.A03, j2, c1319biCeiling.A02 - j2);
    }

    public final C1319bi A08(C1319bi c1319bi) throws I4 {
        IM.A04(this.A04.remove(c1319bi));
        C1319bi c1319biA08 = c1319bi.A08(this.A02);
        if (c1319bi.A03.renameTo(c1319biA08.A03)) {
            this.A04.add(c1319biA08);
            return c1319biA08;
        }
        throw new I4(A01(12, 12, 78) + c1319bi.A03 + A01(8, 4, 6) + c1319biA08.A03 + A01(0, 8, 122));
    }

    public final TreeSet<C1319bi> A09() {
        return this.A04;
    }

    public final void A0A(C1319bi c1319bi) {
        this.A04.add(c1319bi);
    }

    public final void A0B(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(this.A02);
        dataOutputStream.writeUTF(this.A03);
        this.A00.A0A(dataOutputStream);
    }

    public final void A0C(boolean z) {
        this.A01 = z;
    }

    public final boolean A0D() {
        return this.A04.isEmpty();
    }

    public final boolean A0E() {
        return this.A01;
    }

    public final boolean A0F(IA ia) {
        if (this.A04.remove(ia)) {
            ia.A03.delete();
            return true;
        }
        return false;
    }

    public final boolean A0G(II ii) {
        C1317bg c1317bg = this.A00;
        this.A00 = this.A00.A09(ii);
        return !this.A00.equals(c1317bg);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ID id = (ID) obj;
        if (this.A02 == id.A02 && this.A03.equals(id.A03)) {
            TreeSet<C1319bi> treeSet = this.A04;
            if (A06[4].length() == 13) {
                throw new RuntimeException();
            }
            String[] strArr = A06;
            strArr[4] = "qw9AeUbTiw";
            strArr[4] = "qw9AeUbTiw";
            if (treeSet.equals(id.A04) && this.A00.equals(id.A00)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (A04(Integer.MAX_VALUE) * 31) + this.A04.hashCode();
    }
}
