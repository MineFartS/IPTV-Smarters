package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class lu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f22347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final akt f22348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final aip f22349c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final abq f22350d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final aja f22351e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final nl f22352f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Looper f22353g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final nu f22354h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f22355i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f22356j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final lt f22357k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f22358l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final long f22359m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f22360n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final fk f22361o;
    private final iy p;
    private final ix q;

    public lu(Context context, fk fkVar) {
        rh rhVar = new rh();
        aig aigVar = new aig(context);
        aas aasVar = new aas(context, rhVar);
        iy iyVar = new iy();
        ajo ajoVarD = ajo.d(context);
        akt aktVar = akt.f20013a;
        nl nlVar = new nl(aktVar);
        this.f22347a = context;
        this.f22361o = fkVar;
        this.f22349c = aigVar;
        this.f22350d = aasVar;
        this.p = iyVar;
        this.f22351e = ajoVarD;
        this.f22352f = nlVar;
        this.f22353g = amn.y();
        this.f22354h = nu.f22565a;
        this.f22355i = 1;
        this.f22356j = true;
        this.f22357k = lt.f22344b;
        this.q = ly.a(0.97f, 1.03f, 1000L, 1.0E-7f, iw.b(20L), iw.b(500L), 0.999f);
        this.f22348b = aktVar;
        this.f22358l = 500L;
        this.f22359m = 2000L;
    }

    public final lx d() {
        ajr.f(!this.f22360n);
        this.f22360n = true;
        return new lx(this);
    }
}
