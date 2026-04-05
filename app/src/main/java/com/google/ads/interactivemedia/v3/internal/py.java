package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class py extends IllegalStateException {
    public py(int i2, int i3) {
        StringBuilder sb = new StringBuilder(44);
        sb.append("Buffer too small (");
        sb.append(i2);
        sb.append(" < ");
        sb.append(i3);
        sb.append(")");
        super(sb.toString());
    }
}
