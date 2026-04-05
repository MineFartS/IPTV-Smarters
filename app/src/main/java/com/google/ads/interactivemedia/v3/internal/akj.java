package com.google.ads.interactivemedia.v3.internal;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class akj implements akk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final akd f19981a = c(false, -9223372036854775807L);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final akd f19982b = new akd(2, -9223372036854775807L);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final akd f19983c = new akd(3, -9223372036854775807L);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ExecutorService f19984d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ake<? extends akf> f19985e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private IOException f19986f;

    public akj(String str) {
        this.f19984d = amn.J(str.length() != 0 ? "ExoPlayer:Loader:".concat(str) : new String("ExoPlayer:Loader:"));
    }

    public static akd c(boolean z, long j2) {
        return new akd(z ? 1 : 0, j2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.akk
    public final void a() {
        h(Integer.MIN_VALUE);
    }

    public final <T extends akf> long b(T t, akc<T> akcVar, int i2) {
        Looper looperMyLooper = Looper.myLooper();
        ajr.c(looperMyLooper);
        this.f19986f = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new ake(this, looperMyLooper, t, akcVar, i2, jElapsedRealtime).c(0L);
        return jElapsedRealtime;
    }

    public final void f() {
        ake<? extends akf> akeVar = this.f19985e;
        ajr.c(akeVar);
        akeVar.a(false);
    }

    public final void g() {
        this.f19986f = null;
    }

    public final void h(int i2) {
        IOException iOException = this.f19986f;
        if (iOException != null) {
            throw iOException;
        }
        ake<? extends akf> akeVar = this.f19985e;
        if (akeVar != null) {
            if (i2 == Integer.MIN_VALUE) {
                i2 = akeVar.f19970a;
            }
            akeVar.b(i2);
        }
    }

    public final void i() {
        j(null);
    }

    public final void j(akg akgVar) {
        ake<? extends akf> akeVar = this.f19985e;
        if (akeVar != null) {
            akeVar.a(true);
        }
        if (akgVar != null) {
            this.f19984d.execute(new akh(akgVar));
        }
        this.f19984d.shutdown();
    }

    public final boolean k() {
        return this.f19986f != null;
    }

    public final boolean l() {
        return this.f19985e != null;
    }
}
