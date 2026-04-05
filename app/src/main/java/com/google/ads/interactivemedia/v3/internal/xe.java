package com.google.ads.interactivemedia.v3.internal;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class xe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<xd> f23697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f23698d;

    public xe(int i2, String str, List<xd> list, byte[] bArr) {
        this.f23695a = i2;
        this.f23696b = str;
        this.f23697c = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        this.f23698d = bArr;
    }
}
