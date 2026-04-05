package com.google.ads.interactivemedia.v3.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class arf implements aqf<Void, aqv<List<aqv<?>>>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Collection f20416a;

    public arf(Collection collection) {
        this.f20416a = collection;
    }

    public final aqv<List<aqv<?>>> a() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f20416a);
        return arj.b(arrayList);
    }
}
