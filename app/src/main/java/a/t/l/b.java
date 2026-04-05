package a.t.l;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f3341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f f3342b;

    public b(f fVar, boolean z) {
        if (fVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        Bundle bundle = new Bundle();
        this.f3341a = bundle;
        this.f3342b = fVar;
        bundle.putBundle("selector", fVar.a());
        bundle.putBoolean("activeScan", z);
    }

    public Bundle a() {
        return this.f3341a;
    }

    public final void b() {
        if (this.f3342b == null) {
            f fVarD = f.d(this.f3341a.getBundle("selector"));
            this.f3342b = fVarD;
            if (fVarD == null) {
                this.f3342b = f.f3357a;
            }
        }
    }

    public f c() {
        b();
        return this.f3342b;
    }

    public boolean d() {
        return this.f3341a.getBoolean("activeScan");
    }

    public boolean e() {
        b();
        return this.f3342b.g();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return c().equals(bVar.c()) && d() == bVar.d();
    }

    public int hashCode() {
        return c().hashCode() ^ d();
    }

    public String toString() {
        return "DiscoveryRequest{ selector=" + c() + ", activeScan=" + d() + ", isValid=" + e() + " }";
    }
}
