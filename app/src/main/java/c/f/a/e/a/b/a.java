package c.f.a.e.a.b;

/* JADX INFO: loaded from: classes2.dex */
public class a extends c.f.a.e.a.i.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15356b;

    public a(int i2) {
        super(String.format("Asset Pack Download Error(%d): %s", Integer.valueOf(i2), c.f.a.e.a.b.m2.a.a(i2)));
        if (i2 == 0) {
            throw new IllegalArgumentException("errorCode should not be 0.");
        }
        this.f15356b = i2;
    }
}
