package com.google.ads.interactivemedia.v3.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class aw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final aw f20631a = new aw();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<ap> f20632b = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList<ap> f20633c = new ArrayList<>();

    private aw() {
    }

    public static aw a() {
        return f20631a;
    }

    public final Collection<ap> b() {
        return Collections.unmodifiableCollection(this.f20633c);
    }

    public final Collection<ap> c() {
        return Collections.unmodifiableCollection(this.f20632b);
    }

    public final void d(ap apVar) {
        this.f20632b.add(apVar);
    }

    public final void e(ap apVar) {
        boolean zG = g();
        this.f20632b.remove(apVar);
        this.f20633c.remove(apVar);
        if (!zG || g()) {
            return;
        }
        bd.b().f();
    }

    public final void f(ap apVar) {
        boolean zG = g();
        this.f20633c.add(apVar);
        if (zG) {
            return;
        }
        bd.b().e();
    }

    public final boolean g() {
        return this.f20633c.size() > 0;
    }
}
