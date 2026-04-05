package c.f.a.c.j.c;

/* JADX INFO: loaded from: classes2.dex */
public enum p3 implements ra {
    CONSUME_CHUNK_RESULT_UNKNOWN(0),
    CONSUME_CHUNK_RESULT_SUCCESS(1),
    CONSUME_CHUNK_RESULT_FAIL_STRING_PAYLOAD_NOT_ALLOWED(3),
    CONSUME_CHUNK_RESULT_FAIL_NO_PAYLOAD(4),
    CONSUME_CHUNK_RESULT_FAIL_MISMATCHING_CONTINUATION_PAYLOAD_TYPE(5);

    private static final ua<p3> zzahh = new ua<p3>() { // from class: c.f.a.c.j.c.s3
    };
    private final int value;

    p3(int i2) {
        this.value = i2;
    }

    public static ta zzgk() {
        return r3.f13059a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + p3.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
    }

    @Override // c.f.a.c.j.c.ra
    public final int zzgj() {
        return this.value;
    }
}
