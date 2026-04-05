package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class agb implements abq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private afy f19558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ahk f19559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private qr f19560c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f19561d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List<aab> f19562e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f19563f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final afo f19564g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ags f19565h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ajr f19566i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private awa f19567j;

    public agb(afo afoVar) {
        ajr.b(afoVar);
        this.f19564g = afoVar;
        this.f19560c = new qd();
        this.f19559b = new agr();
        this.f19565h = agv.f19642a;
        this.f19558a = afy.f19537a;
        this.f19566i = new ajr();
        this.f19567j = new awa();
        this.f19561d = 1;
        this.f19562e = Collections.emptyList();
        this.f19563f = -9223372036854775807L;
    }

    @Deprecated
    public final agc a(Uri uri) {
        ki kiVar = new ki();
        kiVar.f(uri);
        kiVar.d("application/x-mpegURL");
        kn knVarA = kiVar.a();
        ajr.b(knVarA.f22193b);
        ahk ahkVar = this.f19559b;
        List<aab> list = knVarA.f22193b.f22188e.isEmpty() ? this.f19562e : knVarA.f22193b.f22188e;
        ahk agwVar = !list.isEmpty() ? new agw(ahkVar, list) : ahkVar;
        km kmVar = knVarA.f22193b;
        Object obj = kmVar.f22191h;
        if (kmVar.f22188e.isEmpty() && !list.isEmpty()) {
            ki kiVarA = knVarA.a();
            kiVarA.e(list);
            knVarA = kiVarA.a();
        }
        afo afoVar = this.f19564g;
        afy afyVar = this.f19558a;
        awa awaVar = this.f19567j;
        qq qqVarA = this.f19560c.a(knVarA);
        ajr ajrVar = this.f19566i;
        return new agc(knVarA, afoVar, afyVar, awaVar, qqVarA, ajrVar, new agv(this.f19564g, ajrVar, agwVar, null, null, null), this.f19563f, this.f19561d, null, null, null, null);
    }
}
