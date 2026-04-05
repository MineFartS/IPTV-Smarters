package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final class hv extends ig {
    public hv(hc hcVar, k kVar, int i2) {
        super(hcVar, "VkS+X+TtwRpHm8NnTYcac+8VmOK3ly2dr/dAyJrO24Sc1GEe26lkfA2Nk61lr0mw", "iqnfwKKqiNqrk8VWEttLTKe7o3UJQGSCfPqGJpMmsBc=", kVar, i2, 73);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ig
    public final void a() {
        try {
            this.f21956d.A(((Boolean) this.f21957e.invoke(null, this.f21953a.b())).booleanValue() ? ab.ENUM_TRUE : ab.ENUM_FALSE);
        } catch (InvocationTargetException unused) {
            this.f21956d.A(ab.ENUM_FAILURE);
        }
    }
}
