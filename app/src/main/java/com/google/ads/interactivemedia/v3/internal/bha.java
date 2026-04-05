package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bha extends bhb {
    @Override // com.google.ads.interactivemedia.v3.internal.bhb
    public final <T> T a(Class<T> cls) {
        String strValueOf = String.valueOf(cls);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 16);
        sb.append("Cannot allocate ");
        sb.append(strValueOf);
        throw new UnsupportedOperationException(sb.toString());
    }
}
