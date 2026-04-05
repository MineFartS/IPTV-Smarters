package com.facebook.ads.redexgen.X;

import java.io.BufferedOutputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Is, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0775Is extends BufferedOutputStream {
    public boolean A00;

    public C0775Is(OutputStream outputStream) {
        super(outputStream);
    }

    public C0775Is(OutputStream outputStream, int i2) {
        super(outputStream, i2);
    }

    public final void A00(OutputStream outputStream) {
        IM.A04(this.A00);
        this.out = outputStream;
        this.count = 0;
        this.A00 = false;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        this.A00 = true;
        Throwable th = null;
        try {
            flush();
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.out.close();
        } catch (Throwable e2) {
            if (th == null) {
                th = e2;
            }
        }
        if (th != null) {
            J1.A0c(th);
        }
    }
}
