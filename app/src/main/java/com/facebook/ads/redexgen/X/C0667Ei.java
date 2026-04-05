package com.facebook.ads.redexgen.X;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ei, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0667Ei {
    public final InterfaceC0737He A00;
    public final InterfaceC0739Hg A01;
    public final InterfaceC0739Hg A02;
    public final I6 A03;
    public final C0772Ip A04;

    public C0667Ei(I6 i6, InterfaceC0739Hg interfaceC0739Hg) {
        this(i6, interfaceC0739Hg, null, null, null);
    }

    public C0667Ei(I6 i6, InterfaceC0739Hg interfaceC0739Hg, @Nullable InterfaceC0739Hg interfaceC0739Hg2, @Nullable InterfaceC0737He interfaceC0737He, @Nullable C0772Ip c0772Ip) {
        IM.A01(interfaceC0739Hg);
        this.A03 = i6;
        this.A02 = interfaceC0739Hg;
        this.A01 = interfaceC0739Hg2;
        this.A00 = interfaceC0737He;
        this.A04 = c0772Ip;
    }

    public final I6 A00() {
        return this.A03;
    }

    public final C1313bc A01(boolean z) {
        InterfaceC0740Hh cacheReadDataSource;
        InterfaceC0738Hf c1311ba;
        InterfaceC0739Hg interfaceC0739Hg = this.A01;
        if (interfaceC0739Hg != null) {
            cacheReadDataSource = interfaceC0739Hg.A4E();
        } else {
            cacheReadDataSource = new C1295bK();
        }
        if (z) {
            return new C1313bc(this.A03, C1294bJ.A02, cacheReadDataSource, null, 1, null);
        }
        InterfaceC0737He interfaceC0737He = this.A00;
        if (interfaceC0737He != null) {
            c1311ba = interfaceC0737He.createDataSink();
        } else {
            c1311ba = new C1311ba(this.A03, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE);
        }
        InterfaceC0740Hh interfaceC0740HhA4E = this.A02.A4E();
        C0772Ip c0772Ip = this.A04;
        if (c0772Ip != null) {
            interfaceC0740HhA4E = new C1305bU(interfaceC0740HhA4E, c0772Ip, -1000);
        }
        return new C1313bc(this.A03, interfaceC0740HhA4E, cacheReadDataSource, c1311ba, 1, null);
    }

    public final C0772Ip A02() {
        C0772Ip c0772Ip = this.A04;
        return c0772Ip != null ? c0772Ip : new C0772Ip();
    }
}
