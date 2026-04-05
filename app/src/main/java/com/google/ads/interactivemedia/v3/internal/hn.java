package com.google.ads.interactivemedia.v3.internal;

import c.f.a.c.a.a.a;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class hn extends ig {
    public hn(hc hcVar, k kVar, int i2) {
        super(hcVar, "llqwiPI9WBGdX3ILtNQP0ldd/oo65vCmZGiUmTtHOSQw67bDkVyvEAM6wctf4g5A", "ciEjxtHwaQq5vQY33BpqQuStjcQqNXynEA7E/ixfFmM=", kVar, i2, 24);
    }

    private final void c() {
        c.f.a.c.a.a.a aVarF = this.f21953a.f();
        if (aVarF == null) {
            return;
        }
        try {
            a.C0150a c0150aB = aVarF.b();
            String strC = hf.c(c0150aB.a());
            if (strC != null) {
                synchronized (this.f21956d) {
                    this.f21956d.o(strC);
                    this.f21956d.n(c0150aB.b());
                    this.f21956d.p(n.DEVICE_IDENTIFIER_ANDROID_AD_ID);
                }
            }
        } catch (IOException unused) {
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ig
    public final void a() {
        if (this.f21953a.m()) {
            c();
            return;
        }
        synchronized (this.f21956d) {
            this.f21956d.o((String) this.f21957e.invoke(null, this.f21953a.b()));
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ig, java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        f();
        return null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ig
    public final void f() {
        if (this.f21953a.n()) {
            super.f();
        } else if (this.f21953a.m()) {
            c();
        }
    }
}
