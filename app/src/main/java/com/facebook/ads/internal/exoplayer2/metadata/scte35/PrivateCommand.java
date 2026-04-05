package com.facebook.ads.internal.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.X.C0768Il;
import com.facebook.ads.redexgen.X.EB;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class PrivateCommand extends SpliceCommand {
    public static final Parcelable.Creator<PrivateCommand> CREATOR = new EB();
    public final long A00;
    public final long A01;
    public final byte[] A02;

    public PrivateCommand(long j2, byte[] bArr, long j3) {
        this.A01 = j3;
        this.A00 = j2;
        this.A02 = bArr;
    }

    public PrivateCommand(Parcel parcel) {
        this.A01 = parcel.readLong();
        this.A00 = parcel.readLong();
        this.A02 = new byte[parcel.readInt()];
        parcel.readByteArray(this.A02);
    }

    public /* synthetic */ PrivateCommand(Parcel parcel, EB eb) {
        this(parcel);
    }

    public static PrivateCommand A00(C0768Il c0768Il, int i2, long j2) {
        long jA0N = c0768Il.A0N();
        byte[] bArr = new byte[i2 - 4];
        c0768Il.A0d(bArr, 0, bArr.length);
        return new PrivateCommand(jA0N, bArr, j2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
        parcel.writeInt(this.A02.length);
        parcel.writeByteArray(this.A02);
    }
}
