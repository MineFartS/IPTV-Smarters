package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class arl implements bfw {
    @Override // com.google.ads.interactivemedia.v3.internal.bfw
    public final <T> bfv<T> a(bfg bfgVar, bjh<T> bjhVar) {
        Class clsC = bjhVar.c();
        ark arkVar = (ark) clsC.getAnnotation(ark.class);
        if (arkVar == null || clsC == arkVar.a()) {
            return null;
        }
        return bfgVar.b(arkVar.a());
    }
}
