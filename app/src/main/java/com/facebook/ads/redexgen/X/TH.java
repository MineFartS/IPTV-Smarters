package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.view.View;
import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class TH extends AbstractC03390o {
    public static byte[] A03;
    public View A00;
    public final C04434r A01;
    public final DV A02;

    static {
        A03();
    }

    public static String A02(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 53);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{-23, 7, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.SECOND_OF_MINUTE, 26, -58, DateTimeFieldType.MILLIS_OF_DAY, 24, 11, 25, 11, DateTimeFieldType.SECOND_OF_DAY, 26, -58, DateTimeFieldType.SECOND_OF_DAY, 27, DateTimeFieldType.MINUTE_OF_DAY, DateTimeFieldType.MINUTE_OF_DAY, -58, 7, 10, -4, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 11, 29};
    }

    public TH(C04434r c04434r) {
        this.A02 = c04434r.A0A();
        this.A01 = c04434r;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC03390o
    public final void A0B() {
        this.A02.A0A().A3e();
        C0821Ko.A00(new TF(this));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC03390o
    public final void A0C() {
        this.A02.A0A().A3h();
        C0821Ko.A00(new TG(this));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC03390o
    public final void A0D(View view) {
        if (view != null) {
            this.A02.A0A().A3g();
            this.A00 = view;
            this.A01.A08().removeAllViews();
            this.A01.A08().addView(this.A00);
            if (this.A00 instanceof XL) {
                KF.A04(this.A01.A06(), this.A00, this.A01.A0B());
            }
            C0680Ex c0680ExA09 = this.A01.A09();
            if (c0680ExA09 != null) {
                c0680ExA09.A0J();
            }
            C0821Ko.A00(new TE(this));
            C04434r c04434r = this.A01;
            c04434r.A0C(c04434r.A08(), this.A00);
            if (Build.VERSION.SDK_INT >= 18 && JT.A0o(this.A01.A08().getContext())) {
                final C0895Nn c0895Nn = new C0895Nn();
                this.A01.A0D(c0895Nn);
                c0895Nn.A0D(this.A01.getPlacementId());
                c0895Nn.A0C(this.A01.A08().getContext().getPackageName());
                if (this.A01.A09() != null && this.A01.A09().A0H() != null) {
                    c0895Nn.A0A(this.A01.A09().A0H().A0C());
                }
                View view2 = this.A00;
                if (view2 instanceof XL) {
                    c0895Nn.A0B(((XL) view2).getViewabilityChecker());
                }
                this.A00.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.facebook.ads.redexgen.X.50
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view3) {
                        if (this.A00.A00 != null) {
                            c0895Nn.setBounds(0, 0, this.A00.A00.getWidth(), this.A00.A00.getHeight());
                            c0895Nn.A0E(!r1.A0F());
                        }
                        return true;
                    }
                });
                this.A00.getOverlay().add(c0895Nn);
                return;
            }
            return;
        }
        throw new IllegalStateException(A02(0, 26, 113));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC03390o
    public final void A0E(InterfaceC03380n interfaceC03380n) {
        this.A02.A0A().A3f(this.A01.A09() != null);
        if (this.A01.A09() != null) {
            this.A01.A09().A0K();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC03390o
    public final void A0F(K7 k7) {
        this.A02.A0A().A2d(C0848Lr.A01(this.A01.A05()), k7.A04().getErrorCode(), k7.A05());
        C0821Ko.A00(new TD(this, k7));
    }
}
