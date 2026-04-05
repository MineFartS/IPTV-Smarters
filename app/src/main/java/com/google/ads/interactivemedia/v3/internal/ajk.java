package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ajk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Uri f19890a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f19892c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f19894e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f19896g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f19891b = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<String, String> f19893d = Collections.emptyMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f19895f = -1;

    public final ajl a() {
        Uri uri = this.f19890a;
        if (uri != null) {
            return new ajl(uri, this.f19891b, this.f19892c, this.f19893d, this.f19894e, this.f19895f, this.f19896g, null);
        }
        throw new IllegalStateException("The uri must be set.");
    }

    public final void b(int i2) {
        this.f19896g = i2;
    }

    public final void c(Map<String, String> map) {
        this.f19893d = map;
    }

    public final void d(long j2) {
        this.f19895f = j2;
    }

    public final void e(long j2) {
        this.f19894e = j2;
    }

    public final void f(Uri uri) {
        this.f19890a = uri;
    }
}
