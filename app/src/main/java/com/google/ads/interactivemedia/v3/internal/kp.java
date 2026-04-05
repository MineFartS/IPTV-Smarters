package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class kp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kp f22205a = new ko().a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f22206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CharSequence f22207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CharSequence f22208d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CharSequence f22209e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f22210f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f22211g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Integer f22212h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Integer f22213i;

    public /* synthetic */ kp(ko koVar) {
        this.f22206b = koVar.f22197a;
        this.f22207c = koVar.f22198b;
        this.f22208d = koVar.f22199c;
        this.f22209e = koVar.f22200d;
        this.f22210f = koVar.f22201e;
        this.f22211g = koVar.f22202f;
        this.f22212h = koVar.f22203g;
        this.f22213i = koVar.f22204h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && kp.class == obj.getClass()) {
            kp kpVar = (kp) obj;
            if (amn.O(this.f22206b, kpVar.f22206b) && amn.O(this.f22207c, kpVar.f22207c) && amn.O(this.f22208d, kpVar.f22208d) && amn.O(this.f22209e, kpVar.f22209e) && amn.O(null, null) && amn.O(null, null) && amn.O(null, null) && amn.O(null, null) && amn.O(null, null) && amn.O(null, null) && Arrays.equals(this.f22210f, kpVar.f22210f) && amn.O(null, null) && amn.O(this.f22211g, kpVar.f22211g) && amn.O(this.f22212h, kpVar.f22212h) && amn.O(null, null) && amn.O(null, null) && amn.O(this.f22213i, kpVar.f22213i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f22206b, this.f22207c, this.f22208d, this.f22209e, null, null, null, null, null, null, Integer.valueOf(Arrays.hashCode(this.f22210f)), null, this.f22211g, this.f22212h, null, null, this.f22213i});
    }
}
