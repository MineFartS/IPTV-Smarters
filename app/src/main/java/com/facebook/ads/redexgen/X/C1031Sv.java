package com.facebook.ads.redexgen.X;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Sv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1031Sv implements InterfaceC04304e {
    public final /* synthetic */ C0660Eb A00;

    public C1031Sv(C0660Eb c0660Eb) {
        this.A00 = c0660Eb;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04304e
    public final void ABq(C4X c4x, C4A c4a, C4A c4a2) {
        this.A00.A1o(c4x, c4a, c4a2);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04304e
    public final void ABs(C4X c4x, @NonNull C4A c4a, @Nullable C4A c4a2) {
        this.A00.A0r.A0d(c4x);
        this.A00.A1p(c4x, c4a, c4a2);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04304e
    public final void ABu(C4X c4x, @NonNull C4A c4a, @NonNull C4A c4a2) {
        c4x.A0a(false);
        if (this.A00.A0C) {
            if (this.A00.A05.A0L(c4x, c4x, c4a, c4a2)) {
                this.A00.A1O();
            }
        } else {
            if (!this.A00.A05.A0K(c4x, c4a, c4a2)) {
                return;
            }
            this.A00.A1O();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04304e
    public final void ADg(C4X c4x) {
        this.A00.A06.A1E(c4x.A0H, this.A00.A0r);
    }
}
