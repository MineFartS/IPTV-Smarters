package c.f.a.c.j.c;

/* JADX INFO: loaded from: classes2.dex */
public enum n4 implements ra {
    DISCOVERY_START_UNKNOWN(0),
    DISCOVERY_START_CRITERIA_CHANGED(1),
    DISCOVERY_START_NETWORK_CHANGE(2),
    DISCOVERY_START_SCREEN_ON(3),
    DISCOVERY_START_FOREGROUND_MODE(4),
    DISCOVERY_START_CONFIGURATION_UPDATED(5);

    private static final ua<n4> zzahh = new ua<n4>() { // from class: c.f.a.c.j.c.m4
    };
    private final int value;

    n4(int i2) {
        this.value = i2;
    }

    public static ta zzgk() {
        return p4.f13021a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + n4.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
    }

    @Override // c.f.a.c.j.c.ra
    public final int zzgj() {
        return this.value;
    }
}
