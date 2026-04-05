package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.os.Bundle;
import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3L, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C3L {
    public static final C3K A01;
    public final Object A00;

    static {
        if (Build.VERSION.SDK_INT >= 19) {
            A01 = new El();
        } else if (Build.VERSION.SDK_INT >= 16) {
            A01 = new C0669Em();
        } else {
            A01 = new C1020Sk();
        }
    }

    public C3L() {
        this.A00 = A01.A8e(this);
    }

    public C3L(Object obj) {
        this.A00 = obj;
    }

    @Nullable
    public final C3J A00(int i2) {
        return null;
    }

    @Nullable
    public final C3J A01(int i2) {
        return null;
    }

    public final Object A02() {
        return this.A00;
    }

    @Nullable
    public final List<C3J> A03(String str, int i2) {
        return null;
    }

    public final boolean A04(int i2, int i3, Bundle bundle) {
        return false;
    }
}
