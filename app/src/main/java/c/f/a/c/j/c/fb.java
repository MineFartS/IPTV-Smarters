package c.f.a.c.j.c;

/* JADX INFO: loaded from: classes2.dex */
public class fb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ea f12815a = ea.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m9 f12816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile bc f12817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile m9 f12818d;

    public final bc a(bc bcVar) {
        if (this.f12817c == null) {
            synchronized (this) {
                if (this.f12817c == null) {
                    try {
                        this.f12817c = bcVar;
                        this.f12818d = m9.f12941b;
                    } catch (ab unused) {
                        this.f12817c = bcVar;
                        this.f12818d = m9.f12941b;
                    }
                }
            }
        }
        return this.f12817c;
    }

    public final bc b(bc bcVar) {
        bc bcVar2 = this.f12817c;
        this.f12816b = null;
        this.f12818d = null;
        this.f12817c = bcVar;
        return bcVar2;
    }

    public final m9 c() {
        if (this.f12818d != null) {
            return this.f12818d;
        }
        synchronized (this) {
            if (this.f12818d != null) {
                return this.f12818d;
            }
            this.f12818d = this.f12817c == null ? m9.f12941b : this.f12817c.f();
            return this.f12818d;
        }
    }

    public final int d() {
        if (this.f12818d != null) {
            return this.f12818d.size();
        }
        if (this.f12817c != null) {
            return this.f12817c.c();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fb)) {
            return false;
        }
        fb fbVar = (fb) obj;
        bc bcVar = this.f12817c;
        bc bcVar2 = fbVar.f12817c;
        return (bcVar == null && bcVar2 == null) ? c().equals(fbVar.c()) : (bcVar == null || bcVar2 == null) ? bcVar != null ? bcVar.equals(fbVar.a(bcVar.e())) : a(bcVar2.e()).equals(bcVar2) : bcVar.equals(bcVar2);
    }

    public int hashCode() {
        return 1;
    }
}
