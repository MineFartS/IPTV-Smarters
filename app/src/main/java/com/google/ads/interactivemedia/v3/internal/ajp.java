package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ajp implements ajh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f19926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<akq> f19927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ajh f19928c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ajh f19929d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ajh f19930e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ajh f19931f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ajh f19932g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ajh f19933h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ajh f19934i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ajh f19935j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ajh f19936k;

    public ajp(Context context, ajh ajhVar) {
        this.f19926a = context.getApplicationContext();
        ajr.b(ajhVar);
        this.f19928c = ajhVar;
        this.f19927b = new ArrayList();
    }

    private final ajh g() {
        if (this.f19930e == null) {
            aiv aivVar = new aiv(this.f19926a);
            this.f19930e = aivVar;
            h(aivVar);
        }
        return this.f19930e;
    }

    private final void h(ajh ajhVar) {
        for (int i2 = 0; i2 < this.f19927b.size(); i2++) {
            ajhVar.e(this.f19927b.get(i2));
        }
    }

    private static final void i(ajh ajhVar, akq akqVar) {
        if (ajhVar != null) {
            ajhVar.e(akqVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    @Override // com.google.ads.interactivemedia.v3.internal.ajh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a(com.google.ads.interactivemedia.v3.internal.ajl r4) {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.ajp.a(com.google.ads.interactivemedia.v3.internal.ajl):long");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aje
    public final int b(byte[] bArr, int i2, int i3) {
        ajh ajhVar = this.f19936k;
        ajr.b(ajhVar);
        return ajhVar.b(bArr, i2, i3);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ajh
    public final Uri c() {
        ajh ajhVar = this.f19936k;
        if (ajhVar == null) {
            return null;
        }
        return ajhVar.c();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ajh
    public final Map<String, List<String>> d() {
        ajh ajhVar = this.f19936k;
        return ajhVar == null ? Collections.emptyMap() : ajhVar.d();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ajh
    public final void e(akq akqVar) {
        ajr.b(akqVar);
        this.f19928c.e(akqVar);
        this.f19927b.add(akqVar);
        i(this.f19929d, akqVar);
        i(this.f19930e, akqVar);
        i(this.f19931f, akqVar);
        i(this.f19932g, akqVar);
        i(this.f19933h, akqVar);
        i(this.f19934i, akqVar);
        i(this.f19935j, akqVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ajh
    public final void f() {
        ajh ajhVar = this.f19936k;
        if (ajhVar != null) {
            try {
                ajhVar.f();
            } finally {
                this.f19936k = null;
            }
        }
    }
}
