package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.view.FullScreenAdToolbar;
import com.facebook.proguard.annotations.DoNotStrip;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Qv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC0980Qv extends FrameLayout implements MS {
    public static final RelativeLayout.LayoutParams A0D = new RelativeLayout.LayoutParams(-1, -1);
    public boolean A00;
    public final AnonymousClass16 A01;
    public final C7C A02;
    public final X2 A03;
    public final JZ A04;
    public final C0789Jg A05;
    public final C0849Ls A06;
    public final MM A07;
    public final MR A08;
    public final InterfaceC0878Mw A09;
    public final Q2 A0A;
    public final ViewOnSystemUiVisibilityChangeListenerC0844Ln A0B;

    @DoNotStrip
    public final Q1 A0C;

    public abstract void A0R();

    public abstract void A0T(C04484w c04484w);

    public abstract boolean A0U();

    public AbstractC0980Qv(X2 x2, InterfaceC0878Mw interfaceC0878Mw, JZ jz, AnonymousClass16 anonymousClass16, C7C c7c, MR mr) {
        super(x2);
        this.A0C = new C0984Qz(this);
        this.A06 = new C0849Ls();
        this.A00 = false;
        this.A03 = x2;
        this.A09 = interfaceC0878Mw;
        this.A04 = jz;
        this.A01 = anonymousClass16;
        this.A02 = c7c;
        this.A08 = mr;
        this.A05 = new C0789Jg(this.A01.A0Q(), this.A04);
        this.A0A = new Q2(this, 1, new WeakReference(this.A0C), this.A03);
        this.A0A.A0Y(this.A01.A0G());
        this.A0A.A0Z(this.A01.A0H());
        this.A07 = A0O();
        this.A0B = new ViewOnSystemUiVisibilityChangeListenerC0844Ln(this);
        this.A0B.A05(EnumC0843Lm.A03);
    }

    private MM A0O() {
        MM fullScreenAdToolbar;
        if (JT.A1O(this.A03)) {
            fullScreenAdToolbar = new C1233aK(this.A03, this.A08, this.A05, 4, 2);
        } else {
            fullScreenAdToolbar = new FullScreenAdToolbar(this.A03, this.A08, this.A05, 1, this.A01.A0E());
        }
        int iA03 = this.A01.A0M().A0E().A03();
        fullScreenAdToolbar.setPageDetails(this.A01.A0O(), this.A01.A0Q(), iA03, this.A01.A0P());
        fullScreenAdToolbar.A05(this.A01.A0L().A01(), true);
        if (iA03 < 0 && this.A01.A0M().A0L()) {
            fullScreenAdToolbar.setToolbarActionMode(4);
        }
        fullScreenAdToolbar.setToolbarListener(new C0981Qw(this));
        return fullScreenAdToolbar;
    }

    private void A0P() {
        if (this.A01.A0M().A0O()) {
            C0910Oc c0910OcA0B = new C0908Oa(this.A03, this.A01.A0M().A0F(), this.A01.A0O()).A08(this.A01.A0L().A01()).A0B();
            C0791Ji.A04(c0910OcA0B, this.A05, EnumC0788Jf.A0U);
            addView(c0910OcA0B, A0D);
            c0910OcA0B.A04(new C0982Qx(this));
            return;
        }
        A0R();
    }

    public final void A0Q() {
        if (!this.A00) {
            this.A0A.A0W();
            this.A00 = true;
        }
    }

    public final void A0S(int i2, AbstractRunnableC0829Kx abstractRunnableC0829Kx) {
        new LP(i2, new C0983Qy(this, i2, abstractRunnableC0829Kx)).A08();
    }

    @Override // com.facebook.ads.redexgen.X.MS
    public final void A7v(Intent intent, @Nullable Bundle bundle, C04484w c04484w) {
        this.A08.A3L(this, A0D);
        A0T(c04484w);
        A0P();
    }

    @Override // com.facebook.ads.redexgen.X.MS
    public final void ACj(Bundle bundle) {
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public void onDestroy() {
        this.A0B.A03();
        if (!TextUtils.isEmpty(this.A01.A0Q())) {
            this.A04.A84(this.A01.A0Q(), new C0897Np().A04(this.A0A).A03(this.A06).A06());
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.A06.A07(motionEvent, this, this);
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setListener(MR mr) {
    }

    public void setUpFullscreenMode(boolean z) {
        if (Build.VERSION.SDK_INT < 19) {
            return;
        }
        this.A0B.A05(z ? EnumC0843Lm.A04 : EnumC0843Lm.A03);
    }
}
