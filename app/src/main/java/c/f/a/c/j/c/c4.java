package c.f.a.c.j.c;

/* JADX INFO: loaded from: classes2.dex */
public enum c4 implements ra {
    DEVICE_DISCONNECT_REASON_UNKNOWN(0),
    STATUS_ERROR_NETWORK(1),
    STATUS_ERROR_HEARTBEAT_TIMEOUT(2),
    STATUS_EXPLICIT_DISCONNECT(3),
    STATUS_IMPLICIT_DISCONNECT(4);

    private static final ua<c4> zzahh = new ua<c4>() { // from class: c.f.a.c.j.c.f4
    };
    private final int value;

    c4(int i2) {
        this.value = i2;
    }

    public static ta zzgk() {
        return e4.f12797a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + c4.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
    }

    @Override // c.f.a.c.j.c.ra
    public final int zzgj() {
        return this.value;
    }
}
