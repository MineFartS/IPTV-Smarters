package com.amazonaws.services.s3.internal.crypto;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class KMSSecuredCEK extends SecuredCEK {
    public static final String KEY_PROTECTION_MECHANISM = "kms";

    public KMSSecuredCEK(byte[] bArr, Map<String, String> map) {
        super(bArr, KEY_PROTECTION_MECHANISM, map);
    }

    public static boolean isKMSKeyWrapped(String str) {
        return KEY_PROTECTION_MECHANISM.equals(str);
    }
}
