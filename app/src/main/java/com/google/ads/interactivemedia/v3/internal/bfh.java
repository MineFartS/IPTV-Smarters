package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class bfh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private bgk f21036a = bgk.f21079a;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f21044i = bft.f21049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bez f21037b = bey.IDENTITY;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<Type, bfi<?>> f21038c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<bfw> f21039d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<bfw> f21040e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f21041f = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f21042g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f21043h = true;

    public final bfg a() {
        ArrayList arrayList = new ArrayList(this.f21039d.size() + this.f21040e.size() + 3);
        arrayList.addAll(this.f21039d);
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList(this.f21040e);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        return new bfg(this.f21036a, this.f21037b, this.f21038c, true, this.f21044i, arrayList);
    }

    public final void b(Type type, Object obj) {
        boolean z = obj instanceof bfr;
        boolean z2 = true;
        if (!z && !(obj instanceof bfk) && !(obj instanceof bfi) && !(obj instanceof bfv)) {
            z2 = false;
        }
        art.e(z2);
        if (obj instanceof bfi) {
            this.f21038c.put(type, (bfi) obj);
        }
        if (z || (obj instanceof bfk)) {
            this.f21039d.add(bhu.a(bjh.b(type), obj));
        }
        if (obj instanceof bfv) {
            this.f21039d.add(bjc.a(bjh.b(type), (bfv) obj));
        }
    }

    public final void c(bfw bfwVar) {
        this.f21039d.add(bfwVar);
    }

    public final void d(auv auvVar) {
        this.f21036a = this.f21036a.e(auvVar);
    }
}
