package c.f.a.c.j.c;

/* JADX INFO: loaded from: classes2.dex */
public enum i5 implements ra {
    MDNS_RESPONSE_ERROR_UNKNOWN(0),
    ERROR_NOT_RESPONSE_MESSAGE(1),
    ERROR_NO_ANSWERS(2),
    ERROR_READING_RESPONSE_LABELS(3),
    ERROR_READING_IP4_ADDRESS(4),
    ERROR_READING_IP6_ADDRESS(5),
    ERROR_READING_POINTER_RECORD(6),
    ERROR_SKIPPING_POINTER_RECORD(7),
    ERROR_READING_SERVICE_RECORD(8),
    ERROR_SKIPPING_SERVICE_RECORD(9),
    ERROR_READING_TEXT_RECORD(10),
    ERROR_SKIPPING_UNKNOWN_RECORD(11),
    ERROR_END_OF_FILE(12);

    private static final ua<i5> zzahh = new ua<i5>() { // from class: c.f.a.c.j.c.h5
    };
    private final int value;

    i5(int i2) {
        this.value = i2;
    }

    public static ta zzgk() {
        return k5.f12903a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + i5.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
    }

    @Override // c.f.a.c.j.c.ra
    public final int zzgj() {
        return this.value;
    }
}
