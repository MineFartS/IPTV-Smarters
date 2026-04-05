package c.f.a.b;

/* JADX INFO: loaded from: classes.dex */
public final class j1 extends RuntimeException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9147b;

    public j1(int i2) {
        super(a(i2));
        this.f9147b = i2;
    }

    public static String a(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? "Undefined timeout." : "Detaching surface timed out." : "Setting foreground mode timed out." : "Player release timed out.";
    }
}
