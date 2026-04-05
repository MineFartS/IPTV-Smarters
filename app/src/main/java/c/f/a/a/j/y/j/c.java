package c.f.a.a.j.y.j;

import c.f.a.a.j.y.j.g;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class c extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c.f.a.a.j.a0.a f6261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<c.f.a.a.d, g.b> f6262b;

    public c(c.f.a.a.j.a0.a aVar, Map<c.f.a.a.d, g.b> map) {
        if (aVar == null) {
            throw new NullPointerException("Null clock");
        }
        this.f6261a = aVar;
        if (map == null) {
            throw new NullPointerException("Null values");
        }
        this.f6262b = map;
    }

    @Override // c.f.a.a.j.y.j.g
    public c.f.a.a.j.a0.a e() {
        return this.f6261a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f6261a.equals(gVar.e()) && this.f6262b.equals(gVar.h());
    }

    @Override // c.f.a.a.j.y.j.g
    public Map<c.f.a.a.d, g.b> h() {
        return this.f6262b;
    }

    public int hashCode() {
        return ((this.f6261a.hashCode() ^ 1000003) * 1000003) ^ this.f6262b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f6261a + ", values=" + this.f6262b + "}";
    }
}
