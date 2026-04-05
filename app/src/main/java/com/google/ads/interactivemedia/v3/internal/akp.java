package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class akp implements ajh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ajh f20000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f20001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Uri f20002c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<String, List<String>> f20003d;

    public akp(ajh ajhVar) {
        ajr.b(ajhVar);
        this.f20000a = ajhVar;
        this.f20002c = Uri.EMPTY;
        this.f20003d = Collections.emptyMap();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ajh
    public final long a(ajl ajlVar) {
        this.f20002c = ajlVar.f19897a;
        this.f20003d = Collections.emptyMap();
        long jA = this.f20000a.a(ajlVar);
        Uri uriC = c();
        ajr.b(uriC);
        this.f20002c = uriC;
        this.f20003d = d();
        return jA;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aje
    public final int b(byte[] bArr, int i2, int i3) {
        int iB = this.f20000a.b(bArr, i2, i3);
        if (iB != -1) {
            this.f20001b += (long) iB;
        }
        return iB;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ajh
    public final Uri c() {
        return this.f20000a.c();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ajh
    public final Map<String, List<String>> d() {
        return this.f20000a.d();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ajh
    public final void e(akq akqVar) {
        ajr.b(akqVar);
        this.f20000a.e(akqVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ajh
    public final void f() {
        this.f20000a.f();
    }

    public final long g() {
        return this.f20001b;
    }

    public final Uri h() {
        return this.f20002c;
    }

    public final Map<String, List<String>> i() {
        return this.f20003d;
    }

    public final void j() {
        this.f20001b = 0L;
    }
}
