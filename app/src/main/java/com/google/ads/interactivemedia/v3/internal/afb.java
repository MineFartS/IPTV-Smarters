package com.google.ads.interactivemedia.v3.internal;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class afb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final aey f19466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ke f19467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f19468c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f19469d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<aeu> f19470e;

    public /* synthetic */ afb(ke keVar, String str, afh afhVar, List list) {
        this.f19467b = keVar;
        this.f19468c = str;
        this.f19470e = Collections.unmodifiableList(list);
        this.f19466a = afhVar.i(this);
        this.f19469d = amn.q(afhVar.f19487j, 1000000L, afhVar.f19486i);
    }

    public abstract aef k();

    public abstract aey l();

    public abstract void m();

    public final aey n() {
        return this.f19466a;
    }
}
