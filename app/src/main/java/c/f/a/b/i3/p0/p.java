package c.f.a.b.i3.p0;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, Object> f9032a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<String> f9033b = new ArrayList();

    public static p g(p pVar, long j2) {
        return pVar.e("exo_len", j2);
    }

    public static p h(p pVar, Uri uri) {
        return uri == null ? pVar.d("exo_redir") : pVar.f("exo_redir", uri.toString());
    }

    public final p a(String str, Object obj) {
        this.f9032a.put((String) c.f.a.b.j3.g.e(str), c.f.a.b.j3.g.e(obj));
        this.f9033b.remove(str);
        return this;
    }

    public Map<String, Object> b() {
        HashMap map = new HashMap(this.f9032a);
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                entry.setValue(Arrays.copyOf(bArr, bArr.length));
            }
        }
        return Collections.unmodifiableMap(map);
    }

    public List<String> c() {
        return Collections.unmodifiableList(new ArrayList(this.f9033b));
    }

    public p d(String str) {
        this.f9033b.add(str);
        this.f9032a.remove(str);
        return this;
    }

    public p e(String str, long j2) {
        return a(str, Long.valueOf(j2));
    }

    public p f(String str, String str2) {
        return a(str, str2);
    }
}
