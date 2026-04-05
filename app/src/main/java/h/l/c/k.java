package h.l.c;

/* JADX INFO: loaded from: classes2.dex */
public abstract class k extends a implements h.n.e {
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            return e().equals(kVar.e()) && d().equals(kVar.d()) && f().equals(kVar.f()) && g.a(c(), kVar.c());
        }
        if (obj instanceof h.n.e) {
            return obj.equals(a());
        }
        return false;
    }

    public int hashCode() {
        return (((e().hashCode() * 31) + d().hashCode()) * 31) + f().hashCode();
    }

    public String toString() {
        h.n.a aVarA = a();
        if (aVarA != this) {
            return aVarA.toString();
        }
        return "property " + d() + " (Kotlin reflection is not available)";
    }
}
