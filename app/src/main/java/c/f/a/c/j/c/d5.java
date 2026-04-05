package c.f.a.c.j.c;

/* JADX INFO: loaded from: classes2.dex */
public enum d5 implements ra {
    LAUNCH_UNKNOWN(0),
    JOIN(1),
    LAUNCH(2);

    private static final ua<d5> zzahh = new ua<d5>() { // from class: c.f.a.c.j.c.g5
    };
    private final int value;

    d5(int i2) {
        this.value = i2;
    }

    public static ta zzgk() {
        return f5.f12812a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + d5.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
    }

    @Override // c.f.a.c.j.c.ra
    public final int zzgj() {
        return this.value;
    }
}
