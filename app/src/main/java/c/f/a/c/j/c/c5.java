package c.f.a.c.j.c;

/* JADX INFO: loaded from: classes2.dex */
public enum c5 implements ra {
    KEY_EXCHANGE_UNKNOWN(0),
    KEY_EXCHANGE_SUCCEEDED(1),
    KEY_EXCHANGE_FAILED(2);

    private static final ua<c5> zzahh = new ua<c5>() { // from class: c.f.a.c.j.c.b5
    };
    private final int value;

    c5(int i2) {
        this.value = i2;
    }

    public static ta zzgk() {
        return e5.f12798a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + c5.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
    }

    @Override // c.f.a.c.j.c.ra
    public final int zzgj() {
        return this.value;
    }
}
