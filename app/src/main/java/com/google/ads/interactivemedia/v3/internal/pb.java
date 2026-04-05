package com.google.ads.interactivemedia.v3.internal;

import android.os.SystemClock;
import java.lang.Exception;

/* JADX INFO: loaded from: classes.dex */
public final class pb<T extends Exception> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private T f22682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f22683b;

    public final void a() {
        this.f22682a = null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: T extends java.lang.Exception */
    public final void b(T t) throws T {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f22682a == null) {
            this.f22682a = t;
            this.f22683b = 100 + jElapsedRealtime;
        }
        if (jElapsedRealtime >= this.f22683b) {
            T t2 = this.f22682a;
            T t3 = this.f22682a;
            a();
            throw t3;
        }
    }
}
