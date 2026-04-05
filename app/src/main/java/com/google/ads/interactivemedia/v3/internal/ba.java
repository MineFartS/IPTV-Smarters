package com.google.ads.interactivemedia.v3.internal;

import android.annotation.SuppressLint;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class ba {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static final ba f20756a = new ba();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f20757b;

    private ba() {
    }

    public static ba b() {
        return f20756a;
    }

    public final Context a() {
        return this.f20757b;
    }

    public final void c(Context context) {
        this.f20757b = context != null ? context.getApplicationContext() : null;
    }
}
