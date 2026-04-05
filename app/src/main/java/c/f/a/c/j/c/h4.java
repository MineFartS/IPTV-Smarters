package c.f.a.c.j.c;

/* JADX INFO: loaded from: classes2.dex */
public enum h4 implements ra {
    DEVICE_LINK_STATE_UNKNOWN(0),
    DEVICE_LINK_STATE_NOT_LINKED(1),
    DEVICE_LINK_STATE_LINKED(2);

    private static final ua<h4> zzahh = new ua<h4>() { // from class: c.f.a.c.j.c.g4
    };
    private final int value;

    h4(int i2) {
        this.value = i2;
    }

    public static ta zzgk() {
        return j4.f12891a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + h4.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
    }

    @Override // c.f.a.c.j.c.ra
    public final int zzgj() {
        return this.value;
    }
}
