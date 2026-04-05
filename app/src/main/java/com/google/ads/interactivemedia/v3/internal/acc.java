package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import com.amazonaws.services.s3.internal.Constants;

/* JADX INFO: loaded from: classes.dex */
public final class acc implements abq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ajg f19133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qr f19134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f19135c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final acb f19136d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ajr f19137e;

    public acc(ajg ajgVar, rp rpVar) {
        acb acbVar = new acb(rpVar);
        this.f19133a = ajgVar;
        this.f19136d = acbVar;
        this.f19134b = new qd();
        this.f19137e = new ajr();
        this.f19135c = Constants.MB;
    }

    @Deprecated
    public final acd a(Uri uri) {
        ki kiVar = new ki();
        kiVar.f(uri);
        kn knVarA = kiVar.a();
        ajr.b(knVarA.f22193b);
        Object obj = knVarA.f22193b.f22191h;
        return new acd(knVarA, this.f19133a, this.f19136d, this.f19134b.a(knVarA), this.f19137e, Constants.MB, null, null, null);
    }
}
