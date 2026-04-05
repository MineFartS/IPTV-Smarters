package a.i.r;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f1991a;

    public d(Object obj) {
        this.f1991a = obj;
    }

    public static d a(Object obj) {
        if (obj == null) {
            return null;
        }
        return new d(obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        return a.i.q.d.a(this.f1991a, ((d) obj).f1991a);
    }

    public int hashCode() {
        Object obj = this.f1991a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        return "DisplayCutoutCompat{" + this.f1991a + "}";
    }
}
