package c.f.a.c.j.h;

/* JADX INFO: loaded from: classes2.dex */
public enum q0 implements n6 {
    UNKNOWN_COMPARISON_TYPE(0),
    LESS_THAN(1),
    GREATER_THAN(2),
    EQUAL(3),
    BETWEEN(4);

    private static final o6<q0> zzf = new o6<q0>() { // from class: c.f.a.c.j.h.o0
    };
    private final int zzg;

    q0(int i2) {
        this.zzg = i2;
    }

    public static q0 zza(int i2) {
        if (i2 == 0) {
            return UNKNOWN_COMPARISON_TYPE;
        }
        if (i2 == 1) {
            return LESS_THAN;
        }
        if (i2 == 2) {
            return GREATER_THAN;
        }
        if (i2 == 3) {
            return EQUAL;
        }
        if (i2 != 4) {
            return null;
        }
        return BETWEEN;
    }

    public static p6 zzb() {
        return p0.f13480a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + q0.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzg + " name=" + name() + '>';
    }
}
