package c.f.a.c.m;

import c.f.a.c.f.o.a;
import com.amazonaws.regions.ServiceAbbreviations;
import com.google.android.gms.common.api.Scope;

/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a.g<c.f.a.c.m.b.a> f14542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a.g<c.f.a.c.m.b.a> f14543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a.AbstractC0156a<c.f.a.c.m.b.a, a> f14544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a.AbstractC0156a<c.f.a.c.m.b.a, e> f14545d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Scope f14546e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Scope f14547f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c.f.a.c.f.o.a<a> f14548g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c.f.a.c.f.o.a<e> f14549h;

    static {
        a.g<c.f.a.c.m.b.a> gVar = new a.g<>();
        f14542a = gVar;
        a.g<c.f.a.c.m.b.a> gVar2 = new a.g<>();
        f14543b = gVar2;
        c cVar = new c();
        f14544c = cVar;
        d dVar = new d();
        f14545d = dVar;
        f14546e = new Scope("profile");
        f14547f = new Scope(ServiceAbbreviations.Email);
        f14548g = new c.f.a.c.f.o.a<>("SignIn.API", cVar, gVar);
        f14549h = new c.f.a.c.f.o.a<>("SignIn.INTERNAL_API", dVar, gVar2);
    }
}
