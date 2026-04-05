package com.facebook.ads.redexgen.X;

import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.facebook.ads.AdError;
import com.facebook.ads.internal.view.ToolbarActionView$ToolbarActionMode;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class O9 extends RelativeLayout {
    public static byte[] A08;
    public static final int A09;
    public static final int A0A;
    public C1H A00;
    public boolean A01;
    public boolean A02;
    public final X2 A03;
    public final JZ A04;
    public final XD A05;
    public final O6 A06;
    public final OD A07;

    public static String A0I(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 9);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0J() {
        A08 = new byte[]{81, 93, 95, 28, 84, 83, 81, 87, 80, 93, 93, 89, 28, 83, 86, 65, 28, 91, 92, 70, 87, 64, 65, 70, 91, 70, 91, 83, 94, 28, 81, 94, 91, 81, 89, 87, 86};
    }

    public abstract boolean A0c();

    static {
        A0J();
        A09 = (int) (C0856Lz.A01 * 16.0f);
        A0A = (int) (C0856Lz.A01 * 28.0f);
    }

    public O9(OD od, boolean z) {
        C1H c1hA00;
        super(od.A05());
        this.A01 = false;
        this.A07 = od;
        this.A03 = od.A05();
        this.A04 = od.A06();
        if (od.A00() == 1) {
            c1hA00 = od.A04().A0L().A01();
        } else {
            c1hA00 = od.A04().A0L().A00();
        }
        this.A00 = c1hA00;
        this.A02 = z;
        this.A05 = new XD(od.A05(), A0I(0, 37, 59), this.A00, od.A06(), od.A09(), od.A0B(), od.A07());
        this.A05.setRoundedCornersEnabled(A0N());
        this.A05.setViewShowsOverMedia(A0M());
        C0856Lz.A0J(AdError.NO_FILL_ERROR_CODE, this.A05);
        this.A06 = new O6(this.A03, this.A00, this.A02, A0O(), A0P());
        C0856Lz.A0N(this.A06);
        if (JT.A1J(this.A03)) {
            this.A06.setDescriptionVisibility(8);
        }
    }

    public void A0K(C7q c7q) {
        this.A01 = true;
    }

    public void A0L(C05127n c05127n) {
    }

    public boolean A0M() {
        return true;
    }

    public boolean A0N() {
        return true;
    }

    public boolean A0O() {
        return true;
    }

    public boolean A0P() {
        return true;
    }

    public void A0W() {
    }

    public void A0X() {
    }

    public void A0Y() {
    }

    public void A0Z() {
    }

    public void A0a() {
    }

    public void A0b(AnonymousClass19 anonymousClass19, String str, double d2, @Nullable Bundle bundle) {
        this.A06.A02(anonymousClass19.A0F().A05(), anonymousClass19.A0F().A01(), null, false, !A0c() && d2 > 0.0d && d2 < 1.0d);
        this.A05.setCta(anonymousClass19.A0G(), str, new HashMap());
    }

    public boolean A0d(boolean z) {
        return false;
    }

    public X2 getAdContextWrapper() {
        return this.A03;
    }

    public JZ getAdEventManager() {
        return this.A04;
    }

    @ToolbarActionView$ToolbarActionMode
    public int getCloseButtonStyle() {
        return 0;
    }

    public C1H getColors() {
        return this.A00;
    }

    public XD getCtaButton() {
        return this.A05;
    }

    public O6 getTitleDescContainer() {
        return this.A06;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        C1H c1hA00;
        super.onConfigurationChanged(configuration);
        if (configuration.orientation == 1) {
            c1hA00 = this.A07.A04().A0L().A01();
        } else {
            c1hA00 = this.A07.A04().A0L().A00();
        }
        this.A00 = c1hA00;
        this.A05.setViewShowsOverMedia(A0M());
        this.A05.setUpButtonColors(this.A00);
        this.A06.A01(this.A00, this.A02);
    }
}
