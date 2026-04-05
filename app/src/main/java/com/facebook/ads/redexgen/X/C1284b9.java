package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.b9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1284b9 implements InterfaceC0740Hh {
    public static byte[] A06;
    public static String[] A07;
    public long A00;
    public Uri A01;
    public InputStream A02;
    public boolean A03;
    public final AssetManager A04;
    public final I2<? super C1284b9> A05;

    static {
        A02();
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 54);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{107, 98, 44, 35, 41, 63, 34, 36, 41, DateTimeFieldType.MINUTE_OF_DAY, 44, 62, 62, 40, 57, 98};
    }

    public static void A02() {
        A07 = new String[]{"pM08nT1ncmNJ", "g85", "nscQf0o4Li7UcF904CUq0pnhLdimh0nx", "F8VXv1qVoFp68OVo6WPqVPomjNx", "ZQ8cSAnJS", "Qhc2B", "YeRFTalD9", "SLGuxMrf5R7JWBKvcRLC7wUDDVq2YQ4u"};
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.I2 != com.facebook.ads.internal.exoplayer2.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.upstream.AssetDataSource> */
    public C1284b9(Context context, I2<? super C1284b9> i2) {
        this.A04 = context.getAssets();
        this.A05 = i2;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0740Hh
    public final Uri A7H() {
        return this.A01;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0098 A[Catch: IOException -> 0x00c3, TRY_ENTER, TryCatch #0 {IOException -> 0x00c3, blocks: (B:2:0x0000, B:4:0x001a, B:5:0x0020, B:15:0x0069, B:24:0x009d, B:26:0x00af, B:23:0x0098, B:32:0x00bd, B:33:0x00c2, B:6:0x0033, B:8:0x0041), top: B:37:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009d A[Catch: IOException -> 0x00c3, TryCatch #0 {IOException -> 0x00c3, blocks: (B:2:0x0000, B:4:0x001a, B:5:0x0020, B:15:0x0069, B:24:0x009d, B:26:0x00af, B:23:0x0098, B:32:0x00bd, B:33:0x00c2, B:6:0x0033, B:8:0x0041), top: B:37:0x0000 }] */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0740Hh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long ABR(com.facebook.ads.redexgen.X.C0744Hl r9) throws com.facebook.ads.redexgen.X.C0733Ha {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1284b9.ABR(com.facebook.ads.redexgen.X.Hl):long");
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0740Hh
    public final void close() throws C0733Ha {
        this.A01 = null;
        try {
            try {
                if (this.A02 != null) {
                    this.A02.close();
                }
            } catch (IOException e2) {
                throw new C0733Ha(e2);
            }
        } finally {
            this.A02 = null;
            if (this.A03) {
                this.A03 = false;
                I2<? super C1284b9> i2 = this.A05;
                if (i2 != null) {
                    i2.ABB(this);
                }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0740Hh
    public final int read(byte[] bArr, int i2, int i3) throws C0733Ha {
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
                throw new C0733Ha(e2);
            }
        }
        int i4 = this.A02.read(bArr, i2, i3);
        if (i4 == -1) {
            if (this.A00 == -1) {
                return -1;
            }
            throw new C0733Ha(new EOFException());
        }
        long j3 = this.A00;
        if (j3 != -1) {
            this.A00 = j3 - ((long) i4);
        }
        I2<? super C1284b9> i22 = this.A05;
        if (i22 != null) {
            i22.A99(this, i4);
        }
        return i4;
    }
}
