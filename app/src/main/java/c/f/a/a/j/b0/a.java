package c.f.a.a.j.b0;

import android.util.SparseArray;
import c.f.a.a.d;
import java.util.EnumMap;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static SparseArray<d> f6159a = new SparseArray<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static EnumMap<d, Integer> f6160b;

    static {
        EnumMap<d, Integer> enumMap = new EnumMap<>(d.class);
        f6160b = enumMap;
        enumMap.put(d.DEFAULT, 0);
        f6160b.put(d.VERY_LOW, 1);
        f6160b.put(d.HIGHEST, 2);
        for (K k2 : f6160b.keySet()) {
            f6159a.append(f6160b.get(k2).intValue(), k2);
        }
    }

    public static int a(d dVar) {
        Integer num = f6160b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i2) {
        d dVar = f6159a.get(i2);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i2);
    }
}
