package c.f.a.c.j.c;

/* JADX INFO: loaded from: classes2.dex */
public enum o5 implements ra {
    NETWORK_CONNECTION_STATE_UNKNOWN(0),
    CONNECTED(1),
    CONNECTING(2),
    DISCONNECTED(3),
    DISCONNECTING(4),
    SUSPENDED(6);

    private static final ua<o5> zzahh = new ua<o5>() { // from class: c.f.a.c.j.c.n5
    };
    private final int value;

    o5(int i2) {
        this.value = i2;
    }

    public static ta zzgk() {
        return q5.f13040a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + o5.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
    }

    @Override // c.f.a.c.j.c.ra
    public final int zzgj() {
        return this.value;
    }
}
