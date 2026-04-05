package c.f.a.c.j.c;

/* JADX INFO: loaded from: classes2.dex */
public enum a7 implements ra {
    TCP_PROBER_IP_SOURCE_UNKNOWN(0),
    TCP_PROBER_IP_SOURCE_CACHED(1),
    TCP_PROBER_IP_SOURCE_BLE(2),
    TCP_PROBER_IP_SOURCE_GAIA(3);

    private static final ua<a7> zzahh = new ua<a7>() { // from class: c.f.a.c.j.c.z6
    };
    private final int value;

    a7(int i2) {
        this.value = i2;
    }

    public static ta zzgk() {
        return c7.f12781a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + a7.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
    }

    @Override // c.f.a.c.j.c.ra
    public final int zzgj() {
        return this.value;
    }
}
