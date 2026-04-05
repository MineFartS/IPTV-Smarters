package c.f.a.c.j.c;

/* JADX INFO: loaded from: classes2.dex */
public enum u6 implements ra {
    TCP_PROBER_RESULT_UNKNOWN(0),
    TCP_PROBER_RESULT_SUCCESS(1),
    TCP_PROBER_RESULT_CONNECTION_ERROR(2),
    TCP_PROBER_RESULT_OTHER(99);

    private static final ua<u6> zzahh = new ua<u6>() { // from class: c.f.a.c.j.c.y6
    };
    private final int value;

    u6(int i2) {
        this.value = i2;
    }

    public static ta zzgk() {
        return x6.f13137a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + u6.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
    }

    @Override // c.f.a.c.j.c.ra
    public final int zzgj() {
        return this.value;
    }
}
