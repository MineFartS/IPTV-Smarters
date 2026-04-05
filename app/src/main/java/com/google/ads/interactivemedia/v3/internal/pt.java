package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public class pt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f22781a;

    public final void a(int i2) {
        this.f22781a = i2 | this.f22781a;
    }

    public void b() {
        this.f22781a = 0;
    }

    public final void c(int i2) {
        this.f22781a = i2;
    }

    public final boolean d(int i2) {
        return (this.f22781a & i2) == i2;
    }

    public final boolean e() {
        return d(268435456);
    }

    public final boolean f() {
        return d(Integer.MIN_VALUE);
    }

    public final boolean g() {
        return d(4);
    }

    public final boolean h() {
        return d(1);
    }
}
