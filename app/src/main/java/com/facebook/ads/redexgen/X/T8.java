package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class T8 extends C4I {
    public static byte[] A03;
    public static String[] A04;
    public C0660Eb A00;
    public Scroller A01;
    public final C4K A02 = new T7(this);

    static {
        A0B();
        A0A();
    }

    public static String A07(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 53);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0A() {
        byte[] bArr = {-35, 10, -68, 5, 10, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, DateTimeFieldType.CLOCKHOUR_OF_DAY, -3, 10, -1, 1, -68, 11, 2, -68, -21, 10, -30, 8, 5, 10, 3, -24, 5, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, DateTimeFieldType.CLOCKHOUR_OF_DAY, 1, 10, 1, DateTimeFieldType.HOUR_OF_HALFDAY, -68, -3, 8, DateTimeFieldType.HOUR_OF_HALFDAY, 1, -3, 0, DateTimeFieldType.SECOND_OF_MINUTE, -68, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 1, DateTimeFieldType.CLOCKHOUR_OF_DAY, -54};
        if (A04[2].length() != 32) {
            throw new RuntimeException();
        }
        String[] strArr = A04;
        strArr[3] = "Gfsvb5V6ZkZ1EjPhJmDEOg0wCX37AMGK";
        strArr[5] = "BogmwpJuEiSgKohE6B9VLJKkNQC2pxlX";
        A03 = bArr;
    }

    public static void A0B() {
        A04 = new String[]{"WP5CpU5dCfM1vj2iCgRczyLeS833jqA7", "f0t6mABNpir4NiI1IJBR", "VMSqLwjWc3fXvu7D9B7JwatTJSWiKmSt", "2kGOlvpEajHcc9JJ5BV7kSrV8Uhb9VDh", "BGGgbgkg4NpzKA2XjpG6Q8iHB2GG9zH0", "ziOTckvigWpUqNYWulExTvMWDfbzI1Sq", "WkLWBkQ13lLgYVln8HDaQ7gYbGPRUWfj", "hZJ2tRP2pGaevCKAXmW2Fr9GhnOGACBf"};
    }

    public abstract int A0E(C4F c4f, int i2, int i3);

    @Nullable
    public abstract View A0F(C4F c4f);

    @Nullable
    public abstract int[] A0J(@NonNull C4F c4f, @NonNull View view);

    @Nullable
    private final C4S A06(C4F c4f) {
        return A0G(c4f);
    }

    private void A08() {
        this.A00.A1l(this.A02);
        this.A00.setOnFlingListener(null);
    }

    private void A09() throws IllegalStateException {
        if (this.A00.getOnFlingListener() == null) {
            this.A00.A1k(this.A02);
            this.A00.setOnFlingListener(this);
            return;
        }
        throw new IllegalStateException(A07(0, 43, 103));
    }

    private boolean A0C(@NonNull C4F c4f, int i2, int i3) {
        C4S c4sA06;
        if (!(c4f instanceof C4R) || (c4sA06 = A06(c4f)) == null) {
            return false;
        }
        int iA0E = A0E(c4f, i2, i3);
        String[] strArr = A04;
        if (strArr[0].charAt(25) == strArr[7].charAt(25)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[0] = "3QNQgzU1MIdfo8xP0zEWa1SfaSPVi8u7";
        strArr2[7] = "BhxrOivCOMjMD1hwED78TbVHZR3oyoMb";
        if (iA0E == -1) {
            return false;
        }
        c4sA06.A0B(iA0E);
        c4f.A1M(c4sA06);
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.C4I
    public final boolean A0D(int i2, int i3) {
        C4F layoutManager = this.A00.getLayoutManager();
        if (layoutManager == null || this.A00.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.A00.getMinFlingVelocity();
        int minFlingVelocity2 = Math.abs(i3);
        if (minFlingVelocity2 <= minFlingVelocity) {
            int minFlingVelocity3 = Math.abs(i2);
            if (minFlingVelocity3 <= minFlingVelocity) {
                return false;
            }
        }
        return A0C(layoutManager, i2, i3);
    }

    @Nullable
    @Deprecated
    public C1028Ss A0G(C4F c4f) {
        if (!(c4f instanceof C4R)) {
            return null;
        }
        return new EZ(this, this.A00.getContext());
    }

    public final void A0H() {
        C4F layoutManager;
        View snapView;
        C0660Eb c0660Eb = this.A00;
        if (c0660Eb == null || (layoutManager = c0660Eb.getLayoutManager()) == null || (snapView = A0F(layoutManager)) == null) {
            return;
        }
        int[] iArrA0J = A0J(layoutManager, snapView);
        if (iArrA0J[0] != 0 || iArrA0J[1] != 0) {
            this.A00.A1f(iArrA0J[0], iArrA0J[1]);
        }
    }

    public final void A0I(@Nullable C0660Eb c0660Eb) throws IllegalStateException {
        C0660Eb c0660Eb2 = this.A00;
        if (c0660Eb2 == c0660Eb) {
            return;
        }
        if (c0660Eb2 != null) {
            A08();
        }
        this.A00 = c0660Eb;
        if (this.A00 != null) {
            A09();
            this.A01 = new Scroller(this.A00.getContext(), new DecelerateInterpolator());
            A0H();
        }
    }
}
