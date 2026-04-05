package c.f.a.c.j.c;

/* JADX INFO: loaded from: classes2.dex */
public enum o6 implements ra {
    SLOW_MDNS_UNKNOWN(0),
    SLOW_MDNS_RESPONSE_FROM_NON_SUBTYPE_AWARE_DEVICE(1),
    SLOW_MDNS_SUBTYPE_RESPONSE(2);

    private static final ua<o6> zzahh = new ua<o6>() { // from class: c.f.a.c.j.c.r6
    };
    private final int value;

    o6(int i2) {
        this.value = i2;
    }

    public static ta zzgk() {
        return q6.f13041a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + o6.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
    }

    @Override // c.f.a.c.j.c.ra
    public final int zzgj() {
        return this.value;
    }
}
