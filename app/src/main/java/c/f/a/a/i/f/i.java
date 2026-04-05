package c.f.a.a.i.f;

import c.f.a.a.i.f.o;

/* JADX INFO: loaded from: classes.dex */
public final class i extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o.c f6131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o.b f6132b;

    public static final class b extends o.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public o.c f6133a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public o.b f6134b;

        @Override // c.f.a.a.i.f.o.a
        public o a() {
            return new i(this.f6133a, this.f6134b);
        }

        @Override // c.f.a.a.i.f.o.a
        public o.a b(o.b bVar) {
            this.f6134b = bVar;
            return this;
        }

        @Override // c.f.a.a.i.f.o.a
        public o.a c(o.c cVar) {
            this.f6133a = cVar;
            return this;
        }
    }

    public i(o.c cVar, o.b bVar) {
        this.f6131a = cVar;
        this.f6132b = bVar;
    }

    @Override // c.f.a.a.i.f.o
    public o.b b() {
        return this.f6132b;
    }

    @Override // c.f.a.a.i.f.o
    public o.c c() {
        return this.f6131a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        o.c cVar = this.f6131a;
        if (cVar != null ? cVar.equals(oVar.c()) : oVar.c() == null) {
            o.b bVar = this.f6132b;
            o.b bVarB = oVar.b();
            if (bVar == null) {
                if (bVarB == null) {
                    return true;
                }
            } else if (bVar.equals(bVarB)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        o.c cVar = this.f6131a;
        int iHashCode = ((cVar == null ? 0 : cVar.hashCode()) ^ 1000003) * 1000003;
        o.b bVar = this.f6132b;
        return iHashCode ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f6131a + ", mobileSubtype=" + this.f6132b + "}";
    }
}
