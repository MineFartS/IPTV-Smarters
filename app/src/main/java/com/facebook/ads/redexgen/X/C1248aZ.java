package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1248aZ implements InterfaceC0837Lg {
    public static byte[] A03;
    public static String[] A04;
    public int A00;

    @Nullable
    public String A01;
    public final InterfaceC0837Lg A02;

    static {
        A03();
        A02();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            byte b2 = bArrCopyOfRange[i5];
            String[] strArr = A04;
            if (strArr[5].charAt(25) == strArr[3].charAt(25)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[5] = "Ai5XpAh7M4hRkPfPQf54GYnUnAkHicBv";
            strArr2[3] = "aIcIWiLMc3Hy2WApHOm5eO35KvTaoUWD";
            bArrCopyOfRange[i5] = (byte) ((b2 - i4) - 83);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{-117, -117, 125, -128};
    }

    public static void A03() {
        A04 = new String[]{"3JpGgMVfhEKs4h1tr8RMzDA7DOHokops", "dXqQ9QAcXKU8whF3kmnzOWjNbVMrrIOv", "otwaAvusvekoag06qMT5pISHPHVrRcMV", "WpvUEDFnYdSXMC7RGaJnlQQN5lPpeUoV", "uIVwlH6eBNHvEYk4kE6nlnhEt8muXj04", "pYVE6LchgLxW1usH7NIdAbU6pOe1Iyyx", "cgHZB3wyyqxQlT2ShG9pTXiCyg", "w9qB75SnMFWvoXL9CpdnGLUKrWLPOybN"};
    }

    public C1248aZ(InterfaceC0837Lg interfaceC0837Lg) {
        this.A02 = interfaceC0837Lg;
    }

    private void A01() {
        if (this.A01 != null) {
            this.A02.ABp(this.A01 + A00(0, 4, 10) + this.A00);
            this.A01 = null;
            this.A00 = 0;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0837Lg
    public final void ABp(String str) {
        if (!C0839Li.A0A(str)) {
            String strA04 = C0839Li.A04(str);
            if (strA04.equals(this.A01)) {
                this.A00++;
                return;
            }
            A01();
            this.A01 = strA04;
            this.A00 = 1;
            return;
        }
        A01();
        this.A02.ABp(str);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0837Lg
    public final void flush() {
        A01();
        this.A02.flush();
    }
}
