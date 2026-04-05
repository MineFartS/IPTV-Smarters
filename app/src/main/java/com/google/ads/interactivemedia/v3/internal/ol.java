package com.google.ads.interactivemedia.v3.internal;

import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class ol extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f22619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ke f22620b;

    public ol(int i2, int i3, int i4, int i5, ke keVar, boolean z, Exception exc) {
        String str = true != z ? BuildConfig.FLAVOR : " (recoverable)";
        StringBuilder sb = new StringBuilder(str.length() + 80);
        sb.append("AudioTrack init failed ");
        sb.append(i2);
        sb.append(" Config(");
        sb.append(i3);
        sb.append(", ");
        sb.append(i4);
        sb.append(", ");
        sb.append(i5);
        sb.append(")");
        sb.append(str);
        super(sb.toString(), exc);
        this.f22619a = z;
        this.f22620b = keVar;
    }
}
