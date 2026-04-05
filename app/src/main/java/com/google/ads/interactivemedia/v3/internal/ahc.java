package com.google.ads.interactivemedia.v3.internal;

import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class ahc extends ahd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<aha> f19688b;

    public ahc(String str, long j2, long j3, String str2, String str3) {
        this(str, null, BuildConfig.FLAVOR, 0L, -1, -9223372036854775807L, null, str2, str3, j2, j3, false, aty.n());
    }

    public ahc(String str, ahc ahcVar, String str2, long j2, int i2, long j3, qg qgVar, String str3, String str4, long j4, long j5, boolean z, List<aha> list) {
        super(str, ahcVar, j2, i2, j3, qgVar, str3, str4, j4, j5, z);
        this.f19687a = str2;
        this.f19688b = aty.l(list);
    }
}
