package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7r, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C7r extends KT {
    public int A00;
    public boolean A01;
    public final C9F<C7q> A02;
    public final C9F<C05137o> A03;
    public final C9F<KJ> A04;
    public final C9F<C05127n> A05;
    public final C9F<C0774Ir> A06;
    public final C9F<C0766Ij> A07;
    public final C9F<C0765Ii> A08;
    public final C9F<IK> A09;
    public final C9F<IF> A0A;
    public final C0854Lx A0B;
    public final AbstractC0787Je A0C;
    public final IL A0D;

    public C7r(X2 x2, JZ jz, C0854Lx c0854Lx, String str) {
        this(x2, jz, c0854Lx, new ArrayList(), str);
    }

    public C7r(X2 x2, JZ jz, C0854Lx c0854Lx, String str, @Nullable Bundle bundle) {
        this(x2, jz, c0854Lx, new ArrayList(), str, bundle, null);
    }

    public C7r(X2 x2, JZ jz, C0854Lx c0854Lx, String str, @Nullable Map<String, String> extraParams) {
        this(x2, jz, c0854Lx, new ArrayList(), str, null, extraParams);
    }

    public C7r(X2 x2, JZ jz, C0854Lx c0854Lx, List<AnonymousClass20> list, String str) {
        super(x2, jz, c0854Lx, list, str, !c0854Lx.A0e());
        this.A0D = new IL() { // from class: com.facebook.ads.redexgen.X.7u
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9F
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A04(IV iv) {
                this.A00.A0a();
            }
        };
        this.A07 = new LN(this);
        this.A03 = new L5(this);
        this.A04 = new C0825Kt(this);
        this.A05 = new C0824Ks(this);
        this.A02 = new C0823Kq(this);
        this.A06 = new C0819Km(this);
        this.A09 = new C0816Kj(this);
        this.A0A = new C0815Kh(this);
        this.A08 = new C0853Lw(this);
        this.A0C = new AbstractC0787Je() { // from class: com.facebook.ads.redexgen.X.7v
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9F
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A04(K5 k5) {
                C7r c7r = this.A00;
                c7r.A00 = c7r.A0B.getDuration();
            }
        };
        this.A01 = false;
        this.A0B = c0854Lx;
        this.A0B.getEventBus().A04(this.A0D, this.A05, this.A07, this.A04, this.A03, this.A02, this.A06, this.A09, this.A0A, this.A0C, this.A08);
    }

    public C7r(X2 x2, JZ jz, C0854Lx c0854Lx, List<AnonymousClass20> list, String str, @Nullable Bundle bundle, @Nullable Map<String, String> map) {
        super(x2, jz, c0854Lx, list, str, !c0854Lx.A0e(), bundle, map);
        this.A0D = new IL() { // from class: com.facebook.ads.redexgen.X.7u
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9F
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A04(IV iv) {
                this.A00.A0a();
            }
        };
        this.A07 = new LN(this);
        this.A03 = new L5(this);
        this.A04 = new C0825Kt(this);
        this.A05 = new C0824Ks(this);
        this.A02 = new C0823Kq(this);
        this.A06 = new C0819Km(this);
        this.A09 = new C0816Kj(this);
        this.A0A = new C0815Kh(this);
        this.A08 = new C0853Lw(this);
        this.A0C = new AbstractC0787Je() { // from class: com.facebook.ads.redexgen.X.7v
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9F
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A04(K5 k5) {
                C7r c7r = this.A00;
                c7r.A00 = c7r.A0B.getDuration();
            }
        };
        this.A01 = false;
        this.A0B = c0854Lx;
        this.A0B.getEventBus().A04(this.A0D, this.A05, this.A07, this.A04, this.A03, this.A02, this.A06, this.A09, this.A0A, this.A08);
    }

    public final void A0h() {
        this.A0B.getStateHandler().post(new C0850Lt(this));
    }
}
