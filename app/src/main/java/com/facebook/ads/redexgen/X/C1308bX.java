package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1308bX implements InterfaceC0740Hh {
    public static String[] A04;
    public long A00;
    public boolean A01;
    public final InterfaceC0738Hf A02;
    public final InterfaceC0740Hh A03;

    static {
        A00();
    }

    public static void A00() {
        A04 = new String[]{"jlvJAgNeHWnJa3dPhRRd4EpOWMdB4X8x", "basxIWwUdkqjCj33WkHPX1XLcRlnz9UL", "EJ8jlkQXjQdwyr2PvL7NnSmrIKvSoKH9", "vRfpY4dXxgFvSAkqLCYO6SFKljAHuCzv", "ygfsCaK9ODNV1JdDOAbtF6as7T2mwjea", "kZYhIpAIarjEuyurYojB34Vr8jYSU6r4", "j4JmDL8bElApoe2AoNbHhKsqdvNkVwQT", "xpYPLrN7DnWMQWubBysNzF9"};
    }

    public C1308bX(InterfaceC0740Hh interfaceC0740Hh, InterfaceC0738Hf interfaceC0738Hf) {
        this.A03 = (InterfaceC0740Hh) IM.A01(interfaceC0740Hh);
        this.A02 = (InterfaceC0738Hf) IM.A01(interfaceC0738Hf);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0740Hh
    public final Uri A7H() {
        return this.A03.A7H();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0740Hh
    public final long ABR(C0744Hl dataSpec) throws IOException {
        this.A00 = this.A03.ABR(dataSpec);
        if (this.A00 == 0) {
            return 0L;
        }
        long j2 = dataSpec.A02;
        if (A04[4].charAt(25) == 'd') {
            throw new RuntimeException();
        }
        String[] strArr = A04;
        strArr[4] = "5eBqCtKJCfmd3joSOHW3VJl5u39JA8K8";
        strArr[4] = "5eBqCtKJCfmd3joSOHW3VJl5u39JA8K8";
        if (j2 == -1 && this.A00 != -1) {
            dataSpec = new C0744Hl(dataSpec.A04, dataSpec.A01, dataSpec.A03, this.A00, dataSpec.A05, dataSpec.A00);
        }
        this.A01 = true;
        this.A02.ABT(dataSpec);
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0740Hh
    public final void close() throws IOException {
        try {
            this.A03.close();
        } finally {
            if (this.A01) {
                this.A01 = false;
                this.A02.close();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0740Hh
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        if (this.A00 == 0) {
            return -1;
        }
        int i4 = this.A03.read(bArr, i2, i3);
        if (i4 > 0) {
            this.A02.write(bArr, i2, i4);
            long j2 = this.A00;
            if (j2 != -1) {
                long j3 = i4;
                if (A04[2].charAt(20) == 'R') {
                    throw new RuntimeException();
                }
                String[] strArr = A04;
                strArr[0] = "pjLm1ZauVMrHAqpQAI7gN0n14eRh7O52";
                strArr[5] = "T96N4GskjcbGLsEcsrwL44bvdnkYKV6X";
                this.A00 = j2 - j3;
            }
        }
        return i4;
    }
}
