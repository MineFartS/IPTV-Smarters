package c.f.a.c.j.c;

/* JADX INFO: loaded from: classes2.dex */
public enum c6 implements ra {
    REMOTE_CONTROL_NOTIFICATION_CLICK_THROUGH_RESULT_NO_OP(0),
    REMOTE_CONTROL_NOTIFICATION_CLICK_THROUGH_RESULT_OPEN_PARTNER_APP(1),
    REMOTE_CONTROL_NOTIFICATION_CLICK_THROUGH_RESULT_OPEN_HOME_APP(2),
    REMOTE_CONTROL_NOTIFICATION_CLICK_THROUGH_RESULT_OPEN_PARTNER_APP_PLAY_STORE(3),
    REMOTE_CONTROL_NOTIFICATION_CLICK_THROUGH_RESULT_OPEN_HOME_APP_PLAY_STORE(4);

    private static final ua<c6> zzahh = new ua<c6>() { // from class: c.f.a.c.j.c.f6
    };
    private final int value;

    c6(int i2) {
        this.value = i2;
    }

    public static ta zzgk() {
        return e6.f12799a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + c6.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
    }

    @Override // c.f.a.c.j.c.ra
    public final int zzgj() {
        return this.value;
    }
}
