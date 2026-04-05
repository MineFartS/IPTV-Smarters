package c.f.a.e.a.b;

/* JADX INFO: loaded from: classes2.dex */
public final class y extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15674c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f15675d;

    public y(int i2, String str, String str2) {
        this.f15673b = i2;
        this.f15674c = str;
        this.f15675d = str2;
    }

    @Override // c.f.a.e.a.b.b
    public final String a() {
        return this.f15675d;
    }

    @Override // c.f.a.e.a.b.b
    public final int c() {
        return this.f15673b;
    }

    @Override // c.f.a.e.a.b.b
    public final String d() {
        return this.f15674c;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f15673b == bVar.c() && ((str = this.f15674c) != null ? str.equals(bVar.d()) : bVar.d() == null)) {
                String str2 = this.f15675d;
                String strA = bVar.a();
                if (str2 != null ? str2.equals(strA) : strA == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = (this.f15673b ^ 1000003) * 1000003;
        String str = this.f15674c;
        int iHashCode = (i2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f15675d;
        return iHashCode ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        int i2 = this.f15673b;
        String str = this.f15674c;
        String str2 = this.f15675d;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 68 + String.valueOf(str2).length());
        sb.append("AssetPackLocation{packStorageMethod=");
        sb.append(i2);
        sb.append(", path=");
        sb.append(str);
        sb.append(", assetsPath=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
