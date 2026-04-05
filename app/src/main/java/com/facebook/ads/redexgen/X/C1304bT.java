package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1304bT<T> implements InterfaceC0751Hu {
    public final int A00;
    public final C0744Hl A01;
    public final InterfaceC0740Hh A02;
    public final I0<? extends T> A03;
    public volatile long A04;
    public volatile T A05;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.I0 != com.facebook.ads.internal.exoplayer2.upstream.ParsingLoadable$Parser<? extends T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.bT != com.facebook.ads.internal.exoplayer2.upstream.ParsingLoadable<T> */
    public C1304bT(InterfaceC0740Hh interfaceC0740Hh, Uri uri, int i2, I0<? extends T> i0) {
        this(interfaceC0740Hh, new C0744Hl(uri, 3), i2, i0);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.I0 != com.facebook.ads.internal.exoplayer2.upstream.ParsingLoadable$Parser<? extends T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.bT != com.facebook.ads.internal.exoplayer2.upstream.ParsingLoadable<T> */
    public C1304bT(InterfaceC0740Hh interfaceC0740Hh, C0744Hl c0744Hl, int i2, I0<? extends T> i0) {
        this.A02 = interfaceC0740Hh;
        this.A01 = c0744Hl;
        this.A00 = i2;
        this.A03 = i0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.I0 != com.facebook.ads.internal.exoplayer2.upstream.ParsingLoadable$Parser<? extends T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.bT != com.facebook.ads.internal.exoplayer2.upstream.ParsingLoadable<T> */
    public static <T> T A00(InterfaceC0740Hh interfaceC0740Hh, I0<? extends T> i0, Uri uri) throws IOException {
        C1304bT c1304bT = new C1304bT(interfaceC0740Hh, uri, 0, i0);
        c1304bT.A7u();
        return (T) c1304bT.A01();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.bT != com.facebook.ads.internal.exoplayer2.upstream.ParsingLoadable<T> */
    public final T A01() {
        return this.A05;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.bT != com.facebook.ads.internal.exoplayer2.upstream.ParsingLoadable<T> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0751Hu
    public final void A3y() {
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.bT != com.facebook.ads.internal.exoplayer2.upstream.ParsingLoadable<T> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0751Hu
    public final void A7u() throws IOException {
        C0742Hj c0742Hj = new C0742Hj(this.A02, this.A01);
        try {
            c0742Hj.A03();
            this.A05 = this.A03.ABZ(this.A02.A7H(), c0742Hj);
        } finally {
            this.A04 = c0742Hj.A02();
            J1.A0b(c0742Hj);
        }
    }
}
