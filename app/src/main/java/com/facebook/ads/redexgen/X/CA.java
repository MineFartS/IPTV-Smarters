package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.UUID;

/* JADX INFO: loaded from: assets/audience_network.dex */
public interface CA {
    byte[] executeKeyRequest(UUID uuid, C1 c1, @Nullable String str) throws Exception;

    byte[] executeProvisionRequest(UUID uuid, C5 c5) throws Exception;
}
