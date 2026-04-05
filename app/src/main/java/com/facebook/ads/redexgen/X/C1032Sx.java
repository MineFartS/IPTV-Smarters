package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Sx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1032Sx implements C3Z {
    public final /* synthetic */ C0660Eb A00;

    public C1032Sx(C0660Eb c0660Eb) {
        this.A00 = c0660Eb;
    }

    private final void A00(C04013a c04013a) {
        int i2 = c04013a.A00;
        if (i2 == 1) {
            this.A00.A06.A1R(this.A00, c04013a.A02, c04013a.A01);
            return;
        }
        if (i2 == 2) {
            this.A00.A06.A1S(this.A00, c04013a.A02, c04013a.A01);
        } else if (i2 == 4) {
            this.A00.A06.A1U(this.A00, c04013a.A02, c04013a.A01, c04013a.A03);
        } else {
            if (i2 != 8) {
                return;
            }
            this.A00.A06.A1T(this.A00, c04013a.A02, c04013a.A01, 1);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3Z
    public final C4X A58(int i2) {
        C4X c4xA1H = this.A00.A1H(i2, true);
        if (c4xA1H == null || this.A00.A01.A0L(c4xA1H.A0H)) {
            return null;
        }
        return c4xA1H;
    }

    @Override // com.facebook.ads.redexgen.X.C3Z
    public final void A8W(int i2, int i3, Object obj) {
        this.A00.A1g(i2, i3, obj);
        this.A00.A0H = true;
    }

    @Override // com.facebook.ads.redexgen.X.C3Z
    public final void A8k(int i2, int i3) {
        this.A00.A1d(i2, i3);
        this.A00.A0G = true;
    }

    @Override // com.facebook.ads.redexgen.X.C3Z
    public final void A8l(int i2, int i3) {
        this.A00.A1e(i2, i3);
        this.A00.A0G = true;
    }

    @Override // com.facebook.ads.redexgen.X.C3Z
    public final void A8m(int i2, int i3) {
        this.A00.A1h(i2, i3, true);
        C0660Eb c0660Eb = this.A00;
        c0660Eb.A0G = true;
        c0660Eb.A0s.A00 += i3;
    }

    @Override // com.facebook.ads.redexgen.X.C3Z
    public final void A8n(int i2, int i3) {
        this.A00.A1h(i2, i3, false);
        this.A00.A0G = true;
    }

    @Override // com.facebook.ads.redexgen.X.C3Z
    public final void A9O(C04013a c04013a) {
        A00(c04013a);
    }

    @Override // com.facebook.ads.redexgen.X.C3Z
    public final void A9Q(C04013a c04013a) {
        A00(c04013a);
    }
}
