package c.f.a.b.b3;

import c.f.a.b.k1;

/* JADX INFO: loaded from: classes2.dex */
public interface d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f6520a = new a();

    public static class a implements d {
        @Override // c.f.a.b.b3.d
        public boolean a(k1 k1Var) {
            String str = k1Var.f9338m;
            return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
        }

        @Override // c.f.a.b.b3.d
        public c b(k1 k1Var) {
            String str = k1Var.f9338m;
            if (str != null) {
                switch (str) {
                    case "application/vnd.dvb.ait":
                        return new c.f.a.b.b3.i.b();
                    case "application/x-icy":
                        return new c.f.a.b.b3.l.a();
                    case "application/id3":
                        return new c.f.a.b.b3.m.h();
                    case "application/x-emsg":
                        return new c.f.a.b.b3.j.b();
                    case "application/x-scte35":
                        return new c.f.a.b.b3.o.c();
                }
            }
            throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
        }
    }

    boolean a(k1 k1Var);

    c b(k1 k1Var);
}
