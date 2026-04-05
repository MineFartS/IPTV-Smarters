package com.google.firebase.iid;

import androidx.annotation.Keep;
import c.f.c.c;
import c.f.c.k.d;
import c.f.c.k.e;
import c.f.c.k.i;
import c.f.c.k.q;
import c.f.c.p.f;
import c.f.c.q.t;
import c.f.c.q.u;
import c.f.c.s.g;
import c.f.c.v.h;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class Registrar implements i {

    public static class a implements c.f.c.q.g0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FirebaseInstanceId f24665a;

        public a(FirebaseInstanceId firebaseInstanceId) {
            this.f24665a = firebaseInstanceId;
        }
    }

    public static final /* synthetic */ FirebaseInstanceId lambda$getComponents$0$Registrar(e eVar) {
        return new FirebaseInstanceId((c) eVar.a(c.class), eVar.b(c.f.c.v.i.class), eVar.b(f.class), (g) eVar.a(g.class));
    }

    public static final /* synthetic */ c.f.c.q.g0.a lambda$getComponents$1$Registrar(e eVar) {
        return new a((FirebaseInstanceId) eVar.a(FirebaseInstanceId.class));
    }

    @Override // c.f.c.k.i
    @Keep
    public List<d<?>> getComponents() {
        return Arrays.asList(d.a(FirebaseInstanceId.class).b(q.i(c.class)).b(q.h(c.f.c.v.i.class)).b(q.h(f.class)).b(q.i(g.class)).f(t.f16219a).c().d(), d.a(c.f.c.q.g0.a.class).b(q.i(FirebaseInstanceId.class)).f(u.f16220a).d(), h.a("fire-iid", "21.0.1"));
    }
}
