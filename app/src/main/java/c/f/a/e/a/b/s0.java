package c.f.a.e.a.b;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class s0 implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a1 f15602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f15604c = 0;

    public s0(a1 a1Var, int i2) {
        this.f15602a = a1Var;
        this.f15603b = i2;
    }

    public s0(a1 a1Var, int i2, byte[] bArr) {
        this.f15602a = a1Var;
        this.f15603b = i2;
    }

    @Override // c.f.a.e.a.b.z0
    public final Object a() {
        if (this.f15604c != 0) {
            this.f15602a.m(this.f15603b);
            return null;
        }
        this.f15602a.n(this.f15603b);
        return null;
    }
}
