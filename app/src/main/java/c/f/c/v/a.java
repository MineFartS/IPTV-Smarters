package c.f.c.v;

import javax.annotation.Nonnull;

/* JADX INFO: loaded from: classes.dex */
public final class a extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16431b;

    public a(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null libraryName");
        }
        this.f16430a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f16431b = str2;
    }

    @Override // c.f.c.v.f
    @Nonnull
    public String b() {
        return this.f16430a;
    }

    @Override // c.f.c.v.f
    @Nonnull
    public String c() {
        return this.f16431b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f16430a.equals(fVar.b()) && this.f16431b.equals(fVar.c());
    }

    public int hashCode() {
        return ((this.f16430a.hashCode() ^ 1000003) * 1000003) ^ this.f16431b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f16430a + ", version=" + this.f16431b + "}";
    }
}
