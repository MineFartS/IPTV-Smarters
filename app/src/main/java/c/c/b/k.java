package c.c.b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f5220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, String> f5221c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<g> f5222d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f5223e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f5224f;

    public k(int i2, byte[] bArr, Map<String, String> map, List<g> list, boolean z, long j2) {
        this.f5219a = i2;
        this.f5220b = bArr;
        this.f5221c = map;
        this.f5222d = list == null ? null : Collections.unmodifiableList(list);
        this.f5223e = z;
        this.f5224f = j2;
    }

    @Deprecated
    public k(int i2, byte[] bArr, Map<String, String> map, boolean z, long j2) {
        this(i2, bArr, map, a(map), z, j2);
    }

    public k(int i2, byte[] bArr, boolean z, long j2, List<g> list) {
        this(i2, bArr, b(list), list, z, j2);
    }

    @Deprecated
    public k(byte[] bArr, Map<String, String> map) {
        this(200, bArr, map, false, 0L);
    }

    public static List<g> a(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(new g(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }

    public static Map<String, String> b(List<g> list) {
        if (list == null) {
            return null;
        }
        if (list.isEmpty()) {
            return Collections.emptyMap();
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (g gVar : list) {
            treeMap.put(gVar.a(), gVar.b());
        }
        return treeMap;
    }
}
