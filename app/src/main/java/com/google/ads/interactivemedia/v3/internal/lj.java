package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class lj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f22313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f22315c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f22316d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f22317e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f22318f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f22319g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f22320h;

    public lj(Object obj, int i2, Object obj2, int i3, long j2, long j3, int i4, int i5) {
        this.f22313a = obj;
        this.f22314b = i2;
        this.f22315c = obj2;
        this.f22316d = i3;
        this.f22317e = j2;
        this.f22318f = j3;
        this.f22319g = i4;
        this.f22320h = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && lj.class == obj.getClass()) {
            lj ljVar = (lj) obj;
            if (this.f22314b == ljVar.f22314b && this.f22316d == ljVar.f22316d && this.f22317e == ljVar.f22317e && this.f22318f == ljVar.f22318f && this.f22319g == ljVar.f22319g && this.f22320h == ljVar.f22320h && auv.w(this.f22313a, ljVar.f22313a) && auv.w(this.f22315c, ljVar.f22315c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f22313a, Integer.valueOf(this.f22314b), this.f22315c, Integer.valueOf(this.f22316d), Integer.valueOf(this.f22314b), Long.valueOf(this.f22317e), Long.valueOf(this.f22318f), Integer.valueOf(this.f22319g), Integer.valueOf(this.f22320h)});
    }
}
