package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class on extends Exception {
    public on(long j2, long j3) {
        StringBuilder sb = new StringBuilder(103);
        sb.append("Unexpected audio track timestamp discontinuity: expected ");
        sb.append(j3);
        sb.append(", got ");
        sb.append(j2);
        super(sb.toString());
    }
}
