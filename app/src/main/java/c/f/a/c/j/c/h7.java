package c.f.a.c.j.c;

/* JADX INFO: loaded from: classes2.dex */
public enum h7 implements ra {
    WIFI_AUTH_TYPE_OTHER(0),
    WIFI_AUTH_TYPE_WEP(1),
    WIFI_AUTH_TYPE_WPA(2);

    private static final ua<h7> zzahh = new ua<h7>() { // from class: c.f.a.c.j.c.k7
    };
    private final int value;

    h7(int i2) {
        this.value = i2;
    }

    public static ta zzgk() {
        return j7.f12893a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + h7.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
    }

    @Override // c.f.a.c.j.c.ra
    public final int zzgj() {
        return this.value;
    }
}
