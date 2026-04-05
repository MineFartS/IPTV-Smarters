package c.f.a.a.i.f;

import c.f.a.a.i.f.k;

/* JADX INFO: loaded from: classes.dex */
public final class e extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k.b f6098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.f.a.a.i.f.a f6099b;

    public static final class b extends k.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public k.b f6100a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public c.f.a.a.i.f.a f6101b;

        @Override // c.f.a.a.i.f.k.a
        public k a() {
            return new e(this.f6100a, this.f6101b);
        }

        @Override // c.f.a.a.i.f.k.a
        public k.a b(c.f.a.a.i.f.a aVar) {
            this.f6101b = aVar;
            return this;
        }

        @Override // c.f.a.a.i.f.k.a
        public k.a c(k.b bVar) {
            this.f6100a = bVar;
            return this;
        }
    }

    public e(k.b bVar, c.f.a.a.i.f.a aVar) {
        this.f6098a = bVar;
        this.f6099b = aVar;
    }

    @Override // c.f.a.a.i.f.k
    public c.f.a.a.i.f.a b() {
        return this.f6099b;
    }

    @Override // c.f.a.a.i.f.k
    public k.b c() {
        return this.f6098a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        k.b bVar = this.f6098a;
        if (bVar != null ? bVar.equals(kVar.c()) : kVar.c() == null) {
            c.f.a.a.i.f.a aVar = this.f6099b;
            c.f.a.a.i.f.a aVarB = kVar.b();
            if (aVar == null) {
                if (aVarB == null) {
                    return true;
                }
            } else if (aVar.equals(aVarB)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        k.b bVar = this.f6098a;
        int iHashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        c.f.a.a.i.f.a aVar = this.f6099b;
        return iHashCode ^ (aVar != null ? aVar.hashCode() : 0);
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f6098a + ", androidClientInfo=" + this.f6099b + "}";
    }
}
