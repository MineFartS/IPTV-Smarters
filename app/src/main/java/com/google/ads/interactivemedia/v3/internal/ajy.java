package com.google.ads.interactivemedia.v3.internal;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ajy extends ajx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, List<String>> f19960b;

    public ajy(int i2, Map<String, List<String>> map, ajl ajlVar) {
        StringBuilder sb = new StringBuilder(26);
        sb.append("Response code: ");
        sb.append(i2);
        super(sb.toString());
        this.f19959a = i2;
        this.f19960b = map;
    }
}
