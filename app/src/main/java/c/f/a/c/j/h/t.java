package c.f.a.c.j.h;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class t extends v {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Long f13521f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f13522g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f13523h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Bundle f13524i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f13525j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f13526k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e0 f13527l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(e0 e0Var, Long l2, String str, String str2, Bundle bundle, boolean z, boolean z2) {
        super(e0Var, true);
        this.f13527l = e0Var;
        this.f13521f = l2;
        this.f13522g = str;
        this.f13523h = str2;
        this.f13524i = bundle;
        this.f13525j = z;
        this.f13526k = z2;
    }

    @Override // c.f.a.c.j.h.v
    public final void a() {
        Long l2 = this.f13521f;
        this.f13527l.f13299k.logEvent(this.f13522g, this.f13523h, this.f13524i, this.f13525j, this.f13526k, l2 == null ? this.f13572b : l2.longValue());
    }
}
