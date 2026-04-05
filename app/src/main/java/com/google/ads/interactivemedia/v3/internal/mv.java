package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mv implements alf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nm f22461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pw f22462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f22463c;

    public /* synthetic */ mv(nm nmVar, pw pwVar) {
        this.f22461a = nmVar;
        this.f22462b = pwVar;
    }

    public /* synthetic */ mv(nm nmVar, pw pwVar, int i2) {
        this.f22463c = i2;
        this.f22461a = nmVar;
        this.f22462b = pwVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.alf
    public final void a(Object obj) {
        int i2 = this.f22463c;
        if (i2 == 0) {
            nn nnVar = (nn) obj;
            nnVar.g();
            nnVar.o();
        } else {
            if (i2 == 1) {
                nn nnVar2 = (nn) obj;
                nnVar2.f();
                nnVar2.n();
                return;
            }
            nn nnVar3 = (nn) obj;
            if (i2 != 2) {
                nnVar3.af();
                nnVar3.o();
            } else {
                nnVar3.ae();
                nnVar3.n();
            }
        }
    }
}
