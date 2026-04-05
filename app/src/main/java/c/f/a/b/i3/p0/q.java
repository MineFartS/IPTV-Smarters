package c.f.a.b.i3.p0;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class q implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f9034a = new q(Collections.emptyMap());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, byte[]> f9036c;

    public q() {
        this(Collections.emptyMap());
    }

    public q(Map<String, byte[]> map) {
        this.f9036c = Collections.unmodifiableMap(map);
    }

    public static void c(HashMap<String, byte[]> map, Map<String, Object> map2) {
        for (Map.Entry<String, Object> entry : map2.entrySet()) {
            map.put(entry.getKey(), g(entry.getValue()));
        }
    }

    public static Map<String, byte[]> d(Map<String, byte[]> map, p pVar) {
        HashMap map2 = new HashMap(map);
        i(map2, pVar.c());
        c(map2, pVar.b());
        return map2;
    }

    public static byte[] g(Object obj) {
        if (obj instanceof Long) {
            return ByteBuffer.allocate(8).putLong(((Long) obj).longValue()).array();
        }
        if (obj instanceof String) {
            return ((String) obj).getBytes(c.f.b.a.d.f15784c);
        }
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        throw new IllegalArgumentException();
    }

    public static boolean h(Map<String, byte[]> map, Map<String, byte[]> map2) {
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry<String, byte[]> entry : map.entrySet()) {
            if (!Arrays.equals(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public static void i(HashMap<String, byte[]> map, List<String> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            map.remove(list.get(i2));
        }
    }

    @Override // c.f.a.b.i3.p0.o
    public final String a(String str, String str2) {
        byte[] bArr = this.f9036c.get(str);
        return bArr != null ? new String(bArr, c.f.b.a.d.f15784c) : str2;
    }

    @Override // c.f.a.b.i3.p0.o
    public final long b(String str, long j2) {
        byte[] bArr = this.f9036c.get(str);
        return bArr != null ? ByteBuffer.wrap(bArr).getLong() : j2;
    }

    public q e(p pVar) {
        Map<String, byte[]> mapD = d(this.f9036c, pVar);
        return h(this.f9036c, mapD) ? this : new q(mapD);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        return h(this.f9036c, ((q) obj).f9036c);
    }

    public Set<Map.Entry<String, byte[]>> f() {
        return this.f9036c.entrySet();
    }

    public int hashCode() {
        if (this.f9035b == 0) {
            int iHashCode = 0;
            for (Map.Entry<String, byte[]> entry : this.f9036c.entrySet()) {
                iHashCode += Arrays.hashCode(entry.getValue()) ^ entry.getKey().hashCode();
            }
            this.f9035b = iHashCode;
        }
        return this.f9035b;
    }
}
