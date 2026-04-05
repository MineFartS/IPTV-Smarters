package com.google.ads.interactivemedia.v3.internal;

import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class bdm extends bkx<bdm, bcx> implements bma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f20949a = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final bdm f20950e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f20951f = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private blc<bcy> f20952g = bkx.ap();

    static {
        bdm bdmVar = new bdm();
        f20950e = bdmVar;
        bkx.at(bdm.class, bdmVar);
    }

    private bdm() {
    }

    public static bdm c() {
        return f20950e;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkx
    public final Object b(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return bkx.as(f20950e, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"f", "g", bcy.class});
        }
        if (i3 == 3) {
            return new bdm();
        }
        byte[] bArr = null;
        if (i3 == 4) {
            return new bcx(bArr, (float[]) bArr);
        }
        if (i3 != 5) {
            return null;
        }
        return f20950e;
    }

    public final List<bcy> d() {
        return this.f20952g;
    }
}
