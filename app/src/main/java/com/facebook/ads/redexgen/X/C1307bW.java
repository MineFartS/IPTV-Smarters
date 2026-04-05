package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1307bW implements InterfaceC0740Hh {
    public static byte[] A07;
    public static String[] A08;
    public long A00;
    public AssetFileDescriptor A01;
    public Uri A02;
    public InputStream A03;
    public boolean A04;
    public final Resources A05;
    public final I2<? super C1307bW> A06;

    static {
        A02();
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 108);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{70, 113, 103, 123, 97, 102, 119, 113, 52, 125, 112, 113, 122, 96, 125, 114, 125, 113, 102, 52, 121, 97, 103, 96, 52, 118, 113, 52, 117, 122, 52, 125, 122, 96, 113, 115, 113, 102, 58, 7, 0, 27, 114, 63, 39, 33, 38, 114, 39, 33, 55, 114, 33, 49, 58, 55, 63, 55, 114, 32, 51, 37, 32, 55, 33, 61, 39, 32, 49, 55, 117, 102, 112, 117, 98, 116, 104, 114, 117, 100, 98};
    }

    public static void A02() {
        A08 = new String[]{"bSKnstrcEyUtH2EUzSuh7p", "TJp7broMG9ALkddxCeG8bg", "OUGN6fd13DTUK57USEtQiA6N8BMR4vG7", "MPCQ8AeafYWdEx3u0S1dfC5VpPwXU5er", "I2tJ7ud2NszgocKkHkmClXbQ6vlHE0Sp", "WRhnMtRu3VoUyGpCORxDhLZcb6GbN7Pt", "ionJv1BxfCrQS8AxzLJ8Tcnsr6gm7Nx1", "YblFDiTYESfr8ZIRtB8BAyjauKLHc0qm"};
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.I2 != com.facebook.ads.internal.exoplayer2.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.upstream.RawResourceDataSource> */
    public C1307bW(Context context, I2<? super C1307bW> i2) {
        this.A05 = context.getResources();
        this.A06 = i2;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0740Hh
    public final Uri A7H() {
        return this.A02;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a3 A[Catch: IOException -> 0x0114, TRY_ENTER, TryCatch #1 {IOException -> 0x0114, blocks: (B:2:0x0000, B:4:0x001a, B:5:0x0024, B:12:0x0076, B:21:0x00a8, B:23:0x00b2, B:24:0x00b5, B:20:0x00a3, B:34:0x00ef, B:35:0x00f4, B:38:0x0104, B:39:0x0113, B:36:0x00f5, B:37:0x0103), top: B:45:0x0000, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a8 A[Catch: IOException -> 0x0114, TryCatch #1 {IOException -> 0x0114, blocks: (B:2:0x0000, B:4:0x001a, B:5:0x0024, B:12:0x0076, B:21:0x00a8, B:23:0x00b2, B:24:0x00b5, B:20:0x00a3, B:34:0x00ef, B:35:0x00f4, B:38:0x0104, B:39:0x0113, B:36:0x00f5, B:37:0x0103), top: B:45:0x0000, inners: #0 }] */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0740Hh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long ABR(com.facebook.ads.redexgen.X.C0744Hl r8) throws com.facebook.ads.redexgen.X.I1 {
        /*
            Method dump skipped, instruction units count: 283
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1307bW.ABR(com.facebook.ads.redexgen.X.Hl):long");
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0740Hh
    public final void close() throws I1 {
        this.A02 = null;
        try {
            try {
                if (this.A03 != null) {
                    this.A03.close();
                }
                this.A03 = null;
                try {
                    try {
                        if (this.A01 != null) {
                            this.A01.close();
                        }
                    } finally {
                        this.A01 = null;
                        if (this.A04) {
                            this.A04 = false;
                            I2<? super C1307bW> i2 = this.A06;
                            if (i2 != null) {
                                i2.ABB(this);
                            }
                        }
                    }
                } catch (IOException e2) {
                    throw new I1(e2);
                }
            } catch (IOException e3) {
                throw new I1(e3);
            }
        } catch (Throwable th) {
            this.A03 = null;
            try {
                try {
                    if (this.A01 != null) {
                        this.A01.close();
                    }
                    this.A01 = null;
                    if (this.A04) {
                        this.A04 = false;
                        I2<? super C1307bW> i22 = this.A06;
                        if (i22 != null) {
                            i22.ABB(this);
                        }
                    }
                    throw th;
                } finally {
                    this.A01 = null;
                    if (this.A04) {
                        this.A04 = false;
                        I2<? super C1307bW> i23 = this.A06;
                        if (i23 != null) {
                            i23.ABB(this);
                        }
                    }
                }
            } catch (IOException e4) {
                throw new I1(e4);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0740Hh
    public final int read(byte[] bArr, int i2, int i3) throws I1 {
        if (i3 == 0) {
            return 0;
        }
        long j2 = this.A00;
        if (j2 == 0) {
            return -1;
        }
        if (j2 != -1) {
            try {
                i3 = (int) Math.min(j2, i3);
            } catch (IOException e2) {
                throw new I1(e2);
            }
        }
        int i4 = this.A03.read(bArr, i2, i3);
        if (i4 == -1) {
            if (this.A00 == -1) {
                return -1;
            }
            throw new I1(new EOFException());
        }
        long j3 = this.A00;
        if (j3 != -1) {
            this.A00 = j3 - ((long) i4);
        }
        I2<? super C1307bW> i22 = this.A06;
        if (i22 != null) {
            i22.A99(this, i4);
        }
        return i4;
    }
}
