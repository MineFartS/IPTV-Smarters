package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class lb extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f22287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22288b;

    @Deprecated
    public lb() {
        this(null, null);
    }

    @Deprecated
    public lb(String str) {
        this(str, null);
    }

    @Deprecated
    public lb(String str, Throwable th) {
        this(str, th, 0);
    }

    private lb(String str, Throwable th, int i2) {
        super(str, th);
        this.f22287a = true;
        this.f22288b = i2;
    }

    @Deprecated
    public lb(Throwable th) {
        this(null, th);
    }

    public static lb a(String str) {
        return new lb(str, null, 1);
    }
}
