package com.google.ads.interactivemedia.v3.internal;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class bmn extends bmu {
    public bmn(int i2) {
        super(i2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bmu
    public final void a() {
        if (!j()) {
            for (int i2 = 0; i2 < b(); i2++) {
                Map.Entry entryG = g(i2);
                if (((bkp) entryG.getKey()).c()) {
                    entryG.setValue(Collections.unmodifiableList((List) entryG.getValue()));
                }
            }
            for (Map.Entry entry : d()) {
                if (((bkp) entry.getKey()).c()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.a();
    }
}
