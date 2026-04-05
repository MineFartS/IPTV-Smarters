package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class afa extends afb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final aey f19464a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final afj f19465f;

    public afa(ke keVar, String str, afg afgVar, List<aeu> list) {
        super(keVar, str, afgVar, list);
        Uri.parse(str);
        long j2 = afgVar.f19484b;
        aey aeyVar = j2 <= 0 ? null : new aey(null, afgVar.f19483a, j2);
        this.f19464a = aeyVar;
        this.f19465f = aeyVar == null ? new afj(new aey(null, 0L, -1L)) : null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.afb
    public final aef k() {
        return this.f19465f;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.afb
    public final aey l() {
        return this.f19464a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.afb
    public final void m() {
    }
}
