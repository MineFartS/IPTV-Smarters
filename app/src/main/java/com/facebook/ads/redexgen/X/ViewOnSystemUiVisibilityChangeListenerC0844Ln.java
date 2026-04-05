package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ln, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class ViewOnSystemUiVisibilityChangeListenerC0844Ln implements View.OnSystemUiVisibilityChangeListener {
    public int A00;

    @Nullable
    public Window A01;
    public final View A03;
    public EnumC0843Lm A02 = EnumC0843Lm.A03;
    public final Runnable A04 = new C1245aW(this);

    public ViewOnSystemUiVisibilityChangeListenerC0844Ln(View view) {
        this.A03 = view;
        this.A03.setOnSystemUiVisibilityChangeListener(this);
    }

    private void A00(int i2, boolean z) {
        Window window = this.A01;
        if (window == null) {
            return;
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (z) {
            attributes.flags |= i2;
        } else {
            attributes.flags &= i2 ^ (-1);
        }
        this.A01.setAttributes(attributes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02(boolean z) {
        if (EnumC0843Lm.A03.equals(this.A02)) {
            return;
        }
        int i2 = 3840;
        if (!z) {
            i2 = 3840 | 7;
        }
        Handler handler = this.A03.getHandler();
        if (handler != null && z) {
            handler.removeCallbacks(this.A04);
            handler.postDelayed(this.A04, 2000L);
        }
        this.A03.setSystemUiVisibility(i2);
    }

    public final void A03() {
        this.A01 = null;
    }

    public final void A04(Window window) {
        this.A01 = window;
    }

    public final void A05(EnumC0843Lm enumC0843Lm) {
        this.A02 = enumC0843Lm;
        if (C0842Ll.A00[this.A02.ordinal()] != 1) {
            A00(67108864, false);
            A00(134217728, false);
            this.A03.setSystemUiVisibility(0);
        } else {
            A00(67108864, true);
            A00(134217728, true);
            A02(false);
        }
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public final void onSystemUiVisibilityChange(int i2) {
        int i3 = this.A00 ^ i2;
        this.A00 = i2;
        if ((i3 & 2) != 0 && (i2 & 2) == 0) {
            A02(true);
        }
    }
}
