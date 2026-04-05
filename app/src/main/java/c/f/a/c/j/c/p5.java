package c.f.a.c.j.c;

/* JADX INFO: loaded from: classes2.dex */
public enum p5 implements ra {
    NETWORK_CONNECTION_TYPE_UNKNOWN(0),
    MOBILE(1),
    WIFI(2),
    MOBILE_MMS(3),
    MOBILE_SUPL(4),
    MOBILE_DUN(5),
    MOBILE_HIPRI(6),
    WIMAX(7),
    BLUETOOTH(8),
    DUMMY(9),
    ETHERNET(10),
    VPN(11);

    private static final ua<p5> zzahh = new ua<p5>() { // from class: c.f.a.c.j.c.s5
    };
    private final int value;

    p5(int i2) {
        this.value = i2;
    }

    public static ta zzgk() {
        return r5.f13060a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + p5.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
    }

    @Override // c.f.a.c.j.c.ra
    public final int zzgj() {
        return this.value;
    }
}
