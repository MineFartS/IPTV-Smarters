package com.facebook.ads.redexgen.X;

import android.widget.FrameLayout;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class N1 extends FrameLayout {
    public int A00;
    public AnonymousClass24 A01;
    public AnonymousClass25 A02;

    @Nullable
    public AnonymousClass26 A03;
    public final X2 A04;
    public final JZ A05;

    @Nullable
    public final MR A06;

    @Nullable
    public final MS A07;
    public final String A08;

    @Nullable
    public final C1Q A09;
    public final N3 A0A;

    public abstract void A0K();

    public abstract void A0L();

    public abstract void A0M(AnonymousClass26 anonymousClass26, AnonymousClass24 anonymousClass24);

    public abstract void A0N(AnonymousClass26 anonymousClass26, AnonymousClass24 anonymousClass24);

    public abstract boolean A0O();

    public N1(X2 x2, JZ jz, String str) {
        this(x2, jz, str, null, null, null);
    }

    public N1(X2 x2, JZ jz, String str, @Nullable C1Q c1q, @Nullable MS ms, @Nullable MR mr) {
        super(x2);
        this.A00 = 0;
        this.A01 = AnonymousClass24.A04;
        this.A03 = null;
        this.A0A = new C1162Xx(this);
        this.A04 = x2;
        this.A05 = jz;
        this.A07 = ms;
        this.A06 = mr;
        this.A08 = str;
        this.A09 = c1q;
    }

    public static /* synthetic */ int A00(N1 n1) {
        int i2 = n1.A00;
        n1.A00 = i2 + 1;
        return i2;
    }

    public static /* synthetic */ int A01(N1 n1) {
        int i2 = n1.A00;
        n1.A00 = i2 - 1;
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0A() {
        if (this.A02.A0B()) {
            this.A05.A7z(this.A08, this.A02.A03());
            this.A02.A04();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0B() {
        this.A03 = null;
        this.A02.A06();
        A0K();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C(AnonymousClass26 anonymousClass26) {
        this.A02.A09(this.A01);
        A0M(anonymousClass26, this.A01);
        C03450u.A03();
        if (A0O()) {
            A0A();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D(AnonymousClass26 anonymousClass26) {
        this.A03 = anonymousClass26;
        this.A02.A0A(this.A01, this.A00);
        A0N(anonymousClass26, this.A01);
    }

    public final void A0I() {
        A0A();
    }

    public final void A0J() {
        this.A02 = new AnonymousClass25(new C0789Jg(this.A08, this.A05));
        MS ms = this.A07;
        if (ms != null) {
            ms.AAQ(true);
        }
        A0B();
    }
}
