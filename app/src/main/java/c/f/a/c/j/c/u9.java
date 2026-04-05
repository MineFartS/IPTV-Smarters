package c.f.a.c.j.c;

/* JADX INFO: loaded from: classes2.dex */
public final class u9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z9 f13102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f13103b;

    public u9(int i2) {
        byte[] bArr = new byte[i2];
        this.f13103b = bArr;
        this.f13102a = z9.f(bArr);
    }

    public /* synthetic */ u9(int i2, l9 l9Var) {
        this(i2);
    }

    public final m9 a() {
        this.f13102a.m0();
        return new w9(this.f13103b);
    }

    public final z9 b() {
        return this.f13102a;
    }
}
