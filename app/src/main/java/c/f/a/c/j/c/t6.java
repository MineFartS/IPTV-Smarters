package c.f.a.c.j.c;

/* JADX INFO: loaded from: classes2.dex */
public enum t6 implements ra {
    TCP_PROBER_UNKNOWN(0),
    TCP_PROBER_DEVICE_EXPIRED(1),
    TCP_PROBER_SUBTYPE_MDNS_MISSING(2),
    TCP_PROBER_BLE(3),
    TCP_PROBER_CLOUD_DISCOVERY(4),
    TCP_PROBER_GAIA_DISCOVERY(5),
    TCP_PROBER_KNOWN_SESSION_ENDPOINT(6),
    TCP_PROBER_APP_HINT(7),
    TCP_PROBER_REFRESH_SESSION_ENDPOINT(8);

    private static final ua<t6> zzahh = new ua<t6>() { // from class: c.f.a.c.j.c.s6
    };
    private final int value;

    t6(int i2) {
        this.value = i2;
    }

    public static ta zzgk() {
        return v6.f13117a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + t6.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
    }

    @Override // c.f.a.c.j.c.ra
    public final int zzgj() {
        return this.value;
    }
}
