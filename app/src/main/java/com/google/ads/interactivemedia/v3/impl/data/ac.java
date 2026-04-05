package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.internal.aty;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ac extends be {
    private aty<bg> obstructions;

    @Override // com.google.ads.interactivemedia.v3.impl.data.be
    public bh build() {
        aty<bg> atyVar = this.obstructions;
        if (atyVar == null) {
            throw new IllegalStateException("Missing required properties:".concat(" obstructions"));
        }
        return new ad(atyVar);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.be
    public be obstructions(List<bg> list) {
        this.obstructions = aty.l(list);
        return this;
    }
}
