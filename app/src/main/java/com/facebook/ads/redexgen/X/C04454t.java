package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.widget.RelativeLayout;
import java.util.Arrays;
import org.achartengine.renderer.DefaultRenderer;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C04454t {
    public static byte[] A04;
    public final Intent A00;
    public final C04484w A01;
    public final X2 A02;
    public final JZ A03;

    static {
        A0N();
    }

    public static String A0M(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 79);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0N() {
        A04 = new byte[]{51, 54, DateTimeFieldType.HALFDAY_OF_DAY, 54, 51, 38, 51, DateTimeFieldType.HALFDAY_OF_DAY, 48, 39, 60, 54, 62, 55, DateTimeFieldType.HOUR_OF_HALFDAY, 25, 11, 29, DateTimeFieldType.HOUR_OF_HALFDAY, 24, 25, 24, 42, DateTimeFieldType.SECOND_OF_MINUTE, 24, 25, DateTimeFieldType.MINUTE_OF_HOUR, 61, 24, 56, 29, 8, 29, 62, 9, DateTimeFieldType.MINUTE_OF_DAY, 24, DateTimeFieldType.CLOCKHOUR_OF_DAY, 25, 77, 82, 95, 94, 84, 100, 79, 82, 86, 94, 100, 75, 84, 87, 87, 82, 85, 92, 100, 82, 85, 79, 94, 73, 77, 90, 87};
    }

    public C04454t(C04484w c04484w, Intent intent, JZ jz, X2 x2) {
        this.A01 = c04484w;
        this.A00 = intent;
        this.A03 = jz;
        this.A02 = x2;
    }

    public /* synthetic */ C04454t(C04484w c04484w, Intent intent, JZ jz, X2 x2, C04444s c04444s) {
        this(c04484w, intent, jz, x2);
    }

    private C0996Rl A00() {
        return (C0996Rl) this.A00.getSerializableExtra(A0M(0, 14, 29));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MS A02() {
        C04484w c04484w = this.A01;
        return new C1220a7(c04484w, this.A02, this.A03, new TB(c04484w));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MS A03() {
        return new R0(this.A02, this.A03, new TB(this.A01), A00(), new Y2(), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MS A04() {
        return new R0(this.A02, this.A03, new TB(this.A01), (C0997Rm) this.A00.getSerializableExtra(A0M(14, 25, 51)), new C1164Xz(), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MS A05() {
        X2 x2 = this.A02;
        return new C05187y(x2, this.A03, new C7C(x2), new TB(this.A01), A00());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MS A06() {
        return new C05258g(this.A02, new Y2(), this.A03, A00(), new C7C(this.A02), new TB(this.A01));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MS A07() {
        return new YW(this.A02, this.A03, new TB(this.A01), A00(), null, new Y2());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MS A08() {
        return new AnonymousClass80(this.A02, new Y2(), this.A03, A00(), new C7C(this.A02), new TB(this.A01));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MS A09() {
        C0997Rm c0997Rm = (C0997Rm) this.A00.getSerializableExtra(A0M(14, 25, 51));
        C04444s c04444s = null;
        if (c0997Rm.A0f()) {
            return new AnonymousClass80(this.A02, new C1164Xz(), this.A03, c0997Rm, new C7C(this.A02), new ER(this.A01));
        }
        X2 x2 = this.A02;
        return new YL(x2, this.A03, new C0854Lx(x2), new ER(this.A01), c0997Rm);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MS A0A() {
        C0997Rm c0997Rm = (C0997Rm) this.A00.getSerializableExtra(A0M(14, 25, 51));
        return new YW(this.A02, this.A03, new ER(this.A01), c0997Rm, c0997Rm.A0V(), new C1164Xz());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MS A0B(RelativeLayout relativeLayout) {
        Y5 y5 = new Y5(this.A02, new TC(this), this.A03, new TB(this.A01));
        y5.A05(relativeLayout);
        y5.A04(this.A00.getIntExtra(A0M(39, 27, 116), 200));
        C0856Lz.A0P(relativeLayout, DefaultRenderer.BACKGROUND_COLOR);
        return y5;
    }
}
