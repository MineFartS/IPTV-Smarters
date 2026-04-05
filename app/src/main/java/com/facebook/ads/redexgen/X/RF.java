package com.facebook.ads.redexgen.X;

import java.io.ByteArrayInputStream;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class RF implements C0L {
    public ByteArrayInputStream A00;
    public final byte[] A01;

    public RF(byte[] bArr) {
        this.A01 = bArr;
    }

    @Override // com.facebook.ads.redexgen.X.C0L
    public final void ABS(int i2) throws RG {
        this.A00 = new ByteArrayInputStream(this.A01);
        this.A00.skip(i2);
    }

    @Override // com.facebook.ads.redexgen.X.C0L
    public final void close() throws RG {
    }

    @Override // com.facebook.ads.redexgen.X.C0L
    public final int length() throws RG {
        return this.A01.length;
    }

    @Override // com.facebook.ads.redexgen.X.C0L
    public final int read(byte[] bArr) throws RG {
        return this.A00.read(bArr, 0, bArr.length);
    }
}
