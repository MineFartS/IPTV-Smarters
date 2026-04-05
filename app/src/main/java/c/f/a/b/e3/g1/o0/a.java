package c.f.a.b.e3.g1.o0;

import c.f.a.b.e3.g1.q;
import c.f.a.b.j3.g;

/* JADX INFO: loaded from: classes2.dex */
public final class a {
    public e a(q qVar) {
        String str = (String) g.e(qVar.f7663c.f9338m);
        str.hashCode();
        switch (str) {
            case "audio/mp4a-latm":
                return new b(qVar);
            case "audio/ac3":
                return new c(qVar);
            case "video/avc":
                return new d(qVar);
            default:
                return null;
        }
    }
}
