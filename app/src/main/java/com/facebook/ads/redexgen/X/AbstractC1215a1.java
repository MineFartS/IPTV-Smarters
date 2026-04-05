package com.facebook.ads.redexgen.X;

import android.os.Handler;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.a1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1215a1 implements FD {
    public InterfaceC1163Xy A00;
    public AbstractC0573Ae A01;
    public Object A02;
    public final ArrayList<FC> A04 = new ArrayList<>(1);
    public final FO A03 = new FO();

    public abstract void A02();

    public abstract void A03(InterfaceC1163Xy interfaceC1163Xy, boolean z);

    public final FO A00(@Nullable FB fb) {
        return this.A03.A03(0, fb, 0L);
    }

    public final void A01(AbstractC0573Ae abstractC0573Ae, @Nullable Object obj) {
        this.A01 = abstractC0573Ae;
        this.A02 = obj;
        Iterator<FC> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().AAz(this, abstractC0573Ae, obj);
        }
    }

    @Override // com.facebook.ads.redexgen.X.FD
    public final void A3F(Handler handler, FR fr) {
        this.A03.A08(handler, fr);
    }

    @Override // com.facebook.ads.redexgen.X.FD
    public final void ABo(InterfaceC1163Xy interfaceC1163Xy, boolean z, FC fc) {
        InterfaceC1163Xy interfaceC1163Xy2 = this.A00;
        IM.A03(interfaceC1163Xy2 == null || interfaceC1163Xy2 == interfaceC1163Xy);
        this.A04.add(fc);
        if (this.A00 == null) {
            this.A00 = interfaceC1163Xy;
            A03(interfaceC1163Xy, z);
        } else {
            AbstractC0573Ae abstractC0573Ae = this.A01;
            if (abstractC0573Ae == null) {
                return;
            }
            fc.AAz(this, abstractC0573Ae, this.A02);
        }
    }

    @Override // com.facebook.ads.redexgen.X.FD
    public final void ACN(FC fc) {
        this.A04.remove(fc);
        if (this.A04.isEmpty()) {
            this.A00 = null;
            this.A01 = null;
            this.A02 = null;
            A02();
        }
    }

    @Override // com.facebook.ads.redexgen.X.FD
    public final void ACP(FR fr) {
        this.A03.A0E(fr);
    }
}
