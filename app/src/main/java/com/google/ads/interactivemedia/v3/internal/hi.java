package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class hi extends ig {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final ih<String> f21920h = new ih<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Context f21921i;

    public hi(hc hcVar, k kVar, int i2, Context context) {
        super(hcVar, "Ta7q+IK2mYjuCH0of+Vj0vM5Rtwz8hWo89Z4HIfL3B2t8tHFxG0TQ0Yh0ikc7raQ", "BnUGtdO8J5ukLmkm+ZGsWDuDWstQiBaJlb5Kf+8oxak=", kVar, i2, 29);
        this.f21921i = context;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ig
    public final void a() {
        this.f21956d.j("E");
        AtomicReference<String> atomicReferenceA = f21920h.a(this.f21921i.getPackageName());
        if (atomicReferenceA.get() == null) {
            synchronized (atomicReferenceA) {
                if (atomicReferenceA.get() == null) {
                    atomicReferenceA.set((String) this.f21957e.invoke(null, this.f21921i));
                }
            }
        }
        String str = atomicReferenceA.get();
        synchronized (this.f21956d) {
            this.f21956d.j(hd.b(str.getBytes(), true));
        }
    }
}
