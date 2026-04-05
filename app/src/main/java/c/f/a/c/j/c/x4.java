package c.f.a.c.j.c;

/* JADX INFO: loaded from: classes2.dex */
public enum x4 implements ra {
    SUCCESS(0),
    LOW_API_LEVEL(1),
    DEVICE_AUTH_FAILURE(2),
    DEVICE_UNAUTHENTICATED(3),
    PASSWORD_ENCRYPTION_FAILURE(4),
    NO_WIFI_MANAGER(5),
    WEP_RESTRICTION_PRE_O(6),
    NO_MATCHING_NETWORK(7),
    EMPTY_PASSWORD(8);

    private static final ua<x4> zzahh = new ua<x4>() { // from class: c.f.a.c.j.c.a5
    };
    private final int value;

    x4(int i2) {
        this.value = i2;
    }

    public static ta zzgk() {
        return z4.f13154a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + x4.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
    }

    @Override // c.f.a.c.j.c.ra
    public final int zzgj() {
        return this.value;
    }
}
