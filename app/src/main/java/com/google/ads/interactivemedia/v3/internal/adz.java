package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class adz implements abq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ajg f19335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private qr f19336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f19337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f19338d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List<aab> f19339e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final aeh f19340f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ajr f19341g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private awa f19342h;

    public adz(aeh aehVar, ajg ajgVar) {
        ajr.b(aehVar);
        this.f19340f = aehVar;
        this.f19335a = ajgVar;
        this.f19336b = new qd();
        this.f19341g = new ajr();
        this.f19337c = -9223372036854775807L;
        this.f19338d = 30000L;
        this.f19342h = new awa();
        this.f19339e = Collections.emptyList();
    }

    @Deprecated
    public final aee a(Uri uri) {
        ki kiVar = new ki();
        kiVar.f(uri);
        kiVar.d("application/dash+xml");
        kn knVarA = kiVar.a();
        ajr.b(knVarA.f22193b);
        aet aetVar = new aet();
        List<aab> list = knVarA.f22193b.f22188e.isEmpty() ? this.f19339e : knVarA.f22193b.f22188e;
        akl zzVar = !list.isEmpty() ? new zz(aetVar, list) : aetVar;
        km kmVar = knVarA.f22193b;
        Object obj = kmVar.f22191h;
        boolean z = true;
        boolean z2 = false;
        boolean z3 = kmVar.f22188e.isEmpty() && !list.isEmpty();
        if (knVarA.f22194c.f22179a == -9223372036854775807L && this.f19337c != -9223372036854775807L) {
            z2 = true;
        }
        if (!z3) {
            if (z2) {
            }
            kn knVar = knVarA;
            return new aee(knVar, this.f19335a, zzVar, this.f19340f, this.f19342h, this.f19336b.a(knVar), this.f19341g, this.f19338d, null, null, null, null);
        }
        z = z2;
        ki kiVarA = knVarA.a();
        if (z3) {
            kiVarA.e(list);
        }
        if (z) {
            kiVarA.b(this.f19337c);
        }
        knVarA = kiVarA.a();
        kn knVar2 = knVarA;
        return new aee(knVar2, this.f19335a, zzVar, this.f19340f, this.f19342h, this.f19336b.a(knVar2), this.f19341g, this.f19338d, null, null, null, null);
    }
}
