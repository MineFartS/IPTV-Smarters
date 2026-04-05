package c.f.a.c.j.c;

/* JADX INFO: loaded from: classes2.dex */
public enum h6 implements ra {
    REMOTE_CONTROL_NOTIFICATION_FAILURE_UNKNOWN(0),
    REMOTE_CONTROL_NOTIFICATION_FAILED_TO_CONNECT(1),
    REMOTE_CONTROL_NOTIFICATION_FAILED_TO_JOIN_APPLICATION(2),
    REMOTE_CONTROL_NOTIFICATION_RECEIVED_INVALID_DEVICE_STATUS(3),
    REMOTE_CONTROL_NOTIFICATION_RECEIVED_INVALID_MEDIA_STATUS(4),
    REMOTE_CONTROL_NOTIFICATION_FAILED_TO_SET_MEDIA_NAMESPACE_CALLBACK(5),
    REMOTE_CONTROL_NOTIFICATION_FAILED_TO_REQUEST_RECEIVER_STATUS(6);

    private static final ua<h6> zzahh = new ua<h6>() { // from class: c.f.a.c.j.c.g6
    };
    private final int value;

    h6(int i2) {
        this.value = i2;
    }

    public static ta zzgk() {
        return j6.f12892a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + h6.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
    }

    @Override // c.f.a.c.j.c.ra
    public final int zzgj() {
        return this.value;
    }
}
