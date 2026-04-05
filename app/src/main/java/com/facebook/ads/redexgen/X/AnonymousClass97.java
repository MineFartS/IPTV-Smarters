package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.97, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AnonymousClass97 {
    public static AnonymousClass97 A00 = new AnonymousClass97();

    @VisibleForTesting
    public AnonymousClass97() {
    }

    public static AnonymousClass97 A00() {
        return A00;
    }

    @Nullable
    public static Map<String, String> A01() {
        return C1143Xe.A05();
    }

    @SuppressLint({"InstanceMethodCanBeStatic"})
    public final AnonymousClass96 A02(C8C c8c, boolean z) {
        return new C1143Xe(c8c, z, new C04655o());
    }

    @SuppressLint({"CatchGeneralException"})
    public final Map<String, String> A03(C8C c8c) {
        try {
            return A02(c8c, false).A6B();
        } catch (Throwable th) {
            c8c.A04().A3S(th);
            return AnonymousClass93.A01(c8c);
        }
    }
}
