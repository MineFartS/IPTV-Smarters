package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Oy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0931Oy {
    public static String[] A06;
    public static final int A07;
    public static final int A08;
    public static final int A09;
    public final AnonymousClass17 A00;
    public final C1G A01;
    public final C1J A02;
    public final C1Q A03;
    public final X2 A04;
    public final C0789Jg A05;

    public static void A02() {
        A06 = new String[]{"67PC1vS7qkP", "IjFo3BG6VwtzNtFBLMxB3hm7uxcMitzp", "CicRHWg02u8tYTVNboa", "Lc1HqPOOGgkkm0o4iF185HVfJQb2Oy4J", "rfUiy7qGv2cTTJD", "veTQu7RBhk0w6DuY7Y8JViB1PkIKs", "nFnk8VxBkehLa6QhTm5QccOE2IAl", "l0nPd7gOfqjUiTZVoVDHfvPfOU4VPF8e"};
    }

    static {
        A02();
        A09 = (int) (C0856Lz.A01 * 4.0f);
        A07 = (int) (C0856Lz.A01 * 72.0f);
        A08 = (int) (C0856Lz.A01 * 8.0f);
    }

    public C0931Oy(X2 x2, JZ jz, AnonymousClass16 anonymousClass16) {
        this.A04 = x2;
        this.A05 = new C0789Jg(anonymousClass16.A0Q(), jz);
        this.A00 = anonymousClass16.A0L();
        this.A01 = anonymousClass16.A0M().A0F();
        this.A03 = anonymousClass16.A0O();
        this.A02 = anonymousClass16.A0M().A0H();
    }

    private View A00() {
        C0660Eb c0660Eb = new C0660Eb(this.A04);
        c0660Eb.setLayoutManager(new C1027Sr(this.A04, 0, false));
        c0660Eb.setAdapter(new O4(this.A04, this.A02.A00(), A09));
        return c0660Eb;
    }

    private View A01(@Nullable XD xd) {
        O6 o6 = new O6(this.A04, this.A00.A01(), true, false, false);
        o6.A02(this.A01.A06(), this.A01.A01(), null, false, true);
        o6.setAlignment(17);
        O0 o0 = new O0(this.A04);
        C0856Lz.A0P(o0, 0);
        o0.setRadius(50);
        new XE(o0, this.A04).A05().A08(this.A03.A01());
        LinearLayout linearLayout = new LinearLayout(this.A04);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        int i2 = A07;
        linearLayout.addView(o0, new LinearLayout.LayoutParams(i2, i2));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int i3 = A08;
        layoutParams.setMargins(0, i3, 0, i3);
        linearLayout.addView(o6, layoutParams);
        if (xd != null) {
            C0856Lz.A0M(xd);
            linearLayout.addView(xd, layoutParams);
            if (TextUtils.isEmpty(xd.getText())) {
                C0856Lz.A0K(xd);
            }
        }
        return linearLayout;
    }

    public final Pair<EnumC0930Ox, View> A03(@Nullable XD xd) {
        View viewA00;
        EnumC0930Ox enumC0930OxA04 = A04();
        if (C0929Ow.A00[enumC0930OxA04.ordinal()] != 1) {
            viewA00 = A01(xd);
        } else {
            viewA00 = A00();
        }
        C0791Ji.A04(viewA00, this.A05, EnumC0788Jf.A0S);
        return new Pair<>(enumC0930OxA04, viewA00);
    }

    public final EnumC0930Ox A04() {
        if (!this.A02.A00().isEmpty()) {
            return EnumC0930Ox.A04;
        }
        EnumC0930Ox enumC0930Ox = EnumC0930Ox.A03;
        String[] strArr = A06;
        if (strArr[3].charAt(8) == strArr[7].charAt(8)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A06;
        strArr2[4] = "qwlEjiYhEcV8j1J";
        strArr2[4] = "qwlEjiYhEcV8j1J";
        return enumC0930Ox;
    }
}
