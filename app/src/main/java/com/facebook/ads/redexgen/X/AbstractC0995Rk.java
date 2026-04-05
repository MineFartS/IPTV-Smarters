package com.facebook.ads.redexgen.X;

import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.facebook.proguard.annotations.DoNotStrip;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Rk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC0995Rk extends AnonymousClass43<C1219a6> {
    public static final int A05 = (int) (C0856Lz.A01 * 4.0f);

    @Nullable
    public AnonymousClass15 A00;
    public final List<C1320bj> A01;
    public final int A02;
    public final X2 A03;

    @DoNotStrip
    public final Q1 A04 = new C0993Ri(this);

    public AbstractC0995Rk(C1U c1u, List<C1320bj> list, X2 x2) {
        this.A03 = x2;
        this.A02 = c1u.getChildSpacing();
        this.A01 = list;
    }

    private ViewGroup.MarginLayoutParams A04(int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -1);
        int i3 = this.A02;
        if (i2 == 0) {
            i3 *= 2;
        }
        marginLayoutParams.setMargins(i3, 0, i2 >= this.A01.size() + (-1) ? this.A02 * 2 : this.A02, 0);
        return marginLayoutParams;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass43
    public final int A0E() {
        return this.A01.size();
    }

    public final void A0G(ImageView imageView, int i2) {
        C1320bj c1320bj = this.A01.get(i2);
        C0803Ju adCoverImage = c1320bj.getAdCoverImage();
        if (adCoverImage != null) {
            XE xeA05 = new XE(imageView, this.A03).A05();
            xeA05.A07(new C0994Rj(this, i2, c1320bj));
            xeA05.A08(adCoverImage.getUrl());
        }
    }

    public final void A0H(AnonymousClass15 anonymousClass15) {
        this.A00 = anonymousClass15;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass43
    /* JADX INFO: renamed from: A0I, reason: merged with bridge method [inline-methods] */
    public void A0F(C1219a6 c1219a6, int i2) {
        c1219a6.A0m().setLayoutParams(A04(i2));
    }
}
