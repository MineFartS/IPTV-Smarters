package c.f.a.c.j.c;

/* JADX INFO: loaded from: classes2.dex */
public enum c3 implements ra {
    APP_SESSION_REASON_UNKNOWN(0),
    APP_SESSION_REASON_ERROR(1),
    APP_SESSION_NETWORK_ERROR(2),
    APP_SESSION_NETWORK_RECOVERED(3),
    APP_SESSION_RECEIVER_CONNECTION_LOSS(4),
    APP_SESSION_RECEIVER_CONNECTION_RECOVERED(5),
    APP_SESSION_APP_BACKGROUNDED(6),
    APP_SESSION_APP_FOREGROUNDED(7),
    APP_SESSION_APP_STOPPED(8),
    APP_SESSION_CASTING_STOPPED(9),
    APP_SESSION_RESUMED_FROM_SAVED_SESSION(10),
    APP_SESSION_RESUMED_FROM_OPEN_URL(11),
    APP_SESSION_NETWORK_NOT_REACHABLE(12),
    APP_SESSION_GMSCORE_SERVICE_DISCONNECTED(13),
    APP_SESSION_ENDPOINT_SWITCHED(14),
    APP_SESSION_DEVICE_CONNECTION_SUSPENDED(15);

    private static final ua<c3> zzahh = new ua<c3>() { // from class: c.f.a.c.j.c.b3
    };
    private final int value;

    c3(int i2) {
        this.value = i2;
    }

    public static ta zzgk() {
        return e3.f12796a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + c3.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
    }

    @Override // c.f.a.c.j.c.ra
    public final int zzgj() {
        return this.value;
    }
}
