package com.facebook.ads.redexgen.X;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class EH {
    public static String[] A0B;
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final List<EG> A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    static {
        A04();
    }

    public static void A04() {
        A0B = new String[]{"s27kRN", "abG5pKADna", "w2jztrB", "I7geUVX8H5XW4NGFgS7QGYJa3", "W37aGUNVZO5G", "W3qhVhIXcY", "2nbP2bKsNJFzfOABHc993I7Qj", "6HcftuEFFeXx4hy"};
    }

    public EH(long j2, boolean z, boolean z2, boolean z3, List<EG> list, long j3, boolean z4, long j4, int i2, int i3, int i4) {
        this.A04 = j2;
        this.A0A = z;
        this.A08 = z2;
        this.A09 = z3;
        this.A06 = Collections.unmodifiableList(list);
        this.A05 = j3;
        this.A07 = z4;
        this.A03 = j4;
        this.A02 = i2;
        this.A00 = i3;
        this.A01 = i4;
    }

    public EH(Parcel parcel) {
        this.A04 = parcel.readLong();
        this.A0A = parcel.readByte() == 1;
        this.A08 = parcel.readByte() == 1;
        this.A09 = parcel.readByte() == 1;
        int i2 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(EG.A00(parcel));
        }
        this.A06 = Collections.unmodifiableList(arrayList);
        this.A05 = parcel.readLong();
        this.A07 = parcel.readByte() == 1;
        this.A03 = parcel.readLong();
        this.A02 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
    }

    public static EH A00(Parcel parcel) {
        return new EH(parcel);
    }

    public static EH A02(C0768Il c0768Il) {
        long jA0N = c0768Il.A0N();
        boolean autoReturn = (c0768Il.A0F() & 128) != 0;
        boolean z = false;
        boolean z2 = false;
        long jA0N2 = -9223372036854775807L;
        ArrayList arrayList = new ArrayList();
        int iA0J = 0;
        int headerByte = 0;
        int iA0F = 0;
        boolean z3 = false;
        long j2 = -9223372036854775807L;
        if (!autoReturn) {
            int iA0F2 = c0768Il.A0F();
            if (A0B[2].length() != 7) {
                throw new RuntimeException();
            }
            String[] strArr = A0B;
            strArr[6] = "oYMFgXMCdR9ldlOsYeO";
            strArr[6] = "oYMFgXMCdR9ldlOsYeO";
            z = (iA0F2 & 128) != 0;
            z2 = (iA0F2 & 64) != 0;
            boolean z4 = (iA0F2 & 32) != 0;
            if (z2) {
                jA0N2 = c0768Il.A0N();
            }
            if (!z2) {
                int iA0F3 = c0768Il.A0F();
                arrayList = new ArrayList(iA0F3);
                for (int i2 = 0; i2 < iA0F3; i2++) {
                    arrayList.add(new EG(c0768Il.A0F(), c0768Il.A0N(), null));
                }
            }
            if (z4) {
                int componentCount = c0768Il.A0F();
                long j3 = componentCount;
                z3 = (128 & j3) != 0;
                long breakDuration90khz = ((1 & j3) << 32) | c0768Il.A0N();
                j2 = (1000 * breakDuration90khz) / 90;
            }
            iA0J = c0768Il.A0J();
            headerByte = c0768Il.A0F();
            iA0F = c0768Il.A0F();
        }
        return new EH(jA0N, autoReturn, z, z2, arrayList, jA0N2, z3, j2, iA0J, headerByte, iA0F);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05(Parcel parcel) {
        parcel.writeLong(this.A04);
        parcel.writeByte(this.A0A ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A08 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A09 ? (byte) 1 : (byte) 0);
        int size = this.A06.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            this.A06.get(i2).A02(parcel);
        }
        parcel.writeLong(this.A05);
        parcel.writeByte(this.A07 ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.A03);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }
}
