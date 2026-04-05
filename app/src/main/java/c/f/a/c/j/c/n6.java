package c.f.a.c.j.c;

/* JADX INFO: loaded from: classes2.dex */
public enum n6 implements ra {
    SESSION_ID_TYPE_UNKNOWN(0),
    DEVICE_CONTROLLER_CONNECTION(1),
    DEVICE_CONTROLLER_APPLICATION_CONNECTION(2),
    DEVICE_FILTER(3),
    REMOTE_DISPLAY_PLUGIN_SESSION(4),
    REMOTE_CONTROL_NOTIFICATION_SESSION(5);

    private static final ua<n6> zzahh = new ua<n6>() { // from class: c.f.a.c.j.c.m6
    };
    private final int value;

    n6(int i2) {
        this.value = i2;
    }

    public static ta zzgk() {
        return p6.f13022a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + n6.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
    }

    @Override // c.f.a.c.j.c.ra
    public final int zzgj() {
        return this.value;
    }
}
