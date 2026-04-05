package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.annotation.Nullable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8C, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C8C extends ContextWrapper {
    public final C8E A00;
    public final AtomicReference<String> A01;

    public C8C(Context context, C8E c8e) {
        super(context.getApplicationContext());
        this.A01 = new AtomicReference<>();
        this.A00 = c8e;
    }

    public final X3 A00() {
        X3 x3A00 = C8B.A00();
        if (x3A00 == null) {
            X3 x3 = new X3(this, this.A00);
            C8B.A01(x3);
            return x3;
        }
        return x3A00;
    }

    public final C8D A01() {
        return this.A00.A5W(this);
    }

    public final C8F A02() {
        return this.A00.A6A(this);
    }

    public final C8G A03() {
        return this.A00.A6u(this);
    }

    public final InterfaceC05218c A04() {
        return this.A00.A61(this);
    }

    public final AnonymousClass92 A05() {
        return this.A00.A72();
    }

    public final JZ A06() {
        return this.A00.A5I(A00());
    }

    @Nullable
    public final String A07() {
        return this.A01.get();
    }

    public final void A08(@Nullable String str) {
        this.A01.set(str);
    }
}
