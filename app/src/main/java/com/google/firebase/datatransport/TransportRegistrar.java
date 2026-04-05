package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import c.f.a.a.g;
import c.f.a.a.i.a;
import c.f.a.a.j.r;
import c.f.c.k.d;
import c.f.c.k.e;
import c.f.c.k.i;
import c.f.c.k.q;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class TransportRegistrar implements i {
    public static /* synthetic */ g lambda$getComponents$0(e eVar) {
        r.f((Context) eVar.a(Context.class));
        return r.c().g(a.f6017f);
    }

    @Override // c.f.c.k.i
    public List<d<?>> getComponents() {
        return Collections.singletonList(d.a(g.class).b(q.i(Context.class)).f(c.f.c.l.a.b()).d());
    }
}
