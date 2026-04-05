package c.f.a.c.j.c;

/* JADX INFO: loaded from: classes2.dex */
public enum u5 implements ra {
    PRECACHE_MESSAGE_RESULT_UNKNOWN(0),
    PRECACHE_MESSAGE_RESULT_SENT(1),
    PRECACHE_MESSAGE_RESULT_FAILED(2);

    private static final ua<u5> zzahh = new ua<u5>() { // from class: c.f.a.c.j.c.t5
    };
    private final int value;

    u5(int i2) {
        this.value = i2;
    }

    public static ta zzgk() {
        return x5.f13136a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + u5.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
    }

    @Override // c.f.a.c.j.c.ra
    public final int zzgj() {
        return this.value;
    }
}
