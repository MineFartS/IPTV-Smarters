package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.media.AudioAttributes;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Aq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0585Aq {
    public static final C0585Aq A04 = new C0584Ap().A00();
    public AudioAttributes A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public C0585Aq(int i2, int i3, int i4) {
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = i4;
    }

    @TargetApi(21)
    public final AudioAttributes A00() {
        if (this.A00 == null) {
            this.A00 = new AudioAttributes.Builder().setContentType(this.A01).setFlags(this.A02).setUsage(this.A03).build();
        }
        return this.A00;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0585Aq c0585Aq = (C0585Aq) obj;
        return this.A01 == c0585Aq.A01 && this.A02 == c0585Aq.A02 && this.A03 == c0585Aq.A03;
    }

    public final int hashCode() {
        int i2 = ((17 * 31) + this.A01) * 31;
        int result = this.A02;
        return ((i2 + result) * 31) + this.A03;
    }
}
