package c.f.a.c.j.h;

/* JADX INFO: loaded from: classes2.dex */
public enum v2 implements n6 {
    UNKNOWN(0),
    STRING(1),
    NUMBER(2),
    BOOLEAN(3),
    STATEMENT(4);

    private static final o6<v2> zzf = new o6<v2>() { // from class: c.f.a.c.j.h.t2
    };
    private final int zzg;

    v2(int i2) {
        this.zzg = i2;
    }

    public static v2 zza(int i2) {
        if (i2 == 0) {
            return UNKNOWN;
        }
        if (i2 == 1) {
            return STRING;
        }
        if (i2 == 2) {
            return NUMBER;
        }
        if (i2 == 3) {
            return BOOLEAN;
        }
        if (i2 != 4) {
            return null;
        }
        return STATEMENT;
    }

    public static p6 zzb() {
        return u2.f13543a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + v2.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzg + " name=" + name() + '>';
    }
}
