package com.facebook.ads.internal.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.X.C0768Il;
import com.facebook.ads.redexgen.X.C0780Ix;
import com.facebook.ads.redexgen.X.EI;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class TimeSignalCommand extends SpliceCommand {
    public static final Parcelable.Creator<TimeSignalCommand> CREATOR = new EI();
    public final long A00;
    public final long A01;

    public TimeSignalCommand(long j2, long j3) {
        this.A01 = j2;
        this.A00 = j3;
    }

    public /* synthetic */ TimeSignalCommand(long j2, long j3, EI ei) {
        this(j2, j3);
    }

    public static long A00(C0768Il c0768Il, long j2) {
        long jA0F = c0768Il.A0F();
        if ((128 & jA0F) == 0) {
            return -9223372036854775807L;
        }
        long ptsTime = 1 & jA0F;
        return (((ptsTime << 32) | c0768Il.A0N()) + j2) & 8589934591L;
    }

    public static TimeSignalCommand A01(C0768Il c0768Il, long j2, C0780Ix c0780Ix) {
        long jA00 = A00(c0768Il, j2);
        return new TimeSignalCommand(jA00, c0780Ix.A08(jA00));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
    }
}
