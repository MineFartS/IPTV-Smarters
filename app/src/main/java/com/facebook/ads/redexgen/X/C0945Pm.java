package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.facebook.ads.internal.exoplayer2.Format;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Pm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@TargetApi(14)
public final class C0945Pm {
    public static byte[] A02;
    public static String[] A03;
    public final C0626Cq A00;
    public final C1290bF A01 = new C1290bF();

    static {
        A03();
        A02();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 10);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-114, -104, -116, -114, -49, -51, -31, -33, -47, -114, -116, -90, -116, -114, -96, -86, -98, -96, -16, -29, -20, -30, -29, -16, -29, -16, -57, -20, -30, -29, -10, -96, -98, -72, -98, -96, -114, -23, 111, 114, -127, -68, 99, -75, -70, -79, -90, 99, 97, 123, 97, 99};
    }

    public static void A03() {
        A03 = new String[]{"WzijvlAd9RP1HJzMxCKzeYHnMs2QP54v", "kfrqpsiELz0FvZTPYg", "hAwPDz", "OryCsPOoCbEZ1Kjw18", "JoqBI6chV", "rfkFyJ13DXugB3RLj6H", "rQvj", "kthZXjW83"};
    }

    public C0945Pm(X2 x2) {
        this.A00 = A1.A00(new C1160Xv(x2), new AM(new C1279b4(this.A01)), new C1158Xt());
    }

    @VisibleForTesting
    public static String A01(C05699z c05699z) {
        return A00(41, 11, 55) + c05699z.A01 + A00(14, 22, 116) + c05699z.A00 + A00(0, 14, 98) + c05699z.getCause() + A00(36, 2, 98);
    }

    public static boolean A04() {
        if (A03[0].charAt(3) == 'z') {
            throw new RuntimeException();
        }
        String[] strArr = A03;
        strArr[6] = "p35x";
        strArr[6] = "p35x";
        return true;
    }

    public final int A05() {
        return this.A00.A0K();
    }

    public final int A06() {
        return this.A00.A5X();
    }

    public final long A07() {
        return this.A00.A5v();
    }

    public final long A08() {
        return this.A00.A66();
    }

    @Nullable
    public final C0943Pk A09() {
        Format formatA0M = this.A00.A0M();
        if (formatA0M == null) {
            return null;
        }
        return new C0943Pk(formatA0M.A0F, formatA0M.A08);
    }

    public final void A0A() {
        this.A00.ACG();
    }

    public final void A0B() {
        this.A00.ACp();
    }

    public final void A0C() {
        this.A00.A0N();
    }

    public final void A0D(float f2) {
        this.A00.A0O(f2);
    }

    public final void A0E(long j2) {
        this.A00.ACo(j2);
    }

    public final void A0F(Context context, Uri uri) {
        if (JT.A1b(context)) {
            this.A00.A0Q(new C1225aC(C0949Pq.A05(context).A0E(context)).A00(uri));
        } else {
            this.A00.A0Q(new C1225aC(new C1292bH(context, J1.A0N(context, A00(38, 3, 4)), this.A01)).A00(uri));
        }
    }

    public final void A0G(@Nullable Surface surface) {
        this.A00.A0P(surface);
    }

    public final void A0H(InterfaceC0942Pj interfaceC0942Pj) {
        this.A00.A3H(new GX(this, interfaceC0942Pj));
    }

    public final void A0I(InterfaceC0944Pl interfaceC0944Pl) {
        this.A00.A0R(new GY(this, interfaceC0944Pl));
    }

    public final void A0J(boolean z) {
        this.A00.AD5(z);
    }

    public final boolean A0K() {
        return this.A00.A6n();
    }

    public final boolean A0L() {
        return this.A00.A0L() != null;
    }
}
