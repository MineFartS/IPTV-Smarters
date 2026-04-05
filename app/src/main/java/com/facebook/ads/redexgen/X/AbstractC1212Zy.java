package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.view.FullScreenAdToolbar;
import com.facebook.ads.internal.view.ToolbarActionView$ToolbarActionMode;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1212Zy extends RelativeLayout implements MS {
    public static String[] A0D;
    public View A00;

    @Nullable
    public LP A01;

    @Nullable
    public C0910Oc A02;
    public boolean A03;
    public boolean A04;
    public AnonymousClass17 A05;
    public final ViewOnSystemUiVisibilityChangeListenerC0844Ln A06;
    public final MR A07;
    public final C0996Rl A08;
    public final X2 A09;
    public final JZ A0A;
    public final C0789Jg A0B;
    public final MM A0C;

    static {
        A0L();
    }

    public static void A0L() {
        A0D = new String[]{"fqT9snXDZkE2N6bIU2twhbCcrvrF5wQR", "W8MK3buqarkLhDixdfnbfGeXuw3i87xB", "M5iWaw3OwwKxChS5bTa9KUrj63pwu1Od", "QKu8TlGQ3D7NsDDaY", "OUnrWL6BanKvWJF", "644mHU9zQQHAcSiNB", "MqQzuM0GD0HqxOL2854PPJvoiao7nama", "mSpdOD621tCilusEUOf234Jx9LR3KzyX"};
    }

    public abstract boolean A0X();

    @ToolbarActionView$ToolbarActionMode
    public abstract int getCloseButtonStyle();

    public AbstractC1212Zy(X2 x2, JZ jz, MR mr, C0996Rl c0996Rl) {
        super(x2);
        this.A04 = false;
        this.A03 = false;
        this.A09 = x2;
        this.A0A = jz;
        this.A07 = mr;
        this.A06 = new ViewOnSystemUiVisibilityChangeListenerC0844Ln(this);
        this.A08 = c0996Rl;
        this.A0B = new C0789Jg(this.A08.A0Q(), this.A0A);
        this.A0C = new FullScreenAdToolbar(this.A09, getAudienceNetworkListener(), this.A0B, 0, this.A08.A0E());
    }

    private C1H A0I(int i2) {
        if (i2 == 1) {
            return this.A05.A01();
        }
        AnonymousClass17 anonymousClass17 = this.A05;
        if (A0D[2].charAt(7) != 'O') {
            throw new RuntimeException();
        }
        String[] strArr = A0D;
        strArr[0] = "MYlveE6g4wScBr3MsnlZwbj0w3RA4Q0m";
        strArr[0] = "MYlveE6g4wScBr3MsnlZwbj0w3RA4Q0m";
        return anonymousClass17.A00();
    }

    private void A0J() {
        removeAllViews();
        C0856Lz.A0M(this);
    }

    private void A0K() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        if (A0U() && this.A02 == null) {
            this.A04 = true;
            this.A02 = new C0908Oa(this.A09, this.A08.A0M().A0F(), this.A08.A0O()).A08(this.A08.A0L().A01()).A0B();
            C0791Ji.A04(this.A02, this.A0B, EnumC0788Jf.A0U);
            this.A07.A3K(this, 0, layoutParams);
            this.A07.A3K(this.A02, 1, layoutParams);
            this.A02.A04(new C1214a0(this));
            return;
        }
        this.A07.A3K(this, 0, layoutParams);
    }

    private void A0M(C1H c1h, boolean z) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.A0C.getToolbarHeight());
        layoutParams.addRule(10);
        this.A0C.A05(c1h, z);
        addView(this.A0C, layoutParams);
    }

    public final void A0P() {
        View view = this.A00;
        if (view == null || !(view instanceof O9)) {
            return;
        }
        if (A0V()) {
            ((O9) this.A00).A0a();
        } else {
            ((O9) this.A00).A0Z();
        }
    }

    public final void A0Q(int i2) {
        this.A01 = new LP(i2, new C1213Zz(this, i2));
        this.A03 = true;
        A0P();
        this.A01.A08();
    }

    public final void A0R(View view, boolean z, int i2) {
        this.A00 = view;
        this.A06.A05(EnumC0843Lm.A03);
        A0J();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(0, z ? 0 : this.A0C.getToolbarHeight(), 0, 0);
        addView(view, layoutParams);
        C1H c1hA0I = A0I(i2);
        A0M(c1hA0I, z);
        C0856Lz.A0P(this, c1hA0I.A07(false));
        if (this.A07 != null) {
            A0K();
            String[] strArr = A0D;
            if (strArr[3].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0D;
            strArr2[0] = "NsWlVTe7e8AxmZfep9MsD1WsEVvEb3lR";
            strArr2[0] = "NsWlVTe7e8AxmZfep9MsD1WsEVvEb3lR";
            if (z && Build.VERSION.SDK_INT >= 19) {
                ViewOnSystemUiVisibilityChangeListenerC0844Ln viewOnSystemUiVisibilityChangeListenerC0844Ln = this.A06;
                if (A0D[0].charAt(10) == 'o') {
                    throw new RuntimeException();
                }
                String[] strArr3 = A0D;
                strArr3[2] = "LlUUcmlOaTawHlOzciUSj9DhXPbTXBAe";
                strArr3[2] = "LlUUcmlOaTawHlOzciUSj9DhXPbTXBAe";
                viewOnSystemUiVisibilityChangeListenerC0844Ln.A05(EnumC0843Lm.A04);
            }
        }
    }

    public final void A0S(C04484w c04484w) {
        int iA03;
        this.A06.A04(c04484w.A0I().getWindow());
        this.A05 = this.A08.A0L();
        AnonymousClass19 anonymousClass19A0M = null;
        if (this.A08.A0M() != null && this.A08.A0M() != null) {
            anonymousClass19A0M = this.A08.A0M();
        }
        MM mm = this.A0C;
        C1Q c1qA0O = this.A08.A0O();
        String strA0Q = this.A08.A0Q();
        if (anonymousClass19A0M != null) {
            iA03 = anonymousClass19A0M.A0E().A03();
        } else {
            iA03 = 0;
        }
        mm.setPageDetails(c1qA0O, strA0Q, iA03, this.A08.A0P());
        this.A0C.setToolbarListener(new C1218a4(this, c04484w));
    }

    public final void A0T(C04484w c04484w) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(200L);
        alphaAnimation.setAnimationListener(new MY(this, this, c04484w));
        startAnimation(alphaAnimation);
    }

    public final boolean A0U() {
        if (!this.A08.A0W().isEmpty()) {
            boolean zA0O = this.A08.A0M().A0O();
            if (A0D[6].charAt(3) != 'z') {
                throw new RuntimeException();
            }
            String[] strArr = A0D;
            strArr[2] = "rwsNokIOLx9Fj0KMvDMbhHWjcozH5rOe";
            strArr[2] = "rwsNokIOLx9Fj0KMvDMbhHWjcozH5rOe";
            if (zA0O) {
                return true;
            }
        }
        return false;
    }

    public final boolean A0V() {
        return this.A03;
    }

    public final boolean A0W() {
        return this.A04;
    }

    public void AAQ(boolean z) {
        LP lp = this.A01;
        if (lp != null && lp.A06()) {
            this.A01.A07();
        }
    }

    public void AAn(boolean z) {
        LP lp = this.A01;
        if (lp != null && !lp.A05()) {
            this.A01.A08();
        }
    }

    public JZ getAdEventManager() {
        return this.A0A;
    }

    public MR getAudienceNetworkListener() {
        return this.A07;
    }

    public void onDestroy() {
        this.A06.A03();
        this.A0C.setToolbarListener(null);
        A0J();
    }

    public void setListener(MR mr) {
    }
}
