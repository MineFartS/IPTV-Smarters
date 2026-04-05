package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1208Zu implements InterfaceC0666Eh {
    public static String[] A06;
    public final C0744Hl A00;
    public final I6 A01;
    public final C1313bc A02;
    public final C0772Ip A04;
    public final IB A03 = new IB();
    public final AtomicBoolean A05 = new AtomicBoolean();

    static {
        A00();
    }

    public static void A00() {
        A06 = new String[]{"0vmpU1QtAhI6qjIdcVId", "klBv", "qKjW3ego541fEYihs", "NuBFx4EY8fIgWeMvZ", "vAKBh2R", "FoB4J1nu", "9b5WU1uKCw6g3SYcMdOb", "twQXN8Z"};
    }

    public C1208Zu(Uri uri, String str, C0667Ei c0667Ei) {
        this.A00 = new C0744Hl(uri, 0L, -1L, str, 0);
        this.A01 = c0667Ei.A00();
        this.A02 = c0667Ei.A01(false);
        this.A04 = c0667Ei.A02();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0666Eh
    public final void A4r() throws InterruptedException, IOException {
        this.A04.A00(-1000);
        try {
            IC.A04(this.A00, this.A01, this.A02, new byte[131072], this.A04, -1000, this.A03, this.A05, true);
            C0772Ip c0772Ip = this.A04;
            String[] strArr = A06;
            if (strArr[3].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[0] = "qX3fQQGAY3dTsBjdyBPn";
            strArr2[6] = "Z0TFAaYyqvVnxMY9deNw";
            c0772Ip.A03(-1000);
        } catch (Throwable th) {
            this.A04.A03(-1000);
            throw th;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0666Eh
    public final float A64() {
        long j2 = this.A03.A01;
        if (j2 == -1) {
            return -1.0f;
        }
        return (this.A03.A00() * 100.0f) / j2;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0666Eh
    public final long A65() {
        return this.A03.A00();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0666Eh
    public final void cancel() {
        this.A05.set(true);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0666Eh
    public final void remove() {
        IC.A06(this.A01, IC.A02(this.A00));
    }
}
