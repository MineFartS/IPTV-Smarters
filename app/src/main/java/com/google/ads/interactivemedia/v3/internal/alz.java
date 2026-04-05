package com.google.ads.interactivemedia.v3.internal;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class alz implements Comparator {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f20095c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ alz f20094b = new alz(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ alz f20093a = new alz();

    private /* synthetic */ alz() {
    }

    private /* synthetic */ alz(int i2) {
        this.f20095c = i2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        ama amaVar = (ama) obj;
        ama amaVar2 = (ama) obj2;
        return this.f20095c != 0 ? amaVar.f20100a - amaVar2.f20100a : Float.compare(amaVar.f20102c, amaVar2.f20102c);
    }
}
