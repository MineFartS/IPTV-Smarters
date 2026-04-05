package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.AccessibleObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class bjf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bjf f21210a;

    static {
        f21210a = bgl.a() < 9 ? new bje() : new bjg();
    }

    public static bjf b() {
        return f21210a;
    }

    public abstract void a(AccessibleObject accessibleObject);
}
