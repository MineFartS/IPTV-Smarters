package com.google.ads.interactivemedia.v3.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class ajb implements ajh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f19870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<akq> f19871b = new ArrayList<>(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f19872c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ajl f19873d;

    public ajb(boolean z) {
        this.f19870a = z;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ajh
    public /* synthetic */ Map d() {
        return Collections.emptyMap();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ajh
    public final void e(akq akqVar) {
        ajr.b(akqVar);
        if (this.f19871b.contains(akqVar)) {
            return;
        }
        this.f19871b.add(akqVar);
        this.f19872c++;
    }

    public final void g(int i2) {
        ajl ajlVar = this.f19873d;
        int i3 = amn.f20135a;
        for (int i4 = 0; i4 < this.f19872c; i4++) {
            this.f19871b.get(i4).f(ajlVar, this.f19870a, i2);
        }
    }

    public final void h() {
        ajl ajlVar = this.f19873d;
        int i2 = amn.f20135a;
        for (int i3 = 0; i3 < this.f19872c; i3++) {
            this.f19871b.get(i3).g(ajlVar, this.f19870a);
        }
        this.f19873d = null;
    }

    public final void i(ajl ajlVar) {
        for (int i2 = 0; i2 < this.f19872c; i2++) {
            this.f19871b.get(i2).h();
        }
    }

    public final void j(ajl ajlVar) {
        this.f19873d = ajlVar;
        for (int i2 = 0; i2 < this.f19872c; i2++) {
            this.f19871b.get(i2).i(ajlVar, this.f19870a);
        }
    }
}
