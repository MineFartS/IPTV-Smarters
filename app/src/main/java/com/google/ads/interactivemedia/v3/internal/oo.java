package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class oo extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f22621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ke f22622b;

    public oo(int i2, ke keVar, boolean z) {
        StringBuilder sb = new StringBuilder(36);
        sb.append("AudioTrack write failed: ");
        sb.append(i2);
        super(sb.toString());
        this.f22621a = z;
        this.f22622b = keVar;
    }
}
