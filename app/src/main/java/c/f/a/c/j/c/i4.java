package c.f.a.c.j.c;

/* JADX INFO: loaded from: classes2.dex */
public enum i4 implements ra {
    DISCOVERY_PROTOCOL_TYPE_UNKNOWN(0),
    MDNS(1),
    CAST_NEARBY(2),
    MDNS_UNICAST_RESPONSE(3),
    SSDP(4),
    BLE(5),
    ADAPTIVE_DISCOVERY(6),
    TCP_FILTER(7);

    private static final ua<i4> zzahh = new ua<i4>() { // from class: c.f.a.c.j.c.l4
    };
    private final int value;

    i4(int i2) {
        this.value = i2;
    }

    public static ta zzgk() {
        return k4.f12902a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + i4.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
    }

    @Override // c.f.a.c.j.c.ra
    public final int zzgj() {
        return this.value;
    }
}
