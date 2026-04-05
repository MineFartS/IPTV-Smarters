package com.facebook.ads.redexgen.X;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Hj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0742Hj extends InputStream {
    public static String[] A06;
    public long A00;
    public final InterfaceC0740Hh A03;
    public final C0744Hl A04;
    public boolean A02 = false;
    public boolean A01 = false;
    public final byte[] A05 = new byte[1];

    static {
        A01();
    }

    public static void A01() {
        A06 = new String[]{"DIl39WYXBVmqtqzggBlDNAYEve3K5qpU", "IcKPV1BgYthEUpBDtMv3j3ugQMZqCiQ0", "sU9zjCUHeGHCBt2", "PeTPZHzvo27yatwpqTVmdimri9j8DCNS", "yY6iAhLCXMcZRmR9RsFXCYuFMxutrQxU", "AHHv9bxqSkNUIoMvXtOCQ0ItP2yQ7", "76J7C", "XmAOJhUCstOxL8r4JtedbZ6nj1jLWHAD"};
    }

    public C0742Hj(InterfaceC0740Hh interfaceC0740Hh, C0744Hl c0744Hl) {
        this.A03 = interfaceC0740Hh;
        this.A04 = c0744Hl;
    }

    private void A00() throws IOException {
        if (!this.A02) {
            this.A03.ABR(this.A04);
            this.A02 = true;
        }
    }

    public final long A02() {
        return this.A00;
    }

    public final void A03() throws IOException {
        A00();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (!this.A01) {
            InterfaceC0740Hh interfaceC0740Hh = this.A03;
            if (A06[0].charAt(1) == 'V') {
                throw new RuntimeException();
            }
            String[] strArr = A06;
            strArr[7] = "mwlA9YYCcJtOcI59u3WxuQy3POeFuljZ";
            strArr[4] = "cui6soXC5t9pmBntrzPEG0Dw30SNZqBf";
            interfaceC0740Hh.close();
            this.A01 = true;
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (read(this.A05) == -1) {
            return -1;
        }
        return this.A05[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(@NonNull byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(@NonNull byte[] bArr, int i2, int i3) throws IOException {
        IM.A04(!this.A01);
        A00();
        int i4 = this.A03.read(bArr, i2, i3);
        if (i4 == -1) {
            return -1;
        }
        this.A00 += (long) i4;
        return i4;
    }
}
