package c.f.a.c.j.c;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class db<K> implements Map.Entry<K, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map.Entry<K, bb> f12792b;

    public db(Map.Entry<K, bb> entry) {
        this.f12792b = entry;
    }

    public final bb a() {
        return this.f12792b.getValue();
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.f12792b.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f12792b.getValue() == null) {
            return null;
        }
        return bb.e();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof bc) {
            return this.f12792b.getValue().b((bc) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
