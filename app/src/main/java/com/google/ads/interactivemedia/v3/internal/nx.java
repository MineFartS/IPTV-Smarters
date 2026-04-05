package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class nx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nx f22572a = new nx(-1, -1, -1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f22574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f22575d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f22576e;

    public nx(int i2, int i3, int i4) {
        this.f22573b = i2;
        this.f22574c = i3;
        this.f22575d = i4;
        this.f22576e = amn.R(i4) ? amn.h(i4, i3) : -1;
    }

    public final String toString() {
        int i2 = this.f22573b;
        int i3 = this.f22574c;
        int i4 = this.f22575d;
        StringBuilder sb = new StringBuilder(83);
        sb.append("AudioFormat[sampleRate=");
        sb.append(i2);
        sb.append(", channelCount=");
        sb.append(i3);
        sb.append(", encoding=");
        sb.append(i4);
        sb.append(']');
        return sb.toString();
    }
}
