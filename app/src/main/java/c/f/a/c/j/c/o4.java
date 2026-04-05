package c.f.a.c.j.c;

/* JADX INFO: loaded from: classes2.dex */
public enum o4 implements ra {
    DISCOVERY_STOP_UNKNOWN(0),
    DISCOVERY_STOP_CRITERIA_CHANGED(1),
    DISCOVERY_STOP_NETWORK_CHANGE(2),
    DISCOVERY_STOP_SCREEN_OFF(3),
    DISCOVERY_STOP_BACKGROUND_MODE(4),
    DISCOVERY_STOP_CONFIGURATION_UPDATED(5),
    DISCOVERY_STOP_APPLICATION_FINISHED(6);

    private static final ua<o4> zzahh = new ua<o4>() { // from class: c.f.a.c.j.c.r4
    };
    private final int value;

    o4(int i2) {
        this.value = i2;
    }

    public static ta zzgk() {
        return q4.f13039a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + o4.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
    }

    @Override // c.f.a.c.j.c.ra
    public final int zzgj() {
        return this.value;
    }
}
