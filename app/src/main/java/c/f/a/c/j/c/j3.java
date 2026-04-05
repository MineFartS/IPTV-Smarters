package c.f.a.c.j.c;

/* JADX INFO: loaded from: classes2.dex */
public enum j3 implements ra {
    RESULT_UNKNOWN(0),
    DECODE_SUCCESS(1),
    REQUEST_TIMED_OUT(2),
    USER_CANCELLED(3),
    USER_INTERRUPTED_AUDIO_PARING(4);

    private static final ua<j3> zzahh = new ua<j3>() { // from class: c.f.a.c.j.c.m3
    };
    private final int value;

    j3(int i2) {
        this.value = i2;
    }

    public static ta zzgk() {
        return l3.f12921a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + j3.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
    }

    @Override // c.f.a.c.j.c.ra
    public final int zzgj() {
        return this.value;
    }
}
