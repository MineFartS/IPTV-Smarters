package c.c.b;

/* JADX INFO: loaded from: classes.dex */
public class e implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f5205d;

    public e() {
        this(2500, 1, 1.0f);
    }

    public e(int i2, int i3, float f2) {
        this.f5202a = i2;
        this.f5204c = i3;
        this.f5205d = f2;
    }

    @Override // c.c.b.r
    public void a(u uVar) throws u {
        this.f5203b++;
        int i2 = this.f5202a;
        this.f5202a = i2 + ((int) (i2 * this.f5205d));
        if (!d()) {
            throw uVar;
        }
    }

    @Override // c.c.b.r
    public int b() {
        return this.f5202a;
    }

    @Override // c.c.b.r
    public int c() {
        return this.f5203b;
    }

    public boolean d() {
        return this.f5203b <= this.f5204c;
    }
}
