package com.google.ads.interactivemedia.v3.internal;

import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final class hh extends ig {
    public hh(hc hcVar, k kVar, int i2) {
        super(hcVar, "C4ABHXMC4Or135sUJAGmAZL7HooHNZP1UfgRABckcZiPz1ZmVgJdnOYsXpFfGNDm", "g3OSAw6b49bJrXDnrxpVD58FlN62AVv4SO1GAfJ7rnU=", kVar, i2, 49);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ig
    public final void a() throws InvocationTargetException {
        this.f21956d.c(ab.ENUM_FAILURE);
        try {
            this.f21956d.c(((Boolean) this.f21957e.invoke(null, this.f21953a.b())).booleanValue() ? ab.ENUM_TRUE : ab.ENUM_FALSE);
        } catch (InvocationTargetException e2) {
            if (!(e2.getTargetException() instanceof Settings.SettingNotFoundException)) {
                throw e2;
            }
        }
    }
}
