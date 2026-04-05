package com.facebook.ads.redexgen.X;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Hh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public interface InterfaceC0740Hh {
    @Nullable
    Uri A7H();

    long ABR(C0744Hl c0744Hl) throws IOException;

    void close() throws IOException;

    int read(byte[] bArr, int i2, int i3) throws IOException;
}
