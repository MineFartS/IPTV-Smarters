package c.f.a.b.e3.g1;

import android.net.Uri;
import android.util.Base64;
import c.f.a.b.j3.e0;
import c.f.a.b.j3.x0;
import c.f.a.b.k1;

/* JADX INFO: loaded from: classes2.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f7724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f7725b;

    public x(j jVar, Uri uri) {
        c.f.a.b.j3.g.a(jVar.f7561i.containsKey("control"));
        this.f7724a = b(jVar);
        this.f7725b = a(uri, (String) x0.i(jVar.f7561i.get("control")));
    }

    public static Uri a(Uri uri, String str) {
        Uri uri2 = Uri.parse(str);
        return uri2.isAbsolute() ? uri2 : str.equals("*") ? uri : uri.buildUpon().appendEncodedPath(str).build();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static c.f.a.b.e3.g1.q b(c.f.a.b.e3.g1.j r11) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.e3.g1.x.b(c.f.a.b.e3.g1.j):c.f.a.b.e3.g1.q");
    }

    public static byte[] c(String str) {
        byte[] bArrDecode = Base64.decode(str, 0);
        int length = bArrDecode.length;
        byte[] bArr = c.f.a.b.j3.e0.f9165a;
        byte[] bArr2 = new byte[length + bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        System.arraycopy(bArrDecode, 0, bArr2, bArr.length, bArrDecode.length);
        return bArr2;
    }

    public static int d(int i2, String str) {
        return i2 != -1 ? i2 : str.equals("audio/ac3") ? 6 : 1;
    }

    public static void e(k1.b bVar, c.f.b.b.v<String, String> vVar, int i2, int i3) {
        c.f.a.b.j3.g.a(vVar.containsKey("profile-level-id"));
        bVar.I("mp4a.40." + ((String) c.f.a.b.j3.g.e(vVar.get("profile-level-id"))));
        bVar.T(c.f.b.b.t.K(c.f.a.b.t2.m.a(i3, i2)));
    }

    public static void f(k1.b bVar, c.f.b.b.v<String, String> vVar) {
        String strA;
        c.f.a.b.j3.g.a(vVar.containsKey("sprop-parameter-sets"));
        String[] strArrU0 = x0.U0((String) c.f.a.b.j3.g.e(vVar.get("sprop-parameter-sets")), ",");
        c.f.a.b.j3.g.a(strArrU0.length == 2);
        c.f.b.b.t tVarL = c.f.b.b.t.L(c(strArrU0[0]), c(strArrU0[1]));
        bVar.T(tVarL);
        byte[] bArr = tVarL.get(0);
        e0.b bVarI = c.f.a.b.j3.e0.i(bArr, c.f.a.b.j3.e0.f9165a.length, bArr.length);
        bVar.a0(bVarI.f9178g);
        bVar.Q(bVarI.f9177f);
        bVar.j0(bVarI.f9176e);
        String str = vVar.get("profile-level-id");
        if (str != null) {
            strA = "avc1." + str;
        } else {
            strA = c.f.a.b.j3.j.a(bVarI.f9172a, bVarI.f9173b, bVarI.f9174c);
        }
        bVar.I(strA);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x.class != obj.getClass()) {
            return false;
        }
        x xVar = (x) obj;
        return this.f7724a.equals(xVar.f7724a) && this.f7725b.equals(xVar.f7725b);
    }

    public int hashCode() {
        return ((217 + this.f7724a.hashCode()) * 31) + this.f7725b.hashCode();
    }
}
