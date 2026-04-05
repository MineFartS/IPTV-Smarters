package c.f.a.b.x2;

import android.net.Uri;
import android.text.TextUtils;
import c.f.a.b.i3.c0;
import c.f.a.b.i3.s;
import c.f.a.b.j3.x0;
import c.f.a.b.w0;
import c.f.a.b.x2.i0;
import com.amazonaws.http.HttpHeader;
import com.amazonaws.services.s3.util.Mimetypes;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class l0 implements n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0.b f10364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f10366c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<String, String> f10367d;

    public l0(String str, boolean z, c0.b bVar) {
        c.f.a.b.j3.g.a((z && TextUtils.isEmpty(str)) ? false : true);
        this.f10364a = bVar;
        this.f10365b = str;
        this.f10366c = z;
        this.f10367d = new HashMap();
    }

    public static byte[] c(c0.b bVar, String str, byte[] bArr, Map<String, String> map) throws o0 {
        c.f.a.b.i3.l0 l0Var = new c.f.a.b.i3.l0(bVar.a());
        c.f.a.b.i3.s sVarA = new s.b().j(str).e(map).d(2).c(bArr).b(1).a();
        int i2 = 0;
        c.f.a.b.i3.s sVarA2 = sVarA;
        while (true) {
            try {
                c.f.a.b.i3.r rVar = new c.f.a.b.i3.r(l0Var, sVarA2);
                try {
                    return x0.a1(rVar);
                } catch (c0.e e2) {
                    String strD = d(e2, i2);
                    if (strD == null) {
                        throw e2;
                    }
                    i2++;
                    sVarA2 = sVarA2.a().j(strD).a();
                } finally {
                    x0.o(rVar);
                }
            } catch (Exception e3) {
                throw new o0(sVarA, (Uri) c.f.a.b.j3.g.e(l0Var.v()), l0Var.q(), l0Var.f(), e3);
            }
        }
    }

    public static String d(c0.e eVar, int i2) {
        Map<String, List<String>> map;
        List<String> list;
        int i3 = eVar.f8849e;
        if (!((i3 == 307 || i3 == 308) && i2 < 5) || (map = eVar.f8851g) == null || (list = map.get(HttpHeader.LOCATION)) == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override // c.f.a.b.x2.n0
    public byte[] a(UUID uuid, i0.a aVar) throws o0 {
        String strB = aVar.b();
        if (this.f10366c || TextUtils.isEmpty(strB)) {
            strB = this.f10365b;
        }
        if (TextUtils.isEmpty(strB)) {
            throw new o0(new s.b().i(Uri.EMPTY).a(), Uri.EMPTY, c.f.b.b.v.k(), 0L, new IllegalStateException("No license URL"));
        }
        HashMap map = new HashMap();
        UUID uuid2 = w0.f10308e;
        map.put("Content-Type", uuid2.equals(uuid) ? "text/xml" : w0.f10306c.equals(uuid) ? "application/json" : Mimetypes.MIMETYPE_OCTET_STREAM);
        if (uuid2.equals(uuid)) {
            map.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (this.f10367d) {
            map.putAll(this.f10367d);
        }
        return c(this.f10364a, strB, aVar.a(), map);
    }

    @Override // c.f.a.b.x2.n0
    public byte[] b(UUID uuid, i0.d dVar) {
        return c(this.f10364a, dVar.b() + "&signedRequest=" + x0.E(dVar.a()), null, Collections.emptyMap());
    }

    public void e(String str, String str2) {
        c.f.a.b.j3.g.e(str);
        c.f.a.b.j3.g.e(str2);
        synchronized (this.f10367d) {
            this.f10367d.put(str, str2);
        }
    }
}
