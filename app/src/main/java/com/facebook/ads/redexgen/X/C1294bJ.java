package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1294bJ implements InterfaceC0740Hh {
    public static byte[] A00;
    public static final InterfaceC0739Hg A01;
    public static final C1294bJ A02;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 72);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{10, 59, 51, 51, 63, -26, 57, 53, 59, 56, 41, 43};
    }

    static {
        A01();
        A02 = new C1294bJ();
        A01 = new C1293bI();
    }

    public C1294bJ() {
    }

    public /* synthetic */ C1294bJ(C1293bI c1293bI) {
        this();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0740Hh
    public final Uri A7H() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0740Hh
    public final long ABR(C0744Hl c0744Hl) throws IOException {
        throw new IOException(A00(0, 12, 126));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0740Hh
    public final void close() throws IOException {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0740Hh
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        throw new UnsupportedOperationException();
    }
}
