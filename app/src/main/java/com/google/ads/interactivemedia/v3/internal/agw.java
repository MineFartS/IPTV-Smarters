package com.google.ads.interactivemedia.v3.internal;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class agw implements ahk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ahk f19657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<aab> f19658b;

    public agw(ahk ahkVar, List<aab> list) {
        this.f19657a = ahkVar;
        this.f19658b = list;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ahk
    public final akl<ahg> a() {
        return new zz(this.f19657a.a(), this.f19658b);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ahk
    public final akl<ahg> b(agz agzVar, ahf ahfVar) {
        return new zz(this.f19657a.b(agzVar, ahfVar), this.f19658b);
    }
}
