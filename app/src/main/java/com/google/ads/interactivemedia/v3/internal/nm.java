package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class nm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f22532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mg f22533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f22534c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final abg f22535d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f22536e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final mg f22537f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f22538g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final abg f22539h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f22540i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f22541j;

    public nm(long j2, mg mgVar, int i2, abg abgVar, long j3, mg mgVar2, int i3, abg abgVar2, long j4, long j5) {
        this.f22532a = j2;
        this.f22533b = mgVar;
        this.f22534c = i2;
        this.f22535d = abgVar;
        this.f22536e = j3;
        this.f22537f = mgVar2;
        this.f22538g = i3;
        this.f22539h = abgVar2;
        this.f22540i = j4;
        this.f22541j = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && nm.class == obj.getClass()) {
            nm nmVar = (nm) obj;
            if (this.f22532a == nmVar.f22532a && this.f22534c == nmVar.f22534c && this.f22536e == nmVar.f22536e && this.f22538g == nmVar.f22538g && this.f22540i == nmVar.f22540i && this.f22541j == nmVar.f22541j && auv.w(this.f22533b, nmVar.f22533b) && auv.w(this.f22535d, nmVar.f22535d) && auv.w(this.f22537f, nmVar.f22537f) && auv.w(this.f22539h, nmVar.f22539h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f22532a), this.f22533b, Integer.valueOf(this.f22534c), this.f22535d, Long.valueOf(this.f22536e), this.f22537f, Integer.valueOf(this.f22538g), this.f22539h, Long.valueOf(this.f22540i), Long.valueOf(this.f22541j)});
    }
}
