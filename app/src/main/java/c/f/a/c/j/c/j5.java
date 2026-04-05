package c.f.a.c.j.c;

/* JADX INFO: loaded from: classes2.dex */
public enum j5 implements ra {
    SUBTYPE_UNKNOWN(0),
    GPRS(1),
    EDGE(2),
    UMTS(3),
    CDMA(4),
    EVDO_0(5),
    EVDO_A(6),
    SUBTYPE_1XRTT(7),
    HSDPA(8),
    HSUPA(9),
    HSPA(10),
    IDEN(11),
    EVDO_B(12),
    LTE(13),
    EHRPD(14),
    HSPAP(15),
    GSM(16),
    TD_SCDMA(17),
    IWLAN(18);

    private static final ua<j5> zzahh = new ua<j5>() { // from class: c.f.a.c.j.c.m5
    };
    private final int value;

    j5(int i2) {
        this.value = i2;
    }

    public static ta zzgk() {
        return l5.f12922a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + j5.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
    }

    @Override // c.f.a.c.j.c.ra
    public final int zzgj() {
        return this.value;
    }
}
