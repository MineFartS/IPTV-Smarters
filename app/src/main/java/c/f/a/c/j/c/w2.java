package c.f.a.c.j.c;

/* JADX INFO: loaded from: classes2.dex */
public enum w2 implements ra {
    TRIGGER_REASON_NONE(0),
    NO_MDNS_RESPONSE(1),
    NO_MDNS_SUBTYPE_RESPONSE(2),
    SOME_MDNS_SUBTYPE_RESPONSES_RECEIVED(3);

    private static final ua<w2> zzahh = new ua<w2>() { // from class: c.f.a.c.j.c.v2
    };
    private final int value;

    w2(int i2) {
        this.value = i2;
    }

    public static ta zzgk() {
        return y2.f13142a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + w2.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
    }

    @Override // c.f.a.c.j.c.ra
    public final int zzgj() {
        return this.value;
    }
}
