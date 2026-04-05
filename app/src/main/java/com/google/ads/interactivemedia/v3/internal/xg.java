package com.google.ads.interactivemedia.v3.internal;

import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class xg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f23699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f23700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f23701c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f23702d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f23703e;

    public xg(int i2, int i3) {
        this(Integer.MIN_VALUE, i2, i3);
    }

    public xg(int i2, int i3, int i4) {
        String string;
        if (i2 != Integer.MIN_VALUE) {
            StringBuilder sb = new StringBuilder(12);
            sb.append(i2);
            sb.append("/");
            string = sb.toString();
        } else {
            string = BuildConfig.FLAVOR;
        }
        this.f23699a = string;
        this.f23700b = i3;
        this.f23701c = i4;
        this.f23702d = Integer.MIN_VALUE;
        this.f23703e = BuildConfig.FLAVOR;
    }

    private final void d() {
        if (this.f23702d == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    public final int a() {
        d();
        return this.f23702d;
    }

    public final String b() {
        d();
        return this.f23703e;
    }

    public final void c() {
        int i2 = this.f23702d;
        int i3 = i2 == Integer.MIN_VALUE ? this.f23700b : i2 + this.f23701c;
        this.f23702d = i3;
        String str = this.f23699a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11);
        sb.append(str);
        sb.append(i3);
        this.f23703e = sb.toString();
    }
}
