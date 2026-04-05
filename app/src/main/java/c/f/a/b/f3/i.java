package c.f.a.b.f3;

import c.f.a.b.k1;

/* JADX INFO: loaded from: classes2.dex */
public interface i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f8095a = new a();

    public static class a implements i {
        @Override // c.f.a.b.f3.i
        public boolean a(k1 k1Var) {
            String str = k1Var.f9338m;
            return "text/vtt".equals(str) || "text/x-ssa".equals(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-subrip".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/cea-708".equals(str) || "application/dvbsubs".equals(str) || "application/pgs".equals(str);
        }

        @Override // c.f.a.b.f3.i
        public g b(k1 k1Var) {
            String str = k1Var.f9338m;
            if (str != null) {
                switch (str) {
                    case "application/dvbsubs":
                        return new c.f.a.b.f3.o.a(k1Var.f9340o);
                    case "application/pgs":
                        return new c.f.a.b.f3.p.a();
                    case "application/x-mp4-vtt":
                        return new c.f.a.b.f3.v.c();
                    case "text/vtt":
                        return new c.f.a.b.f3.v.i();
                    case "application/x-quicktime-tx3g":
                        return new c.f.a.b.f3.u.a(k1Var.f9340o);
                    case "text/x-ssa":
                        return new c.f.a.b.f3.r.a(k1Var.f9340o);
                    case "application/x-mp4-cea-608":
                    case "application/cea-608":
                        return new c.f.a.b.f3.n.c(str, k1Var.E, 16000L);
                    case "application/cea-708":
                        return new c.f.a.b.f3.n.d(k1Var.E, k1Var.f9340o);
                    case "application/x-subrip":
                        return new c.f.a.b.f3.s.a();
                    case "application/ttml+xml":
                        return new c.f.a.b.f3.t.c();
                }
            }
            throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
        }
    }

    boolean a(k1 k1Var);

    g b(k1 k1Var);
}
