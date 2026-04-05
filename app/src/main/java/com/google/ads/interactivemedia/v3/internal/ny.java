package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class ny extends Exception {
    public ny(nx nxVar) {
        String strValueOf = String.valueOf(nxVar);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 18);
        sb.append("Unhandled format: ");
        sb.append(strValueOf);
        super(sb.toString());
    }
}
