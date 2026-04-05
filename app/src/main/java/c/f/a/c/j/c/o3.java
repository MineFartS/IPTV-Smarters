package c.f.a.c.j.c;

/* JADX INFO: loaded from: classes2.dex */
public enum o3 implements ra {
    CONNECTION_TYPE_UNKNOWN(0),
    CONNECTION_TYPE_STRONG(1),
    CONNECTION_TYPE_INVISIBLE(2);

    private static final ua<o3> zzahh = new ua<o3>() { // from class: c.f.a.c.j.c.n3
    };
    private final int value;

    o3(int i2) {
        this.value = i2;
    }

    public static ta zzgk() {
        return q3.f13038a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + o3.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
    }

    @Override // c.f.a.c.j.c.ra
    public final int zzgj() {
        return this.value;
    }
}
