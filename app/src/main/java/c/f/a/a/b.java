package c.f.a.a;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6011a;

    public b(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f6011a = str;
    }

    public static b b(String str) {
        return new b(str);
    }

    public String a() {
        return this.f6011a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return this.f6011a.equals(((b) obj).f6011a);
        }
        return false;
    }

    public int hashCode() {
        return this.f6011a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Encoding{name=\"" + this.f6011a + "\"}";
    }
}
