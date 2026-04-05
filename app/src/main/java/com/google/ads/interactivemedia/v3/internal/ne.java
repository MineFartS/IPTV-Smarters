package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ne implements alf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nm f22501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f22502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f22503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f22504d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final /* synthetic */ int f22505e;

    public /* synthetic */ ne(nm nmVar, String str, long j2, long j3) {
        this.f22501a = nmVar;
        this.f22502b = str;
        this.f22503c = j2;
        this.f22504d = j3;
    }

    public /* synthetic */ ne(nm nmVar, String str, long j2, long j3, int i2) {
        this.f22505e = i2;
        this.f22501a = nmVar;
        this.f22502b = str;
        this.f22503c = j2;
        this.f22504d = j3;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.alf
    public final void a(Object obj) {
        nn nnVar = (nn) obj;
        if (this.f22505e != 0) {
            nnVar.c();
            nnVar.d();
        } else {
            nnVar.ab();
            nnVar.ac();
        }
        nnVar.p();
    }
}
