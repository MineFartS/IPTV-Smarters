package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.RecentlyNonNull;
import c.f.a.c.f.o.n.h;
import c.f.a.c.f.o.n.i;
import c.f.a.c.f.o.n.u1;
import c.f.a.c.f.o.n.w1;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes2.dex */
public class LifecycleCallback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @RecentlyNonNull
    public final i f24257b;

    public LifecycleCallback(@RecentlyNonNull i iVar) {
        this.f24257b = iVar;
    }

    @RecentlyNonNull
    public static i c(@RecentlyNonNull Activity activity) {
        return d(new h(activity));
    }

    @RecentlyNonNull
    public static i d(@RecentlyNonNull h hVar) {
        if (hVar.c()) {
            return w1.l(hVar.b());
        }
        if (hVar.d()) {
            return u1.a(hVar.a());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    @Keep
    private static i getChimeraLifecycleFragmentImpl(h hVar) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    public void a(@RecentlyNonNull String str, @RecentlyNonNull FileDescriptor fileDescriptor, @RecentlyNonNull PrintWriter printWriter, @RecentlyNonNull String[] strArr) {
    }

    @RecentlyNonNull
    public Activity b() {
        return this.f24257b.i();
    }

    public void e(int i2, int i3, @RecentlyNonNull Intent intent) {
    }

    public void f(Bundle bundle) {
    }

    public void g() {
    }

    public void h() {
    }

    public void i(@RecentlyNonNull Bundle bundle) {
    }

    public void j() {
    }

    public void k() {
    }
}
