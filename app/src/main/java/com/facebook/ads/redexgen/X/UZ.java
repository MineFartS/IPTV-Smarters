package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.AudioManager;
import android.os.SystemClock;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class UZ extends C6U {
    public static byte[] A01;
    public final AudioManager A00;

    static {
        A05();
    }

    public static String A04(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 33);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A01 = new byte[]{-22, -2, -19, -14, -8};
    }

    public UZ(Context context, C04715u c04715u) {
        super(context, c04715u);
        this.A00 = (AudioManager) context.getSystemService(A04(0, 5, 104));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"Nullable Dereference"})
    public AbstractC04956s A03(HashMap<Integer, UY> map) {
        return new C1132Wt(SystemClock.elapsedRealtime(), A03(), map, EnumC04946r.A06);
    }

    public final InterfaceC04806d A0H() {
        return new UW(this);
    }

    public final InterfaceC04806d A0I() {
        return new UT(this);
    }

    public final InterfaceC04806d A0J() {
        return new UU(this);
    }

    public final InterfaceC04806d A0K() {
        return new UV(this);
    }

    public final InterfaceC04806d A0L(List<C04796c> list) {
        return new UX(this, list);
    }
}
