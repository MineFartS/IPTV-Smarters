package com.facebook.ads.redexgen.X;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1313bc implements InterfaceC0740Hh {
    public static String[] A0L;
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public Uri A05;
    public Uri A06;
    public InterfaceC0740Hh A07;
    public IA A08;
    public String A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final InterfaceC0740Hh A0D;
    public final InterfaceC0740Hh A0E;
    public final InterfaceC0740Hh A0F;
    public final I6 A0G;

    @Nullable
    public final I8 A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;

    static {
        A05();
    }

    public static void A05() {
        A0L = new String[]{"xvXnimfZlroovEtMoHYEYdvHQmTptcRb", "VShQwZMBIZykoEi", "P7iiojcQSdjMkPZizdNAiKDH8422CMpJ", "OxKv", "P8zJvNho1beYtiBqU3s9pOljEd8sbOL5", "Bz35mpVTEU3xTv8hVu6cT493QseTsu6A", "YnRJs9xpv2Ig79N4M2dWIXRLqnd73xG0", "iIjgXD4YmMEy6XOGrZ4fgbIBHD"};
    }

    public C1313bc(I6 i6, InterfaceC0740Hh interfaceC0740Hh, InterfaceC0740Hh interfaceC0740Hh2, InterfaceC0738Hf interfaceC0738Hf, int i2, @Nullable I8 i8) {
        this.A0G = i6;
        this.A0D = interfaceC0740Hh2;
        this.A0I = (i2 & 1) != 0;
        this.A0K = (i2 & 2) != 0;
        this.A0J = (i2 & 4) != 0;
        this.A0F = interfaceC0740Hh;
        if (interfaceC0738Hf != null) {
            this.A0E = new C1308bX(interfaceC0740Hh, interfaceC0738Hf);
        } else {
            this.A0E = null;
        }
        this.A0H = i8;
    }

    private int A00(C0744Hl c0744Hl) {
        if (this.A0K && this.A0C) {
            return 0;
        }
        if (this.A0J && c0744Hl.A02 == -1) {
            return 1;
        }
        return -1;
    }

    public static Uri A01(I6 i6, String str, Uri uri) {
        IG contentMetadata = i6.A5p(str);
        Uri uriA01 = IH.A01(contentMetadata);
        return uriA01 == null ? uri : uriA01;
    }

    private void A02() throws IOException {
        InterfaceC0740Hh interfaceC0740Hh = this.A07;
        if (interfaceC0740Hh == null) {
            return;
        }
        try {
            interfaceC0740Hh.close();
        } finally {
            this.A07 = null;
            this.A0A = false;
            IA ia = this.A08;
            if (ia != null) {
                this.A0G.ACK(ia);
                this.A08 = null;
            }
        }
    }

    private void A03() {
        if (this.A0H != null && this.A04 > 0) {
            this.A0G.A5a();
            throw null;
        }
    }

    private void A04() throws IOException {
        this.A01 = 0L;
        if (A0B()) {
            this.A0G.ACx(this.A09, this.A03);
        }
    }

    private void A06(IOException iOException) {
        if (A09() || (iOException instanceof I4)) {
            this.A0C = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x01c5 A[PHI: r4
  0x01c5: PHI (r4v9 long) = (r4v8 long), (r4v10 long) binds: [B:76:0x01da, B:73:0x01c3] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A07(boolean r22) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 547
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1313bc.A07(boolean):void");
    }

    private boolean A08() {
        return this.A07 == this.A0F;
    }

    private boolean A09() {
        return this.A07 == this.A0D;
    }

    private boolean A0A() {
        return !A09();
    }

    private boolean A0B() {
        return this.A07 == this.A0E;
    }

    public static boolean A0C(IOException iOException) {
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof C0741Hi) && ((C0741Hi) cause).A00 == 0) {
                return true;
            }
        }
        if (A0L[5].charAt(13) != 'v') {
            throw new RuntimeException();
        }
        String[] strArr = A0L;
        strArr[1] = "Fi50x9pU4R4a4ch";
        strArr[1] = "Fi50x9pU4R4a4ch";
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0740Hh
    public final Uri A7H() {
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0740Hh
    public final long ABR(C0744Hl c0744Hl) throws IOException {
        try {
            this.A09 = IC.A02(c0744Hl);
            this.A06 = c0744Hl.A04;
            this.A05 = A01(this.A0G, this.A09, this.A06);
            this.A00 = c0744Hl.A00;
            this.A03 = c0744Hl.A03;
            this.A0B = A00(c0744Hl) != -1;
            boolean z = this.A0B;
            if (c0744Hl.A02 != -1 || this.A0B) {
                this.A01 = c0744Hl.A02;
            } else {
                this.A01 = this.A0G.A5o(this.A09);
                if (this.A01 != -1) {
                    this.A01 -= c0744Hl.A03;
                    if (this.A01 <= 0) {
                        throw new C0741Hi(0);
                    }
                }
            }
            A07(false);
            return this.A01;
        } catch (IOException e2) {
            A06(e2);
            throw e2;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0740Hh
    public final void close() throws IOException {
        this.A06 = null;
        this.A05 = null;
        A03();
        try {
            A02();
        } catch (IOException e2) {
            A06(e2);
            throw e2;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0740Hh
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        if (i3 == 0) {
            return 0;
        }
        if (this.A01 == 0) {
            return -1;
        }
        try {
            long j2 = this.A03;
            long j3 = this.A02;
            String[] strArr = A0L;
            if (strArr[4].charAt(0) != strArr[2].charAt(0)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0L;
            strArr2[7] = "DFL6VfCjI9oAtZuqjooU4v3Ar2";
            strArr2[3] = "hOjd";
            if (j2 >= j3) {
                A07(true);
            }
            int i4 = this.A07.read(bArr, i2, i3);
            if (i4 != -1) {
                if (A09()) {
                    this.A04 += (long) i4;
                }
                this.A03 += (long) i4;
                if (this.A01 != -1) {
                    this.A01 -= (long) i4;
                }
            } else if (this.A0A) {
                A04();
            } else if (this.A01 > 0 || this.A01 == -1) {
                A02();
                A07(false);
                return read(bArr, i2, i3);
            }
            return i4;
        } catch (IOException e2) {
            if (this.A0A && A0C(e2)) {
                A04();
                return -1;
            }
            A06(e2);
            throw e2;
        }
    }
}
