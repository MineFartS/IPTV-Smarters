package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.annotation.Nullable;
import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1290bF implements InterfaceC0735Hc, I2<Object> {
    public static String[] A0A;
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;

    @Nullable
    public final Handler A06;

    @Nullable
    public final InterfaceC0734Hb A07;
    public final IP A08;
    public final C0779Iw A09;

    static {
        A01();
    }

    public static void A01() {
        A0A = new String[]{"8v43OWLt8X4Ft8FSsUnUJEljk6O9jZtl", "gqJU9rJqtCXP9nVsCJhzhjWr3OTUONn5", "evi8lnvhIGFpGwxvrEQ2HxpF9HfAYNb4", "XM9iQGBoaLQIRrKYvs1BFwTGSVuWakLP", "oYKHkHYzGvwdV8VAJO5FvOndhShHo3uL", "GsOQXWL80Wqi8CBj4PFxcrgidstVbv5Z", "TfEJwESWFeUjyASkqvscuoRhiyKsiSGj", "R3GeLkF45fmp7DtCtFYf0NMS1ko1sZ3Y"};
    }

    public C1290bF() {
        this(null, null, 1000000L, AdError.SERVER_ERROR_CODE, IP.A00);
    }

    public C1290bF(@Nullable Handler handler, @Nullable InterfaceC0734Hb interfaceC0734Hb, long j2, int i2, IP ip) {
        this.A06 = handler;
        this.A07 = interfaceC0734Hb;
        this.A09 = new C0779Iw(i2);
        this.A08 = ip;
        this.A01 = j2;
    }

    private void A02(int i2, long j2, long j3) {
        Handler handler = this.A06;
        if (handler != null) {
            InterfaceC0734Hb interfaceC0734Hb = this.A07;
            String[] strArr = A0A;
            if (strArr[3].charAt(14) == strArr[2].charAt(14)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[3] = "mcMhHiKL1Hs40ZODL70g4thjgDTU4mJQ";
            strArr2[2] = "gdrxxP25NVrEqdTm0xFGwMteDAr0ERpE";
            if (interfaceC0734Hb != null) {
                handler.post(new Hm(this, i2, j2, j3));
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0735Hc
    public final synchronized long A5T() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.I2
    public final synchronized void A99(Object obj, int i2) {
        this.A02 += (long) i2;
    }

    @Override // com.facebook.ads.redexgen.X.I2
    public final synchronized void ABB(Object obj) {
        IM.A04(this.A00 > 0);
        long jA4s = this.A08.A4s();
        long nowMs = jA4s - this.A03;
        int i2 = (int) nowMs;
        long nowMs2 = i2;
        this.A05 += nowMs2;
        long j2 = this.A04;
        long nowMs3 = this.A02;
        this.A04 = j2 + nowMs3;
        if (i2 > 0) {
            long nowMs4 = i2;
            this.A09.A04((int) Math.sqrt(this.A02), (this.A02 * 8000) / nowMs4);
            long j3 = this.A05;
            String[] strArr = A0A;
            if (strArr[6].charAt(30) == strArr[5].charAt(30)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[3] = "ZGZYZVMOjrgZsL4omJYgF6CzP4kXRh7Y";
            strArr2[2] = "w8y5sfHjCRRFpoxn3MnbYbSKFexwF0nZ";
            if (j3 >= 2000 || this.A04 >= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) {
                float bitsPerSecond = this.A09.A03(0.5f);
                this.A01 = (long) bitsPerSecond;
            }
        }
        A02(i2, this.A02, this.A01);
        int i3 = this.A00 - 1;
        this.A00 = i3;
        if (i3 > 0) {
            this.A03 = jA4s;
        }
        this.A02 = 0L;
    }

    @Override // com.facebook.ads.redexgen.X.I2
    public final synchronized void ABC(Object obj, C0744Hl c0744Hl) {
        if (this.A00 == 0) {
            this.A03 = this.A08.A4s();
        }
        this.A00++;
    }
}
