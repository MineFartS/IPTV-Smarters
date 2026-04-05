package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.metadata.Metadata;
import com.facebook.ads.internal.exoplayer2.metadata.scte35.PrivateCommand;
import com.facebook.ads.internal.exoplayer2.metadata.scte35.SpliceCommand;
import com.facebook.ads.internal.exoplayer2.metadata.scte35.SpliceInsertCommand;
import com.facebook.ads.internal.exoplayer2.metadata.scte35.SpliceNullCommand;
import com.facebook.ads.internal.exoplayer2.metadata.scte35.SpliceScheduleCommand;
import com.facebook.ads.internal.exoplayer2.metadata.scte35.TimeSignalCommand;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1201Zn implements InterfaceC0652Dt {
    public static String[] A03;
    public C0780Ix A00;
    public final C0768Il A02 = new C0768Il();
    public final C0767Ik A01 = new C0767Ik();

    static {
        A00();
    }

    public static void A00() {
        A03 = new String[]{"TasyJMHsWGEkz863ImR0Q5Lz0Jv5KZRl", "wAvcoPGmhTOD2UdnkI7mjYYyFDdz6tY4", "tIFolEUfJcQQhLLKuuKqSvXZilOQ0d41", "wnba1Mxhk7UAzMMhJxuW", "IqdHVgHf3sWcJ9J53HVfrlZmkyidEDTw", "kUaC4Xj2GLTFGhk3U8FgQLf5h3yptWRi", "yAL9OJMifRSpz7GOwtKlA6RWbWPVLH5t", "1By3yk2Axs3IVYX9txEI"};
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0652Dt
    public final Metadata A4f(CV cv) throws C0653Du {
        if (this.A00 == null || cv.A00 != this.A00.A06()) {
            this.A00 = new C0780Ix(((YH) cv).A00);
            this.A00.A07(((YH) cv).A00 - cv.A00);
        }
        ByteBuffer byteBuffer = cv.A01;
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        this.A02.A0c(bArrArray, iLimit);
        this.A01.A0D(bArrArray, iLimit);
        this.A01.A09(39);
        int size = this.A01.A05(1);
        long j2 = ((long) size) << 32;
        long ptsAdjustment = this.A01.A05(32);
        long j3 = j2 | ptsAdjustment;
        this.A01.A09(20);
        int iA05 = this.A01.A05(12);
        int spliceCommandType = this.A01.A05(8);
        SpliceCommand command = null;
        this.A02.A0a(14);
        if (spliceCommandType == 0) {
            command = new SpliceNullCommand();
        } else if (spliceCommandType == 255) {
            C0768Il c0768Il = this.A02;
            if (A03[1].charAt(6) != 'G') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[3] = "IAVDgnOrTVyqUqMF0jCb";
            strArr[7] = "AiSzseiiVBo4zRVGAcCm";
            command = PrivateCommand.A00(c0768Il, iA05, j3);
        } else if (spliceCommandType == 4) {
            command = SpliceScheduleCommand.A00(this.A02);
        } else if (spliceCommandType == 5) {
            command = SpliceInsertCommand.A00(this.A02, j3, this.A00);
        } else if (spliceCommandType == 6) {
            command = TimeSignalCommand.A01(this.A02, j3, this.A00);
        }
        return command == null ? new Metadata(new Metadata.Entry[0]) : new Metadata(command);
    }
}
