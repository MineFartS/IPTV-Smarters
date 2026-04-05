package com.facebook.ads.redexgen.X;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1305bU implements InterfaceC0740Hh {
    public final int A00;
    public final InterfaceC0740Hh A01;
    public final C0772Ip A02;

    public C1305bU(InterfaceC0740Hh interfaceC0740Hh, C0772Ip c0772Ip, int i2) {
        this.A01 = (InterfaceC0740Hh) IM.A01(interfaceC0740Hh);
        this.A02 = (C0772Ip) IM.A01(c0772Ip);
        this.A00 = i2;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0740Hh
    @Nullable
    public final Uri A7H() {
        return this.A01.A7H();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0740Hh
    public final long ABR(C0744Hl c0744Hl) throws IOException {
        this.A02.A02(this.A00);
        return this.A01.ABR(c0744Hl);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0740Hh
    public final void close() throws IOException {
        this.A01.close();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0740Hh
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        this.A02.A02(this.A00);
        return this.A01.read(bArr, i2, i3);
    }
}
