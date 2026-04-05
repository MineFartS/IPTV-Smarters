package c.f.a.c.j.c;

/* JADX INFO: loaded from: classes2.dex */
public enum b4 implements ra {
    DEVICE_CONNECTION_TYPE_UNKNOWN(0),
    DEVICE_CONNECTION_TYPE_LOCAL(1),
    DEVICE_CONNECTION_TYPE_OPENCAST(2),
    DEVICE_CONNECTION_TYPE_RELAY(3);

    private static final ua<b4> zzahh = new ua<b4>() { // from class: c.f.a.c.j.c.a4
    };
    private final int value;

    b4(int i2) {
        this.value = i2;
    }

    public static ta zzgk() {
        return d4.f12789a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + b4.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
    }

    @Override // c.f.a.c.j.c.ra
    public final int zzgj() {
        return this.value;
    }
}
