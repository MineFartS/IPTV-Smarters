package com.facebook.ads.redexgen.X;

import android.content.Context;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1292bH implements InterfaceC0739Hg {
    public final Context A00;
    public final InterfaceC0739Hg A01;
    public final I2<? super InterfaceC0740Hh> A02;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.I2 != com.facebook.ads.internal.exoplayer2.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.upstream.DataSource> */
    public C1292bH(Context context, I2<? super InterfaceC0740Hh> i2, InterfaceC0739Hg interfaceC0739Hg) {
        this.A00 = context.getApplicationContext();
        this.A02 = i2;
        this.A01 = interfaceC0739Hg;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.I2 != com.facebook.ads.internal.exoplayer2.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.upstream.DataSource> */
    public C1292bH(Context context, String str, I2<? super InterfaceC0740Hh> i2) {
        this(context, i2, new C2Z(str, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0739Hg
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C1291bG A4E() {
        return new C1291bG(this.A00, this.A02, this.A01.A4E());
    }
}
