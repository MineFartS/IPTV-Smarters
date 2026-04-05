package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.metadata.Metadata;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class CK {
    public final C0768Il A00 = new C0768Il(10);

    @Nullable
    public final Metadata A00(CG cg, @Nullable E5 e5) throws InterruptedException, IOException {
        int i2 = 0;
        Metadata metadataA0P = null;
        while (true) {
            try {
                cg.ABc(this.A00.A00, 0, 10);
                this.A00.A0Z(0);
                if (this.A00.A0H() != C1200Zk.A03) {
                    break;
                }
                this.A00.A0a(3);
                int iA0E = this.A00.A0E();
                int i3 = iA0E + 10;
                if (metadataA0P == null) {
                    byte[] bArr = new byte[i3];
                    byte[] id3Data = this.A00.A00;
                    System.arraycopy(id3Data, 0, bArr, 0, 10);
                    cg.ABc(bArr, 10, iA0E);
                    metadataA0P = new C1200Zk(e5).A0P(bArr, i3);
                } else {
                    cg.A3M(iA0E);
                }
                i2 += i3;
            } catch (EOFException unused) {
            }
        }
        cg.ACd();
        cg.A3M(i2);
        return metadataA0P;
    }
}
