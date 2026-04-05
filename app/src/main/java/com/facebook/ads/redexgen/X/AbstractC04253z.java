package com.facebook.ads.redexgen.X;

import android.graphics.Rect;
import android.view.View;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC04253z {
    public static byte[] A03;
    public int A00;
    public final Rect A01;
    public final C4F A02;

    static {
        A04();
    }

    public static String A03(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 54);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A03 = new byte[]{84, 83, 75, 92, 81, 84, 89, 29, 82, 79, 84, 88, 83, 73, 92, 73, 84, 82, 83};
    }

    public abstract int A06();

    public abstract int A07();

    public abstract int A08();

    public abstract int A09();

    public abstract int A0A();

    public abstract int A0B();

    public abstract int A0C(View view);

    public abstract int A0D(View view);

    public abstract int A0E(View view);

    public abstract int A0F(View view);

    public abstract int A0G(View view);

    public abstract int A0H(View view);

    public abstract void A0J(int i2);

    public AbstractC04253z(C4F c4f) {
        this.A00 = Integer.MIN_VALUE;
        this.A01 = new Rect();
        this.A02 = c4f;
    }

    public /* synthetic */ AbstractC04253z(C4F c4f, C1029St c1029St) {
        this(c4f);
    }

    public static AbstractC04253z A00(C4F c4f) {
        return new C1029St(c4f);
    }

    public static AbstractC04253z A01(C4F c4f) {
        return new C1030Su(c4f);
    }

    public static AbstractC04253z A02(C4F c4f, int i2) {
        if (i2 == 0) {
            return A00(c4f);
        }
        if (i2 == 1) {
            return A01(c4f);
        }
        throw new IllegalArgumentException(A03(0, 19, 11));
    }

    public final int A05() {
        if (Integer.MIN_VALUE == this.A00) {
            return 0;
        }
        return A0B() - this.A00;
    }

    public final void A0I() {
        this.A00 = A0B();
    }
}
