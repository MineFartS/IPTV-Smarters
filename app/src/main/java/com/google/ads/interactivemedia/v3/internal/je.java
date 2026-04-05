package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class je implements alf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ld f22045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f22046b;

    public /* synthetic */ je(ld ldVar) {
        this.f22045a = ldVar;
    }

    public /* synthetic */ je(ld ldVar, int i2) {
        this.f22046b = i2;
        this.f22045a = ldVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.alf
    public final void a(Object obj) {
        switch (this.f22046b) {
            case 0:
                ((lh) obj).m(this.f22045a.f22295e);
                break;
            case 1:
                ld ldVar = this.f22045a;
                ((lh) obj).p(ldVar.f22302l, ldVar.f22295e);
                break;
            case 2:
                ((lh) obj).n(this.f22045a.f22303m);
                break;
            case 3:
                ((lh) obj).h(jp.N(this.f22045a));
                break;
            case 4:
                ((lh) obj).l(this.f22045a.f22304n);
                break;
            case 5:
                ((lh) obj).o(this.f22045a.f22296f);
                break;
            case 6:
                ((lh) obj).s(this.f22045a.f22300j);
                break;
            default:
                ld ldVar2 = this.f22045a;
                lh lhVar = (lh) obj;
                boolean z = ldVar2.f22297g;
                lhVar.w();
                lhVar.g(ldVar2.f22297g);
                break;
        }
    }
}
