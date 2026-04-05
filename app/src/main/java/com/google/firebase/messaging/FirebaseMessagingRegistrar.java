package com.google.firebase.messaging;

import androidx.annotation.Keep;
import c.f.a.a.e;
import c.f.a.a.f;
import c.f.a.a.g;
import c.f.c.k.i;
import c.f.c.k.q;
import c.f.c.o.d;
import c.f.c.u.m;
import c.f.c.u.n;
import c.f.c.v.h;
import com.google.firebase.iid.FirebaseInstanceId;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class FirebaseMessagingRegistrar implements i {

    public static class b<T> implements f<T> {
        public b() {
        }

        @Override // c.f.a.a.f
        public void a(c.f.a.a.c<T> cVar) {
        }
    }

    public static class c implements g {
        @Override // c.f.a.a.g
        public <T> f<T> a(String str, Class<T> cls, e<T, byte[]> eVar) {
            return new b();
        }

        @Override // c.f.a.a.g
        public <T> f<T> b(String str, Class<T> cls, c.f.a.a.b bVar, e<T, byte[]> eVar) {
            return new b();
        }
    }

    public static g determineFactory(g gVar) {
        if (gVar == null) {
            return new c();
        }
        try {
            gVar.b("test", String.class, c.f.a.a.b.b("json"), n.f16389a);
            return gVar;
        } catch (IllegalArgumentException unused) {
            return new c();
        }
    }

    public static final /* synthetic */ FirebaseMessaging lambda$getComponents$0$FirebaseMessagingRegistrar(c.f.c.k.e eVar) {
        return new FirebaseMessaging((c.f.c.c) eVar.a(c.f.c.c.class), (FirebaseInstanceId) eVar.a(FirebaseInstanceId.class), eVar.b(c.f.c.v.i.class), eVar.b(c.f.c.p.f.class), (c.f.c.s.g) eVar.a(c.f.c.s.g.class), determineFactory((g) eVar.a(g.class)), (d) eVar.a(d.class));
    }

    @Override // c.f.c.k.i
    @Keep
    public List<c.f.c.k.d<?>> getComponents() {
        return Arrays.asList(c.f.c.k.d.a(FirebaseMessaging.class).b(q.i(c.f.c.c.class)).b(q.i(FirebaseInstanceId.class)).b(q.h(c.f.c.v.i.class)).b(q.h(c.f.c.p.f.class)).b(q.g(g.class)).b(q.i(c.f.c.s.g.class)).b(q.i(d.class)).f(m.f16388a).c().d(), h.a("fire-fcm", "20.1.7_1p"));
    }
}
