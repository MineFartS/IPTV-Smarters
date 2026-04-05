package c.f.d;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class m extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c.f.d.w.h<String, j> f16462a = new c.f.d.w.h<>();

    public void B(String str, j jVar) {
        c.f.d.w.h<String, j> hVar = this.f16462a;
        if (jVar == null) {
            jVar = l.f16461a;
        }
        hVar.put(str, jVar);
    }

    public void C(String str, String str2) {
        B(str, str2 == null ? l.f16461a : new o(str2));
    }

    public Set<Map.Entry<String, j>> D() {
        return this.f16462a.entrySet();
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof m) && ((m) obj).f16462a.equals(this.f16462a));
    }

    public int hashCode() {
        return this.f16462a.hashCode();
    }
}
