package com.google.ads.interactivemedia.v3.internal;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes.dex */
public final class ber extends ThreadLocal<SecureRandom> {
    @Override // java.lang.ThreadLocal
    public final /* bridge */ /* synthetic */ SecureRandom initialValue() {
        return bes.a();
    }
}
