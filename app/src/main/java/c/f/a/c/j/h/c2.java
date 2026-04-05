package c.f.a.c.j.h;

/* JADX INFO: loaded from: classes2.dex */
public enum c2 implements n6 {
    RADS(1),
    PROVISIONING(2);

    private static final o6<c2> zzc = new o6<c2>() { // from class: c.f.a.c.j.h.a2
    };
    private final int zzd;

    c2(int i2) {
        this.zzd = i2;
    }

    public static c2 zza(int i2) {
        if (i2 == 1) {
            return RADS;
        }
        if (i2 != 2) {
            return null;
        }
        return PROVISIONING;
    }

    public static p6 zzb() {
        return b2.f13211a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + c2.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzd + " name=" + name() + '>';
    }
}
