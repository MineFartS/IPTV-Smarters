package com.facebook.ads.redexgen.X;

import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class PB extends RelativeLayout {
    public static String[] A03;

    @Nullable
    public C7V A00;
    public WeakReference<PA> A01;
    public final InterfaceC0956Px A02;

    static {
        A00();
    }

    public static void A00() {
        A03 = new String[]{"Z7YDROQZDOzGgLZ6JRzm0VB6SZj4zDor", "PEDxZ1hmcJv2HtokqPZuboN03zqPqfuu", "ZN3aiXgGzfL", "UoQOzdqMFdmvRVk6jZTbQbhJ01APWmUd", "BWydKlRDXGFiivyHlYlBLR13h8bygoZy", "calSGpe10AH6YV6oPZJsWkhcYoOFDSm8", "CqyCvSup05V", "6oqVw1T1HmkJfSZKyFG8rr7XXeYSScI0"};
    }

    public PB(X2 x2, InterfaceC0956Px interfaceC0956Px) {
        super(x2);
        this.A02 = interfaceC0956Px;
        C0856Lz.A0M((View) this.A02);
        addView(this.A02.getView(), new RelativeLayout.LayoutParams(-1, -1));
    }

    public final void A01(KS ks) {
        addView(ks, new RelativeLayout.LayoutParams(-1, -1));
        this.A00 = (C7V) ks;
    }

    public final void A02(KS ks) {
        C0856Lz.A0M(ks);
        this.A00 = null;
    }

    public final boolean A03() {
        return this.A02.A7R();
    }

    public final boolean A04(int i2) {
        return this.A02.getCurrentPosition() > i2;
    }

    public int getCurrentPosition() {
        return this.A02.getCurrentPosition();
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        ((View) this.A02).layout(0, 0, getWidth(), getHeight());
        C7V c7v = this.A00;
        if (c7v != null) {
            c7v.layout(0, 0, getWidth(), getHeight());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f1  */
    @Override // android.widget.RelativeLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r12, int r13) {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.PB.onMeasure(int, int):void");
    }

    public void setViewImplInflationListener(PA pa) {
        this.A01 = new WeakReference<>(pa);
    }
}
