package com.facebook.ads.redexgen.X;

import com.facebook.ads.RewardData;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Et, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0676Et extends AbstractC1010Rz {
    public static byte[] A00;
    public static String[] A01;

    static {
        A03();
        A02();
    }

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A01;
            if (strArr[7].charAt(30) != strArr[6].charAt(30)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[1] = "Dg0tZg7IxBj4D2AEunqK4FRxjbaI0pzK";
            strArr2[4] = "5sVR5Q40j80Tm4EH72ZLdFDAQDj0jOHn";
            if (i5 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 112);
            i5++;
        }
    }

    public static void A02() {
        A00 = new byte[]{-11, -13, 0, -78, 1, 0, -2, 11, -78, 5, -9, 6, -78, 1, 0, -78, 4, -9, 9, -13, 4, -10, -9, -10, -78, 8, -5, -10, -9, 1, -78, -13, -10, 5, -15, -14, -93, -28, -25, -28, -13, -9, -24, -11, -93, -11, -24, -28, -25, -4, -93, -9, -14, -93, -10, -24, -9, -93, -11, -24, -6, -28, -11, -25, -93, -14, -15};
    }

    public static void A03() {
        A01 = new String[]{"QPajxPBXawZguZvIACdyFqOYUKJhGG1P", "5fhxQ1wmDDZwcYW6vVZtBFGAbpCppeaF", "0C8PIOmzvjBgpmOh8JUWA", "4kKOVZ4CcWBKVljagfvAN2XyBryastSO", "Oy7EzKzQwTS7e9udIDBq4FtqglrDvqBF", "BZaaKRqUw", "6zOS7wuF6dlGz7u6SsHniaRnv53e8kon", "jwUp8OtoUlvjJY1bP74aKb8UsU7a0Ko9"};
    }

    public C0676Et(X2 x2, C03611k c03611k) {
        super(x2, c03611k);
    }

    private AnonymousClass12 A00(Runnable runnable) {
        return new S7(this, runnable);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1010Rz
    public final void A0N() {
        AbstractC0992Rh abstractC0992Rh = (AbstractC0992Rh) this.A02;
        abstractC0992Rh.A00(this.A08.A00);
        abstractC0992Rh.A0C();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1010Rz
    public final void A0Q(InterfaceC03380n interfaceC03380n, C05408v c05408v, C05388t c05388t, Map<String, Object> map) {
        F0 f0 = (F0) interfaceC03380n;
        Runnable rewardedVideoTimeout = new S6(this, map, f0);
        if (JT.A1N(this.A0C)) {
            A0G().postDelayed(rewardedVideoTimeout, c05408v.A05().A05());
        }
        f0.A0D(this.A0C, A00(rewardedVideoTimeout), map, this.A08.A05, this.A08.A03, this.A08.A04);
    }

    public final void A0Y(RewardData rewardData) {
        if (this.A02 != null) {
            if (this.A02.A6l() == AdPlacementType.REWARDED_VIDEO) {
                ((AbstractC0992Rh) this.A02).A01(rewardData);
                return;
            }
            throw new IllegalStateException(A01(0, 34, 34));
        }
        throw new IllegalStateException(A01(34, 33, 19));
    }
}
