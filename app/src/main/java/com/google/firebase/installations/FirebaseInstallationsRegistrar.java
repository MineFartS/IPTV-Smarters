package com.google.firebase.installations;

import androidx.annotation.Keep;
import c.f.c.c;
import c.f.c.k.d;
import c.f.c.k.e;
import c.f.c.k.i;
import c.f.c.k.q;
import c.f.c.s.f;
import c.f.c.s.g;
import c.f.c.v.h;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class FirebaseInstallationsRegistrar implements i {
    public static /* synthetic */ g lambda$getComponents$0(e eVar) {
        return new f((c) eVar.a(c.class), eVar.b(c.f.c.v.i.class), eVar.b(c.f.c.p.f.class));
    }

    @Override // c.f.c.k.i
    public List<d<?>> getComponents() {
        return Arrays.asList(d.a(g.class).b(q.i(c.class)).b(q.h(c.f.c.p.f.class)).b(q.h(c.f.c.v.i.class)).f(c.f.c.s.i.b()).d(), h.a("fire-installations", "16.3.5"));
    }
}
