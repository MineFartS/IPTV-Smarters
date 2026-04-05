package com.facebook.ads.redexgen.X;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.facebook.ads.AdError;
import java.util.HashMap;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ns, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC0900Ns extends LinearLayout {
    public final int A00;
    public final RelativeLayout A01;
    public final X2 A02;
    public final XD A03;
    public final O0 A04;
    public static final LinearLayout.LayoutParams A06 = new LinearLayout.LayoutParams(-2, -2);
    public static final int A05 = (int) (C0856Lz.A01 * 8.0f);

    public abstract void A0D(int i2);

    public abstract void A0E(boolean z);

    public AbstractC0900Ns(X2 x2, int i2, C1H c1h, String str, JZ jz, MR mr, Q2 q2, C0849Ls c0849Ls) {
        super(x2);
        C0856Lz.A0N(this);
        this.A02 = x2;
        this.A00 = i2;
        this.A04 = new O0(x2);
        C0856Lz.A0P(this.A04, 0);
        C0856Lz.A0N(this.A04);
        this.A03 = new XD(x2, str, c1h, jz, mr, q2, c0849Ls);
        C0856Lz.A0J(AdError.NO_FILL_ERROR_CODE, this.A03);
        this.A01 = new RelativeLayout(x2);
        this.A01.setLayoutParams(A06);
        C0856Lz.A0N(this.A01);
    }

    public int A09(int i2) {
        return 0;
    }

    public RelativeLayout.LayoutParams A0B(View view) {
        return new RelativeLayout.LayoutParams(-1, -2);
    }

    public RelativeLayout.LayoutParams A0C(View view) {
        return new RelativeLayout.LayoutParams(-1, -2);
    }

    public final XD getCTAButton() {
        return this.A03;
    }

    public View getExpandableLayout() {
        return null;
    }

    @VisibleForTesting
    public final ImageView getIconView() {
        return this.A04;
    }

    public void setInfo(C1G c1g, C1I c1i, String str, String str2, @Nullable InterfaceC0903Nv interfaceC0903Nv) {
        this.A03.setCta(c1i, str, new HashMap(), interfaceC0903Nv);
        XE xe = new XE(this.A04, this.A02);
        int i2 = this.A00;
        xe.A06(i2, i2).A08(str2);
    }
}
