package c.f.a.c.j.c;

/* JADX INFO: loaded from: classes2.dex */
public enum t4 implements ra {
    UNKNOWN(0),
    POSIX(1),
    OSSTATUS(2),
    COCOA(3);

    private static final ua<t4> zzahh = new ua<t4>() { // from class: c.f.a.c.j.c.s4
    };
    private final int value;

    t4(int i2) {
        this.value = i2;
    }

    public static ta zzgk() {
        return w4.f13124a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + t4.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
    }

    @Override // c.f.a.c.j.c.ra
    public final int zzgj() {
        return this.value;
    }
}
