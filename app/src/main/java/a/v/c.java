package a.v;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p f3523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bundle f3524c;

    public c(int i2) {
        this(i2, null);
    }

    public c(int i2, p pVar) {
        this(i2, pVar, null);
    }

    public c(int i2, p pVar, Bundle bundle) {
        this.f3522a = i2;
        this.f3523b = pVar;
        this.f3524c = bundle;
    }

    public Bundle a() {
        return this.f3524c;
    }

    public int b() {
        return this.f3522a;
    }

    public p c() {
        return this.f3523b;
    }

    public void d(Bundle bundle) {
        this.f3524c = bundle;
    }

    public void e(p pVar) {
        this.f3523b = pVar;
    }
}
