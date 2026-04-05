package a.i.o;

import a.i.q.i;
import android.util.Base64;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f1874c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<List<byte[]>> f1875d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f1876e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f1877f;

    public d(String str, String str2, String str3, List<List<byte[]>> list) {
        this.f1872a = (String) i.e(str);
        this.f1873b = (String) i.e(str2);
        this.f1874c = (String) i.e(str3);
        this.f1875d = (List) i.e(list);
        this.f1877f = a(str, str2, str3);
    }

    public final String a(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    public List<List<byte[]>> b() {
        return this.f1875d;
    }

    public int c() {
        return this.f1876e;
    }

    public String d() {
        return this.f1877f;
    }

    public String e() {
        return this.f1872a;
    }

    public String f() {
        return this.f1873b;
    }

    public String g() {
        return this.f1874c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f1872a + ", mProviderPackage: " + this.f1873b + ", mQuery: " + this.f1874c + ", mCertificates:");
        for (int i2 = 0; i2 < this.f1875d.size(); i2++) {
            sb.append(" [");
            List<byte[]> list = this.f1875d.get(i2);
            for (int i3 = 0; i3 < list.size(); i3++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list.get(i3), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f1876e);
        return sb.toString();
    }
}
