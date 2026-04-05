package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vr implements rp {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final /* synthetic */ int f23382g;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ vr f23381f = new vr(4);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ vr f23380e = new vr(3);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ vr f23379d = new vr(2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ vr f23378c = new vr(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ vr f23377a = new vr();

    private /* synthetic */ vr() {
    }

    private /* synthetic */ vr(int i2) {
        this.f23382g = i2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rp
    public final rj[] a() {
        int i2 = this.f23382g;
        if (i2 == 0) {
            int i3 = vs.f23383a;
            return new rj[]{new vs()};
        }
        if (i2 == 1) {
            int i4 = vp.f23361a;
            return new rj[]{new vp()};
        }
        if (i2 == 2) {
            int i5 = vu.f23400a;
            return new rj[]{new vu()};
        }
        if (i2 != 3) {
            int i6 = xc.f23678a;
            return new rj[]{new xc()};
        }
        int i7 = wt.f23634a;
        return new rj[]{new wt()};
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rp
    public final /* synthetic */ rj[] b(Uri uri, Map map) {
        int i2 = this.f23382g;
        if (i2 != 0 && i2 != 1 && i2 != 2 && i2 == 3) {
            return ro.a(this);
        }
        return ro.a(this);
    }
}
