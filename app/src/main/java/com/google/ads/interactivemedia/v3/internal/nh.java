package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nh implements alf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nm f22511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f22512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f22513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f22514d;

    public /* synthetic */ nh(nm nmVar, boolean z, int i2) {
        this.f22511a = nmVar;
        this.f22512b = z;
        this.f22513c = i2;
    }

    public /* synthetic */ nh(nm nmVar, boolean z, int i2, int i3) {
        this.f22514d = i3;
        this.f22511a = nmVar;
        this.f22512b = z;
        this.f22513c = i2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.alf
    public final void a(Object obj) {
        if (this.f22514d != 0) {
            ((nn) obj).J();
        } else {
            ((nn) obj).O(this.f22513c);
        }
    }
}
