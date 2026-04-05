package c.f.a.a.i.f;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<m> f6097a;

    public d(List<m> list) {
        if (list == null) {
            throw new NullPointerException("Null logRequests");
        }
        this.f6097a = list;
    }

    @Override // c.f.a.a.i.f.j
    public List<m> c() {
        return this.f6097a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            return this.f6097a.equals(((j) obj).c());
        }
        return false;
    }

    public int hashCode() {
        return this.f6097a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f6097a + "}";
    }
}
