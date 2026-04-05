package c.f.a.b.e3.g1;

import c.f.a.b.k1;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k1 f7663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c.f.b.b.v<String, String> f7664d;

    public q(k1 k1Var, int i2, int i3, Map<String, String> map) {
        this.f7661a = i2;
        this.f7662b = i3;
        this.f7663c = k1Var;
        this.f7664d = c.f.b.b.v.d(map);
    }

    public static String a(String str) {
        String strF = c.f.b.a.b.f(str);
        strF.hashCode();
        switch (strF) {
            case "MPEG4-GENERIC":
                return "audio/mp4a-latm";
            case "AC3":
                return "audio/ac3";
            case "H264":
                return "video/avc";
            default:
                throw new IllegalArgumentException(str);
        }
    }

    public static boolean b(j jVar) {
        String strF = c.f.b.a.b.f(jVar.f7562j.f7573b);
        strF.hashCode();
        switch (strF) {
            case "MPEG4-GENERIC":
            case "AC3":
            case "H264":
                return true;
            default:
                return false;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        return this.f7661a == qVar.f7661a && this.f7662b == qVar.f7662b && this.f7663c.equals(qVar.f7663c) && this.f7664d.equals(qVar.f7664d);
    }

    public int hashCode() {
        return ((((((217 + this.f7661a) * 31) + this.f7662b) * 31) + this.f7663c.hashCode()) * 31) + this.f7664d.hashCode();
    }
}
