package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bnl extends IllegalArgumentException {
    public bnl(int i2, int i3) {
        StringBuilder sb = new StringBuilder(54);
        sb.append("Unpaired surrogate at index ");
        sb.append(i2);
        sb.append(" of ");
        sb.append(i3);
        super(sb.toString());
    }
}
