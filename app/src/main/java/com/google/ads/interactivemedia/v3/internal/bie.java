package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bie extends bfv<Class> {
    @Override // com.google.ads.interactivemedia.v3.internal.bfv
    public final /* bridge */ /* synthetic */ Class read(bjj bjjVar) {
        throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bfv
    public final /* bridge */ /* synthetic */ void write(bjl bjlVar, Class cls) {
        String name = cls.getName();
        StringBuilder sb = new StringBuilder(name.length() + 76);
        sb.append("Attempted to serialize java.lang.Class: ");
        sb.append(name);
        sb.append(". Forgot to register a type adapter?");
        throw new UnsupportedOperationException(sb.toString());
    }
}
