package c.f.a.c.j.c;

/* JADX INFO: loaded from: classes2.dex */
public enum b7 implements ra {
    TCP_PROBING_SUMMARY_RESULT_CODE_UNKNOWN(0),
    TCP_PROBING_SUMMARY_RESULT_CODE_SKIPPED_REACHED_ATTEMPT_LIMIT(1),
    TCP_PROBING_SUMMARY_RESULT_CODE_SKIPPED_ALREADY_PUBLISHED(2),
    TCP_PROBING_SUMMARY_RESULT_CODE_SKIPPED_DISABLED(3),
    TCP_PROBING_SUMMARY_RESULT_CODE_SUCCESS(4),
    TCP_PROBING_SUMMARY_RESULT_CODE_FAIL(5);

    private static final ua<b7> zzahh = new ua<b7>() { // from class: c.f.a.c.j.c.e7
    };
    private final int value;

    b7(int i2) {
        this.value = i2;
    }

    public static ta zzgk() {
        return d7.f12791a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + b7.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
    }

    @Override // c.f.a.c.j.c.ra
    public final int zzgj() {
        return this.value;
    }
}
