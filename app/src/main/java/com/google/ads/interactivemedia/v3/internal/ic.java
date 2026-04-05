package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class ic extends ig {
    public ic(hc hcVar, k kVar, int i2) {
        super(hcVar, "FiLUZy/XwdzoXuv+wZ8fpBUMomrb2qDVGXE0AhvrFclxf2680Tj+s03XL4ZGGoFK", "G77t423Wv8U+IX+CBfR4k5CGTg8kBFUl+lsHl5zHfM8=", kVar, i2, 48);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ig
    public final void a() {
        k kVar;
        ab abVar;
        this.f21956d.R(ab.ENUM_FAILURE);
        boolean zBooleanValue = ((Boolean) this.f21957e.invoke(null, this.f21953a.b())).booleanValue();
        synchronized (this.f21956d) {
            if (zBooleanValue) {
                kVar = this.f21956d;
                abVar = ab.ENUM_TRUE;
            } else {
                kVar = this.f21956d;
                abVar = ab.ENUM_FALSE;
            }
            kVar.R(abVar);
        }
    }
}
