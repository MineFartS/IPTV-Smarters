package c.f.a.c.j.c;

/* JADX INFO: loaded from: classes2.dex */
public enum d3 implements ra {
    APPLICATION_CONNECTION_FAILED_REASON_UNKNOWN(0),
    APPLICATION_NOT_FOUND(1),
    APPLICATION_NOT_RUNNING(2),
    APPLICATION_NOT_ALLOWED(3),
    LAUNCH_CANCELLED(4),
    LAUNCH_TIMED_OUT(5),
    INVALID_REQUEST(6);

    private static final ua<d3> zzahh = new ua<d3>() { // from class: c.f.a.c.j.c.g3
    };
    private final int value;

    d3(int i2) {
        this.value = i2;
    }

    public static ta zzgk() {
        return f3.f12811a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + d3.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
    }

    @Override // c.f.a.c.j.c.ra
    public final int zzgj() {
        return this.value;
    }
}
