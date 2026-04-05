package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.api.FriendlyObstructionPurpose;
import com.google.ads.interactivemedia.v3.internal.ark;

/* JADX INFO: loaded from: classes.dex */
@ark(a = ag.class)
public abstract class bg {
    public static bf builder() {
        return new af();
    }

    public abstract boolean attached();

    public abstract ar bounds();

    public abstract String detailedReason();

    public abstract boolean hidden();

    public abstract FriendlyObstructionPurpose purpose();

    public abstract String type();
}
