package c.f.a.c.j.c;

/* JADX INFO: loaded from: classes2.dex */
public enum i6 implements ra {
    SEND_MESSAGE_RESULT_UNKNOWN(0),
    SEND_MESSAGE_RESULT_SUCCESS(1),
    SEND_MESSAGE_RESULT_FAIL_INVALID_REQUEST(2),
    SEND_MESSAGE_RESULT_FAIL_BUFFER_TOO_FULL(3),
    SEND_MESSAGE_RESULT_FAIL_MESSAGE_TOO_LARGE(4),
    SEND_MESSAGE_RESULT_FAIL_NETWORK_ERROR(5);

    private static final ua<i6> zzahh = new ua<i6>() { // from class: c.f.a.c.j.c.l6
    };
    private final int value;

    i6(int i2) {
        this.value = i2;
    }

    public static ta zzgk() {
        return k6.f12904a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + i6.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
    }

    @Override // c.f.a.c.j.c.ra
    public final int zzgj() {
        return this.value;
    }
}
