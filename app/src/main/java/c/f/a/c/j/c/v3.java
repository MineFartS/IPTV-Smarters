package c.f.a.c.j.c;

/* JADX INFO: loaded from: classes2.dex */
public enum v3 implements ra {
    UNKNOWN_FEATURE(0),
    GET_IP_ADDRESS(1),
    GET_INET_ADDRESS(2);

    private static final ua<v3> zzahh = new ua<v3>() { // from class: c.f.a.c.j.c.u3
    };
    private final int value;

    v3(int i2) {
        this.value = i2;
    }

    public static ta zzgk() {
        return x3.f13135a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + v3.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
    }

    @Override // c.f.a.c.j.c.ra
    public final int zzgj() {
        return this.value;
    }
}
