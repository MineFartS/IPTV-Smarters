package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nd implements alf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nm f22498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f22499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f22500c;

    public /* synthetic */ nd(nm nmVar, String str) {
        this.f22498a = nmVar;
        this.f22499b = str;
    }

    public /* synthetic */ nd(nm nmVar, String str, int i2) {
        this.f22500c = i2;
        this.f22498a = nmVar;
        this.f22499b = str;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.alf
    public final void a(Object obj) {
        nn nnVar = (nn) obj;
        if (this.f22500c != 0) {
            nnVar.e();
        } else {
            nnVar.ad();
        }
    }
}
