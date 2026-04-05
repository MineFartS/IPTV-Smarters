package c.f.a.c.j.h;

/* JADX INFO: loaded from: classes2.dex */
public enum x0 implements n6 {
    UNKNOWN_MATCH_TYPE(0),
    REGEXP(1),
    BEGINS_WITH(2),
    ENDS_WITH(3),
    PARTIAL(4),
    EXACT(5),
    IN_LIST(6);

    private static final o6<x0> zzh = new o6<x0>() { // from class: c.f.a.c.j.h.v0
    };
    private final int zzi;

    x0(int i2) {
        this.zzi = i2;
    }

    public static x0 zza(int i2) {
        switch (i2) {
            case 0:
                return UNKNOWN_MATCH_TYPE;
            case 1:
                return REGEXP;
            case 2:
                return BEGINS_WITH;
            case 3:
                return ENDS_WITH;
            case 4:
                return PARTIAL;
            case 5:
                return EXACT;
            case 6:
                return IN_LIST;
            default:
                return null;
        }
    }

    public static p6 zzb() {
        return w0.f13605a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + x0.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzi + " name=" + name() + '>';
    }
}
