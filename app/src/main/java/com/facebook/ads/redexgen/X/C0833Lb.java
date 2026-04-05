package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Lb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0833Lb implements Closeable {

    @Nullable
    public C0832La A00;
    public boolean A01;
    public final LZ A02;
    public final Runnable A03;

    public C0833Lb(long j2, Runnable runnable) {
        this.A02 = new LZ(j2);
        this.A02.A02();
        this.A03 = runnable;
        this.A01 = false;
    }

    private final synchronized void A03() {
        if (this.A00 == null && !this.A01) {
            this.A00 = new C0832La(this);
        }
    }

    public final LZ A04() {
        return this.A02;
    }

    public final synchronized void A05() {
        if (this.A01) {
            return;
        }
        if (this.A00 == null) {
            this.A00 = new C0832La(this);
        }
        this.A00.A01();
    }

    public final synchronized void A06() {
        if (this.A02.A05() && !this.A01) {
            A03();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        C0832La c0832La;
        synchronized (this) {
            this.A01 = true;
            c0832La = this.A00;
        }
        if (c0832La != null) {
            c0832La.close();
        }
    }
}
