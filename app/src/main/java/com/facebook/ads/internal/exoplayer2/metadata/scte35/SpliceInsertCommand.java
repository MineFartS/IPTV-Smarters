package com.facebook.ads.internal.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.X.C0768Il;
import com.facebook.ads.redexgen.X.C0780Ix;
import com.facebook.ads.redexgen.X.EC;
import com.facebook.ads.redexgen.X.ED;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class SpliceInsertCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceInsertCommand> CREATOR = new EC();
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final List<ED> A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    public SpliceInsertCommand(long j2, boolean z, boolean z2, boolean z3, boolean z4, long j3, long j4, List<ED> list, boolean z5, long j5, int i2, int i3, int i4) {
        this.A06 = j2;
        this.A0B = z;
        this.A09 = z2;
        this.A0A = z3;
        this.A0C = z4;
        this.A05 = j3;
        this.A04 = j4;
        this.A07 = Collections.unmodifiableList(list);
        this.A08 = z5;
        this.A03 = j5;
        this.A02 = i2;
        this.A00 = i3;
        this.A01 = i4;
    }

    public SpliceInsertCommand(Parcel parcel) {
        this.A06 = parcel.readLong();
        this.A0B = parcel.readByte() == 1;
        this.A09 = parcel.readByte() == 1;
        this.A0A = parcel.readByte() == 1;
        this.A0C = parcel.readByte() == 1;
        this.A05 = parcel.readLong();
        this.A04 = parcel.readLong();
        int i2 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(ED.A00(parcel));
        }
        this.A07 = Collections.unmodifiableList(arrayList);
        this.A08 = parcel.readByte() == 1;
        this.A03 = parcel.readLong();
        this.A02 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
    }

    public /* synthetic */ SpliceInsertCommand(Parcel parcel, EC ec) {
        this(parcel);
    }

    public static SpliceInsertCommand A00(C0768Il c0768Il, long j2, C0780Ix c0780Ix) {
        long jA0N = c0768Il.A0N();
        boolean z = (c0768Il.A0F() & 128) != 0;
        boolean z2 = false;
        boolean autoReturn = false;
        boolean spliceImmediateFlag = false;
        long programSplicePts = -9223372036854775807L;
        List listEmptyList = Collections.emptyList();
        int iA0J = 0;
        int iA0F = 0;
        int iA0F2 = 0;
        boolean z3 = false;
        long jA0N2 = -9223372036854775807L;
        if (!z) {
            int iA0F3 = c0768Il.A0F();
            z2 = (iA0F3 & 128) != 0;
            autoReturn = (iA0F3 & 64) != 0;
            boolean programSpliceFlag = (iA0F3 & 32) != 0;
            spliceImmediateFlag = (iA0F3 & 16) != 0;
            if (autoReturn && !spliceImmediateFlag) {
                programSplicePts = TimeSignalCommand.A00(c0768Il, j2);
            }
            if (!autoReturn) {
                int iA0F4 = c0768Il.A0F();
                listEmptyList = new ArrayList(iA0F4);
                for (int i2 = 0; i2 < iA0F4; i2++) {
                    int iA0F5 = c0768Il.A0F();
                    long jA00 = -9223372036854775807L;
                    if (!spliceImmediateFlag) {
                        jA00 = TimeSignalCommand.A00(c0768Il, j2);
                    }
                    long spliceEventId = jA00;
                    listEmptyList.add(new ED(iA0F5, spliceEventId, c0780Ix.A08(jA00), null));
                }
            }
            if (programSpliceFlag) {
                long jA0F = c0768Il.A0F();
                z3 = (jA0F & 128) != 0;
                jA0N2 = (1000 * (((jA0F & 1) << 32) | c0768Il.A0N())) / 90;
            }
            iA0J = c0768Il.A0J();
            iA0F = c0768Il.A0F();
            iA0F2 = c0768Il.A0F();
        }
        return new SpliceInsertCommand(jA0N, z, z2, autoReturn, spliceImmediateFlag, programSplicePts, c0780Ix.A08(programSplicePts), listEmptyList, z3, jA0N2, iA0J, iA0F, iA0F2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.A06);
        parcel.writeByte(this.A0B ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A09 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0A ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0C ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.A05);
        parcel.writeLong(this.A04);
        int size = this.A07.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            this.A07.get(i3).A01(parcel);
        }
        parcel.writeByte(this.A08 ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.A03);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }
}
