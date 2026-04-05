package c.f.a.c.j.c;

/* JADX INFO: loaded from: classes2.dex */
public enum w5 implements ra {
    PRECACHE_MESSAGE_TYPE_UNKNOWN(0),
    PRECACHE_MESSAGE_TYPE_ACTIVE_CONNECTION(1),
    PRECACHE_MESSAGE_TYPE_BROADCAST(2);

    private static final ua<w5> zzahh = new ua<w5>() { // from class: c.f.a.c.j.c.z5
    };
    private final int value;

    w5(int i2) {
        this.value = i2;
    }

    public static ta zzgk() {
        return y5.f13144a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + w5.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
    }

    @Override // c.f.a.c.j.c.ra
    public final int zzgj() {
        return this.value;
    }
}
