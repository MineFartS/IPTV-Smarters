package c.f.c.u;

import android.content.Intent;

/* JADX INFO: loaded from: classes2.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16390a = c.f.a.c.f.q.o.f("MESSAGE_DELIVERED", "evenType must be non-null");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Intent f16391b;

    public static class a implements c.f.c.n.e<o> {
        @Override // c.f.c.n.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(o oVar, c.f.c.n.f fVar) {
            Intent intentB = oVar.b();
            fVar.b("ttl", s.q(intentB));
            fVar.e("event", oVar.a());
            fVar.e("instanceId", s.e());
            fVar.b("priority", s.n(intentB));
            fVar.e("packageName", s.m());
            fVar.e("sdkPlatform", "ANDROID");
            fVar.e("messageType", s.k(intentB));
            String strG = s.g(intentB);
            if (strG != null) {
                fVar.e("messageId", strG);
            }
            String strP = s.p(intentB);
            if (strP != null) {
                fVar.e("topic", strP);
            }
            String strB = s.b(intentB);
            if (strB != null) {
                fVar.e("collapseKey", strB);
            }
            if (s.h(intentB) != null) {
                fVar.e("analyticsLabel", s.h(intentB));
            }
            if (s.d(intentB) != null) {
                fVar.e("composerLabel", s.d(intentB));
            }
            String strO = s.o();
            if (strO != null) {
                fVar.e("projectNumber", strO);
            }
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o f16392a;

        public b(o oVar) {
            this.f16392a = (o) c.f.a.c.f.q.o.i(oVar);
        }

        public o a() {
            return this.f16392a;
        }
    }

    public static final class c implements c.f.c.n.e<b> {
        @Override // c.f.c.n.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(b bVar, c.f.c.n.f fVar) {
            fVar.e("messaging_client_event", bVar.a());
        }
    }

    public o(String str, Intent intent) {
        this.f16391b = (Intent) c.f.a.c.f.q.o.j(intent, "intent must be non-null");
    }

    public String a() {
        return this.f16390a;
    }

    public Intent b() {
        return this.f16391b;
    }
}
