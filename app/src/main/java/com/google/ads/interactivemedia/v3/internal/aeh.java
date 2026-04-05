package com.google.ads.interactivemedia.v3.internal;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class aeh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ajg f19364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ada f19365b;

    public aeh(ada adaVar, ajg ajgVar) {
        this.f19365b = adaVar;
        this.f19364a = ajgVar;
    }

    public final adr a(akk akkVar, aer aerVar, int i2, int[] iArr, aii aiiVar, int i3, long j2, boolean z, List<ke> list, aeo aeoVar, akq akqVar) {
        ajh ajhVarA = this.f19364a.a();
        if (akqVar != null) {
            ajhVarA.e(akqVar);
        }
        return new aek(akkVar, aerVar, i2, iArr, aiiVar, i3, ajhVarA, j2, z, list, aeoVar);
    }
}
