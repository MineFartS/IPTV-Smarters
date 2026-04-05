package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class JL implements Runnable {
    public static String[] A05;
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ JO A04;

    static {
        A00();
    }

    public static void A00() {
        A05 = new String[]{"DJpTE", "hjmigejYKbOgwmfvV1nc5iE8IDOYmXil", "2YKNaj9Qlm", "qxfanbBXI2ZjoCTgG7w8KuDdJjLlXH62", "XtZaZ3wYkBKmpvCnemS2yQk1T2uyfDPG", "Gw99gcoZxN", "lvDFpJS29mpdODJdSJz5AdBwktpN", "hlGH8f80A3YyARPnHLcSnfRHIOI89tOr"};
    }

    public JL(JO jo, int i2, int i3, int i4, float f2) {
        this.A04 = jo;
        this.A03 = i2;
        this.A01 = i3;
        this.A02 = i4;
        this.A00 = f2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            this.A04.A01.ABO(this.A03, this.A01, this.A02, this.A00);
        } catch (Throwable th) {
            if (A05[0].length() != 5) {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[3] = "OXxSdVemaS9DNqMoLNSyLFOeF9oFC1IL";
            strArr[3] = "OXxSdVemaS9DNqMoLNSyLFOeF9oFC1IL";
            C0822Kp.A00(th, this);
        }
    }
}
