package c.f.a.c.j.c;

/* JADX INFO: loaded from: classes2.dex */
public enum i3 implements ra {
    BROADCAST_ERROR_UNKNOWN(0),
    BROADCAST_ERROR_ENCRYPTION_FAILED(1),
    BROADCAST_ERROR_SOCKET_ERROR(2),
    BROADCAST_ERROR_DROPPED(3),
    BROADCAST_ERROR_KEY_EXCHANGE_INVALID_INPUT(4),
    BROADCAST_ERROR_KEY_EXCHANGE_INVALID_RESPONSE(5),
    BROADCAST_ERROR_KEY_EXCHANGE_EMPTY_RESPONSE(6),
    BROADCAST_ERROR_KEY_EXCHANGE_FAILED_TO_FIND_DEVICE(7),
    BROADCAST_ERROR_KEY_EXCHANGE_FAILED_TO_CONNECT(8),
    BROADCAST_ERROR_KEY_EXCHANGE_REQUEST_TIMED_OUT(9);

    private static final ua<i3> zzahh = new ua<i3>() { // from class: c.f.a.c.j.c.h3
    };
    private final int value;

    i3(int i2) {
        this.value = i2;
    }

    public static ta zzgk() {
        return k3.f12901a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + i3.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
    }

    @Override // c.f.a.c.j.c.ra
    public final int zzgj() {
        return this.value;
    }
}
