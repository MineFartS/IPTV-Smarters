package com.facebook.ads.redexgen.X;

import android.os.Handler;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class LP {
    public static String[] A05;
    public float A00;
    public boolean A01;
    public boolean A02;
    public final Handler A03;
    public final LO A04;

    static {
        A02();
    }

    public static void A02() {
        A05 = new String[]{"AKWVUs1l0Ice5I6VX", "CXPBWDMo1Zqj2yCW5W30Ut48PEWYgYey", "QYYsUNIn7qky9LY", "uhDWqwwqE26XK4rQkizWNR4dlHqM4UZ3", "ZNpftHLPxc7R9PnANzOwdg7R2ap4pSI6", "3ke", "xa09Mpjas6OdUQMP5Qo7kdS83JfCqy78", "u6CBuCaaqyjpN4LkQhRqLLvzhKEDnG9S"};
    }

    public LP(int i2, LO lo) {
        this(i2, lo, new Handler());
    }

    @VisibleForTesting
    public LP(int i2, LO lo, Handler handler) {
        this.A02 = false;
        this.A00 = i2;
        this.A04 = lo;
        this.A03 = handler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A01() {
        this.A00 -= 0.25f;
        this.A04.AAe(this.A00);
        if (this.A00 <= 0.0f) {
            boolean z = this.A01;
            if (A05[4].charAt(25) == 'L') {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[6] = "KuCOx1ArmKJG2Js90Y8iwcXaowa3uSzZ";
            strArr[6] = "KuCOx1ArmKJG2Js90Y8iwcXaowa3uSzZ";
            if (!z) {
                this.A01 = true;
                this.A04.A9H();
                this.A02 = false;
            }
        }
    }

    public final float A04() {
        return this.A00;
    }

    public final boolean A05() {
        return this.A00 <= 0.0f;
    }

    public final boolean A06() {
        return this.A02;
    }

    public final boolean A07() {
        if (!A06()) {
            return false;
        }
        this.A02 = false;
        return true;
    }

    public final boolean A08() {
        if (A05() && !this.A01) {
            this.A01 = true;
            this.A04.A9H();
        }
        if (!A05() && !A06()) {
            this.A02 = true;
            this.A04.AAe(this.A00);
            this.A03.postDelayed(new C1251ac(this), 250L);
            return true;
        }
        if (A05[4].charAt(25) == 'L') {
            throw new RuntimeException();
        }
        String[] strArr = A05;
        strArr[3] = "u6tCNg8GXSpiTqjQspDcQdpU9nt4kRaX";
        strArr[7] = "uRN5Zlx2bfjM01c7Y9BPyYrHFfBp2TpI";
        return false;
    }
}
